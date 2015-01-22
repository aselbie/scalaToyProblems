def characterFrequencyFunctional(str: String) = {
  str.groupBy(_.toChar).mapValues(_.size).toList.sorted
}

def characterFrequencyImperative(str: String) = {
  var chars = scala.collection.mutable.Map[Char, Int]()
  for (ch <- str) {
    if (chars.contains(ch)) chars(ch) += 1
    else chars(ch) = 1
  }
  chars.toList.sorted
}

println(characterFrequencyFunctional("bbbaaccc"))
println(characterFrequencyImperative("bbbaaccc"))
