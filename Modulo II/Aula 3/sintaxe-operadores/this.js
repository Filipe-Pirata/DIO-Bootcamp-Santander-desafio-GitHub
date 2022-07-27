function calculaIdade(anos) {
  return `Daqui a ${anos} anos, ${this.nome} terá ${
    this.idade + anos
  } anos de idade e tera um ${this.raca}`
}

const pessoa1 = {
  nome: 'Maria',
  idade: 30,
  raca: 'papagaio'
}

const pessoa2 = {
  nome: 'Luciana',
  idade: 26,
  raca: 'javali'
}

const animal = {
  nome: 'Fiona',
  idade: 5,
  raca: 'cachorro'
}

console.log(calculaIdade.call(pessoa1, 30))
