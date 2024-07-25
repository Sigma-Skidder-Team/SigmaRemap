package remapped;

import java.util.List;
import java.util.Random;

public class class_729 extends class_462 {
   private static String[] field_3986;

   public class_729(int var1, class_9616 var2, class_240 var3, class_1143 var4) {
      super(class_2746.field_13409, var1, var4);
      this.method_32519(var3);
      this.field_36435 = var2;
   }

   public class_729(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13409, var2);
   }

   public static class_9616 method_3338(List<class_7060> var0, Random var1, int var2, int var3, int var4, class_240 var5) {
      class_9616 var8 = new class_9616(var2, var3 - 5, var4, var2, var3 + 3 - 1, var4);
      switch (var5) {
         case field_818:
         default:
            var8.field_48991 = var2 + 3 - 1;
            var8.field_48992 = var4 - 8;
            break;
         case field_800:
            var8.field_48991 = var2 + 3 - 1;
            var8.field_48994 = var4 + 8;
            break;
         case field_809:
            var8.field_48996 = var2 - 8;
            var8.field_48994 = var4 + 3 - 1;
            break;
         case field_804:
            var8.field_48991 = var2 + 8;
            var8.field_48994 = var4 + 3 - 1;
      }

      return class_7060.method_32502(var0, var8) != null ? null : var8;
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      int var6 = this.method_32515();
      class_240 var7 = this.method_32518();
      if (var7 != null) {
         switch (var7) {
            case field_818:
            default:
               class_1087.method_4766(
                  var1, var2, var3, this.field_36435.field_48996, this.field_36435.field_48995, this.field_36435.field_48992 - 1, class_240.field_818, var6
               );
               break;
            case field_800:
               class_1087.method_4766(
                  var1, var2, var3, this.field_36435.field_48996, this.field_36435.field_48995, this.field_36435.field_48994 + 1, class_240.field_800, var6
               );
               break;
            case field_809:
               class_1087.method_4766(
                  var1, var2, var3, this.field_36435.field_48996 - 1, this.field_36435.field_48995, this.field_36435.field_48992, class_240.field_809, var6
               );
               break;
            case field_804:
               class_1087.method_4766(
                  var1, var2, var3, this.field_36435.field_48991 + 1, this.field_36435.field_48995, this.field_36435.field_48992, class_240.field_804, var6
               );
         }
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      if (!this.method_32503(var1, var5)) {
         this.method_32500(var1, var5, 0, 5, 0, 2, 7, 1, field_36439, field_36439, false);
         this.method_32500(var1, var5, 0, 0, 7, 2, 2, 8, field_36439, field_36439, false);

         for (int var10 = 0; var10 < 5; var10++) {
            this.method_32500(var1, var5, 0, 5 - var10 - (var10 >= 4 ? 0 : 1), 2 + var10, 2, 7 - var10, 2 + var10, field_36439, field_36439, false);
         }

         return true;
      } else {
         return false;
      }
   }
}
