job('DSL Test') {
    scm {
        git('https://github.com/abhiramsreekumar/jobdsl.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('abhiramsreekumar')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        git('Default') // this is the name of the GIT installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("git status")
    }
}
