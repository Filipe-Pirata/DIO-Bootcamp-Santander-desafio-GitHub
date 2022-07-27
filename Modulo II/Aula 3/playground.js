/* 
UTILIZANDO O ARGUMENTO THIS

const maca = {
  value: 2
}

const laranja = {
  value: 3
}

function mapComThis(arr, thisArg) {
  return arr.map(function (item) {
    return item * this.value
  }, thisArg)
}

const nums = [1, 2]

console.log('This -> maça', mapComThis(nums, maca))
console.log('This -> laranja', mapComThis(nums, laranja)) */

/*

Sem o argumento THIS

function mapSemThis(arr) {
  return arr.map(function (item) {
    return item * 2
  })
}

const nums = [2, 4, 6, 8, 10]

console.log(mapSemThis(nums)) */

/* utilizando FILTER

function filtraPares(arr) {
  return arr.filter(callback)
}
function callback(item) {
  return item % 2 === 0
}

const meuArray = [1, 23, 55, 40, 67, 22]

console.log(filtraPares(meuArray)) */

/* Utilizando o Reduce 

function somaNumber(arr) {
  return arr.reduce(function (prev, current) {
    return prev + current
  })
}

const arr = [1, 2]

console.log(somaNumber(arr))*/

const lista = [
  { name: 'sabao em pó', preco: 30 },
  { name: 'cereal', preco: 12 },
  { name: 'Sabonete', preco: 30 }
]

const saldoDisponivel = 100

function calculaSaldo(saldoDisponivel, lista) {
  return lista.reduce(function (prev, current, index) {
    console.log('rodada ', index + 1)
    console.log({ prev })
    console.log({ current })
    return prev - current.preco
  }, saldoDisponivel)
}

console.log(calculaSaldo(saldoDisponivel, lista))
