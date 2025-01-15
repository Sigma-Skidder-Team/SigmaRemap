// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class5794 extends Class5791
{
    private static String[] field23794;
    private static final Class7843 field23795;
    private final Class7843 field23796;
    private int field23797;
    
    public Class5794(final Class852 class852) {
        super(class852);
        this.field23796 = new Class7843().method25337(20.0).method25343(class854 -> Math.abs(class854.getPosY() - class853.method1941()) <= 10.0);
    }
    
    @Override
    public void method17247() {
        ++this.field23797;
        final Class512 method7136 = this.field23764.world.method7136(this.field23796, this.field23764, this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ());
        if (method7136 == null) {
            if (this.field23797 >= 100) {
                final Class512 method7137 = this.field23764.world.method7136(Class5794.field23795, this.field23764, this.field23764.getPosX(), this.field23764.getPosY(), this.field23764.getPosZ());
                this.field23764.method5127().method33696(Class7193.field27952);
                if (method7137 != null) {
                    this.field23764.method5127().method33696(Class7193.field27956);
                    this.field23764.method5127().method33698(Class7193.field27956).method17256(new Vec3d(method7137.getPosX(), method7137.getPosY(), method7137.getPosZ()));
                }
            }
        }
        else if (this.field23797 <= 25) {
            final float n = (float)(Math.acos((float)new Vec3d(MathHelper.sin(this.field23764.rotationYaw * 0.017453292f), 0.0, -MathHelper.cos(this.field23764.rotationYaw * 0.017453292f)).normalize().dotProduct(new Vec3d(method7136.getPosX() - this.field23764.getPosX(), 0.0, method7136.getPosZ() - this.field23764.getPosZ()).normalize())) * 57.2957763671875) + 0.5f;
            if (n < 0.0f || n > 10.0f) {
                final double n2 = method7136.getPosX() - this.field23764.field4535.getPosX();
                final double n3 = method7136.getPosZ() - this.field23764.field4535.getPosZ();
                final double method7138 = MathHelper.method35654(MathHelper.method35669(180.0 - MathHelper.method35693(n2, n3) * 57.2957763671875 - this.field23764.rotationYaw), -100.0, 100.0);
                final Class852 field23764 = this.field23764;
                field23764.field4547 *= 0.8f;
                final float n5;
                float n4 = n5 = MathHelper.sqrt(n2 * n2 + n3 * n3) + 1.0f;
                if (n4 > 40.0f) {
                    n4 = 40.0f;
                }
                this.field23764.field4547 += (float)(method7138 * (0.7f / n4 / n5));
                final Class852 field23765 = this.field23764;
                field23765.rotationYaw += this.field23764.field4547;
            }
        }
        else {
            this.field23764.method5127().method33696(Class7193.field27955);
        }
    }
    
    @Override
    public void method17249() {
        this.field23797 = 0;
    }
    
    @Override
    public Class7193<Class5794> method17253() {
        return Class7193.field27954;
    }
    
    static {
        field23795 = new Class7843().method25337(150.0);
    }
}
