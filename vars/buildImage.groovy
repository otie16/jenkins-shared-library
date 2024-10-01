#!/user/bin/env groovy

def call(String imageName) {
     echo "building the docker image..."
    // Extracting the github credentials from jenkins 
    withCredentials([usernamePassword(credentialsId: 'dockerhub-repo-credentials', passwordVariable: 'PASS', usernameVariable: 'USER', )]){
        sh "docker build -t $imageName ."
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh "docker push $imageName"
    } 
}

