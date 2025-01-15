// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Objects;
import java.util.Map;

public final class Class7985
{
    private static String[] field32857;
    private final String field32858;
    private final Class2136 field32859;
    public final int field32860;
    public static final Map<String, Class7985> field32861;
    
    private Class7985(final String field32858, final Class2136 field32859, final int field32860) {
        this.field32858 = field32858;
        this.field32859 = field32859;
        this.field32860 = field32860;
        Class7985.field32861.put(field32858, this);
    }
    
    public Class2136 method26046() {
        return this.field32859;
    }
    
    public int method26047() {
        return this.field32860;
    }
    
    public String method26048() {
        return this.field32858;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Class7985 class7985 = (Class7985)o;
            return this.field32860 == class7985.field32860 && this.field32859 == class7985.field32859;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.field32859, this.field32860);
    }
    
    @Override
    public String toString() {
        return this.field32858;
    }
    
    static {
        field32861 = Maps.newHashMap();
    }
}
