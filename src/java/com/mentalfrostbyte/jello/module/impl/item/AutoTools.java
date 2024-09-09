package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.MouseHoverEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.EventKeyPress;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import mapped.*;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;

public class AutoTools extends Module {
    public int field23511 = -1;

    public AutoTools() {
        super(ModuleCategory.ITEM, "AutoTools", "Picks the best tool when breaking blocks");
        this.registerSetting(new ModeSetting("Inv Mode", "The way it will move tools in your inventory", 0, "Basic", "OpenInv", "FakeInv"));
    }

    @EventTarget
    public void method16189(MouseHoverEvent var1) {
        if (this.isEnabled() && mc.player != null && var1.method13973() == 0) {
            if (this.field23511 != -1) {
                mc.player.inventory.currentItem = this.field23511;
                this.field23511 = -1;
            }
        }
    }

    @EventTarget
    private void method16190(EventKeyPress var1) {
        if (this.isEnabled() && mc.player != null && var1.getKey() == 0) {
            this.method16192(var1.getBlockPos());
        }
    }

    @EventTarget
    private void method16191(TickEvent var1) {
        if (this.isEnabled() && mc.player != null && mc.gameSettings.keyBindAttack.isKeyDown()) {
            this.method16192(null);
        }
    }

    public void method16192(BlockPos var1) {
        BlockPos var4 = var1 == null
                ? (mc.objectMouseOver.getType() != RayTraceResult.Type.BLOCK ? null : ((BlockRayTraceResult) mc.objectMouseOver).getPos())
                : var1;
        if (var4 != null) {
            int var5 = InvManagerUtils.method25837(mc.world.getBlockState(var4));
            if (var5 != -1) {
                if (mc.player.inventory.currentItem != var5 % 9 && this.field23511 == -1) {
                    this.field23511 = mc.player.inventory.currentItem;
                }

                if (var5 >= 36 && var5 <= 44) {
                    mc.player.inventory.currentItem = var5 % 9;
                } else if (Client.getInstance().getPlayerTracker().method31333() > 1) {
                    String var6 = this.getStringSettingValueByName("Inv Mode");
                    if (var6.equals("OpenInv") && !(mc.currentScreen instanceof InventoryScreen)) {
                        return;
                    }

                    if (var6.equals("FakeInv") && JelloPortal.method27349() <= ViaVerList.field26136.method18582()) {
                        mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
                    }

                    mc.player.inventory.currentItem = InvManagerUtils.method25857(var5);
                    if (var6.equals("FakeInv")) {
                        mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                    }
                }
            }
        }
    }
}
