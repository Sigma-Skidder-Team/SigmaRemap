// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class4885 extends Class4841
{
    public int field20881;
    public boolean field20882;
    public Class4904 field20883;
    public Class4903 field20884;
    public Class4884 field20885;
    
    public Class4885(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final int n5, final boolean field20882) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20881 = n5;
        final Color color = new Color(n5);
        final float[] rgBtoHSB = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        this.addVisualThing(this.field20883 = new Class4904(this, "block", 10, 10, n3 - 20, n4 - 50, rgBtoHSB[0], rgBtoHSB[1], rgBtoHSB[2]));
        this.addVisualThing(this.field20884 = new Class4903(this, "slider", 14, n4 - 25, n3 - 65, 8, rgBtoHSB[0]));
        this.addVisualThing(this.field20885 = new Class4884(this, "bubble", n3 - 40, n4 - 32, 25, 25, color.getRGB()));
        this.field20883.method14516(class4841 -> this.method14624());
        this.field20884.method14516(class4841 -> this.method14624());
        this.field20885.method14260((class4803, n) -> this.method14619(!this.method14621()));
        this.field20882 = field20882;
    }
    
    public void method14619(final boolean b) {
        this.method14620(b);
        this.method14517();
    }
    
    public void method14620(final boolean field20882) {
        this.field20882 = field20882;
    }
    
    public boolean method14621() {
        return this.field20882;
    }
    
    public void method14622(final int n) {
        if (n != this.field20881) {
            final Color color = new Color(n);
            final float[] rgBtoHSB = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
            this.field20883.method14729(rgBtoHSB[0]);
            this.field20883.method14732(rgBtoHSB[1], false);
            this.field20883.method14735(rgBtoHSB[2], false);
            this.field20884.method14728(rgBtoHSB[0], false);
            this.field20885.field20880 = n;
        }
    }
    
    public int method14623() {
        return this.field20881;
    }
    
    private void method14624() {
        this.method14625();
        this.method14517();
    }
    
    private void method14625() {
        this.field20883.method14729(this.field20884.method14726());
        this.field20881 = this.field20883.method14736();
        this.field20885.field20880 = this.field20881;
    }
    
    public static void method14626(final int n, final int n2, final int n3, final float n4) {
        final int n5 = 14;
        Class8154.method26888((float)n, (float)n2, (float)n5, Class6430.method19118(Class265.field1273.field1292, 0.1f * n4));
        Class8154.method26888((float)n, (float)n2, (float)(n5 - 1), Class6430.method19118(Class265.field1273.field1292, 0.14f * n4));
        Class8154.method26888((float)n, (float)n2, (float)(n5 - 2), Class6430.method19118(Class265.field1278.field1292, n4));
        Class8154.method26888((float)n, (float)n2, (float)(n5 - 6), Class6430.method19118(Class6430.method19120(n3, Class265.field1273.field1292, 0.7f), n4));
        Class8154.method26888((float)n, (float)n2, (float)(n5 - 7), Class6430.method19118(n3, n4));
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        if (this.field20882) {
            this.field20884.method14728(System.currentTimeMillis() % 4000L / 4000.0f, false);
            this.method14625();
        }
        super.method14205(n);
    }
}
