package remapped;

public class class_5506 extends class_3599 {
   private static String[] field_28047;
   private final class_4612 field_28048;

   public class_5506(class_4612 var1) {
      this.field_28048 = var1;
   }

   @Override
   public boolean method_16795() {
      return this.field_28048.method_37360()
         && !this.field_28048.world.method_28258(this.field_28048.method_37075()).method_22007(class_6503.field_33094);
   }

   @Override
   public void method_16796() {
      BlockPos var3 = null;

      for (BlockPos var5 : BlockPos.method_6075(
         MathHelper.floor(this.field_28048.getPosX() - 2.0),
         MathHelper.floor(this.field_28048.method_37309() - 2.0),
         MathHelper.floor(this.field_28048.getPosZ() - 2.0),
         MathHelper.floor(this.field_28048.getPosX() + 2.0),
         MathHelper.floor(this.field_28048.method_37309()),
         MathHelper.floor(this.field_28048.getPosZ() + 2.0)
      )) {
         if (this.field_28048.world.method_28258(var5).method_22007(class_6503.field_33094)) {
            var3 = var5;
            break;
         }
      }

      if (var3 != null) {
         this.field_28048.method_26905().method_12879((double)var3.getX(), (double)var3.method_12165(), (double)var3.method_12185(), 1.0);
      }
   }
}
