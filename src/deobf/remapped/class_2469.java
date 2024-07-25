package remapped;

import com.google.common.primitives.Floats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class class_2469 {
   private class_9304[] field_12340;
   private Map<class_6998, Integer> field_12341 = new HashMap<class_6998, Integer>();
   public static final Integer field_12339 = new Integer(-1);

   public class_2469(class_9304[] var1) {
      this.field_12340 = var1;
   }

   public Integer method_11357(ItemStack var1, class_174 var2, class_5834 var3) {
      class_6998 var6 = this.method_11361(var1, var2, var3);
      return var6 != null ? this.field_12341.get(var6) : null;
   }

   public void method_11360(ItemStack var1, class_174 var2, class_5834 var3, Integer var4) {
      class_6998 var7 = this.method_11361(var1, var2, var3);
      if (var7 != null) {
         this.field_12341.put(var7, var4);
      }
   }

   private class_6998 method_11361(ItemStack var1, class_174 var2, class_5834 var3) {
      Integer[] var6 = new Integer[this.field_12340.length];

      for (int var7 = 0; var7 < var6.length; var7++) {
         Integer var8 = this.field_12340[var7].method_42959(var1, var2, var3);
         if (var8 == null) {
            return null;
         }

         var6[var7] = var8;
      }

      return new class_6998(var6);
   }

   public static class_2469 method_11358(List<class_2729> var0) {
      if (var0.isEmpty()) {
         return null;
      } else if (!class_7860.field_40172.method_7978()) {
         return null;
      } else {
         LinkedHashMap var3 = new LinkedHashMap();

         for (class_2729 var5 : var0) {
            Map var6 = (Map)class_7860.method_35557(var5, class_7860.field_40172);

            for (Identifier var8 : var6.keySet()) {
               Float var9 = (Float)var6.get(var8);
               if (var9 != null) {
                  Object var10 = (Set)var3.get(var8);
                  if (var10 == null) {
                     var10 = new HashSet();
                     var3.put(var8, var10);
                  }

                  var10.add(var9);
               }
            }
         }

         ArrayList var11 = new ArrayList();

         for (Identifier var14 : var3.keySet()) {
            Set var16 = (Set)var3.get(var14);
            float[] var17 = Floats.toArray(var16);
            class_9304 var18 = new class_9304(var14, var17);
            var11.add(var18);
         }

         class_9304[] var13 = var11.<class_9304>toArray(new class_9304[var11.size()]);
         class_2469 var15 = new class_2469(var13);
         method_11356(var13, var0);
         return var15;
      }
   }

   private static void method_11356(class_9304[] var0, List<class_2729> var1) {
      StringBuffer var4 = new StringBuffer();

      for (int var5 = 0; var5 < var0.length; var5++) {
         class_9304 var6 = var0[var5];
         if (var4.length() > 0) {
            var4.append(", ");
         }

         var4.append("" + var6.method_42960() + "=" + var6.method_42958().length);
      }

      if (var1.size() > 0) {
         var4.append(" -> " + ((class_2729)var1.get(0)).method_12263() + " ...");
      }

      Config.method_14277("ItemOverrideCache: " + var4.toString());
   }

   @Override
   public String toString() {
      return "properties: " + this.field_12340.length + ", modelIndexes: " + this.field_12341.size();
   }
}
