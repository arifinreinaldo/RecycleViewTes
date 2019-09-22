package com.daggertwo.tes.model;

public class PojoPicker {
    private String upperText;
    private String bottomText;
    private int idx;
    private boolean isSelected;
    private boolean isDisabled;

    public PojoPicker(){

    }
    public PojoPicker(String upper,String bottom,int idxPointer){
        upperText = upper;
        bottomText = bottom;
        idx = idxPointer;
    }
    public PojoPicker(String upper,String bottom,int idxPointer,boolean selected){
        upperText = upper;
        bottomText = bottom;
        idx = idxPointer;
        isSelected = selected;
    }

    public PojoPicker(String upperText, String bottomText, int idx, boolean isSelected, boolean isDisabled) {
        this.upperText = upperText;
        this.bottomText = bottomText;
        this.idx = idx;
        this.isSelected = isSelected;
        this.isDisabled = isDisabled;
    }

    public String getUpperText() {
        return upperText;
    }

    public void setUpperText(String upperText) {
        this.upperText = upperText;
    }

    public String getBottomText() {
        return bottomText;
    }

    public int getIndex() {
        return idx;
    }

    public void setBottomText(String bottomText) {
        this.bottomText = bottomText;
    }
    public void setSelected(boolean value){
        this.isSelected = value;
    }
    public boolean getSelected(){
        return this.isSelected;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }
}
