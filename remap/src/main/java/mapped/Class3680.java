// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public abstract class Class3680 implements Class3662<Class446>
{
    public final Class8976<?> field16974;
    public final ResourceLocation field16975;
    public final String field16976;
    public final Class120 field16977;
    public final ItemStack field16978;
    public final float field16979;
    public final int field16980;
    
    public Class3680(final Class8976<?> field16974, final ResourceLocation field16975, final String field16976, final Class120 field16977, final ItemStack field16978, final float field16979, final int field16980) {
        this.field16974 = field16974;
        this.field16975 = field16975;
        this.field16976 = field16976;
        this.field16977 = field16977;
        this.field16978 = field16978;
        this.field16979 = field16979;
        this.field16980 = field16980;
    }
    
    @Override
    public boolean method11289(final Class446 class446, final World class447) {
        return this.field16977.test(class446.method2157(0));
    }
    
    @Override
    public ItemStack method11290(final Class446 class446) {
        return this.field16978.method27641();
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return true;
    }
    
    @Override
    public Class2265<Class120> method11294() {
        final Class2265<Object> method8506 = Class2265.method8506();
        method8506.add(this.field16977);
        return (Class2265<Class120>)method8506;
    }
    
    public float method11328() {
        return this.field16979;
    }
    
    @Override
    public ItemStack method11292() {
        return this.field16978;
    }
    
    @Override
    public String method11296() {
        return this.field16976;
    }
    
    public int method11329() {
        return this.field16980;
    }
    
    @Override
    public ResourceLocation method11298() {
        return this.field16975;
    }
    
    @Override
    public Class8976<?> method11300() {
        return this.field16974;
    }
}
