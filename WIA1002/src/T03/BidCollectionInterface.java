/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package T03;

/**
 *
 * @author USER
 */
public interface BidCollectionInterface {
    public void addBid(BidInterface add);
    /**Add a bid to this collection
     * Precondition: None
     * Post condition: The bid was added to the end of the collection
     * @param add   The bid to add
     */
    
    public BidInterface bestYearlyCost(double averageHour, double energyCost);
    /**Return a bid in this collection with the best yearly cost
     * Precondition: The collection is not empty
     * Post condition: The bid with the lowest yearly cost was returned
     * @param averageHour   average hour of operation per year
     * @param energyCost    cost per kilowatt hour
     * @return A bid with the lowest yearly cost
     */

    public BidInterface bestInitialCost();
    /**Return a bid with the best initial cost. The best initial cost is defined as unit cost plus the installation cost
     * Precondition: The collection is not empty
     * Post condition: a bid with the best initial cost was returned
     * @param None
     * @return A bid with the best initial cost
     */

    public void clear();
    /**Clear all the items in this collection
     * Precondition: None
     * Post condition: The collection is empty
     * @param None
     * @return None
     */
    
    public int getNumOfItems();
    /**Returns the number of items in this collection
     * Precondition: The collection is not empty
     * Post condition: the number of items in this collection was returned
     * @param None
     * @return the number of items in this collection
     */
    
    public boolean isEmpty();
    /**Check whether the collection is empty
     * Precondition: None
     * Post condition: The collection is unchanged
     * @param None
     * @return TRUE if there are no items in the collection, otherwise false
     */
}
