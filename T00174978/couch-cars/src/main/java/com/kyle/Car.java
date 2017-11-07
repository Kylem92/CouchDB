package com.kyle;

/**
 * Created by Amanda on 13/10/2016.
 */
public class Car {
    private String _id, _rev, model, bhp;

    public Car()
    {
       this("","","","");
    }
    public Car(String id, String rev, String model, String bhp)
    {
        set_id(id);
        set_rev(rev);
        setModel(model);
        setBhp(bhp);
    }



    public void setModel(String model)
    {
        this.model=model;
    }
    public void setBhp(String bhp)
    {
        this.bhp=bhp;
    }


    public void set_id(String _id) {
        this._id = _id;
    }

    public void set_rev(String _rev) {
        this._rev = _rev;
    }
}
