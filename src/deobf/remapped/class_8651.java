package remapped;

import java.util.List;
import java.util.Random;

public class class_8651 extends class_8549 {
   private boolean field_44315;

   public class_8651(int var1, class_9616 var2, Direction var3) {
      super(class_2746.field_13439, var1);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_8651(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13439, var2);
      this.field_44315 = var2.getBoolean("Mob");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("Mob", this.field_44315);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      if (var1 != null) {
         ((class_4960)var1).field_25655 = this;
      }
   }

   public static class_8651 method_39669(List<class_7060> var0, int var1, int var2, int var3, Direction var4, int var5) {
      class_9616 var8 = class_9616.method_44386(var1, var2, var3, -4, -1, 0, 11, 8, 16, var4);
      return method_39332(var8) && class_7060.method_32502(var0, var8) == null ? new class_8651(var5, var8, var4) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32511(var1, var5, 0, 0, 0, 10, 7, 15, false, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, class_4030.field_19580, 4, 1, 0);
      int var10 = 6;
      this.method_32511(var1, var5, 1, var10, 1, 1, var10, 14, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 9, var10, 1, 9, var10, 14, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 2, var10, 1, 8, var10, 2, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 2, var10, 14, 8, var10, 14, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 1, 1, 1, 2, 1, 4, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 8, 1, 1, 9, 1, 4, false, var4, class_7965.method_36051());
      this.method_32500(var1, var5, 1, 1, 1, 1, 1, 3, class_4783.field_23811.method_29260(), class_4783.field_23811.method_29260(), false);
      this.method_32500(var1, var5, 9, 1, 1, 9, 1, 3, class_4783.field_23811.method_29260(), class_4783.field_23811.method_29260(), false);
      this.method_32511(var1, var5, 3, 1, 8, 7, 1, 12, false, var4, class_7965.method_36051());
      this.method_32500(var1, var5, 4, 1, 9, 6, 1, 11, class_4783.field_23811.method_29260(), class_4783.field_23811.method_29260(), false);
      class_2522 var11 = class_4783.field_23817
         .method_29260()
         .method_10308(class_6498.field_49671, Boolean.valueOf(true))
         .method_10308(class_6498.field_49670, Boolean.valueOf(true));
      class_2522 var12 = class_4783.field_23817
         .method_29260()
         .method_10308(class_6498.field_49664, Boolean.valueOf(true))
         .method_10308(class_6498.field_49667, Boolean.valueOf(true));

      for (byte var13 = 3; var13 < 14; var13 += 2) {
         this.method_32500(var1, var5, 0, 3, var13, 0, 4, var13, var11, var11, false);
         this.method_32500(var1, var5, 10, 3, var13, 10, 4, var13, var11, var11, false);
      }

      for (byte var23 = 2; var23 < 9; var23 += 2) {
         this.method_32500(var1, var5, var23, 3, 15, var23, 4, 15, var12, var12, false);
      }

      class_2522 var24 = class_4783.field_23712.method_29260().method_10308(class_3049.field_14946, Direction.field_818);
      this.method_32511(var1, var5, 4, 1, 5, 6, 1, 7, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 4, 2, 6, 6, 2, 7, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 4, 3, 7, 6, 3, 7, false, var4, class_7965.method_36051());

      for (int var14 = 4; var14 <= 6; var14++) {
         this.method_32529(var1, var24, var14, 1, 4, var5);
         this.method_32529(var1, var24, var14, 2, 5, var5);
         this.method_32529(var1, var24, var14, 3, 6, var5);
      }

      class_2522 var25 = class_4783.field_23491.method_29260().method_10308(class_7863.field_40261, Direction.field_818);
      class_2522 var15 = class_4783.field_23491.method_29260().method_10308(class_7863.field_40261, Direction.field_800);
      class_2522 var16 = class_4783.field_23491.method_29260().method_10308(class_7863.field_40261, Direction.field_804);
      class_2522 var17 = class_4783.field_23491.method_29260().method_10308(class_7863.field_40261, Direction.field_809);
      boolean var18 = true;
      boolean[] var19 = new boolean[12];

      for (int var20 = 0; var20 < var19.length; var20++) {
         var19[var20] = var4.nextFloat() > 0.9F;
         var18 &= var19[var20];
      }

      this.method_32529(var1, var25.method_10308(class_7863.field_40260, Boolean.valueOf(var19[0])), 4, 3, 8, var5);
      this.method_32529(var1, var25.method_10308(class_7863.field_40260, Boolean.valueOf(var19[1])), 5, 3, 8, var5);
      this.method_32529(var1, var25.method_10308(class_7863.field_40260, Boolean.valueOf(var19[2])), 6, 3, 8, var5);
      this.method_32529(var1, var15.method_10308(class_7863.field_40260, Boolean.valueOf(var19[3])), 4, 3, 12, var5);
      this.method_32529(var1, var15.method_10308(class_7863.field_40260, Boolean.valueOf(var19[4])), 5, 3, 12, var5);
      this.method_32529(var1, var15.method_10308(class_7863.field_40260, Boolean.valueOf(var19[5])), 6, 3, 12, var5);
      this.method_32529(var1, var16.method_10308(class_7863.field_40260, Boolean.valueOf(var19[6])), 3, 3, 9, var5);
      this.method_32529(var1, var16.method_10308(class_7863.field_40260, Boolean.valueOf(var19[7])), 3, 3, 10, var5);
      this.method_32529(var1, var16.method_10308(class_7863.field_40260, Boolean.valueOf(var19[8])), 3, 3, 11, var5);
      this.method_32529(var1, var17.method_10308(class_7863.field_40260, Boolean.valueOf(var19[9])), 7, 3, 9, var5);
      this.method_32529(var1, var17.method_10308(class_7863.field_40260, Boolean.valueOf(var19[10])), 7, 3, 10, var5);
      this.method_32529(var1, var17.method_10308(class_7863.field_40260, Boolean.valueOf(var19[11])), 7, 3, 11, var5);
      if (var18) {
         class_2522 var26 = class_4783.field_23258.method_29260();
         this.method_32529(var1, var26, 4, 3, 9, var5);
         this.method_32529(var1, var26, 5, 3, 9, var5);
         this.method_32529(var1, var26, 6, 3, 9, var5);
         this.method_32529(var1, var26, 4, 3, 10, var5);
         this.method_32529(var1, var26, 5, 3, 10, var5);
         this.method_32529(var1, var26, 6, 3, 10, var5);
         this.method_32529(var1, var26, 4, 3, 11, var5);
         this.method_32529(var1, var26, 5, 3, 11, var5);
         this.method_32529(var1, var26, 6, 3, 11, var5);
      }

      if (!this.field_44315) {
         var10 = this.method_32507(3);
         BlockPos var27 = new BlockPos(this.method_32530(5, 6), var10, this.method_32523(5, 6));
         if (var5.method_44395(var27)) {
            this.field_44315 = true;
            var1.method_7513(var27, class_4783.field_23617.method_29260(), 2);
            class_3757 var21 = var1.method_28260(var27);
            if (var21 instanceof class_1896) {
               ((class_1896)var21).method_8621().method_16253(class_6629.field_34314);
            }
         }
      }

      return true;
   }
}
