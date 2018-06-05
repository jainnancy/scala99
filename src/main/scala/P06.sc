//Palindrome elements of a list

def reverse[A](reversedList: List[A],list: List[A]): List[A] = {

  list match {
    case head :: Nil => head +: reversedList
    case head :: tail => reverse(head +: reversedList, tail)
    case _ => throw new NoSuchElementException
  }
}

def palindrome[A](list: List[A]): Boolean = {
  if(list == reverse(List(),list)) true
  else false
}

palindrome(List(1,2,3,4,5,6))
palindrome(List(1,2,1))