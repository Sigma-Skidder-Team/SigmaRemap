// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4876 extends Class4868
{
    private static String[] field20862;
    private final Class7776 field20863;
    private boolean field20864;
    private Class9572 field20865;
    
    public Class4876(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final Class7776 field20863) {
        super(class4803, s, n, n2, n3, n4);
        this.field20865 = new Class9572(150, 190, Class2186.field12965);
        this.field20863 = field20863;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20864 = this.method14308();
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        this.field20865.method35855(this.field20864 ? Class2186.field12964 : Class2186.field12965);
        float n2 = Class8862.method31033(this.field20865.method35858(), 0.07, 0.73, 0.63, 1.01);
        if (this.field20865.method35857() == Class2186.field12965) {
            n2 = Class8862.method31033(this.field20865.method35858(), 0.71, 0.18, 0.95, 0.57);
        }
        Class8154.method26869((float)this.method14272(), this.method14274() - n2 * 3.0f, (float)this.method14276(), (float)this.method14278());
        final int n3 = 40;
        Class8154.method26905(n3 * (-Class4939.field21207 / Minecraft.method5277().field4632.method7694()), n3 * (-Class4939.field21208 / Minecraft.method5277().field4632.method7695()), (float)(Minecraft.method5277().field4632.method7694() + n3), (float)(Minecraft.method5277().field4632.method7695() + n3), Class568.field3392);
        Class8154.method26872();
        if (this.field20864) {
            Class8154.method26874((float)this.method14272(), this.method14274() - n2 * 3.0f, (float)this.method14276(), (float)this.method14278(), Class6430.method19118(-12319668, 0.5f));
        }
        Class8154.method26899((float)this.method14272(), this.method14274() - n2 * 3.0f, (float)this.method14276(), (float)this.method14278(), this.field20863, Class265.field1278.field1292);
        GL11.glPushMatrix();
        super.method14229(n);
        GL11.glPopMatrix();
    }
}
