def call (Map config = [:]) {
    //sh "docker run -it -d -p 3001:3000 --name plTest cesarbv/docker-pirate-express:46"
    //sh "docker run -it -d -p ${config.port}:3000 --name ${config.name} ${config.registry}:${config.buildNumber}"
    sh "docker run -it --rm -p 3001:3000 --name ${config.name} ${config.registry}:51"
}