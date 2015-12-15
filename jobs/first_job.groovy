folder('Meine Projekte')

freeStyleJob('Meine Projekte/Docker Hands on Apache') {
    scm {
        git('https://github.com/katzefudder/docker-hands-on-apache.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {

    }
}