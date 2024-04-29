import templates.*
import hudson.model.*

createJobs()

void createJobs() {
    DevProd.create(pipelineJob("job3"))
}
