package remapped;

import com.google.common.collect.Maps;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class class_9774 {
   private static String[] field_49622;
   private final Class<?> field_49620;
   private final Map<String, Field> field_49621 = Maps.newConcurrentMap();
   private final Map<String, Method> field_49623 = Maps.newConcurrentMap();

   public class_9774(Class<?> var1) {
      this(var1, true);
   }

   public class_9774(Class<?> var1, boolean var2) {
      this.field_49620 = var1;
      this.method_45118(var1, var2);
      this.method_45112(var1, var2);
   }

   private void method_45118(Class<?> var1, boolean var2) {
      if (var1.getSuperclass() != null && var2) {
         this.method_45118(var1.getSuperclass(), true);
      }

      for (Field var8 : var1.getDeclaredFields()) {
         var8.setAccessible(true);
         this.field_49621.put(var8.getName(), var8);
      }
   }

   private void method_45112(Class<?> var1, boolean var2) {
      if (var1.getSuperclass() != null && var2) {
         this.method_45112(var1.getSuperclass(), true);
      }

      for (Method var8 : var1.getDeclaredMethods()) {
         var8.setAccessible(true);
         this.field_49623.put(var8.getName(), var8);
      }
   }

   public Object method_45119() throws IllegalAccessException, InstantiationException {
      return this.field_49620.newInstance();
   }

   public Field method_45111(String var1) {
      return this.field_49621.get(var1);
   }

   public void method_45115(String var1, Object var2, Object var3) throws IllegalAccessException {
      this.method_45111(var1).set(var2, var3);
   }

   public <T> T method_45117(String var1, Object var2, Class<T> var3) throws IllegalAccessException {
      return (T)var3.cast(this.method_45111(var1).get(var2));
   }

   public <T> T method_45114(Class<T> var1, String var2, Object var3, Object... var4) throws InvocationTargetException, IllegalAccessException {
      return (T)var1.cast(this.method_45116(var2).invoke(var3, var4));
   }

   public Method method_45116(String var1) {
      return this.field_49623.get(var1);
   }

   public Collection<Field> method_45121() {
      return Collections.<Field>unmodifiableCollection(this.field_49621.values());
   }

   public Collection<Method> method_45113() {
      return Collections.<Method>unmodifiableCollection(this.field_49623.values());
   }
}
