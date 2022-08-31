def call(Map config = [:]) { 
  def scriptcontents = libraryResource "com/planetpope/scripts/linux/${config.name}"    //aqui se le envia el nombre del sh
  writeFile file: "${config.name}", text: scriptcontents 
  sh "chmod a+x ./${config.name}"
} 