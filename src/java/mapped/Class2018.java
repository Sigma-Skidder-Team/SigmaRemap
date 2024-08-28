package mapped;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class2018 extends Class2013 {
   private static final Logger field13096 = Logger.getLogger(Class2018.class.getPackage().getName());
   public Class<?> field13097;
   private final String field13098;
   private final String field13099;
   private transient Method field13100;
   private transient Method field13101;
   private Field field13102;
   public Class<?>[] field13103;
   private Class2013 field13104;
   private boolean field13105;

   public Class2018(String var1, Class<?> var2, String var3, String var4, Class<?>... var5) {
      super(var1, var2);
      this.field13098 = var3;
      this.field13099 = var4;
      this.method8547(var5);
      this.field13105 = false;
   }

   public Class2018(String var1, Class<?> var2, Class<?>... var3) {
      this(var1, var2, null, null, var3);
   }

   @Override
   public Class<?>[] method8538() {
      return this.field13103 == null && this.field13104 != null ? this.field13104.method8538() : this.field13103;
   }

   public void method8547(Class<?>... var1) {
      if (var1 != null && var1.length > 0) {
         this.field13103 = var1;
      } else {
         this.field13103 = null;
      }
   }

   @Override
   public void method8542(Object var1, Object var2) throws Exception {
      if (this.field13101 == null) {
         if (this.field13102 == null) {
            if (this.field13104 == null) {
               field13096.warning("No setter/delegate for '" + this.method8539() + "' on object " + var1);
            } else {
               this.field13104.method8542(var1, var2);
            }
         } else {
            this.field13102.set(var1, var2);
         }
      } else if (this.field13105) {
         if (var2 != null) {
            if (!(var2 instanceof Collection)) {
               if (!(var2 instanceof Map)) {
                  if (var2.getClass().isArray()) {
                     int var5 = Array.getLength(var2);

                     for (int var6 = 0; var6 < var5; var6++) {
                        this.field13101.invoke(var1, Array.get(var2, var6));
                     }
                  }
               } else {
                  Map<Object, Object> var8 = (Map)var2;

                  for (Entry<Object, Object> var7 : var8.entrySet()) {
                     this.field13101.invoke(var1, var7.getKey(), var7.getValue());
                  }
               }
            } else {
               for (Object var12 : (Collection)var2) {
                  this.field13101.invoke(var1, var12);
               }
            }
         }
      } else {
         this.field13101.invoke(var1, var2);
      }
   }

   @Override
   public Object method8543(Object var1) {
      try {
         if (this.field13100 != null) {
            return this.field13100.invoke(var1);
         }

         if (this.field13102 != null) {
            return this.field13102.get(var1);
         }
      } catch (Exception var5) {
         throw new Class2478("Unable to find getter for property '" + this.method8539() + "' on object " + var1 + ":" + var5);
      }

      if (this.field13104 != null) {
         return this.field13104.method8543(var1);
      } else {
         throw new Class2478("No getter or delegate for property '" + this.method8539() + "' on object " + var1);
      }
   }

   @Override
   public List<Annotation> method8544() {
      Annotation[] var3 = null;
      if (this.field13100 == null) {
         if (this.field13102 != null) {
            var3 = this.field13102.getAnnotations();
         }
      } else {
         var3 = this.field13100.getAnnotations();
      }

      return var3 == null ? this.field13104.method8544() : Arrays.<Annotation>asList(var3);
   }

   @Override
   public <A extends Annotation> A method8545(Class<A> var1) {
      Annotation var4;
      if (this.field13100 == null) {
         if (this.field13102 == null) {
            var4 = this.field13104.method8545(var1);
         } else {
            var4 = this.field13102.getAnnotation(var1);
         }
      } else {
         var4 = this.field13100.getAnnotation(var1);
      }

      return (A)var4;
   }

   public void method8548(Class<?> var1) {
      if (this.field13097 != var1) {
         this.field13097 = var1;
         String var4 = this.method8539();

         for (Class var5 = var1; var5 != null; var5 = var5.getSuperclass()) {
            for (Field var9 : var5.getDeclaredFields()) {
               if (var9.getName().equals(var4)) {
                  int var10 = var9.getModifiers();
                  if (!Modifier.isStatic(var10) && !Modifier.isTransient(var10)) {
                     var9.setAccessible(true);
                     this.field13102 = var9;
                  }
                  break;
               }
            }
         }

         if (this.field13102 == null && field13096.isLoggable(Level.FINE)) {
            field13096.fine(String.format("Failed to find field for %s.%s", var1.getName(), this.method8539()));
         }

         if (this.field13098 != null) {
            this.field13100 = this.method8549(var1, this.field13098);
         }

         if (this.field13099 != null) {
            this.field13105 = false;
            this.field13101 = this.method8549(var1, this.field13099, this.method8537());
            if (this.field13101 == null && this.field13103 != null) {
               this.field13105 = true;
               this.field13101 = this.method8549(var1, this.field13099, this.field13103);
            }
         }
      }
   }

   private Method method8549(Class<?> var1, String var2, Class<?>... var3) {
      for (Class var6 = var1; var6 != null; var6 = var6.getSuperclass()) {
         for (Method var10 : var6.getDeclaredMethods()) {
            if (var2.equals(var10.getName())) {
               Class[] var11 = var10.getParameterTypes();
               if (var11.length == var3.length) {
                  boolean var12 = true;

                  for (int var13 = 0; var13 < var11.length; var13++) {
                     if (!var11[var13].isAssignableFrom(var3[var13])) {
                        var12 = false;
                     }
                  }

                  if (var12) {
                     var10.setAccessible(true);
                     return var10;
                  }
               }
            }
         }
      }

      if (field13096.isLoggable(Level.FINE)) {
         field13096.fine(String.format("Failed to find [%s(%d args)] for %s.%s", var2, var3.length, this.field13097.getName(), this.method8539()));
      }

      return null;
   }

   @Override
   public String method8539() {
      String var3 = super.method8539();
      if (var3 == null) {
         return this.field13104 == null ? null : this.field13104.method8539();
      } else {
         return var3;
      }
   }

   @Override
   public Class<?> method8537() {
      Class var3 = super.method8537();
      if (var3 == null) {
         return this.field13104 == null ? null : this.field13104.method8537();
      } else {
         return var3;
      }
   }

   @Override
   public boolean method8541() {
      return this.field13100 != null || this.field13102 != null || this.field13104 != null && this.field13104.method8541();
   }

   @Override
   public boolean method8540() {
      return this.field13101 != null || this.field13102 != null || this.field13104 != null && this.field13104.method8540();
   }

   public void method8550(Class2013 var1) {
      this.field13104 = var1;
      if (this.field13099 != null && this.field13101 == null && !this.field13105) {
         this.field13105 = true;
         this.field13101 = this.method8549(this.field13097, this.field13099, this.method8538());
      }
   }
}
