package array;

// Java program to demonstrate
// Class Objects for Arrays

class ClassObjectsforArrays {
	public static void main(String args[])
	{
		int intArray[] = new int[3];
		byte byteArray[] = new byte[3];
		short shortsArray[] = new short[3];

		// array of Strings
		String[] strArray = new String[3];

		System.out.println(intArray.getClass());
		System.out.println(
			intArray.getClass().getSuperclass());
		System.out.println(byteArray.getClass());
		System.out.println(shortsArray.getClass());
		System.out.println(strArray.getClass());
	}
}


/**
 * The string “[I” is the run-time type signature for the class object “array with component type int.”
The only direct superclass of an array type is java.lang.Object.
The string “[B” is the run-time type signature for the class object “array with component type byte.”
The string “[S” is the run-time type signature for the class object “array with component type short.”
The string “[L” is the run-time type signature for the class object “array with component type of a Class.” The Class name is then followed.
 */

/**
 * Now, as you know that arrays are objects of a class, and a direct superclass of arrays is a class Object. The members of an array type are all of the following: 

The public final field length contains the number of components of the array. Length may be positive or zero.
All the members are inherited from class Object; the only method of Object that is not inherited is its clone method.
The public method clone() overrides the clone method in class Object and throws no checked exceptions.
 */