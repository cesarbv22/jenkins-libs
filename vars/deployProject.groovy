def call(Map config = [:]){
     // loadLinuxScript(name: 'deploy-project.sh')
     // sh "./deploy-project.sh ${config.project_root} ${config.registry} ${config.build_number}" 
     //sh 'docker login'
     sh "docker push ${config.registry}:${config.build_number}"
}