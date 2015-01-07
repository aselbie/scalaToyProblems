def balancedParens(str: String): Boolean = {
  var count = 0
  for (char <- str) {
    if (char == '(') count = count + 1
    if (char == ')') count = count - 1
    if (count < 0) return false
  }
  count == 0
}

println("Expected true and got " + balancedParens("()") )
println("Expected true and got " + balancedParens("(yo)") )
println("Expected false and got " + balancedParens(")(") )
println("Expected false and got " + balancedParens("(()") )
