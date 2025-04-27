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

public class ClassUtil {
    private static Field allowedModesField;
    private static final int TRUSTED_LOOKUP_MODES = 15;

    public static MethodInvoker createMethodInvoker(final Method method) {
        try {
            String interfaceMethodName = MethodInvoker.class.getDeclaredMethods()[0].getName();
            MethodHandles.Lookup lookup = MethodHandles.lookup().in(method.getDeclaringClass());
            makeLookupTrusted(lookup);
            return createLambda(method, lookup, MethodInvoker.class, interfaceMethodName, false);
        } catch (Throwable t) {
            t.printStackTrace();
            return null;
        }
    }

    private static <T> T createLambda(final Method method, final MethodHandles.Lookup lookup, final Class<T> interfaceClass, final String interfaceMethodName, final boolean useSpecial) throws Throwable {
        MethodHandle handle = useSpecial ? lookup.unreflectSpecial(method, method.getDeclaringClass()) : lookup.unreflect(method);
        MethodType handleType = handle.type();
        MethodType genericInterfaceType = adaptMethodType(method, handleType);
        return (T) createCallSite(interfaceMethodName, lookup, handle, handleType, genericInterfaceType, interfaceClass).getTarget().invoke();
    }

    private static MethodType adaptMethodType(final Method method, final MethodType originalType) {
        boolean isStatic = Modifier.isStatic(method.getModifiers());
        MethodType adaptedType = isStatic ? originalType : originalType.changeParameterType(0, Object.class);

        Class<?>[] params = method.getParameterTypes();
        for (int i = 0; i < params.length; i++) {
            if (Object.class.isAssignableFrom(params[i])) {
                adaptedType = adaptedType.changeParameterType(isStatic ? i : (i + 1), Object.class);
            }
        }

        if (Object.class.isAssignableFrom(adaptedType.returnType())) {
            adaptedType = adaptedType.changeReturnType(Object.class);
        }

        return adaptedType;
    }

    private static CallSite createCallSite(final String interfaceMethodName, final MethodHandles.Lookup caller, final MethodHandle implementation, final MethodType dynamicType, final MethodType interfaceType, final Class<?> interfaceClass) throws LambdaConversionException {
        return LambdaMetafactory.metafactory(caller, interfaceMethodName, MethodType.methodType(interfaceClass), interfaceType, implementation, dynamicType);
    }

    public static void makeLookupTrusted(final MethodHandles.Lookup lookup) throws NoSuchFieldException, IllegalAccessException {
        getAllowedModesField().set(lookup, TRUSTED_LOOKUP_MODES);
    }

    public static Field getAllowedModesField() throws NoSuchFieldException, IllegalAccessException {
        if (allowedModesField == null || !allowedModesField.isAccessible()) {
            Field modifiersField = Field.class.getDeclaredField("modifiers");
            modifiersField.setAccessible(true);

            Field allowedModes = MethodHandles.Lookup.class.getDeclaredField("allowedModes");
            allowedModes.setAccessible(true);

            modifiersField.setInt(allowedModes, allowedModes.getModifiers() & ~Modifier.FINAL);
            allowedModesField = allowedModes;
        }
        return allowedModesField;
    }
}
