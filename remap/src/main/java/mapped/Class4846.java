// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3i;

public class Class4846 extends Class4841
{
    public int field20760;
    public final Class9572 field20761;
    public final Class9572 field20762;
    public String field20763;
    public Vec3i field20764;
    public int field20765;
    public int field20766;
    
    public Class4846(final Class4803 class4803, final String s, final int n, final int field20760, final int n2, final int field20761, final String field20762, final Vec3i field20763, final int field20764) {
        super(class4803, s, n, field20760, n2, field20761, true);
        this.field20760 = field20760;
        this.field20761 = new Class9572(114, 114);
        (this.field20762 = new Class9572(200, 200)).method35855(Class2186.field12965);
        this.field20763 = field20762;
        this.field20764 = field20763;
        this.field20765 = field20764;
        this.field20766 = field20761;
        this.field20599 = true;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20761.method35855(this.method14386() ? Class2186.field12964 : Class2186.field12965);
        this.method14385(this.method14386() || n > this.method14280() + this.method14276() - 62);
        if (this.field20762.method35857() == Class2186.field12964) {
            this.method14385(false);
            this.method14273(Math.round(this.method14276() * Class7791.method25029(this.field20762.method35858(), 0.0f, 1.0f, 1.0f)));
            if (this.field20762.method35858() == 1.0f) {
                this.method14517();
            }
        }
    }
    
    public void method14533() {
        this.field20762.method35855(Class2186.field12964);
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26874((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, Class6430.method19118(Class6430.method19121(Class265.field1278.field1292, 0.03f), this.field20761.method35858()));
        Class8154.method26889(ClientFonts.JelloLight20, (float)(this.field20478 + 68), (float)(this.field20479 + 14), this.field20763, Class6430.method19118(Class265.field1273.field1292, 0.8f));
        Class8154.method26889(ClientFonts.JelloLight14, (float)(this.field20478 + 68), (float)(this.field20479 + 38), "x:" + this.field20764.getX() + " z:" + this.field20764.getZ(), Class6430.method19118(Class265.field1273.field1292, 0.5f));
        final int n2 = 27;
        final int n3 = this.field20480 - 43;
        final float n4 = this.method14386() ? 0.4f : 0.2f;
        Class8154.method26874((float)(this.field20478 + n3), (float)(this.field20479 + n2), 20.0f, 2.0f, Class6430.method19118(Class265.field1273.field1292, n4));
        Class8154.method26874((float)(this.field20478 + n3), (float)(this.field20479 + n2 + 5), 20.0f, 2.0f, Class6430.method19118(Class265.field1273.field1292, n4));
        Class8154.method26874((float)(this.field20478 + n3), (float)(this.field20479 + n2 + 10), 20.0f, 2.0f, Class6430.method19118(Class265.field1273.field1292, n4));
        Class8154.method26888((float)(this.field20478 + 35), (float)(this.field20479 + this.field20481 / 2), 20.0f, Class6430.method19120(this.field20765, Class265.field1273.field1292, 0.9f));
        Class8154.method26888((float)(this.field20478 + 35), (float)(this.field20479 + this.field20481 / 2), 17.0f, this.field20765);
        Class8154.method26913((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, 14.0f, n * 0.2f * this.field20761.method35858());
        super.method14205(n);
    }
}
