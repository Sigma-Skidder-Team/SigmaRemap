// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.util.HashSet;
import java.util.Collection;
import com.google.common.collect.Sets;
import com.google.common.collect.Maps;
import java.util.UUID;
import java.util.Set;
import java.util.Map;

public class Class7620 implements Class7619
{
    private final Class6821 field30186;
    private final Class8725 field30187;
    private final Map<Class2157, Set<Class7919>> field30188;
    private final Map<String, Set<Class7919>> field30189;
    private final Map<UUID, Class7919> field30190;
    private double field30191;
    private boolean field30192;
    private double field30193;
    
    public Class7620(final Class6821 field30186, final Class8725 field30187) {
        this.field30188 = Maps.newEnumMap((Class)Class2157.class);
        this.field30189 = Maps.newHashMap();
        this.field30190 = Maps.newHashMap();
        this.field30192 = true;
        this.field30186 = field30186;
        this.field30187 = field30187;
        this.field30191 = field30187.method29979();
        final Class2157[] values = Class2157.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.field30188.put(values[i], Sets.newHashSet());
        }
    }
    
    @Override
    public Class8725 method23939() {
        return this.field30187;
    }
    
    @Override
    public double method23940() {
        return this.field30191;
    }
    
    @Override
    public void method23941(final double field30191) {
        if (field30191 != this.method23940()) {
            this.field30191 = field30191;
            this.method23952();
        }
    }
    
    @Override
    public Set<Class7919> method23942(final Class2157 class2157) {
        return this.field30188.get(class2157);
    }
    
    @Override
    public Set<Class7919> method23943() {
        final HashSet hashSet = Sets.newHashSet();
        final Class2157[] values = Class2157.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            hashSet.addAll(this.method23942(values[i]));
        }
        return hashSet;
    }
    
    @Nullable
    @Override
    public Class7919 method23945(final UUID uuid) {
        return this.field30190.get(uuid);
    }
    
    @Override
    public boolean method23944(final Class7919 class7919) {
        return this.field30190.get(class7919.method25635()) != null;
    }
    
    @Override
    public void method23946(final Class7919 class7919) {
        if (this.method23945(class7919.method25635()) == null) {
            final Set set = this.field30189.computeIfAbsent(class7919.method25636(), p0 -> Sets.newHashSet());
            this.field30188.get(class7919.method25637()).add(class7919);
            set.add(class7919);
            this.field30190.put(class7919.method25635(), class7919);
            this.method23952();
            return;
        }
        throw new IllegalArgumentException("Modifier is already applied on this attribute!");
    }
    
    public void method23952() {
        this.field30192 = true;
        this.field30186.method20875(this);
    }
    
    @Override
    public void method23947(final Class7919 class7919) {
        final Class2157[] values = Class2157.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            this.field30188.get(values[i]).remove(class7919);
        }
        final Set set = this.field30189.get(class7919.method25636());
        if (set != null) {
            set.remove(class7919);
            if (set.isEmpty()) {
                this.field30189.remove(class7919.method25636());
            }
        }
        this.field30190.remove(class7919.method25635());
        this.method23952();
    }
    
    @Override
    public void method23948(final UUID uuid) {
        final Class7919 method23945 = this.method23945(uuid);
        if (method23945 != null) {
            this.method23947(method23945);
        }
    }
    
    @Override
    public void method23949() {
        final Set<Class7919> method23943 = this.method23943();
        if (method23943 != null) {
            final Iterator iterator = Lists.newArrayList((Iterable)method23943).iterator();
            while (iterator.hasNext()) {
                this.method23947((Class7919)iterator.next());
            }
        }
    }
    
    @Override
    public double method23950() {
        if (this.field30192) {
            this.field30193 = this.method23953();
            this.field30192 = false;
        }
        return this.field30193;
    }
    
    private double method23953() {
        double method23940 = this.method23940();
        final Iterator<Class7919> iterator = this.method23954(Class2157.field12809).iterator();
        while (iterator.hasNext()) {
            method23940 += iterator.next().method25638();
        }
        double n = method23940;
        final Iterator<Class7919> iterator2 = this.method23954(Class2157.field12810).iterator();
        while (iterator2.hasNext()) {
            n += method23940 * iterator2.next().method25638();
        }
        final Iterator<Class7919> iterator3 = this.method23954(Class2157.field12811).iterator();
        while (iterator3.hasNext()) {
            n *= 1.0 + iterator3.next().method25638();
        }
        return this.field30187.method29977(n);
    }
    
    private Collection<Class7919> method23954(final Class2157 class2157) {
        final HashSet hashSet = Sets.newHashSet((Iterable)this.method23942(class2157));
        for (Class8725 class2158 = this.field30187.method29982(); class2158 != null; class2158 = class2158.method29982()) {
            final Class7619 method20879 = this.field30186.method20879(class2158);
            if (method20879 != null) {
                hashSet.addAll(method20879.method23942(class2157));
            }
        }
        return hashSet;
    }
}
