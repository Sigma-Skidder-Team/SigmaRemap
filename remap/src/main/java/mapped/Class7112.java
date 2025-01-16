// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.HashSet;
import java.util.Collection;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableSet;

public class Class7112 extends Class7110<Integer>
{
    private final ImmutableSet<Integer> field27741;
    
    public Class7112(final String s, final int i, final int n) {
        super(s, Integer.class);
        if (i < 0) {
            throw new IllegalArgumentException("Min value of " + s + " must be 0 or greater");
        }
        if (n > i) {
            final HashSet hashSet = Sets.newHashSet();
            for (int j = i; j <= n; ++j) {
                hashSet.add(j);
            }
            this.field27741 = (ImmutableSet<Integer>)ImmutableSet.copyOf((Collection)hashSet);
            return;
        }
        throw new IllegalArgumentException("Max value of " + s + " must be greater than min (" + i + ")");
    }
    
    @Override
    public Collection<Integer> getAllowedValues() {
        return (Collection<Integer>)this.field27741;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class7112 && super.equals(o) && this.field27741.equals((Object)((Class7112)o).field27741));
    }
    
    @Override
    public int method21828() {
        return 31 * super.method21828() + this.field27741.hashCode();
    }
    
    public static Class7112 method21832(final String s, final int n, final int n2) {
        return new Class7112(s, n, n2);
    }
    
    @Override
    public Optional<Integer> parseValue(final String s) {
        try {
            final Integer value = Integer.valueOf(s);
            return this.field27741.contains((Object)value) ? Optional.of(value) : Optional.empty();
        }
        catch (final NumberFormatException ex) {
            return Optional.empty();
        }
    }
    
    public String method21833(final Integer n) {
        return n.toString();
    }
}
