def call(Map config = [:]){
     loadLinuxScript(name: 'project-build.sh')
     sh "./project-build.sh ${config.project_root} ${config.registry} ${config.build_number}" 
}