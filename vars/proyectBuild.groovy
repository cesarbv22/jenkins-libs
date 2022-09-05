def call(Map config = [:]){
    // loadLinuxScript(name: 'project-build.sh')
    // sh "./project-build.sh ${config.project_root} ${config.registry} ${config.build_number}" 
    //sh "cd ./${config.project_root};docker build -t ${config.registry}:${config.BUILD_NUMBER} . "
    // sh "docker login"
     sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
     sh "cd ./${config.project_root};docker build -t ${config.registry}:${config.buildNumber} . "
}