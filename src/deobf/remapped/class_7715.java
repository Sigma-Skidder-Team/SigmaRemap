package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_7715 extends class_4482 {
   private final int field_39129 = class_7943.method_35969("minecraft:end_stone");

   public static List<class_3590> method_34907() {
      ArrayList var2 = new ArrayList(2);
      class_7715 var3 = new class_7715();
      var2.add(var3.method_20812("minecraft:chorus_plant"));
      var2.add(var3.method_34906());
      return var2;
   }

   public class_7715() {
      super(null);
   }

   public class_3590 method_34906() {
      return var1 -> {
         if (var1.method_42779().equals("minecraft:chorus_flower")) {
            this.method_20813().add(var1.method_42777());
         }
      };
   }

   @Override
   public byte method_20811(class_9297 var1) {
      byte var4 = super.method_20811(var1);
      if (var1.method_42778("up").equals("true")) {
         var4 = (byte)(var4 | 16);
      }

      if (var1.method_42778("down").equals("true")) {
         var4 = (byte)(var4 | 32);
      }

      return var4;
   }

   @Override
   public byte method_20810(class_1455 var1, class_9371 var2, int var3) {
      byte var6 = super.method_20810(var1, var2, var3);
      if (this.method_20814(class_2391.field_11924, this.method_338(var1, var2.method_43341(class_2391.field_11924)), false)) {
         var6 = (byte)(var6 | 16);
      }

      if (this.method_20814(class_2391.field_11922, this.method_338(var1, var2.method_43341(class_2391.field_11922)), false)) {
         var6 = (byte)(var6 | 32);
      }

      return var6;
   }

   @Override
   public boolean method_20814(class_2391 var1, int var2, boolean var3) {
      return this.method_20813().contains(var2) || var1 == class_2391.field_11922 && var2 == this.field_39129;
   }
}
