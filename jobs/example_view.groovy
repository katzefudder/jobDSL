folder('Apache') {

}

folder('Schnitzel') {

}

listView('Docker Introduction'){
    jobs {
        name('Apache')
        name('LAMP')
    }
    columns {
        status()
        name()
        weather()
    }
}


freeStyleJob('Schnitzel/Hallo Welt echoer') {
    scm {
        git('https://github.com/katzefudder/docker-hands-on-apache.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo \"hallo Welt\"')
    }
}


freeStyleJob('Schnitzel/Docker Hands on Apache') {
    scm {
        git('https://github.com/katzefudder/docker-hands-on-apache.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {

    }
}