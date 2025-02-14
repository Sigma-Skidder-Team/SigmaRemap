package mapped;

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

public class Class8923 {
   private final Map<Class<?>, Map<String, Class2013>> field40394 = new HashMap<Class<?>, Map<String, Class2013>>();
   private final Map<Class<?>, Set<Class2013>> field40395 = new HashMap<Class<?>, Set<Class2013>>();
   private Class2088 field40396 = Class2088.field13610;
   private boolean field40397 = false;
   private boolean field40398 = false;
   private Class8392 field40399;
   private static final String field40400 = "transient";

   public Class8923() {
      this(new Class8392());
   }

   public Class8923(Class8392 var1) {
      this.field40399 = var1;
      if (var1.method29440()) {
         this.field40396 = Class2088.field13611;
      }
   }

   public Map<String, Class2013> method32612(Class<?> var1, Class2088 var2) {
      if (this.field40394.containsKey(var1)) {
         return this.field40394.get(var1);
      } else {
         LinkedHashMap var5 = new LinkedHashMap();
         boolean var6 = false;
         switch (Class8344.field35869[var2.ordinal()]) {
            case 1:
               for (Class var15 = var1; var15 != null; var15 = var15.getSuperclass()) {
                  for (Field var23 : var15.getDeclaredFields()) {
                     int var24 = var23.getModifiers();
                     if (!Modifier.isStatic(var24) && !Modifier.isTransient(var24) && !var5.containsKey(var23.getName())) {
                        var5.put(var23.getName(), new Class2016(var23));
                     }
                  }
               }
               break;
            default:
               try {
                  for (PropertyDescriptor var10 : Introspector.getBeanInfo(var1).getPropertyDescriptors()) {
                     Method var11 = var10.getReadMethod();
                     if ((var11 == null || !var11.getName().equals("getClass")) && !this.method32613(var10)) {
                        var5.put(var10.getName(), new Class2015(var10));
                     }
                  }
               } catch (IntrospectionException var13) {
                  throw new Class2478(var13);
               }

               for (Class var14 = var1; var14 != null; var14 = var14.getSuperclass()) {
                  for (Field var22 : var14.getDeclaredFields()) {
                     int var12 = var22.getModifiers();
                     if (!Modifier.isStatic(var12) && !Modifier.isTransient(var12)) {
                        if (Modifier.isPublic(var12)) {
                           var5.put(var22.getName(), new Class2016(var22));
                        } else {
                           var6 = true;
                        }
                     }
                  }
               }
         }

         if (var5.isEmpty() && var6) {
            throw new Class2478("No JavaBean properties found in " + var1.getName());
         } else {
            this.field40394.put(var1, var5);
            return var5;
         }
      }
   }

   private boolean method32613(FeatureDescriptor var1) {
      return Boolean.TRUE.equals(var1.getValue("transient"));
   }

   public Set<Class2013> method32614(Class<? extends Object> var1) {
      return this.method32615(var1, this.field40396);
   }

   public Set<Class2013> method32615(Class<? extends Object> var1, Class2088 var2) {
      if (!this.field40395.containsKey(var1)) {
         Set var5 = this.method32616(var1, var2);
         this.field40395.put(var1, var5);
         return var5;
      } else {
         return this.field40395.get(var1);
      }
   }

   public Set<Class2013> method32616(Class<? extends Object> var1, Class2088 var2) {
      TreeSet var5 = new TreeSet();

      for (Class2013 var8 : this.method32612(var1, var2).values()) {
         if (var8.method8541() && (this.field40397 || var8.method8540())) {
            var5.add(var8);
         }
      }

      return var5;
   }

   public Class2013 method32617(Class<? extends Object> var1, String var2) {
      return this.method32618(var1, var2, this.field40396);
   }

   public Class2013 method32618(Class<? extends Object> var1, String var2, Class2088 var3) {
      Map var6 = this.method32612(var1, var3);
      Object var7 = (Class2013)var6.get(var2);
      if (var7 == null && this.field40398) {
         var7 = new Class2017(var2);
      }

      if (var7 != null) {
         return (Class2013)var7;
      } else {
         throw new Class2478("Unable to find property '" + var2 + "' on class: " + var1.getName());
      }
   }

   public void method32619(Class2088 var1) {
      if (this.field40399.method29440() && var1 != Class2088.field13611) {
         throw new IllegalArgumentException("JVM is Android - only BeanAccess.FIELD is available");
      } else {
         if (this.field40396 != var1) {
            this.field40396 = var1;
            this.field40394.clear();
            this.field40395.clear();
         }
      }
   }

   public void method32620(boolean var1) {
      if (this.field40397 != var1) {
         this.field40397 = var1;
         this.field40395.clear();
      }
   }

   public boolean method32621() {
      return this.field40397;
   }

   public void method32622(boolean var1) {
      if (this.field40398 != var1) {
         this.field40398 = var1;
         this.field40395.clear();
      }
   }

   public boolean method32623() {
      return this.field40398;
   }
}
