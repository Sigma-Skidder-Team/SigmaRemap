package remapped;

import java.util.List;
import java.util.Random;

public class class_6138 extends class_462 {
   private final class_240 field_31486;
   private final boolean field_31485;

   public class_6138(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13397, var2);
      this.field_31485 = var2.method_25933("tf");
      this.field_31486 = class_240.method_1040(var2.method_25947("D"));
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25934("tf", this.field_31485);
      var1.method_25931("D", this.field_31486.method_1031());
   }

   public class_6138(int var1, class_9616 var2, class_240 var3, class_1143 var4) {
      super(class_2746.field_13397, var1, var4);
      this.field_31486 = var3;
      this.field_36435 = var2;
      this.field_31485 = var2.method_44398() > 3;
   }

   public static class_9616 method_28182(List<class_7060> var0, Random var1, int var2, int var3, int var4, class_240 var5) {
      class_9616 var8 = new class_9616(var2, var3, var4, var2, var3 + 3 - 1, var4);
      if (var1.nextInt(4) == 0) {
         var8.field_48993 += 4;
      }

      switch (var5) {
         case field_818:
         default:
            var8.field_48996 = var2 - 1;
            var8.field_48991 = var2 + 3;
            var8.field_48992 = var4 - 4;
            break;
         case field_800:
            var8.field_48996 = var2 - 1;
            var8.field_48991 = var2 + 3;
            var8.field_48994 = var4 + 3 + 1;
            break;
         case field_809:
            var8.field_48996 = var2 - 4;
            var8.field_48992 = var4 - 1;
            var8.field_48994 = var4 + 3;
            break;
         case field_804:
            var8.field_48991 = var2 + 3 + 1;
            var8.field_48992 = var4 - 1;
            var8.field_48994 = var4 + 3;
      }

      return class_7060.method_32502(var0, var8) != null ? null : var8;
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      int var6 = this.method_32515();
      switch (this.field_31486) {
         case field_818:
         default:
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48992 - 1, class_240.field_818, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 - 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, class_240.field_809, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48991 + 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, class_240.field_804, var6
            );
            break;
         case field_800:
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48994 + 1, class_240.field_800, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 - 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, class_240.field_809, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48991 + 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, class_240.field_804, var6
            );
            break;
         case field_809:
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48992 - 1, class_240.field_818, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48994 + 1, class_240.field_800, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 - 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, class_240.field_809, var6
            );
            break;
         case field_804:
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48992 - 1, class_240.field_818, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48994 + 1, class_240.field_800, var6
            );
            class_1087.method_4766(
               var1, var2, var3, this.field_36435.field_48991 + 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, class_240.field_804, var6
            );
      }

      if (this.field_31485) {
         if (var3.nextBoolean()) {
            class_1087.method_4766(
               var1,
               var2,
               var3,
               this.field_36435.field_48996 + 1,
               this.field_36435.field_48995 + 3 + 1,
               this.field_36435.field_48992 - 1,
               class_240.field_818,
               var6
            );
         }

         if (var3.nextBoolean()) {
            class_1087.method_4766(
               var1,
               var2,
               var3,
               this.field_36435.field_48996 - 1,
               this.field_36435.field_48995 + 3 + 1,
               this.field_36435.field_48992 + 1,
               class_240.field_809,
               var6
            );
         }

         if (var3.nextBoolean()) {
            class_1087.method_4766(
               var1,
               var2,
               var3,
               this.field_36435.field_48991 + 1,
               this.field_36435.field_48995 + 3 + 1,
               this.field_36435.field_48992 + 1,
               class_240.field_804,
               var6
            );
         }

         if (var3.nextBoolean()) {
            class_1087.method_4766(
               var1,
               var2,
               var3,
               this.field_36435.field_48996 + 1,
               this.field_36435.field_48995 + 3 + 1,
               this.field_36435.field_48994 + 1,
               class_240.field_800,
               var6
            );
         }
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (this.method_32503(var1, var5)) {
         return false;
      } else {
         class_2522 var10 = this.method_2213();
         if (!this.field_31485) {
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996 + 1,
               this.field_36435.field_48995,
               this.field_36435.field_48992,
               this.field_36435.field_48991 - 1,
               this.field_36435.field_48993,
               this.field_36435.field_48994,
               field_36439,
               field_36439,
               false
            );
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996,
               this.field_36435.field_48995,
               this.field_36435.field_48992 + 1,
               this.field_36435.field_48991,
               this.field_36435.field_48993,
               this.field_36435.field_48994 - 1,
               field_36439,
               field_36439,
               false
            );
         } else {
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996 + 1,
               this.field_36435.field_48995,
               this.field_36435.field_48992,
               this.field_36435.field_48991 - 1,
               this.field_36435.field_48995 + 3 - 1,
               this.field_36435.field_48994,
               field_36439,
               field_36439,
               false
            );
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996,
               this.field_36435.field_48995,
               this.field_36435.field_48992 + 1,
               this.field_36435.field_48991,
               this.field_36435.field_48995 + 3 - 1,
               this.field_36435.field_48994 - 1,
               field_36439,
               field_36439,
               false
            );
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996 + 1,
               this.field_36435.field_48993 - 2,
               this.field_36435.field_48992,
               this.field_36435.field_48991 - 1,
               this.field_36435.field_48993,
               this.field_36435.field_48994,
               field_36439,
               field_36439,
               false
            );
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996,
               this.field_36435.field_48993 - 2,
               this.field_36435.field_48992 + 1,
               this.field_36435.field_48991,
               this.field_36435.field_48993,
               this.field_36435.field_48994 - 1,
               field_36439,
               field_36439,
               false
            );
            this.method_32500(
               var1,
               var5,
               this.field_36435.field_48996 + 1,
               this.field_36435.field_48995 + 3,
               this.field_36435.field_48992 + 1,
               this.field_36435.field_48991 - 1,
               this.field_36435.field_48995 + 3,
               this.field_36435.field_48994 - 1,
               field_36439,
               field_36439,
               false
            );
         }

         this.method_28181(
            var1, var5, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, this.field_36435.field_48993
         );
         this.method_28181(
            var1, var5, this.field_36435.field_48996 + 1, this.field_36435.field_48995, this.field_36435.field_48994 - 1, this.field_36435.field_48993
         );
         this.method_28181(
            var1, var5, this.field_36435.field_48991 - 1, this.field_36435.field_48995, this.field_36435.field_48992 + 1, this.field_36435.field_48993
         );
         this.method_28181(
            var1, var5, this.field_36435.field_48991 - 1, this.field_36435.field_48995, this.field_36435.field_48994 - 1, this.field_36435.field_48993
         );

         for (int var11 = this.field_36435.field_48996; var11 <= this.field_36435.field_48991; var11++) {
            for (int var12 = this.field_36435.field_48992; var12 <= this.field_36435.field_48994; var12++) {
               if (this.method_32514(var1, var11, this.field_36435.field_48995 - 1, var12, var5).method_8345()
                  && this.method_32522(var1, var11, this.field_36435.field_48995 - 1, var12, var5)) {
                  this.method_32529(var1, var10, var11, this.field_36435.field_48995 - 1, var12, var5);
               }
            }
         }

         return true;
      }
   }

   private void method_28181(class_700 var1, class_9616 var2, int var3, int var4, int var5, int var6) {
      if (!this.method_32514(var1, var3, var6 + 1, var5, var2).method_8345()) {
         this.method_32500(var1, var2, var3, var4, var5, var3, var6, var5, this.method_2213(), field_36439, false);
      }
   }
}
