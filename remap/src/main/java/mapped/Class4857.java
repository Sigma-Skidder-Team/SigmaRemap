// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import slick2d.TrueTypeFont;

import java.util.Iterator;

public class Class4857 extends Class4841
{
    public final int field20807;
    private float field20808;
    private boolean field20809;
    private boolean field20810;
    
    public Class4857(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final int field20807) {
        super(class4803, s, n, n2, n3, n4, Class6523.field25964, s2, false);
        this.field20809 = false;
        this.field20810 = false;
        this.field20807 = field20807;
        this.method14570();
    }
    
    public void method14570() {
        final Iterator<Class8799> iterator = Class4940.method14874().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method30705() != this.field20807) {
                continue;
            }
            this.field20810 = true;
            return;
        }
        this.field20810 = false;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20808 = Math.max(0.0f, Math.min(1.0f, this.field20808 + 0.2f * ((!this.method14309() && !this.field20809) ? -1 : 1)));
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26924((float)this.field20478, (float)(this.field20479 + 5), (float)this.field20480, (float)this.field20481, 8.0f, Class6430.method19120(-3092272, -2171170, this.field20808));
        Class8154.method26924((float)this.field20478, this.field20479 + 3.0f * this.field20808, (float)this.field20480, (float)this.field20481, 8.0f, -986896);
        TrueTypeFont class7524 = ClientFonts.JelloLight20;
        if (this.field20495.contains("Lock")) {
            Class8154.method26888((float)(this.field20478 + 14), this.field20479 + 11 + 3.0f * this.field20808, 10.0f, Class6430.method19118(Class265.field1276.field1292, this.field20808));
        }
        if (!this.field20495.equals("Return")) {
            if (!this.field20495.equals("Back")) {
                if (!this.field20495.equals("Meta")) {
                    if (!this.field20495.equals("Menu")) {
                        if (!this.field20495.equals("Space")) {
                            if (this.field20810) {
                                class7524 = ClientFonts.Regular20;
                            }
                            Class8154.method26889(class7524, (float)(this.field20478 + (this.field20480 - class7524.getWidth(this.field20495)) / 2), this.field20479 + 19 + 3.0f * this.field20808, this.field20495, Class6430.method19118(Class265.field1273.field1292, 0.4f + (this.field20810 ? 0.2f : 0.0f)));
                        }
                    }
                    else {
                        final int n2 = this.field20478 + 25;
                        final int n3 = this.field20479 + 25 + (int)(3.0f * this.field20808);
                        Class8154.method26878((float)n2, (float)n3, (float)(n2 + 14), (float)(n3 + 3), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                        Class8154.method26876((float)n2, (float)(n3 + 4), (float)(n2 + 14), (float)(n3 + 7), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                        Class8154.method26878((float)n2, (float)(n3 + 8), (float)(n2 + 14), (float)(n3 + 11), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                        Class8154.method26878((float)n2, (float)(n3 + 12), (float)(n2 + 14), (float)(n3 + 15), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                    }
                }
                else {
                    Class8154.method26888((float)(this.field20478 + 32), (float)(this.field20479 + 32 + (int)(3.0f * this.field20808)), 14.0f, Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                }
            }
            else {
                final int n4 = this.field20478 + 43;
                final int n5 = this.field20479 + 33 + (int)(3.0f * this.field20808);
                Class8154.method26884((float)n4, (float)n5, (float)(n4 + 6), (float)(n5 - 3), (float)(n4 + 6), (float)(n5 + 3), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
                Class8154.method26876((float)(n4 + 6), (float)(n5 - 1), (float)(n4 + 27), (float)(n5 + 1), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
            }
        }
        else {
            final int n6 = this.field20478 + 50;
            final int n7 = this.field20479 + 33 + (int)(3.0f * this.field20808);
            Class8154.method26884((float)n6, (float)n7, (float)(n6 + 6), (float)(n7 - 3), (float)(n6 + 6), (float)(n7 + 3), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
            Class8154.method26876((float)(n6 + 6), (float)(n7 - 1), (float)(n6 + 27), (float)(n7 + 1), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
            Class8154.method26876((float)(n6 + 25), (float)(n7 - 8), (float)(n6 + 27), (float)(n7 - 1), Class6430.method19118(Class265.field1273.field1292, 0.3f + (this.field20810 ? 0.2f : 0.0f)));
        }
        super.method14205(n);
    }
    
    @Override
    public void method14204(final int n) {
        if (n == this.field20807) {
            this.field20809 = true;
        }
        super.method14204(n);
    }
    
    @Override
    public void method14231(final int n) {
        if (n == this.field20807) {
            this.field20809 = false;
        }
        super.method14231(n);
    }
}
