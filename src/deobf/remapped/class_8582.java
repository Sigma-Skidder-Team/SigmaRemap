package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_8582 {
   private static final class_8478 field_43989 = new class_8478().method_39045(true).method_39048(class_2010.field_10194);
   private static final class_8478 field_43985 = new class_8478().method_39045(true).method_39048(class_2010.field_10193);
   private static final class_7123 field_43984 = new class_7774();
   private static final List<class_947<class_6631, BlockPos>> field_43992 = Lists.newArrayList(
      new class_947[]{
         new class_947<class_6631, BlockPos>(class_6631.field_34340, new BlockPos(1, -1, 0)),
         new class_947<class_6631, BlockPos>(class_6631.field_34334, new BlockPos(6, -1, 1)),
         new class_947<class_6631, BlockPos>(class_6631.field_34335, new BlockPos(0, -1, 5)),
         new class_947<class_6631, BlockPos>(class_6631.field_34338, new BlockPos(5, -1, 6))
      }
   );
   private static final class_7123 field_43991 = new class_4846();
   private static final class_7123 field_43988 = new class_9321();
   private static final List<class_947<class_6631, BlockPos>> field_43987 = Lists.newArrayList(
      new class_947[]{
         new class_947<class_6631, BlockPos>(class_6631.field_34340, new BlockPos(4, -1, 0)),
         new class_947<class_6631, BlockPos>(class_6631.field_34334, new BlockPos(12, -1, 4)),
         new class_947<class_6631, BlockPos>(class_6631.field_34335, new BlockPos(0, -1, 8)),
         new class_947<class_6631, BlockPos>(class_6631.field_34338, new BlockPos(8, -1, 12))
      }
   );
   private static final class_7123 field_43990 = new class_3359();

   private static class_9185 method_39466(class_5799 var0, class_9185 var1, BlockPos var2, String var3, class_6631 var4, boolean var5) {
      class_9185 var8 = new class_9185(var0, var3, var1.field_41648, var4, var5);
      BlockPos var9 = var1.field_41647.method_29981(var1.field_41650, var2, var8.field_41650, BlockPos.field_7306);
      var8.method_32508(var9.getX(), var9.method_12165(), var9.method_12185());
      return var8;
   }

   public static void method_39475(class_5799 var0, BlockPos var1, class_6631 var2, List<class_7060> var3, Random var4) {
      field_43990.method_32728();
      field_43984.method_32728();
      field_43988.method_32728();
      field_43991.method_32728();
      class_9185 var7 = method_39465(var3, new class_9185(var0, "base_floor", var1, var2, true));
      var7 = method_39465(var3, method_39466(var0, var7, new BlockPos(-1, 0, -1), "second_floor_1", var2, false));
      var7 = method_39465(var3, method_39466(var0, var7, new BlockPos(-1, 4, -1), "third_floor_1", var2, false));
      var7 = method_39465(var3, method_39466(var0, var7, new BlockPos(-1, 8, -1), "third_roof", var2, true));
      method_39467(var0, field_43991, 1, var7, (BlockPos)null, var3, var4);
   }

   private static class_9185 method_39465(List<class_7060> var0, class_9185 var1) {
      var0.add(var1);
      return var1;
   }

   private static boolean method_39467(class_5799 var0, class_7123 var1, int var2, class_9185 var3, BlockPos var4, List<class_7060> var5, Random var6) {
      if (var2 > 8) {
         return false;
      } else {
         ArrayList var9 = Lists.newArrayList();
         if (var1.method_32727(var0, var2, var3, var4, var9, var6)) {
            boolean var10 = false;
            int var11 = var6.nextInt();

            for (class_7060 var13 : var9) {
               var13.field_36441 = var11;
               class_7060 var14 = class_7060.method_32502(var5, var13.method_32512());
               if (var14 != null && var14.field_36441 != var3.field_36441) {
                  var10 = true;
                  break;
               }
            }

            if (!var10) {
               var5.addAll(var9);
               return true;
            }
         }

         return false;
      }
   }
}
