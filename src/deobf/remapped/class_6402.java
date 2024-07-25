package remapped;

import java.beans.FeatureDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class class_6402 {
   private final Map<Class<?>, Map<String, class_3002>> field_32679 = new HashMap<Class<?>, Map<String, class_3002>>();
   private final Map<Class<?>, Set<class_3002>> field_32681 = new HashMap<Class<?>, Set<class_3002>>();
   private class_1953 field_32678 = class_1953.field_9964;
   private boolean field_32682 = false;
   private boolean field_32680 = false;
   private class_4461 field_32677;
   private static final String field_32684 = "transient";

   public class_6402() {
      this(new class_4461());
   }

   public class_6402(class_4461 var1) {
      this.field_32677 = var1;
      if (var1.method_20699()) {
         this.field_32678 = class_1953.field_9965;
      }
   }

   public Map<String, class_3002> method_29224(Class<?> var1, class_1953 var2) {
      if (this.field_32679.containsKey(var1)) {
         return this.field_32679.get(var1);
      } else {
         LinkedHashMap var5 = new LinkedHashMap();
         boolean var6 = false;
         switch (var2) {
            case field_9965:
               for (Class var15 = var1; var15 != null; var15 = var15.getSuperclass()) {
                  for (Field var23 : var15.getDeclaredFields()) {
                     int var24 = var23.getModifiers();
                     if (!Modifier.isStatic(var24) && !Modifier.isTransient(var24) && !var5.containsKey(var23.getName())) {
                        var5.put(var23.getName(), new class_936(var23));
                     }
                  }
               }
               break;
            default:
               try {
                  for (PropertyDescriptor var10 : Introspector.getBeanInfo(var1).getPropertyDescriptors()) {
                     Method var11 = var10.getReadMethod();
                     if ((var11 == null || !var11.getName().equals("getClass")) && !this.method_29229(var10)) {
                        var5.put(var10.getName(), new class_7432(var10));
                     }
                  }
               } catch (IntrospectionException var13) {
                  throw new class_5251(var13);
               }

               for (Class var14 = var1; var14 != null; var14 = var14.getSuperclass()) {
                  for (Field var22 : var14.getDeclaredFields()) {
                     int var12 = var22.getModifiers();
                     if (!Modifier.isStatic(var12) && !Modifier.isTransient(var12)) {
                        if (Modifier.isPublic(var12)) {
                           var5.put(var22.getName(), new class_936(var22));
                        } else {
                           var6 = true;
                        }
                     }
                  }
               }
         }

         if (var5.isEmpty() && var6) {
            throw new class_5251("No JavaBean properties found in " + var1.getName());
         } else {
            this.field_32679.put(var1, var5);
            return var5;
         }
      }
   }

   private boolean method_29229(FeatureDescriptor var1) {
      return Boolean.TRUE.equals(var1.getValue("transient"));
   }

   public Set<class_3002> method_29230(Class<? extends Object> var1) {
      return this.method_29231(var1, this.field_32678);
   }

   public Set<class_3002> method_29231(Class<? extends Object> var1, class_1953 var2) {
      if (!this.field_32681.containsKey(var1)) {
         Set var5 = this.method_29226(var1, var2);
         this.field_32681.put(var1, var5);
         return var5;
      } else {
         return this.field_32681.get(var1);
      }
   }

   public Set<class_3002> method_29226(Class<? extends Object> var1, class_1953 var2) {
      TreeSet var5 = new TreeSet();

      for (class_3002 var8 : this.method_29224(var1, var2).values()) {
         if (var8.method_13709() && (this.field_32682 || var8.method_13710())) {
            var5.add(var8);
         }
      }

      return var5;
   }

   public class_3002 method_29227(Class<? extends Object> var1, String var2) {
      return this.method_29228(var1, var2, this.field_32678);
   }

   public class_3002 method_29228(Class<? extends Object> var1, String var2, class_1953 var3) {
      Map var6 = this.method_29224(var1, var3);
      Object var7 = (class_3002)var6.get(var2);
      if (var7 == null && this.field_32680) {
         var7 = new class_1081(var2);
      }

      if (var7 != null) {
         return (class_3002)var7;
      } else {
         throw new class_5251("Unable to find property '" + var2 + "' on class: " + var1.getName());
      }
   }

   public void method_29232(class_1953 var1) {
      if (this.field_32677.method_20699() && var1 != class_1953.field_9965) {
         throw new IllegalArgumentException("JVM is Android - only BeanAccess.FIELD is available");
      } else {
         if (this.field_32678 != var1) {
            this.field_32678 = var1;
            this.field_32679.clear();
            this.field_32681.clear();
         }
      }
   }

   public void method_29222(boolean var1) {
      if (this.field_32682 != var1) {
         this.field_32682 = var1;
         this.field_32681.clear();
      }
   }

   public boolean method_29220() {
      return this.field_32682;
   }

   public void method_29225(boolean var1) {
      if (this.field_32680 != var1) {
         this.field_32680 = var1;
         this.field_32681.clear();
      }
   }

   public boolean method_29223() {
      return this.field_32680;
   }
}
