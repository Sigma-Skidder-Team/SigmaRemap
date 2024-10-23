package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import net.minecraft.network.play.client.CConfirmTeleportPacket;

public class PortalGodMode extends Module {
   public PortalGodMode() {
      super(ModuleCategory.MISC, "PortalGodMode", "Makes you invulnerable when you go through a portal and stay in it");
   }

   @EventTarget
   private void onReceivePacket(ReceivePacketEvent event) {
      if (this.isEnabled()) {
         if (event.getPacket() instanceof CConfirmTeleportPacket) {
            event.setCancelled(true);
         }
      }
   }
}
