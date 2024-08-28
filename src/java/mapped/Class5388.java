package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5388 extends Module {
   private boolean field24023;
   private double field24024;
   private double field24025;
   private double field24026;

   public Class5388() {
      super(ModuleCategory.MOVEMENT, "Mineplex", "Highjump for Mineplex");
      this.method15972(new Class6009<Float>("Motion", "Highjump motion", 1.1F, Float.class, 0.42F, 5.0F, 0.05F));
      this.method15972(new Class6004("Disable", "Disable on landing.", true));
      this.method15972(new Class6004("Fake fly", "Am i flying ?", false));
   }

   @Override
   public void isInDevelopment() {
      this.field24023 = false;
   }

   @EventTarget
   public void method16970(Class4417 var1) {
      if (this.method15996() && mc.field1339.field5036) {
         var1.method13966(true);
      }
   }

   @EventTarget
   public void method16971(Class4435 var1) {
      if (this.method15996()) {
         if (this.field24023 && mc.field1339.getPosY() + 0.42 < this.field24026) {
            this.method16004().method16000();
         }

         if (!mc.field1339.field5036 && this.field24023) {
            this.field24024 = Math.max(this.field24024, 0.499);
            Class9567.method37088(var1, this.field24024);
            this.field24024 -= 0.007;
            double var4 = 0.5;
            if (this.method15977("Motion") > 3.0F) {
               var4 -= 0.8;
            }

            if (Math.abs(var1.method13994()) < var4 && Math.abs(this.field24025) < var4) {
               this.field24025 -= 0.04000000000001;
               var1.method13995(this.field24025);
               Class5628.method17725(var1.method13994());
            } else {
               this.field24025 = var1.method13994();
            }
         }
      }
   }

   @EventTarget
   public void method16972(Class4404 var1) {
      if (this.method15996()) {
         if (mc.field1339.field5036) {
            if (this.field24023) {
               this.field24023 = !this.field24023;
               Class9567.method37090(0.0);
               if (this.method15974("Disable")) {
                  this.method16004().method16000();
               }

               return;
            }

            double var4 = mc.field1339.getPosX();
            double var6 = mc.field1339.getPosZ();
            double var8 = mc.field1339.getPosY();
            double var10 = (double) mc.field1339.field6131.field43908;
            double var12 = (double) mc.field1339.field6131.field43907;
            float var14 = mc.field1339.field5031;
            double var15 = 0.1;
            double var17 = var4
               + (var10 * 0.45 * Math.cos(Math.toRadians((double)(var14 + 90.0F))) + var12 * 0.45 * Math.sin(Math.toRadians((double)(var14 + 90.0F)))) * var15;
            double var19 = var6
               + (var10 * 0.45 * Math.sin(Math.toRadians((double)(var14 + 90.0F))) - var12 * 0.45 * Math.cos(Math.toRadians((double)(var14 + 90.0F)))) * var15;
            Class6488 var21 = new Class6488(var17 - 0.3, var8 - 1.0, var19 - 0.3, var17 + 0.3, var8 + 2.0, var19 + 0.3);
            if (mc.field1338.method7055(mc.field1339, var21).count() == 0L) {
               double var22 = this.method16975(var21);
               if (var22 != 11.0) {
                  double var24 = mc.field1339.getPosY();
                  var19 = 312.7;
                  Class5605 var26 = new Class5605(var17, var24 - var22, var19, true);
                  Class5605 var27 = new Class5605(var17, var24, var19, true);
                  mc.getClientPlayNetHandler().sendPacket(var27);
                  mc.getClientPlayNetHandler().sendPacket(var26);
                  this.field24026 = var24 + 0.42;
                  mc.field1339.method3215(var17, var24, var19);
                  this.field24025 = (double)this.method15977("Motion");
                  this.field24024 = 0.81;
               }
            }
         }
      }
   }

   @EventTarget
   public void method16973(Class4396 var1) {
      if (this.method15996()) {
         Packet var4 = var1.method13898();
         if (var4 instanceof Class5473) {
            this.method16004().method16000();
         }
      }
   }

   @EventTarget
   public void method16974(Class4422 var1) {
      if (this.method15996() && this.field24023 && !(mc.field1339.getPosY() < this.field24026) && this.method15974("Fake fly")) {
         mc.field1339.field5028.field18049 = this.field24026;
         mc.field1339.field5049 = this.field24026;
         mc.field1339.field4915 = this.field24026;
         mc.field1339.field5026 = this.field24026;
         if (Class9567.method37087()) {
            mc.field1339.field4909 = 0.099999994F;
         }
      }
   }

   public double method16975(Class6488 var1) {
      double var4 = 6.0;
      Class6488 var6 = var1.method19667(0.0, -var4, 0.0);

      do {
         var6 = var1.method19667(0.0, -var4, 0.0);
         if (mc.field1338.method7055(mc.field1339, var6).count() == 0L) {
            return var4;
         }

         var4 -= 0.5;
      } while (mc.field1338.method7055(mc.field1339, var6).count() != 0L && var4 > 3.0);

      return 11.0;
   }
}
