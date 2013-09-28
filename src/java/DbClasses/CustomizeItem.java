/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DbClasses;

/**
 *
 * @author Krupal
 */
public class CustomizeItem {
    private int customizeItemID;
    private int itemSizeID;
    private int menuItemID;
    private int quantity;
    private int netPrice;
    private int extraToppingsPrice;
    private int totalPrice;
    private int orderId;

    /**
     * @return the customizeItemID
     */
    public int getCustomizeItemID() {
        return customizeItemID;
    }

    /**
     * @param customizeItemID the customizeItemID to set
     */
    public void setCustomizeItemID(int customizeItemID) {
        this.customizeItemID = customizeItemID;
    }

    /**
     * @return the itemSizeID
     */
    public int getItemSizeID() {
        return itemSizeID;
    }

    /**
     * @param itemSizeID the itemSizeID to set
     */
    public void setItemSizeID(int itemSizeID) {
        this.itemSizeID = itemSizeID;
    }

    /**
     * @return the menuItemID
     */
    public int getMenuItemID() {
        return menuItemID;
    }

    /**
     * @param menuItemID the menuItemID to set
     */
    public void setMenuItemID(int menuItemID) {
        this.menuItemID = menuItemID;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the netPrice
     */
    public int getNetPrice() {
        return netPrice;
    }

    /**
     * @param netPrice the netPrice to set
     */
    public void setNetPrice(int netPrice) {
        this.netPrice = netPrice;
    }

    /**
     * @return the extraToppingsPrice
     */
    public int getExtraToppingsPrice() {
        return extraToppingsPrice;
    }

    /**
     * @param extraToppingsPrice the extraToppingsPrice to set
     */
    public void setExtraToppingsPrice(int extraToppingsPrice) {
        this.extraToppingsPrice = extraToppingsPrice;
    }

    /**
     * @return the totalPrice
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
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
    
}
