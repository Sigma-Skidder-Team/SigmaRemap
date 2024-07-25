package remapped;

public class OldAACSpeed extends Module {
   private double field_37949;
   private float field_37947;
   private int field_37948;
   private int field_37951;

   public OldAACSpeed() {
      super(Category.MOVEMENT, "OldAAC", "Speed for old version of AAC");
      this.addSetting(new BooleanSetting("Auto Jump", "Automatically jumps for you.", true));
   }

   @Override
   public void onDisable() {
   }

   @Override
   public void onEnable() {
      this.field_37951 = SigmaMainClass.getInstance().method_3310().method_25293() <= 0 ? 1 : 0;
      this.field_37949 = class_8865.method_40775();
      this.field_37947 = class_8865.method_40787()[0];
   }

   @EventListen
   public void method_33889(class_7767 var1) {
      if (this.method_42015()) {
         if (!mc.field_9632.field_41726) {
            if (class_314.method_1434() && AACAntiKB.field_39147 >= 7) {
               this.field_37948++;
               if (this.field_37948 == 1) {
                  if (this.field_37951 != 1) {
                     if (this.field_37951 == 2) {
                        this.field_37949 = 0.362;
                     }
                  } else {
                     this.field_37949 = 0.306;
                  }
               }

               if (mc.field_9632.field_41744) {
                  this.field_37949 = class_8865.method_40775();
               }

               this.field_37947 = class_8865.method_40780(var1, this.field_37949, class_8865.method_40787()[0], this.field_37947, 45.0F);
            }
         } else if (this.getBooleanValueByName("Auto Jump") && class_314.method_1434()) {
            this.field_37948 = 0;
            mc.field_9632.method_26595();
            var1.method_35232(mc.field_9632.method_37098().field_7336);
            var1.method_35235(mc.field_9632.method_37098().field_7333);
            var1.method_35229(mc.field_9632.method_37098().field_7334);
         } else if (var1.method_35236() != 0.4 + (double)class_8865.method_40769() * 0.1) {
            this.field_37951 = 0;
         } else {
            class_8865.method_40777(var1, this.field_37949);
         }
      }
   }

   @EventListen
   public void method_33888(class_2911 var1) {
      if (this.method_42015()) {
         if (this.field_37951 < 2) {
            this.field_37951++;
         }

         if (this.field_37951 != 1) {
            if (this.field_37951 == 2) {
               this.field_37949 = 0.6;
            }
         } else {
            this.field_37949 = 0.5;
         }

         this.field_37947 = class_8865.method_40787()[0];
         var1.method_13315(this.field_37949);
         var1.method_13313(0.4 + (double)class_8865.method_40769() * 0.1);
         this.field_37948 = 0;
      }
   }

   @EventListen
   public void method_33887(PacketEvent var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_37951 = 0;
            this.field_37949 = class_8865.method_40775();
         }
      }
   }
}
