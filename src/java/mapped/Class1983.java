// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class1983
{
    field10981("red", Class7521.field29279.method11878()), 
    field10982("brown", Class7521.field29278.method11878());
    
    private final String field10983;
    private final Class7096 field10984;
    
    private Class1983(final String field10983, final Class7096 field10984) {
        this.field10983 = field10983;
        this.field10984 = field10984;
    }
    
    public Class7096 method7992() {
        return this.field10984;
    }
    
    private static Class1983 method7993(final String anObject) {
        for (final Class1983 class1983 : values()) {
            if (class1983.field10983.equals(anObject)) {
                return class1983;
            }
        }
        return Class1983.field10981;
    }
}
