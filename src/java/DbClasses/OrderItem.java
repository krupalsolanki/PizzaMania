/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DbClasses;

/**
 *
 * @author Krupal
 */
public class OrderItem {
    private int orderItemId;
    private int orderId;
    private int customizeItemId;

    /**
     * @return the orderItemId
     */
    public int getOrderItemId() {
        return orderItemId;
    }

    /**
     * @param orderItemId the orderItemId to set
     */
    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    /**
     * @return the orderId
     */
    public int getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the customizeItemId
     */
    public int getCustomizeItemId() {
        return customizeItemId;
    }

    /**
     * @param customizeItemId the customizeItemId to set
     */
    public void setCustomizeItemId(int customizeItemId) {
        this.customizeItemId = customizeItemId;
    }
    
}
