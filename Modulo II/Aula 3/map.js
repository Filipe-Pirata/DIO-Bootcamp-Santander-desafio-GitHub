function getAdmins(map) {
  let admins = []
  for ([key, value] of map) {
    if (value === 'admin') {
      admins.push(key)
    }
  }
  return admins
}

const usuarios = new Map()

usuarios.set('luis', 'admin')
usuarios.set('filipe', 'user')
usuarios.set('Ruth', 'admin')
usuarios.set('Pedro', 'admin')

console.log(getAdmins(usuarios))
