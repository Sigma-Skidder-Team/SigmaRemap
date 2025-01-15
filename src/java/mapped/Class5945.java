// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class5945 extends Class5936
{
    private static String[] field24444;
    private boolean field24445;
    
    public Class5945(final Class4574<?> class4574, final int n, final int n2, final Class6997 class4575, final int n3, final long n4) {
        super(class4574, n, n2, class4575, n3, n4);
    }
    
    @Override
    public void method17850(final Class6346<?> class6346, final Class1795 class6347, final int n, final int n2, final Class3090 class6348) {
        this.method17867(n, n2);
    }
    
    private void method17867(final int n, final int n2) {
        this.field24431.add(new Class4471(this.field24436, n * 16 - 29, n2 * 16 - 29, Class98.field268.method576(this.field24436)));
        this.method17854();
        this.field24445 = true;
    }
    
    @Override
    public void method17853(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (!this.field24445) {
            this.field24431.clear();
            this.method17867(this.method17859(), this.method17860());
        }
        super.method17853(class1851, class1852, random, class1853, class1854);
    }
}
