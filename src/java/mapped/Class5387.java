package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5387 extends Module {
   private int field24022;

   public Class5387() {
      super(ModuleCategory.MOVEMENT, "Invaded", "Speed for Invadedlands");
      this.registerSetting(new Class6009<Float>("Speed", "Speed value", 3.0F, Float.class, 0.5F, 9.5F, 0.1F));
   }

   @Override
   public void isInDevelopment() {
   }

   @Override
   public void method15965() {
      Class9567.method37090(0.28F);
      mc.timer.field40360 = 1.0F;
   }

   @EventTarget
   public void method16969(Class4435 var1) {
      if (this.method15996()) {
         this.field24022++;
         if (this.field24022 != 1) {
            if (this.field24022 != 2) {
               if (this.field24022 >= 3) {
                  this.field24022 = 0;
                  mc.timer.field40360 = 0.25F;
                  Class9567.method37088(var1, (double)this.method15977("Speed"));
               }
            } else {
               mc.timer.field40360 = 2.0F;
               Class9567.method37088(var1, Class9567.method37075() + 0.05);
            }
         } else {
            mc.timer.field40360 = 2.0F;
            Class9567.method37088(var1, Class9567.method37075() + 0.05);
         }
      }
   }
}
