def call(Map config = [:]){
    loadLinuxScript(name: 'dependencies-install.sh')
     sh "./dependencies-install.sh ${config.project_root}" 
}