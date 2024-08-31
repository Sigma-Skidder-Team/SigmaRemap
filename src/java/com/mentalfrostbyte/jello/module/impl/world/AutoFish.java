package com.mentalfrostbyte.jello.module.impl.world;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import mapped.*;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.network.play.server.SPlaySoundPacket;
import net.minecraft.network.play.server.SPlaySoundEffectPacket;

public class AutoFish extends Module {
    public AutoFish() {
        super(ModuleCategory.WORLD, "AutoFish", "Automatically catches fish for you");
    }

    @EventTarget
    public void method16364(RecievePacketEvent var1) {
        if (this.isEnabled()) {
            if (var1.getPacket() instanceof SPlaySoundEffectPacket || var1.getPacket() instanceof SPlaySoundPacket) {
                if (mc.player.method3090() != null) {
                    if (mc.player.method3090().getItem() instanceof Class3259) {
                        if (!(var1.getPacket() instanceof SPlaySoundEffectPacket)) {
                            if (var1.getPacket() instanceof SPlaySoundPacket && !((SPlaySoundPacket) var1.getPacket()).field24315.equals("entity.bobber.splash")) {
                                return;
                            }
                        } else if (!((SPlaySoundEffectPacket) var1.getPacket()).method17549().equals(Sounds.field26585)) {
                            return;
                        }

                        mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                        mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
                        Client.getInstance().getNotificationManager().post(new Notification("AutoFish", "We catched something!", ResourcesDecrypter.doneIconPNG));
                    }
                }
            }
        }
    }
}
