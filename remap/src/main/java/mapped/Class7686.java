// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import javax.annotation.Nullable;
import com.mojang.datafixers.util.Pair;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Collection;
import java.util.Objects;
import java.util.Iterator;
import java.util.HashSet;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.List;

public class Class7686 implements Class7684
{
    private static String[] field30527;
    private final Class9104<Class3833, Class7096> field30528;
    private final List<Class8997> field30529;
    
    public Class7686(final Class9104<Class3833, Class7096> field30528, final List<Class8997> field30529) {
        this.field30528 = field30528;
        this.field30529 = field30529;
    }
    
    public List<Class8997> method24404() {
        return this.field30529;
    }
    
    public Set<Class7683> method24405() {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<Class8997> iterator = this.field30529.iterator();
        while (iterator.hasNext()) {
            hashSet.add(iterator.next().method32115());
        }
        return hashSet;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class7686) {
            final Class7686 class7686 = (Class7686)o;
            return Objects.equals(this.field30528, class7686.field30528) && Objects.equals(this.field30529, class7686.field30529);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field30528, this.field30529);
    }
    
    @Override
    public Collection<Class1932> method24381() {
        return this.method24404().stream().flatMap(class8997 -> class8997.method32115().method24381().stream()).collect((Collector<? super Object, ?, Collection<Class1932>>)Collectors.toSet());
    }
    
    @Override
    public Collection<Class3687> method24382(final Function<Class1932, Class7684> function, final Set<Pair<String, String>> set) {
        return this.method24404().stream().flatMap(class8997 -> class8997.method32115().method24382(function2, set2).stream()).collect((Collector<? super Object, ?, Collection<Class3687>>)Collectors.toSet());
    }
    
    @Nullable
    @Override
    public Class6313 method24383(final Class7637 class7637, final Function<Class3687, Class1912> function, final Class2123 class7638, final Class1932 class7639) {
        final Class7897 class7640 = new Class7897();
        for (final Class8997 class7641 : this.method24404()) {
            final Class6313 method24383 = class7641.method32115().method24383(class7637, function, class7638, class7639);
            if (method24383 == null) {
                continue;
            }
            class7640.method25563(class7641.method32116(this.field30528), method24383);
        }
        return class7640.method25564();
    }
}
