const updateWords = wordFn => sentence => sentence.replace(/\w+/g, wordFn)
const reverseWord = word => word.split('').reverse().join('')
const reverseIfGte5 = word => (word.length > 5 ? reverseWord(word) : word)

const spinWords = updateWords(reverseIfGte5)

console.log(spinWords('Filipe Vitor de Castro Azevedo'))
