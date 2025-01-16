// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public abstract class Class3685 implements Class3662<Class446>
{
    public final Class120 field16985;
    public final ItemStack field16986;
    private final Class8976<?> field16987;
    private final Class6096<?> field16988;
    public final ResourceLocation field16989;
    public final String field16990;
    
    public Class3685(final Class8976<?> field16987, final Class6096<?> field16988, final ResourceLocation field16989, final String field16990, final Class120 field16991, final ItemStack field16992) {
        this.field16987 = field16987;
        this.field16988 = field16988;
        this.field16989 = field16989;
        this.field16990 = field16990;
        this.field16985 = field16991;
        this.field16986 = field16992;
    }
    
    @Override
    public Class8976<?> method11300() {
        return this.field16987;
    }
    
    @Override
    public Class6096<?> method11299() {
        return this.field16988;
    }
    
    @Override
    public ResourceLocation method11298() {
        return this.field16989;
    }
    
    @Override
    public String method11296() {
        return this.field16990;
    }
    
    @Override
    public ItemStack method11292() {
        return this.field16986;
    }
    
    @Override
    public Class2265<Class120> method11294() {
        final Class2265<Object> method8506 = Class2265.method8506();
        method8506.add(this.field16985);
        return (Class2265<Class120>)method8506;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return true;
    }
    
    @Override
    public ItemStack method11290(final Class446 class446) {
        return this.field16986.method27641();
    }
}
