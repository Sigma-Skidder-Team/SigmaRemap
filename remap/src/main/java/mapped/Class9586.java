// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.util.Set;
import java.util.List;

public class Class9586
{
    private static String[] field41791;
    private final List<Class3662<?>> field41792;
    private final Set<Class3662<?>> field41793;
    private final Set<Class3662<?>> field41794;
    private final Set<Class3662<?>> field41795;
    private boolean field41796;
    
    public Class9586() {
        this.field41792 = Lists.newArrayList();
        this.field41793 = Sets.newHashSet();
        this.field41794 = Sets.newHashSet();
        this.field41795 = Sets.newHashSet();
        this.field41796 = true;
    }
    
    public boolean method35939() {
        return !this.field41795.isEmpty();
    }
    
    public void method35940(final Class6521 class6521) {
        for (final Class3662 class6522 : this.field41792) {
            if (!class6521.method19695(class6522)) {
                continue;
            }
            this.field41795.add(class6522);
        }
    }
    
    public void method35941(final Class5024 class5024, final int n, final int n2, final Class6521 class5025) {
        for (int i = 0; i < this.field41792.size(); ++i) {
            final Class3662 class5026 = this.field41792.get(i);
            final boolean b = class5026.method11291(n, n2) && class5025.method19695(class5026);
            if (!b) {
                this.field41794.remove(class5026);
            }
            else {
                this.field41794.add(class5026);
            }
            if (b && class5024.method15249(class5026, null)) {
                this.field41793.add(class5026);
            }
            else {
                this.field41793.remove(class5026);
            }
        }
    }
    
    public boolean method35942(final Class3662<?> class3662) {
        return this.field41793.contains(class3662);
    }
    
    public boolean method35943() {
        return !this.field41793.isEmpty();
    }
    
    public boolean method35944() {
        return !this.field41794.isEmpty();
    }
    
    public List<Class3662<?>> method35945() {
        return this.field41792;
    }
    
    public List<Class3662<?>> method35946(final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        final Set<Class3662<?>> set = b ? this.field41793 : this.field41794;
        for (final Class3662 class3662 : this.field41792) {
            if (!set.contains(class3662)) {
                continue;
            }
            arrayList.add(class3662);
        }
        return arrayList;
    }
    
    public List<Class3662<?>> method35947(final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class3662 class3662 : this.field41792) {
            if (!this.field41794.contains(class3662)) {
                continue;
            }
            if (this.field41793.contains(class3662) != b) {
                continue;
            }
            arrayList.add(class3662);
        }
        return arrayList;
    }
    
    public void method35948(final Class3662<?> class3662) {
        this.field41792.add(class3662);
        if (this.field41796) {
            final ItemStack method11292 = this.field41792.get(0).method11292();
            final ItemStack method11293 = class3662.method11292();
            this.field41796 = (ItemStack.method27645(method11292, method11293) && ItemStack.method27642(method11292, method11293));
        }
    }
    
    public boolean method35949() {
        return this.field41796;
    }
}
