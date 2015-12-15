folder('Apache') {

}

folder('LAMP') {

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


freeStyleJob('Apache/Hallo Welt echoer') {
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


freeStyleJob('LAMP/Docker Hands on Apache') {
    scm {
        git('https://github.com/katzefudder/docker-hands-on-apache.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {

    }
}