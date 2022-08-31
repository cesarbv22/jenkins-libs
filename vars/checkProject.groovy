//def call (Map config = [:]){
def call (){
  checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
 //checkout([$class: 'GitSCM', branches: [[name: '${config.name}']], extensions: [], userRemoteConfigs: [[url: '${config.url_repo}']]])
}