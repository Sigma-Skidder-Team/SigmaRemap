// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class132 extends Class126
{
    private static String[] field401;
    private final Class5770 field402;
    
    private Class132(final Class122[] array, final Class5770 field402) {
        super(array);
        this.field402 = field402;
    }
    
    @Override
    public Class8321 method639(final Class8321 class8321, final Class7529 class8322) {
        class8321.method27691(this.field402.method17159(class8322.method23586()));
        return class8321;
    }
    
    public static Class4943<?> method663(final Class5770 class5770) {
        return Class126.method640(array2 -> new Class132(array2, class5771));
    }
}
