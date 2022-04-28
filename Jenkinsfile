pipeline {
  agent any
  stages {
    stage("Hello") {
      steps {
        sshagent(credentials: ['Github_ssh_user'], ignoreMissing: true) {
          echo "Hello"
          sh "rm -rf demoproject"
          sh "git clone git@github.com:prasannaganachar/demoproject.git"
          echo "git hub cloned sucuessful"
          sh "git remote set-url origin  git@github.com:prasannaganachar/demoproject.git"
          echo "git set url sucuessful"
        }
      }
    }
  }
}
