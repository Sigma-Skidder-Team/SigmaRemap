package mapped;

import com.google.common.collect.Maps;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

public final class Class9814 {
   private static String[] field45864;
   private final Class<?> field45865;
   private final Map<String, Field> field45866 = Maps.newConcurrentMap();
   private final Map<String, Method> field45867 = Maps.newConcurrentMap();

   public Class9814(Class<?> var1) {
      this(var1, true);
   }

   public Class9814(Class<?> var1, boolean var2) {
      this.field45865 = var1;
      this.method38731(var1, var2);
      this.method38732(var1, var2);
   }

   private void method38731(Class<?> var1, boolean var2) {
      if (var1.getSuperclass() != null && var2) {
         this.method38731(var1.getSuperclass(), true);
      }

      for (Field var8 : var1.getDeclaredFields()) {
         var8.setAccessible(true);
         this.field45866.put(var8.getName(), var8);
      }
   }

   private void method38732(Class<?> var1, boolean var2) {
      if (var1.getSuperclass() != null && var2) {
         this.method38732(var1.getSuperclass(), true);
      }

      for (Method var8 : var1.getDeclaredMethods()) {
         var8.setAccessible(true);
         this.field45867.put(var8.getName(), var8);
      }
   }

   public Object method38733() throws IllegalAccessException, InstantiationException {
      return this.field45865.newInstance();
   }

   public Field method38734(String var1) {
      return this.field45866.get(var1);
   }

   public void method38735(String var1, Object var2, Object var3) throws IllegalAccessException {
      this.method38734(var1).set(var2, var3);
   }

   public <T> T method38736(String var1, Object var2, Class<T> var3) throws IllegalAccessException {
      return (T)var3.cast(this.method38734(var1).get(var2));
   }

   public <T> T method38737(Class<T> var1, String var2, Object var3, Object... var4) throws InvocationTargetException, IllegalAccessException {
      return (T)var1.cast(this.method38738(var2).invoke(var3, var4));
   }

   public Method method38738(String var1) {
      return this.field45867.get(var1);
   }

   public Collection<Field> method38739() {
      return Collections.<Field>unmodifiableCollection(this.field45866.values());
   }

   public Collection<Method> method38740() {
      return Collections.<Method>unmodifiableCollection(this.field45867.values());
   }
}
