package remapped;

import com.google.gson.JsonElement;

public class class_7495 implements class_857 {
   public class_7495(class_6587 var1) {
      this.field_38240 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      class_9371 var4 = var1.<class_9371>method_23242(class_8039.field_41137);
      JsonElement[] var5 = new JsonElement[4];

      for (int var6 = 0; var6 < 4; var6++) {
         var5[var6] = var1.<JsonElement>method_23242(class_8039.field_41143);
      }

      var1.method_23246();
      var1.method_23253(9);
      var1.method_23236(class_8039.field_41137, var4);
      var1.method_23236(class_8039.field_41175, (short)9);
      class_5531 var8 = new class_5531("");
      var8.<class_887>method_25122(new class_887("id", "Sign"));
      var8.<class_5232>method_25122(new class_5232("x", var4.method_43340()));
      var8.<class_5232>method_25122(new class_5232("y", var4.method_43342()));
      var8.<class_5232>method_25122(new class_5232("z", var4.method_43343()));

      for (int var7 = 0; var7 < var5.length; var7++) {
         var8.<class_887>method_25122(new class_887("Text" + (var7 + 1), var5[var7].toString()));
      }

      var1.method_23236(class_8039.field_41158, var8);
   }
}
