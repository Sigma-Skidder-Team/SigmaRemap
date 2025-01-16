// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.function.Function;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

import java.util.List;

public class Class140 extends Class126
{
    private final boolean field417;
    private final List<ITextComponent> field418;
    private final Class2065 field419;
    
    public Class140(final Class122[] array, final boolean field417, final List<ITextComponent> list, final Class2065 field418) {
        super(array);
        this.field417 = field417;
        this.field418 = (List<ITextComponent>)ImmutableList.copyOf((Collection)list);
        this.field419 = field418;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)((this.field419 == null) ? ImmutableSet.of() : ImmutableSet.of((Object)this.field419.method8153()));
    }
    
    @Override
    public ItemStack method639(final ItemStack class8321, final Class7529 class8322) {
        final ListNBT method686 = this.method686(class8321, !this.field418.isEmpty());
        if (method686 != null) {
            if (this.field417) {
                method686.clear();
            }
            this.field418.stream().map((Function<? super Object, ?>)Class146.method706(class8322, this.field419)).map((Function<? super Object, ?>)Class5953::method17869).map((Function<? super Object, ?>) StringNBT::method290).forEach(method686::add);
        }
        return class8321;
    }
    
    @Nullable
    private ListNBT method686(final ItemStack class8321, final boolean b) {
        CompoundNBT method27657;
        if (!class8321.method27656()) {
            if (!b) {
                return null;
            }
            method27657 = new CompoundNBT();
            class8321.method27663(method27657);
        }
        else {
            method27657 = class8321.method27657();
        }
        CompoundNBT method27658;
        if (!method27657.contains("display", 10)) {
            if (!b) {
                return null;
            }
            method27658 = new CompoundNBT();
            method27657.put("display", method27658);
        }
        else {
            method27658 = method27657.getCompound("display");
        }
        if (method27658.contains("Lore", 9)) {
            return method27658.getList("Lore", 8);
        }
        if (!b) {
            return null;
        }
        final ListNBT class8322 = new ListNBT();
        method27658.put("Lore", class8322);
        return class8322;
    }
}
