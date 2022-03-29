/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package communitylookuptool;

/**
 *
 * @author bryce
 */
public interface Location {
    public void setLocation(String inLocation);
    public void updateLocation(String oldLocation, String newLocation);
    public void addLocation(String inLocation);
}
