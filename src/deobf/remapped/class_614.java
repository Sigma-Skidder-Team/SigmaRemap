package remapped;

import java.util.concurrent.ThreadLocalRandom;

public class class_614 implements class_857 {
   public class_614(class_490 var1) {
      this.field_3493 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_5051 var4 = var1.method_23259(8);
      var4.method_23236(class_8039.field_41175, (short)var1.method_23255().<class_4074>method_6746(class_4074.class).method_18787());
      var4.method_23236(class_8039.field_41166, (short)-999);
      var4.method_23236(class_8039.field_41133, (byte)2);
      var4.method_23236(class_8039.field_41166, (short)ThreadLocalRandom.current().nextInt());
      var4.method_23236(class_8039.field_41157, 5);
      class_5531 var5 = new class_5531("");
      var5.<class_7948>method_25122(new class_7948("force_resync", Double.NaN));
      var4.method_23236(class_8039.field_41162, new class_9530(1, (byte)1, (short)0, var5));
      var4.method_23265(class_5988.class, true, false);
   }
}
