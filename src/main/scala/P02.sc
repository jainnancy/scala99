//Find last second element of a list

def lastSec(list: List[Any]): Any = {

  list match {
    case head :: second :: Nil => head
    case head :: second :: tail => lastSec(second :: tail)
    case _ => throw new NoSuchElementException
  }
}

lastSec(List(1,2,3,4,5,6))
lastSec(List())