//def call (Map config = [:]){ //quitar ese map si no lo uso
def call (){
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
}