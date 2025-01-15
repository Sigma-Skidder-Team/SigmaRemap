// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class149 implements Class122
{
    private static String[] field438;
    private final float field439;
    
    private Class149(final float field439) {
        this.field439 = field439;
    }
    
    @Override
    public boolean test(final Class7529 class7529) {
        return class7529.method23586().nextFloat() < this.field439;
    }
    
    public static Class8775 method723(final float n) {
        return () -> new Class149(n);
    }
}
