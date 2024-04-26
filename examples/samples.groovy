//createJobs()

// Used to create a DSL job with Jenkinsfile
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

// Used to create a DSL job without Jenkinsfile
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
