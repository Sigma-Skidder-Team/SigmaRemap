// 
// Decompiled by Procyon v0.6.0
// 

package com.thizzer.jtouchbar.common;

public class Color
{
    public static final Color BLACK;
    public static final Color DARK_GRAY;
    public static final Color LIGHT_GRAY;
    public static final Color WHITE;
    public static final Color GRAY;
    public static final Color RED;
    public static final Color GREEN;
    public static final Color BLUE;
    public static final Color CYAN;
    public static final Color YELLOW;
    public static final Color MAGENTA;
    public static final Color ORANGE;
    public static final Color PURPLE;
    public static final Color BROWN;
    public static final Color CLEAR;
    public static final Color CONTROL_SHADOW;
    public static final Color CONTROL_DARK_SHADOW;
    public static final Color CONTROL_COLOR;
    public static final Color CONTROL_HIGHLIGHT;
    public static final Color CONTROL_LIGHT_HIGHLIGHT;
    public static final Color CONTROL_TEXT;
    public static final Color CONTROL_BACKGROUND;
    public static final Color SELECTED_CONTROL;
    public static final Color SECONDARY_SELECTED_CONTROL;
    public static final Color SELECTED_CONTROL_TEXT;
    public static final Color DISABLED_CONTROL_TEXT;
    public static final Color TEXT;
    public static final Color TEXT_BACKGROUND;
    public static final Color SELECTED_TEXT;
    public static final Color SELECTED_TEXT_BACKGROUND;
    public static final Color GRID_COLOR;
    public static final Color KEYBOARD_FOCUS_INDICATOR;
    public static final Color WINDOW_BACKGROUND;
    public static final Color UNDERPAGE_BACKGROUND;
    public static final Color LABEL;
    public static final Color SECONDARY_LABEL;
    public static final Color TERTIARY_LABEL;
    public static final Color QUATERNARY_LABEL;
    public static final Color SCROLLBAR;
    public static final Color KNOB;
    public static final Color SELECTED_KNOB;
    public static final Color WINDOW_FRAME;
    public static final Color WINDOW_FRAME_TEXT;
    public static final Color SELECTED_MENU_ITEM;
    public static final Color SELECTED_MENU_ITEM_TEXT;
    public static final Color HIGHLIGHT;
    public static final Color SHADOW;
    public static final Color HEADER;
    public static final Color HEADER_TEXT;
    public static final Color ALTERNATE_SELECTED_CONTROL;
    public static final Color ALTERNATE_SELECTED_CONTROL_TEXT;
    public static final Color SCRUBBER_TEXTURED_BACKGROUND;
    public static final Color SYSTEM_RED;
    public static final Color SYSTEM_GREEN;
    public static final Color SYSTEM_BLUE;
    public static final Color SYSTEM_ORANGE;
    public static final Color SYSTEM_YELLOW;
    public static final Color SYSTEM_BROWN;
    public static final Color SYSTEM_PINK;
    public static final Color SYSTEM_PURPLE;
    public static final Color SYSTEM_GRAY;
    private String _nsColorKey;
    private float _red;
    private float _green;
    private float _blue;
    private float _alpha;
    
    public Color(final String nsColorKey) {
        this._nsColorKey = nsColorKey;
    }
    
    public Color(final float red, final float green, final float blue) {
        this(red, green, blue, 1.0f);
    }
    
    public Color(final float red, final float green, final float blue, final float alpha) {
        this._red = red;
        this._green = green;
        this._blue = blue;
        this._alpha = alpha;
    }
    
    public String getNsColorKey() {
        return this._nsColorKey;
    }
    
    public void setNsColorKey(final String nsColorKey) {
        this._nsColorKey = nsColorKey;
    }
    
    public float getRed() {
        return this._red;
    }
    
    public void setRed(final float red) {
        this._red = red;
    }
    
    public float getGreen() {
        return this._green;
    }
    
    public void setGreen(final float green) {
        this._green = green;
    }
    
    public float getBlue() {
        return this._blue;
    }
    
    public void setBlue(final float blue) {
        this._blue = blue;
    }
    
    public float getAlpha() {
        return this._alpha;
    }
    
    public void setAlpha(final float alpha) {
        this._alpha = alpha;
    }
    
    static {
        BLACK = new Color("blackColor");
        DARK_GRAY = new Color("darkGrayColor");
        LIGHT_GRAY = new Color("lightGrayColor");
        WHITE = new Color("whiteColor");
        GRAY = new Color("grayColor");
        RED = new Color("redColor");
        GREEN = new Color("greenColor");
        BLUE = new Color("blueColor");
        CYAN = new Color("cyanColor");
        YELLOW = new Color("yellowColor");
        MAGENTA = new Color("magentaColor");
        ORANGE = new Color("orangeColor");
        PURPLE = new Color("purpleColor");
        BROWN = new Color("brownColor");
        CLEAR = new Color("clearColor");
        CONTROL_SHADOW = new Color("controlShadowColor");
        CONTROL_DARK_SHADOW = new Color("controlDarkShadowColor");
        CONTROL_COLOR = new Color("controlColor");
        CONTROL_HIGHLIGHT = new Color("controlHighlightColor");
        CONTROL_LIGHT_HIGHLIGHT = new Color("controlLightHighlightColor");
        CONTROL_TEXT = new Color("controlTextColor");
        CONTROL_BACKGROUND = new Color("controlBackgroundColor");
        SELECTED_CONTROL = new Color("selectedControlColor");
        SECONDARY_SELECTED_CONTROL = new Color("secondarySelectedControlColor");
        SELECTED_CONTROL_TEXT = new Color("selectedControlTextColor");
        DISABLED_CONTROL_TEXT = new Color("disabledControlTextColor");
        TEXT = new Color("textColor");
        TEXT_BACKGROUND = new Color("textBackgroundColor");
        SELECTED_TEXT = new Color("selectedTextColor");
        SELECTED_TEXT_BACKGROUND = new Color("selectedTextBackgroundColor");
        GRID_COLOR = new Color("gridColor");
        KEYBOARD_FOCUS_INDICATOR = new Color("keyboardFocusIndicatorColor");
        WINDOW_BACKGROUND = new Color("windowBackgroundColor");
        UNDERPAGE_BACKGROUND = new Color("underPageBackgroundColor");
        LABEL = new Color("labelColor");
        SECONDARY_LABEL = new Color("secondaryLabelColor");
        TERTIARY_LABEL = new Color("tertiaryLabelColor");
        QUATERNARY_LABEL = new Color("quaternaryLabelColor");
        SCROLLBAR = new Color("scrollBarColor");
        KNOB = new Color("knobColor");
        SELECTED_KNOB = new Color("selectedKnobColor");
        WINDOW_FRAME = new Color("windowFrameColor");
        WINDOW_FRAME_TEXT = new Color("windowFrameTextColor");
        SELECTED_MENU_ITEM = new Color("selectedMenuItemColor");
        SELECTED_MENU_ITEM_TEXT = new Color("selectedMenuItemTextColor");
        HIGHLIGHT = new Color("highlightColor");
        SHADOW = new Color("shadowColor");
        HEADER = new Color("headerColor");
        HEADER_TEXT = new Color("headerTextColor");
        ALTERNATE_SELECTED_CONTROL = new Color("alternateSelectedControlColor");
        ALTERNATE_SELECTED_CONTROL_TEXT = new Color("alternateSelectedControlTextColor");
        SCRUBBER_TEXTURED_BACKGROUND = new Color("scrubberTexturedBackgroundColor");
        SYSTEM_RED = new Color("systemRedColor");
        SYSTEM_GREEN = new Color("systemGreenColor");
        SYSTEM_BLUE = new Color("systemBlueColor");
        SYSTEM_ORANGE = new Color("systemOrangeColor");
        SYSTEM_YELLOW = new Color("systemYellowColor");
        SYSTEM_BROWN = new Color("systemBrownColor");
        SYSTEM_PINK = new Color("systemPinkColor");
        SYSTEM_PURPLE = new Color("systemPurpleColor");
        SYSTEM_GRAY = new Color("systemGrayColor");
    }
}
