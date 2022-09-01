def call(Map config = [:]) {
    // loadLinuxScript(name: 'unit-test.sh')
    // sh "./unit-test.sh ${config.project_root}"
    sh "cd ${config.project_root}; npm run test"
}
