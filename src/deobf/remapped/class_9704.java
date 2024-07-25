package remapped;

public class class_9704 extends class_9128 {
   private boolean field_49354;

   public class_9704() {
      super(class_5664.field_28716, "NoSlow", "Stops slowdown when using an item");
      this.method_42010(new class_2826("Mode", "NoSlow mode", 0, "Vanilla", "NCP"));
   }

   @class_9148
   private void method_44839(class_3920 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @class_9148
   private void method_44840(class_1393 var1) {
      if (this.method_42015()) {
         boolean var4 = SigmaMainClass.method_3328().method_3298().method_847(class_2534.class).method_42003();
         boolean var5 = field_46692.field_9632.method_26446() != null && field_46692.field_9632.method_26446().method_27960() instanceof class_2235;
         if (!var1.method_6449()) {
            if (var5 && field_46692.field_9577.field_45559.method_27060() && !this.field_49354 && !var4 && this.method_42016("Mode").equals("NCP")) {
               class_314.method_1396();
               this.field_49354 = true;
            } else if (!var5 && this.field_49354) {
               this.field_49354 = false;
            }
         } else if (!this.method_42016("Mode").equals("NCP")) {
            if (this.field_49354 && !field_46692.field_9577.field_45559.method_27060()) {
               this.field_49354 = false;
            }
         } else if (this.field_49354 && field_46692.field_9577.field_45559.method_27060() && !var4) {
            if (var5) {
               class_314.method_1459();
            }

            this.field_49354 = false;
         }
      }
   }
}
