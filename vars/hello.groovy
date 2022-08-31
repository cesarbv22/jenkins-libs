def call (){
     loadLinuxScript(name: 'hello.sh') //Llamo al comando que ocupo para ejecutar el recurso de echo
     sh "./hello.sh" // por lo que entiendo este es el intérprete de comandos
}