// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;

public enum Class322
{
    field1907(new Class179[] { Class179.field513 }), 
    field1908(new Class179[] { Class179.field513, Class179.field516 }), 
    field1909(new Class179[] { Class179.field516 }), 
    field1910(new Class179[] { Class179.field514, Class179.field516 }), 
    field1911(new Class179[] { Class179.field514 }), 
    field1912(new Class179[] { Class179.field514, Class179.field515 }), 
    field1913(new Class179[] { Class179.field515 }), 
    field1914(new Class179[] { Class179.field513, Class179.field515 });
    
    private static final int field1915;
    private static final int field1916;
    private static final int field1917;
    private static final int field1918;
    private static final int field1919;
    private static final int field1920;
    private static final int field1921;
    private static final int field1922;
    private final Set<Class179> field1923;
    
    private Class322(final Class179[] a) {
        this.field1923 = (Set<Class179>)Sets.immutableEnumSet((Iterable)Arrays.asList(a));
    }
    
    public Set<Class179> method993() {
        return this.field1923;
    }
    
    static {
        field1915 = 1 << Class322.field1914.ordinal();
        field1916 = 1 << Class322.field1913.ordinal();
        field1917 = 1 << Class322.field1912.ordinal();
        field1918 = 1 << Class322.field1911.ordinal();
        field1919 = 1 << Class322.field1910.ordinal();
        field1920 = 1 << Class322.field1909.ordinal();
        field1921 = 1 << Class322.field1908.ordinal();
        field1922 = 1 << Class322.field1907.ordinal();
    }
}
