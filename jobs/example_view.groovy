folder('build_pipelines') {
    description 'Build Pipelines'
    displayName 'Build Pipelines'
}

listView('Docker Introduction') {
    jobs {
        name('build_pipelines')
    }
    columns {
        status()
        name()
        weather()
    }
}

freeStyleJob('build_pipelines/first_job') {
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

freeStyleJob('build_pipelines/second_job') {
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