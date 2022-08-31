def call (Map config = [:]){
  // checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
 checkout([$class: ${config.class}, branches: [[name: ${config.name}]], extensions: [], userRemoteConfigs: [[url: ${config.url_repo}]]])

}