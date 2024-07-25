package remapped;

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

public class class_5779 {
   private static Field field_29193;
   private static final int field_29195 = 15;

   public static class_5698 method_26142(Method var0) {
      try {
         Class var3 = var0.getReturnType();
         String var4 = class_5698.class.getDeclaredMethods()[0].getName();
         Lookup var5 = MethodHandles.lookup().in(var0.getDeclaringClass());
         method_26138(var5);
         return method_26141(var0, var5, class_5698.class, var4, false);
      } catch (Throwable var6) {
         var6.printStackTrace();
         return null;
      }
   }

   private static <T> T method_26141(Method var0, Lookup var1, Class<T> var2, String var3, boolean var4) throws Throwable {
      MethodHandle var7 = !var4 ? var1.unreflect(var0) : var1.unreflectSpecial(var0, var0.getDeclaringClass());
      MethodType var8 = var7.type();
      MethodType var9 = method_26143(var0, var8);
      CallSite var10 = method_26140(var3, var1, var7, var8, var9, var2);
      MethodHandle var11 = var10.getTarget();
      return (T)(Object)var11.invoke();
   }

   private static MethodType method_26143(Method var0, MethodType var1) {
      boolean var4 = Modifier.isStatic(var0.getModifiers());
      MethodType var5 = !var4 ? var1.changeParameterType(0, Object.class) : var1;
      Class[] var6 = var0.getParameterTypes();

      for (int var7 = 0; var7 < var6.length; var7++) {
         if (Object.class.isAssignableFrom(var6[var7])) {
            var5 = var5.changeParameterType(!var4 ? var7 + 1 : var7, Object.class);
         }
      }

      if (Object.class.isAssignableFrom(var5.returnType())) {
         var5 = var5.changeReturnType(Object.class);
      }

      return var5;
   }

   private static CallSite method_26140(String var0, Lookup var1, MethodHandle var2, MethodType var3, MethodType var4, Class<?> var5) throws LambdaConversionException {
      return LambdaMetafactory.metafactory(var1, var0, MethodType.methodType(var5), var4, var2, var3);
   }

   public static void method_26138(Lookup var0) throws NoSuchFieldException, IllegalAccessException {
      method_26137().set(var0, 15);
   }

   public static Field method_26137() throws NoSuchFieldException, IllegalAccessException {
      if (field_29193 == null || !field_29193.isAccessible()) {
         Field var2 = Field.class.getDeclaredField("modifiers");
         var2.setAccessible(true);
         Field var3 = Lookup.class.getDeclaredField("allowedModes");
         var3.setAccessible(true);
         int var4 = var3.getModifiers();
         var2.setInt(var3, var4 & -17);
         field_29193 = var3;
      }

      return field_29193;
   }
}
