package remapped;

import java.util.List;
import java.util.Random;

public class class_3236 extends class_8549 {
   private final boolean field_16095;

   public class_3236(class_2746 var1, int var2, Random var3, int var4, int var5) {
      super(var1, var2);
      this.field_16095 = true;
      this.method_32519(class_9594.field_48893.method_44313(var3));
      this.field_43750 = class_4030.field_19578;
      if (this.method_32518().method_1029() != class_9249.field_47219) {
         this.field_36435 = new class_9616(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      } else {
         this.field_36435 = new class_9616(var4, 64, var5, var4 + 5 - 1, 74, var5 + 5 - 1);
      }
   }

   public class_3236(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13417, var1);
      this.field_16095 = false;
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
   }

   public class_3236(class_2746 var1, CompoundNBT var2) {
      super(var1, var2);
      this.field_16095 = var2.method_25933("Source");
   }

   public class_3236(class_5799 var1, CompoundNBT var2) {
      this(class_2746.field_13417, var2);
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25934("Source", this.field_16095);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      if (this.field_16095) {
         class_7965.method_36053(class_1118.class);
      }

      this.method_39334((class_4960)var1, var2, var3, 1, 1);
   }

   public static class_3236 method_14829(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -1, -7, 0, 5, 11, 5, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_3236(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32511(var1, var5, 0, 0, 0, 4, 10, 4, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 1, 7, 0);
      this.method_39330(var1, var4, var5, class_4030.field_19578, 1, 1, 4);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 2, 6, 1, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 5, 1, var5);
      this.method_32529(var1, class_4783.field_23547.method_29260(), 1, 6, 1, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 5, 2, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 4, 3, var5);
      this.method_32529(var1, class_4783.field_23547.method_29260(), 1, 5, 3, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 2, 4, 3, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 3, 3, var5);
      this.method_32529(var1, class_4783.field_23547.method_29260(), 3, 4, 3, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 3, 2, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 3, 2, 1, var5);
      this.method_32529(var1, class_4783.field_23547.method_29260(), 3, 3, 1, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 2, 2, 1, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 1, 1, var5);
      this.method_32529(var1, class_4783.field_23547.method_29260(), 1, 2, 1, var5);
      this.method_32529(var1, class_4783.field_23355.method_29260(), 1, 1, 2, var5);
      this.method_32529(var1, class_4783.field_23547.method_29260(), 1, 1, 3, var5);
      return true;
   }
}
