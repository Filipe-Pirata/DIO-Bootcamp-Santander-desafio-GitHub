console.log('rodando..')

const currentNumberWrapper = document.getElementById('currentNumber')
let currentNumber = 0

function increment() {
  currentNumber++
  currentNumberWrapper.innerHTML = currentNumber
  if (currentNumber < 0) {
    currentNumberWrapper.innerHTML =
      "<span id='currentNumber' style='color:red;'>" + currentNumber + '</span>'
  }
}

function decrement() {
  currentNumber--
  currentNumberWrapper.innerHTML = currentNumber

  if (currentNumber < 0) {
    currentNumberWrapper.innerHTML =
      "<span id='currentNumber' style='color:red;'>" + currentNumber + '</span>'
  }
}
