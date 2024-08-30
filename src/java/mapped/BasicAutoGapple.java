package mapped;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.RecievePacketEvent;
import com.mentalfrostbyte.jello.event.impl.StopUseItemEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4430;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.item.AutoGapple;

public class BasicAutoGapple extends Module {
    private int field23549 = -1;
    private int field23550;
    private int field23551;

    public BasicAutoGapple() {
        super(ModuleCategory.PLAYER, "Basic", "Basic AutoGapple");
    }

    @Override
    public void onEnable() {
        this.field23549 = -1;
        this.field23551 = 20;
    }

    @EventTarget
    public void method16246(StopUseItemEvent var1) {
        if (this.isEnabled()) {
            if (this.field23549 >= 0) {
                var1.method13900(true);
            }
        }
    }

    @EventTarget
    public void method16247(Class4430 var1) {
        if (this.isEnabled()) {
            int var4 = mc.gameSettings.keyBindsHotbar.length;

            for (int var5 = 0; var5 < var4; var5++) {
                KeyBinding var6 = mc.gameSettings.keyBindsHotbar[var5];
                String var7 = var6.getKeyDescription();
                int var8 = Integer.parseInt(String.valueOf(var7.charAt(var7.length() - 1)));
                if (var1.method13977() == var6.keycode.keyCode && var8 - 1 != mc.player.inventory.currentItem) {
                    this.field23549 = -1;
                    this.field23551 = 0;
                }
            }
        }
    }

    @EventTarget
    public void method16248(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.field23551 < 20) {
                this.field23551++;
            }

            int var4 = -1;
            if (mc.player.getHealth() <= this.method16004().getNumberValueBySettingName("Health") * 2.0F) {
                var4 = ((AutoGapple) this.method16004()).method16749(false);
                if (this.field23549 == -1 && this.field23551 >= 20 && var4 != -1) {
                    this.field23549 = 0;
                    this.field23551 = 0;
                }
            }

            if (var4 >= 0 || this.field23549 != -1) {
                if (this.field23549 >= 0) {
                    this.field23549++;
                    if (this.field23549 != 1) {
                        if (this.field23549 > 1
                                && mc.player.getHeldItem(Hand.MAIN_HAND).getItem() != Items.GOLDEN_APPLE
                                && mc.player.getHeldItem(Hand.MAIN_HAND).getItem() != Items.ENCHANTED_GOLDEN_APPLE) {
                            mc.player.inventory.currentItem = this.field23550;
                            this.field23550 = -1;
                            this.field23549 = -1;
                        }
                    } else {
                        this.field23550 = mc.player.inventory.currentItem;
                        mc.player.inventory.currentItem = var4;
                        mc.playerController.method23138();
                        mc.playerController.processRightClick(mc.player, mc.world, Hand.MAIN_HAND);
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16249(RecievePacketEvent var1) {
        if (this.isEnabled() && this.field23549 > 1) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof Class5553) {
                Class5553 var5 = (Class5553) var4;
                if (var5.method17470() == mc.player.method3205()) {
                    for (Class9773 var7 : var5.method17469()) {
                        DataParameter var8 = var7.method38447();
                        if (var8.method35015() == 14) {
                            mc.player.inventory.currentItem = this.field23550;
                            this.field23550 = -1;
                            this.field23549 = -1;
                        }
                    }
                }
            }
        }
    }
}
