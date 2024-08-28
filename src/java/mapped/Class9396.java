package mapped;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class9396 {
   private static String[] field43599;

   public static Object method35677(Class<?> var0, String var1) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method var4 = var0.getDeclaredMethod(var1);
      return var4.invoke(null);
   }

   public static Object method35678(Object var0, String var1) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
      Method var4 = var0.getClass().getDeclaredMethod(var1);
      return var4.invoke(var0);
   }

   public static <T> T method35679(Class<?> var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getDeclaredField(var1);
      var5.setAccessible(true);
      return (T)var5.get(null);
   }

   public static void method35680(Class<?> var0, String var1, Object var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getDeclaredField(var1);
      var5.setAccessible(true);
      var5.set(null, var2);
   }

   public static <T> T method35681(Object var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getSuperclass().getDeclaredField(var1);
      var5.setAccessible(true);
      return (T)var5.get(var0);
   }

   public static <T> T method35682(Object var0, Class<?> var1, String var2, Class<T> var3) throws NoSuchFieldException, IllegalAccessException {
      Field var6 = var1.getDeclaredField(var2);
      var6.setAccessible(true);
      return (T)var6.get(var0);
   }

   public static <T> T method35683(Object var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getDeclaredField(var1);
      var5.setAccessible(true);
      return (T)var5.get(var0);
   }

   public static <T> T method35684(Object var0, String var1, Class<T> var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getField(var1);
      var5.setAccessible(true);
      return (T)var5.get(var0);
   }

   public static void method35685(Object var0, String var1, Object var2) throws NoSuchFieldException, IllegalAccessException {
      Field var5 = var0.getClass().getDeclaredField(var1);
      var5.setAccessible(true);
      var5.set(var0, var2);
   }
}
