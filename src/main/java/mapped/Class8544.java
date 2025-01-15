// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.CallSite;
import java.lang.reflect.Modifier;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class Class8544
{
    private static Field field35885;
    private static final int field35886 = 15;
    
    public static Class7313 method28682(final Method method) {
        try {
            method.getReturnType();
            final String name = Class7313.class.getDeclaredMethods()[0].getName();
            final MethodHandles.Lookup in = MethodHandles.lookup().in(method.getDeclaringClass());
            method28686(in);
            return method28683(method, in, Class7313.class, name, false);
        }
        catch (final Throwable t) {
            t.printStackTrace();
            return null;
        }
    }
    
    private static <T> T method28683(final Method method, final MethodHandles.Lookup lookup, final Class<T> clazz, final String s, final boolean b) throws Throwable {
        final MethodHandle methodHandle = b ? lookup.unreflectSpecial(method, method.getDeclaringClass()) : lookup.unreflect(method);
        final MethodType type = methodHandle.type();
        return (T)method28685(s, lookup, methodHandle, type, method28684(method, type), clazz).getTarget().invoke();
    }
    
    private static MethodType method28684(final Method method, final MethodType methodType) {
        final boolean static1 = Modifier.isStatic(method.getModifiers());
        MethodType methodType2 = static1 ? methodType : methodType.changeParameterType(0, (Class<?>)Object.class);
        final Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; ++i) {
            if (Object.class.isAssignableFrom(parameterTypes[i])) {
                methodType2 = methodType2.changeParameterType(static1 ? i : (i + 1), (Class<?>)Object.class);
            }
        }
        if (Object.class.isAssignableFrom(methodType2.returnType())) {
            methodType2 = methodType2.changeReturnType((Class<?>)Object.class);
        }
        return methodType2;
    }
    
    private static CallSite method28685(final String interfaceMethodName, final MethodHandles.Lookup caller, final MethodHandle implementation, final MethodType dynamicMethodType, final MethodType interfaceMethodType, final Class<?> rtype) throws LambdaConversionException {
        return LambdaMetafactory.metafactory(caller, interfaceMethodName, MethodType.methodType(rtype), interfaceMethodType, implementation, dynamicMethodType);
    }
    
    public static void method28686(final MethodHandles.Lookup obj) throws NoSuchFieldException, IllegalAccessException {
        method28687().set(obj, 15);
    }
    
    public static Field method28687() throws NoSuchFieldException, IllegalAccessException {
        if (Class8544.field35885 == null || !Class8544.field35885.isAccessible()) {
            final Field declaredField = Field.class.getDeclaredField("modifiers");
            declaredField.setAccessible(true);
            final Field declaredField2 = MethodHandles.Lookup.class.getDeclaredField("allowedModes");
            declaredField2.setAccessible(true);
            declaredField.setInt(declaredField2, declaredField2.getModifiers() & 0xFFFFFFEF);
            Class8544.field35885 = declaredField2;
        }
        return Class8544.field35885;
    }
}
