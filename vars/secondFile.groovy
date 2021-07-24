def call(String username = 'null', String designation = 'null' ) {
  echo "This is shared library secondFile: ${username}"
  pipeline {
    environment {
      USER_NAME = "${username}"
      DESG = "${designation}"
    }
    agent any 
    stages {
      stage ("shared-library") {
        steps {
          echo "Bye $USER_NAME, nice to meet you !"
          echo "Designation: $DESG"
    }
      }
    }
  }
}
