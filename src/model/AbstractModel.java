/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import observer.Observable;
import observer.Observer;
import java.util.ArrayList;

public abstract class AbstractModel implements Observable {
    
    private ArrayList<Observer> listObserver = new ArrayList<Observer>(); 
    
  //Implémentation du pattern observer
  public void addObserver(Observer obs) {
      this.listObserver.add(obs);
  }
  
   public void notifyObserver(String str) {
    if(str.matches("^0[0-9]+"))
      str = str.substring(1, str.length());

    for(Observer obs : listObserver)
      obs.update(str);
  }

  public void removeObserver() {
    listObserver = new ArrayList<Observer>();
  } 
    
}
