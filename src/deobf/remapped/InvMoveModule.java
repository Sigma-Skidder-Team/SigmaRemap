package remapped;

import org.lwjgl.glfw.GLFW;

public class InvMoveModule extends Module {
   private boolean field_29226;

   public InvMoveModule() {
      super(Category.PLAYER, "InvMove", "Move freely in the inventory");
      this.addSetting(new BooleanSetting("AACP", "Bypass for AACP", true));
      this.field_29226 = false;
   }

   @EventListen
   private void method_26179(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == mc.gameOptions.keyInventory.field_30027.field_17800 && mc.field_9632.method_37321()) {
            mc.method_8614().method_4813(new class_2317(mc.field_9632, class_4127.field_20100));
         }
      }
   }

   @EventListen
   private void method_26177(class_2157 var1) {
      if (this.method_42015()) {
         if (this.field_29226 && var1.method_10047() instanceof class_2317 && this.getBooleanValueByName("AACP")) {
            class_2317 var4 = (class_2317)var1.method_10047();
            if (var4.method_10650() == class_4127.field_20099) {
               var1.method_29715(true);
            }
         }
      }
   }

   @EventListen
   private void method_26178(class_5596 var1) {
      if (this.method_42015()) {
         if (this.getBooleanValueByName("AACP")) {
            boolean var4 = !(mc.field_9623 instanceof class_3431) || !(mc.field_9623 instanceof class_2141);
            if (this.field_29226 && !var4) {
               this.field_29226 = !this.field_29226;
               if (mc.field_9632.method_37321()) {
                  mc.method_8614().method_4813(new class_2317(mc.field_9632, class_4127.field_20099));
               }
            } else if (!this.field_29226 && var4) {
               this.field_29226 = !this.field_29226;
               if (mc.field_9632.method_37321()) {
                  mc.method_8614().method_4813(new class_2317(mc.field_9632, class_4127.field_20100));
               }
            }
         }

         if (mc.field_9623 instanceof class_2208 || SigmaMainClass.getInstance().method_3310().method_25291() <= 1) {
            if (mc.field_9623 instanceof class_5766) {
               return;
            }

            if (mc.field_9623 instanceof class_2713) {
               return;
            }

            if (mc.field_9623 instanceof class_9743) {
               return;
            }

            if (mc.field_9623 instanceof class_2546) {
               class_2546 var9 = (class_2546) mc.field_9623;
               if (var9.method_11595() == 5) {
                  return;
               }
            }

            if (SigmaMainClass.getInstance().method_3299().method_31001() != null && SigmaMainClass.getInstance().method_3299().method_31001().method_32121()) {
               for (class_5916 var14 : MinecraftClient.getInstance().gameOptions.field_45395) {
                  var14.pressed = false;
               }

               return;
            }

            for (class_5916 var7 : mc.gameOptions.field_45395) {
               if (var7.field_30027.field_17800 > 0
                  && mc.gameOptions.keySneak.field_30027.field_17800 != var7.field_30027.field_17800
                  && var7.field_30027.field_17800 > 4) {
                  int var8 = GLFW.glfwGetKey(mc.window.method_43181(), var7.field_30027.field_17800);
                  var7.pressed = var8 == 1;
               }
            }
         }
      }
   }
}
