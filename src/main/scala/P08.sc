

def eliminateDuplicates[A](list: List[A], newList: List[A]): List[A] = {
  list match {
      case head :: mid :: tail =>
        if(head == mid) eliminateDuplicates(mid +: tail, newList)
        else eliminateDuplicates(mid +: tail, newList :+ head)
      case head :: Nil =>
        newList :+ head
  }
}

def compress[A](list: List[A]): List[A] = eliminateDuplicates(list, List())
compress(List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e','a'))
