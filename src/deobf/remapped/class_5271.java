package remapped;

import java.util.List;
import java.util.Random;

public class class_5271 extends class_8549 {
   public final int field_26945;

   public class_5271(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13432, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
      this.field_26945 = var2.nextInt(5);
   }

   public class_5271(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13432, var2);
      this.field_26945 = var2.method_25947("Type");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putInt("Type", this.field_26945);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_39334((class_4960)var1, var2, var3, 4, 1);
      this.method_39331((class_4960)var1, var2, var3, 1, 4);
      this.method_39335((class_4960)var1, var2, var3, 1, 4);
   }

   public static class_5271 method_24056(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -4, -1, 0, 11, 7, 11, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_5271(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32511(var1, var5, 0, 0, 0, 10, 6, 10, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 4, 1, 0);
      this.method_32500(var1, var5, 4, 1, 10, 6, 3, 10, field_36439, field_36439, false);
      this.method_32500(var1, var5, 0, 1, 4, 0, 3, 6, field_36439, field_36439, false);
      this.method_32500(var1, var5, 10, 1, 4, 10, 3, 6, field_36439, field_36439, false);
      switch (this.field_26945) {
         case 0:
            this.method_32529(var1, class_4783.field_23355.method_29260(), 5, 1, 5, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 5, 2, 5, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 5, 3, 5, var5);
            this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_809), 4, 3, 5, var5);
            this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_804), 6, 3, 5, var5);
            this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_800), 5, 3, 4, var5);
            this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_818), 5, 3, 6, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 4, 1, 4, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 4, 1, 5, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 4, 1, 6, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 6, 1, 4, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 6, 1, 5, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 6, 1, 6, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 5, 1, 4, var5);
            this.method_32529(var1, class_4783.field_23547.method_29260(), 5, 1, 6, var5);
            break;
         case 1:
            for (int var15 = 0; var15 < 5; var15++) {
               this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 1, 3 + var15, var5);
               this.method_32529(var1, class_4783.field_23355.method_29260(), 7, 1, 3 + var15, var5);
               this.method_32529(var1, class_4783.field_23355.method_29260(), 3 + var15, 1, 3, var5);
               this.method_32529(var1, class_4783.field_23355.method_29260(), 3 + var15, 1, 7, var5);
            }

            this.method_32529(var1, class_4783.field_23355.method_29260(), 5, 1, 5, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 5, 2, 5, var5);
            this.method_32529(var1, class_4783.field_23355.method_29260(), 5, 3, 5, var5);
            this.method_32529(var1, class_4783.field_23900.method_29260(), 5, 4, 5, var5);
            break;
         case 2:
            for (int var10 = 1; var10 <= 9; var10++) {
               this.method_32529(var1, class_4783.field_23808.method_29260(), 1, 3, var10, var5);
               this.method_32529(var1, class_4783.field_23808.method_29260(), 9, 3, var10, var5);
            }

            for (int var11 = 1; var11 <= 9; var11++) {
               this.method_32529(var1, class_4783.field_23808.method_29260(), var11, 3, 1, var5);
               this.method_32529(var1, class_4783.field_23808.method_29260(), var11, 3, 9, var5);
            }

            this.method_32529(var1, class_4783.field_23808.method_29260(), 5, 1, 4, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 5, 1, 6, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 5, 3, 4, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 5, 3, 6, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 4, 1, 5, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 6, 1, 5, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 4, 3, 5, var5);
            this.method_32529(var1, class_4783.field_23808.method_29260(), 6, 3, 5, var5);

            for (int var12 = 1; var12 <= 3; var12++) {
               this.method_32529(var1, class_4783.field_23808.method_29260(), 4, var12, 4, var5);
               this.method_32529(var1, class_4783.field_23808.method_29260(), 6, var12, 4, var5);
               this.method_32529(var1, class_4783.field_23808.method_29260(), 4, var12, 6, var5);
               this.method_32529(var1, class_4783.field_23808.method_29260(), 6, var12, 6, var5);
            }

            this.method_32529(var1, class_4783.field_23521.method_29260(), 5, 3, 5, var5);

            for (int var13 = 2; var13 <= 8; var13++) {
               this.method_32529(var1, class_4783.field_23893.method_29260(), 2, 3, var13, var5);
               this.method_32529(var1, class_4783.field_23893.method_29260(), 3, 3, var13, var5);
               if (var13 <= 3 || var13 >= 7) {
                  this.method_32529(var1, class_4783.field_23893.method_29260(), 4, 3, var13, var5);
                  this.method_32529(var1, class_4783.field_23893.method_29260(), 5, 3, var13, var5);
                  this.method_32529(var1, class_4783.field_23893.method_29260(), 6, 3, var13, var5);
               }

               this.method_32529(var1, class_4783.field_23893.method_29260(), 7, 3, var13, var5);
               this.method_32529(var1, class_4783.field_23893.method_29260(), 8, 3, var13, var5);
            }

            class_2522 var14 = class_4783.field_23748.method_29260().method_10308(class_5613.field_28506, Direction.field_809);
            this.method_32529(var1, var14, 9, 1, 3, var5);
            this.method_32529(var1, var14, 9, 2, 3, var5);
            this.method_32529(var1, var14, 9, 3, 3, var5);
            this.method_32525(var1, var5, var4, 3, 4, 8, class_5931.field_30151);
      }

      return true;
   }
}
