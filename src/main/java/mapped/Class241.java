// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class241
{
    field1181(Class7521.field29160, "oak"), 
    field1182(Class7521.field29161, "spruce"), 
    field1183(Class7521.field29162, "birch"), 
    field1184(Class7521.field29163, "jungle"), 
    field1185(Class7521.field29164, "acacia"), 
    field1186(Class7521.field29165, "dark_oak");
    
    private final String field1187;
    private final Class3833 field1188;
    
    private Class241(final Class3833 field1188, final String field1189) {
        this.field1187 = field1189;
        this.field1188 = field1188;
    }
    
    public String method890() {
        return this.field1187;
    }
    
    public Class3833 method891() {
        return this.field1188;
    }
    
    @Override
    public String toString() {
        return this.field1187;
    }
    
    public static Class241 method892(int n) {
        final Class241[] values = values();
        if (n < 0 || n >= values.length) {
            n = 0;
        }
        return values[n];
    }
    
    public static Class241 method893(final String anObject) {
        final Class241[] values = values();
        for (int i = 0; i < values.length; ++i) {
            if (values[i].method890().equals(anObject)) {
                return values[i];
            }
        }
        return values[0];
    }
}
