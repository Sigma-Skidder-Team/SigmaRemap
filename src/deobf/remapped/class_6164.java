package remapped;

import java.util.Random;

public class class_6164 extends class_7896 {
   private boolean field_31546;
   private boolean field_31551;
   private boolean field_31550;
   private boolean field_31549;
   private static final class_4326 field_31547 = new class_4326(null);

   public class_6164(Random var1, int var2, int var3) {
      super(class_2746.field_13403, var1, var2, 64, var3, 12, 10, 15);
   }

   public class_6164(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13403, var2);
      this.field_31546 = var2.getBoolean("placedMainChest");
      this.field_31551 = var2.getBoolean("placedHiddenChest");
      this.field_31550 = var2.getBoolean("placedTrap1");
      this.field_31549 = var2.getBoolean("placedTrap2");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.putBoolean("placedMainChest", this.field_31546);
      var1.putBoolean("placedHiddenChest", this.field_31551);
      var1.putBoolean("placedTrap1", this.field_31550);
      var1.putBoolean("placedTrap2", this.field_31549);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (!this.method_35693(var1, var5, 0)) {
         return false;
      } else {
         this.method_32511(var1, var5, 0, -4, 0, this.field_40379 - 1, 0, this.field_40376 - 1, false, var4, field_31547);
         this.method_32511(var1, var5, 2, 1, 2, 9, 2, 2, false, var4, field_31547);
         this.method_32511(var1, var5, 2, 1, 12, 9, 2, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 2, 1, 3, 2, 2, 11, false, var4, field_31547);
         this.method_32511(var1, var5, 9, 1, 3, 9, 2, 11, false, var4, field_31547);
         this.method_32511(var1, var5, 1, 3, 1, 10, 6, 1, false, var4, field_31547);
         this.method_32511(var1, var5, 1, 3, 13, 10, 6, 13, false, var4, field_31547);
         this.method_32511(var1, var5, 1, 3, 2, 1, 6, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 10, 3, 2, 10, 6, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 2, 3, 2, 9, 3, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 2, 6, 2, 9, 6, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 3, 7, 3, 8, 7, 11, false, var4, field_31547);
         this.method_32511(var1, var5, 4, 8, 4, 7, 8, 10, false, var4, field_31547);
         this.method_32505(var1, var5, 3, 1, 3, 8, 2, 11);
         this.method_32505(var1, var5, 4, 3, 6, 7, 3, 9);
         this.method_32505(var1, var5, 2, 4, 2, 9, 5, 12);
         this.method_32505(var1, var5, 4, 6, 5, 7, 6, 9);
         this.method_32505(var1, var5, 5, 7, 6, 6, 7, 8);
         this.method_32505(var1, var5, 5, 1, 2, 6, 2, 2);
         this.method_32505(var1, var5, 5, 2, 12, 6, 2, 12);
         this.method_32505(var1, var5, 5, 5, 1, 6, 5, 1);
         this.method_32505(var1, var5, 5, 5, 13, 6, 5, 13);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 1, 5, 5, var5);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 10, 5, 5, var5);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 1, 5, 9, var5);
         this.method_32529(var1, class_4783.field_23184.method_29260(), 10, 5, 9, var5);

         for (byte var10 = 0; var10 <= 14; var10 += 14) {
            this.method_32511(var1, var5, 2, 4, var10, 2, 5, var10, false, var4, field_31547);
            this.method_32511(var1, var5, 4, 4, var10, 4, 5, var10, false, var4, field_31547);
            this.method_32511(var1, var5, 7, 4, var10, 7, 5, var10, false, var4, field_31547);
            this.method_32511(var1, var5, 9, 4, var10, 9, 5, var10, false, var4, field_31547);
         }

         this.method_32511(var1, var5, 5, 6, 0, 6, 6, 0, false, var4, field_31547);

         for (byte var16 = 0; var16 <= 11; var16 += 11) {
            for (byte var11 = 2; var11 <= 12; var11 += 2) {
               this.method_32511(var1, var5, var16, 4, var11, var16, 5, var11, false, var4, field_31547);
            }

            this.method_32511(var1, var5, var16, 6, 5, var16, 6, 5, false, var4, field_31547);
            this.method_32511(var1, var5, var16, 6, 9, var16, 6, 9, false, var4, field_31547);
         }

         this.method_32511(var1, var5, 2, 7, 2, 2, 9, 2, false, var4, field_31547);
         this.method_32511(var1, var5, 9, 7, 2, 9, 9, 2, false, var4, field_31547);
         this.method_32511(var1, var5, 2, 7, 12, 2, 9, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 9, 7, 12, 9, 9, 12, false, var4, field_31547);
         this.method_32511(var1, var5, 4, 9, 4, 4, 9, 4, false, var4, field_31547);
         this.method_32511(var1, var5, 7, 9, 4, 7, 9, 4, false, var4, field_31547);
         this.method_32511(var1, var5, 4, 9, 10, 4, 9, 10, false, var4, field_31547);
         this.method_32511(var1, var5, 7, 9, 10, 7, 9, 10, false, var4, field_31547);
         this.method_32511(var1, var5, 5, 9, 7, 6, 9, 7, false, var4, field_31547);
         class_2522 var17 = class_4783.field_23364.method_29260().method_10308(class_3049.field_14946, Direction.field_804);
         class_2522 var18 = class_4783.field_23364.method_29260().method_10308(class_3049.field_14946, Direction.field_809);
         class_2522 var12 = class_4783.field_23364.method_29260().method_10308(class_3049.field_14946, Direction.field_800);
         class_2522 var13 = class_4783.field_23364.method_29260().method_10308(class_3049.field_14946, Direction.field_818);
         this.method_32529(var1, var13, 5, 9, 6, var5);
         this.method_32529(var1, var13, 6, 9, 6, var5);
         this.method_32529(var1, var12, 5, 9, 8, var5);
         this.method_32529(var1, var12, 6, 9, 8, var5);
         this.method_32529(var1, var13, 4, 0, 0, var5);
         this.method_32529(var1, var13, 5, 0, 0, var5);
         this.method_32529(var1, var13, 6, 0, 0, var5);
         this.method_32529(var1, var13, 7, 0, 0, var5);
         this.method_32529(var1, var13, 4, 1, 8, var5);
         this.method_32529(var1, var13, 4, 2, 9, var5);
         this.method_32529(var1, var13, 4, 3, 10, var5);
         this.method_32529(var1, var13, 7, 1, 8, var5);
         this.method_32529(var1, var13, 7, 2, 9, var5);
         this.method_32529(var1, var13, 7, 3, 10, var5);
         this.method_32511(var1, var5, 4, 1, 9, 4, 1, 9, false, var4, field_31547);
         this.method_32511(var1, var5, 7, 1, 9, 7, 1, 9, false, var4, field_31547);
         this.method_32511(var1, var5, 4, 1, 10, 7, 2, 10, false, var4, field_31547);
         this.method_32511(var1, var5, 5, 4, 5, 6, 4, 5, false, var4, field_31547);
         this.method_32529(var1, var17, 4, 4, 5, var5);
         this.method_32529(var1, var18, 7, 4, 5, var5);

         for (int var14 = 0; var14 < 4; var14++) {
            this.method_32529(var1, var12, 5, 0 - var14, 6 + var14, var5);
            this.method_32529(var1, var12, 6, 0 - var14, 6 + var14, var5);
            this.method_32505(var1, var5, 5, 0 - var14, 7 + var14, 6, 0 - var14, 9 + var14);
         }

         this.method_32505(var1, var5, 1, -3, 12, 10, -1, 13);
         this.method_32505(var1, var5, 1, -3, 1, 3, -1, 13);
         this.method_32505(var1, var5, 1, -3, 1, 9, -1, 5);

         for (byte var19 = 1; var19 <= 13; var19 += 2) {
            this.method_32511(var1, var5, 1, -3, var19, 1, -2, var19, false, var4, field_31547);
         }

         for (byte var20 = 2; var20 <= 12; var20 += 2) {
            this.method_32511(var1, var5, 1, -1, var20, 3, -1, var20, false, var4, field_31547);
         }

         this.method_32511(var1, var5, 2, -2, 1, 5, -2, 1, false, var4, field_31547);
         this.method_32511(var1, var5, 7, -2, 1, 9, -2, 1, false, var4, field_31547);
         this.method_32511(var1, var5, 6, -3, 1, 6, -3, 1, false, var4, field_31547);
         this.method_32511(var1, var5, 6, -1, 1, 6, -1, 1, false, var4, field_31547);
         this.method_32529(
            var1,
            class_4783.field_23812
               .method_29260()
               .method_10308(class_3760.field_18377, Direction.field_804)
               .method_10308(class_3760.field_18379, Boolean.valueOf(true)),
            1,
            -3,
            8,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23812
               .method_29260()
               .method_10308(class_3760.field_18377, Direction.field_809)
               .method_10308(class_3760.field_18379, Boolean.valueOf(true)),
            4,
            -3,
            8,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23460
               .method_29260()
               .method_10308(class_7959.field_40777, Boolean.valueOf(true))
               .method_10308(class_7959.field_40782, Boolean.valueOf(true))
               .method_10308(class_7959.field_40778, Boolean.valueOf(true)),
            2,
            -3,
            8,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23460
               .method_29260()
               .method_10308(class_7959.field_40777, Boolean.valueOf(true))
               .method_10308(class_7959.field_40782, Boolean.valueOf(true))
               .method_10308(class_7959.field_40778, Boolean.valueOf(true)),
            3,
            -3,
            8,
            var5
         );
         class_2522 var21 = class_4783.field_23349
            .method_29260()
            .method_10308(class_9301.field_47510, class_4379.field_21487)
            .method_10308(class_9301.field_47507, class_4379.field_21487);
         this.method_32529(var1, var21, 5, -3, 7, var5);
         this.method_32529(var1, var21, 5, -3, 6, var5);
         this.method_32529(var1, var21, 5, -3, 5, var5);
         this.method_32529(var1, var21, 5, -3, 4, var5);
         this.method_32529(var1, var21, 5, -3, 3, var5);
         this.method_32529(var1, var21, 5, -3, 2, var5);
         this.method_32529(
            var1,
            class_4783.field_23349
               .method_29260()
               .method_10308(class_9301.field_47510, class_4379.field_21487)
               .method_10308(class_9301.field_47519, class_4379.field_21487),
            5,
            -3,
            1,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23349
               .method_29260()
               .method_10308(class_9301.field_47517, class_4379.field_21487)
               .method_10308(class_9301.field_47519, class_4379.field_21487),
            4,
            -3,
            1,
            var5
         );
         this.method_32529(var1, class_4783.field_23774.method_29260(), 3, -3, 1, var5);
         if (!this.field_31550) {
            this.field_31550 = this.method_32504(var1, var5, var4, 3, -2, 1, Direction.field_818, class_5931.field_30158);
         }

         this.method_32529(var1, class_4783.field_23323.method_29260().method_10308(class_4196.field_20408, Boolean.valueOf(true)), 3, -2, 2, var5);
         this.method_32529(
            var1,
            class_4783.field_23812
               .method_29260()
               .method_10308(class_3760.field_18377, Direction.field_818)
               .method_10308(class_3760.field_18379, Boolean.valueOf(true)),
            7,
            -3,
            1,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23812
               .method_29260()
               .method_10308(class_3760.field_18377, Direction.field_800)
               .method_10308(class_3760.field_18379, Boolean.valueOf(true)),
            7,
            -3,
            5,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23460
               .method_29260()
               .method_10308(class_7959.field_40779, Boolean.valueOf(true))
               .method_10308(class_7959.field_40780, Boolean.valueOf(true))
               .method_10308(class_7959.field_40778, Boolean.valueOf(true)),
            7,
            -3,
            2,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23460
               .method_29260()
               .method_10308(class_7959.field_40779, Boolean.valueOf(true))
               .method_10308(class_7959.field_40780, Boolean.valueOf(true))
               .method_10308(class_7959.field_40778, Boolean.valueOf(true)),
            7,
            -3,
            3,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23460
               .method_29260()
               .method_10308(class_7959.field_40779, Boolean.valueOf(true))
               .method_10308(class_7959.field_40780, Boolean.valueOf(true))
               .method_10308(class_7959.field_40778, Boolean.valueOf(true)),
            7,
            -3,
            4,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23349
               .method_29260()
               .method_10308(class_9301.field_47517, class_4379.field_21487)
               .method_10308(class_9301.field_47519, class_4379.field_21487),
            8,
            -3,
            6,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23349
               .method_29260()
               .method_10308(class_9301.field_47519, class_4379.field_21487)
               .method_10308(class_9301.field_47507, class_4379.field_21487),
            9,
            -3,
            6,
            var5
         );
         this.method_32529(
            var1,
            class_4783.field_23349
               .method_29260()
               .method_10308(class_9301.field_47510, class_4379.field_21487)
               .method_10308(class_9301.field_47507, class_4379.field_21482),
            9,
            -3,
            5,
            var5
         );
         this.method_32529(var1, class_4783.field_23774.method_29260(), 9, -3, 4, var5);
         this.method_32529(var1, var21, 9, -2, 4, var5);
         if (!this.field_31549) {
            this.field_31549 = this.method_32504(var1, var5, var4, 9, -2, 3, Direction.field_809, class_5931.field_30158);
         }

         this.method_32529(var1, class_4783.field_23323.method_29260().method_10308(class_4196.field_20415, Boolean.valueOf(true)), 8, -1, 3, var5);
         this.method_32529(var1, class_4783.field_23323.method_29260().method_10308(class_4196.field_20415, Boolean.valueOf(true)), 8, -2, 3, var5);
         if (!this.field_31546) {
            this.field_31546 = this.method_32525(var1, var5, var4, 8, -3, 3, class_5931.field_30130);
         }

         this.method_32529(var1, class_4783.field_23774.method_29260(), 9, -3, 2, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 8, -3, 1, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 4, -3, 5, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 5, -2, 5, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 5, -1, 5, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 6, -3, 5, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 7, -2, 5, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 7, -1, 5, var5);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 8, -3, 5, var5);
         this.method_32511(var1, var5, 9, -1, 1, 9, -1, 5, false, var4, field_31547);
         this.method_32505(var1, var5, 8, -3, 8, 10, -1, 10);
         this.method_32529(var1, class_4783.field_23543.method_29260(), 8, -2, 11, var5);
         this.method_32529(var1, class_4783.field_23543.method_29260(), 9, -2, 11, var5);
         this.method_32529(var1, class_4783.field_23543.method_29260(), 10, -2, 11, var5);
         class_2522 var15 = class_4783.field_23806
            .method_29260()
            .method_10308(class_1475.field_1543, Direction.field_818)
            .method_10308(class_1475.field_12920, class_1895.field_9680);
         this.method_32529(var1, var15, 8, -2, 12, var5);
         this.method_32529(var1, var15, 9, -2, 12, var5);
         this.method_32529(var1, var15, 10, -2, 12, var5);
         this.method_32511(var1, var5, 8, -3, 8, 8, -3, 10, false, var4, field_31547);
         this.method_32511(var1, var5, 10, -3, 8, 10, -3, 10, false, var4, field_31547);
         this.method_32529(var1, class_4783.field_23774.method_29260(), 10, -2, 9, var5);
         this.method_32529(var1, var21, 8, -2, 9, var5);
         this.method_32529(var1, var21, 8, -2, 10, var5);
         this.method_32529(
            var1,
            class_4783.field_23349
               .method_29260()
               .method_10308(class_9301.field_47510, class_4379.field_21487)
               .method_10308(class_9301.field_47507, class_4379.field_21487)
               .method_10308(class_9301.field_47517, class_4379.field_21487)
               .method_10308(class_9301.field_47519, class_4379.field_21487),
            10,
            -1,
            9,
            var5
         );
         this.method_32529(var1, class_4783.field_23861.method_29260().method_10308(class_1990.field_16180, Direction.field_817), 9, -2, 8, var5);
         this.method_32529(var1, class_4783.field_23861.method_29260().method_10308(class_1990.field_16180, Direction.field_809), 10, -2, 8, var5);
         this.method_32529(var1, class_4783.field_23861.method_29260().method_10308(class_1990.field_16180, Direction.field_809), 10, -1, 8, var5);
         this.method_32529(var1, class_4783.field_23350.method_29260().method_10308(class_6218.field_1543, Direction.field_818), 10, -2, 10, var5);
         if (!this.field_31551) {
            this.field_31551 = this.method_32525(var1, var5, var4, 9, -3, 10, class_5931.field_30130);
         }

         return true;
      }
   }
}
