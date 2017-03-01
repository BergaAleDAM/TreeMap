package treemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
 

public class TreeMapEjemplo {

    public static void main(String[] args) {
        
        
        
      
        
        
        TreeMap<Integer, String> personas = new TreeMap<>();
        
        personas.put(47,"De la ");
        personas.put(34,"Fistro");
        personas.put(65,"Pradera");
        personas.put(44, "Pecador");
 
        //ejemplo para imprimir todos los elementos tal y como se pusieron
        for(Integer key: personas.keySet()){
            System.out.println(key  +" :: "+ personas.get(key));
        }
        
        System.out.println("___________________________________________");
        
        //Ejemplo que muestra el primer Value de la Primera Key
        System.out.println(personas.firstKey());
        
        
        System.out.println("___________________________________________");
        
        
        
        //Ejemplo que busca si tiene el value Pecador en el treemap
        if(personas.containsKey(44)){
            System.out.println("Este Treemap tiene a Pecador");
        } else {
            System.out.println("No contiene pecador en el TreeMaps");
        }
        
        System.out.println("___________________________________________");
        
        
        //Retorna una quantitat de elements ordenats en un mapa (SortedMap) 
        //Cerca per el numero de key
       Map mapa =  personas.subMap(34,48);
       mapa.keySet().forEach((key) -> {
           System.out.println(key  +" :: "+ mapa.get(key));
        });
       
       
       System.out.println("___________________________________________");
        
       //retorn la quantitat de keys del mapa que tenen per Key el nombre
       //passat per paràmetre o inferior
        System.out.println(personas.floorKey(46));
       
       
       System.out.println("___________________________________________");
        
       //Retorn on sortedMap dels elements que tinguin com a key el nombre passat
       //per paràmetre incloent el passat si el boolean es true
       
       Map mapa2 = personas.tailMap(47, true);
       mapa2.keySet().forEach((key) -> {
           System.out.println(key  +" :: "+ mapa2.get(key));
        });      
  
       
       //Aquest tipus de map va bastant bé per a ordenar grans quantitats d'informació
       //es a dir per a bases de dades com les de empreses grans 
       //Cerca amb ficilitat keys que no deuen estar repetides per això crec
       //que sería una bona idea
       
       
       System.out.println("___________________________________________");
           
       
       
       //UN exemple pot ser aquest 
       
       
       TreeMap<Integer, String> ejemplillo = new TreeMap<>();
        
        
       long tiempo = System.currentTimeMillis();
       for (int i = 0; i < 1000000; i++) {
            ejemplillo.put((int)(Math.random()*1000+0),"aa");
       
        }
        long tiempo1 = System.currentTimeMillis();
        
        System.out.println(tiempo1-tiempo);
        
   
         System.out.println("___________________________________________");
        
        
        //I ara ho comparem amb un arrayList
        
        ArrayList<Integer> ejemplillo2 = new ArrayList<>();
        
        
        
       long tiempo2 = System.currentTimeMillis();
       for (int i = 0; i < 1000000; i++) {
            ejemplillo2.add((int) (Math.random() * 1000 + 0));
       
        }
       Collections.sort(ejemplillo2);
        long tiempo3 = System.currentTimeMillis();
        
        System.out.println(tiempo3-tiempo2);
         
        
        
        
        
        
    }
}
    


