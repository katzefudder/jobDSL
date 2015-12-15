listView('Builds A'){
    freeStyleJob('Seltsames Projekt') {
        scm {
            git('https://github.com/katzefudder/docker-hands-on-apache.git')
        }
        triggers {
            scm('*/15 * * * *')
        }
        steps {

        }
    }
    freeStyleJob('Meine Projekte/Ein noch seltsameres Projekt') {
        scm {
            git('https://github.com/katzefudder/docker-hands-on-apache.git')
        }
        triggers {
            scm('*/15 * * * *')
        }
        steps {

        }
    }
}