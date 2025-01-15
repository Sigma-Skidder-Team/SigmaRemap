// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.InvocationTargetException;
import java.io.IOException;
import java.lang.reflect.Method;

public final class Class2384 extends RuntimeException
{
    private static final Method field14185;
    private IOException field14186;
    
    public Class2384(final IOException ex) {
        super(ex);
        this.field14186 = ex;
    }
    
    public IOException method9507() {
        return this.field14186;
    }
    
    public void method9508(final IOException field14186) {
        this.method9509(field14186, this.field14186);
        this.field14186 = field14186;
    }
    
    private void method9509(final IOException obj, final IOException ex) {
        if (Class2384.field14185 != null) {
            try {
                Class2384.field14185.invoke(obj, ex);
            }
            catch (final InvocationTargetException | IllegalAccessException ex2) {}
        }
    }
    
    static {
        Method declaredMethod;
        try {
            declaredMethod = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        }
        catch (final Exception ex) {
            declaredMethod = null;
        }
        field14185 = declaredMethod;
    }
}
