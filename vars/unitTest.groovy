def call(Map config = [:]) {
    sh "cd ${config.project_root}; npm run test"
}
