package remapped;

import java.util.UUID;

public class class_1604 extends class_5989 {
   private static UUID field_8335 = UUID.fromString("8667ba71-b85a-4004-af54-457a9734eed7");

   public class_1604(class_1893 var1, class_174 var2, class_1092 var3, class_4156 var4, class_2716 var5, boolean var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6, var7);
   }

   @Override
   public void method_27305() {
      class_4868 var3 = new class_4868();
      SigmaMainClass.method_3328().method_3302().method_7914(var3);
      if (!var3.method_29716()) {
         super.method_27305();
      }
   }

   @Override
   public void method_37226(class_7412 var1, class_1343 var2) {
      class_7767 var5 = new class_7767(var2);
      SigmaMainClass.method_3328().method_3302().method_7914(var5);
      if (!var5.method_29716()) {
         super.method_37226(var1, new class_1343(var5.method_35234(), var5.method_35236(), var5.method_35231()));
      }
   }

   @Override
   public void method_37160(double var1, double var3, double var5) {
      class_3574 var9 = new class_3574();
      SigmaMainClass.method_3328().method_3302().method_7914(var9);
      if (!var9.method_29716()) {
         super.method_37160(var1, var3, var5);
      }
   }

   @Override
   public void method_37123() {
      class_5596 var3 = new class_5596();
      if (class_1235.field_6811 && this.field_41697 > 1000) {
         try {
            if (this.field_41697 % 150 == 0) {
               Thread.sleep((long)(1800.0 + 7000.0 * Math.random()));
            } else if (this.field_41697 % 42 == 0 && Math.random() > 0.2F) {
               Thread.sleep((long)(200.0 + 300.0 * Math.random()));
            }
         } catch (InterruptedException var5) {
         }
      }

      SigmaMainClass.method_3328().method_3302().method_7914(var3);
      if (!var3.method_29716()) {
         super.method_37123();
      }
   }

   @Override
   public void method_26417() {
      super.method_26417();
      SigmaMainClass.method_3328().method_3302().method_7914(new class_4218());
   }
}
