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
    private String itemSize;
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
     * @return the itemSize
     */
    public String getItemSize() {
        return itemSize;
    }

    /**
     * @param itemSize the itemSize to set
     */
    public void setItemSize(String itemSize) {
        this.itemSize = itemSize;
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
    
}
