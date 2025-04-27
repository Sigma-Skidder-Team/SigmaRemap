// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Optional;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;

public class Class7113 extends Class7110<Boolean>
{
    private final ImmutableSet<Boolean> field27742;
    
    public Class7113(final String s) {
        super(s, Boolean.class);
        this.field27742 = (ImmutableSet<Boolean>)ImmutableSet.of(true, (Object)false);
    }
    
    @Override
    public Collection<Boolean> getAllowedValues() {
        return this.field27742;
    }
    
    public static Class7113 method21834(final String s) {
        return new Class7113(s);
    }
    
    @Override
    public Optional<Boolean> parseValue(final String value) {
        return (!"true".equals(value) && !"false".equals(value)) ? Optional.empty() : Optional.of(Boolean.valueOf(value));
    }
    
    public String method21835(final Boolean b) {
        return b.toString();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof Class7113 && super.equals(o) && this.field27742.equals(((Class7113)o).field27742));
    }
    
    @Override
    public int method21828() {
        return 31 * super.method21828() + this.field27742.hashCode();
    }
}
