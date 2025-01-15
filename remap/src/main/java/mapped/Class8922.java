// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import java.util.function.Function;

public class Class8922<T> extends Class8923<T>
{
    private static String[] field37507;
    public Class8134<T> field37508;
    private final Function<T, Stream<String>> field37509;
    
    public Class8922(final Function<T, Stream<String>> field37509, final Function<T, Stream<Class1932>> function) {
        super(function);
        this.field37508 = new Class8134<T>();
        this.field37509 = field37509;
    }
    
    @Override
    public void method31454() {
        this.field37508 = new Class8134<T>();
        super.method31454();
        this.field37508.method26805();
    }
    
    @Override
    public void method31455(final T t) {
        super.method31455(t);
        this.field37509.apply(t).forEach(s -> this.field37508.method26804((T)o, s.toLowerCase(Locale.ROOT)));
    }
    
    @Override
    public List<T> method31456(final String s) {
        final int index = s.indexOf(58);
        if (index >= 0) {
            final List<T> method26809 = this.field37511.method26809(s.substring(0, index).trim());
            final String trim = s.substring(index + 1).trim();
            return Lists.newArrayList((Iterator)new Class7250((Iterator<Object>)method26809.iterator(), (Iterator<Object>)new Class7249((Iterator<Object>)this.field37512.method26809(trim).iterator(), (Iterator<Object>)this.field37508.method26809(trim).iterator(), this::method31460), this::method31460));
        }
        return this.field37508.method26809(s);
    }
}
