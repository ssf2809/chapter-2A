/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package abctrees;

/**
 *
 * @author AULA6
 */
public class Tree {
    
    private Node root;
    
    
    public Tree(){
        
      root= null;  
      
    }
    
    public void add(int v){
        
        Node n = new Node(v);
        
        if (root == null) {
            root = n;
        }else{
            Node aux = root,p=null;
            
            while(aux != null){
                p = aux;
                if(v>aux.value){
                    aux= aux.right;
                }else if(v<aux.value){
                    aux=aux.left;
                }else{
                    return;
                }                        
            }
            if(v>p.value){
                p.right=n;
            }else{
                p.left=n;
            }
            
            
        }
    }
    
    public void printPath(int v ){
        Node aux = root;
        while(aux != null){
            System.out.print(" "+ aux.value);
            
            if(v== aux.value){
                return;
            }
            if(v> aux.value){
                aux=aux.right;
            }else{
                aux=aux.left;
            }
        }
        System.out.println("No Encontrado"); 
    }
    
}

