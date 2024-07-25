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
   private final Map<Long, Map<BlockPos, Integer>> field_25471 = Maps.newTreeMap(Ordering.natural().reverse());

   public class_4921(MinecraftClient var1) {
      this.field_25469 = var1;
   }

   public void method_22539(long var1, BlockPos var3) {
      Map var6 = this.field_25471.computeIfAbsent(var1, var0 -> Maps.newHashMap());
      int var7 = var6.getOrDefault(var3, 0);
      var6.put(var3, var7 + 1);
   }

   @Override
   public void method_13698(class_7966 var1, class_2565 var2, double var3, double var5, double var7) {
      long var11 = this.field_25469.theWorld.method_29546();
      short var13 = 200;
      double var14 = 0.0025;
      HashSet var16 = Sets.newHashSet();
      HashMap var17 = Maps.newHashMap();
      class_7907 var18 = var2.method_11645(RenderLayer.method_16744());
      Iterator var19 = this.field_25471.entrySet().iterator();

      while (var19.hasNext()) {
         Entry var20 = (Entry)var19.next();
         Long var21 = (Long)var20.getKey();
         Map var22 = (Map)var20.getValue();
         long var23 = var11 - var21;
         if (var23 <= 200L) {
            for (Entry var26 : var22.entrySet()) {
               BlockPos var27 = (BlockPos)var26.getKey();
               Integer var28 = (Integer)var26.getValue();
               if (var16.add(var27)) {
                  Box var29 = new Box(BlockPos.field_7306)
                     .grow(0.002)
                     .method_18924(0.0025 * (double)var23)
                     .method_18918((double)var27.getX(), (double)var27.getY(), (double)var27.getZ())
                     .method_18918(-var3, -var5, -var7);
                  WorldRenderer.method_20012(
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
         BlockPos var33 = (BlockPos)var32.getKey();
         Integer var30 = (Integer)var32.getValue();
         class_3372.method_15556(String.valueOf(var30), var33.getX(), var33.getY(), var33.getZ(), -1);
      }
   }
}
