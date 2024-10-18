package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.settings.NumberSetting;
import mapped.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.network.play.client.CPlayerPacket;

public class FastEat extends Module {
   public FastEat() {
      super(ModuleCategory.PLAYER, "FastEat", "Allows you to eat faster");
      this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Basic", "Hypixel"));
      this.registerSetting(new NumberSetting<Float>("Speed", "Eating speed.", 0.55F, Float.class, 0.0F, 1.0F, 0.01F));
   }

   @EventTarget
   public void TickEvent(TickEvent event) {
      if (this.isEnabled() && mc.player != null) {
         if (mc.player.isHandActive()) {
            ItemStack itemStack= mc.player.getActiveItemStack();
            if (itemStack != null
               && (itemStack.getUseAction() == UseAction.field13708 || itemStack.getUseAction() == UseAction.field13707)
               && (float) mc.player.getItemInUseCount() < this.getNumberValueBySettingName("Speed") * 32.0F) {
               String mode = this.getStringSettingValueByName("Mode");
               switch (mode) {
                  case "Basic":
                     int x = mc.player.getItemInUseCount() + 2;

                     for (int i = 0; i < x; i++) {
                        mc.getConnection().sendPacket(new CPlayerPacket(mc.player.onGround));
                        mc.player.stopActiveHand();
                     }
                     break;
                  case "Hypixel":
                     mc.getConnection()
                        .sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem + 1 >= 9 ? 0 : mc.player.inventory.currentItem + 1));
                     mc.getConnection().sendPacket(new CHeldItemChangePacket(mc.player.inventory.currentItem));
               }
            }
         }
      }
   }
}
