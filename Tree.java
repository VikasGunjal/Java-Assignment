import java.util.TreeSet;
  public class Tree{
  public static void main(String[] args) {
  TreeSet<String> tree_set = new TreeSet<String>();
  tree_set.add("Red");
  tree_set.add("Green");
  tree_set.add("Orange");
  tree_set.add("White");
  tree_set.add("Black");
  System.out.println("Tree set: ");
  System.out.println(tree_set);
    Object first_element = tree_set.first();
    System.out.println("First Element is: "+first_element);
    Object last_element = tree_set.last();
    System.out.println("Last Element is: "+last_element);
 }
}
