package remapped;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class_8232 {
   private static String[] field_42282;

   public static Object method_37709(Class<?> var0, String var1) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method var4 = var0.getDeclaredMethod(var1);
      return var4.invoke(null);
   }

   public static Object method_37707(Object var0, String var1) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method var4 = var0.getClass().getDeclaredMethod(var1);
      return var4.invoke(var0);
   }

   public static <T> T method_37710(Class<?> var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getDeclaredField(var1);
      var5.setAccessible(true);
      return (T)var5.get(null);
   }

   public static void method_37716(Class<?> var0, String var1, Object var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getDeclaredField(var1);
      var5.setAccessible(true);
      var5.set(null, var2);
   }

   public static <T> T method_37708(Object var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getSuperclass().getDeclaredField(var1);
      var5.setAccessible(true);
      return (T)var5.get(var0);
   }

   public static <T> T method_37712(Object var0, Class<?> var1, String var2, Class<T> var3) throws NoSuchFieldException, IllegalAccessException {
      Field var6 = var1.getDeclaredField(var2);
      var6.setAccessible(true);
      return (T)var6.get(var0);
   }

   public static <T> T method_37713(Object var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getDeclaredField(var1);
      var5.setAccessible(true);
      return (T)var5.get(var0);
   }

   public static <T> T method_37715(Object var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getField(var1);
      var5.setAccessible(true);
      return (T)var5.get(var0);
   }

   public static void method_37714(Object var0, String var1, Object var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getDeclaredField(var1);
      var5.setAccessible(true);
      var5.set(var0, var2);
   }
}
