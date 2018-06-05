//Find kth element of a list

def first(list: List[Any]): Any = {
  list.head
}

def kth(k: Int, list: List[Any]): Any = {

  if (k>0) {
    list match {
      case head :: tail => kth(k-1, tail)
      case _ => throw new NoSuchElementException
  }
  } else {
    first(list)
  }

}

kth(3,List(1,2,3,4,5,6))