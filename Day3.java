/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 *
 * @author dodoq
 */



/*
 * Big-O Notes - Day 3 Task 10
 *
 * ArrayList (backed by an array):
 * - get(index)        -> O(1)    direct index access
 * - add(at end)        -> O(1) amortized, sometimes O(n) if it needs to resize
 * - add(index 0)        -> O(n)    has to shift every element to the right
 * - remove(index 0)      -> O(n)    has to shift every element to the left
 *
 * LinkedList (backed by nodes linked together):
 * - get(index)        -> O(n)    has to walk node by node
 * - add(start or end)    -> O(1)    just relinks a node, no shifting
 * - remove(start or end)   -> O(1)    same reason
 *
 * HashMap (backed by a hash table):
 * - get(key)         -> O(1) average, hashCode gives direct bucket access
 * - put(key, value)     -> O(1) average
 * - remove(key)        -> O(1) average
 * - worst case can be O(n) if there are a lot of hash collisions, but that's rare
 *
 * TreeMap (backed by a red-black tree, always sorted):
 * - get(key)         -> O(log n)  has to go down the tree level by level
 * - put(key, value)     -> O(log n)
 * - remove(key)        -> O(log n)
 * - keeps everything sorted, unlike HashMap

 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        // task1
        
        ArrayList<Integer> arraylist = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        
        long start = System.nanoTime();
        
        for (int i = 0; i < 10000; i++)
        {

             arraylist.add(0, i);
  
        }
        
        long end = System.nanoTime();
        
        long arrayTime = end - start;
        
        System.out.println("ArrayList time: " + arrayTime + " ns");
        
        
        ///linkedlist
        
        start = System.nanoTime();

        for (int i = 0; i < 10000; i++)
        {
             linkedlist.add(0, i);
        }

        end = System.nanoTime();

        long linkedTime = end - start;

        System.out.println("LinkedList time: " + linkedTime + " ns");
        
        
        //task2
        System.out.println("task 2 :");
        
        System.out.println("push : 1 2 3 4 5");
        Deque<Integer> s = new ArrayDeque<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("peek : " + s.peek());
        
        
        
        System.out.println("pop :");

        
        while (!s.isEmpty())
        {
            System.out.println(s.pop());
        }
        
        //task3
        System.out.println("task 3 :");
        
        Queue<String> qu = new LinkedList<>();

        qu.offer("hadi");
        qu.offer("mohammad");
        qu.offer("ahmad");
        qu.offer("khaled");
        qu.offer("assaf");
        
        System.out.println("Next student: " + qu.peek());
        
        while (!qu.isEmpty()) 
        {
            System.out.println("student " + qu.poll());
        }

        //tsk4
        System.out.println("task 4 :");
        
        HashMap<String,List<String>> students =new HashMap<>();
        
        List<String> hadic = new ArrayList<>();
        hadic.add("java");
        hadic.add("Flutter");
        hadic.add("oop");
        
        List<String> ahmadc = new ArrayList<>();
        ahmadc.add("AI");
        ahmadc.add("Flutter");
        
        
        
        students.put("hadi", hadic);
        students.put("ahmad", ahmadc);
        
        for (String student : students.keySet())
           {
               System.out.println(student + " -> " + students.get(student));
           }
        
        //task5
        
        System.out.println("task 5 :");
        
        
        
        List<Map.Entry<String, List<String>>> list = new ArrayList<>(students.entrySet());
        
        list.sort((a, b) -> b.getValue().size() - a.getValue().size());
        
        for (Map.Entry<String, List<String>> entry : list) 
        {

    System.out.println(entry.getKey()
            + " -> "
            + entry.getValue().size()
            + " courses");

        }
        
        //task6
        System.out.println("task 6 : ");
        
        String[] names = {
    "Ali",
    "Sara",
    "Ali",
    "Noor",
    "Sara",
    "Hadi"
};
        HashSet<String> uniqueNames = new HashSet<>();
        
        for (String name : names) 
        {
            uniqueNames.add(name);
        }
        
        System.out.println("Unique names:");

        for (String name : uniqueNames)
        {
           System.out.println(name);
        }
        
        //task7
        
        System.out.println("task 7 : ");
        
        TreeMap<String , Integer> products = new TreeMap<>(); 
        
products.put("Milk", 3);
products.put("Bread", 2);
products.put("Rice", 15);
products.put("Sugar", 4);
products.put("Coffee", 8);
products.put("Tea", 5);
products.put("Juice", 6);

         for (String product : products.keySet())
         {
             System.out.println(product + " -> $" + products.get(product));
         }
         
         //task8
         
         System.out.println("task 8 : " );
         
         String sentence= "hadi kmail mohammad kmail abo kmail hadi kmail hadi mohammad";
         
         String[] words = sentence.split(" ");
         
         HashMap<String, Integer> frequency = new HashMap<>();
         
         for (String word : words)
         {
              if (frequency.containsKey(word)) 
              {
                    frequency.put(word, frequency.get(word) + 1);
              }   
              
                 else 
                   {
                      frequency.put(word, 1);
                   }
              
         }
         
         
         for (String word : frequency.keySet())
         {
              System.out.println(word + " -> " + frequency.get(word));
         }
         
         
         //task9
         System.out.println("task 9 : ");
         
         int[] numbers = {2, 5, 8, 12, 15, 20, 25,70,80,112};
         
         System.out.println(binarySearch(numbers, 15));

         System.out.println(binarySearch(numbers, 9));
         
         
         



    }
    
    public static int binarySearch(int[] arr, int target) {

    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {

        int mid = (left + right) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}
    
}
