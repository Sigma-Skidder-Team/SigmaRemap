package remapped;

public class class_4677 implements class_857 {
   public class_4677(class_5092 var1) {
      this.field_22797 = var1;
   }

   @Override
   public void method_3722(class_5051 var1) throws Exception {
      int var4 = var1.<Integer>method_23242(class_8039.field_41157);
      var1.method_23236(class_8039.field_41157, var4 + 6);

      for (int var5 = 0; var5 < var4; var5++) {
         var1.<String>method_23261(class_8039.field_41171);
         int[] var6 = var1.<int[]>method_23261(class_8039.field_41144);

         for (int var7 = 0; var7 < var6.length; var7++) {
            var6[var7] = this.field_22797.field_26270.method_27301().method_28207(var6[var7]);
         }
      }

      var1.method_23236(class_8039.field_41171, "minecraft:signs");
      var1.method_23236(
         class_8039.field_41144,
         new int[]{this.field_22797.field_26270.method_27301().method_28207(150), this.field_22797.field_26270.method_27301().method_28207(155)}
      );
      var1.method_23236(class_8039.field_41171, "minecraft:wall_signs");
      var1.method_23236(class_8039.field_41144, new int[]{this.field_22797.field_26270.method_27301().method_28207(155)});
      var1.method_23236(class_8039.field_41171, "minecraft:standing_signs");
      var1.method_23236(class_8039.field_41144, new int[]{this.field_22797.field_26270.method_27301().method_28207(150)});
      var1.method_23236(class_8039.field_41171, "minecraft:fences");
      var1.method_23236(class_8039.field_41144, new int[]{189, 248, 472, 473, 474, 475});
      var1.method_23236(class_8039.field_41171, "minecraft:walls");
      var1.method_23236(class_8039.field_41144, new int[]{271, 272});
      var1.method_23236(class_8039.field_41171, "minecraft:wooden_fences");
      var1.method_23236(class_8039.field_41144, new int[]{189, 472, 473, 474, 475});
      int var9 = var1.<Integer>method_23242(class_8039.field_41157);
      var1.method_23236(class_8039.field_41157, var9 + 2);

      for (int var10 = 0; var10 < var9; var10++) {
         var1.<String>method_23261(class_8039.field_41171);
         int[] var12 = var1.<int[]>method_23261(class_8039.field_41144);

         for (int var8 = 0; var8 < var12.length; var8++) {
            var12[var8] = this.field_22797.field_26270.method_27301().method_28210(var12[var8]);
         }
      }

      var1.method_23236(class_8039.field_41171, "minecraft:signs");
      var1.method_23236(class_8039.field_41144, new int[]{this.field_22797.field_26270.method_27301().method_28210(541)});
      var1.method_23236(class_8039.field_41171, "minecraft:arrows");
      var1.method_23236(class_8039.field_41144, new int[]{526, 825, 826});
      int var11 = var1.<Integer>method_23261(class_8039.field_41157);

      for (int var13 = 0; var13 < var11; var13++) {
         var1.<String>method_23261(class_8039.field_41171);
         var1.<int[]>method_23261(class_8039.field_41144);
      }

      var1.method_23236(class_8039.field_41157, 0);
   }
}
