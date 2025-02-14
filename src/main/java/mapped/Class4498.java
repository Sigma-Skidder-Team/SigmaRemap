package mapped;

import java.util.*;
import java.util.Map.Entry;

public abstract class Class4498 {
   public final Map<Class<?>, Class6180> field21711 = new HashMap<Class<?>, Class6180>();
   public Class6180 field21712;
   public final Map<Class<?>, Class6180> field21713 = new LinkedHashMap<Class<?>, Class6180>();
   public Class1857 field21714 = null;
   public Class2214 field21715 = Class2214.field14477;
   public final Map<Object, Class7255> field21716 = new Class17(this);
   public Object field21717;
   private Class8923 field21718;
   private boolean field21719 = false;

   public Class7255 method14190(Object var1) {
      Class7255 var4 = this.method14191(var1);
      this.field21716.clear();
      this.field21717 = null;
      return var4;
   }

   public final Class7255 method14191(Object var1) {
      this.field21717 = var1;
      if (!this.field21716.containsKey(this.field21717)) {
         if (var1 == null) {
            return this.field21712.method19088(null);
         } else {
            Class var4 = var1.getClass();
            Class7255 var6;
            if (!this.field21711.containsKey(var4)) {
               for (Class var7 : this.field21713.keySet()) {
                  if (var7 != null && var7.isInstance(var1)) {
                     Class6180 var8 = this.field21713.get(var7);
                     return var8.method19088(var1);
                  }
               }

               if (!this.field21713.containsKey(null)) {
                  Class6180 var9 = this.field21711.get(null);
                  var6 = var9.method19088(var1);
               } else {
                  Class6180 var10 = this.field21713.get(null);
                  var6 = var10.method19088(var1);
               }
            } else {
               Class6180 var11 = this.field21711.get(var4);
               var6 = var11.method19088(var1);
            }

            return var6;
         }
      } else {
         return this.field21716.get(this.field21717);
      }
   }

   public Class7255 method14192(Class9757 var1, String var2, Class1857 var3) {
      if (var3 == null) {
         var3 = this.field21714;
      }

      return new Class7256(var1, var2, null, null, var3);
   }

   public Class7255 method14193(Class9757 var1, String var2) {
      return this.method14192(var1, var2, null);
   }

   public Class7255 method14194(Class9757 var1, Iterable<?> var2, Class2214 var3) {
      int var6 = 10;
      if (var2 instanceof List) {
         var6 = ((List)var2).size();
      }

      ArrayList var7 = new ArrayList(var6);
      Class7252 var8 = new Class7252(var1, var7, var3);
      this.field21716.put(this.field21717, var8);
      Class2214 var9 = Class2214.field14475;

      for (Object var11 : var2) {
         Class7255 var12 = this.method14191(var11);
         if (!(var12 instanceof Class7256) || !((Class7256)var12).method22792()) {
            var9 = Class2214.field14476;
         }

         var7.add(var12);
      }

      if (var3 == Class2214.field14477) {
         if (this.field21715 == Class2214.field14477) {
            var8.method22773(var9);
         } else {
            var8.method22773(this.field21715);
         }
      }

      return var8;
   }

   public Class7255 method14195(Class9757 var1, Map<?, ?> var2, Class2214 var3) {
      ArrayList var6 = new ArrayList(var2.size());
      Class7254 var7 = new Class7254(var1, var6, var3);
      this.field21716.put(this.field21717, var7);
      Class2214 var8 = Class2214.field14475;

      for (Entry var10 : var2.entrySet()) {
         Class7255 var11 = this.method14191(var10.getKey());
         Class7255 var12 = this.method14191(var10.getValue());
         if (!(var11 instanceof Class7256) || !((Class7256)var11).method22792()) {
            var8 = Class2214.field14476;
         }

         if (!(var12 instanceof Class7256) || !((Class7256)var12).method22792()) {
            var8 = Class2214.field14476;
         }

         var6.add(new Class9460(var11, var12));
      }

      if (var3 == Class2214.field14477) {
         if (this.field21715 == Class2214.field14477) {
            var7.method22773(var8);
         } else {
            var7.method22773(this.field21715);
         }
      }

      return var7;
   }

   public void method14196(Class1857 var1) {
      this.field21714 = var1;
   }

   public Class1857 method14197() {
      return this.field21714 != null ? this.field21714 : Class1857.field9898;
   }

   public void method14198(Class2214 var1) {
      this.field21715 = var1;
   }

   public Class2214 method14199() {
      return this.field21715;
   }

   public void method14200(Class8923 var1) {
      this.field21718 = var1;
      this.field21719 = true;
   }

   public final Class8923 method14201() {
      if (this.field21718 == null) {
         this.field21718 = new Class8923();
      }

      return this.field21718;
   }

   public final boolean method14202() {
      return this.field21719;
   }
}
