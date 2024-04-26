
createJobs()

//void createJobs() {
//    pipelineJob('job1') {
//        definition {
//            cpsScm {
//                scm {
//                    git {
//                        remote {
//                            url('https://github.com/jenkinsci/job-dsl-plugin.git')
//                        }
//                        branch('*/master')
//                    }
//                }
//                lightweight()
//            }
//        }
//    }
//}

void createJobs() {
    pipelineJob("job2") {

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
