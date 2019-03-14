package models.prescription;

import java.util.ArrayList;

public class Prescription {

    /*
        TODO
            Following fields are assumed.
            Add/Update fields as required
     */

    ArrayList<PrescriptionItem> items;  // Dont remove this field

    public Prescription(ArrayList<PrescriptionItem> items) {
        this.items = items;
    }

    public void addItem(PrescriptionItem item) {
        this.items.add(item);
    }

    public void addItems(ArrayList<PrescriptionItem> items) {
        this.items.addAll(items);
    }

}
