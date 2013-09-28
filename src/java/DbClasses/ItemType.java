/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DbClasses;

/**
 *
 * @author Krupal
 */
public class ItemType {
    private int itemTypeId;
    private int menuTypeId;
    private String itemTypeName;

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
     * @return the menuTypeId
     */
    public int getMenuTypeId() {
        return menuTypeId;
    }

    /**
     * @param menuTypeId the menuTypeId to set
     */
    public void setMenuTypeId(int menuTypeId) {
        this.menuTypeId = menuTypeId;
    }

    /**
     * @return the itemTypeName
     */
    public String getItemTypeName() {
        return itemTypeName;
    }

    /**
     * @param itemTypeName the itemTypeName to set
     */
    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }
    
}
