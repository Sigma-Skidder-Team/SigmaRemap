package remapped;

import java.util.ArrayList;

public class class_2656 extends Module {
   private ArrayList<class_6310<?>> field_13091 = new ArrayList<class_6310<?>>();
   private Timer field_13090 = new Timer();
   private boolean field_13092;

   public class_2656() {
      super(Category.WORLD, "FakeLag", "Other players will see you lagging !");
      this.addSetting(new FloatSetting<Float>("Lag duration", "The lags duration", 0.3F, Float.class, 0.1F, 2.0F, 0.01F));
      this.addSetting(new FloatSetting<Float>("Delay", "The lags cooldown", 0.4F, Float.class, 0.1F, 2.0F, 0.01F));
      this.addSetting(new BooleanSetting("Combat", "Delay combat packets", true));
      this.addSetting(new BooleanSetting("Blocks", "Delay blocks packets", true));
      this.addSetting(new BooleanSetting("Ping", "Delay ping packets", true));
      this.field_13090.method_14776();
   }

   @Override
   public void method_42006() {
      this.field_13091.clear();
      this.field_13092 = false;
      this.field_13090.method_14773();
   }

   @Override
   public void method_42020() {
      for (class_6310 var4 : this.field_13091) {
         mcInstance.method_8614().method_9091().method_23481(var4);
      }
   }

   @class_9148
   private void method_12007(class_717 var1) {
      if (this.method_42015()) {
         this.field_13091.clear();
         this.field_13092 = false;
         this.field_13090.method_14773();
      }
   }

   @class_9148
   private void method_12006(class_2157 var1) {
      if (this.method_42015() && mcInstance.method_8614() != null) {
         if (!this.field_13092) {
            if ((float)this.field_13090.method_14772() > this.method_42002("Delay") * 1000.0F) {
               this.field_13092 = true;
               this.field_13090.method_14773();
            }
         } else if (!((float)this.field_13090.method_14772() > this.method_42002("Lag duration") * 1000.0F)) {
            if (!(var1.method_10047() instanceof class_4609)) {
               if (!(var1.method_10047() instanceof class_2669) && !(var1.method_10047() instanceof class_3835)) {
                  if (!(var1.method_10047() instanceof class_3398) && !(var1.method_10047() instanceof class_3195)) {
                     if (!(var1.method_10047() instanceof class_1022)
                        && !(var1.method_10047() instanceof class_1586)
                        && !(var1.method_10047() instanceof class_8585)) {
                        return;
                     }

                     if (!this.method_42007("Blocks")) {
                        return;
                     }
                  } else if (!this.method_42007("Combat")) {
                     return;
                  }
               } else if (!this.method_42007("Ping")) {
                  return;
               }
            }

            this.field_13091.add(var1.method_10047());
            var1.method_29715(true);
         } else {
            this.field_13092 = false;
            this.field_13090.method_14773();

            for (class_6310 var5 : this.field_13091) {
               mcInstance.method_8614().method_9091().method_23481(var5);
            }

            this.field_13091.clear();
         }
      }
   }
}
