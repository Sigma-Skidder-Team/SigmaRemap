package remapped;

import java.util.Random;

public class class_543 extends class_7896 {
   private final boolean[] field_3261 = new boolean[4];

   public class_543(Random var1, int var2, int var3) {
      super(class_2746.field_13428, var1, var2, 64, var3, 21, 15, 21);
   }

   public class_543(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13428, var2);
      this.field_3261[0] = var2.getBoolean("hasPlacedChest0");
      this.field_3261[1] = var2.getBoolean("hasPlacedChest1");
      this.field_3261[2] = var2.getBoolean("hasPlacedChest2");
      this.field_3261[3] = var2.getBoolean("hasPlacedChest3");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("hasPlacedChest0", this.field_3261[0]);
      var1.putBoolean("hasPlacedChest1", this.field_3261[1]);
      var1.putBoolean("hasPlacedChest2", this.field_3261[2]);
      var1.putBoolean("hasPlacedChest3", this.field_3261[3]);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, BlockPos var7) {
      this.method_32500(
         var1,
         var5,
         0,
         -4,
         0,
         this.field_40379 - 1,
         0,
         this.field_40376 - 1,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );

      for (int var10 = 1; var10 <= 9; var10++) {
         this.method_32500(
            var1,
            var5,
            var10,
            var10,
            var10,
            this.field_40379 - 1 - var10,
            var10,
            this.field_40376 - 1 - var10,
            class_4783.field_23459.method_29260(),
            class_4783.field_23459.method_29260(),
            false
         );
         this.method_32500(
            var1,
            var5,
            var10 + 1,
            var10,
            var10 + 1,
            this.field_40379 - 2 - var10,
            var10,
            this.field_40376 - 2 - var10,
            class_4783.field_23184.method_29260(),
            class_4783.field_23184.method_29260(),
            false
         );
      }

      for (int var18 = 0; var18 < this.field_40379; var18++) {
         for (int var11 = 0; var11 < this.field_40376; var11++) {
            byte var12 = -5;
            this.method_32499(var1, class_4783.field_23459.method_29260(), var18, -5, var11, var5);
         }
      }

      class_2522 var19 = class_4783.field_23859.method_29260().method_10308(class_3049.field_14946, Direction.field_818);
      class_2522 var20 = class_4783.field_23859.method_29260().method_10308(class_3049.field_14946, Direction.field_800);
      class_2522 var21 = class_4783.field_23859.method_29260().method_10308(class_3049.field_14946, Direction.field_804);
      class_2522 var13 = class_4783.field_23859.method_29260().method_10308(class_3049.field_14946, Direction.field_809);
      this.method_32500(var1, var5, 0, 0, 0, 4, 9, 4, class_4783.field_23459.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 1, 10, 1, 3, 10, 3, class_4783.field_23459.method_29260(), class_4783.field_23459.method_29260(), false);
      this.method_32529(var1, var19, 2, 10, 0, var5);
      this.method_32529(var1, var20, 2, 10, 4, var5);
      this.method_32529(var1, var21, 0, 10, 2, var5);
      this.method_32529(var1, var13, 4, 10, 2, var5);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 5,
         0,
         0,
         this.field_40379 - 1,
         9,
         4,
         class_4783.field_23459.method_29260(),
         class_4783.field_23184.method_29260(),
         false
      );
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 4,
         10,
         1,
         this.field_40379 - 2,
         10,
         3,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );
      this.method_32529(var1, var19, this.field_40379 - 3, 10, 0, var5);
      this.method_32529(var1, var20, this.field_40379 - 3, 10, 4, var5);
      this.method_32529(var1, var21, this.field_40379 - 5, 10, 2, var5);
      this.method_32529(var1, var13, this.field_40379 - 1, 10, 2, var5);
      this.method_32500(var1, var5, 8, 0, 0, 12, 4, 4, class_4783.field_23459.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 9, 1, 0, 11, 3, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 9, 1, 1, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 9, 2, 1, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 9, 3, 1, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 10, 3, 1, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 11, 3, 1, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 11, 2, 1, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 11, 1, 1, var5);
      this.method_32500(var1, var5, 4, 1, 1, 8, 3, 3, class_4783.field_23459.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 4, 1, 2, 8, 2, 2, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 12, 1, 1, 16, 3, 3, class_4783.field_23459.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 12, 1, 2, 16, 2, 2, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         5,
         4,
         5,
         this.field_40379 - 6,
         4,
         this.field_40376 - 6,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );
      this.method_32500(var1, var5, 9, 4, 9, 11, 4, 11, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(var1, var5, 8, 1, 8, 8, 3, 8, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(var1, var5, 12, 1, 8, 12, 3, 8, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(var1, var5, 8, 1, 12, 8, 3, 12, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(var1, var5, 12, 1, 12, 12, 3, 12, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(var1, var5, 1, 1, 5, 4, 4, 11, class_4783.field_23459.method_29260(), class_4783.field_23459.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 5,
         1,
         5,
         this.field_40379 - 2,
         4,
         11,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );
      this.method_32500(var1, var5, 6, 7, 9, 6, 7, 11, class_4783.field_23459.method_29260(), class_4783.field_23459.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 7,
         7,
         9,
         this.field_40379 - 7,
         7,
         11,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );
      this.method_32500(var1, var5, 5, 5, 9, 5, 7, 11, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 6,
         5,
         9,
         this.field_40379 - 6,
         7,
         11,
         class_4783.field_23863.method_29260(),
         class_4783.field_23863.method_29260(),
         false
      );
      this.method_32529(var1, class_4783.field_23184.method_29260(), 5, 5, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 5, 6, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 6, 6, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), this.field_40379 - 6, 5, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), this.field_40379 - 6, 6, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), this.field_40379 - 7, 6, 10, var5);
      this.method_32500(var1, var5, 2, 4, 4, 2, 6, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 3,
         4,
         4,
         this.field_40379 - 3,
         6,
         4,
         class_4783.field_23184.method_29260(),
         class_4783.field_23184.method_29260(),
         false
      );
      this.method_32529(var1, var19, 2, 4, 5, var5);
      this.method_32529(var1, var19, 2, 3, 4, var5);
      this.method_32529(var1, var19, this.field_40379 - 3, 4, 5, var5);
      this.method_32529(var1, var19, this.field_40379 - 3, 3, 4, var5);
      this.method_32500(var1, var5, 1, 1, 3, 2, 2, 3, class_4783.field_23459.method_29260(), class_4783.field_23459.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 3,
         1,
         3,
         this.field_40379 - 2,
         2,
         3,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );
      this.method_32529(var1, class_4783.field_23459.method_29260(), 1, 1, 2, var5);
      this.method_32529(var1, class_4783.field_23459.method_29260(), this.field_40379 - 2, 1, 2, var5);
      this.method_32529(var1, class_4783.field_23575.method_29260(), 1, 2, 2, var5);
      this.method_32529(var1, class_4783.field_23575.method_29260(), this.field_40379 - 2, 2, 2, var5);
      this.method_32529(var1, var13, 2, 1, 2, var5);
      this.method_32529(var1, var21, this.field_40379 - 3, 1, 2, var5);
      this.method_32500(var1, var5, 4, 3, 5, 4, 3, 17, class_4783.field_23459.method_29260(), class_4783.field_23459.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 5,
         3,
         5,
         this.field_40379 - 5,
         3,
         17,
         class_4783.field_23459.method_29260(),
         class_4783.field_23459.method_29260(),
         false
      );
      this.method_32500(var1, var5, 3, 1, 5, 4, 2, 16, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         this.field_40379 - 6,
         1,
         5,
         this.field_40379 - 5,
         2,
         16,
         class_4783.field_23184.method_29260(),
         class_4783.field_23184.method_29260(),
         false
      );

      for (byte var14 = 5; var14 <= 17; var14 += 2) {
         this.method_32529(var1, class_4783.field_23863.method_29260(), 4, 1, var14, var5);
         this.method_32529(var1, class_4783.field_23250.method_29260(), 4, 2, var14, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), this.field_40379 - 5, 1, var14, var5);
         this.method_32529(var1, class_4783.field_23250.method_29260(), this.field_40379 - 5, 2, var14, var5);
      }

      this.method_32529(var1, class_4783.field_23486.method_29260(), 10, 0, 7, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 10, 0, 8, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 9, 0, 9, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 11, 0, 9, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 8, 0, 10, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 12, 0, 10, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 7, 0, 10, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 13, 0, 10, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 9, 0, 11, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 11, 0, 11, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 10, 0, 12, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 10, 0, 13, var5);
      this.method_32529(var1, class_4783.field_23793.method_29260(), 10, 0, 10, var5);

      for (int var22 = 0; var22 <= this.field_40379 - 1; var22 += this.field_40379 - 1) {
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 2, 1, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 2, 2, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 2, 3, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 3, 1, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 3, 2, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 3, 3, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 4, 1, var5);
         this.method_32529(var1, class_4783.field_23250.method_29260(), var22, 4, 2, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 4, 3, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 5, 1, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 5, 2, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 5, 3, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 6, 1, var5);
         this.method_32529(var1, class_4783.field_23250.method_29260(), var22, 6, 2, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 6, 3, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 7, 1, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 7, 2, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var22, 7, 3, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 8, 1, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 8, 2, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var22, 8, 3, var5);
      }

      for (int var23 = 2; var23 <= this.field_40379 - 3; var23 += this.field_40379 - 3 - 2) {
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 - 1, 2, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23, 2, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 + 1, 2, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 - 1, 3, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23, 3, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 + 1, 3, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23 - 1, 4, 0, var5);
         this.method_32529(var1, class_4783.field_23250.method_29260(), var23, 4, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23 + 1, 4, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 - 1, 5, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23, 5, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 + 1, 5, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23 - 1, 6, 0, var5);
         this.method_32529(var1, class_4783.field_23250.method_29260(), var23, 6, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23 + 1, 6, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23 - 1, 7, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23, 7, 0, var5);
         this.method_32529(var1, class_4783.field_23486.method_29260(), var23 + 1, 7, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 - 1, 8, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23, 8, 0, var5);
         this.method_32529(var1, class_4783.field_23863.method_29260(), var23 + 1, 8, 0, var5);
      }

      this.method_32500(var1, var5, 8, 4, 0, 12, 6, 0, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 8, 6, 0, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 12, 6, 0, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 9, 5, 0, var5);
      this.method_32529(var1, class_4783.field_23250.method_29260(), 10, 5, 0, var5);
      this.method_32529(var1, class_4783.field_23486.method_29260(), 11, 5, 0, var5);
      this.method_32500(var1, var5, 8, -14, 8, 12, -11, 12, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(var1, var5, 8, -10, 8, 12, -10, 12, class_4783.field_23250.method_29260(), class_4783.field_23250.method_29260(), false);
      this.method_32500(var1, var5, 8, -9, 8, 12, -9, 12, class_4783.field_23863.method_29260(), class_4783.field_23863.method_29260(), false);
      this.method_32500(var1, var5, 8, -8, 8, 12, -1, 12, class_4783.field_23459.method_29260(), class_4783.field_23459.method_29260(), false);
      this.method_32500(var1, var5, 9, -11, 9, 11, -1, 11, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32529(var1, class_4783.field_23820.method_29260(), 10, -11, 10, var5);
      this.method_32500(var1, var5, 9, -13, 9, 11, -13, 11, class_4783.field_23252.method_29260(), class_4783.field_23184.method_29260(), false);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 8, -11, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 8, -10, 10, var5);
      this.method_32529(var1, class_4783.field_23250.method_29260(), 7, -10, 10, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 7, -11, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 12, -11, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 12, -10, 10, var5);
      this.method_32529(var1, class_4783.field_23250.method_29260(), 13, -10, 10, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 13, -11, 10, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 10, -11, 8, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 10, -10, 8, var5);
      this.method_32529(var1, class_4783.field_23250.method_29260(), 10, -10, 7, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 10, -11, 7, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 10, -11, 12, var5);
      this.method_32529(var1, class_4783.field_23184.method_29260(), 10, -10, 12, var5);
      this.method_32529(var1, class_4783.field_23250.method_29260(), 10, -10, 13, var5);
      this.method_32529(var1, class_4783.field_23863.method_29260(), 10, -11, 13, var5);

      for (Direction var15 : class_9594.field_48893) {
         if (!this.field_3261[var15.method_1031()]) {
            int var16 = var15.method_1041() * 2;
            int var17 = var15.method_1034() * 2;
            this.field_3261[var15.method_1031()] = this.method_32525(var1, var5, var4, 10 + var16, -11, 10 + var17, class_5931.field_30099);
         }
      }

      return true;
   }
}
