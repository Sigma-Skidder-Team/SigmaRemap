package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Random;

public enum class_2407 {
   @Override
   public void method_16031(class_6331 var1, class_2810 var2, List<class_3577> var3, int var4, BlockPos var5) {
      byte var8 = 40;
      boolean var9 = var4 % 40 == 0;
      boolean var10 = var4 % 40 == 39;
      if (var9 || var10) {
         List var11 = class_9484.method_43809(var1);
         int var12 = var4 / 40;
         if (var12 >= var11.size()) {
            if (var9) {
               var2.method_12768(field_17116);
            }
         } else {
            class_9191 var13 = (class_9191)var11.get(var12);
            if (!var9) {
               byte var14 = 10;

               for (BlockPos var16 : BlockPos.method_6076(
                  new BlockPos(var13.method_42371() - 10, var13.method_42370() - 10, var13.method_42373() - 10),
                  new BlockPos(var13.method_42371() + 10, var13.method_42370() + 10, var13.method_42373() + 10)
               )) {
                  var1.method_7508(var16, false);
               }

               var1.method_29573(
                  (Entity)null,
                  (double)((float)var13.method_42371() + 0.5F),
                  (double)var13.method_42370(),
                  (double)((float)var13.method_42373() + 0.5F),
                  5.0F,
                  class_7298.field_37311
               );
               class_4069 var18 = new class_4069(true, ImmutableList.of(var13), new BlockPos(0, 128, 0));
               class_4285.field_20758
                  .method_19909(var18)
                  .method_27104(var1, var1.method_28945().method_10189(), new Random(), new BlockPos(var13.method_42371(), 45, var13.method_42373()));
            } else {
               for (class_3577 var19 : var3) {
                  var19.method_16625(new BlockPos(var13.method_42371(), var13.method_42370() + 1, var13.method_42373()));
               }
            }
         }
      }
   }
}
