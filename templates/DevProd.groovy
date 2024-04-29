package templates

class DevProd {
      static void create() {
        pipelineJob('job3') {
            description("Test Groovy pipeline")
            definition {
                cps{
                    script("""
pipeline {

    agent any

    stages {
        stage('Checks') {
            steps{
                sh "echo Hello World"
            }
        }
    }        

}""")
                    sandbox()
                }}}
    }
}