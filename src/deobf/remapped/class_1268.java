package remapped;

public class class_1268 extends class_9128 {
   public class_1268() {
      super(class_5664.field_28714, "HitSounds", "Changes the player hurting sounds client side.");
   }

   @class_9148
   @class_7664
   private void method_5701(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_295) {
            class_295 var4 = (class_295)var1.method_557();
            if (var4.method_1331(field_46692.field_9601) == null
               || !var4.method_1331(field_46692.field_9601).method_37330()
               || var4.method_1331(field_46692.field_9601).method_37175(field_46692.field_9632) > 5.0F
               || var4.method_1331(field_46692.field_9601) == field_46692.field_9632) {
               return;
            }
         }
      }
   }
}
