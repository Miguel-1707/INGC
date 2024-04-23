const btnhome = document.getElementById("bhome")
const integrante1 = document.getElementById("bi1")
const integrante2 = document.getElementById("bi2")
const labelHome = document.getElementById("labelhome")
const label1 = document.getElementById("label1")
const label2 = document.getElementById("label2")

btnhome.addEventListener('click', function(){
    console.log("click en home")
    labelHome.classList.remove('hidden')
    label1.classList.add('hidden')
    label2.classList.add('hidden')
})

integrante1.addEventListener('click', function (){
    console.log("click en integrante 1")
    labelHome.classList.add('hidden')
    label1.classList.remove('hidden')
    label2.classList.add('hidden')
})

integrante2.addEventListener('click', function (){
    console.log("click en integrante 2")
    labelHome.classList.add('hidden')
    label1.classList.add('hidden')
    label2.classList.remove('hidden')
})