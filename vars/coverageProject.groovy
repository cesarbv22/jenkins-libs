def call(Map config = [:]){
    loadLinuxScript(name: 'coverage-project.sh')
     sh "./coverage-project.sh ${config.project_root}" 
}