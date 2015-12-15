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
    }
}


freeStyleJob('Apache/Hallo Welt echoer') {
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