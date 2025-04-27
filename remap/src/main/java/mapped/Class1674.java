// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.Closeable;

public class Class1674 implements Closeable
{
    private final Class9413 field9467;
    private final Class1846 field9468;
    private final IOException field9469;
    
    public Class1674(final IOException field9469) {
        this.field9469 = field9469;
        this.field9467 = null;
        this.field9468 = null;
    }
    
    public Class1674(final Class9413 field9467, final Class1846 field9468) {
        this.field9469 = null;
        this.field9467 = field9467;
        this.field9468 = field9468;
    }
    
    public static Class1674 method5891(final Class6582 class6582, final ResourceLocation class6583) {
        try (final Class1671 method19933 = class6582.method19933(class6583)) {
            final Class1846 method19934 = Class1846.method6637(method19933.method5887());
            Class9413 class6584 = null;
            try {
                class6584 = method19933.method5888(Class9413.field40388);
            }
            catch (final RuntimeException ex) {
                Class1767.method6299().warn("Failed reading metadata of: {}", (Object)class6583, (Object)ex);
            }
            return new Class1674(class6584, method19934);
        }
        catch (final IOException ex2) {
            return new Class1674(ex2);
        }
    }
    
    @Nullable
    public Class9413 method5892() {
        return this.field9467;
    }
    
    public Class1846 method5893() throws IOException {
        if (this.field9469 == null) {
            return this.field9468;
        }
        throw this.field9469;
    }
    
    @Override
    public void close() {
        if (this.field9468 != null) {
            this.field9468.close();
        }
    }
    
    public void method5894() throws IOException {
        if (this.field9469 == null) {
            return;
        }
        throw this.field9469;
    }
}
