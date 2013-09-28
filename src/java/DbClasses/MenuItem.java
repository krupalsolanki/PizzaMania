/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DbClasses;

/**
 *
 * @author Krupal
 */
public class MenuItem {
    private int menuItemId;
    private int itemTypeId;
    private int itemPrice;
    private String itemName;
    private String itemToppings;
    private String imageSource;

    /**
     * @return the menuItemId
     */
    public int getMenuItemId() {
        return menuItemId;
    }

    /**
     * @param menuItemId the menuItemId to set
     */
    public void setMenuItemId(int menuItemId) {
        this.menuItemId = menuItemId;
    }

    /**
     * @return the itemTypeId
     */
    public int getItemTypeId() {
        return itemTypeId;
    }

    /**
     * @param itemTypeId the itemTypeId to set
     */
    public void setItemTypeId(int itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    /**
     * @return the itemPrice
     */
    public int getItemPrice() {
        return itemPrice;
    }

    /**
     * @param itemPrice the itemPrice to set
     */
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the itemToppings
     */
    public String getItemToppings() {
        return itemToppings;
    }

    /**
     * @param itemToppings the itemToppings to set
     */
    public void setItemToppings(String itemToppings) {
        this.itemToppings = itemToppings;
    }

    /**
     * @return the imageSource
     */
    public String getImageSource() {
        return imageSource;
    }

    /**
     * @param imageSource the imageSource to set
     */
    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }
    
}
