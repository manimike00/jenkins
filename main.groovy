import templates.*
import hudson.model.*

createJobs()

void createJobs() {
    DevProd devProd = new DevProd()
    devProd.create(pipelineJob)
}
