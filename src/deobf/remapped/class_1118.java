package remapped;

import java.util.List;
import java.util.Random;

public class class_1118 extends class_8549 {
   private final boolean field_6396;
   private final boolean field_6395;
   private final boolean field_6399;
   private final boolean field_6397;

   public class_1118(int var1, Random var2, class_9616 var3, Direction var4) {
      super(class_2746.field_13394, var1);
      this.method_32519(var4);
      this.field_43750 = this.method_39333(var2);
      this.field_36435 = var3;
      this.field_6396 = var2.nextBoolean();
      this.field_6395 = var2.nextBoolean();
      this.field_6399 = var2.nextBoolean();
      this.field_6397 = var2.nextInt(3) > 0;
   }

   public class_1118(class_5799 var1, CompoundNBT var2) {
      super(class_2746.field_13394, var2);
      this.field_6396 = var2.method_25933("leftLow");
      this.field_6395 = var2.method_25933("leftHigh");
      this.field_6399 = var2.method_25933("rightLow");
      this.field_6397 = var2.method_25933("rightHigh");
   }

   @Override
   public void method_32517(CompoundNBT var1) {
      super.method_32517(var1);
      var1.method_25934("leftLow", this.field_6396);
      var1.method_25934("leftHigh", this.field_6395);
      var1.method_25934("rightLow", this.field_6399);
      var1.method_25934("rightHigh", this.field_6397);
   }

   @Override
   public void method_32527(class_7060 var1, List<class_7060> var2, Random var3) {
      int var6 = 3;
      int var7 = 5;
      Direction var8 = this.method_32518();
      if (var8 == Direction.field_809 || var8 == Direction.field_818) {
         var6 = 8 - var6;
         var7 = 8 - var7;
      }

      this.method_39334((class_4960)var1, var2, var3, 5, 1);
      if (this.field_6396) {
         this.method_39331((class_4960)var1, var2, var3, var6, 1);
      }

      if (this.field_6395) {
         this.method_39331((class_4960)var1, var2, var3, var7, 7);
      }

      if (this.field_6399) {
         this.method_39335((class_4960)var1, var2, var3, var6, 1);
      }

      if (this.field_6397) {
         this.method_39335((class_4960)var1, var2, var3, var7, 7);
      }
   }

   public static class_1118 method_4934(List<class_7060> var0, Random var1, int var2, int var3, int var4, Direction var5, int var6) {
      class_9616 var9 = class_9616.method_44386(var2, var3, var4, -4, -3, 0, 10, 9, 11, var5);
      return method_39332(var9) && class_7060.method_32502(var0, var9) == null ? new class_1118(var6, var1, var9, var5) : null;
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      this.method_32511(var1, var5, 0, 0, 0, 9, 8, 10, true, var4, class_7965.method_36051());
      this.method_39330(var1, var4, var5, this.field_43750, 4, 3, 0);
      if (this.field_6396) {
         this.method_32500(var1, var5, 0, 3, 1, 0, 5, 3, field_36439, field_36439, false);
      }

      if (this.field_6399) {
         this.method_32500(var1, var5, 9, 3, 1, 9, 5, 3, field_36439, field_36439, false);
      }

      if (this.field_6395) {
         this.method_32500(var1, var5, 0, 5, 7, 0, 7, 9, field_36439, field_36439, false);
      }

      if (this.field_6397) {
         this.method_32500(var1, var5, 9, 5, 7, 9, 7, 9, field_36439, field_36439, false);
      }

      this.method_32500(var1, var5, 5, 1, 10, 7, 3, 10, field_36439, field_36439, false);
      this.method_32511(var1, var5, 1, 2, 1, 8, 2, 6, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 4, 1, 5, 4, 4, 9, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 8, 1, 5, 8, 4, 9, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 1, 4, 7, 3, 4, 9, false, var4, class_7965.method_36051());
      this.method_32511(var1, var5, 1, 3, 5, 3, 3, 6, false, var4, class_7965.method_36051());
      this.method_32500(var1, var5, 1, 3, 4, 3, 3, 4, class_4783.field_23547.method_29260(), class_4783.field_23547.method_29260(), false);
      this.method_32500(var1, var5, 1, 4, 6, 3, 4, 6, class_4783.field_23547.method_29260(), class_4783.field_23547.method_29260(), false);
      this.method_32511(var1, var5, 5, 1, 7, 7, 1, 8, false, var4, class_7965.method_36051());
      this.method_32500(var1, var5, 5, 1, 9, 7, 1, 9, class_4783.field_23547.method_29260(), class_4783.field_23547.method_29260(), false);
      this.method_32500(var1, var5, 5, 2, 7, 7, 2, 7, class_4783.field_23547.method_29260(), class_4783.field_23547.method_29260(), false);
      this.method_32500(var1, var5, 4, 5, 7, 4, 5, 9, class_4783.field_23547.method_29260(), class_4783.field_23547.method_29260(), false);
      this.method_32500(var1, var5, 8, 5, 7, 8, 5, 9, class_4783.field_23547.method_29260(), class_4783.field_23547.method_29260(), false);
      this.method_32500(
         var1,
         var5,
         5,
         5,
         7,
         7,
         5,
         9,
         class_4783.field_23547.method_29260().method_10308(class_6344.field_32395, class_6666.field_34469),
         class_4783.field_23547.method_29260().method_10308(class_6344.field_32395, class_6666.field_34469),
         false
      );
      this.method_32529(var1, class_4783.field_23740.method_29260().method_10308(class_2634.field_12970, Direction.field_800), 6, 5, 6, var5);
      return true;
   }
}
