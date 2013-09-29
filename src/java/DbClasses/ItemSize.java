/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DbClasses;

/**
 *
 * @author Krupal
 */
public class ItemSize {
    private int itemSizeId;
    private String itemSizeString;
    private int itemSizePrice;

    /**
     * @return the itemSizeId
     */
    public int getItemSizeId() {
        return itemSizeId;
    }

    /**
     * @param itemSizeId the itemSizeId to set
     */
    public void setItemSizeId(int itemSizeId) {
        this.itemSizeId = itemSizeId;
    }


    /**
     * @return the itemSizePrice
     */
    public int getItemSizePrice() {
        return itemSizePrice;
    }

    /**
     * @param itemSizePrice the itemSizePrice to set
     */
    public void setItemSizePrice(int itemSizePrice) {
        this.itemSizePrice = itemSizePrice;
    }

    /**
     * @return the itemSizeString
     */
    public String getItemSizeString() {
        return itemSizeString;
    }

    /**
     * @param itemSizeString the itemSizeString to set
     */
    public void setItemSizeString(String itemSizeString) {
        this.itemSizeString = itemSizeString;
    }
    
}
