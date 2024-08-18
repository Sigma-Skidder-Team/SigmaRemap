package remapped;

public class class_4599 extends class_1859 {
   public Module field_22361;

   public class_4599(class_7038 var1, String var2, int var3, int var4, int var5, int var6, Module var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field_22361 = var7;
      class_3540 var10;
      this.method_32148(var10 = new class_3540(this, "enable", 114, 9, 40, 18));
      var10.method_16323(var7.isEnabled());
      var10.method_8236(var2x -> var7.setEnabled2(var10.method_16328()));
      if (var7.method_41996().size() > 0) {
         class_3534 var11;
         this.method_32148(var11 = new class_3534(this, "gear", 132, 32));
         var11.method_32100((var2x, var3x) -> ((class_9573)this.method_32167()).method_44239(var7));
      }
   }

   @Override
   public void method_32178(float var1) {
      FontManager.method_87(
         class_3054.field_14989,
         (float)(this.field_36270 + 10),
         (float)(this.field_36261 + 8),
         this.field_22361.getName2(),
         class_314.method_1444(class_1255.field_6929.field_6917, !this.field_22361.isEnabled() ? 0.5F : 0.9F)
      );
      FontManager.method_87(
         class_3054.field_15006,
         (float)(this.field_36270 + 15),
         (float)(this.field_36261 + 33),
         "Bind",
         class_314.method_1444(class_1255.field_6929.field_6917, 1.0F)
      );
      FontManager.method_87(
         class_3054.field_15006,
         (float)(this.field_36270 + 15),
         (float)(this.field_36261 + 52),
         class_314.method_1451(this.field_22361.getIntValueByName("Keybind")),
         class_314.method_1444(class_1255.field_6929.field_6917, 0.7F)
      );
      if (this.field_22361.method_41996().size() > 1) {
         FontManager.method_87(
            class_3054.field_14992,
            (float)(this.field_36270 + 84),
            (float)(this.field_36261 + 34),
            "Settings",
            class_314.method_1444(class_1255.field_6929.field_6917, 1.0F)
         );
      }

      super.method_32178(var1);
   }
}
