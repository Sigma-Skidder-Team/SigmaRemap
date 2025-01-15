// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class7727
{
    private static String[] field30731;
    public final Class759 field30732;
    public float field30733;
    public float field30734;
    public boolean field30735;
    public double field30736;
    public double field30737;
    public double field30738;
    
    public Class7727(final Class759 field30732) {
        this.field30732 = field30732;
    }
    
    public void method24666(final Vec3d class5487) {
        this.method24668(class5487.x, class5487.y, class5487.z);
    }
    
    public void method24667(final Entity class399, final float n, final float n2) {
        this.method24669(class399.getPosX(), method24678(class399), class399.getPosZ(), n, n2);
    }
    
    public void method24668(final double n, final double n2, final double n3) {
        this.method24669(n, n2, n3, (float)this.field30732.method4175(), (float)this.field30732.method4173());
    }
    
    public void method24669(final double field30736, final double field30737, final double field30738, final float field30739, final float field30740) {
        this.field30736 = field30736;
        this.field30737 = field30737;
        this.field30738 = field30738;
        this.field30733 = field30739;
        this.field30734 = field30740;
        this.field30735 = true;
    }
    
    public void method24665() {
        if (this.method24670()) {
            this.field30732.field2400 = 0.0f;
        }
        if (!this.field30735) {
            this.field30732.field2953 = this.method24677(this.field30732.field2953, this.field30732.field2951, 10.0f);
        }
        else {
            this.field30735 = false;
            this.field30732.field2953 = this.method24677(this.field30732.field2953, this.method24676(), this.field30733);
            this.field30732.field2400 = this.method24677(this.field30732.field2400, this.method24675(), this.field30734);
        }
        if (!this.field30732.method4150().method24731()) {
            this.field30732.field2953 = MathHelper.method35672(this.field30732.field2953, this.field30732.field2951, (float)this.field30732.method4174());
        }
    }
    
    public boolean method24670() {
        return true;
    }
    
    public boolean method24671() {
        return this.field30735;
    }
    
    public double method24672() {
        return this.field30736;
    }
    
    public double method24673() {
        return this.field30737;
    }
    
    public double method24674() {
        return this.field30738;
    }
    
    public float method24675() {
        final double n = this.field30736 - this.field30732.getPosX();
        final double n2 = this.field30737 - this.field30732.method1944();
        final double n3 = this.field30738 - this.field30732.getPosZ();
        return (float)(-(MathHelper.method35693(n2, MathHelper.sqrt(n * n + n3 * n3)) * 57.2957763671875));
    }
    
    public float method24676() {
        return (float)(MathHelper.method35693(this.field30738 - this.field30732.getPosZ(), this.field30736 - this.field30732.getPosX()) * 57.2957763671875) - 90.0f;
    }
    
    public float method24677(final float n, final float n2, final float n3) {
        return n + MathHelper.clamp(MathHelper.method35670(n, n2), -n3, n3);
    }
    
    private static double method24678(final Entity class399) {
        return (class399 instanceof Class511) ? class399.method1944() : ((class399.method1886().field25074 + class399.method1886().field25077) / 2.0);
    }
}
