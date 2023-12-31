package de.bht_berlin.paf2023.component;

import org.springframework.stereotype.Component;

@Component
public class HelloComponent {
  private static Integer callCounter = 0;
  private Integer instanceId;

//  public HelloComponent(String s) {
//    System.out.println("HelloComponent constructor called");
//  }

  public String getHello() {
    String id = Integer.toHexString(System.identityHashCode(this));
    return "Hello PaF 2023 from Component (" + ++callCounter + ", " + instanceId  + ", " +  this.hashCode()  + ", " +  id + ")\n";
  }
}
