package remapped;

import java.util.EnumSet;

public class class_7261 extends class_3599 {
   private static String[] field_37200;
   private final class_4612 field_37201;

   public class_7261(class_4612 var1) {
      this.field_37201 = var1;
      this.method_16800(EnumSet.<Flag>of(Flag.MOVE, Flag.LOOK));
   }

   @Override
   public boolean method_16795() {
      return this.field_37201.method_37229() < 140;
   }

   @Override
   public boolean method_16799() {
      return this.method_16795();
   }

   @Override
   public boolean method_16801() {
      return false;
   }

   @Override
   public void method_16796() {
      this.method_33184();
   }

   private void method_33184() {
      Iterable var3 = BlockPos.method_6075(
         MathHelper.floor(this.field_37201.getPosX() - 1.0),
         MathHelper.floor(this.field_37201.method_37309()),
         MathHelper.floor(this.field_37201.getPosZ() - 1.0),
         MathHelper.floor(this.field_37201.getPosX() + 1.0),
         MathHelper.floor(this.field_37201.method_37309() + 8.0),
         MathHelper.floor(this.field_37201.getPosZ() + 1.0)
      );
      BlockPos var4 = null;

      for (BlockPos var6 : var3) {
         if (this.method_33185(this.field_37201.world, var6)) {
            var4 = var6;
            break;
         }
      }

      if (var4 == null) {
         var4 = new BlockPos(this.field_37201.getPosX(), this.field_37201.method_37309() + 8.0, this.field_37201.getPosZ());
      }

      this.field_37201.method_26927().method_5595((double)var4.getX(), (double)(var4.getY() + 1), (double)var4.getZ(), 1.0);
   }

   @Override
   public void method_16794() {
      this.method_33184();
      this.field_37201
         .method_37092(0.02F, new Vector3d((double)this.field_37201.field_29676, (double)this.field_37201.field_29651, (double)this.field_37201.field_29673));
      this.field_37201.method_37226(class_7412.field_37839, this.field_37201.method_37098());
   }

   private boolean method_33185(class_4924 var1, BlockPos var2) {
      class_2522 var5 = var1.method_28262(var2);
      return (var1.method_28258(var2).method_22001() || var5.method_8350(class_4783.field_23269)) && var5.method_8319(var1, var2, class_2929.field_14271);
   }
}
