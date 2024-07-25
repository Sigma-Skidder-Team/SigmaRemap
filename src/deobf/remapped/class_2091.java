package remapped;

import java.util.List;
import java.util.Random;

public class class_2091 extends class_8549 {
   private final boolean field_10511;
   private final boolean field_10509;

   public class_2091(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13407, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
      this.field_10511 = var2.nextInt(2) == 0;
      this.field_10509 = var2.nextInt(2) == 0;
   }

   public class_2091(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13407, var2);
      this.field_10511 = var2.getBoolean("Left");
      this.field_10509 = var2.getBoolean("Right");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("Left", this.field_10511);
      var1.putBoolean("Right", this.field_10509);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_39334((class_4960)var1, var2, var3, 1, 1);
      if (this.field_10511) {
         this.method_39331((class_4960)var1, var2, var3, 1, 2);
      }

      if (this.field_10509) {
         this.method_39335((class_4960)var1, var2, var3, 1, 2);
      }
   }

   public static class_2091 method_9792(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_2091(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32511(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 1, 1, 0);
      this.method_39330(var1, var4, var5, class_4030.field_19578, 1, 1, 6);
      class_2522 var10 = class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_804);
      class_2522 var11 = class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_809);
      this.method_32524(var1, var5, var4, 0.1F, 1, 2, 1, var10);
      this.method_32524(var1, var5, var4, 0.1F, 3, 2, 1, var11);
      this.method_32524(var1, var5, var4, 0.1F, 1, 2, 5, var10);
      this.method_32524(var1, var5, var4, 0.1F, 3, 2, 5, var11);
      if (this.field_10511) {
         this.method_32500(var1, var5, 0, 1, 2, 0, 3, 4, field_36439, field_36439, false);
      }

      if (this.field_10509) {
         this.method_32500(var1, var5, 4, 1, 2, 4, 3, 4, field_36439, field_36439, false);
      }

      return true;
   }
}
