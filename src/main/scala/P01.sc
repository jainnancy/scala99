//Find last element of a list

def last(list: List[Any]): Any = {

  list match {
    case head :: Nil => head
    case head :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}

last(List(1,2,3,4,5,6))
last(List())