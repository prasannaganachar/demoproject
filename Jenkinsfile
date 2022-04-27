pipeline {
  agent any
  stages {
    stage("Hello") {
      steps {
        sshagent(credentials: ['pganchar-jenkins-ghapp'], ignoreMissing: true) {
          echo "Hello"
        }
      }
    }
  }
}
