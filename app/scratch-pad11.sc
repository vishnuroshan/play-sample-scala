

def loopTill(cond: => Boolean)(body: => Unit): Unit = {
  println(cond, body)
  if (cond) {

    loopTill(cond)(body)
  }
}

var i = 3
loopTill(i > 0) {
  i -= 1
}

