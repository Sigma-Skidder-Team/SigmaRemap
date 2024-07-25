package remapped;

import java.util.List;
import java.util.Random;

public class class_3413 extends class_6315 {
   private boolean field_16803;

   public class_3413(int var1, Random var2, class_9616 var3, class_240 var4) {
      super(class_2746.field_13413, var1);
      this.method_32519(var4);
      this.field_36435 = var3;
      this.field_16803 = var2.nextInt(3) == 0;
   }

   public class_3413(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13413, var2);
      this.field_16803 = var2.method_25933("Chest");
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25934("Chest", this.field_16803);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_28785((class_1695)var1, var2, var3, 0, 1, true);
   }

   public static class_3413 method_15757(List<class_7060> var0, Random var1, int var2, int var3, int var4, class_240 var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, 0, 0, 5, 7, 5, var5);
      return method_28781(var9) && class_7060.method_32502(var0, var9) == null ? new class_3413(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32500(var1, var5, 0, 0, 0, 4, 1, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 0, 4, 5, 4, class_4783.field_23184.method_29260(), class_4783.field_23184.method_29260(), false);
      class_2522 var10 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49664, Boolean.valueOf(true))
         .method_10308(class_3821.field_49667, Boolean.valueOf(true));
      class_2522 var11 = class_4783.field_23587
         .method_29260()
         .method_10308(class_3821.field_49671, Boolean.valueOf(true))
         .method_10308(class_3821.field_49670, Boolean.valueOf(true));
      this.method_32500(var1, var5, 4, 2, 0, 4, 5, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 4, 3, 1, 4, 4, 1, var11, var11, false);
      this.method_32500(var1, var5, 4, 3, 3, 4, 4, 3, var11, var11, false);
      this.method_32500(var1, var5, 0, 2, 0, 0, 5, 0, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 0, 2, 4, 3, 5, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);
      this.method_32500(var1, var5, 1, 3, 4, 1, 4, 4, var10, var10, false);
      this.method_32500(var1, var5, 3, 3, 4, 3, 4, 4, var10, var10, false);
      if (this.field_16803 && var5.method_44395(new class_1331(this.method_32530(3, 3), this.method_32507(2), this.method_32523(3, 3)))) {
         this.field_16803 = false;
         this.method_32525(var1, var5, var4, 3, 2, 3, class_5931.field_30106);
      }

      this.method_32500(var1, var5, 0, 6, 0, 4, 6, 4, class_4783.field_23484.method_29260(), class_4783.field_23484.method_29260(), false);

      for (int var12 = 0; var12 <= 4; var12++) {
         for (int var13 = 0; var13 <= 4; var13++) {
            this.method_32499(var1, class_4783.field_23484.method_29260(), var12, -1, var13, var5);
         }
      }

      return true;
   }
}
