// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.lwjgl.opengl.GL11;

public class Class4941 extends Class4800
{
    private int field21221;
    private int field21222;
    private boolean field21223;
    public static Class9572 field21224;
    private Class7776 field21225;
    private Class4813 field21226;
    public static Class527 field21227;
    
    public Class4941() {
        super("options");
        this.field21221 = 0;
        this.field21222 = 0;
        this.field21223 = true;
        this.method14311(false);
        final int max = Math.max((int)(this.field20481 * 0.8f), 420);
        final int n = (int)(this.field20480 * 0.8f);
        this.method14239(this.field21226 = new Class4813(this, "centerBlock", this.method14276() - n, this.method14278() - max, n - (this.method14276() - n), max - (this.method14278() - max)));
        Class4941.field21224 = new Class9572(300, 100);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        if (Class4941.field21224.method35857() == Class2186.field12965) {
            if (Class4941.field21224.method35858() == 0.0f) {
                if (Class4941.field21227 != null) {
                    Class869.method5277().method5244(Class4941.field21227);
                }
            }
        }
        super.method14200(n, n2);
    }
    
    @Override
    public void method14205(final float n) {
        float n2 = 1.3f - Class7707.method24584(Class4941.field21224.method35858(), 0.0f, 1.0f, 1.0f) * 0.3f;
        float method35858 = 1.0f;
        if (Class4941.field21224.method35857() == Class2186.field12965) {
            n2 = 0.7f + Class7791.method25030(Class4941.field21224.method35858(), 0.0f, 1.0f, 1.0f) * 0.3f;
            method35858 = Class4941.field21224.method35858();
        }
        Class8154.method26881(0, 0, this.method14276(), this.method14278(), Class6430.method19120(-1072689136, Class6430.method19118(Class265.field1273.field1292, 0.1f), method35858), Class6430.method19120(-804253680, Class6430.method19118(Class265.field1273.field1292, 0.1f), method35858));
        this.method14288(n2, n2);
        this.method14227();
        super.method14205(Class4941.field21224.method35858());
    }
    
    private void method14886(final float n) {
        final int field21222 = this.method14320() * -1;
        final float n2 = this.method14321() / (float)this.method14276() * -114.0f;
        if (this.field21223) {
            this.field21221 = (int)n2;
            this.field21222 = field21222;
            this.field21223 = false;
        }
        final float n3 = n2 - this.field21221;
        final float n4 = (float)(field21222 - this.field21222);
        GL11.glPushMatrix();
        Class8154.method26898((float)this.field21222, (float)this.field21221, (float)(this.method14276() * 2), (float)(this.method14278() + 114), this.field21225, Class6430.method19118(Class265.field1278.field1292, n));
        GL11.glPopMatrix();
        final float n5 = 0.5f;
        if (n2 != this.field21221) {
            this.field21221 += (int)(n3 * n5);
        }
        if (field21222 != this.field21222) {
            this.field21222 += (int)(n4 * n5);
        }
    }
    
    public static void method14887(final Class527 field21227) {
        Class4941.field21227 = field21227;
        Class4941.field21224.method35855(Class2186.field12965);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 256) {
            Class869.method5277().method5244(null);
        }
    }
    
    static {
        Class4941.field21224 = new Class9572(300, 200);
        Class4941.field21227 = null;
    }
}
