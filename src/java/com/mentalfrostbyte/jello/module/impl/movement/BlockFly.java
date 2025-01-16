package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.*;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.Rots;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import com.mentalfrostbyte.jello.util.render.animation.MathHelper;
import lol.ClientColors;
import lol.MovementUtils;
import mapped.*;
import net.minecraft.block.*;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.play.client.CClientStatusPacket;
import net.minecraft.network.play.client.CCloseWindowPacket;
import net.minecraft.network.play.client.CHeldItemChangePacket;
import net.minecraft.util.Hand;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;
import java.util.List;

public class BlockFly extends ModuleWithModuleSettings {
    public static List<Block> blocksToNotPlace;
    public int field23884;
    public Animation field23885 = new Animation(114, 114, Direction.BACKWARDS);
    public int field23886 = 0;

    public BlockFly() {
        super(ModuleCategory.MOVEMENT, "BlockFly", "Allows you to automatically bridge", new BlockFlyNCPMode(), new BlockFlyAACMode(), new BlockFlySmoothMode(), new BlockFlyHypixelMode());
        this.registerSetting(new ModeSetting("ItemSpoof", "Item spoofing mode", 2, "None", "Switch", "Spoof", "LiteSpoof"));
        this.registerSetting(new ModeSetting("Tower Mode", "Tower mode", 1, "None", "NCP", "AAC", "Vanilla"));
        this.registerSetting(new ModeSetting("Picking mode", "The way it will move blocks in your inventory.", 0, "Basic", "FakeInv", "OpenInv"));
        this.registerSetting(new BooleanSetting("Tower while moving", "Allows you to tower while moving.", false));
        this.registerSetting(new BooleanSetting("Show Block Amount", "Shows the amount of blocks in your inventory.", true));
        this.registerSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", true));
        this.registerSetting(new BooleanSetting("Intelligent Block Picker", "Always get the biggest blocks stack.", true));
        this.registerSetting(new BooleanSetting("No Sprint", "Disable sprint.", false));
        blocksToNotPlace = Arrays.asList(
                Blocks.AIR,
                Blocks.WATER,
                Blocks.LAVA,
                Blocks.ENCHANTING_TABLE,
                Blocks.BLACK_CARPET,
                Blocks.GLASS_PANE,
                Blocks.IRON_BARS,
                Blocks.ICE,
                Blocks.PACKED_ICE,
                Blocks.CHEST,
                Blocks.TRAPPED_CHEST,
                Blocks.TORCH,
                Blocks.ANVIL,
                Blocks.TRAPPED_CHEST,
                Blocks.NOTE_BLOCK,
                Blocks.JUKEBOX,
                Blocks.TNT,
                Blocks.REDSTONE_WIRE,
                Blocks.LEVER,
                Blocks.COBBLESTONE_WALL,
                Blocks.OAK_FENCE,
                Blocks.TALL_GRASS,
                Blocks.TRIPWIRE,
                Blocks.TRIPWIRE_HOOK,
                Blocks.RAIL,
                Blocks.LILY_PAD,
                Blocks.RED_MUSHROOM,
                Blocks.BROWN_MUSHROOM,
                Blocks.VINE,
                Blocks.ACACIA_TRAPDOOR,
                Blocks.LADDER,
                Blocks.FURNACE,
                Blocks.SAND,
                Blocks.CACTUS,
                Blocks.DISPENSER,
                Blocks.DROPPER,
                Blocks.CRAFTING_TABLE,
                Blocks.COBWEB,
                Blocks.PUMPKIN,
                Blocks.ACACIA_SAPLING
        );
    }

    public static boolean method16733(Item var0) {
        if (!(var0 instanceof BlockItem)) {
            return false;
        } else {
            Block var3 = ((BlockItem) var0).method11845();
            return ! blocksToNotPlace.contains(var3)
                    && !(var3 instanceof AbstractButtonBlock)
                    && !(var3 instanceof BushBlock)
                    && !(var3 instanceof Class3206)
                    && !(var3 instanceof Class3468)
                    && !(var3 instanceof SandBlock)
                    && !(var3 instanceof Class3420)
                    && !(var3 instanceof Class3343)
                    && !(var3 instanceof Class3250)
                    && !(var3 instanceof Class3241)
                    && !(var3 instanceof ChestBlock)
                    && !(var3 instanceof DoorBlock);
        }
    }

    public boolean method16732() {
        return this.getBooleanValueFromSettingName("No Sprint") && this.isEnabled();
    }

    public void method16734() {
        try {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (mc.player.container.getSlot(var3).getHasStack()
                        && method16733(mc.player.container.getSlot(var3).getStack().getItem())
                        && mc.player.container.getSlot(var3).getStack().count != 0) {
                    if (mc.player.inventory.currentItem == var4) {
                        return;
                    }

                    mc.player.inventory.currentItem = var4;
                    if (this.getStringSettingValueByName("ItemSpoof").equals("LiteSpoof") && (this.field23884 < 0 || this.field23884 != var4)) {
                        mc.getConnection().getNetworkManager().sendPacket(new CHeldItemChangePacket(var4));
                        this.field23884 = var4;
                    }
                    break;
                }
            }
        } catch (Exception var5) {
        }
    }

    public int method16735() {
        int var3 = 0;

        for (int var4 = 0; var4 < 45; var4++) {
            if (mc.player.container.getSlot(var4).getHasStack()) {
                ItemStack var5 = mc.player.container.getSlot(var4).getStack();
                Item var6 = var5.getItem();
                if (method16733(var6)) {
                    var3 += var5.count;
                }
            }
        }

        return var3;
    }

    public void method16736() {
        String var3 = this.getStringSettingValueByName("Picking mode");
        if ((!var3.equals("OpenInv") || mc.currentScreen instanceof InventoryScreen) && this.method16735() != 0) {
            int var4 = 43;
            if (!this.getBooleanValueFromSettingName("Intelligent Block Picker")) {
                if (!this.method16738()) {
                    int var5 = -1;

                    for (int var6 = 9; var6 < 36; var6++) {
                        if (mc.player.container.getSlot(var6).getHasStack()) {
                            Item var7 = mc.player.container.getSlot(var6).getStack().getItem();
                            if (method16733(var7)) {
                                var5 = var6;
                                break;
                            }
                        }
                    }

                    for (int var9 = 36; var9 < 45; var9++) {
                        if (!mc.player.container.getSlot(var9).getHasStack()) {
                            var4 = var9;
                            break;
                        }
                    }

                    if (var5 >= 0) {
                        if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")) {
                            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
                        }

                        this.method16740(var5, var4 - 36);
                        if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")) {
                            mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                        }
                    }
                }
            } else {
                int var8 = this.method16737();
                if (!this.method16738()) {
                    for (int var11 = 36; var11 < 45; var11++) {
                        if (!mc.player.container.getSlot(var11).getHasStack()) {
                            var4 = var11;
                            break;
                        }
                    }
                } else {
                    for (int var10 = 36; var10 < 45; var10++) {
                        if (mc.player.container.getSlot(var10).getHasStack()) {
                            Item var12 = mc.player.container.getSlot(var10).getStack().getItem();
                            if (method16733(var12)) {
                                var4 = var10;
                                if (mc.player.container.getSlot(var10).getStack().count
                                        == mc.player.container.getSlot(var8).getStack().count) {
                                    var4 = -1;
                                }
                                break;
                            }
                        }
                    }
                }

                if (var4 >= 0 && mc.player.container.getSlot(var4).slotNumber != var8) {
                    if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")/* && JelloPortal.getCurrentVersionApplied() <= ViaVerList._1_11_1_or_2.getVersionNumber()*/) {
                        mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
                    }

                    this.method16740(var8, var4 - 36);
                    if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")) {
                        mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                    }
                }
            }
        }
    }

    public int method16737() {
        int var3 = -1;
        int var4 = 0;
        if (this.method16735() != 0) {
            for (int var5 = 9; var5 < 45; var5++) {
                if (mc.player.container.getSlot(var5).getHasStack()) {
                    Item var6 = mc.player.container.getSlot(var5).getStack().getItem();
                    ItemStack var7 = mc.player.container.getSlot(var5).getStack();
                    if (method16733(var6) && var7.count > var4) {
                        var4 = var7.count;
                        var3 = var5;
                    }
                }
            }

            return var3;
        } else {
            return -1;
        }
    }

    public boolean method16738() {
        for (int var3 = 36; var3 < 45; var3++) {
            if (mc.player.container.getSlot(var3).getHasStack()) {
                Item var4 = mc.player.container.getSlot(var3).getStack().getItem();
                if (method16733(var4)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean method16739(Hand var1) {
        if (!this.access().getStringSettingValueByName("ItemSpoof").equals("None")) {
            return this.method16735() != 0;
        } else return method16733(mc.player.getHeldItem(var1).getItem());
    }

    public void method16740(int var1, int var2) {
        mc.playerController.windowClick(mc.player.container.windowId, var1, var2, ClickType.SWAP, mc.player);
    }

    public void method16741(EventMove var1) {
        if (mc.timer.timerSpeed == 0.8038576F) {
            mc.timer.timerSpeed = 1.0F;
        }

        if (this.method16735() != 0 && (!mc.player.collidedVertically || this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla"))) {
            if (!MultiUtilities.method17686() || this.getBooleanValueFromSettingName("Tower while moving")) {
                String var4 = this.getStringSettingValueByName("Tower Mode");
                switch (var4) {
                    case "NCP":
                        if (var1.getY() > 0.0) {
                            if (MovementUtils.method37079() == 0) {
                                if (var1.getY() > 0.247 && var1.getY() < 0.249) {
                                    var1.setY((double) ((int) (mc.player.getPosY() + var1.getY())) - mc.player.getPosY());
                                }
                            } else {
                                double var6 = (int) (mc.player.getPosY() + var1.getY());
                                if (var6 != (double) ((int) mc.player.getPosY()) && mc.player.getPosY() + var1.getY() - var6 < 0.15) {
                                    var1.setY(var6 - mc.player.getPosY());
                                }
                            }
                        }

                        if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())
                                && MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                            if (mc.gameSettings.keyBindJump.pressed) {
                                if (!MultiUtilities.method17686()) {
                                    MovementUtils.strafe(0.0);
                                    MovementUtils.setSpeed(var1, 0.0);
                                }

                                var1.setY(MovementUtils.method37080());
                            } else {
                                var1.setY(-1.0E-5);
                            }
                        }
                        break;
                    case "AAC":
                        if (var1.getY() > 0.247 && var1.getY() < 0.249) {
                            var1.setY((double) ((int) (mc.player.getPosY() + var1.getY())) - mc.player.getPosY());
                            if (mc.gameSettings.keyBindJump.pressed && !MultiUtilities.method17686()) {
                                MovementUtils.strafe(0.0);
                                MovementUtils.setSpeed(var1, 0.0);
                            }
                        } else if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())
                                && MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                            var1.setY(-1.0E-10);
                        }
                        break;
                    case "Vanilla":
                        if (mc.gameSettings.keyBindJump.pressed
                                && MultiUtilities.isAboveBounds(mc.player, 0.001F)
                                && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, 1.0, 0.0)).count() == 0L) {
                            mc.player
                                    .setPosition(mc.player.getPosX(), mc.player.getPosY() + 1.0, mc.player.getPosZ());
                            var1.setY(0.0);
                            MovementUtils.setSpeed(var1, 0.0);
                            mc.timer.timerSpeed = 0.8038576F;
                        }
                }
            }
        } else if (!this.getStringSettingValueByName("Tower Mode").equals("AAC")
                || !MultiUtilities.isAboveBounds(mc.player, 0.001F)
                || !mc.gameSettings.keyBindJump.pressed) {
            if (!this.getStringSettingValueByName("Tower Mode").equals("NCP")
                    && !this.getStringSettingValueByName("Tower Mode").equals("Vanilla")
                    && MultiUtilities.isAboveBounds(mc.player, 0.001F)
                    && mc.gameSettings.keyBindJump.pressed) {
                mc.player.jumpTicks = 20;
                var1.setY(MovementUtils.method37080());
            }
        } else if (!MultiUtilities.method17686() || this.getBooleanValueFromSettingName("Tower while moving")) {
            mc.player.jumpTicks = 0;
            mc.player.jump();
            MovementUtils.setSpeed(var1, MovementUtils.getSpeed());
            MovementUtils.strafe(MovementUtils.getSpeed());
        }

        if (!this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")) {
            MultiUtilities.setPlayerYMotion(var1.getY());
        }
    }

    @Override
    public String getSuffix() {
        return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? super.getSuffix() : "Scaffold";
    }

    @EventTarget
    public void onTick(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSettingName("Show Block Amount")) {
                this.field23886 = this.method16735();
            }
        }
    }

    @Override
    public void onDisable() {
        Rots.rotating = false;
        this.field23885.changeDirection(Direction.BACKWARDS);
        super.onDisable();
    }

    @EventTarget
    public void method16743(EventRender var1) {
        this.field23885.changeDirection(Direction.FORWARDS);
        if (this.field23885.calcPercent() != 0.0F) {
            if (this.getBooleanValueFromSettingName("Show Block Amount")) {
                if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
                    this.method16744(
                            mc.mainWindow.getWidth() / 2,
                            mc.mainWindow.getHeight() / 2 + 15 - (int) (10.0F * this.field23885.calcPercent()),
                            this.field23885.calcPercent()
                    );
                } else {
                    this.method16745(
                            mc.mainWindow.getWidth() / 2,
                            mc.mainWindow.getHeight() - 138 - (int) (25.0F * MathHelper.calculateTransition(this.field23885.calcPercent(), 0.0F, 1.0F, 1.0F)),
                            this.field23885.calcPercent()
                    );
                }
            }
        }
    }

    public void method16744(int var1, int var2, float var3) {
        var3 = (float) (0.5 + 0.5 * (double) var3);
        GL11.glAlphaFunc(518, 0.1F);
        RenderUtil.drawString(
                ResourceList.medium17,
                (float) (var1 + 10),
                (float) (var2 + 5),
                this.field23886 + " Blocks",
                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, var3 * 0.3F)
        );
        RenderUtil.drawString(
                ResourceList.medium17,
                (float) (var1 + 10),
                (float) (var2 + 4),
                this.field23886 + " Blocks",
                MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var3 * 0.8F)
        );
        GL11.glAlphaFunc(519, 0.0F);
    }

    public void method16745(int var1, int var2, float var3) {
        int var6 = 0;
        int var7 = ResourceRegistry.JelloLightFont18.getStringWidth(this.field23886 + "") + 3;
        var6 += var7;
        var6 += ResourceRegistry.JelloLightFont14.getStringWidth("Blocks");
        int var8 = var6 + 20;
        int var9 = 32;
        var1 -= var8 / 2;
        GL11.glPushMatrix();
        RenderUtil.method11465(var1, var2, var8, var9, MultiUtilities.applyAlpha(-15461356, 0.8F * var3));
        RenderUtil.drawString(
                ResourceRegistry.JelloLightFont18, (float) (var1 + 10), (float) (var2 + 4), this.field23886 + "", MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var3)
        );
        RenderUtil.drawString(
                ResourceRegistry.JelloLightFont14, (float) (var1 + 10 + var7), (float) (var2 + 8), "Blocks", MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var3)
        );
        var1 += 11 + var8 / 2;
        var2 += var9;
        GL11.glPushMatrix();
        GL11.glTranslatef((float) var1, (float) var2, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef((float) (-var1), (float) (-var2), 0.0F);
        RenderUtil.drawImage((float) var1, (float) var2, 9.0F, 23.0F, ResourceList.selectPNG, MultiUtilities.applyAlpha(-15461356, 0.8F * var3));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
