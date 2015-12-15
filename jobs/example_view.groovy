folder('Apache') {

}

folder('Schnitzel') {

}

listView('Docker Introduction') {
    jobs {
        name('Apache')
        name('Schnitzel')
    }
    columns {
        status()
        name()
        weather()
    }
}


freeStyleJob('Schnitzel/Docker Hands on LAMP') {
    description 'Lorem Ipsum Dolor sit amet'
    scm {
        git('https://github.com/katzefudder/docker-hands-on-lamp.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {
        shell('echo \"hallo Welt\"')
    }
}


freeStyleJob('Schnitzel/Docker Hands on Apache') {
    description 'Lorem Ipsum Dolor sit amet'
    scm {
        git('https://github.com/katzefudder/docker-hands-on-apache.git')
    }
    triggers {
        scm('*/15 * * * *')
    }
    steps {

    }
}