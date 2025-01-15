// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class6569 extends Class6564
{
    private static String[] field26085;
    private float field26086;
    public final /* synthetic */ Class851 field26087;
    
    public Class6569(final Class851 field26087, final Class759 class759) {
        this.field26087 = field26087;
        super(class759);
        this.field26086 = 0.1f;
    }
    
    @Override
    public void method19904() {
        if (this.field26087.collidedHorizontally) {
            final Class851 field26087 = this.field26087;
            field26087.rotationYaw += 180.0f;
            this.field26086 = 0.1f;
        }
        final float n = (float)(Class851.method5090(this.field26087).field22770 - this.field26087.getPosX());
        final float n2 = (float)(Class851.method5090(this.field26087).field22771 - this.field26087.getPosY());
        final float n3 = (float)(Class851.method5090(this.field26087).field22772 - this.field26087.getPosZ());
        final double n4 = 1.0 - MathHelper.method35647(n2 * 0.7f) / (double) MathHelper.method35640(n * n + n3 * n3);
        final float n5 = (float)(n * n4);
        final float n6 = (float)(n3 * n4);
        final double n7 = MathHelper.method35640(n5 * n5 + n6 * n6);
        final double n8 = MathHelper.method35640(n5 * n5 + n6 * n6 + n2 * n2);
        final float field26088 = this.field26087.rotationYaw;
        this.field26087.rotationYaw = MathHelper.method35674(MathHelper.method35668(this.field26087.rotationYaw + 90.0f), MathHelper.method35668((float) MathHelper.method35693(n6, n5) * 57.295776f), 4.0f) - 90.0f;
        this.field26087.field2951 = this.field26087.rotationYaw;
        if (MathHelper.method35671(field26088, this.field26087.rotationYaw) >= 3.0f) {
            this.field26086 = MathHelper.method35673(this.field26086, 0.2f, 0.025f);
        }
        else {
            this.field26086 = MathHelper.method35673(this.field26086, 1.8f, 0.005f * (1.8f / this.field26086));
        }
        final float field26089 = (float)(-(MathHelper.method35693(-n2, n7) * 57.2957763671875));
        this.field26087.rotationPitch = field26089;
        final float n9 = this.field26087.rotationYaw + 90.0f;
        final double n10 = this.field26086 * MathHelper.cos(n9 * 0.017453292f) * Math.abs(n5 / n8);
        final double n11 = this.field26086 * MathHelper.sin(n9 * 0.017453292f) * Math.abs(n6 / n8);
        final double n12 = this.field26086 * MathHelper.sin(field26089 * 0.017453292f) * Math.abs(n2 / n8);
        final Vec3d method1935 = this.field26087.getMotion();
        this.field26087.method1936(method1935.add(new Vec3d(n10, n12, n11).subtract(method1935).scale(0.2)));
    }
}
