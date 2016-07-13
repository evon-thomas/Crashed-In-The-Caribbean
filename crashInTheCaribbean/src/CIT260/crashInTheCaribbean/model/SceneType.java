////
//// //* To change this license header, choose License Headers in Project Properties.
//// * To change this template file, choose Tools | Templates
//// * and open the template in the editor.
//// *//
//package CIT260.crashInTheCaribbean.model;
//
//import CIT260.crashInTheCaribbean.view.View;
//import java.io.Serializable;
//import java.util.Objects;
//
///**
// *
// * @author Karla
// */
//
//// public  class SceneType extends View {
// public class SceneType implements Serializable {
//
//      
//    private String Name;
//    private String description;
//    
//    
//    public SceneType(String Name, String description){
//     this.Name = Name;
//     this.description = description;
//             
//      }
//
//    public String getName() {
//        return Name;
//    }
//
//    public void setName(String Name) {
//        this.Name = Name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + Objects.hashCode(this.Name);
//        hash = 83 * hash + Objects.hashCode(this.description);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final SceneType other = (SceneType) obj;
//        if (!Objects.equals(this.Name, other.Name)) {
//            return false;
//        }
//        if (!Objects.equals(this.description, other.description)) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "SceneType{" + "Name=" + Name + ", description=" + description + '}';
//    }
//    
//    
// }