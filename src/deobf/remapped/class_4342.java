package remapped;

public class class_4342 extends class_9128 {
   public class_4342() {
      super(class_5664.field_28710, "FastEat", "Allows you to eat faster");
      this.method_42010(new class_2826("Mode", "Mode", 0, "Basic", "Hypixel").method_12861("Hypixel"));
      this.method_42010(new class_2748<Float>("Speed", "Eating speed.", 0.55F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @class_9148
   public void method_20195(class_5596 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (field_46692.field_9632.method_26554()) {
            class_6098 var4 = field_46692.field_9632.method_26576();
            if (var4 != null
               && (var4.method_27952() == class_6209.field_31739 || var4.method_27952() == class_6209.field_31732)
               && (float)field_46692.field_9632.method_26466() < this.method_42002("Speed") * 32.0F) {
               String var5 = this.method_42016("Mode");
               switch (var5) {
                  case "Basic":
                     int var7 = field_46692.field_9632.method_26466() + 2;

                     for (int var8 = 0; var8 < var7; var8++) {
                        field_46692.method_8614().method_4813(new class_4609(field_46692.field_9632.field_41726));
                        field_46692.field_9632.method_26474();
                     }
                     break;
                  case "Hypixel":
                     field_46692.method_8614()
                        .method_4813(
                           new class_7371(field_46692.field_9632.field_3853.field_36404 + 1 >= 9 ? 0 : field_46692.field_9632.field_3853.field_36404 + 1)
                        );
                     field_46692.method_8614().method_4813(new class_7371(field_46692.field_9632.field_3853.field_36404));
               }
            }
         }
      }
   }
}
