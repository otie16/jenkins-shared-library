#!/user/bin/env groovy

def call(){
     echo "building the applicaton for $BRANCH_NAME"
     sh 'mvn package'
}
