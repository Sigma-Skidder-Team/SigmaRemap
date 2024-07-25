package remapped;

public class class_5377 extends Module {
   public class_5377() {
      super(class_5664.field_28716, "FastLadder", "Allows you to climp ladders faster");
      this.method_42010(new class_2748<Float>("Motion", "Climbing motion", 0.35F, Float.class, 0.2F, 1.0F, 0.05F));
      this.method_42010(new class_2826("Down mode", "The way you will go down on ladders", 0, "None", "OnSneak", "Always"));
   }

   @class_9148
   private void method_24511(class_7767 var1) {
      if (this.method_42015() && field_46692.field_9632.method_26505()) {
         boolean var4 = class_3347.method_15349() >= class_412.field_1724.method_2055() || field_46692.method_8530() == null;
         if (!field_46692.field_9632.field_41744 && (!field_46692.field_9632.field_29654 || !var4)) {
            if (this.method_42016("Down mode").equals("OnSneak") && field_46692.field_9577.field_45560.method_27060()
               || this.method_42016("Down mode").equals("Always")) {
               var1.method_35235((double)(-this.method_42002("Motion")));
            }
         } else {
            var1.method_35235((double)this.method_42002("Motion"));
         }
      }
   }
}
