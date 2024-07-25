package remapped;

public class class_6526 extends class_9128 {
   private int field_33210;

   public class_6526() {
      super(class_5664.field_28717, "TP", "Disabler working on some anticheats.");
      this.method_42010(new class_2748<Float>("Delay", "Tp delay.", 20.0F, Float.class, 5.0F, 40.0F, 1.0F));
      this.method_42010(new class_2826("Mode", "Mode", 0, "Basic1", "Basic2", "MinInfinity", "MaxInfinity", "MinValue", "MaxValue"));
      this.method_42010(new class_8563("OnGround", "Send on ground packets.", false));
      this.method_42010(new class_8563("More Packets", "Send more packets.", false));
      this.method_42010(new class_8563("Ping spoof", "Spoof your ping.", false));
   }

   @Override
   public void method_42006() {
      this.field_33210 = 0;
   }

   @class_9148
   public void method_29713(class_1393 var1) {
      if (this.method_42015() && field_46692.field_9632 != null && var1.method_6449() && field_46692.method_8530() != null) {
         this.field_33210++;
         double var4 = -4.503599627370497E15;
         String var6 = this.method_42016("Mode");
         switch (var6) {
            case "Basic1":
               var4 = field_46692.field_9632.method_37309() - 20.0;
               break;
            case "Basic2":
               var4 = field_46692.field_9632.method_37309() - 1000.0 + Math.random() * 1000.0;
               break;
            case "MinInfinity":
               var4 = Double.NEGATIVE_INFINITY;
               break;
            case "MaxInfinity":
               var4 = Double.POSITIVE_INFINITY;
               break;
            case "MinValue":
               var4 = Double.MIN_VALUE;
               break;
            case "MaxValue":
               var4 = Double.MAX_VALUE;
         }

         if ((float)this.field_33210 >= this.method_42002("Delay")) {
            this.field_33210 = 0;
            boolean var8 = this.method_42007("OnGround");
            if (this.method_42007("More Packets")) {
               field_46692.method_8614().method_4813(new class_9515(field_46692.field_9632.method_37302(), var4, field_46692.field_9632.method_37302(), var8));
            } else {
               var1.method_6455(var4);
               var1.method_6451(var8);
            }
         }
      }
   }
}
