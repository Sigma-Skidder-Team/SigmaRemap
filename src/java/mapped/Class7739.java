package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Class7739<T> {
   private final Class<?> field33234;
   private final String field33235;
   private final Class[] field33236;

   public Class7739(Class<?> var1, String var2, Class... var3) {
      this.field33234 = var1;
      this.field33235 = var2;
      this.field33236 = var3;
   }

   public boolean method25619(T var1) {
      return this.method25624(var1.getClass()) != null;
   }

   public Object method25620(T var1, Object... var2) throws InvocationTargetException {
      Method var5 = this.method25624(var1.getClass());
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

   public Object method25621(T var1, Object... var2) {
      try {
         return this.method25620((T)var1, var2);
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

   public Object method25622(T var1, Object... var2) throws InvocationTargetException {
      Method var5 = this.method25624(var1.getClass());
      if (var5 == null) {
         throw new AssertionError("Method " + this.field33235 + " not supported for object " + var1);
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

   public Object method25623(T var1, Object... var2) {
      try {
         return this.method25622((T)var1, var2);
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

   private Method method25624(Class<?> var1) {
      Method var4 = null;
      if (this.field33235 != null) {
         var4 = method25625(var1, this.field33235, this.field33236);
         if (var4 != null && this.field33234 != null && !this.field33234.isAssignableFrom(var4.getReturnType())) {
            var4 = null;
         }
      }

      return var4;
   }

   private static Method method25625(Class<?> var0, String var1, Class[] var2) {
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
