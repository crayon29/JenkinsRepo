pipeline {
 agent any
 tools {
   maven 'MAVEN_HOME'
   }
   stages {
     stage ('Welcome Stage')
      {
       steps
        {
          echo 'Welcome to jenkins pipeline'
         }
       }
       stage ('Maven Clean')
      {
       steps
        {
          bat 'mvn clean'
         }
       }
       stage ('Maven Package')
      {
       steps
        {
          bat 'mvn package'
         }
       }
       stage ('Maven install')
      {
       steps
        {
          bat 'mvn install'
         }
       }
       stage ('final build done')
      {
       steps
        {
          echo 'Build done YOO'
         }
       }
      }
     }  
