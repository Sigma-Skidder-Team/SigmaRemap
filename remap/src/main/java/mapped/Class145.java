// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collection;
import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;

import java.util.List;

public class Class145 extends Class126
{
    private final List<Class6368> field428;
    
    private Class145(final Class122[] array, final List<Class6368> list) {
        super(array);
        this.field428 = (List<Class6368>)ImmutableList.copyOf((Collection)list);
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        if (!class8321.method27620()) {
            final Class2265<Object> method8506 = (Class2265<Object>)Class2265.method8506();
            this.field428.forEach(class8325 -> class8325.method19016(class8324, class8328 -> class8328.method21974(Class9317.method34482(class8326::add), class8327)));
            final CompoundNBT class8323 = new CompoundNBT();
            Class8508.method28424(class8323, (Class2265<ItemStack>)method8506);
            final CompoundNBT method8507 = class8321.method27658();
            method8507.put("BlockEntityTag", class8323.merge(method8507.getCompound("BlockEntityTag")));
            return class8321;
        }
        return class8321;
    }
    
    @Override
    public void method636(final Class7790 class7790) {
        super.method636(class7790);
        for (int i = 0; i < this.field428.size(); ++i) {
            this.field428.get(i).method19015(class7790.method25015(".entry[" + i + "]"));
        }
    }
    
    public static Class4958 method702() {
        return new Class4958();
    }
}
