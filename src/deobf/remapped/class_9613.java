package remapped;

import java.util.Random;

public class class_9613 extends class_2255<class_3420> {
   private static String[] field_48982;
   private final class_856 field_48981 = MinecraftClient.getInstance().method_8505();

   public class_9613(class_3569 var1) {
      super(var1);
   }

   public void method_44379(class_3420 var1, float var2, class_7966 var3, class_2565 var4, int var5, int var6) {
      World var9 = var1.method_17402();
      if (var9 != null) {
         BlockPos var10 = var1.method_17399().method_6098(var1.method_15800().method_1046());
         class_2522 var11 = var1.method_15792();
         if (!var11.method_8345()) {
            class_2174.method_10113();
            var3.method_36063();
            var3.method_36065((double)var1.method_15784(var2), (double)var1.method_15789(var2), (double)var1.method_15798(var2));
            if (var11.method_8350(class_4783.field_23336) && var1.method_15785(var2) <= 4.0F) {
               var11 = var11.method_10308(class_1166.field_6610, Boolean.valueOf(var1.method_15785(var2) <= 0.5F));
               this.method_44380(var10, var11, var3, var4, var9, false, var6);
            } else if (var1.method_15791() && !var1.method_15786()) {
               class_989 var12 = !var11.method_8350(class_4783.field_23861) ? class_989.field_5039 : class_989.field_5035;
               class_2522 var13 = class_4783.field_23336
                  .method_29260()
                  .method_10308(class_1166.field_6616, var12)
                  .method_10308(class_1166.field_16180, var11.<Direction>method_10313(class_1990.field_16180));
               var13 = var13.method_10308(class_1166.field_6610, Boolean.valueOf(var1.method_15785(var2) >= 0.5F));
               this.method_44380(var10, var13, var3, var4, var9, false, var6);
               BlockPos var14 = var10.method_6098(var1.method_15800());
               var3.method_36064();
               var3.method_36063();
               var11 = var11.method_10308(class_1990.field_10077, Boolean.valueOf(true));
               this.method_44380(var14, var11, var3, var4, var9, true, var6);
            } else {
               this.method_44380(var10, var11, var3, var4, var9, false, var6);
            }

            var3.method_36064();
            class_2174.method_10095();
         }
      }
   }

   private void method_44380(BlockPos var1, class_2522 var2, class_7966 var3, class_2565 var4, World var5, boolean var6, int var7) {
      RenderLayer var10 = class_6416.method_29331(var2);
      class_7907 var11 = var4.method_11645(var10);
      this.field_48981
         .method_3717()
         .method_10103(var5, this.field_48981.method_3715(var2), var2, var1, var3, var11, var6, new Random(), var2.method_8371(var1), var7);
   }
}
