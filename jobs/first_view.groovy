folder('Apache') {
    jobs {
        name('Meine Projekte/Hallo Welt echoer')
    }
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