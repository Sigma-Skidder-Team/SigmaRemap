// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.movement.phases.NCPPhase;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;

public class Class7557
{
    private static String[] field29966;
    private Object field29967;
    private Class<?> field29968;
    private Method field29969;
    private Class7313 field29970;
    private MethodHandle field29971;
    private Class2046 field29972;
    private boolean field29973;
    
    public Class7557(final Object field29967, final Class<?> field29968, final Method method, final Class2046 field29969) {
        this.field29967 = field29967;
        this.field29968 = field29968;
        this.field29969 = method;
        this.field29970 = Class8544.method28682(method);
        try {
            this.field29971 = MethodHandles.lookup().unreflect(method);
        }
        catch (final IllegalAccessException ex) {
            ex.printStackTrace();
        }
        this.field29972 = field29969;
        this.field29973 = (field29967.getClass().getSuperclass() == NCPPhase.class.getSuperclass());
    }
    
    public Object method23723() {
        return this.field29967;
    }
    
    public MethodHandle method23724() {
        return this.field29971;
    }
    
    public Class7313 method23725() {
        return this.field29970;
    }
    
    public Method method23726() {
        return this.field29969;
    }
    
    public Class2046 method23727() {
        return this.field29972;
    }
    
    public boolean method23728() {
        return this.field29973;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (!(o instanceof Class7557)) {
            return false;
        }
        final Class7557 class7557 = (Class7557)o;
        if (this.field29967 == class7557.field29967) {
            if (this.field29969 == class7557.field29969) {
                if (this.field29972 == class7557.field29972) {
                    return true;
                }
            }
        }
        return false;
    }
}
