package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class class_9125 extends class_1131 {
   private static String[] field_46685;
   public static final Codec<class_9125> field_46686 = RecordCodecBuilder.create(var0 -> method_4972(var0).apply(var0, class_9125::new));

   public class_9125(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   @Override
   public class_7027<?> method_4970() {
      return class_7027.field_36194;
   }

   @Override
   public List<class_8070> method_4966(class_6755 var1, Random var2, int var3, class_1331 var4, Set<class_1331> var5, class_9616 var6, class_1297 var7) {
      ArrayList var10 = Lists.newArrayList();
      class_1331 var11 = var4.method_6100();
      method_4969(var1, var11);
      method_4969(var1, var11.method_6090());
      method_4969(var1, var11.method_6073());
      method_4969(var1, var11.method_6073().method_6090());
      Direction var12 = class_9594.field_48893.method_44313(var2);
      int var13 = var3 - var2.nextInt(4);
      int var14 = 2 - var2.nextInt(3);
      int var15 = var4.method_12173();
      int var16 = var4.method_12165();
      int var17 = var4.method_12185();
      int var18 = var15;
      int var19 = var17;
      int var20 = var16 + var3 - 1;

      for (int var21 = 0; var21 < var3; var21++) {
         if (var21 >= var13 && var14 > 0) {
            var18 += var12.method_1041();
            var19 += var12.method_1034();
            var14--;
         }

         int var22 = var16 + var21;
         class_1331 var23 = new class_1331(var18, var22, var19);
         if (class_8739.method_40118(var1, var23)) {
            method_4974(var1, var2, var23, var5, var6, var7);
            method_4974(var1, var2, var23.method_6090(), var5, var6, var7);
            method_4974(var1, var2, var23.method_6073(), var5, var6, var7);
            method_4974(var1, var2, var23.method_6090().method_6073(), var5, var6, var7);
         }
      }

      var10.add(new class_8070(new class_1331(var18, var20, var19), 0, true));

      for (int var25 = -1; var25 <= 2; var25++) {
         for (int var26 = -1; var26 <= 2; var26++) {
            if ((var25 < 0 || var25 > 1 || var26 < 0 || var26 > 1) && var2.nextInt(3) <= 0) {
               int var27 = var2.nextInt(3) + 2;

               for (int var24 = 0; var24 < var27; var24++) {
                  method_4974(var1, var2, new class_1331(var15 + var25, var20 - var24 - 1, var17 + var26), var5, var6, var7);
               }

               var10.add(new class_8070(new class_1331(var18 + var25, var20, var19 + var26), 0, false));
            }
         }
      }

      return var10;
   }
}
