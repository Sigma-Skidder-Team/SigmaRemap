package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;

public class Class5389 extends Module {
   public Class5389() {
      super(ModuleCategory.PLAYER, "FastEat", "Allows you to eat faster");
      this.method15972(new Class6005("Mode", "Mode", 0, "Basic", "Hypixel").method18631("Hypixel"));
      this.method15972(new Class6009<Float>("Speed", "Eating speed.", 0.55F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventTarget
   public void method16976(TickEvent var1) {
      if (this.method15996() && mc.field1339 != null) {
         if (mc.field1339.method3148()) {
            Class8848 var4 = mc.field1339.method3158();
            if (var4 != null
               && (var4.method32138() == Class2103.field13708 || var4.method32138() == Class2103.field13707)
               && (float) mc.field1339.method3159() < this.method15977("Speed") * 32.0F) {
               String var5 = this.getStringSettingValueByName("Mode");
               switch (var5) {
                  case "Basic":
                     int var7 = mc.field1339.method3159() + 2;

                     for (int var8 = 0; var8 < var7; var8++) {
                        mc.getClientPlayNetHandler().sendPacket(new Class5603(mc.field1339.field5036));
                        mc.field1339.method3161();
                     }
                     break;
                  case "Hypixel":
                     mc.getClientPlayNetHandler()
                        .sendPacket(new Class5539(mc.field1339.field4902.field5443 + 1 >= 9 ? 0 : mc.field1339.field4902.field5443 + 1));
                     mc.getClientPlayNetHandler().sendPacket(new Class5539(mc.field1339.field4902.field5443));
               }
            }
         }
      }
   }
}
