freeStyleJob('Meine Projekte/Docker Hands on Apache') {
    scm {
        git('https://github.com/katzefudder/docker-hands-on-lamp.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {

    }
}