// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class5948 extends Class5936
{
    private static String[] field24447;
    
    public Class5948(final Class4574<?> class4574, final int n, final int n2, final MutableBoundingBox class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        final Class5132 class6349 = class6346.method18878(class6348, Class4535.field19959);
        final Class4482 class6350 = new Class4482(0, this.field24436, (n << 4) + 2, (n2 << 4) + 2, class6349.field22106);
        this.field24431.add(class6350);
        class6350.method13431(class6350, this.field24431, this.field24436);
        this.method17854();
        if (class6349.field22106 != Class1964.field10719) {
            this.method17856(class6346.method18853(), this.field24436, 10);
        }
        else {
            final int n3 = class6346.method18853() - this.field24432.maxY + this.field24432.getYSize() / 2 + 5;
            this.field24432.offset(0, n3, 0);
            final Iterator<Class4473> iterator = this.field24431.iterator();
            while (iterator.hasNext()) {
                iterator.next().method13454(0, n3, 0);
            }
        }
    }
}
