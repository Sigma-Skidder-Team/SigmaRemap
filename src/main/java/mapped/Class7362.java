// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.reflect.Constructor;

public class Class7362 implements Class7359
{
    private Class7363 field28399;
    private Class[] field28400;
    private boolean field28401;
    private Constructor field28402;
    
    public Class7362(final Class7363 field28399, final Class[] field28400) {
        this.field28399 = null;
        this.field28400 = null;
        this.field28401 = false;
        this.field28402 = null;
        this.field28399 = field28399;
        this.field28400 = field28400;
        Class7462.method22986(this);
    }
    
    public Constructor method22617() {
        if (this.field28401) {
            return this.field28402;
        }
        this.field28401 = true;
        final Class method22622 = this.field28399.method22622();
        if (method22622 == null) {
            return null;
        }
        try {
            this.field28402 = method22618(method22622, this.field28400);
            if (this.field28402 == null) {
                Class7497.method23333("(Reflector) Constructor not present: " + method22622.getName() + ", params: " + Class9008.method32244(this.field28400));
            }
            if (this.field28402 != null) {
                this.field28402.setAccessible(true);
            }
        }
        catch (final Throwable t) {
            t.printStackTrace();
        }
        return this.field28402;
    }
    
    private static Constructor method22618(final Class clazz, final Class[] array) {
        final Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (int i = 0; i < declaredConstructors.length; ++i) {
            final Constructor constructor = declaredConstructors[i];
            if (Class9570.method35843(array, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }
    
    public boolean method22619() {
        if (!this.field28401) {
            return this.method22617() != null;
        }
        return this.field28402 != null;
    }
    
    public void method22620() {
        this.field28401 = true;
        this.field28402 = null;
    }
    
    public Object method22621(final Object... array) {
        return Class9570.method35842(this, array);
    }
    
    @Override
    public void method22603() {
        this.method22617();
    }
}
