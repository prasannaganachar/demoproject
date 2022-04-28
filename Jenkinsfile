pipeline {
  agent any
  stages {
    stage("Hello") {
      steps {
        sshagent(credentials: ['pganchar-jenkins-ghapp'], ignoreMissing: true) {
          echo "Hello"
          sh "rm -rf demoproject"
          sh "git clone https://github.com/prasannaganachar/demoproject.git"
          echo "git hub cloned sucuessful"
          sh "git remote set-url origin  https://github.com/prasannaganachar/demoproject.git"
          echo "git set url sucuessful"
        }
      }
    }
  }
}
