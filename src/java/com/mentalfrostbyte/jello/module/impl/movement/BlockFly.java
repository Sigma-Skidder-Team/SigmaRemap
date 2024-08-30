package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.Class4435;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.*;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
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
        if (!(var0 instanceof Class3292)) {
            return false;
        } else {
            Block var3 = ((Class3292) var0).method11845();
            return ! blocksToNotPlace.contains(var3)
                    && !(var3 instanceof Class3202)
                    && !(var3 instanceof Class3194)
                    && !(var3 instanceof Class3206)
                    && !(var3 instanceof Class3468)
                    && !(var3 instanceof Class3216)
                    && !(var3 instanceof Class3420)
                    && !(var3 instanceof Class3343)
                    && !(var3 instanceof Class3250)
                    && !(var3 instanceof Class3241)
                    && !(var3 instanceof Class3348)
                    && !(var3 instanceof Class3461);
        }
    }

    public boolean method16732() {
        return this.getBooleanValueFromSetttingName("No Sprint") && this.isEnabled();
    }

    public void method16734() {
        try {
            for (int var3 = 36; var3 < 45; var3++) {
                int var4 = var3 - 36;
                if (mc.player.field4904.method18131(var3).method18266()
                        && method16733(mc.player.field4904.method18131(var3).method18265().getItem())
                        && mc.player.field4904.method18131(var3).method18265().field39976 != 0) {
                    if (mc.player.inventory.currentItem == var4) {
                        return;
                    }

                    mc.player.inventory.currentItem = var4;
                    if (this.getStringSettingValueByName("ItemSpoof").equals("LiteSpoof") && (this.field23884 < 0 || this.field23884 != var4)) {
                        mc.getConnection().getNetworkManager().sendPacket(new Class5539(var4));
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
            if (mc.player.field4904.method18131(var4).method18266()) {
                ItemStack var5 = mc.player.field4904.method18131(var4).method18265();
                Item var6 = var5.getItem();
                if (method16733(var6)) {
                    var3 += var5.field39976;
                }
            }
        }

        return var3;
    }

    public void method16736() {
        String var3 = this.getStringSettingValueByName("Picking mode");
        if ((!var3.equals("OpenInv") || mc.currentScreen instanceof InventoryScreen) && this.method16735() != 0) {
            int var4 = 43;
            if (!this.getBooleanValueFromSetttingName("Intelligent Block Picker")) {
                if (!this.method16738()) {
                    int var5 = -1;

                    for (int var6 = 9; var6 < 36; var6++) {
                        if (mc.player.field4904.method18131(var6).method18266()) {
                            Item var7 = mc.player.field4904.method18131(var6).method18265().getItem();
                            if (method16733(var7)) {
                                var5 = var6;
                                break;
                            }
                        }
                    }

                    for (int var9 = 36; var9 < 45; var9++) {
                        if (!mc.player.field4904.method18131(var9).method18266()) {
                            var4 = var9;
                            break;
                        }
                    }

                    if (var5 >= 0) {
                        if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")) {
                            mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
                        }

                        this.method16740(var5, var4 - 36);
                        if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")) {
                            mc.getConnection().sendPacket(new Class5482(-1));
                        }
                    }
                }
            } else {
                int var8 = this.method16737();
                if (!this.method16738()) {
                    for (int var11 = 36; var11 < 45; var11++) {
                        if (!mc.player.field4904.method18131(var11).method18266()) {
                            var4 = var11;
                            break;
                        }
                    }
                } else {
                    for (int var10 = 36; var10 < 45; var10++) {
                        if (mc.player.field4904.method18131(var10).method18266()) {
                            Item var12 = mc.player.field4904.method18131(var10).method18265().getItem();
                            if (method16733(var12)) {
                                var4 = var10;
                                if (mc.player.field4904.method18131(var10).method18265().field39976
                                        == mc.player.field4904.method18131(var8).method18265().field39976) {
                                    var4 = -1;
                                }
                                break;
                            }
                        }
                    }
                }

                if (var4 >= 0 && mc.player.field4904.method18131(var4).field25579 != var8) {
                    if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv") && Class8005.method27349() <= Class5989.field26136.method18582()) {
                        mc.getConnection().sendPacket(new CClientStatusPacket(CClientStatusPacketState.field14279));
                    }

                    this.method16740(var8, var4 - 36);
                    if (!(mc.currentScreen instanceof InventoryScreen) && var3.equals("FakeInv")) {
                        mc.getConnection().sendPacket(new Class5482(-1));
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
                if (mc.player.field4904.method18131(var5).method18266()) {
                    Item var6 = mc.player.field4904.method18131(var5).method18265().getItem();
                    ItemStack var7 = mc.player.field4904.method18131(var5).method18265();
                    if (method16733(var6) && var7.field39976 > var4) {
                        var4 = var7.field39976;
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
            if (mc.player.field4904.method18131(var3).method18266()) {
                Item var4 = mc.player.field4904.method18131(var3).method18265().getItem();
                if (method16733(var4)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean method16739(Hand var1) {
        if (!this.method16004().getStringSettingValueByName("ItemSpoof").equals("None")) {
            return this.method16735() != 0;
        } else return method16733(mc.player.getHeldItem(var1).getItem());
    }

    public void method16740(int var1, int var2) {
        mc.playerController.method23144(mc.player.field4904.field25471, var1, var2, Class2259.field14696, mc.player);
    }

    public void method16741(Class4435 var1) {
        if (mc.timer.timerSpeed == 0.8038576F) {
            mc.timer.timerSpeed = 1.0F;
        }

        if (this.method16735() != 0 && (!mc.player.collidedVertically || this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla"))) {
            if (!Class5628.method17686() || this.getBooleanValueFromSetttingName("Tower while moving")) {
                String var4 = this.getStringSettingValueByName("Tower Mode");
                switch (var4) {
                    case "NCP":
                        if (var1.method13994() > 0.0) {
                            if (Class9567.method37079() == 0) {
                                if (var1.method13994() > 0.247 && var1.method13994() < 0.249) {
                                    var1.method13995((double) ((int) (mc.player.getPosY() + var1.method13994())) - mc.player.getPosY());
                                }
                            } else {
                                double var6 = (int) (mc.player.getPosY() + var1.method13994());
                                if (var6 != (double) ((int) mc.player.getPosY()) && mc.player.getPosY() + var1.method13994() - var6 < 0.15) {
                                    var1.method13995(var6 - mc.player.getPosY());
                                }
                            }
                        }

                        if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())
                                && Class5628.method17730(mc.player, 0.001F)) {
                            if (mc.gameSettings.keyBindJump.pressed) {
                                if (!Class5628.method17686()) {
                                    Class9567.method37090(0.0);
                                    Class9567.method37088(var1, 0.0);
                                }

                                var1.method13995(Class9567.method37080());
                            } else {
                                var1.method13995(-1.0E-5);
                            }
                        }
                        break;
                    case "AAC":
                        if (var1.method13994() > 0.247 && var1.method13994() < 0.249) {
                            var1.method13995((double) ((int) (mc.player.getPosY() + var1.method13994())) - mc.player.getPosY());
                            if (mc.gameSettings.keyBindJump.pressed && !Class5628.method17686()) {
                                Class9567.method37090(0.0);
                                Class9567.method37088(var1, 0.0);
                            }
                        } else if (mc.player.getPosY() == (double) ((int) mc.player.getPosY())
                                && Class5628.method17730(mc.player, 0.001F)) {
                            var1.method13995(-1.0E-10);
                        }
                        break;
                    case "Vanilla":
                        if (mc.gameSettings.keyBindJump.pressed
                                && Class5628.method17730(mc.player, 0.001F)
                                && mc.world.method7055(mc.player, mc.player.boundingBox.method19667(0.0, 1.0, 0.0)).count() == 0L) {
                            mc.player
                                    .setPosition(mc.player.getPosX(), mc.player.getPosY() + 1.0, mc.player.getPosZ());
                            var1.method13995(0.0);
                            Class9567.method37088(var1, 0.0);
                            mc.timer.timerSpeed = 0.8038576F;
                        }
                }
            }
        } else if (!this.getStringSettingValueByName("Tower Mode").equals("AAC")
                || !Class5628.method17730(mc.player, 0.001F)
                || !mc.gameSettings.keyBindJump.pressed) {
            if (!this.getStringSettingValueByName("Tower Mode").equals("NCP")
                    && !this.getStringSettingValueByName("Tower Mode").equals("Vanilla")
                    && Class5628.method17730(mc.player, 0.001F)
                    && mc.gameSettings.keyBindJump.pressed) {
                mc.player.field4999 = 20;
                var1.method13995(Class9567.method37080());
            }
        } else if (!Class5628.method17686() || this.getBooleanValueFromSetttingName("Tower while moving")) {
            mc.player.field4999 = 0;
            mc.player.method2914();
            Class9567.method37088(var1, Class9567.method37075());
            Class9567.method37090(Class9567.method37075());
        }

        if (!this.getStringSettingValueByName("Tower Mode").equalsIgnoreCase("Vanilla")) {
            Class5628.method17725(var1.method13994());
        }
    }

    @Override
    public String getSuffix() {
        return Client.getInstance().getClientMode() != ClientMode.CLASSIC ? super.getSuffix() : "Scaffold";
    }

    @EventTarget
    public void onTick(TickEvent var1) {
        if (this.isEnabled()) {
            if (this.getBooleanValueFromSetttingName("Show Block Amount")) {
                this.field23886 = this.method16735();
            }
        }
    }

    @Override
    public void onDisable() {
        this.field23885.changeDirection(Direction.BACKWARDS);
        super.onDisable();
    }

    @EventTarget
    public void method16743(Class4415 var1) {
        this.field23885.changeDirection(Direction.FORWARDS);
        if (this.field23885.calcPercent() != 0.0F) {
            if (this.getBooleanValueFromSetttingName("Show Block Amount")) {
                if (Client.getInstance().getClientMode() != ClientMode.JELLO) {
                    this.method16744(
                            mc.mainWindow.getWidth() / 2,
                            mc.mainWindow.getHeight() / 2 + 15 - (int) (10.0F * this.field23885.calcPercent()),
                            this.field23885.calcPercent()
                    );
                } else {
                    this.method16745(
                            mc.mainWindow.getWidth() / 2,
                            mc.mainWindow.getHeight() - 138 - (int) (25.0F * Class8056.method27664(this.field23885.calcPercent(), 0.0F, 1.0F, 1.0F)),
                            this.field23885.calcPercent()
                    );
                }
            }
        }
    }

    public void method16744(int var1, int var2, float var3) {
        var3 = (float) (0.5 + 0.5 * (double) var3);
        GL11.glAlphaFunc(518, 0.1F);
        RenderUtil.method11439(
                ClassicDecryption.medium17,
                (float) (var1 + 10),
                (float) (var2 + 5),
                this.field23886 + " Blocks",
                Class5628.method17688(ClientColors.DEEP_TEAL.getColor, var3 * 0.3F)
        );
        RenderUtil.method11439(
                ClassicDecryption.medium17,
                (float) (var1 + 10),
                (float) (var2 + 4),
                this.field23886 + " Blocks",
                Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var3 * 0.8F)
        );
        GL11.glAlphaFunc(519, 0.0F);
    }

    public void method16745(int var1, int var2, float var3) {
        int var6 = 0;
        int var7 = ResourceRegistry.JelloLightFont18.method23942(this.field23886 + "") + 3;
        var6 += var7;
        var6 += ResourceRegistry.JelloLightFont14.method23942("Blocks");
        int var8 = var6 + 20;
        byte var9 = 32;
        var1 -= var8 / 2;
        GL11.glPushMatrix();
        RenderUtil.method11465(var1, var2, var8, var9, Class5628.method17688(-15461356, 0.8F * var3));
        RenderUtil.method11439(
                ResourceRegistry.JelloLightFont18, (float) (var1 + 10), (float) (var2 + 4), this.field23886 + "", Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var3)
        );
        RenderUtil.method11439(
                ResourceRegistry.JelloLightFont14, (float) (var1 + 10 + var7), (float) (var2 + 8), "Blocks", Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F * var3)
        );
        var1 += 11 + var8 / 2;
        var2 += var9;
        GL11.glPushMatrix();
        GL11.glTranslatef((float) var1, (float) var2, 0.0F);
        GL11.glRotatef(90.0F, 0.0F, 0.0F, 1.0F);
        GL11.glTranslatef((float) (-var1), (float) (-var2), 0.0F);
        RenderUtil.method11449((float) var1, (float) var2, 9.0F, 23.0F, ResourcesDecrypter.selectPNG, Class5628.method17688(-15461356, 0.8F * var3));
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
