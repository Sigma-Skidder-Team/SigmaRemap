package remapped;

import java.util.Random;

public class class_2352 extends class_1279 {
   private static String[] field_11813;

   public class_2352(Direction var1, class_9616 var2) {
      super(class_2746.field_13396, var1, var2);
   }

   public class_2352(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13396, var2);
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 2, -1, 2, 11, -1, 11, field_7039, field_7039, false);
      this.method_32500(var1, var5, 0, -1, 0, 1, -1, 11, field_7037, field_7037, false);
      this.method_32500(var1, var5, 12, -1, 0, 13, -1, 11, field_7037, field_7037, false);
      this.method_32500(var1, var5, 2, -1, 0, 11, -1, 1, field_7037, field_7037, false);
      this.method_32500(var1, var5, 2, -1, 12, 11, -1, 13, field_7037, field_7037, false);
      this.method_32500(var1, var5, 0, 0, 0, 0, 0, 13, field_7039, field_7039, false);
      this.method_32500(var1, var5, 13, 0, 0, 13, 0, 13, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 0, 0, 12, 0, 0, field_7039, field_7039, false);
      this.method_32500(var1, var5, 1, 0, 13, 12, 0, 13, field_7039, field_7039, false);

      for (byte var10 = 2; var10 <= 11; var10 += 3) {
         this.method_32529(var1, field_7032, 0, 0, var10, var5);
         this.method_32529(var1, field_7032, 13, 0, var10, var5);
         this.method_32529(var1, field_7032, var10, 0, 0, var5);
      }

      this.method_32500(var1, var5, 2, 0, 3, 4, 0, 9, field_7039, field_7039, false);
      this.method_32500(var1, var5, 9, 0, 3, 11, 0, 9, field_7039, field_7039, false);
      this.method_32500(var1, var5, 4, 0, 9, 9, 0, 11, field_7039, field_7039, false);
      this.method_32529(var1, field_7039, 5, 0, 8, var5);
      this.method_32529(var1, field_7039, 8, 0, 8, var5);
      this.method_32529(var1, field_7039, 10, 0, 10, var5);
      this.method_32529(var1, field_7039, 3, 0, 10, var5);
      this.method_32500(var1, var5, 3, 0, 3, 3, 0, 7, field_7040, field_7040, false);
      this.method_32500(var1, var5, 10, 0, 3, 10, 0, 7, field_7040, field_7040, false);
      this.method_32500(var1, var5, 6, 0, 10, 7, 0, 10, field_7040, field_7040, false);
      byte var13 = 3;

      for (int var11 = 0; var11 < 2; var11++) {
         for (byte var12 = 2; var12 <= 8; var12 += 3) {
            this.method_32500(var1, var5, var13, 0, var12, var13, 2, var12, field_7039, field_7039, false);
         }

         var13 = 10;
      }

      this.method_32500(var1, var5, 5, 0, 10, 5, 2, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 8, 0, 10, 8, 2, 10, field_7039, field_7039, false);
      this.method_32500(var1, var5, 6, -1, 7, 7, -1, 8, field_7040, field_7040, false);
      this.method_5718(var1, var5, 6, -1, 3, 7, -1, 4);
      this.method_5719(var1, var5, 6, 1, 6);
      return true;
   }
}
