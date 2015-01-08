// This feels like cheating...
def allAnagramsEasy(str: String) = str.permutations.toList

// Pure recursive solution
def allAnagramsRecursive(available: String, pre: String = ""): List[String] = {
  if (available.length == 0) List(pre)
  else available.flatMap(c => {
    allAnagramsRecursive(available.replace(c.toChar.toString, ""), pre.concat(c.toChar.toString))
  }).toList
}

// With closure
def allAnagramsClosure(str: String) = {

  val result = scala.collection.mutable.ArrayBuffer[String]()

  def recurse(pre: String, available: String, l: Int) {
    if (l == str.length) result += pre
    else available.foreach(ch => {
      recurse(pre.concat(ch.toString), available.replace(ch.toString, ""), l + 1)
    })
  }

  recurse("", str, 0)
  result.toList
}

println(allAnagramsEasy("abc"))
println(allAnagramsRecursive("abc"))
println(allAnagramsClosure("abc"))