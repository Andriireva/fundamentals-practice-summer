package assigmenttwo;

public class Library {

    private Patron[] patrons;
    private Item[] items;

    private int counterItems = 0;
    private int counterPatrons = 0;




    public Library(Item[] items, Patron[] patrons, int itemsCapacity) {



//        patrons[0].checkItems(new Book(4443234, ....));
//        patrons[0].checkItems(new Magazine(...));
//        patrons[0].returnAnItem(4443234);
//        patrons[0].returnAnItem(22);
//        patrons[0].displayCheckedOutItems()

        // this loop is for To map the patron ID with his checked Out Item.. + To map the patron ID with their returned Items.. -->
        for (int l = 0; l < items.length ; l++) {
            Item item = items[l];

//            System.out.println(patrons[l].getName() + " " + "Patron ID " + patrons[l].getPatronID() + " " + patrons[l].checkItems(item, itemsCapacity));
//            System.out.println(patrons[l].getName() + " " + "Patron ID " + patrons[l].getPatronID() + " " + patrons[l].returnAnItem(item, itemsCapacity));
        }
    }

    // add new patron
    // add method that
    public void moveItemFromLibraryToPatron(int bookId, String patronName) {
        // find book from items by id
        // find patron by name from patrons
        // remove book from items or mark this item as not availabile ( availabilityStatus = false )
        // add book to patron
        // patrons[foundPatron].checkItems(foundItemFromItems);
    }

    public void moveItemFromPatronToLibrary(int bookId, String patronName) {
        // find patron by name from patrons
        //patrons[foundPatron].returnAnItem(foundItemFromItems);
        // remove book from patron checkoutItems
        // add book to items  or mark this item as availabile ( availabilityStatus = true )
    }
}
