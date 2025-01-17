// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;

public class Class4896 extends Class4841
{
    public float field20937;
    public Class8799 field20938;
    public Date field20939;
    public int field20940;
    public Date field20941;
    public Class4893 field20942;
    
    public Class4896(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class8799 field20938, final int field20939) {
        super(class4803, s, n, n2, n3, n4, false);
        this.method14239(this.field20942 = new Class4893(this, "delete", 200, 20, 20, 20));
        this.field20942.method14260((class4803, n) -> {
            this.field20939 = new Date();
            this.method14517();
        });
        this.field20938 = field20938;
        this.field20940 = field20939;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    public void method14703() {
        this.method14279(0);
        this.field20941 = new Date();
    }
    
    @Override
    public void method14205(final float n) {
        if (this.field20941 != null) {
            final float method25030 = Class7791.method25030(Class9572.method35860(this.field20941, 150.0f), 0.0f, 1.0f, 1.0f);
            this.method14279((int)(55.0f * method25030));
            if (method25030 == 1.0f) {
                this.field20941 = null;
            }
        }
        if (this.field20939 != null) {
            final float method25031 = Class7791.method25030(Class9572.method35860(this.field20939, 180.0f), 0.0f, 1.0f, 1.0f);
            this.method14279((int)(55.0f * (1.0f - method25031)));
            if (method25031 == 1.0f) {
                this.field20939 = null;
            }
        }
        Class8154.method26871(this.field20478, this.field20479, this.field20478 + this.field20480, this.field20479 + this.field20481, true);
        Class8154.method26889(ClientFonts.Regular20, (float)(this.field20478 + 25), this.field20479 + this.field20481 / 2.0f - 17.5f, this.field20938.method30702(), Class6430.method19118(Class265.field1273.field1292, 0.6f * n));
        Class8154.method26889(ClientFonts.JelloLight12, (float)(this.field20478 + 25), this.field20479 + this.field20481 / 2.0f + 7.5f, this.field20938.method30703(), Class6430.method19118(Class265.field1273.field1292, 0.6f * n));
        this.field20942.method14275((int)(this.field20481 / 2.0f - 7.5f));
        super.method14205(n);
        Class8154.method26872();
    }
}
