//find no. of elements in a list

def listCount(n: Int,list: List[Any]): Any = {

  list match {
    case head :: Nil => n+1
    case head :: tail => listCount(n+1, tail)
    case _ => throw new NoSuchElementException
  }
}

listCount(0,List(1,2,3,4,5,6))
listCount(0,List(1))