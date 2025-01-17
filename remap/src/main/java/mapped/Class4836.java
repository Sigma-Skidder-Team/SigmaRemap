// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;

import java.awt.image.BufferedImage;

public class Class4836 extends Class4825
{
    public Class7971 field20723;
    private BufferedImage field20724;
    private Texture field20725;
    private float field20726;
    private Class4840 field20727;
    private boolean field20728;
    private float field20729;
    private int field20730;
    private int field20731;
    private int field20732;
    
    public Class4836(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7971 field20723) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20723 = null;
        this.field20726 = 0.0f;
        this.field20728 = false;
        this.field20729 = 0.0f;
        this.field20730 = 0;
        this.field20731 = 0;
        this.field20732 = Class6430.method19120(Class265.field1278.field1292, Class265.field1273.field1292, 20.0f);
        this.field20723 = field20723;
        this.addVisualThing(this.field20727 = new Class4840(this, "loading", n3 - 50, 35, 30, 30));
        this.field20727.method14305(false);
    }
    
    public void method14505(final boolean b) {
        this.method14506(b, false);
    }
    
    public void method14506(final boolean field20728, final boolean b) {
        this.field20728 = field20728;
        if (b) {
            this.field20726 = 1.0f;
        }
    }
    
    public boolean method14507() {
        return this.field20728;
    }
    
    @Override
    public void method14205(final float n) {
        this.method14228();
        this.field20726 += (float)(this.field20728 ? 0.2 : -0.2);
        this.field20726 = Math.min(1.0f, Math.max(0.0f, this.field20726));
        this.field20732 = Class6430.method19120(Class265.field1278.field1292, Class265.field1273.field1292, 2.0f);
        Label_0141: {
            if (!this.field20728) {
                if (!this.method14309()) {
                    if (!this.method14308()) {
                        break Label_0141;
                    }
                }
            }
            Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(Class265.field1278.field1292, 0.05f));
        }
        if (!this.method14309()) {
            if (this.method14308() && this.field20728) {
                Class8154.method26879((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), 2, Class6430.method19118(Class265.field1281.field1292, 0.5f));
            }
            else if (!this.method14308()) {
                if (this.field20728) {
                    Class8154.method26879((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), 2, Class6430.method19118(Class265.field1281.field1292, 0.3f));
                }
            }
            else {
                Class8154.method26879((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), 2, Class6430.method19118(Class265.field1273.field1292, 0.3f));
            }
        }
        else {
            Class8154.method26879((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), 2, Class6430.method19118(Class265.field1281.field1292, 0.65f));
        }
        Class8154.method26871(this.field20478, this.field20479, this.field20478 + this.field20480, this.field20479 + this.field20481, true);
        if (this.field20723 != null) {
            this.method14509();
            Class8154.method26872();
            if (this.field20726 > 0.0f) {
                if (this.field20481 > 55) {
                    Class8154.method26899((float)(this.field20478 + this.method14276()), this.field20479 + 26 * this.field20481 / 100.0f, 18.0f * this.field20726 * this.field20481 / 100.0f, 47 * this.field20481 / 100.0f, ClientAssets.select, this.method14309() ? this.field20732 : Class265.field1278.field1292);
                }
            }
            super.method14205(n);
        }
    }
    
    public void method14508() {
        Class8154.method26900((float)(this.field20478 + 13), (float)(this.field20479 + 13), 75.0f, 75.0f, this.field20723.method25899(), Class265.field1278.field1292, true);
        Class8154.method26914((float)(this.field20478 + 13), (float)(this.field20479 + 13), 75.0f, 75.0f, 20.0f, 1.0f);
        Class8154.method26899((float)(this.field20478 + 1), (float)this.field20479, 100.0f, 100.0f, ClientAssets.cercle, this.method14309() ? this.field20732 : Class265.field1278.field1292);
    }
    
    public void method14509() {
        String s = this.field20723.method25889();
        if (s.equals("Unknown name")) {
            s = this.field20723.method25888();
        }
        Class8154.method26890(ClientFonts.Default, (float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + 20), s, Class6430.method19118(Class265.field1273.field1292, 0.4f), Class2056.field11738, Class2056.field11738);
        Class8154.method26890(ClientFonts.Default, (float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + 18), s, Class265.field1278.field1292, Class2056.field11738, Class2056.field11738);
        if (!this.field20723.method25912()) {
            Class8154.method26891(ClientFonts.Default, (float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + 32), this.field20723.method25892().replaceAll(".", "*"), -8355712, Class2056.field11738, Class2056.field11735, true);
        }
        else {
            Class8154.method26891(ClientFonts.Default, (float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + 29), "Cracked", Class265.field1283.field1292, Class2056.field11738, Class2056.field11735, true);
        }
    }
    
    public void method14510(final int n) {
        this.field20730 = n;
        this.field20731 = n;
    }
    
    public void method14511(final boolean b) {
        this.field20727.method14305(b);
    }
}
