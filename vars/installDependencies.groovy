def call(Map config = [:]){
    // loadLinuxScript(name: 'dependencies-install.sh')
    // sh "./dependencies-install.sh ${config.project_root}" 
    sh 'npm --version'
    sh "cd ${config.project_root}; npm install" 
}