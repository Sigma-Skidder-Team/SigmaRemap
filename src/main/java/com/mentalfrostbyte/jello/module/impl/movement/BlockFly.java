package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyAACMode;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyHypixelMode;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyNCPMode;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlySmoothMode;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourceList;
import com.mentalfrostbyte.jello.util.ClientColors;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.player.Rots;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.MathHelper;
import mapped.InventoryScreen;
import mapped.RenderUtil;
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
    public static List<Block> INVALID_BLOCKS;
    public int lastSpoofedSlot;
    public Animation field23885 = new Animation(114, 114, Animation.Direction.BACKWARDS);
    public int field23886 = 0;

    public BlockFly() {
        super(ModuleCategory.MOVEMENT, "BlockFly", "Allows you to automatically bridge", new BlockFlyNCPMode(),
                new BlockFlyAACMode(), new BlockFlySmoothMode(), new BlockFlyHypixelMode());
        this.registerSetting(
                new ModeSetting("ItemSpoof", "Item spoofing mode", 2, "None", "Switch", "Spoof", "LiteSpoof"));
        this.registerSetting(new ModeSetting("Tower Mode", "Tower mode", 1, "None", "NCP", "AAC", "Vanilla"));
        this.registerSetting(new ModeSetting("Picking mode", "The way it will move blocks in your inventory.", 0,
                "Basic", "FakeInv", "OpenInv"));
        this.registerSetting(new BooleanSetting("Tower while moving", "Allows you to tower while moving.", false));
        this.registerSetting(
                new BooleanSetting("Show Block Amount", "Shows the amount of blocks in your inventory.", true));
        this.registerSetting(new BooleanSetting("NoSwing", "Removes the swing animation.", true));
        this.registerSetting(
                new BooleanSetting("Intelligent Block Picker", "Always get the biggest blocks stack.", true));
        this.registerSetting(new BooleanSetting("No Sprint", "Disable sprint.", false));
        INVALID_BLOCKS = Arrays.asList(
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
                Blocks.ACACIA_SAPLING);
    }

    public static boolean isPlacableBlockItem(Item item) {
        if (!(item instanceof BlockItem)) {
            return false;
        } else {
            Block block = ((BlockItem) item).getBlock();
            return !INVALID_BLOCKS.contains(block)
                    && !(block instanceof AbstractButtonBlock)
                    && !(block instanceof BushBlock)
                    && !(block instanceof TrapDoorBlock)
                    && !(block instanceof AbstractPressurePlateBlock)
                    && !(block instanceof SandBlock)
                    && !(block instanceof OreBlock)
                    && !(block instanceof SkullBlock)
                    && !(block instanceof BedBlock)
                    && !(block instanceof BannerBlock)
                    && !(block instanceof ChestBlock)
                    && !(block instanceof DoorBlock);
        }
    }

    public boolean shouldntSprint() {
        return !this.getBooleanValueFromSettingName("No Sprint") || !this.isEnabled();
    }

    public void selectPlaceableHotbarSlot() {
        for (int containerSlot = 36; containerSlot < 45; containerSlot++) {
            int hotbarIndex = containerSlot - 36;
            if (mc.player.container.getSlot(containerSlot).getHasStack()
                    && isPlacableBlockItem(mc.player.container.getSlot(containerSlot).getStack().getItem())
                    && mc.player.container.getSlot(containerSlot).getStack().count != 0) {
                if (mc.player.inventory.currentItem == hotbarIndex) {
                    return;
                }

                mc.player.inventory.currentItem = hotbarIndex;
                if (this.getStringSettingValueByName("ItemSpoof").equals("LiteSpoof")
                        && (this.lastSpoofedSlot < 0 || this.lastSpoofedSlot != hotbarIndex)) {
                    mc.getConnection().getNetworkManager().sendPacket(new CHeldItemChangePacket(hotbarIndex));
                    this.lastSpoofedSlot = hotbarIndex;
                }
                break;
            }
        }
    }

    public int countPlaceableBlocks() {
        int total = 0;

        for (int slotIndex = 0; slotIndex < 45; slotIndex++) {
            if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                ItemStack stack = mc.player.container.getSlot(slotIndex).getStack();
                Item item = stack.getItem();
                if (isPlacableBlockItem(item)) {
                    total += stack.count;
                }
            }
        }

        return total;
    }

    public void refillHotbarWithBlocks() {
        String pickingMode = this.getStringSettingValueByName("Picking mode");
        if ((!pickingMode.equals("OpenInv") || mc.currentScreen instanceof InventoryScreen) && this.countPlaceableBlocks() != 0) {
            int targetContainerSlot = 43;
            if (!this.getBooleanValueFromSettingName("Intelligent Block Picker")) {
                if (!this.hasPlaceableBlockInHotbar()) {
                    int sourceSlot = -1;

                    for (int slotIndex = 9; slotIndex < 36; slotIndex++) {
                        if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                            Item slot = mc.player.container.getSlot(slotIndex).getStack().getItem();
                            if (isPlacableBlockItem(slot)) {
                                sourceSlot = slotIndex;
                                break;
                            }
                        }
                    }

                    for (int slotIndex = 36; slotIndex < 45; slotIndex++) {
                        if (!mc.player.container.getSlot(slotIndex).getHasStack()) {
                            targetContainerSlot = slotIndex;
                            break;
                        }
                    }

                    if (sourceSlot >= 0) {
                        if (!(mc.currentScreen instanceof InventoryScreen) && pickingMode.equals("FakeInv")) {
                            mc.getConnection()
                                    .sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
                        }

                        this.swapSlotToHotbar(sourceSlot, targetContainerSlot - 36);
                        if (!(mc.currentScreen instanceof InventoryScreen) && pickingMode.equals("FakeInv")) {
                            mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                        }
                    }
                }
            } else {
                int sourceSlot = this.findLargestBlockStackSlot();
                if (!this.hasPlaceableBlockInHotbar()) {
                    for (int slotIndex = 36; slotIndex < 45; slotIndex++) {
                        if (!mc.player.container.getSlot(slotIndex).getHasStack()) {
                            targetContainerSlot = slotIndex;
                            break;
                        }
                    }
                } else {
                    for (int slotIndex = 36; slotIndex < 45; slotIndex++) {
                        if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                            Item slot = mc.player.container.getSlot(slotIndex).getStack().getItem();
                            if (isPlacableBlockItem(slot)) {
                                targetContainerSlot = slotIndex;
                                if (mc.player.container.getSlot(slotIndex).getStack().count == mc.player.container.getSlot(sourceSlot).getStack().count) {
                                    targetContainerSlot = -1;
                                }
                                break;
                            }
                        }
                    }
                }

                if (targetContainerSlot >= 0 && mc.player.container.getSlot(targetContainerSlot).slotNumber != sourceSlot) {
                    if (!(mc.currentScreen instanceof InventoryScreen) && pickingMode.equals("FakeInv")) {
                        mc.getConnection()
                                .sendPacket(new CClientStatusPacket(CClientStatusPacket.State.OPEN_INVENTORY));
                    }

                    this.swapSlotToHotbar(sourceSlot, targetContainerSlot - 36);
                    if (!(mc.currentScreen instanceof InventoryScreen) && pickingMode.equals("FakeInv")) {
                        mc.getConnection().sendPacket(new CCloseWindowPacket(-1));
                    }
                }
            }
        }
    }

    public int findLargestBlockStackSlot() {
        int bestSlot = -1;
        int bestCount = 0;
        if (this.countPlaceableBlocks() != 0) {
            for (int slotIndex = 9; slotIndex < 45; slotIndex++) {
                if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                    Item slot = mc.player.container.getSlot(slotIndex).getStack().getItem();
                    ItemStack stack = mc.player.container.getSlot(slotIndex).getStack();
                    if (isPlacableBlockItem(slot) && stack.count > bestCount) {
                        bestCount = stack.count;
                        bestSlot = slotIndex;
                    }
                }
            }

            return bestSlot;
        } else {
            return -1;
        }
    }

    public boolean hasPlaceableBlockInHotbar() {
        for (int slotIndex = 36; slotIndex < 45; slotIndex++) {
            if (mc.player.container.getSlot(slotIndex).getHasStack()) {
                Item slot = mc.player.container.getSlot(slotIndex).getStack().getItem();
                if (isPlacableBlockItem(slot)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean canPlaceWithHand(Hand var1) {
        if (!this.getParent().getStringSettingValueByName("ItemSpoof").equals("None")) {
            return this.countPlaceableBlocks() != 0;
        } else
            return isPlacableBlockItem(mc.player.getHeldItem(var1).getItem());
    }

    public void swapSlotToHotbar(int var1, int var2) {
        mc.playerController.windowClick(mc.player.container.windowId, var1, var2, ClickType.SWAP, mc.player);
    }

    public void performTowering(EventMove event) {
        if (mc.timer.timerSpeed == 0.8038576F) {
            mc.timer.timerSpeed = 1.0F;
        }

        if (this.countPlaceableBlocks() != 0 && (!mc.player.collidedVertically
                || this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla"))) {
            if (!MovementUtil.isMoving() || this.getBooleanValueFromSettingName("Tower while moving")) {
                String mode = this.getStringSettingValueByName("Tower Mode");
                switch (mode) {
                    case "NCP":
                        if (event.getY() > 0.0) {
                            if (MovementUtil.getJumpBoost() == 0) {
                                if (event.getY() > 0.247 && event.getY() < 0.249) {
                                    event.setY(
                                            (double) ((int) (mc.player.getPosY() + event.getY())) - mc.player.getPosY());
                                }
                            } else {
                                double yFloor = (int) (mc.player.getPosY() + event.getY());
                                if (yFloor != (double) ((int) mc.player.getPosY())
                                        && mc.player.getPosY() + event.getY() - yFloor < 0.15) {
                                    event.setY(yFloor - mc.player.getPosY());
                                }
                            }
                        }

                        if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())
                                && MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                            if (mc.gameSettings.keyBindJump.pressed) {
                                if (!MovementUtil.isMoving()) {
                                    MovementUtil.strafe(0.0);
                                    MovementUtil.setMotion(event, 0.0);
                                }

                                event.setY(MovementUtil.getJumpValue());
                            } else {
                                event.setY(-1.0E-5);
                            }
                        }
                        break;
                    case "AAC":
                        if (event.getY() > 0.247 && event.getY() < 0.249) {
                            event.setY((double) ((int) (mc.player.getPosY() + event.getY())) - mc.player.getPosY());
                            if (mc.gameSettings.keyBindJump.pressed && !MovementUtil.isMoving()) {
                                MovementUtil.strafe(0.0);
                                MovementUtil.setMotion(event, 0.0);
                            }
                        } else if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())
                                && MultiUtilities.isAboveBounds(mc.player, 0.001F)) {
                            event.setY(-1.0E-10);
                        }
                        break;
                    case "Vanilla":
                        if (mc.gameSettings.keyBindJump.pressed
                                && MultiUtilities.isAboveBounds(mc.player, 0.001F)
                                && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, 1.0, 0.0))
                                .count() == 0L) {
                            mc.player
                                    .setPosition(mc.player.getPosX(), mc.player.getPosY() + 1.0, mc.player.getPosZ());
                            event.setY(0.0);
                            MovementUtil.setMotion(event, 0.0);
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
                event.setY(MovementUtil.getJumpValue());
            }
        } else if (!MovementUtil.isMoving() || this.getBooleanValueFromSettingName("Tower while moving")) {
            mc.player.jumpTicks = 0;
            mc.player.jump();
            MovementUtil.setMotion(event, MovementUtil.getSpeed());
            MovementUtil.strafe(MovementUtil.getSpeed());
        }

        if (!this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")) {
            MovementUtil.setPlayerYMotion(event.getY());
        }
    }

    @Override
    public String getSuffix() {
        return Client.getInstance().clientMode != ClientMode.CLASSIC ? super.getSuffix() : "Scaffold";
    }

    @EventTarget
    public void onTick(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSettingName("Show Block Amount")) {
                this.field23886 = this.countPlaceableBlocks();
            }
        }
    }

    @Override
    public void onDisable() {
        Rots.rotating = false;
        this.field23885.changeDirection(Animation.Direction.BACKWARDS);
        super.onDisable();
    }

    @EventTarget
    public void method16743(EventRender var1) {
        this.field23885.changeDirection(Animation.Direction.FORWARDS);
        if (this.field23885.calcPercent() != 0.0F) {
            if (this.getBooleanValueFromSettingName("Show Block Amount")) {
                if (Client.getInstance().clientMode != ClientMode.JELLO) {
                    this.method16744(
                            mc.mainWindow.getWidth() / 2,
                            mc.mainWindow.getHeight() / 2 + 15 - (int) (10.0F * this.field23885.calcPercent()),
                            this.field23885.calcPercent());
                } else {
                    this.method16745(
                            mc.mainWindow.getWidth() / 2,
                            mc.mainWindow.getHeight() - 138
                                    - (int) (25.0F * MathHelper.calculateTransition(this.field23885.calcPercent(), 0.0F,
                                    1.0F, 1.0F)),
                            this.field23885.calcPercent());
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
                MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor(), var3 * 0.3F));
        RenderUtil.drawString(
                ResourceList.medium17,
                (float) (var1 + 10),
                (float) (var2 + 4),
                this.field23886 + " Blocks",
                MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var3 * 0.8F));
        GL11.glAlphaFunc(519, 0.0F);
    }

    public void method16745(int var1, int var2, float var3) {
        int var6 = 0;
        int var7 = ResourceRegistry.JelloLightFont18.getWidth(this.field23886 + "") + 3;
        var6 += var7;
        var6 += ResourceRegistry.JelloLightFont14.getWidth("Blocks");
        int var8 = var6 + 20;
        int var9 = 32;
        var1 -= var8 / 2;
        GL11.glPushMatrix();
        RenderUtil.method11465(var1, var2, var8, var9, MultiUtilities.applyAlpha(-15461356, 0.8F * var3));
        RenderUtil.drawString(
                ResourceRegistry.JelloLightFont18, (float) (var1 + 10), (float) (var2 + 4), this.field23886 + "",
                MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), var3));
        RenderUtil.drawString(
                ResourceRegistry.JelloLightFont14, (float) (var1 + 10 + var7), (float) (var2 + 8), "Blocks",
                MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.6F * var3));
        var1 += 11 + var8 / 2;
        var2 += var9;
        GL11.glPushMatrix();
        GL11.glTranslatef((float) var1, (float) var2, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef((float) (-var1), (float) (-var2), 0.0F);
        RenderUtil.drawImage((float) var1, (float) var2, 9.0F, 23.0F, ResourceList.selectPNG,
                MultiUtilities.applyAlpha(-15461356, 0.8F * var3));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
