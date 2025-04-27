// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;

public class Class5935 extends Class5936
{
    private static String[] field24428;
    
    public Class5935(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        int n3 = 0;
        final long method18880 = class6346.method18880();
        Class4507 class6349;
        do {
            this.field24431.clear();
            this.field24432 = MutableBoundingBox.getNewBoundingBox();
            this.field24436.method9440(method18880 + n3++, n, n2);
            Class6924.method21291();
            class6349 = new Class4507(this.field24436, (n << 4) + 2, (n2 << 4) + 2);
            this.field24431.add(class6349);
            class6349.method13431(class6349, this.field24431, this.field24436);
            final List<Class4473> field19905 = class6349.field19905;
            while (!field19905.isEmpty()) {
                field19905.remove(this.field24436.nextInt(field19905.size())).method13431(class6349, this.field24431, this.field24436);
            }
            this.method17854();
            this.method17856(class6346.method18853(), this.field24436, 10);
        } while (this.field24431.isEmpty() || class6349.field19904 == null);
        Class4575.method13600((Class4575)this.method17866()).add(this);
    }
}
