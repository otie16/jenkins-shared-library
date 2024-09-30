#!/user/bin/env groovy

def call(){
     echo 'building the applicaton'
     sh 'mvn package'
}