package assigmenttwo;

public class Patron {
    private String name;
    private int patronID;

    private Item[] checkedOutItems;
    private int itemCount;
    String checkedOutItem = " ";

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatronID() {
        return patronID;
    }

    public void setPatronID(int patronID) {
        this.patronID = patronID;
    }

    public String getCheckedOutItem() {
        return checkedOutItem;
    }

    public void setCheckedOutItem(String checkedOutItem) {
        this.checkedOutItem = checkedOutItem;
    }

    public Item[] getCheckedOutItems() {
        return checkedOutItems;
    }

    public void setCheckedOutItems(Item[] checkedOutItems) {
        this.checkedOutItems = checkedOutItems;
    }

    public Patron(String name, int patronID, int size) {
        this.name = name;
        this.patronID = patronID;
        this.checkedOutItems = new Item[size];
    }

//    public void Patron (int itemsCapacity) {
//        checkedOutItems = new Item[itemsCapacity];
//        itemCount = 0;
//    }

    public boolean checkItems(Item itemToCheck) {
        if (itemCount < checkedOutItems.length) {
            checkedOutItems[itemCount] = itemToCheck;
            itemCount++;
            return true;

        } else {
            return false;
        }
    }

    public boolean returnAnItem(int bookIdToReturn) {
//        checkedOutItems = new Item[itemsCapacity];

        // 1st you find book by id item.getId() == bookIdToReturn
        // if it found checkedOutItems[foundIndex] = null and count--
        // if it is not found return false


        if (itemCount < checkedOutItems.length){
//            checkedOutItems[itemCount] = itemToReturn;
            itemCount++;
            return true;
        } else {
            return false;
        }
//        for (int i = 0; i < checkedOutItems.length; i++) {
//            if (checkedOutItems != null) {
//                checkedOutItems[i] = itemToReturn;
//                System.out.println("The returned Item is : " + checkedOutItems[i].returnedItemOut());
//            }
//        }
    }

    public void returnItem(Item item) {
        Item[] checkedNew = new Item[100];
        int j = 0;
        for (int i = 0; i < checkedOutItems.length; i++) {
            if (checkedOutItems[i] != null) {
                if (checkedOutItems[i].getItemID() != item.getItemID()) {
                    checkedNew[j] = checkedOutItems[i];
                    j++;
                }
            }
        }
        for (int i = 0; i < checkedNew.length; i++) {
            checkedOutItems[i] = checkedNew[i];
        }

//        item.setAvailability(true);
//        count--;

    }

    public String displayCheckedOutItems() {

        for (int i = 0; i < checkedOutItems.length; i++) {
            if (checkedOutItems[i] != null) {
                String displidItem = checkedOutItems[i].display();
                System.out.println(displidItem);
            }
        }
//        checkedOutItems = new Item[itemsCapacity];
//        if (itemCount < checkedOutItems.length) {
//            checkedOutItems[itemCount] = itemToCheck;
//            checkedOutItem = checkedOutItems[itemCount].displayAllCheckedOutItems();
//            return "Item" + " " + itemCount + " "  + "Checked Out Item is --> " + checkedOutItems[itemCount].displayAllCheckedOutItems();
//        } else {
//            return "Nothing more to return!! Thanks So Much!!";
//        }
        return "";
    }
}
