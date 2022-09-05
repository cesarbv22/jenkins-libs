def call(Map config = [:]){
    sh 'npm --version'
    sh "cd ${config.project_root}; npm install" 
}