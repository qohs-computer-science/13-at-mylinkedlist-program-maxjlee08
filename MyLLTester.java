public class MyLLTester
{
  public static void main(String [] args)
  {
  MyLinkedList list = new MyLinkedList();

  System.out.println("Is list empty? " + list.isEmpty());
  System.out.println(list.toString());
  System.out.println("Size: " + list.size());
  
  list.add("B");
  list.add("C");
  list.addFirst("A");
  list.addLast("I");
  list.add("D");
  list.add("E");
  list.add("F");
  list.add("G");
  list.add("H");
  list.add("J");
  System.out.println("\nList after adding 10 elements;");
  System.out.println(list);

//using set
  System.out.println("Setting index 3 to 'CHANGED'");
  list.set(3, "CHANGED");
  System.out.println(list);

//using get
  System.out.println("Getting element at index 5: " + list.get(5));
  System.out.println(list);

//removing values
  System.out.println("Removing the first value: " + list.removeFirst());
  System.out.println(list);
  System.out.println("Removing the last value: " + list.removeLast());  
  System.out.println(list);
  System.out.println("Removing the value at index 2: " + list.remove(2));
  System.out.println(list);

//Chekcing size and isEmpty
  System.out.println("Is list empty? " + list.isEmpty());
  System.out.println("Size: " + list.size());


  } // end main
  
} // end class
