// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.lang.reflect.Method;

public class Class7361 implements Class7359
{
    private Class7363 field28394;
    private String field28395;
    private Class[] field28396;
    private boolean field28397;
    private Method field28398;
    
    public Class7361(final Class7363 class7363, final String s) {
        this(class7363, s, null);
    }
    
    public Class7361(final Class7363 field28394, final String field28395, final Class[] field28396) {
        this.field28394 = null;
        this.field28395 = null;
        this.field28396 = null;
        this.field28397 = false;
        this.field28398 = null;
        this.field28394 = field28394;
        this.field28395 = field28395;
        this.field28396 = field28396;
        Class7462.method22986(this);
    }
    
    public Method method22604() {
        if (this.field28397) {
            return this.field28398;
        }
        this.field28397 = true;
        final Class method22622 = this.field28394.method22622();
        if (method22622 == null) {
            return null;
        }
        try {
            if (this.field28396 == null) {
                final Method[] method22623 = method22616(method22622, this.field28395);
                if (method22623.length <= 0) {
                    Class7497.method23338("(Reflector) Method not present: " + method22622.getName() + "." + this.field28395);
                    return null;
                }
                if (method22623.length > 1) {
                    Class7497.method23334("(Reflector) More than one method found: " + method22622.getName() + "." + this.field28395);
                    for (int i = 0; i < method22623.length; ++i) {
                        Class7497.method23334("(Reflector)  - " + method22623[i]);
                    }
                    return null;
                }
                this.field28398 = method22623[0];
            }
            else {
                this.field28398 = method22615(method22622, this.field28395, this.field28396);
            }
            if (this.field28398 == null) {
                Class7497.method23338("(Reflector) Method not present: " + method22622.getName() + "." + this.field28395);
                return null;
            }
            this.field28398.setAccessible(true);
            return this.field28398;
        }
        catch (final Throwable t) {
            t.printStackTrace();
            return null;
        }
    }
    
    public boolean method22605() {
        if (!this.field28397) {
            return this.method22604() != null;
        }
        return this.field28398 != null;
    }
    
    public Class method22606() {
        final Method method22604 = this.method22604();
        return (method22604 != null) ? method22604.getReturnType() : null;
    }
    
    public void method22607() {
        this.field28397 = true;
        this.field28398 = null;
    }
    
    public Object method22608(final Object... array) {
        return Class9570.method35818(this, array);
    }
    
    public boolean method22609(final Object... array) {
        return Class9570.method35812(this, array);
    }
    
    public int method22610(final Object... array) {
        return Class9570.method35813(this, array);
    }
    
    public float method22611(final Object... array) {
        return Class9570.method35815(this, array);
    }
    
    public double method22612(final Object... array) {
        return Class9570.method35816(this, array);
    }
    
    public String method22613(final Object... array) {
        return Class9570.method35817(this, array);
    }
    
    public void method22614(final Object... array) {
        Class9570.method35811(this, array);
    }
    
    public static Method method22615(final Class clazz, final String anObject, final Class[] array) {
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; ++i) {
            final Method method = declaredMethods[i];
            if (method.getName().equals(anObject) && Class9570.method35843(array, method.getParameterTypes())) {
                return method;
            }
        }
        return null;
    }
    
    public static Method[] method22616(final Class clazz, final String anObject) {
        final ArrayList list = new ArrayList();
        final Method[] declaredMethods = clazz.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; ++i) {
            final Method method = declaredMethods[i];
            if (method.getName().equals(anObject)) {
                list.add(method);
            }
        }
        return (Method[])list.toArray(new Method[list.size()]);
    }
    
    @Override
    public void method22603() {
        this.method22604();
    }
}
