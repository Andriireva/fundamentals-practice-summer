package assigmenttwo;

public abstract class Item {
    private String title;
    private int itemID;
    private boolean availabilityStatus;

    public Item(String title, int itemID, boolean availabilityStatus) {
        this.title = title;
        this.itemID = itemID;
        this.availabilityStatus = availabilityStatus;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public boolean isAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

//    public abstract String returnedItemOut();
//    public abstract String CheckedItemOut();
    public abstract String display();
//    public abstract String displayAllCheckedOutItems();
}
