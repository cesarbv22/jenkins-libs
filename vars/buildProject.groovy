def call(Map config = [:]){
     loadLinuxScript(name: 'build-project.sh')
     sh "./build-project.sh ${config.project_root} ${config.registry} ${config.build_number}" 
}