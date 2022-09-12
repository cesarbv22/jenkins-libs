def call (Map config = [:]) {
    sh "docker run -it -d --rm -p 3001:3000 --name ${config.name}  ${config.registry}:${config.build_number}"
}