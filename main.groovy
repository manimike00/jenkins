
createJobs()

void createJobs() {
    pipelineJob.with {

        description("Test Groovy pipeline")

        definition {
            cps{
                script("""
pipeline {

    agent any
    
    options {
        ansiColor('vga')
        preserveStashes()
    }


    stages {
        stage('Checks') {
            steps{
                sh "echo Hello World"
            }
        }
           
}""")
                sandbox()
            }}}

}
