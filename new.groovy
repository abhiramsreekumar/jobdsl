job('DSL Test') {
    scm {
        git('https://github.com/abhiramsreekumar/jobdsl.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('abhiramsreekumar')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    steps {
        shell("echo 'hello'")
    }
}
