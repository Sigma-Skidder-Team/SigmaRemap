// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Function;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.Collection;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class Class140 extends Class126
{
    private final boolean field417;
    private final List<Class2250> field418;
    private final Class2065 field419;
    
    public Class140(final Class122[] array, final boolean field417, final List<Class2250> list, final Class2065 field418) {
        super(array);
        this.field417 = field417;
        this.field418 = (List<Class2250>)ImmutableList.copyOf((Collection)list);
        this.field419 = field418;
    }
    
    @Override
    public Set<Class7915<?>> method635() {
        return (Set<Class7915<?>>)((this.field419 == null) ? ImmutableSet.of() : ImmutableSet.of((Object)this.field419.method8153()));
    }
    
    @Override
    public Class8321 method639(final Class8321 class8321, final Class7529 class8322) {
        final Class52 method686 = this.method686(class8321, !this.field418.isEmpty());
        if (method686 != null) {
            if (this.field417) {
                method686.clear();
            }
            this.field418.stream().map((Function<? super Object, ?>)Class146.method706(class8322, this.field419)).map((Function<? super Object, ?>)Class5953::method17869).map((Function<? super Object, ?>)Class50::method290).forEach(method686::add);
        }
        return class8321;
    }
    
    @Nullable
    private Class52 method686(final Class8321 class8321, final boolean b) {
        Class51 method27657;
        if (!class8321.method27656()) {
            if (!b) {
                return null;
            }
            method27657 = new Class51();
            class8321.method27663(method27657);
        }
        else {
            method27657 = class8321.method27657();
        }
        Class51 method27658;
        if (!method27657.method316("display", 10)) {
            if (!b) {
                return null;
            }
            method27658 = new Class51();
            method27657.method295("display", method27658);
        }
        else {
            method27658 = method27657.method327("display");
        }
        if (method27658.method316("Lore", 9)) {
            return method27658.method328("Lore", 8);
        }
        if (!b) {
            return null;
        }
        final Class52 class8322 = new Class52();
        method27658.method295("Lore", class8322);
        return class8322;
    }
}
