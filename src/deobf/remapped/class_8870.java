package remapped;

import java.util.Random;

public class class_8870 extends class_4285<class_1941> {
   private static String[] field_45349;
   public static final BlockPos field_45348 = BlockPos.field_7306;
   private final boolean field_45350;

   public class_8870(boolean var1) {
      super(class_1941.field_9913);
      this.field_45350 = var1;
   }

   public boolean method_40805(class_700 var1, class_6541 var2, Random var3, BlockPos var4, class_1941 var5) {
      for (BlockPos var9 : BlockPos.method_6076(
         new BlockPos(var4.getX() - 4, var4.getY() - 1, var4.getZ() - 4),
         new BlockPos(var4.getX() + 4, var4.getY() + 32, var4.getZ() + 4)
      )) {
         boolean var10 = var9.method_12171(var4, 2.5);
         if (var10 || var9.method_12171(var4, 3.5)) {
            if (var9.getY() >= var4.getY()) {
               if (var9.getY() <= var4.getY()) {
                  if (var10) {
                     if (!this.field_45350) {
                        this.method_19906(var1, new BlockPos(var9), class_4783.field_23184.method_29260());
                     } else {
                        this.method_19906(var1, new BlockPos(var9), class_4783.field_23258.method_29260());
                     }
                  } else {
                     this.method_19906(var1, var9, class_4783.field_23433.method_29260());
                  }
               } else {
                  this.method_19906(var1, var9, class_4783.field_23184.method_29260());
               }
            } else if (!var10) {
               if (var9.getY() < var4.getY()) {
                  this.method_19906(var1, var9, class_4783.field_23894.method_29260());
               }
            } else {
               this.method_19906(var1, var9, class_4783.field_23433.method_29260());
            }
         }
      }

      for (int var11 = 0; var11 < 4; var11++) {
         this.method_19906(var1, var4.method_6082(var11), class_4783.field_23433.method_29260());
      }

      BlockPos var12 = var4.method_6082(2);

      for (Direction var14 : class_9594.field_48893) {
         this.method_19906(var1, var12.method_6098(var14), class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, var14));
      }

      return true;
   }
}
