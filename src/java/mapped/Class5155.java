package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4399;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5155 extends Module {
   private int field23405;
   private boolean field23406;
   private double field23407;

   public Class5155() {
      super(ModuleCategory.MOVEMENT, "Hypixel", "Highjump for Hypixel");
      this.registerSetting(new Class6009<Float>("Motion", "Highjump motion", 0.75F, Float.class, 0.42F, 5.0F, 0.05F));
   }

   @Override
   public void isInDevelopment() {
      this.field23405 = -1;
      this.field23406 = false;
      this.field23407 = 999.0;
   }

   @EventTarget
   public void method16018(Class4435 var1) {
      if (this.method15996() && mc.player != null) {
         if (mc.player.field5045 > 3.0F + this.method15977("Motion") * 4.0F && var1.method13994() < -0.3) {
            if (this.field23406) {
               if (mc.player.getPosY() + var1.method13994() < this.field23407) {
                  var1.method13995(this.field23407 - mc.player.getPosY());
                  this.field23406 = false;
               }
            } else {
               this.field23405 = 0;
            }
         }

         if (this.field23405 >= 0) {
            this.field23405++;
            var1.method13995(0.0);
            Class9567.method37088(var1, 0.0);
            var1.method13995((double)this.method15977("Motion"));
            this.field23406 = true;
            this.field23407 = mc.player.getPosY();
            this.field23405 = -1;
         }

         if (this.field23406 && Class5628.method17730(mc.player, 0.001F)) {
            this.field23406 = !this.field23406;
         }

         Class5628.method17725(var1.method13994());
      }
   }

   @EventTarget
   public void method16019(Class4399 var1) {
      if (this.method15996()) {
         if (this.field23405 >= 0) {
            var1.method13908(true);
         }
      }
   }
}
