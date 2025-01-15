// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import com.google.common.collect.ImmutableList;
import java.util.function.Function;
import java.util.Collection;
import java.util.Objects;
import java.util.List;

public class Class9593
{
    private static String[] field41816;
    private final List<Class7684> field41817;
    private final List<Object> field41818;
    
    public Class9593(final List<Class7684> field41817, final List<Object> field41818) {
        this.field41817 = field41817;
        this.field41818 = field41818;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class9593) {
            final Class9593 class9593 = (Class9593)o;
            return Objects.equals(this.field41817, class9593.field41817) && Objects.equals(this.field41818, class9593.field41818);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return 31 * this.field41817.hashCode() + this.field41818.hashCode();
    }
    
    public static Class9593 method35977(final Class7096 class7098, final Class7686 class7097, final Collection<Class7111<?>> collection) {
        return new Class9593(class7097.method24404().stream().filter(class7101 -> {
            class7098.method21696().method11876();
            return class7101.method32116(class7099).test(class7100);
        }).map((Function<? super Object, ?>)Class8997::method32115).collect((Collector<? super Object, Object, List<Class7684>>)ImmutableList.toImmutableList()), method35979(class7098, collection));
    }
    
    public static Class9593 method35978(final Class7096 class7096, final Class7684 class7097, final Collection<Class7111<?>> collection) {
        return new Class9593((List<Class7684>)ImmutableList.of((Object)class7097), method35979(class7096, collection));
    }
    
    private static List<Object> method35979(final Class7096 class7096, final Collection<Class7111<?>> collection) {
        return collection.stream().map((Function<? super Class7111<?>, ?>)class7096::method21772).collect((Collector<? super Object, Object, List<Object>>)ImmutableList.toImmutableList());
    }
}
