def call(Map config = [:]){
    sh "echo hey  como estas ${config.name}. Hoy es ${config.day}?"
}// prueba d