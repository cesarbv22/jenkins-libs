def call(Map config = [:]) {
    loadLinuxScript(name: 'unit-test.sh')
    sh "./unit-test.sh ${config.project_root}"
}
