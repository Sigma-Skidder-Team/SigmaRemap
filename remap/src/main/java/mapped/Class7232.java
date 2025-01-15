// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

public class Class7232
{
    private static String[] field28037;
    private final Class759 field28038;
    private int field28039;
    private float field28040;
    
    public Class7232(final Class759 field28038) {
        this.field28038 = field28038;
    }
    
    public void method22131() {
        if (!this.method22136()) {
            if (this.method22135()) {
                if (Math.abs(this.field28038.field2953 - this.field28040) <= 15.0f) {
                    ++this.field28039;
                    if (this.field28039 > 10) {
                        this.method22134();
                    }
                }
                else {
                    this.field28039 = 0;
                    this.field28040 = this.field28038.field2953;
                    this.method22132();
                }
            }
        }
        else {
            this.field28038.field2951 = this.field28038.rotationYaw;
            this.method22133();
            this.field28040 = this.field28038.field2953;
            this.field28039 = 0;
        }
    }
    
    private void method22132() {
        this.field28038.field2951 = MathHelper.method35672(this.field28038.field2951, this.field28038.field2953, (float)this.field28038.method4174());
    }
    
    private void method22133() {
        this.field28038.field2953 = MathHelper.method35672(this.field28038.field2953, this.field28038.field2951, (float)this.field28038.method4174());
    }
    
    private void method22134() {
        this.field28038.field2951 = MathHelper.method35672(this.field28038.field2951, this.field28038.field2953, this.field28038.method4174() * (1.0f - MathHelper.clamp((this.field28039 - 10) / 10.0f, 0.0f, 1.0f)));
    }
    
    private boolean method22135() {
        return this.field28038.method1908().isEmpty() || !(this.field28038.method1908().get(0) instanceof Class759);
    }
    
    private boolean method22136() {
        final double n = this.field28038.getPosX() - this.field28038.prevPosX;
        final double n2 = this.field28038.getPosZ() - this.field28038.prevPosZ;
        return n * n + n2 * n2 > 2.500000277905201E-7;
    }
}
