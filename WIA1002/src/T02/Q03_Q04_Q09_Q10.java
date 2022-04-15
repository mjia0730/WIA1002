/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package T02;

/**
 *
 * @author USER
 */
public class Q03_Q04_Q09_Q10 {
    //Q03
    //A "raw" type in Java is a generic class or interface used without specifying a concrete type/
    //without a type parameter 
    //Example: ArrayList list = new ArrayList();
    
    //raw types bypass generic type checks, deferring the catch of unsafe code to runtime.
    
    //raw types allow legacy codes to still compile
    //raw types are used for backward compatibility
    
    //Q04
    //Generics are implemented using an approach called type erasure.
    //The compiler uses generic type information to compile the code, but erases it afterward
    //So the generic information is not available at run time
    //This approach enables the generic code to be backward-compatible with the legacy codes
    //that uses raw types
    
    //Q09
    //It replaces all occurrences of the type parameter with Object.
    
    //Q10
    //It replaces all occurrences of the type parameter with the bound that is applied to the parameter.
}
