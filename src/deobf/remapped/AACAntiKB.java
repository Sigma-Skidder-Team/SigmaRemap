package remapped;

public class AACAntiKB extends Module {
   public static int field_39147;
   public float field_39149;
   public float field_39148;

   public AACAntiKB() {
      super(Category.COMBAT, "AAC", "Places block underneath");
      this.addSetting(new FloatSetting<Float>("Strengh", "Boost strengh", 0.7F, Float.class, 0.0F, 1.0F, 0.01F));
      field_39147 = 20;
   }

   @Override
   public void onDisable() {
      field_39147 = 20;
   }

   @EventListen
   private void method_34927(class_7767 var1) {
      if (this.method_42015() && client.thePlayer != null) {
         if (this.method_34925()) {
            if (field_39147 == 0 && !client.thePlayer.field_41726 && client.thePlayer.field_29645 > 0 && client.thePlayer.field_41706 < 2.0F) {
               client.thePlayer.method_37186(0.0, -1.0, 0.0);
               class_314.method_1408(client.thePlayer.method_37098().method_60());
               client.thePlayer.field_41726 = true;
               field_39147 = 20;
            }
         } else {
            if (field_39147 < 7) {
               field_39147++;
               if (field_39147 > 1) {
                  float var4 = class_8865.method_40773()[1];
                  float var5 = class_8865.method_40773()[2];
                  float var6 = class_8865.method_40773()[0];
                  double var7 = Math.cos(Math.toRadians((double)var6));
                  double var9 = Math.sin(Math.toRadians((double)var6));
                  double var11 = (double)((float)(7 - field_39147) * this.getFloatValueByName("Strengh")) * 0.04 * (double)this.field_39148 * 0.2;
                  double var13 = ((double)var4 * var7 + (double)var5 * var9) * var11;
                  double var15 = ((double)var4 * var9 - (double)var5 * var7) * var11;
                  float var17 = (float)(Math.atan2(var13, var15) * 180.0 / Math.PI) - 90.0F;
                  float var18 = class_7211.method_32998(this.field_39149, var17);
                  if (var18 > 100.0F && class_314.method_1434()) {
                     var1.method_35232(var1.method_35234() + var13);
                     var1.method_35229(var1.method_35231() + var15);
                  } else {
                     var1.method_35232(var1.method_35234() * 0.8);
                     var1.method_35229(var1.method_35231() * 0.8);
                  }

                  class_314.method_1463(var1.method_35234());
                  class_314.method_1405(var1.method_35231());
               }
            }
         }
      }
   }

   @EventListen
   private void method_34926(PacketEvent var1) {
      if (this.method_42015() && client.thePlayer != null) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_4548) {
            if (this.method_34925()) {
               field_39147 = 0;
               return;
            }

            class_4548 var5 = (class_4548)var4;
            if (var5.method_21093() == client.thePlayer.method_37145() && (var5.field_22171 != 0 || var5.field_22167 != 0)) {
               this.field_39148 = (float)(Math.sqrt((double)(var5.field_22171 * var5.field_22171 + var5.field_22167 * var5.field_22167)) / 1000.0);
               this.field_39149 = (float)(Math.atan2((double)(var5.field_22171 / 1000), (double)(var5.field_22167 / 1000)) * 180.0 / Math.PI) - 90.0F;
               field_39147 = 0;
            }
         }

         if (var1.method_557() instanceof class_1897) {
            class_1897 var6 = (class_1897)var4;
         }
      }
   }

   public boolean method_34925() {
      return this.getFloatValueByName("Strengh") == 0.0F;
   }
}
