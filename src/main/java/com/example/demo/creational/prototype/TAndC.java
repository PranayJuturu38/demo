package com.example.demo.creational.prototype;

public class TAndC extends PrototypeCapableDocument {
    
    @Override
    public PrototypeCapableDocument cloneDocument() {
        /*Clone with shallow copy*/
        TAndC tAndC = null;
        try {
            tAndC = (TAndC) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return tAndC;
    }

    @Override
    public String toString() {
        return "[TAndC: Vendor Name - " + getVendorName() + ", Content - " + getContent() + "]";
    }
}
