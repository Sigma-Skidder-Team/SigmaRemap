package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class class_2572<T> {
   private final Class<?> field_12727;
   private final String field_12726;
   private final Class[] field_12729;

   public class_2572(Class<?> var1, String var2, Class... var3) {
      this.field_12727 = var1;
      this.field_12726 = var2;
      this.field_12729 = var3;
   }

   public boolean method_11692(T var1) {
      return this.method_11691(var1.getClass()) != null;
   }

   public Object method_11697(T var1, Object... var2) throws InvocationTargetException {
      Method var5 = this.method_11691(var1.getClass());
      if (var5 == null) {
         return null;
      } else {
         try {
            return var5.invoke(var1, var2);
         } catch (IllegalAccessException var7) {
            return null;
         }
      }
   }

   public Object method_11693(T var1, Object... var2) {
      try {
         return this.method_11697((T)var1, var2);
      } catch (InvocationTargetException var8) {
         Throwable var6 = var8.getTargetException();
         if (var6 instanceof RuntimeException) {
            throw (RuntimeException)var6;
         } else {
            AssertionError var7 = new AssertionError("Unexpected exception");
            var7.initCause(var6);
            throw var7;
         }
      }
   }

   public Object method_11690(T var1, Object... var2) throws InvocationTargetException {
      Method var5 = this.method_11691(var1.getClass());
      if (var5 == null) {
         throw new AssertionError("Method " + this.field_12726 + " not supported for object " + var1);
      } else {
         try {
            return var5.invoke(var1, var2);
         } catch (IllegalAccessException var8) {
            AssertionError var7 = new AssertionError("Unexpectedly could not call: " + var5);
            var7.initCause(var8);
            throw var7;
         }
      }
   }

   public Object method_11694(T var1, Object... var2) {
      try {
         return this.method_11690((T)var1, var2);
      } catch (InvocationTargetException var8) {
         Throwable var6 = var8.getTargetException();
         if (var6 instanceof RuntimeException) {
            throw (RuntimeException)var6;
         } else {
            AssertionError var7 = new AssertionError("Unexpected exception");
            var7.initCause(var6);
            throw var7;
         }
      }
   }

   private Method method_11691(Class<?> var1) {
      Method var4 = null;
      if (this.field_12726 != null) {
         var4 = method_11696(var1, this.field_12726, this.field_12729);
         if (var4 != null && this.field_12727 != null && !this.field_12727.isAssignableFrom(var4.getReturnType())) {
            var4 = null;
         }
      }

      return var4;
   }

   private static Method method_11696(Class<?> var0, String var1, Class[] var2) {
      Method var5 = null;

      try {
         var5 = var0.getMethod(var1, var2);
         if ((var5.getModifiers() & 1) == 0) {
            var5 = null;
         }
      } catch (NoSuchMethodException var7) {
      }

      return var5;
   }
}
