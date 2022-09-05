def call (Map config = [:]){ //quitar ese map si no lo uso
//def call (){ //quitar ese map si no lo uso
    //checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cesarbv22/docker-pirate']]])
   sh 'echo prueba Parametros checkout ${config.type} ${config.branchs} ${config.repo} '
  // checkout([$class: ${config.type}, branches: [[name: ${config.branchs}]], extensions: [], userRemoteConfigs: [[url: ${config.repo}]]])
}