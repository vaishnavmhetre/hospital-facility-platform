package models.prescription;

import models.medicine.Medicine;

public class PrescriptionItem {

    /*
        TODO
            Following fields are assumed.
            Add/Remove/Update fields as required
     */

    Medicine medicine;
    String quantity;
    String frequency;

    public PrescriptionItem(Medicine medicine, String quantity, String frequency) {
        this.medicine = medicine;
        this.quantity = quantity;
        this.frequency = frequency;
    }
}
