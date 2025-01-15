// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.StreamSupport;
import com.google.common.collect.Lists;
import java.util.stream.Stream;
import java.util.Spliterator;
import java.util.List;

public class Class8120<T>
{
    private static String[] field33457;
    private final List<T> field33458;
    private final Spliterator<T> field33459;
    
    public Class8120(final Stream<T> stream) {
        this.field33458 = Lists.newArrayList();
        this.field33459 = stream.spliterator();
    }
    
    public Stream<T> method26730() {
        return StreamSupport.stream((Spliterator<T>)new Class7582(this, Long.MAX_VALUE, 0), false);
    }
}
