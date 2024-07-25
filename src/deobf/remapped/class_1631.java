package remapped;

public class class_1631 extends class_9128 {
   public class_1631() {
      super(class_5664.field_28714, "Basic", "Automatically aims at players");
      this.method_42010(new class_2748<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
   }

   @class_9148
   private void method_7262(class_3368 var1) {
      if (this.method_42015()) {
         Entity var4 = ((class_2329)this.method_42017()).method_10678(this.method_42002("Range"));
         if (var4 != null) {
            float[] var5 = class_7211.method_33013(var4);
            field_46692.field_9632.field_41701 = var5[0];
            field_46692.field_9632.field_41755 = var5[1];
         }
      }
   }
}
