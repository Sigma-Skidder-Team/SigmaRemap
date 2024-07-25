package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public class class_5435 extends class_6408 implements class_4582 {
   private static String[] field_27686;
   public static final class_4190 field_27687 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

   public class_5435(class_3073 var1) {
      super(var1, class_240.field_817, field_27687, true, 0.14);
   }

   @Override
   public boolean method_29241(class_2522 var1) {
      return var1.method_8350(class_4783.field_23900);
   }

   @Override
   public class_6414 method_40683() {
      return class_4783.field_23371;
   }

   @Override
   public boolean method_40684(class_6414 var1) {
      return var1 != class_4783.field_23215;
   }

   @Override
   public boolean method_21238(class_6163 var1, class_1331 var2, class_2522 var3, class_2340 var4) {
      return false;
   }

   @Override
   public boolean method_21237(class_9379 var1, class_1331 var2, class_2522 var3, class_4774 var4) {
      return false;
   }

   @Override
   public int method_29242(Random var1) {
      return 1;
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      return var4.method_22007(class_6503.field_33094) && var4.method_21996() == 8 ? super.method_29302(var1) : null;
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return class_8532.field_43674.method_17649(false);
   }
}
