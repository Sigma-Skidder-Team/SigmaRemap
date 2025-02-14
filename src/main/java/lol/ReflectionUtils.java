package lol;

import com.mentalfrostbyte.jello.unmapped.Invoker;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaConversionException;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionUtils {
   private static Field allowedModesField;
   private static final int ALL_MODES = 15;

   public static Invoker getMethodInvoker(Method method) {
      try {
         String name = Invoker.class.getDeclaredMethods()[0].getName();
         Lookup lookup = MethodHandles.lookup().in(method.getDeclaringClass());
         setLookupPermissions(lookup);
         return createInstance(method, lookup, name, false);
      } catch (Throwable var6) {
         return null;
      }
   }

   private static <T> T createInstance(Method method, Lookup lookup, String methodName, boolean special) throws Throwable {
      MethodHandle methodHandle = !special ? lookup.unreflect(method) : lookup.unreflectSpecial(method, method.getDeclaringClass());
      MethodType originalType = methodHandle.type();
      MethodType transformedType = transformMethodType(method, originalType);
      CallSite callSite = createCallSite(methodName, lookup, methodHandle, originalType, transformedType, Invoker.class);
      MethodHandle targetHandle = callSite.getTarget();
      return (T) (Object) targetHandle.invoke();
   }

   private static MethodType transformMethodType(Method method, MethodType methodType) {
      boolean isStatic = Modifier.isStatic(method.getModifiers());
      MethodType transformedType = !isStatic ? methodType.changeParameterType(0, Object.class) : methodType;
      Class<?>[] parameterTypes = method.getParameterTypes();

      for (int i = 0; i < parameterTypes.length; i++) {
         if (Object.class.isAssignableFrom(parameterTypes[i])) {
            transformedType = transformedType.changeParameterType(!isStatic ? i + 1 : i, Object.class);
         }
      }

      if (Object.class.isAssignableFrom(transformedType.returnType())) {
         transformedType = transformedType.changeReturnType(Object.class);
      }

      return transformedType;
   }

   private static CallSite createCallSite(String methodName, Lookup lookup, MethodHandle methodHandle, MethodType originalType, MethodType transformedType, Class<?> targetClass) throws LambdaConversionException {
      return LambdaMetafactory.metafactory(lookup, methodName, MethodType.methodType(targetClass), transformedType, methodHandle, originalType);
   }

   public static void setLookupPermissions(Lookup lookup) throws NoSuchFieldException, IllegalAccessException {
      getAllowedModesField().set(lookup, ALL_MODES);
   }

   public static Field getAllowedModesField() throws NoSuchFieldException, IllegalAccessException {
      if (allowedModesField == null || !allowedModesField.isAccessible()) {
         Field modifiersField = Field.class.getDeclaredField("modifiers");
         modifiersField.setAccessible(true);
         Field allowedModesField = Lookup.class.getDeclaredField("allowedModes");
         allowedModesField.setAccessible(true);
         int originalModifiers = allowedModesField.getModifiers();
         modifiersField.setInt(allowedModesField, originalModifiers & -17);
         ReflectionUtils.allowedModesField = allowedModesField;
      }

      return allowedModesField;
   }
}
