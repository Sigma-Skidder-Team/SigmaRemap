// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.ClientAssets;

public class Class4860 extends Class4841
{
    private static String[] field20591;
    public Class258 field20817;
    
    public Class4860(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class258 field20817) {
        super(class4803, s, n, n2, n3, n4, false);
        this.field20817 = field20817;
        this.method14260((class4803, n) -> {
            this.field20817 = this.field20817.method896();
            this.method14517();
        });
    }
    
    public Class258 method14577() {
        return this.field20817;
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26869((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481);
        Class8154.method26899((float)(this.field20478 - this.field20817.field1232 * this.field20480), (float)this.field20479, (float)(this.field20480 * 3), (float)this.field20481, ClientAssets.repeat, Class6430.method19118(Class265.field1278.field1292, 0.35f));
        Class8154.method26872();
        super.method14205(n);
    }
}
