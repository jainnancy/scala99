
def flatten[A](list: List[A]): List[Any] = {

  list.flatMap {
    case lst: List[_] => flatten(lst)
    case e => List(e)
  }
}

flatten(List(List(1, 1), 2, List(3, List(5, 8))))
