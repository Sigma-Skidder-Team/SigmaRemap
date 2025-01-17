// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Module;
import slick2d.Texture;

public class Class4895 extends Class4841
{
    public Class9572 field20926;
    public Class9572 field20927;
    public int field20928;
    public int field20929;
    public int field20930;
    public int field20931;
    public String field20932;
    public Class4819 field20933;
    public final Module field20934;
    public Texture field20935;
    public boolean field20936;
    
    public Class4895(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Module field20934) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20936 = false;
        this.field20930 = 500;
        this.field20931 = (int)Math.min(600.0f, n4 * 0.7f);
        this.field20929 = (n3 - this.field20930) / 2;
        this.field20928 = (n4 - this.field20931) / 2 + 20;
        this.field20934 = field20934;
        final int n5 = 10;
        final int n6 = 59;
        this.method14239(this.field20933 = new Class4819(this, "mods", this.field20929 + n5, this.field20928 + n6, this.field20930 - n5 * 2, this.field20931 - n6 - n5, field20934));
        this.field20926 = new Class9572(200, 120);
        this.field20927 = new Class9572(240, 200);
        this.method14311(false);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        Label_0007: {
            if (this.method14309()) {
                if (n >= this.field20929) {
                    if (n2 >= this.field20928) {
                        if (n <= this.field20929 + this.field20930) {
                            if (n2 <= this.field20928 + this.field20931) {
                                break Label_0007;
                            }
                        }
                    }
                }
                this.field20936 = true;
            }
        }
        this.field20926.method35855(this.field20936 ? Class2186.field12965 : Class2186.field12964);
        this.field20927.method35855(this.field20936 ? Class2186.field12965 : Class2186.field12964);
        super.method14200(n, n2);
    }
    
    private boolean method14701(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().contains(s.toLowerCase());
                }
            }
        }
        return true;
    }
    
    private boolean method14702(final String s, final String s2) {
        if (s != null) {
            if (s != "") {
                if (s2 != null) {
                    return s2.toLowerCase().startsWith(s.toLowerCase());
                }
            }
        }
        return true;
    }
    
    @Override
    public void method14205(float method35858) {
        method35858 = this.field20926.method35858();
        float n = Class7707.method24584(method35858, 0.0f, 1.0f, 1.0f);
        if (this.field20936) {
            n = Class7791.method25030(method35858, 0.0f, 1.0f, 1.0f);
        }
        this.method14288(0.8f + n * 0.2f, 0.8f + n * 0.2f);
        Class8154.method26876((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, Class6430.method19118(Class265.field1273.field1292, 0.45f * method35858));
        super.method14227();
        Class8154.method26925((float)this.field20929, (float)this.field20928, (float)this.field20930, (float)this.field20931, 10.0f, Class6430.method19118(Class265.field1278.field1292, method35858));
        Class8154.method26889(ClientFonts.JelloMedium40, (float)this.field20929, (float)(this.field20928 - 60), this.field20934.getName(), Class6430.method19118(Class265.field1278.field1292, method35858));
        final int n2 = 30;
        Class8154.method26869((float)this.field20929, (float)this.field20928, (float)(this.field20930 - 30), (float)this.field20931);
        Class8154.method26889(ClientFonts.JelloLight20, (float)(n2 + this.field20929), (float)(n2 + this.field20928), this.field20934.getDesc(), Class6430.method19118(Class265.field1273.field1292, method35858 * 0.7f));
        Class8154.method26872();
        super.method14205(method35858);
    }
}
