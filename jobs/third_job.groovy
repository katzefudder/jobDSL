folder('Meine Projekte/Hallo Welt echoer') {
    scm {
        git('git://github.com/jgritman/aws-sdk-test.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo \"hallo Welt\"')
    }
}