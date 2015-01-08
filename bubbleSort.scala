import scala.runtime.ScalaRunTime.stringOf

def bubbleSort(original: Array[Int]): Array[Int] = {

  val arr = original.clone

  var l = 0
  var r = arr.length - 2
  var updated = true

  def swap(a: Int, b: Int) {
    val temp = arr(a)
    arr.update(a, arr(b))
    arr.update(b, temp)
  }

  while (updated) {
    updated = false
    for (i <- l to r) {
      if (arr(i) > arr(i + 1)) {
        swap(i, i + 1)
        updated = true
        if (i == r) r = r - 1
      }
    }
  }

  return arr
}

println(stringOf(bubbleSort(Array(2, 1, 3, 6, 5, 7, 4))))
