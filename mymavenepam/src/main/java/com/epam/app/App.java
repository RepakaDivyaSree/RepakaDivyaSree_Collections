package com.epam.app;
import java.util.Arrays;

class CustomList<D> 
{
	int size = 0;
	final int capacity = 10;
	Object arrelements[];

	public CustomList() {
		arrelements = new Object[capacity];
	}
 
	public void add(D e) {
		if (size == arrelements.length) {
			int new_arr_Size = arrelements.length * 2;
		arrelements = Arrays.copyOf(arrelements, new_arr_Size);
		}
		arrelements[size++] = e;
	}
	 
	@SuppressWarnings("unchecked")
	public D get(int i) {
		if (i >= size || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		
		return (D) arrelements[i];
	}
	 
	@SuppressWarnings("unchecked")
	public D remove(int i) {
		if (i >= size || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		System.out.println("The element deleted is: "+arrelements[i]);
		Object item = arrelements[i];
		int numele = arrelements.length - ( i + 1 ) ;
		System.arraycopy( arrelements, i + 1, arrelements, i, numele ) ;
		size--;
		return (D) item;
	}
	 
	public int size() {
		return size;
	}
	 
	public String toString() 
	{
		 StringBuilder strg = new StringBuilder();
		 strg.append('[');
		 for(int i = 0; i < size ;i++) {
			 strg.append(arrelements[i].toString());
			 if(i<size-1){
				 strg.append(",");
			 }
		 }
		 strg.append(']');
		 return strg.toString();
	}
}


public class App
{
    public static void main(String[] args) 
    {
        CustomList<Integer> my_list = new CustomList<>();
 
       
        my_list.add(10);
        my_list.add(20);
        my_list.add(30);
	my_list.add(40);
	my_list.add(50);
	my_list.add(60);
	my_list.add(70);
	my_list.add(90);
	my_list.add(100);
	my_list.add(200);
	
	System.out.println("The List created is:");
        System.out.println(my_list);
	System.out.println("Size of the list created:");
	System.out.println(my_list.size());
         
        
	
        my_list.remove(2);
	System.out.println("The List after removing an element:");
        System.out.println(my_list);
         
        
	System.out.println("Get First element from the List:");
        System.out.println( my_list.get(0) );
	System.out.println("Get second element from the List:");
        System.out.println( my_list.get(1) );
 
        
	System.out.println("Size of List after performing all operations:");
        System.out.println(my_list.size());
    }
}
