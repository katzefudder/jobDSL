folder('Apache') {

}

folder('LAMP') {

}

listView('Docker Introduction'){
    jobs {
        name('Apache')
        name('LAMP')
    }
}