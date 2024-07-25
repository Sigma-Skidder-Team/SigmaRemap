package remapped;

public class FastEatModule extends Module {
   public FastEatModule() {
      super(Category.PLAYER, "FastEat", "Allows you to eat faster");
      this.addSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel").method_12861("Hypixel"));
      this.addSetting(new FloatSetting<Float>("Speed", "Eating speed.", 0.55F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventListen
   public void method_20195(class_5596 var1) {
      if (this.method_42015() && mc.field_9632 != null) {
         if (mc.field_9632.method_26554()) {
            class_6098 var4 = mc.field_9632.method_26576();
            if (var4 != null
               && (var4.method_27952() == class_6209.field_31739 || var4.method_27952() == class_6209.field_31732)
               && (float) mc.field_9632.method_26466() < this.getFloatValueByName("Speed") * 32.0F) {
               String var5 = this.getStringValueByName("Mode");
               switch (var5) {
                  case "Basic":
                     int var7 = mc.field_9632.method_26466() + 2;

                     for (int var8 = 0; var8 < var7; var8++) {
                        mc.method_8614().method_4813(new class_4609(mc.field_9632.field_41726));
                        mc.field_9632.method_26474();
                     }
                     break;
                  case "Hypixel":
                     mc.method_8614()
                        .method_4813(
                           new class_7371(mc.field_9632.field_3853.field_36404 + 1 >= 9 ? 0 : mc.field_9632.field_3853.field_36404 + 1)
                        );
                     mc.method_8614().method_4813(new class_7371(mc.field_9632.field_3853.field_36404));
               }
            }
         }
      }
   }
}
