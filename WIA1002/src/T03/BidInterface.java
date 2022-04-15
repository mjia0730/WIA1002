/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package T03;

/**
 *
 * @author USER
 */
public interface BidInterface {
    
    public String getCompanyName();
    /**Returns the name of the company that this bid is for
     * Precondition: None
     * Post condition: The name of company was returned
     * @param None
     * @return company name
     */
    
    public String getDescription();
    /**Returns the description of the air conditioner that this bid is for
     * Precondition: None
     * Post condition: the description of the AC was returned
     * @param None
     * @return company name
     */
    
    public int getCapacity();
    /**Returns the capacity of this bid's AC in tons
     * Precondition: None
     * Post condition: The capacity of this bid's AC in tons was returned
     * @param None
     * @return capacity of this bid's AC
     */
    
    public double getSEER();
    /**Returns the seasonal efficiency (SEER) of this bid's AC
     * Precondition: None
     * Post condition: the seasonal efficiency (SEER) of this bid's AC was returned
     * @param None
     * @return seasonal efficiency(SEER)
     */
    
    public double getCost();
    /**Returns the cost of this bid's AC
     * Precondition: None
     * Post condition: the cost of this bid's AC was returned
     * @param None
     * @return cost of this bid's AC
     */
    
    public double getCostInstalling();
    /**Returns the cost of installing this bid's AC
     * Precondition: None
     * Post condition: the cost of installing this bid's AC was returned
     * @param None
     * @return cost of installing this bid's AC
     */
    
    public double getYearlyCost(double averageHour, double energyCost);
    /**Returns the yearly cost of operating this bid's AC
     * Precondition: None
     * Post condition: the yearly cost of operating this bid's AC was returned
     * @param averageHour   average hours of operation per year
     * @param energyCost    cost per kilowatt hour
     * @return yearly cost of operating this bid's AC
     */
}

