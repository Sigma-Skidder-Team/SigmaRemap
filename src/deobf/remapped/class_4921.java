package remapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class class_4921 implements class_2995 {
   private static String[] field_25470;
   private final MinecraftClient field_25469;
   private final Map<Long, Map<class_1331, Integer>> field_25471 = Maps.newTreeMap(Ordering.natural().reverse());

   public class_4921(MinecraftClient var1) {
      this.field_25469 = var1;
   }

   public void method_22539(long var1, class_1331 var3) {
      Map var6 = this.field_25471.computeIfAbsent(var1, var0 -> Maps.newHashMap());
      int var7 = var6.getOrDefault(var3, 0);
      var6.put(var3, var7 + 1);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      long var11 = this.field_25469.field_9601.method_29546();
      short var13 = 200;
      double var14 = 0.0025;
      HashSet var16 = Sets.newHashSet();
      HashMap var17 = Maps.newHashMap();
      class_7907 var18 = var2.method_11645(class_3581.method_16744());
      Iterator var19 = this.field_25471.entrySet().iterator();

      while (var19.hasNext()) {
         Entry var20 = (Entry)var19.next();
         Long var21 = (Long)var20.getKey();
         Map var22 = (Map)var20.getValue();
         long var23 = var11 - var21;
         if (var23 <= 200L) {
            for (Entry var26 : var22.entrySet()) {
               class_1331 var27 = (class_1331)var26.getKey();
               Integer var28 = (Integer)var26.getValue();
               if (var16.add(var27)) {
                  class_4092 var29 = new class_4092(class_1331.field_7306)
                     .method_18898(0.002)
                     .method_18924(0.0025 * (double)var23)
                     .method_18918((double)var27.method_12173(), (double)var27.method_12165(), (double)var27.method_12185())
                     .method_18918(-var3, -var5, -var7);
                  class_4316.method_20012(
                     var1,
                     var18,
                     var29.field_19941,
                     var29.field_19937,
                     var29.field_19938,
                     var29.field_19940,
                     var29.field_19939,
                     var29.field_19942,
                     1.0F,
                     1.0F,
                     1.0F,
                     1.0F
                  );
                  var17.put(var27, var28);
               }
            }
         } else {
            var19.remove();
         }
      }

      for (Entry var32 : var17.entrySet()) {
         class_1331 var33 = (class_1331)var32.getKey();
         Integer var30 = (Integer)var32.getValue();
         class_3372.method_15556(String.valueOf(var30), var33.method_12173(), var33.method_12165(), var33.method_12185(), -1);
      }
   }
}
