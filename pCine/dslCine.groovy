// import jenkins-auto-approve-script.groovy

job('Job-pCine') {
    description('Job Padre para crear una tarea Hija que despliegue la App Cine')
    scm {
        git('https://github.com/MiguelAngelsp/jenkinsPCine.git', 'master'){ 
            node -> 
                node / gitConfigName('MiguelAngelsp')
                node / gitConfigEmail('miguel.correopers@gmail.com')
        }
    }
    triggers {
     //   scm('H/5 * * * *')
        githubPush()
    }
    
    steps {
        shell("bash install.sh")
    }
}