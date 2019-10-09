//Josh Urbach
//#26
//Test driver for each method a-d

public class TestSortedCollection {

   public static void main(String[] args) {
      // create a collection of house pets to test our new methods
      SortedArrayCollection<String> housePets = new SortedArrayCollection<String>();
      //Add a few pets to the collection
      housePets.add("bird");
      housePets.add("fish");
      housePets.add("dog");
      housePets.add("cat");
      
      System.out.println("The house pets collection is as follows:  " + housePets.toString()); // prints the house pets in order with comma's to separate
      System.out.println("The smallest house pet in this collection is:  " + housePets.smallest());//bird should return as b is least
      System.out.println("Number of house pets greater than ferret = " + housePets.greater("ferret"));//only fish should be greater than this
      System.out.println("Number of house pets greater than a = " + housePets.greater("a"));//all the pets should be greater than a bc b/c/d/f 
      System.out.println("number of house pets greater than dog = " + housePets.greater("dog"));// should return one being  bird and dog will not count be it is equal
      
      //create a new collection of wild animals in order to use our combine method
      SortedArrayCollection<String> animals = new SortedArrayCollection<String>();
      //add a few animals to this collection
      animals.add("tiger");
      animals.add("bear");
      animals.add("alligator");
      animals.add("wolf");
      //create a new collection to hold the combination of our two arrays
      SortedArrayCollection<String> everything = housePets.combine(animals);
      //output our final housepets collection, animals collection, and the combination of the two
      System.out.println("The house pets collection is as follows: " + housePets.toString());
      System.out.println("The wild animals collection is as follows: " + animals.toString());
      System.out.println("Both of these collections combined is: " + everything.toString());
   }
}