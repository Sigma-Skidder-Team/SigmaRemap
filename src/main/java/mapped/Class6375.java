// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Consumer;

public class Class6375 extends Class6367
{
    private final Class1932 field25483;
    
    private Class6375(final Class1932 field25483, final int n, final int n2, final Class122[] array, final Class125[] array2) {
        super(n, n2, array, array2);
        this.field25483 = field25483;
    }
    
    @Override
    public void method19013(final Consumer<Class8321> consumer, final Class7529 class7529) {
        class7529.method23584(this.field25483).method34483(class7529, consumer);
    }
    
    @Override
    public void method19015(final Class7790 class7790) {
        if (!class7790.method25018(this.field25483)) {
            super.method19015(class7790);
            final Class9317 method25022 = class7790.method25022(this.field25483);
            if (method25022 != null) {
                method25022.method34487(class7790.method25016("->{" + this.field25483 + "}", this.field25483));
            }
            else {
                class7790.method25014("Unknown loot table called " + this.field25483);
            }
        }
        else {
            class7790.method25014("Table " + this.field25483 + " is recursively called");
        }
    }
    
    public static Class4948<?> method19036(final Class1932 class1932) {
        return Class6367.method19017((n, n2, array, array2) -> new Class6375(class1932, n, n2, array, array2));
    }
}
