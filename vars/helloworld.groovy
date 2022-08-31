// def call(Map config = [:]){
//     sh "echo hey  como estas ${config.name}. Hoy es ${config.day}?"
// }// prueba d

//HelloWorld External
def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.sh')
    sh "./hello-world.sh ${config.name} ${config.day}"
}

//Al patrecer es una función por cada step que se realiza