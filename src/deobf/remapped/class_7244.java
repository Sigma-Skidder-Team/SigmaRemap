package remapped;

public class class_7244 extends Module {
   public class_7244() {
      super(class_5664.field_28714, "Basic", "Places block underneath");
      this.addSetting(new BooleanSetting("Explosions", "Cancels Explosions knockback", true));
      this.addSetting(new FloatSetting<Float>("H-Multiplier", "Horizontal velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("V-Multiplier", "Vertical velocity multiplier", 0.0F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @class_9148
   private void method_33141(class_139 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && var1.method_557() instanceof class_4548) {
            class_4548 var4 = (class_4548)var1.method_557();
            if (var4.method_21093() == mcInstance.field_9632.method_37145()) {
               if (this.method_42002("H-Multiplier") == 0.0F && this.method_42002("V-Multiplier") == 0.0F) {
                  var1.method_29715(true);
               }

               var4.field_22171 = (int)((float)var4.field_22171 * this.method_42002("H-Multiplier"));
               var4.field_22167 = (int)((float)var4.field_22167 * this.method_42002("H-Multiplier"));
               var4.field_22168 = (int)((float)var4.field_22168 * this.method_42002("V-Multiplier"));
            }
         }

         if (var1.method_557() instanceof class_1897 && this.method_42007("Explosions")) {
            class_1897 var5 = (class_1897)var1.method_557();
            var5.field_9687 = var5.field_9687 * this.method_42002("H-Multiplier");
            var5.field_9693 = var5.field_9693 * this.method_42002("H-Multiplier");
            var5.field_9692 = var5.field_9692 * this.method_42002("V-Multiplier");
         }
      }
   }
}
