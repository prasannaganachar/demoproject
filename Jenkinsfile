pipeline {
  agent any
  stages {
    stage("Hello") {
      steps {
        sshagent(credentials: ['PgancharGithubUser'], ignoreMissing: true) {
          echo "Hello"
          sh "git clone git@github.com:prasannaganachar/demoproject.git"
          echo "git hub cloned sucuessful"
        }
      }
    }
  }
}
