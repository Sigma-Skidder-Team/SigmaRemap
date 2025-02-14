package mapped;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

public class Class9545 {
   private static final Logger field44439 = Logger.getLogger(Class9545.class.getPackage().getName());
   private final Class<? extends Object> field44440;
   private Class<?> field44441;
   private Class9757 field44442;
   private transient Set<Class2013> field44443;
   private transient Class8923 field44444;
   private transient boolean field44445;
   private Map<String, Class2018> field44446 = Collections.<String, Class2018>emptyMap();
   public Set<String> field44447 = Collections.<String>emptySet();
   public String[] field44448 = null;
   public Class2088 field44449;

   public Class9545(Class<? extends Object> var1, Class9757 var2) {
      this(var1, var2, null);
   }

   public Class9545(Class<? extends Object> var1, Class9757 var2, Class<?> var3) {
      this.field44440 = var1;
      this.field44442 = var2;
      this.field44441 = var3;
      this.field44449 = null;
   }

   public Class9545(Class<? extends Object> var1, String var2) {
      this(var1, new Class9757(var2), null);
   }

   public Class9545(Class<? extends Object> var1) {
      this(var1, (Class9757)null, null);
   }

   public Class9545(Class<? extends Object> var1, Class<?> var2) {
      this(var1, null, var2);
   }

   public Class9757 method36939() {
      return this.field44442;
   }

   public void method36940(Class9757 var1) {
      this.field44442 = var1;
   }

   public void method36941(String var1) {
      this.method36940(new Class9757(var1));
   }

   public Class<? extends Object> method36942() {
      return this.field44440;
   }

   @Deprecated
   public void method36943(String var1, Class<? extends Object> var2) {
      this.method36948(var1, var2);
   }

   @Deprecated
   public Class<? extends Object> method36944(String var1) {
      if (this.field44446.containsKey(var1)) {
         Class[] var4 = this.field44446.get(var1).method8538();
         if (var4 != null && var4.length > 0) {
            return var4[0];
         }
      }

      return null;
   }

   @Deprecated
   public void method36945(String var1, Class<? extends Object> var2, Class<? extends Object> var3) {
      this.method36948(var1, var2, var3);
   }

   @Deprecated
   public Class<? extends Object> method36946(String var1) {
      if (this.field44446.containsKey(var1)) {
         Class[] var4 = this.field44446.get(var1).method8538();
         if (var4 != null && var4.length > 0) {
            return var4[0];
         }
      }

      return null;
   }

   @Deprecated
   public Class<? extends Object> method36947(String var1) {
      if (this.field44446.containsKey(var1)) {
         Class[] var4 = this.field44446.get(var1).method8538();
         if (var4 != null && var4.length > 1) {
            return var4[1];
         }
      }

      return null;
   }

   public void method36948(String var1, Class<?>... var2) {
      if (this.field44446.containsKey(var1)) {
         Class2018 var5 = this.field44446.get(var1);
         var5.method8547(var2);
      } else {
         this.method36952(var1, null, null, null, var2);
      }
   }

   @Override
   public String toString() {
      return "TypeDescription for " + this.method36942() + " (tag='" + this.method36939() + "')";
   }

   private void method36949() {
      for (Class2018 var5 : this.field44446.values()) {
         try {
            var5.method8550(this.method36950(var5.method8539()));
         } catch (Class2478 var7) {
         }
      }

      this.field44445 = true;
   }

   private Class2013 method36950(String var1) {
      if (this.field44444 == null) {
         return null;
      } else {
         return this.field44449 != null
            ? this.field44444.method32618(this.field44440, var1, this.field44449)
            : this.field44444.method32617(this.field44440, var1);
      }
   }

   public Class2013 method36951(String var1) {
      if (!this.field44445) {
         this.method36949();
      }

      return !this.field44446.containsKey(var1) ? this.method36950(var1) : this.field44446.get(var1);
   }

   public void method36952(String var1, Class<?> var2, String var3, String var4, Class<?>... var5) {
      this.method36953(new Class2018(var1, var2, var3, var4, var5));
   }

   public void method36953(Class2018 var1) {
      if (Collections.EMPTY_MAP == this.field44446) {
         this.field44446 = new LinkedHashMap<String, Class2018>();
      }

      var1.method8548(this.field44440);
      this.field44446.put(var1.method8539(), var1);
   }

   public void method36954(Class8923 var1) {
      this.field44444 = var1;
   }

   public void method36955(String... var1) {
      this.field44448 = var1 != null && var1.length > 0 ? var1 : null;
   }

   public void method36956(String... var1) {
      if (var1 != null && var1.length > 0) {
         this.field44447 = new HashSet<String>();

         for (String var7 : var1) {
            this.field44447.add(var7);
         }
      } else {
         this.field44447 = Collections.<String>emptySet();
      }
   }

   public Set<Class2013> method36957() {
      if (this.field44443 == null) {
         if (this.field44444 == null) {
            return null;
         } else if (this.field44448 == null) {
            Set<Class2013> var7 = this.field44449 != null ? this.field44444.method32615(this.field44440, this.field44449) : this.field44444.method32614(this.field44440);
            if (!this.field44446.isEmpty()) {
               if (!this.field44445) {
                  this.method36949();
               }

               this.field44443 = new LinkedHashSet<Class2013>();

               for (Class2013 var12 : this.field44446.values()) {
                  if (!this.field44447.contains(var12.method8539()) && var12.method8541()) {
                     this.field44443.add(var12);
                  }
               }

               for (Class2013 var13 : var7) {
                  if (!this.field44447.contains(var13.method8539())) {
                     this.field44443.add(var13);
                  }
               }

               return this.field44443;
            } else if (!this.field44447.isEmpty()) {
               this.field44443 = new LinkedHashSet<Class2013>();

               for (Class2013 var11 : var7) {
                  if (!this.field44447.contains(var11.method8539())) {
                     this.field44443.add(var11);
                  }
               }

               return this.field44443;
            } else {
               return this.field44443 = var7;
            }
         } else {
            this.field44443 = new LinkedHashSet<Class2013>();

            for (String var6 : this.field44448) {
               if (!this.field44447.contains(var6)) {
                  this.field44443.add(this.method36951(var6));
               }
            }

            return this.field44443;
         }
      } else {
         return this.field44443;
      }
   }

   public boolean method36958(String var1, Class7255 var2) {
      return false;
   }

   public boolean method36959(Object var1, String var2, Object var3) throws Exception {
      return false;
   }

   public Object method36960(Class7255 var1) {
      if (this.field44441 != null) {
         try {
            Constructor var4 = this.field44441.getDeclaredConstructor();
            var4.setAccessible(true);
            return var4.newInstance();
         } catch (Exception var5) {
            field44439.fine(var5.getLocalizedMessage());
            this.field44441 = null;
         }
      }

      return null;
   }

   public Object method36961(String var1, Class7255 var2) {
      return null;
   }

   public Object method36962(Object var1) {
      return var1;
   }
}
