package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.Class8897;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SConfirmTransactionPacket;
import net.minecraft.network.play.server.SKeepAlivePacket;

/*
*  very bad code
*
*
* */

import java.util.ArrayList;

public class ViperDisabler extends Module {
    private int tickCounter;
    private final ArrayList<Class8897> pendingEvents = new ArrayList<>();

    public ViperDisabler() {
        super(ModuleCategory.EXPLOIT, "Viper", "Disabler for ViperMC");
    }

    @Override
    public void onEnable() {
        this.tickCounter = 0;
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (this.isEnabled() && mc.player != null) {
            this.tickCounter++;
            boolean isPlayerInAir = event.getY() > mc.player.getPosY() - 1.0E-6 && event.getY() < mc.player.getPosY() + 1.0E-6;
            if (isPlayerInAir) {
                event.setY(mc.player.getPosY() + 0.4);
                event.setGround(false);
            }

            if (this.tickCounter > 60) {
                event.setY(mc.player.getPosY() + 0.4);
                event.setGround(false);
            } else {
                for (int i = 0; i < 10; i++) {
                    boolean isMiddleIteration = i > 2 && i < 8;
                    double verticalAdjustment = isMiddleIteration ? 0.2 : -0.2;
                    CPlayerPacket.PositionPacket positionPacket = new CPlayerPacket.PositionPacket(
                            mc.player.getPosX(), mc.player.getPosY() + verticalAdjustment, mc.player.getPosZ(), true
                    );
                    mc.getConnection().sendPacket(positionPacket);
                }

                mc.player.field6120 = 0.0;
                if (mc.player.ticksExisted <= 1) {
                    this.pendingEvents.clear();
                }

                if (!this.pendingEvents.isEmpty()) {
                    for (int index = 0; index < this.pendingEvents.size(); index++) {
                        Class8897 event1 = this.pendingEvents.get(index);
                        if (event1.method32423()) {
                            mc.getConnection().sendPacket(event1.method32424());
                            this.pendingEvents.remove(index);
                        }
                    }
                }
            }
        }
    }

    @EventTarget
    public void onReceivePacket(ReceivePacketEvent event) {
        if (this.isEnabled()) {
            IPacket incomingPacket = event.getPacket();
            if (incomingPacket instanceof SKeepAlivePacket) {
                event.setCancelled(true);
            }

            if (incomingPacket instanceof SConfirmTransactionPacket) {
                event.setCancelled(true);
            }
        }
    }
}
