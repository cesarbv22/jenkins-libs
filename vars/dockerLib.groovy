def hello(Map params){
   echo 'PRUEBA LIBRERIA COMPARTIDA'

}
def checkout(Map params){
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
}

def install(Map params){
 sh 'npm --version'
 sh "cd ${PROJECT_ROOT}; npm install" // params.PROJECT_ROOT
}

def test(Map params){
    sh "cd ${PROJECT_ROOT}; npm run test"
}

def scan(Mam params){
 // "sonarqube" is the server configured in "Configure System"
            withSonarQubeEnv('sonarqube') {// sonarqube, es el nombre del sonarqube server que se configuró
              // Execute the SonarQube scanner with desired flags
              sh "${scannerHome}/bin/sonar-scanner \
                          -Dsonar.projectKey=SimpleExpressExample:Test \
                          -Dsonar.projectName=SimpleExpressExample \
                          -Dsonar.projectVersion=0.0.${BUILD_NUMBER} \
                          -Dsonar.host.url=http://mysonarqube:9000 \
                          -Dsonar.sources=./${PROJECT_ROOT}/app.js,./${PROJECT_ROOT}/config/db.config.js,./${PROJECT_ROOT}/routes/developers.js \
                          -Dsonar.login=admin \
                          -Dsonar.password=admin \
                          -Dsonar.tests=./${PROJECT_ROOT}/test \
                          -Dsonar.javascript.lcov.reportPaths=./${PROJECT_ROOT}/coverage/lcov.info"
            }
            timeout(time: 3, unit: 'MINUTES') {
              // In case of SonarQube failure or direct timeout exceed, stop Pipeline
              waitForQualityGate abortPipeline: qualityGateValidation(waitForQualityGate())
            }
}

def build(Map params){
     sh "cd ./${PROJECT_ROOT};docker build -t ${REGISTRY}:${BUILD_NUMBER} . "
}

def deploy(Map params){
      sh 'docker login'
      sh "docker push ${REGISTRY}:${BUILD_NUMBER}"
      echo 'despliegue'
}
// def build(Map params){
//     sh "docker build -f ${params.DockerfilePath} -t ${params.DockerImage} ${params.DockerArgs} ${params.DockerContext}"
// }