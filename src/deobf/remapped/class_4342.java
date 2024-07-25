package remapped;

public class class_4342 extends Module {
   public class_4342() {
      super(Category.PLAYER, "FastEat", "Allows you to eat faster");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel").method_12861("Hypixel"));
      this.addSetting(new FloatSetting<Float>("Speed", "Eating speed.", 0.55F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventListen
   public void method_20195(class_5596 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (mcInstance.field_9632.method_26554()) {
            class_6098 var4 = mcInstance.field_9632.method_26576();
            if (var4 != null
               && (var4.method_27952() == class_6209.field_31739 || var4.method_27952() == class_6209.field_31732)
               && (float) mcInstance.field_9632.method_26466() < this.getFloatValueByName("Speed") * 32.0F) {
               String var5 = this.getStringValueByName("Mode");
               switch (var5) {
                  case "Basic":
                     int var7 = mcInstance.field_9632.method_26466() + 2;

                     for (int var8 = 0; var8 < var7; var8++) {
                        mcInstance.method_8614().method_4813(new class_4609(mcInstance.field_9632.field_41726));
                        mcInstance.field_9632.method_26474();
                     }
                     break;
                  case "Hypixel":
                     mcInstance.method_8614()
                        .method_4813(
                           new class_7371(mcInstance.field_9632.field_3853.field_36404 + 1 >= 9 ? 0 : mcInstance.field_9632.field_3853.field_36404 + 1)
                        );
                     mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
               }
            }
         }
      }
   }
}
