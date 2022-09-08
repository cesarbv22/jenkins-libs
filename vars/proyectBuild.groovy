def call(Map config = [:]){
    // sh 'docker login'
     sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
    sh "cd ./${config.project_root};docker build -t ${config.registry}:${config.buildNumber} . "
}