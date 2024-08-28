package mapped;

import com.google.common.primitives.Floats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class7704 {
   private Class9682[] field33085;
   private Map<Class9098, Integer> field33086 = new HashMap<Class9098, Integer>();
   public static final Integer field33087 = new Integer(-1);

   public Class7704(Class9682[] var1) {
      this.field33085 = var1;
   }

   public Integer method25457(ItemStack var1, Class1656 var2, Class880 var3) {
      Class9098 var6 = this.method25459(var1, var2, var3);
      return var6 != null ? this.field33086.get(var6) : null;
   }

   public void method25458(ItemStack var1, Class1656 var2, Class880 var3, Integer var4) {
      Class9098 var7 = this.method25459(var1, var2, var3);
      if (var7 != null) {
         this.field33086.put(var7, var4);
      }
   }

   private Class9098 method25459(ItemStack var1, Class1656 var2, Class880 var3) {
      Integer[] var6 = new Integer[this.field33085.length];

      for (int var7 = 0; var7 < var6.length; var7++) {
         Integer var8 = this.field33085[var7].method37908(var1, var2, var3);
         if (var8 == null) {
            return null;
         }

         var6[var7] = var8;
      }

      return new Class9098(var6);
   }

   public static Class7704 method25460(List<Class7781> var0) {
      if (var0.isEmpty()) {
         return null;
      } else if (!Class9299.field43013.method20238()) {
         return null;
      } else {
         Map<ResourceLocation, Set<Float>> var3 = new LinkedHashMap();

         for (Class7781 var5 : var0) {
            Map<ResourceLocation, Float> var6 = (Map<ResourceLocation, Float>) Class9299.method35072(var5, Class9299.field43013);

            for (ResourceLocation var8 : var6.keySet()) {
               Float var9 = var6.get(var8);
               if (var9 != null) {
                  Set var10 = var3.get(var8);
                  if (var10 == null) {
                     var10 = new HashSet();
                     var3.put(var8, var10);
                  }

                  var10.add(var9);
               }
            }
         }

         List<Class9682> var11 = new ArrayList();

         for (ResourceLocation var14 : var3.keySet()) {
            Set var16 = (Set)var3.get(var14);
            float[] var17 = Floats.toArray(var16);
            Class9682 var18 = new Class9682(var14, var17);
            var11.add(var18);
         }

         Class9682[] var13 = var11.toArray(new Class9682[var11.size()]);
         Class7704 var15 = new Class7704(var13);
         method25461(var13, var0);
         return var15;
      }
   }

   private static void method25461(Class9682[] var0, List<Class7781> var1) {
      StringBuffer var4 = new StringBuffer();

      for (int var5 = 0; var5 < var0.length; var5++) {
         Class9682 var6 = var0[var5];
         if (var4.length() > 0) {
            var4.append(", ");
         }

         var4.append("" + var6.method37909() + "=" + var6.method37910().length);
      }

      if (var1.size() > 0) {
         var4.append(" -> " + ((Class7781)var1.get(0)).method25780() + " ...");
      }

      Class7944.method26810("ItemOverrideCache: " + var4.toString());
   }

   @Override
   public String toString() {
      return "properties: " + this.field33085.length + ", modelIndexes: " + this.field33086.size();
   }
}
