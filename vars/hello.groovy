def call (){
     loadLinuxScript(name: 'hello.sh') //Llamo al comando que ocupo para ejecutar el recurso de echo
     sh "./hello.sh ${config.name} ${config.day}" // por lo que entiendo este es el intérprete de comandos
}