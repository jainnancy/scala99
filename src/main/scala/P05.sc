//Rverse elements of a list

def reverse(reversedList: List[Any],list: List[Any]): List[Any] = {

  list match {
    case head :: Nil => head +: reversedList
    case head :: tail => reverse(head +: reversedList, tail)
    case _ => throw new NoSuchElementException
  }
}

reverse(List(),List(1,2,3,4,5,6))
reverse(List(),List(1))

val list = List(1,2,3,4,5)
list :+ 4