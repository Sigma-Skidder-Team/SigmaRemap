// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.BitSet;

public final class Class8259 extends Class8260
{
    private static String[] field33910;
    private final BitSet field33911;
    private int field33912;
    private int field33913;
    private int field33914;
    private int field33915;
    private int field33916;
    private int field33917;
    
    public Class8259(final int n, final int n2, final int n3) {
        this(n, n2, n3, n, n2, n3, 0, 0, 0);
    }
    
    public Class8259(final int n, final int n2, final int n3, final int field33912, final int field33913, final int field33914, final int field33915, final int field33916, final int field33917) {
        super(n, n2, n3);
        this.field33911 = new BitSet(n * n2 * n3);
        this.field33912 = field33912;
        this.field33913 = field33913;
        this.field33914 = field33914;
        this.field33915 = field33915;
        this.field33916 = field33916;
        this.field33917 = field33917;
    }
    
    public Class8259(final Class8260 class8260) {
        super(class8260.field33919, class8260.field33920, class8260.field33921);
        if (!(class8260 instanceof Class8259)) {
            this.field33911 = new BitSet(this.field33919 * this.field33920 * this.field33921);
            for (int i = 0; i < this.field33919; ++i) {
                for (int j = 0; j < this.field33920; ++j) {
                    for (int k = 0; k < this.field33921; ++k) {
                        if (class8260.method27414(i, j, k)) {
                            this.field33911.set(this.method27413(i, j, k));
                        }
                    }
                }
            }
        }
        else {
            this.field33911 = (BitSet)((Class8259)class8260).field33911.clone();
        }
        this.field33912 = class8260.method27417(Class111.field351);
        this.field33913 = class8260.method27417(Class111.field352);
        this.field33914 = class8260.method27417(Class111.field353);
        this.field33915 = class8260.method27418(Class111.field351);
        this.field33916 = class8260.method27418(Class111.field352);
        this.field33917 = class8260.method27418(Class111.field353);
    }
    
    public int method27413(final int n, final int n2, final int n3) {
        return (n * this.field33920 + n2) * this.field33921 + n3;
    }
    
    @Override
    public boolean method27414(final int n, final int n2, final int n3) {
        return this.field33911.get(this.method27413(n, n2, n3));
    }
    
    @Override
    public void method27415(final int b, final int b2, final int b3, final boolean b4, final boolean value) {
        this.field33911.set(this.method27413(b, b2, b3), value);
        if (b4) {
            if (value) {
                this.field33912 = Math.min(this.field33912, b);
                this.field33913 = Math.min(this.field33913, b2);
                this.field33914 = Math.min(this.field33914, b3);
                this.field33915 = Math.max(this.field33915, b + 1);
                this.field33916 = Math.max(this.field33916, b2 + 1);
                this.field33917 = Math.max(this.field33917, b3 + 1);
            }
        }
    }
    
    @Override
    public boolean method27416() {
        return this.field33911.isEmpty();
    }
    
    @Override
    public int method27417(final Class111 class111) {
        return class111.method604(this.field33912, this.field33913, this.field33914);
    }
    
    @Override
    public int method27418(final Class111 class111) {
        return class111.method604(this.field33915, this.field33916, this.field33917);
    }
    
    @Override
    public boolean method27419(final int n, final int n2, final int n3, final int n4) {
        if (n3 >= 0) {
            if (n4 >= 0) {
                if (n >= 0) {
                    if (n3 < this.field33919) {
                        if (n4 < this.field33920) {
                            if (n2 <= this.field33921) {
                                return this.field33911.nextClearBit(this.method27413(n3, n4, n)) >= this.method27413(n3, n4, n2);
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method27420(final int n, final int n2, final int n3, final int n4, final boolean value) {
        this.field33911.set(this.method27413(n3, n4, n), this.method27413(n3, n4, n2), value);
    }
    
    public static Class8259 method27421(final Class8260 class8260, final Class8260 class8261, final Class83 class8262, final Class83 class8263, final Class83 class8264, final Class9306 class8265) {
        final Class8259 class8266 = new Class8259(class8262.method447().size() - 1, class8263.method447().size() - 1, class8264.method447().size() - 1);
        final int[] array = { Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        class8262.method445((n, n2, n3) -> {
            final boolean[] array2 = { false };
            final boolean method445 = class8263.method445((n4, n5, n6) -> {
                final boolean[] array3 = { false };
                final boolean method445 = class8264.method445((n7, n8, n9) -> {
                    if (class8265.method34406(class8260.method27426(n, n4, n7), class8261.method27426(n2, n5, n8))) {
                        class8266.field33911.set(class8266.method27413(n3, n6, n9));
                        array[2] = Math.min(array[2], n9);
                        array[5] = Math.max(array[5], n9);
                        array3[0] = true;
                    }
                    return true;
                });
                if (array3[0]) {
                    array[1] = Math.min(array[1], n6);
                    array[4] = Math.max(array[4], n6);
                    array2[0] = true;
                }
                return method445;
            });
            if (array2[0]) {
                array[0] = Math.min(array[0], n3);
                array[3] = Math.max(array[3], n3);
            }
            return method445;
        });
        class8266.field33912 = array[0];
        class8266.field33913 = array[1];
        class8266.field33914 = array[2];
        class8266.field33915 = array[3] + 1;
        class8266.field33916 = array[4] + 1;
        class8266.field33917 = array[5] + 1;
        return class8266;
    }
}
