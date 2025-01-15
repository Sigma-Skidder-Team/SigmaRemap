// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import org.apache.logging.log4j.Logger;

public class Class1767 extends Class1666
{
    private static String[] field9828;
    private static final Logger field9829;
    public final Class1932 field9830;
    private Class6582 field9831;
    public Class1932 field9832;
    public boolean field9833;
    
    public Class1767(final Class1932 field9830) {
        this.field9830 = field9830;
    }
    
    @Override
    public void method5871(final Class6582 field9831) throws IOException {
        this.field9831 = field9831;
        final Class1674 method6297 = this.method6297(field9831);
        method6297.method5894();
        final Class9413 method6298 = method6297.method5892();
        boolean method6299;
        boolean method6300;
        if (method6298 == null) {
            method6299 = false;
            method6300 = false;
        }
        else {
            method6299 = method6298.method35009();
            method6300 = method6298.method35010();
        }
        final Class1846 method6301 = method6297.method5893();
        if (Class8726.method29985()) {
            this.method6296(method6301, method6299, method6300);
        }
        else {
            Class8726.method29991(() -> this.method6296(method6301, method6299, method6300));
        }
    }
    
    private void method6296(final Class1846 class1846, final boolean b, final boolean b2) {
        Class8995.method32105(this.method5869(), 0, class1846.method6644(), class1846.method6645());
        class1846.method6654(0, 0, 0, 0, 0, class1846.method6644(), class1846.method6645(), b, b2, false, true);
        if (Class8571.method28955()) {
            Class8990.method32070(this.method5869(), class1846, b, b2, this.field9831, this.field9830, this.method5874());
        }
        if (Class8880.method31235()) {
            Class8880.method31249(this.field9830, this);
        }
    }
    
    public Class1674 method6297(final Class6582 class6582) {
        return Class1674.method5891(class6582, this.field9830);
    }
    
    static {
        field9829 = LogManager.getLogger();
    }
}
