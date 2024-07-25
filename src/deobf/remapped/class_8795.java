package remapped;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class class_8795 {
   private static final Logger field_45001 = Logger.getLogger(class_8795.class.getPackage().getName());
   private final Class<? extends Object> field_44998;
   private Class<?> field_44995;
   private class_9592 field_44997;
   private transient Set<class_3002> field_45004;
   private transient class_6402 field_45000;
   private transient boolean field_44996;
   private Map<String, class_5691> field_44993 = Collections.<String, class_5691>emptyMap();
   public Set<String> field_44994 = Collections.<String>emptySet();
   public String[] field_45003 = null;
   public class_1953 field_45002;

   public class_8795(Class<? extends Object> var1, class_9592 var2) {
      this(var1, var2, null);
   }

   public class_8795(Class<? extends Object> var1, class_9592 var2, Class<?> var3) {
      this.field_44998 = var1;
      this.field_44997 = var2;
      this.field_44995 = var3;
      this.field_45002 = null;
   }

   public class_8795(Class<? extends Object> var1, String var2) {
      this(var1, new class_9592(var2), null);
   }

   public class_8795(Class<? extends Object> var1) {
      this(var1, (class_9592)null, null);
   }

   public class_8795(Class<? extends Object> var1, Class<?> var2) {
      this(var1, null, var2);
   }

   public class_9592 method_40412() {
      return this.field_44997;
   }

   public void method_40423(class_9592 var1) {
      this.field_44997 = var1;
   }

   public void method_40422(String var1) {
      this.method_40423(new class_9592(var1));
   }

   public Class<? extends Object> method_40413() {
      return this.field_44998;
   }

   @Deprecated
   public void method_40425(String var1, Class<? extends Object> var2) {
      this.method_40419(var1, var2);
   }

   @Deprecated
   public Class<? extends Object> method_40429(String var1) {
      if (this.field_44993.containsKey(var1)) {
         Class[] var4 = this.field_44993.get(var1).method_13708();
         if (var4 != null && var4.length > 0) {
            return var4[0];
         }
      }

      return null;
   }

   @Deprecated
   public void method_40430(String var1, Class<? extends Object> var2, Class<? extends Object> var3) {
      this.method_40419(var1, var2, var3);
   }

   @Deprecated
   public Class<? extends Object> method_40420(String var1) {
      if (this.field_44993.containsKey(var1)) {
         Class[] var4 = this.field_44993.get(var1).method_13708();
         if (var4 != null && var4.length > 0) {
            return var4[0];
         }
      }

      return null;
   }

   @Deprecated
   public Class<? extends Object> method_40426(String var1) {
      if (this.field_44993.containsKey(var1)) {
         Class[] var4 = this.field_44993.get(var1).method_13708();
         if (var4 != null && var4.length > 1) {
            return var4[1];
         }
      }

      return null;
   }

   public void method_40419(String var1, Class<?>... var2) {
      if (this.field_44993.containsKey(var1)) {
         class_5691 var5 = this.field_44993.get(var1);
         var5.method_25744(var2);
      } else {
         this.method_40427(var1, null, null, null, var2);
      }
   }

   @Override
   public String toString() {
      return "TypeDescription for " + this.method_40413() + " (tag='" + this.method_40412() + "')";
   }

   private void method_40414() {
      for (class_5691 var5 : this.field_44993.values()) {
         try {
            var5.method_25742(this.method_40406(var5.method_13713()));
         } catch (class_5251 var7) {
         }
      }

      this.field_44996 = true;
   }

   private class_3002 method_40406(String var1) {
      if (this.field_45000 == null) {
         return null;
      } else {
         return this.field_45002 != null
            ? this.field_45000.method_29228(this.field_44998, var1, this.field_45002)
            : this.field_45000.method_29227(this.field_44998, var1);
      }
   }

   public class_3002 method_40410(String var1) {
      if (!this.field_44996) {
         this.method_40414();
      }

      return !this.field_44993.containsKey(var1) ? this.method_40406(var1) : this.field_44993.get(var1);
   }

   public void method_40427(String var1, Class<?> var2, String var3, String var4, Class<?>... var5) {
      this.method_40428(new class_5691(var1, var2, var3, var4, var5));
   }

   public void method_40428(class_5691 var1) {
      if (Collections.EMPTY_MAP == this.field_44993) {
         this.field_44993 = new LinkedHashMap<String, class_5691>();
      }

      var1.method_25741(this.field_44998);
      this.field_44993.put(var1.method_13713(), var1);
   }

   public void method_40408(class_6402 var1) {
      this.field_45000 = var1;
   }

   public void method_40409(String... var1) {
      this.field_45003 = var1 != null && var1.length > 0 ? var1 : null;
   }

   public void method_40424(String... var1) {
      if (var1 != null && var1.length > 0) {
         this.field_44994 = new HashSet<String>();

         for (String var7 : var1) {
            this.field_44994.add(var7);
         }
      } else {
         this.field_44994 = Collections.<String>emptySet();
      }
   }

   public Set<class_3002> method_40411() {
      if (this.field_45004 == null) {
         if (this.field_45000 == null) {
            return null;
         } else if (this.field_45003 == null) {
            Set var7 = this.field_45002 != null
               ? this.field_45000.method_29231(this.field_44998, this.field_45002)
               : this.field_45000.method_29230(this.field_44998);
            if (!this.field_44993.isEmpty()) {
               if (!this.field_44996) {
                  this.method_40414();
               }

               this.field_45004 = new LinkedHashSet<class_3002>();

               for (class_3002 var12 : this.field_44993.values()) {
                  if (!this.field_44994.contains(var12.method_13713()) && var12.method_13709()) {
                     this.field_45004.add(var12);
                  }
               }

               for (class_3002 var13 : var7) {
                  if (!this.field_44994.contains(var13.method_13713())) {
                     this.field_45004.add(var13);
                  }
               }

               return this.field_45004;
            } else if (!this.field_44994.isEmpty()) {
               this.field_45004 = new LinkedHashSet<class_3002>();

               for (class_3002 var11 : var7) {
                  if (!this.field_44994.contains(var11.method_13713())) {
                     this.field_45004.add(var11);
                  }
               }

               return this.field_45004;
            } else {
               return this.field_45004 = var7;
            }
         } else {
            this.field_45004 = new LinkedHashSet<class_3002>();

            for (String var6 : this.field_45003) {
               if (!this.field_44994.contains(var6)) {
                  this.field_45004.add(this.method_40410(var6));
               }
            }

            return this.field_45004;
         }
      } else {
         return this.field_45004;
      }
   }

   public boolean method_40407(String var1, class_1621 var2) {
      return false;
   }

   public boolean method_40415(Object var1, String var2, Object var3) throws Exception {
      return false;
   }

   public Object method_40417(class_1621 var1) {
      if (this.field_44995 != null) {
         try {
            Constructor var4 = this.field_44995.getDeclaredConstructor();
            var4.setAccessible(true);
            return var4.newInstance();
         } catch (Exception var5) {
            field_45001.fine(var5.getLocalizedMessage());
            this.field_44995 = null;
         }
      }

      return null;
   }

   public Object method_40416(String var1, class_1621 var2) {
      return null;
   }

   public Object method_40421(Object var1) {
      return var1;
   }
}
