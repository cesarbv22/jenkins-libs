@Library("shared-library") _
pipeline{
    agent any
    stages{ // stage 1 de ejemplo
        stage('example'){
            steps {
              //  sh 'echo hello world'
              helloworld(day:"martes",name:"Marshall")
            }
        }

        //  stage('Hello'){
        //     steps {
        //       //  sh 'echo hello world'
        //       hello(day:"Primer Stage Adaptado",name:"Prueba 1")
        //     }
        // }
    }
}