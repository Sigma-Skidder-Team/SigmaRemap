// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4880 extends Class4868
{
    public static final Class6523 field20873;
    public boolean field20874;
    public Class9572 field20875;
    
    public Class4880(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, Class4880.field20873);
        this.field20874 = false;
        this.field20875 = new Class9572(300, 250);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20875.method35855(this.field20492 ? Class2186.field12964 : Class2186.field12965);
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        this.method14286(1.0f + this.field20875.method35858());
        this.method14287(1.0f + this.field20875.method35858());
        this.method14227();
        Class8154.method26889(this.method14316(), (float)this.method14272(), (float)this.method14274(), "" + this.field20875.method35858(), Class265.field1273.field1292);
        GL11.glPushMatrix();
        super.method14229(n);
        GL11.glPopMatrix();
    }
    
    static {
        field20873 = new Class6523(Class265.field1278.field1292, Class6430.method19121(Class265.field1278.field1292, 0.1f));
    }
}
