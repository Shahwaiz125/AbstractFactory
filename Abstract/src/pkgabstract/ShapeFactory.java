/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgabstract;

/**
 *
 * @author sp21-bse-061
 */
public class ShapeFactory extends AbstractFactory {

    @Override
   public Shape getShape(String shapeType){    
      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();         
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }else if(shapeType.equalsIgnoreCase("Triangle")){
         return new Triangle();
      }
         else{  
      return null;
   }
   }}
