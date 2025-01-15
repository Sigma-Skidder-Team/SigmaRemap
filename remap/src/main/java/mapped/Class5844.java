// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Function;

public abstract class Class5844<E extends Class399> extends Class5845<E>
{
    private final boolean field23949;
    private final float field23950;
    private final float field23951;
    private final float field23952;
    private final float field23953;
    private final float field23954;
    
    public Class5844(final boolean b, final float n, final float n2) {
        this(b, n, n2, 2.0f, 2.0f, 24.0f);
    }
    
    public Class5844(final boolean b, final float n, final float n2, final float n3, final float n4, final float n5) {
        this(Class6332::method18770, b, n, n2, n3, n4, n5);
    }
    
    public Class5844(final Function<Class1932, Class6332> function, final boolean field23949, final float field23950, final float field23951, final float field23952, final float field23953, final float field23954) {
        super(function);
        this.field23949 = field23949;
        this.field23950 = field23950;
        this.field23951 = field23951;
        this.field23952 = field23952;
        this.field23953 = field23953;
        this.field23954 = field23954;
    }
    
    public Class5844() {
        this(false, 5.0f, 2.0f);
    }
    
    @Override
    public void method17564(final Class7351 class7351, final Class4150 class7352, final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        if (!this.field23957) {
            this.method17559().forEach(class7355 -> class7355.method18644(class7353, class7354, n9, n10, n11, n12, n13, n14));
            this.method17560().forEach(class7358 -> class7358.method18644(class7356, class7357, n15, n16, n17, n18, n19, n20));
        }
        else {
            class7351.method22567();
            if (this.field23949) {
                final float n7 = 1.5f / this.field23952;
                class7351.method22565(n7, n7, n7);
            }
            class7351.method22564(0.0, this.field23950 / 16.0f, this.field23951 / 16.0f);
            this.method17559().forEach(class7361 -> class7361.method18644(class7359, class7360, n21, n22, n23, n24, n25, n26));
            class7351.method22568();
            class7351.method22567();
            final float n8 = 1.0f / this.field23953;
            class7351.method22565(n8, n8, n8);
            class7351.method22564(0.0, this.field23954 / 16.0f, 0.0);
            this.method17560().forEach(class7364 -> class7364.method18644(class7362, class7363, n27, n28, n29, n30, n31, n32));
            class7351.method22568();
        }
    }
    
    public abstract Iterable<Class6300> method17559();
    
    public abstract Iterable<Class6300> method17560();
}
