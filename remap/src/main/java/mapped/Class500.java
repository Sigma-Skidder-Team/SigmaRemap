// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import javax.annotation.Nullable;

public class Class500 extends TileEntity
{
    private boolean field2859;
    private boolean field2860;
    private boolean field2861;
    private boolean field2862;
    private final Class865 field2863;
    
    public Class500() {
        super(Class5412.field22562);
        this.field2863 = new Class867(this);
    }
    
    @Override
    public CompoundNBT method2180(final CompoundNBT class51) {
        super.method2180(class51);
        this.field2863.method5209(class51);
        class51.putBoolean("powered", this.method2541());
        class51.putBoolean("conditionMet", this.method2546());
        class51.putBoolean("auto", this.method2542());
        return class51;
    }
    
    @Override
    public void method2179(final CompoundNBT class51) {
        super.method2179(class51);
        this.field2863.method5210(class51);
        this.field2859 = class51.getBoolean("powered");
        this.field2861 = class51.getBoolean("conditionMet");
        this.method2543(class51.getBoolean("auto"));
    }
    
    @Nullable
    @Override
    public Class4357 method2195() {
        if (!this.method2548()) {
            return null;
        }
        this.method2549(false);
        return new Class4357(this.field2657, 2, this.method2180(new CompoundNBT()));
    }
    
    @Override
    public boolean method2178() {
        return true;
    }
    
    public Class865 method2539() {
        return this.field2863;
    }
    
    public void method2540(final boolean field2859) {
        this.field2859 = field2859;
    }
    
    public boolean method2541() {
        return this.field2859;
    }
    
    public boolean method2542() {
        return this.field2860;
    }
    
    public void method2543(final boolean field2860) {
        final boolean field2861 = this.field2860;
        this.field2860 = field2860;
        if (!field2861) {
            if (field2860) {
                if (!this.field2859) {
                    if (this.field2656 != null) {
                        if (this.method2550() != Class2182.field12921) {
                            this.method2545();
                        }
                    }
                }
            }
        }
    }
    
    public void method2544() {
        if (this.method2550() == Class2182.field12922) {
            if (this.field2859 || this.field2860) {
                if (this.field2656 != null) {
                    this.method2545();
                }
            }
        }
    }
    
    private void method2545() {
        final Block method21696 = this.method2194().getBlock();
        if (method21696 instanceof Class3953) {
            this.method2547();
            this.field2656.method6833().method21345(this.field2657, method21696, method21696.method11826(this.field2656));
        }
    }
    
    public boolean method2546() {
        return this.field2861;
    }
    
    public boolean method2547() {
        this.field2861 = true;
        if (this.method2551()) {
            final BlockPos method1149 = this.field2657.method1149(this.field2656.getBlockState(this.field2657).method21772((IProperty<Direction>)Class3953.field17853).getOpposite());
            if (!(this.field2656.getBlockState(method1149).method21696() instanceof Class3953)) {
                this.field2861 = false;
            }
            else {
                final TileEntity method1150 = this.field2656.getTileEntity(method1149);
                this.field2861 = (method1150 instanceof Class500 && ((Class500)method1150).method2539().method5206() > 0);
            }
        }
        return this.field2861;
    }
    
    public boolean method2548() {
        return this.field2862;
    }
    
    public void method2549(final boolean field2862) {
        this.field2862 = field2862;
    }
    
    public Class2182 method2550() {
        final Block method21696 = this.method2194().getBlock();
        if (method21696 == Blocks.field29416) {
            return Class2182.field12923;
        }
        if (method21696 != Blocks.REPEATING_COMMAND_BLOCK) {
            return (method21696 != Blocks.CHAIN_COMMAND_BLOCK) ? Class2182.field12923 : Class2182.field12921;
        }
        return Class2182.field12922;
    }
    
    public boolean method2551() {
        final BlockState method6701 = this.field2656.getBlockState(this.getPos());
        return method6701.getBlock() instanceof Class3953 && method6701.get((IProperty<Boolean>)Class3953.field17854);
    }
    
    @Override
    public void method2199() {
        this.method2201();
        super.method2199();
    }
}
