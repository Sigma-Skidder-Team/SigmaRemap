package remapped;

import java.util.Random;

public class class_1198 extends class_3599 {
   private static String[] field_6705;
   private final class_912 field_6704;

   public class_1198(class_912 var1) {
      this.field_6704 = var1;
   }

   @Override
   public boolean method_16795() {
      if (this.field_6704.method_3913() == null) {
         return this.field_6704.world.getGameRules().getBoolean(GameRules.MOB_GRIEFING) ? this.field_6704.method_26594().nextInt(20) == 0 : false;
      } else {
         return false;
      }
   }

   @Override
   public void method_16794() {
      Random var3 = this.field_6704.method_26594();
      World var4 = this.field_6704.world;
      int var5 = MathHelper.floor(this.field_6704.getPosX() - 2.0 + var3.nextDouble() * 4.0);
      int var6 = MathHelper.floor(this.field_6704.method_37309() + var3.nextDouble() * 3.0);
      int var7 = MathHelper.floor(this.field_6704.getPosZ() - 2.0 + var3.nextDouble() * 4.0);
      BlockPos var8 = new BlockPos(var5, var6, var7);
      class_2522 var9 = var4.method_28262(var8);
      class_6414 var10 = var9.method_8360();
      class_1343 var11 = new class_1343(
         (double) MathHelper.floor(this.field_6704.getPosX()) + 0.5,
         (double)var6 + 0.5,
         (double) MathHelper.floor(this.field_6704.getPosZ()) + 0.5
      );
      class_1343 var12 = new class_1343((double)var5 + 0.5, (double)var6 + 0.5, (double)var7 + 0.5);
      class_9529 var13 = var4.method_28265(new class_972(var11, var12, class_3132.field_15549, class_9583.field_48747, this.field_6704));
      boolean var14 = var13.method_43955().equals(var8);
      if (var10.method_29299(class_2351.field_11801) && var14) {
         var4.method_7508(var8, false);
         this.field_6704.method_3915(var9.method_8360().method_29260());
      }
   }
}
