package remapped;

import java.util.List;
import java.util.Random;

public class class_2372 extends class_8549 {
   private boolean field_11872;

   public class_2372(int var1, Random var2, class_9616 var3, class_240 var4) {
      super(class_2746.field_13431, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
   }

   public class_2372(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13431, var2);
      this.field_11872 = var2.method_25933("Chest");
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25934("Chest", this.field_11872);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      this.method_39334((class_4960)var1, var2, var3, 1, 1);
   }

   public static class_2372 method_10852(List<class_7060> var0, Random var1, int var2, int var3, int var4, class_240 var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -1, 0, 5, 5, 7, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_2372(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32511(var1, var5, 0, 0, 0, 4, 4, 6, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 1, 1, 0);
      this.method_39330(var1, var4, var5, class_4030.field_19578, 1, 1, 6);
      this.method_32500(var1, var5, 3, 1, 2, 3, 1, 4, class_4783.field_23355.method_29260(), class_4783.field_23355.method_29260(), false);
      this.method_32529(var1, class_4783.field_23449.method_29260(), 3, 1, 1, var5);
      this.method_32529(var1, class_4783.field_23449.method_29260(), 3, 1, 5, var5);
      this.method_32529(var1, class_4783.field_23449.method_29260(), 3, 2, 2, var5);
      this.method_32529(var1, class_4783.field_23449.method_29260(), 3, 2, 4, var5);

      for (int var10 = 2; var10 <= 4; var10++) {
         this.method_32529(var1, class_4783.field_23449.method_29260(), 2, 1, var10, var5);
      }

      if (!this.field_11872 && var5.method_44395(new class_1331(this.method_32530(3, 3), this.method_32507(2), this.method_32523(3, 3)))) {
         this.field_11872 = true;
         this.method_32525(var1, var5, var4, 3, 2, 3, class_5931.field_30141);
      }

      return true;
   }
}
