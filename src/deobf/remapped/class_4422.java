package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_4422 extends class_1131 {
   private static String[] field_21616;
   public static final Codec<class_4422> field_21615 = RecordCodecBuilder.create(var0 -> method_4972(var0).apply(var0, class_4422::new));

   public class_4422(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_7027<?> method_4970() {
      return class_7027.field_36193;
   }

   @Override
   public List<class_8070> method_4966(class_6755 var1, Random var2, int var3, BlockPos var4, Set<BlockPos> var5, class_9616 var6, class_1297 var7) {
      method_4969(var1, var4.method_6100());
      ArrayList var10 = Lists.newArrayList();
      Direction var11 = class_9594.field_48893.method_44313(var2);
      int var12 = var3 - var2.nextInt(4) - 1;
      int var13 = 3 - var2.nextInt(3);
      class_2921 var14 = new class_2921();
      int var15 = var4.getX();
      int var16 = var4.method_12185();
      int var17 = 0;

      for (int var18 = 0; var18 < var3; var18++) {
         int var19 = var4.method_12165() + var18;
         if (var18 >= var12 && var13 > 0) {
            var15 += var11.method_1041();
            var16 += var11.method_1034();
            var13--;
         }

         if (method_4974(var1, var2, var14.method_13362(var15, var19, var16), var5, var6, var7)) {
            var17 = var19 + 1;
         }
      }

      var10.add(new class_8070(new BlockPos(var15, var17, var16), 1, false));
      var15 = var4.getX();
      var16 = var4.method_12185();
      Direction var26 = class_9594.field_48893.method_44313(var2);
      if (var26 != var11) {
         int var27 = var12 - var2.nextInt(2) - 1;
         int var20 = 1 + var2.nextInt(3);
         var17 = 0;

         for (int var21 = var27; var21 < var3 && var20 > 0; var20--) {
            if (var21 >= 1) {
               int var22 = var4.method_12165() + var21;
               var15 += var26.method_1041();
               var16 += var26.method_1034();
               if (method_4974(var1, var2, var14.method_13362(var15, var22, var16), var5, var6, var7)) {
                  var17 = var22 + 1;
               }
            }

            var21++;
         }

         if (var17 > 1) {
            var10.add(new class_8070(new BlockPos(var15, var17, var16), 0, false));
         }
      }

      return var10;
   }
}
