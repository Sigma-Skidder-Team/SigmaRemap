// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public interface Class3662<C extends Class446>
{
    boolean method11289(final C p0, final World p1);
    
    ItemStack method11290(final C p0);
    
    boolean method11291(final int p0, final int p1);
    
    ItemStack method11292();
    
    default Class2265<ItemStack> method11293(final C c) {
        final Class2265<ItemStack> method8507 = Class2265.method8507(c.method2239(), ItemStack.field34174);
        for (int i = 0; i < method8507.size(); ++i) {
            final Class3820 method8508 = c.method2157(i).method27622();
            if (method8508.method11721()) {
                method8507.set(i, new ItemStack(method8508.method11720()));
            }
        }
        return method8507;
    }
    
    default Class2265<Class120> method11294() {
        return Class2265.method8506();
    }
    
    default boolean method11295() {
        return false;
    }
    
    default String method11296() {
        return "";
    }
    
    default ItemStack method11297() {
        return new ItemStack(Class7521.field29296);
    }
    
    Class1932 method11298();
    
    Class6096<?> method11299();
    
    Class8976<?> method11300();
}
