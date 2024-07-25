package remapped;

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

public class class_5691 extends class_3002 {
   private static final Logger field_28821 = Logger.getLogger(class_5691.class.getPackage().getName());
   public Class<?> field_28827;
   private final String field_28828;
   private final String field_28822;
   private transient Method field_28818;
   private transient Method field_28819;
   private Field field_28825;
   public Class<?>[] field_28826;
   private class_3002 field_28823;
   private boolean field_28820;

   public class_5691(String var1, Class<?> var2, String var3, String var4, Class<?>... var5) {
      super(var1, var2);
      this.field_28828 = var3;
      this.field_28822 = var4;
      this.method_25744(var5);
      this.field_28820 = false;
   }

   public class_5691(String var1, Class<?> var2, Class<?>... var3) {
      this(var1, var2, null, null, var3);
   }

   @Override
   public Class<?>[] method_13708() {
      return this.field_28826 == null && this.field_28823 != null ? this.field_28823.method_13708() : this.field_28826;
   }

   public void method_25744(Class<?>... var1) {
      if (var1 != null && var1.length > 0) {
         this.field_28826 = var1;
      } else {
         this.field_28826 = null;
      }
   }

   @Override
   public void method_13704(Object var1, Object var2) throws Exception {
      if (this.field_28819 == null) {
         if (this.field_28825 == null) {
            if (this.field_28823 == null) {
               field_28821.warning("No setter/delegate for '" + this.method_13713() + "' on object " + var1);
            } else {
               this.field_28823.method_13704(var1, var2);
            }
         } else {
            this.field_28825.set(var1, var2);
         }
      } else if (this.field_28820) {
         if (var2 != null) {
            if (!(var2 instanceof Collection)) {
               if (!(var2 instanceof Map)) {
                  if (var2.getClass().isArray()) {
                     int var5 = Array.getLength(var2);

                     for (int var6 = 0; var6 < var5; var6++) {
                        this.field_28819.invoke(var1, Array.get(var2, var6));
                     }
                  }
               } else {
                  Map var8 = (Map)var2;

                  for (Entry var7 : var8.entrySet()) {
                     this.field_28819.invoke(var1, var7.getKey(), var7.getValue());
                  }
               }
            } else {
               for (Object var12 : (Collection)var2) {
                  this.field_28819.invoke(var1, var12);
               }
            }
         }
      } else {
         this.field_28819.invoke(var1, var2);
      }
   }

   @Override
   public Object method_13705(Object var1) {
      try {
         if (this.field_28818 != null) {
            return this.field_28818.invoke(var1);
         }

         if (this.field_28825 != null) {
            return this.field_28825.get(var1);
         }
      } catch (Exception var5) {
         throw new class_5251("Unable to find getter for property '" + this.method_13713() + "' on object " + var1 + ":" + var5);
      }

      if (this.field_28823 != null) {
         return this.field_28823.method_13705(var1);
      } else {
         throw new class_5251("No getter or delegate for property '" + this.method_13713() + "' on object " + var1);
      }
   }

   @Override
   public List<Annotation> method_13712() {
      Annotation[] var3 = null;
      if (this.field_28818 == null) {
         if (this.field_28825 != null) {
            var3 = this.field_28825.getAnnotations();
         }
      } else {
         var3 = this.field_28818.getAnnotations();
      }

      return var3 == null ? this.field_28823.method_13712() : Arrays.<Annotation>asList(var3);
   }

   @Override
   public <A extends Annotation> A method_13706(Class<A> var1) {
      Annotation var4;
      if (this.field_28818 == null) {
         if (this.field_28825 == null) {
            var4 = this.field_28823.<Annotation>method_13706(var1);
         } else {
            var4 = this.field_28825.<Annotation>getAnnotation(var1);
         }
      } else {
         var4 = this.field_28818.<Annotation>getAnnotation(var1);
      }

      return (A)var4;
   }

   public void method_25741(Class<?> var1) {
      if (this.field_28827 != var1) {
         this.field_28827 = var1;
         String var4 = this.method_13713();

         for (Class var5 = var1; var5 != null; var5 = var5.getSuperclass()) {
            for (Field var9 : var5.getDeclaredFields()) {
               if (var9.getName().equals(var4)) {
                  int var10 = var9.getModifiers();
                  if (!Modifier.isStatic(var10) && !Modifier.isTransient(var10)) {
                     var9.setAccessible(true);
                     this.field_28825 = var9;
                  }
                  break;
               }
            }
         }

         if (this.field_28825 == null && field_28821.isLoggable(Level.FINE)) {
            field_28821.fine(String.format("Failed to find field for %s.%s", var1.getName(), this.method_13713()));
         }

         if (this.field_28828 != null) {
            this.field_28818 = this.method_25743(var1, this.field_28828);
         }

         if (this.field_28822 != null) {
            this.field_28820 = false;
            this.field_28819 = this.method_25743(var1, this.field_28822, this.method_13707());
            if (this.field_28819 == null && this.field_28826 != null) {
               this.field_28820 = true;
               this.field_28819 = this.method_25743(var1, this.field_28822, this.field_28826);
            }
         }
      }
   }

   private Method method_25743(Class<?> var1, String var2, Class<?>... var3) {
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

      if (field_28821.isLoggable(Level.FINE)) {
         field_28821.fine(String.format("Failed to find [%s(%d args)] for %s.%s", var2, var3.length, this.field_28827.getName(), this.method_13713()));
      }

      return null;
   }

   @Override
   public String method_13713() {
      String var3 = super.method_13713();
      if (var3 == null) {
         return this.field_28823 == null ? null : this.field_28823.method_13713();
      } else {
         return var3;
      }
   }

   @Override
   public Class<?> method_13707() {
      Class var3 = super.method_13707();
      if (var3 == null) {
         return this.field_28823 == null ? null : this.field_28823.method_13707();
      } else {
         return var3;
      }
   }

   @Override
   public boolean method_13709() {
      return this.field_28818 != null || this.field_28825 != null || this.field_28823 != null && this.field_28823.method_13709();
   }

   @Override
   public boolean method_13710() {
      return this.field_28819 != null || this.field_28825 != null || this.field_28823 != null && this.field_28823.method_13710();
   }

   public void method_25742(class_3002 var1) {
      this.field_28823 = var1;
      if (this.field_28822 != null && this.field_28819 == null && !this.field_28820) {
         this.field_28820 = true;
         this.field_28819 = this.method_25743(this.field_28827, this.field_28822, this.method_13708());
      }
   }
}
