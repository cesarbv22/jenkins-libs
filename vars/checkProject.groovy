def call (Map config = [:]){ //quitar ese map si no lo uso
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
   //checkout([$class: ${config.type}, branches: [[name: ${config.branchs}]], extensions: [], userRemoteConfigs: [[url: ${config.repo}]]])
}