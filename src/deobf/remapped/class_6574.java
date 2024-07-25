package remapped;

import java.util.LinkedList;

public class class_6574 implements class_857 {
   private static String[] field_33516;

   public class_6574(class_1682 var1) {
      this.field_33515 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_4074 var4 = var1.method_23255().<class_4074>method_6746(class_4074.class);
      int var5 = var1.<Integer>method_23248(class_8039.field_41157, 0);
      var4.method_18779(var5, true);
      class_9371 var6 = var1.<class_9371>method_23242(class_8039.field_41137);
      LinkedList var7 = new LinkedList();
      var7.add(new class_5407(12, class_5884.field_29876, var6));
      if (var4.method_14874() != var5) {
         var7.add(new class_5407(6, class_5884.field_29892, class_2152.method_10042(var5, var4)));
      }

      var1.method_23236(class_7498.field_38252, var7);
   }
}
