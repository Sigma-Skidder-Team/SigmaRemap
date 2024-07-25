package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class class_424 extends class_4285<class_9431> {
   private static final ImmutableList<class_6414> field_1791 = ImmutableList.of(
      class_4783.field_23811,
      class_4783.field_23433,
      class_4783.field_23215,
      class_4783.field_23784,
      class_4783.field_23484,
      class_4783.field_23587,
      class_4783.field_23204,
      class_4783.field_23522,
      class_4783.field_23471,
      class_4783.field_23617
   );

   public class_424(Codec<class_9431> var1) {
      super(var1);
   }

   public boolean method_2104(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_9431 var5) {
      int var8 = var2.method_29816();
      if (method_2107(var1, var8, var4.method_6089())) {
         int var9 = var5.method_43651().method_15936(var3);
         boolean var10 = var3.nextFloat() < 0.9F;
         int var11 = Math.min(var9, !var10 ? 8 : 5);
         int var12 = !var10 ? 15 : 50;
         boolean var13 = false;

         for (BlockPos var15 : BlockPos.method_6079(
            var3,
            var12,
            var4.getX() - var11,
            var4.getY(),
            var4.getZ() - var11,
            var4.getX() + var11,
            var4.getY(),
            var4.getZ() + var11
         )) {
            int var16 = var9 - var15.method_12176(var4);
            if (var16 >= 0) {
               var13 |= this.method_2105(var1, var8, var15, var16, var5.method_43650().method_15936(var3));
            }
         }

         return var13;
      } else {
         return false;
      }
   }

   private boolean method_2105(class_9379 var1, int var2, BlockPos var3, int var4, int var5) {
      boolean var8 = false;

      for (BlockPos var10 : BlockPos.method_6075(
         var3.getX() - var5,
         var3.getY(),
         var3.getZ() - var5,
         var3.getX() + var5,
         var3.getY(),
         var3.getZ() + var5
      )) {
         int var11 = var10.method_12176(var3);
         BlockPos var12 = !method_2103(var1, var2, var10)
            ? method_2106(var1, var10.method_6089(), var11)
            : method_2102(var1, var2, var10.method_6089(), var11);
         if (var12 != null) {
            int var13 = var4 - var11 / 2;

            for (class_2921 var14 = var12.method_6089(); var13 >= 0; var13--) {
               if (!method_2103(var1, var2, var14)) {
                  if (!var1.method_28262(var14).method_8350(class_4783.field_23788)) {
                     break;
                  }

                  var14.method_13368(Direction.field_817);
               } else {
                  this.method_19906(var1, var14, class_4783.field_23788.method_29260());
                  var14.method_13368(Direction.field_817);
                  var8 = true;
               }
            }
         }
      }

      return var8;
   }

   @Nullable
   private static BlockPos method_2102(class_9379 var0, int var1, class_2921 var2, int var3) {
      while (var2.getY() > 1 && var3 > 0) {
         var3--;
         if (method_2107(var0, var1, var2)) {
            return var2;
         }

         var2.method_13368(Direction.field_802);
      }

      return null;
   }

   private static boolean method_2107(class_9379 var0, int var1, class_2921 var2) {
      if (!method_2103(var0, var1, var2)) {
         return false;
      } else {
         class_2522 var5 = var0.method_28262(var2.method_13368(Direction.field_802));
         var2.method_13368(Direction.field_817);
         return !var5.method_8345() && !field_1791.contains(var5.method_8360());
      }
   }

   @Nullable
   private static BlockPos method_2106(class_9379 var0, class_2921 var1, int var2) {
      while (var1.getY() < var0.method_28261() && var2 > 0) {
         var2--;
         class_2522 var5 = var0.method_28262(var1);
         if (!field_1791.contains(var5.method_8360())) {
            if (!var5.method_8345()) {
               var1.method_13368(Direction.field_817);
               continue;
            }

            return var1;
         }

         return null;
      }

      return null;
   }

   private static boolean method_2103(class_9379 var0, int var1, BlockPos var2) {
      class_2522 var5 = var0.method_28262(var2);
      return var5.method_8345() || var5.method_8350(class_4783.field_23811) && var2.getY() <= var1;
   }
}
