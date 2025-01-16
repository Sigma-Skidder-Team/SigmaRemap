// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public abstract class Class3467 extends Class3446
{
    public Class759 field16340;
    public BlockPos field16341;
    public boolean field16342;
    private boolean field16343;
    private float field16344;
    private float field16345;
    
    public Class3467(final Class759 field16340) {
        this.field16341 = BlockPos.ZERO;
        this.field16340 = field16340;
        if (field16340.method4150() instanceof Class7747) {
            return;
        }
        throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
    }
    
    public boolean method11033() {
        if (!this.field16342) {
            return false;
        }
        final BlockState method6701 = this.field16340.world.getBlockState(this.field16341);
        if (method6701.getBlock() instanceof Class3969) {
            return method6701.get((IProperty<Boolean>)Class3969.field17932);
        }
        return this.field16342 = false;
    }
    
    public void method11034(final boolean b) {
        if (this.field16342) {
            final BlockState method6701 = this.field16340.world.getBlockState(this.field16341);
            if (method6701.getBlock() instanceof Class3969) {
                ((Class3969)method6701.getBlock()).method12110(this.field16340.world, this.field16341, b);
            }
        }
    }
    
    @Override
    public boolean method11013() {
        if (this.field16340.collidedHorizontally) {
            final Class7747 class7747 = (Class7747)this.field16340.method4150();
            final Class9468 method24727 = class7747.method24727();
            if (method24727 != null) {
                if (!method24727.method35215()) {
                    if (class7747.method24748()) {
                        for (int i = 0; i < Math.min(method24727.method35222() + 2, method24727.method35221()); ++i) {
                            final Class6772 method24728 = method24727.method35217(i);
                            this.field16341 = new BlockPos(method24728.field26589, method24728.field26590 + 1, method24728.field26591);
                            if (this.field16340.method1733(this.field16341.getX(), this.field16340.getPosY(), this.field16341.getZ()) <= 2.25 && (this.field16342 = method11035(this.field16340.world, this.field16341))) {
                                return true;
                            }
                        }
                        this.field16341 = new BlockPos(this.field16340).method1137();
                        return this.field16342 = method11035(this.field16340.world, this.field16341);
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16343;
    }
    
    @Override
    public void method11015() {
        this.field16343 = false;
        this.field16344 = (float)(this.field16341.getX() + 0.5f - this.field16340.getPosX());
        this.field16345 = (float)(this.field16341.getZ() + 0.5f - this.field16340.getPosZ());
    }
    
    @Override
    public void method11016() {
        if (this.field16344 * (float)(this.field16341.getX() + 0.5f - this.field16340.getPosX()) + this.field16345 * (float)(this.field16341.getZ() + 0.5f - this.field16340.getPosZ()) < 0.0f) {
            this.field16343 = true;
        }
    }
    
    public static boolean method11035(final World class1847, final BlockPos class1848) {
        final BlockState method6701 = class1847.getBlockState(class1848);
        return method6701.getBlock() instanceof Class3969 && method6701.getMaterial() == Material.WOOD;
    }
}
