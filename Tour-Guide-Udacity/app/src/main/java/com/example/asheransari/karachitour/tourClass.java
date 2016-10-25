package com.example.asheransari.karachitour;

/**
 * Created by asher.ansari on 10/25/2016.
 */
public class tourClass {
    private String mainText;
    private String detailText;
    private int mImageResourseID = NO_IMAGE_PROVIDED;
    private static int NO_IMAGE_PROVIDED = -1;

    public tourClass(String mainText, String detailText) {
        this.mainText = mainText;
        this.detailText = detailText;
    }

    public tourClass(String mainText, String detailText, int mImageResourseID) {
        this.mainText = mainText;
        this.detailText = detailText;
        this.mImageResourseID = mImageResourseID;
    }

    public boolean hasImage()
    {
        return mImageResourseID != NO_IMAGE_PROVIDED;
    }

    public int getmImageResourseID() {
        return mImageResourseID;
    }

    public String getMainText() {
        return mainText;
    }

    public String getDetailText() {
        return detailText;
    }
}
