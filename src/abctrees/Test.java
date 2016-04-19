/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abctrees;

/**
 *
 * @author AULA6
 */
public class Test {
    
    public static void main (String args[]){
           
    Tree t = new Tree();
    
    int vs[]={8,2,15,21,45,3,9,30};
    
    for(int i=0;i< vs.length;i++){
    
    t.add(vs[i]);
    }
        System.out.println("Camino Hasta El 11");
        t.printPath(11);
}
}