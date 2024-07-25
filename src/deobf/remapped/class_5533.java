package remapped;

import java.util.UUID;

public class class_5533 extends class_4486 {
   private static String[] field_28210;

   @Override
   public void method_18998() {
      this.method_19017(class_1730.field_8919, 0, 0, new class_9353(this));
      this.method_19016(class_1730.field_8919, 1, 1);
      this.method_19016(class_1730.field_8922, 0, 0);
      this.method_19016(class_1730.field_8922, 1, 1);
      this.method_19017(class_1730.field_8922, 2, 2, new class_2398(this));
      this.method_19016(class_1730.field_8922, 3, 3);
      this.method_18989(class_1730.field_8922, 4, 4);
      this.method_18989(class_1730.field_8919, 0, 0);
      this.method_18989(class_1730.field_8919, 1, 1);
      this.method_18990(class_1730.field_8922, 0, 0, new class_9500(this));
      this.method_18989(class_1730.field_8922, 1, 1);
      this.method_18989(class_1730.field_8922, 2, 2);
   }

   public static String method_25129(String var0) {
      StringBuilder var3 = new StringBuilder(var0);
      var3.insert(20, '-');
      var3.insert(16, '-');
      var3.insert(12, '-');
      var3.insert(8, '-');
      return var3.toString();
   }

   public UUID method_25130(class_5051 var1) throws Exception {
      String var4 = var1.<String>method_23261(class_8039.field_41171);
      if (var4.length() == 32) {
         var4 = method_25129(var4);
      }

      return UUID.fromString(var4);
   }
}
