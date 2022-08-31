def call(Map config = [:]){
     loadLinuxScript(name: 'scan-project.sh')
     sh "./scan-project.sh ${config.scannerHome} ${config.buildNumber} ${config.project_root}" 
}