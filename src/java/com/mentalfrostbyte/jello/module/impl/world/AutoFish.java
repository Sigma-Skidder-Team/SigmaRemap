package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import mapped.Class3259;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.network.play.server.SPlaySoundEffectPacket;
import net.minecraft.network.play.server.SPlaySoundPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundEvents;

public class AutoFish extends Module {
    public AutoFish() {
        super(ModuleCategory.WORLD, "AutoFish", "Automatically catches fish for you");
    }

    @EventTarget
    public void method16364(ReceivePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlaySoundEffectPacket || var1.getPacket() instanceof SPlaySoundPacket) {
                if (mc.player.getHeldItemMainhand() != null) {
                    if (mc.player.getHeldItemMainhand().getItem() instanceof Class3259) {
                        if (!(var1.getPacket() instanceof SPlaySoundEffectPacket)) {
                            if (var1.getPacket() instanceof SPlaySoundPacket && !((SPlaySoundPacket) var1.getPacket()).field24315.equals("entity.bobber.splash")) {
                                return;
                            }
                        } else if (!((SPlaySoundEffectPacket) var1.getPacket()).method17549().equals(SoundEvents.field26585)) {
                            return;
                        }

                        mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                        mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                        Client.getInstance().getNotificationManager().send(new Notification("AutoFish", "We catched something!", ResourceList.doneIconPNG));
                    }
                }
            }
        }
    }
}
