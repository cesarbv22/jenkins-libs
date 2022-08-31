def call(){
     loadLinuxScript(name: 'deploy-project.sh')
     sh "./deploy-project.sh ${config.project_root} ${config.registry} ${config.build_number}" 
}