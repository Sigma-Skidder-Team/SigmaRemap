package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.client.gui.screen.inventory.ChestScreen;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.play.client.CAnimateHandPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemOnBlockPacket;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ChestStealer extends Module {
    public boolean field23621;
    private final ConcurrentHashMap<Class941, Boolean> field23622;
    private final TimerUtil field23623 = new TimerUtil();
    private final TimerUtil field23624 = new TimerUtil();
    private Class941 field23625;

    public ChestStealer() {
        super(ModuleCategory.ITEM, "ChestStealer", "Steals items from chest");
        this.registerSetting(new BooleanSetting("Aura", "Automatically open chests near you.", false));
        this.registerSetting(new BooleanSetting("Ignore Junk", "Ignores useless items.", true));
        this.registerSetting(new BooleanSetting("Fix ViaVersion", "Fixes ViaVersion delay.", true));
        this.registerSetting(new BooleanSetting("Close", "Automatically closes the chest when done", true));
        this.registerSetting(new NumberSetting<Float>("Delay", "Click delay", 0.2F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("First Item", "Tick delay before grabbing first item", 0.2F, Float.class, 0.0F, 1.0F, 0.01F));
        this.field23622 = new ConcurrentHashMap<Class941, Boolean>();
    }

    @Override
    public void onEnable() {
        this.field23625 = null;
        this.field23621 = false;
        if (!this.field23622.isEmpty()) {
            this.field23622.clear();
        }
    }

    @EventTarget
    public void method16365(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            if (this.getBooleanValueFromSetttingName("Aura")) {
                if (this.field23624.method27121() > 2000L && this.field23621) {
                    this.field23624.method27120();
                    this.field23621 = false;
                }

                if (!this.field23624.isEnabled()) {
                    this.field23624.start();
                }

                this.method16370();
                if (this.field23625 != null && mc.currentScreen == null && this.field23624.method27121() > 1000L) {
                    BlockRayTraceResult var4 = (BlockRayTraceResult) BlockUtil.method34570(this.field23625.getPos());
                    if (var4.getPos().getX() == this.field23625.getPos().getX()
                            && var4.getPos().getY() == this.field23625.getPos().getY()
                            && var4.getPos().getZ() == this.field23625.getPos().getZ()) {
                        this.field23621 = true;
                        mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, var4));
                        mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                        this.field23624.method27120();
                    }
                }

                boolean var14 = false;

                for (Entry var6 : this.field23622.entrySet()) {
                    Class941 var7 = (Class941) var6.getKey();
                    boolean var8 = (Boolean) var6.getValue();
                    float var9 = (float) var7.getPos().getX();
                    float var10 = (float) var7.getPos().getY() + 0.1F;
                    float var11 = (float) var7.getPos().getZ();
                    if (!this.field23621
                            && (
                            this.field23625 == null
                                    || mc.player.getDistanceNearest(var9, var10, var11)
                                    > mc.player.getDistanceNearest(var9, var10, var11)
                    )
                            && !var8
                            && Math.sqrt(mc.player.getDistanceNearest(var9, var10, var11)) < 5.0
                            && this.field23624.method27121() > 1000L
                            && mc.currentScreen == null) {
                        BlockRayTraceResult var12 = (BlockRayTraceResult) BlockUtil.method34570(var7.getPos());
                        if (var12.getPos().getX() == var7.getPos().getX()
                                && var12.getPos().getY() == var7.getPos().getY()
                                && var12.getPos().getZ() == var7.getPos().getZ()) {
                            this.field23625 = var7;
                            float[] var13 = RotationHelper.method34144((double) var9 + 0.5, (double) var11 + 0.5, (double) var10 + 0.35);
                            var1.setPitch(var13[0]);
                            var1.setYaw(var13[1]);
                            var14 = true;
                        }
                    }
                }

                if (!var14 && mc.currentScreen == null && this.field23625 != null) {
                    this.field23622.put(this.field23625, true);
                    this.field23625 = null;
                }
            }
        }
    }

    @EventTarget
    public void method16366(WorldLoadEvent var1) {
        if (!this.field23622.isEmpty()) {
            this.field23622.clear();
        }
    }

    @EventTarget
    public void method16367(EventRender var1) {
        if (this.isEnabled()) {
            if (!(mc.currentScreen instanceof ChestScreen)) {
                this.field23621 = false;
                this.field23623.stop();
                this.field23623.method27120();
                if (mc.currentScreen == null && InvManagerUtils.method25875()) {
                    this.field23624.method27120();
                }
            } else {
                if (!this.field23623.isEnabled()) {
                    this.field23623.start();
                }

                if (!((float) Client.getInstance().getPlayerTracker().method31333() < this.getNumberValueBySettingName("Delay") * 20.0F)) {
                    if (InvManagerUtils.method25875()) {
                        if (this.getBooleanValueFromSetttingName("Close")) {
                            mc.player.method2772();
                        }
                    } else {
                        ChestScreen var4 = (ChestScreen) mc.currentScreen;
                        if (!this.method16368(var4)) {
                            if (this.field23625 != null) {
                                this.field23622.put(this.field23625, true);
                            }
                        } else {
                            boolean var5 = true;

                            for (Slot var7 : var4.field4727.field25468) {
                                if (var7.getHasStack() && var7.field25579 < var4.field4727.method18165() * 9) {
                                    ItemStack var8 = var7.getStack();
                                    if (!this.method16369(var8)) {
                                        if (!this.field23621) {
                                            if ((float) this.field23623.method27121() < this.getNumberValueBySettingName("First Item") * 1000.0F) {
                                                return;
                                            }

                                            this.field23621 = !this.field23621;
                                        }

                                        if (!this.getBooleanValueFromSetttingName("Fix ViaVersion")) {
                                            InvManagerUtils.method25869(var4.field4727.field25471, var7.field25579, 0, ClickType.field14695, mc.player);
                                        } else {
                                            InvManagerUtils.fixedClick(var4.field4727.field25471, var7.field25579, 0, ClickType.field14695, mc.player, true);
                                        }

                                        this.field23623.method27120();
                                        var5 = false;
                                        if (this.getNumberValueBySettingName("Delay") > 0.0F) {
                                            break;
                                        }
                                    }
                                }
                            }

                            if (var5) {
                                if (this.field23621) {
                                    this.field23621 = !this.field23621;
                                }

                                if (this.getBooleanValueFromSetttingName("Close")) {
                                    mc.player.method2772();
                                }

                                for (Class941 var10 : this.field23622.keySet()) {
                                    if (var10 == this.field23625) {
                                        this.field23625 = null;
                                        this.field23622.put(var10, true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private boolean method16368(ChestScreen var1) {
        List<String> var4 = new ArrayList<>(
                Arrays.asList(
                        "menu",
                        "selector",
                        "game",
                        "gui",
                        "server",
                        "inventory",
                        "play",
                        "teleporter",
                        "shop",
                        "melee",
                        "armor",
                        "block",
                        "castle",
                        "mini",
                        "warp",
                        "teleport",
                        "user",
                        "team",
                        "tool",
                        "sure",
                        "trade",
                        "cancel",
                        "accept",
                        "soul",
                        "book",
                        "recipe",
                        "profile",
                        "tele",
                        "port",
                        "map",
                        "kit",
                        "select",
                        "lobby",
                        "vault",
                        "lock",
                        "anticheat",
                        "travel",
                        "settings",
                        "user",
                        "preference",
                        "compass",
                        "cake",
                        "wars",
                        "buy",
                        "upgrade",
                        "ranged",
                        "potions",
                        "utility",
                        "choose",
                        "modalidades"
                )
        );
        List<BlockPos> var5 = BlockUtil.method34561(8.0F);
        String var6 = var1.getNarrationMessage().replaceAll("§.", "").toLowerCase();

        for (String var8 : var4) {
            int var9 = var6.indexOf(var8);
            if (var9 > 0 && var9 < 40) {
                return false;
            }
        }

        for (BlockPos var11 : var5) {
            if (BlockUtil.getBlockFromPosition(var11) instanceof Class3348 || BlockUtil.getBlockFromPosition(var11) instanceof Class3467) {
                return true;
            }
        }

        return false;
    }

    private boolean method16369(ItemStack var1) {
        Item var4 = var1.getItem();
        if (!this.getBooleanValueFromSetttingName("Ignore Junk")) {
            return false;
        } else if (!(var4 instanceof ItemSword)) {
            if (var4 instanceof Class3268) {
                return !InvManager.method16442(var1);
            } else if (!(var4 instanceof Class3265)) {
                if (var4 instanceof Class3270) {
                    return !InvManager.method16443(var1);
                } else if (!(var4 instanceof Class3323)) {
                    if (var4 instanceof Class3292) {
                        return !BlockFly.method16733(var4);
                    } else if (!(var4 instanceof Class3308)
                            && (!(var4 instanceof BowItem) || !Client.getInstance().getModuleManager().getModuleByClass(InvManager.class).getBooleanValueFromSetttingName("Archery"))) {
                        if (var4 == Items.field37883 && Client.getInstance().getModuleManager().getModuleByClass(AutoMLG.class).isEnabled()) {
                            return false;
                        } else {
                            ArrayList var5 = new ArrayList<Item>(
                                    Arrays.asList(
                                            Items.field37905,
                                            Items.field37839,
                                            Items.field37868,
                                            Items.field37904,
                                            Items.field37838,
                                            Items.field37835,
                                            Items.field37389,
                                            Items.field37882,
                                            Items.field37884,
                                            Items.field37883,
                                            Items.field37424,
                                            Items.field38070,
                                            Items.field38045,
                                            Items.field37956,
                                            Items.field37536,
                                            Items.field37393,
                                            Items.field38112,
                                            Items.field37960,
                                            Items.field37959,
                                            Items.field37841,
                                            Items.field37890,
                                            Items.field37972,
                                            Items.field37316,
                                            Items.field37888,
                                            Items.field37906
                                    )
                            );
                            return var1 == null || var5.contains(var4) || var4.method11717().getString().toLowerCase().contains("seed");
                        }
                    } else {
                        return true;
                    }
                } else {
                    return InvManagerUtils.method25874(var1);
                }
            } else {
                return !InvManager.method16444(var1);
            }
        } else {
            return !InvManager.method16431(var1);
        }
    }

    private void method16370() {
        List<TileEntity> var3 = mc.world.loadedTileEntityList;
        var3.removeIf(var0 -> !(var0 instanceof Class941));

        for (TileEntity var5 : var3) {
            if (!this.field23622.containsKey((Class941) var5)) {
                this.field23622.put((Class941) var5, false);
            }
        }

        for (Class941 var7 : this.field23622.keySet()) {
            if (!var3.contains(var7)) {
                this.field23622.remove(var7);
            }
        }
    }
}
