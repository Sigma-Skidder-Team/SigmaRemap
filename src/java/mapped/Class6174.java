// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6174 extends Class6173
{
    private static String[] field24960;
    private final Class3442 field24961;
    private final Class399 field24962;
    private final Class399 field24963;
    private int field24964;
    private final Class8551 field24965;
    
    public Class6174(final Class8551 class8551, final Class3442 class8552, final Class1847 class8553, final Class399 class8554, final Class399 class8555) {
        this(class8551, class8552, class8553, class8554, class8555, class8554.method1935());
    }
    
    private Class6174(final Class8551 field24965, final Class3442 field24966, final Class1847 class1847, final Class399 field24967, final Class399 field24968, final Class5487 class1848) {
        super(class1847, field24967.method1938(), field24967.method1941(), field24967.method1945(), class1848.field22770, class1848.field22771, class1848.field22772);
        this.field24961 = field24966;
        this.field24962 = field24967;
        this.field24963 = field24968;
        this.field24965 = field24965;
    }
    
    @Override
    public Class6451 method18418() {
        return Class6451.field25662;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        Class9023 field39287 = null;
        if (Class8571.method28955()) {
            field39287 = Class9216.field39287;
            Class9216.method33835(this.field24962);
        }
        final float n2 = (this.field24964 + n) / 3.0f;
        final float n3 = n2 * n2;
        final double method35701 = Class9546.method35701(n, this.field24963.field2417, this.field24963.method1938());
        final double n4 = Class9546.method35701(n, this.field24963.field2418, this.field24963.method1941()) + 0.5;
        final double method35702 = Class9546.method35701(n, this.field24963.field2419, this.field24963.method1945());
        final double method35703 = Class9546.method35701(n3, this.field24962.method1938(), method35701);
        final double method35704 = Class9546.method35701(n3, this.field24962.method1941(), n4);
        final double method35705 = Class9546.method35701(n3, this.field24962.method1945(), method35702);
        final Class7808 method35706 = this.field24961.method11006();
        final Class5487 method35707 = class4151.method18161();
        this.field24965.method28706(this.field24962, method35703 - method35707.method16760(), method35704 - method35707.method16761(), method35705 - method35707.method16762(), this.field24962.field2399, n, new Class7351(), method35706, this.field24965.method28695(this.field24962, n));
        method35706.method25216();
        if (Class8571.method28955()) {
            Class9216.method33836(null);
            Class9216.method33776(field39287);
        }
    }
    
    @Override
    public void method18420() {
        ++this.field24964;
        if (this.field24964 == 3) {
            this.method18439();
        }
    }
}
