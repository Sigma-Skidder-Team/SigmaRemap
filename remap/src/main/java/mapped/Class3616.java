// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.EnumSet;

public class Class3616 extends Class3446
{
    private final Class840 field16812;
    private boolean field16813;
    
    public Class3616(final Class840 field16812) {
        this.field16812 = field16812;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11014() {
        return false;
    }
    
    @Override
    public boolean method11013() {
        return this.field16812.method5004() && this.field16812.getAir() >= 100;
    }
    
    @Override
    public boolean method11017() {
        final BlockPos method5003 = this.field16812.method5003();
        if (!new BlockPos(method5003.getX(), this.field16812.getPosY(), method5003.getZ()).withinDistance(this.field16812.method1934(), 4.0)) {
            if (!this.field16813) {
                if (this.field16812.getAir() >= 100) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        if (this.field16812.world instanceof Class1849) {
            final Class1849 class1849 = (Class1849)this.field16812.world;
            this.field16813 = false;
            this.field16812.method4150().method24733();
            final BlockPos class1850 = new BlockPos(this.field16812);
            final String s = (class1849.rand.nextFloat() < 0.5) ? "Shipwreck" : "Ocean_Ruin";
            final BlockPos method6915 = class1849.method6915(s, class1850, 50, false);
            if (method6915 != null) {
                this.field16812.method5002(method6915);
            }
            else {
                final BlockPos method6916 = class1849.method6915(s.equals("Ocean_Ruin") ? "Shipwreck" : "Ocean_Ruin", class1850, 50, false);
                if (method6916 == null) {
                    this.field16813 = true;
                    return;
                }
                this.field16812.method5002(method6916);
            }
            class1849.method6761(this.field16812, (byte)38);
        }
    }
    
    @Override
    public void method11018() {
        final BlockPos method5003 = this.field16812.method5003();
        if (new BlockPos(method5003.getX(), this.field16812.getPosY(), method5003.getZ()).withinDistance(this.field16812.method1934(), 4.0) || this.field16813) {
            this.field16812.method5005(false);
        }
    }
    
    @Override
    public void method11016() {
        final World field2391 = this.field16812.world;
        if (this.field16812.method5010() || this.field16812.method4150().method24731()) {
            final Vec3d class5487 = new Vec3d(this.field16812.method5003());
            Vec3d class5488 = Class7775.method24906(this.field16812, 16, 1, class5487, 0.39269909262657166);
            if (class5488 == null) {
                class5488 = Class7775.method24905(this.field16812, 8, 4, class5487);
            }
            if (class5488 != null) {
                final BlockPos class5489 = new BlockPos(class5488);
                if (!field2391.getFluidState(class5489).isTagged(Class7324.field28319) || !field2391.getBlockState(class5489).method21749(field2391, class5489, Class2084.field12052)) {
                    class5488 = Class7775.method24905(this.field16812, 8, 5, class5487);
                }
            }
            if (class5488 == null) {
                this.field16813 = true;
                return;
            }
            this.field16812.method4147().method24669(class5488.x, class5488.y, class5488.z, (float)(this.field16812.method4174() + 20), (float)this.field16812.method4173());
            this.field16812.method4150().method24724(class5488.x, class5488.y, class5488.z, 1.3);
            if (field2391.rand.nextInt(80) == 0) {
                field2391.method6761(this.field16812, (byte)38);
            }
        }
    }
}
