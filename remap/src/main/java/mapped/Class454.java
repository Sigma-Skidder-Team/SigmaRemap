// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.function.Predicate;

public class Class454 extends Class433 implements Class453
{
    private boolean field2704;
    private int field2705;
    private final BlockPos field2706;
    
    public Class454(final EntityType<? extends Class454> class7499, final World class7500) {
        super(class7499, class7500);
        this.field2704 = true;
        this.field2705 = -1;
        this.field2706 = BlockPos.ZERO;
    }
    
    public Class454(final World class1847, final double n, final double n2, final double n3) {
        super(EntityType.field29003, n, n2, n3, class1847);
        this.field2704 = true;
        this.field2705 = -1;
        this.field2706 = BlockPos.ZERO;
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12029;
    }
    
    @Override
    public BlockState method2141() {
        return Blocks.field29475.getDefaultState();
    }
    
    @Override
    public int method2143() {
        return 1;
    }
    
    @Override
    public int getSizeInventory() {
        return 5;
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        final boolean b2 = !b;
        if (b2 != this.method2289()) {
            this.method2290(b2);
        }
    }
    
    public boolean method2289() {
        return this.field2704;
    }
    
    public void method2290(final boolean field2704) {
        this.field2704 = field2704;
    }
    
    @Override
    public World method2186() {
        return this.world;
    }
    
    @Override
    public double method2286() {
        return this.getPosX();
    }
    
    @Override
    public double method2287() {
        return this.getPosY() + 0.5;
    }
    
    @Override
    public double method2288() {
        return this.getPosZ();
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.world.isRemote) {
            if (this.isAlive()) {
                if (this.method2289()) {
                    if (!new BlockPos(this).equals(this.field2706)) {
                        this.method2292(0);
                    }
                    else {
                        --this.field2705;
                    }
                    if (!this.method2293()) {
                        this.method2292(0);
                        if (this.method2291()) {
                            this.method2292(4);
                            this.method2161();
                        }
                    }
                }
            }
        }
    }
    
    public boolean method2291() {
        if (!Class455.method2300(this)) {
            final List<Entity> method6739 = this.world.method6739(Class427.class, this.getBoundingBox().grow(0.25, 0.0, 0.25), Class9170.field38845);
            if (!method6739.isEmpty()) {
                Class455.method2302(this, (Class427)method6739.get(0));
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method2123(final DamageSource class7929) {
        super.method2123(class7929);
        if (this.world.method6765().method31216(Class8878.field37321)) {
            this.method1764(Blocks.field29475);
        }
    }
    
    @Override
    public void method1761(final CompoundNBT class51) {
        super.method1761(class51);
        class51.putInt("TransferCooldown", this.field2705);
        class51.putBoolean("Enabled", this.field2704);
    }
    
    @Override
    public void method1760(final CompoundNBT class51) {
        super.method1760(class51);
        this.field2705 = class51.getInt("TransferCooldown");
        this.field2704 = (!class51.contains("Enabled") || class51.getBoolean("Enabled"));
    }
    
    public void method2292(final int field2705) {
        this.field2705 = field2705;
    }
    
    public boolean method2293() {
        return this.field2705 > 0;
    }
    
    @Override
    public Class3418 method2167(final int n, final Class464 class464) {
        return new Class3437(n, class464, this);
    }
}
