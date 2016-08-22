package com.example.android.tourdujour;

/**
 * Created by uzuri17 on 8/13/2016.
 */
public class Destination {

    //Destination name
    private String mName;

    //Destination address
    private String mAddress;

    //Image for destination
    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    //@param mName is the name of the destination
    //@param mAdress is the address of the destination
    //@param imageResourceID is the image associated with the words
    public Destination(String Name, String Address, int imageResourceID){
        mName = Name;
        mAddress = Address;
        mImageResourceID = imageResourceID;
    }
    /*get destination name
    */
    public String getDestinationName(){
        return mName;
    }
    /*get destination address
    */
    public String getDestinationAddress(){
        return mAddress;
    }
    public int getImageResourceID(){
        return mImageResourceID;
    }

}
