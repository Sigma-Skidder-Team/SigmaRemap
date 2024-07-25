package remapped;

import java.util.List;
import java.util.Random;

public class class_9622 extends class_6315 {
   private final int field_49017;

   public class_9622(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13392, var1);
      this.method_32519(var4);
      this.field_36435 = var3;
      this.field_49017 = var2.nextInt();
   }

   public class_9622(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13392, var2);
      this.field_49017 = var2.method_25947("Seed");
   }

   public static class_9622 method_44418(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -3, 0, 5, 10, 8, var5);
      return method_28781(var9) && class_7060.method_32502(var0, var9) == null ? new class_9622(var6, var1, var9, var5) : null;
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25931("Seed", this.field_49017);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      Random var10 = new Random((long)this.field_49017);

      for (int var11 = 0; var11 <= 4; var11++) {
         for (int var12 = 3; var12 <= 4; var12++) {
            int var13 = var10.nextInt(8);
            this.method_32500(
               var1, var5, var11, var12, 0, var11, var12, var13, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false
            );
         }
      }

      int var15 = var10.nextInt(8);
      this.method_32500(var1, var5, 0, 5, 0, 0, 5, var15, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      var15 = var10.nextInt(8);
      this.method_32500(var1, var5, 4, 5, 0, 4, 5, var15, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var17 = 0; var17 <= 4; var17++) {
         int var19 = var10.nextInt(5);
         this.method_32500(var1, var5, var17, 2, 0, var17, 2, var19, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      }

      for (int var18 = 0; var18 <= 4; var18++) {
         for (int var20 = 0; var20 <= 1; var20++) {
            int var14 = var10.nextInt(3);
            this.method_32500(
               var1, var5, var18, var20, 0, var18, var20, var14, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false
            );
         }
      }

      return true;
   }
}
