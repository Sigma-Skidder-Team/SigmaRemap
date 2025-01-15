// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class5950 extends Class5936
{
    private static String[] field24449;
    
    public Class5950(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        final Class4494 class6349 = new Class4494(this.field24436, (n << 4) + 2, (n2 << 4) + 2);
        this.field24431.add(class6349);
        class6349.method13431(class6349, this.field24431, this.field24436);
        final List<Class4473> field19890 = class6349.field19890;
        while (!field19890.isEmpty()) {
            ((Class4473)field19890.remove(this.field24436.nextInt(field19890.size()))).method13431(class6349, this.field24431, this.field24436);
        }
        this.method17854();
        this.method17857(this.field24436, 48, 70);
    }
}
