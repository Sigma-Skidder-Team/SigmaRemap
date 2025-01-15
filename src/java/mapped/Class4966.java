// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Class4966 extends Class4965
{
    private static final Logger field21339;
    private static boolean field21340;
    
    public Class4966(final Class7662 class7662) {
        super(class7662);
    }
    
    public Class4962 method15031() {
        return this.method15032(null);
    }
    
    public Class4962 method15032(Class9266 class9266) {
        if (class9266 == null) {
            class9266 = new Class9266();
        }
        class9266.field39737 = this.method15019();
        class9266.field39740 = this.field21330;
        final Class4962 class9267 = new Class4962(class9266);
        class9267.method14976("requestHeaders", new Class4684(this, this)).method14976("responseHeaders", new Class4673(this, this));
        return class9267;
    }
    
    @Override
    public void method15020(final byte[] array, final Runnable runnable) {
        this.method15033(array, runnable);
    }
    
    @Override
    public void method15021(final String s, final Runnable runnable) {
        this.method15033(s, runnable);
    }
    
    private void method15033(final Object field39739, final Runnable runnable) {
        final Class9266 class9266 = new Class9266();
        class9266.field39738 = "POST";
        class9266.field39739 = field39739;
        final Class4962 method15032 = this.method15032(class9266);
        method15032.method14976("success", new Class4676(this, runnable));
        method15032.method14976("error", new Class4669(this, this));
        method15032.method14984();
    }
    
    @Override
    public void method15022() {
        Class4966.field21339.fine("xhr poll");
        final Class4962 method15031 = this.method15031();
        method15031.method14976("data", new Class4698(this, this));
        method15031.method14976("error", new Class4667(this, this));
        method15031.method14984();
    }
    
    static {
        field21339 = Logger.getLogger(Class4966.class.getName());
        Class4966.field21340 = Class4966.field21339.isLoggable(Level.FINE);
    }
}
