// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class4858 extends Class4841
{
    public int field20811;
    public Class4851 field20812;
    public Class4851 field20813;
    public Class4851 field20814;
    
    public Class4858(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20811 = n5;
        final Color color = new Color(n5);
        Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        this.addToList(this.field20812 = new Class4851(this, "redSlider", 14, 10, n3 - 28, 8, n5, color.getRed()));
        this.addToList(this.field20813 = new Class4851(this, "greenSlider", 14, 20, n3 - 28, 8, n5, color.getGreen()));
        this.addToList(this.field20814 = new Class4851(this, "blueSlider", 14, 30, n3 - 28, 8, n5, color.getBlue()));
        this.field20812.method14516(class4841 -> this.method14573());
        this.field20813.method14516(class4841 -> this.method14573());
        this.field20814.method14516(class4841 -> this.method14573());
    }
    
    public void method14571(final int n) {
        if (n != this.field20811) {
            final Color color = new Color(n);
            this.field20812.method14556(n);
            this.field20813.method14556(n);
            this.field20814.method14556(n);
            this.field20812.method14558(color.getRed());
            this.field20813.method14558(color.getGreen());
            this.field20814.method14558(color.getBlue());
            this.field20811 = n;
        }
    }
    
    public int method14572() {
        return this.field20811;
    }
    
    private void method14573() {
        this.method14571(new Color(this.field20812.method14557(), this.field20813.method14557(), this.field20814.method14557()).getRGB());
        this.method14517();
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        super.draw(n);
    }
}
