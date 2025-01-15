// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.HashMultimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import com.google.common.collect.Multimap;

public class Class7790
{
    private final Multimap<String, String> field31878;
    private final Supplier<String> field31879;
    private final Class8212 field31880;
    private final Function<Class1932, Class122> field31881;
    private final Set<Class1932> field31882;
    private final Function<Class1932, Class9317> field31883;
    private final Set<Class1932> field31884;
    private String field31885;
    
    public Class7790(final Class8212 class8212, final Function<Class1932, Class122> function, final Function<Class1932, Class9317> function2) {
        this((Multimap<String, String>)HashMultimap.create(), () -> "", class8212, function, (Set<Class1932>)ImmutableSet.of(), function2, (Set<Class1932>)ImmutableSet.of());
    }
    
    public Class7790(final Multimap<String, String> field31878, final Supplier<String> field31879, final Class8212 field31880, final Function<Class1932, Class122> field31881, final Set<Class1932> field31882, final Function<Class1932, Class9317> field31883, final Set<Class1932> field31884) {
        this.field31878 = field31878;
        this.field31879 = field31879;
        this.field31880 = field31880;
        this.field31881 = field31881;
        this.field31882 = field31882;
        this.field31883 = field31883;
        this.field31884 = field31884;
    }
    
    private String method25013() {
        if (this.field31885 == null) {
            this.field31885 = this.field31879.get();
        }
        return this.field31885;
    }
    
    public void method25014(final String s) {
        this.field31878.put((Object)this.method25013(), (Object)s);
    }
    
    public Class7790 method25015(final String s) {
        return new Class7790(this.field31878, () -> this.method25013() + str, this.field31880, this.field31881, this.field31882, this.field31883, this.field31884);
    }
    
    public Class7790 method25016(final String s, final Class1932 class1932) {
        return new Class7790(this.field31878, () -> this.method25013() + str, this.field31880, this.field31881, this.field31882, this.field31883, (Set<Class1932>)ImmutableSet.builder().addAll((Iterable)this.field31884).add((Object)class1932).build());
    }
    
    public Class7790 method25017(final String s, final Class1932 class1932) {
        return new Class7790(this.field31878, () -> this.method25013() + str, this.field31880, this.field31881, (Set<Class1932>)ImmutableSet.builder().addAll((Iterable)this.field31882).add((Object)class1932).build(), this.field31883, this.field31884);
    }
    
    public boolean method25018(final Class1932 class1932) {
        return this.field31884.contains(class1932);
    }
    
    public boolean method25019(final Class1932 class1932) {
        return this.field31882.contains(class1932);
    }
    
    public Multimap<String, String> method25020() {
        return (Multimap<String, String>)ImmutableMultimap.copyOf((Multimap)this.field31878);
    }
    
    public void method25021(final Class124 class124) {
        this.field31880.method27205(this, class124);
    }
    
    @Nullable
    public Class9317 method25022(final Class1932 class1932) {
        return this.field31883.apply(class1932);
    }
    
    @Nullable
    public Class122 method25023(final Class1932 class1932) {
        return this.field31881.apply(class1932);
    }
    
    public Class7790 method25024(final Class8212 class8212) {
        return new Class7790(this.field31878, this.field31879, class8212, this.field31881, this.field31882, this.field31883, this.field31884);
    }
}
