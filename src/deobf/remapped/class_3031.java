package remapped;

public class class_3031 extends class_9513 {
   private static String[] field_14850;
   private final class_496 field_14849;
   private int field_14848;

   public class_3031(class_496 var1, class_496 var2, double var3) {
      super(var2, var3);
      this.field_14847 = var1;
      this.field_14849 = var2;
   }

   @Override
   public boolean method_16795() {
      if (!super.method_16795() || this.field_14849.method_2430() != 0) {
         return false;
      } else if (this.method_13833()) {
         return true;
      } else {
         if (this.field_14848 <= this.field_14849.field_41697) {
            this.field_14849.method_2439(32);
            this.field_14848 = this.field_14849.field_41697 + 600;
            if (this.field_14849.method_26530()) {
               PlayerEntity var3 = this.field_48439.method_25859(class_496.method_2443(), this.field_14849);
               class_496.method_2458(this.field_14849).method_25654(var3);
            }
         }

         return false;
      }
   }

   private boolean method_13833() {
      BlockPos var3 = this.field_14849.method_37075();
      class_2921 var4 = new class_2921();

      for (int var5 = 0; var5 < 3; var5++) {
         for (int var6 = 0; var6 < 8; var6++) {
            for (int var7 = 0; var7 <= var6; var7 = var7 <= 0 ? 1 - var7 : -var7) {
               for (int var8 = var7 < var6 && var7 > -var6 ? var6 : 0; var8 <= var6; var8 = var8 <= 0 ? 1 - var8 : -var8) {
                  var4.method_13360(var3, var7, var5, var8);
                  if (this.field_48439.method_28262(var4).method_8350(class_4783.field_23886)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }
}
