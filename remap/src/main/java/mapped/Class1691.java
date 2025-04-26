// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.TimeUnit;
import java.io.IOException;

public class Class1691 implements Class1682
{
    private static String[] field9548;
    public boolean field9549;
    public final /* synthetic */ Class1681 field9550;
    public final /* synthetic */ Class6050 field9551;
    public final /* synthetic */ Class1679 field9552;
    public final /* synthetic */ CacheInterceptor field9553;
    
    public Class1691(final CacheInterceptor field9553, final Class1681 field9554, final Class6050 field9555, final Class1679 field9556) {
        this.field9553 = field9553;
        this.field9550 = field9554;
        this.field9551 = field9555;
        this.field9552 = field9556;
    }
    
    @Override
    public long method6014(final Class1680 class1680, final long n) throws IOException {
        long method6014;
        try {
            method6014 = this.field9550.method6014(class1680, n);
        }
        catch (final IOException ex) {
            if (!this.field9549) {
                this.field9549 = true;
                this.field9551.method17980();
            }
            throw ex;
        }
        if (method6014 == -1L) {
            if (!this.field9549) {
                this.field9549 = true;
                this.field9552.close();
            }
            return -1L;
        }
        class1680.method5957(this.field9552.method5926(), class1680.method5949() - method6014, method6014);
        this.field9552.method5947();
        return method6014;
    }
    
    @Override
    public Class8020 method5921() {
        return this.field9550.method5921();
    }
    
    @Override
    public void close() throws IOException {
        if (!this.field9549) {
            if (!Class7690.method24435(this, 100, TimeUnit.MILLISECONDS)) {
                this.field9549 = true;
                this.field9551.method17980();
            }
        }
        this.field9550.close();
    }
}
