def call(Map config = [:]){
     // loadLinuxScript(name: 'scan-project.sh')
     // sh "./scan-project.sh ${config.scannerHome} ${config.buildNumber} ${config.project_root}" 

     sh "${config.homeScanner}/bin/sonar-scanner \
                           -Dsonar.projectKey=SimpleExpressExample:Test \
                           -Dsonar.projectName=SimpleExpressExample \
                           -Dsonar.projectVersion=0.0.${config.buildNumber} \
                           -Dsonar.host.url=http://mysonarqube:9000 \
                           -Dsonar.sources=./${config.project_root}/app.js,./${config.project_root}/config/db.config.js,./${config.project_root}/routes/developers.js \
                           -Dsonar.login=admin \
                           -Dsonar.password=admin \
                           -Dsonar.tests=./${config.project_root}/test \
                           -Dsonar.javascript.lcov.reportPaths=./${config.project_root}/coverage/lcov.info"
}