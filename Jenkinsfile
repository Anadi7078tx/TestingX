pipeline {  
    environment { 
        registry = "shashikantvermaji/java"  
        registryCredential = 'docker'  
        dockerImage = '' 
    }
    agent any 
     stages {  
        stage('Cloning our Git') { 
             steps {  
                 
                checkout([$class: 'GitSCM', branches: [[name: 'main']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '98a69b20-e09c-4c58-8654-69feb048011e', url: 'https://github.com/Anadi7078tx/TestingX.git']]])
            }
            
         } 
            
         
        stage('mvn clean') { 
             steps {  
                 sh 'mvn clean'
                    }
            
         } 
         stage('compile') { 
             steps {  
                 sh 'mvn compile'
                    }
            
         } 
         
         
         stage('war created') { 
             steps {  
                 sh 'mvn install'
                    }
            
         } 
        

          
         
 
//         stage('Junit') { 
//              steps { 
 
//             sh 'junit allowEmptyResults: true, testResults: 'TestingX/target/test-reports/a.xml''
//                  } 
//              }
         } 
}
 
       


