// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import javax.annotation.Nullable;
import java.util.Collections;
import java.util.Collection;
import java.util.stream.Stream;
import java.util.Iterator;
import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import java.util.Comparator;
import com.google.common.collect.Sets;
import java.util.function.Consumer;
import java.util.List;
import java.util.Queue;
import java.util.TreeSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class Class6953<T> implements Class6952<T>
{
    public final Predicate<T> field27219;
    private final Function<T, Class1932> field27220;
    private final Function<Class1932, T> field27221;
    private final Set<Class7460<T>> field27222;
    private final TreeSet<Class7460<T>> field27223;
    private final Class1849 field27224;
    private final Queue<Class7460<T>> field27225;
    private final List<Class7460<T>> field27226;
    private final Consumer<Class7460<T>> field27227;
    
    public Class6953(final Class1849 field27224, final Predicate<T> field27225, final Function<T, Class1932> field27226, final Function<Class1932, T> field27227, final Consumer<Class7460<T>> field27228) {
        this.field27222 = Sets.newHashSet();
        this.field27223 = Sets.newTreeSet((Comparator)Class7460.method22979());
        this.field27225 = Queues.newArrayDeque();
        this.field27226 = Lists.newArrayList();
        this.field27219 = field27225;
        this.field27220 = field27226;
        this.field27221 = field27227;
        this.field27224 = field27224;
        this.field27227 = field27228;
    }
    
    public void method21346() {
        int size = this.field27223.size();
        if (size != this.field27222.size()) {
            throw new IllegalStateException("TickNextTick list out of synch");
        }
        if (size > 65536) {
            size = 65536;
        }
        final Class1909 method6904 = this.field27224.method6904();
        final Iterator<Class7460<T>> iterator = this.field27223.iterator();
        this.field27224.method6796().method15297("cleaning");
        while (size > 0 && iterator.hasNext()) {
            final Class7460 class7460 = iterator.next();
            if (class7460.field28775 > this.field27224.method6754()) {
                break;
            }
            if (!method6904.method7410(class7460.field28774)) {
                continue;
            }
            iterator.remove();
            this.field27222.remove(class7460);
            this.field27225.add(class7460);
            --size;
        }
        this.field27224.method6796().method15300("ticking");
        Class7460 class7461;
        while ((class7461 = this.field27225.poll()) != null) {
            if (method6904.method7410(class7461.field28774)) {
                try {
                    this.field27226.add(class7461);
                    this.field27227.accept(class7461);
                    continue;
                }
                catch (final Throwable t) {
                    final Class7689 method6905 = Class7689.method24421(t, "Exception while ticking");
                    Class5204.method16304(method6905.method24418("Block being ticked"), class7461.field28774, null);
                    throw new Class2365(method6905);
                }
            }
            this.method21345(class7461.field28774, (T)class7461.method22980(), 0);
        }
        this.field27224.method6796().method15299();
        this.field27226.clear();
        this.field27225.clear();
    }
    
    @Override
    public boolean method21342(final BlockPos class354, final T t) {
        return this.field27225.contains(new Class7460(class354, t));
    }
    
    @Override
    public void method21343(final Stream<Class7460<T>> stream) {
        stream.forEach(this::method21353);
    }
    
    public List<Class7460<T>> method21347(final Class7859 class7859, final boolean b, final boolean b2) {
        final int n = (class7859.field32290 << 4) - 2;
        final int n2 = n + 16 + 2;
        final int n3 = (class7859.field32291 << 4) - 2;
        return this.method21348(new MutableBoundingBox(n, 0, n3, n2, 256, n3 + 16 + 2), b, b2);
    }
    
    public List<Class7460<T>> method21348(final MutableBoundingBox class6997, final boolean b, final boolean b2) {
        final List<Class7460<T>> method21349 = this.method21349(null, this.field27223, class6997, b);
        if (b) {
            if (method21349 != null) {
                this.field27222.removeAll(method21349);
            }
        }
        List<Class7460<T>> list = this.method21349(method21349, this.field27225, class6997, b);
        if (!b2) {
            list = this.method21349(list, this.field27226, class6997, b);
        }
        return (List<Class7460<T>>)((list != null) ? list : Collections.emptyList());
    }
    
    @Nullable
    private List<Class7460<T>> method21349(List<Class7460<T>> arrayList, final Collection<Class7460<T>> collection, final MutableBoundingBox class6997, final boolean b) {
        final Iterator<Class7460<T>> iterator = collection.iterator();
        while (iterator.hasNext()) {
            final Class7460 class6998 = iterator.next();
            final BlockPos field28774 = class6998.field28774;
            if (field28774.getX() < class6997.minX) {
                continue;
            }
            if (field28774.getX() >= class6997.maxX) {
                continue;
            }
            if (field28774.getZ() < class6997.minZ) {
                continue;
            }
            if (field28774.getZ() >= class6997.maxZ) {
                continue;
            }
            if (b) {
                iterator.remove();
            }
            if (arrayList == null) {
                arrayList = Lists.newArrayList();
            }
            arrayList.add(class6998);
        }
        return arrayList;
    }
    
    public void method21350(final MutableBoundingBox class6997, final BlockPos class6998) {
        for (final Class7460 class6999 : this.method21348(class6997, false, false)) {
            if (!class6997.isVecInside(class6999.field28774)) {
                continue;
            }
            this.method21353(new Class7460<T>(class6999.field28774.add(class6998), class6999.method22980(), class6999.field28775, class6999.field28776));
        }
    }
    
    public Class52 method21351(final Class7859 class7859) {
        return method21352(this.field27220, this.method21347(class7859, false, true), this.field27224.method6754());
    }
    
    public static <T> Class52 method21352(final Function<T, Class1932> function, final Iterable<Class7460<T>> iterable, final long n) {
        final Class52 class52 = new Class52();
        for (final Class7460 class53 : iterable) {
            final Class51 e = new Class51();
            e.method306("i", function.apply((T)class53.method22980()).toString());
            e.method298("x", class53.field28774.getX());
            e.method298("y", class53.field28774.getY());
            e.method298("z", class53.field28774.getZ());
            e.method298("t", (int)(class53.field28775 - n));
            e.method298("p", class53.field28776.method7941());
            ((AbstractList<Class51>)class52).add(e);
        }
        return class52;
    }
    
    @Override
    public boolean method21340(final BlockPos class354, final T t) {
        return this.field27222.contains(new Class7460(class354, t));
    }
    
    @Override
    public void method21341(final BlockPos class354, final T t, final int n, final Class1955 class355) {
        if (!this.field27219.test(t)) {
            this.method21353(new Class7460<T>(class354, t, n + this.field27224.method6754(), class355));
        }
    }
    
    private void method21353(final Class7460<T> e) {
        if (!this.field27222.contains(e)) {
            this.field27222.add(e);
            this.field27223.add(e);
        }
    }
    
    public int method21354() {
        return this.field27222.size();
    }
}
