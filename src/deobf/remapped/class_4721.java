package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class class_4721 extends class_5390<class_1267> {
   private static final String[] field_22900 = new String[]{
      "ruined_portal/portal_1",
      "ruined_portal/portal_2",
      "ruined_portal/portal_3",
      "ruined_portal/portal_4",
      "ruined_portal/portal_5",
      "ruined_portal/portal_6",
      "ruined_portal/portal_7",
      "ruined_portal/portal_8",
      "ruined_portal/portal_9",
      "ruined_portal/portal_10"
   };
   private static final String[] field_22899 = new String[]{"ruined_portal/giant_portal_1", "ruined_portal/giant_portal_2", "ruined_portal/giant_portal_3"};

   public class_4721(Codec<class_1267> var1) {
      super(var1);
   }

   @Override
   public class_1329<class_1267> method_24558() {
      return class_7248::new;
   }

   private static boolean method_21829(class_1331 var0, class_6325 var1) {
      return var1.method_28865(var0) < 0.15F;
   }

   private static int method_21830(Random var0, class_6541 var1, class_3487 var2, boolean var3, int var4, int var5, class_9616 var6) {
      int var9;
      if (var2 != class_3487.field_17121) {
         if (var2 != class_3487.field_17124) {
            if (var2 != class_3487.field_17126) {
               if (var2 != class_3487.field_17123) {
                  var9 = var4;
               } else {
                  var9 = var4 - var5 + method_21831(var0, 2, 8);
               }
            } else {
               int var10 = var4 - var5;
               var9 = method_21827(var0, 15, var10);
            }
         } else {
            int var19 = var4 - var5;
            var9 = method_21827(var0, 70, var19);
         }
      } else if (!var3) {
         if (!(var0.nextFloat() < 0.5F)) {
            var9 = method_21831(var0, 29, 100);
         } else {
            var9 = method_21831(var0, 27, 29);
         }
      } else {
         var9 = method_21831(var0, 32, 100);
      }

      ImmutableList var20 = ImmutableList.of(
         new class_1331(var6.field_48996, 0, var6.field_48992),
         new class_1331(var6.field_48991, 0, var6.field_48992),
         new class_1331(var6.field_48996, 0, var6.field_48994),
         new class_1331(var6.field_48991, 0, var6.field_48994)
      );
      List var11 = var20.stream().<class_6163>map(var1x -> var1.method_29822(var1x.method_12173(), var1x.method_12185())).collect(Collectors.toList());
      class_3801 var12 = var2 != class_3487.field_17119 ? class_3801.field_18598 : class_3801.field_18591;
      class_2921 var13 = new class_2921();

      int var14;
      for (var14 = var9; var14 > 15; var14--) {
         int var15 = 0;
         var13.method_13362(0, var14, 0);

         for (class_6163 var17 : var11) {
            class_2522 var18 = var17.method_28262(var13);
            if (var18 != null && var12.method_17675().test(var18)) {
               if (++var15 == 3) {
                  return var14;
               }
            }
         }
      }

      return var14;
   }

   private static int method_21831(Random var0, int var1, int var2) {
      return var0.nextInt(var2 - var1 + 1) + var1;
   }

   private static int method_21827(Random var0, int var1, int var2) {
      return var1 >= var2 ? var2 : method_21831(var0, var1, var2);
   }
}
