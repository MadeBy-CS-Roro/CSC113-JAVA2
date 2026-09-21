import java.io.*;
public abstract class TransportUnit implements CapacityChecker, Serializable { 

  // Attributes
  protected String id;
  protected int capacity;
  protected List<Passenger> passengers; 

  // Constructor with parameters
  public TransportUnit(String id, int capacity) {
    this.id = id;
    this.capacity = capacity;
    this.passengers = new List<Passenger>("Passengers List");
  }

  // Method to check if the vehicle is full
  public boolean isFull() {
    return passengers.size() >= capacity;
  }

  // Method to add a passenger to the vehicle
  public boolean addPassenger(Passenger p) {
    if (p != null && !isFull()) {
      passengers.insertAtBack(p); 
      return true;
    }
    return false;
  }

  // Method to remove a passenger from the vehicle
  public boolean removePassenger(String passengerId) {
    for (int i = 0; i < passengers.size(); i++) {
      Passenger p = passengers.get(i);
      if (p.getId().equalsIgnoreCase(passengerId)) {
        passengers.remove(p); 
        return true;
      }
    }
    return false;
  }

  // Method to display passengers in the vehicle
  public String displayPassengers() {
    if (passengers.isEmpty()) {
        return " No passengers currently on board.\n";
    }

    String info = "";
    for (int i = 0; i < passengers.size(); i++) {
      info += " " + passengers.get(i).toString() + "\n";
    }
    return info;
  }

  // Setters and getters methods
  public int getCurrentPassengers() {
    return passengers.size();
  }

  public void setID(String Id) {
    id = Id;
  }

  public String getID() {
    return id;
  }

  public int getCapacity() {
    return capacity;
  }

  // toString method to display vehicle details
  public String toString() {
    return "Transport Unit ID: " + id + "\nCapacity: " + capacity;
  }
}