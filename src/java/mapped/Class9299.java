// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.IntUnaryOperator;

public class Class9299 implements IntUnaryOperator
{
    private static String[] field39896;
    private final Integer field39897;
    private final Integer field39898;
    private final IntUnaryOperator field39899;
    
    private Class9299(final Integer field39897, final Integer n8) {
        this.field39897 = field39897;
        this.field39898 = n8;
        if (field39897 != null) {
            field39897.intValue();
            if (n8 != null) {
                this.field39899 = (n5 -> {
                    n8.intValue();
                    return Class9546.method35651(n5, n, n3);
                });
            }
            else {
                this.field39899 = (b -> Math.max(a, b));
            }
        }
        else if (n8 != null) {
            this.field39899 = (b2 -> {
                n8.intValue();
                return Math.min(a2, b2);
            });
        }
        else {
            this.field39899 = (n9 -> n9);
        }
    }
    
    public static Class9299 method34374(final int i, final int j) {
        return new Class9299(i, j);
    }
    
    public static Class9299 method34375(final int i) {
        return new Class9299(i, null);
    }
    
    public static Class9299 method34376(final int i) {
        return new Class9299(null, i);
    }
    
    @Override
    public int applyAsInt(final int n) {
        return this.field39899.applyAsInt(n);
    }
}
