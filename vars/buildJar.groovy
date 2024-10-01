#!/user/bin/env groovy

def call(){
     echo "building the applicaton for branch $BRANCH_NAME"
     sh 'mvn package'
}