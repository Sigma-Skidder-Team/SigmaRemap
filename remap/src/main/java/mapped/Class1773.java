// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;

public class Class1773 extends Class1666 implements AutoCloseable
{
    private static String[] field9850;
    private Class1846 field9851;
    
    public Class1773(final Class1846 field9851) {
        this.field9851 = field9851;
        if (Class8726.method29984()) {
            Class8995.method32103(this.method5869(), this.field9851.method6644(), this.field9851.method6645());
            this.method6327();
            if (Config.method28955()) {
                Class8990.method32051(this);
            }
        }
        else {
            Class8726.method29991(() -> {
                Class8995.method32103(this.method5869(), this.field9851.method6644(), this.field9851.method6645());
                this.method6327();
                if (!(!Config.method28955())) {
                    Class8990.method32051(this);
                }
            });
        }
    }
    
    public Class1773(final int n, final int n2, final boolean b) {
        Class8726.method29989(Class8726::method29988);
        this.field9851 = new Class1846(n, n2, b);
        Class8995.method32103(this.method5869(), this.field9851.method6644(), this.field9851.method6645());
        if (Config.method28955()) {
            Class8990.method32051(this);
        }
    }
    
    @Override
    public void method5871(final Class6582 class6582) throws IOException {
    }
    
    public void method6327() {
        this.method5872();
        this.field9851.method6652(0, 0, 0, false);
    }
    
    @Nullable
    public Class1846 method6328() {
        return this.field9851;
    }
    
    public void method6329(final Class1846 field9851) throws Exception {
        this.field9851.close();
        this.field9851 = field9851;
    }
    
    @Override
    public void close() {
        this.field9851.close();
        this.method5870();
        this.field9851 = null;
    }
}
