package com.mentalfrostbyte.jello.module.impl.item;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventRender;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.block.ChestBlock;
import net.minecraft.block.Class3467;
import net.minecraft.client.gui.screen.inventory.ChestScreen;
import net.minecraft.inventory.container.ClickType;
import net.minecraft.item.*;
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
    private final ConcurrentHashMap<ChestTileEntity, Boolean> field23622;
    private final TimerUtil field23623 = new TimerUtil();
    private final TimerUtil field23624 = new TimerUtil();
    private ChestTileEntity field23625;

    public ChestStealer() {
        super(ModuleCategory.ITEM, "ChestStealer", "Steals items from chest");
        this.registerSetting(new BooleanSetting("Aura", "Automatically open chests near you.", false));
        this.registerSetting(new BooleanSetting("Ignore Junk", "Ignores useless items.", true));
        this.registerSetting(new BooleanSetting("Fix ViaVersion", "Fixes ViaVersion delay.", true));
        this.registerSetting(new BooleanSetting("Close", "Automatically closes the chest when done", true));
        this.registerSetting(new NumberSetting<Float>("Delay", "Click delay", 0.2F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(new NumberSetting<Float>("First Item", "Tick delay before grabbing first item", 0.2F, Float.class, 0.0F, 1.0F, 0.01F));
        this.field23622 = new ConcurrentHashMap<ChestTileEntity, Boolean>();
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
            if (this.getBooleanValueFromSettingName("Aura")) {
                if (this.field23624.getElapsedTime() > 2000L && this.field23621) {
                    this.field23624.reset();
                    this.field23621 = false;
                }

                if (!this.field23624.isEnabled()) {
                    this.field23624.start();
                }

                this.method16370();
                if (this.field23625 != null && mc.currentScreen == null && this.field23624.getElapsedTime() > 1000L) {
                    BlockRayTraceResult var4 = (BlockRayTraceResult) BlockUtil.method34570(this.field23625.getPos());
                    if (var4.getPos().getX() == this.field23625.getPos().getX()
                            && var4.getPos().getY() == this.field23625.getPos().getY()
                            && var4.getPos().getZ() == this.field23625.getPos().getZ()) {
                        this.field23621 = true;
                        mc.getConnection().sendPacket(new CPlayerTryUseItemOnBlockPacket(Hand.MAIN_HAND, var4));
                        mc.getConnection().sendPacket(new CAnimateHandPacket(Hand.MAIN_HAND));
                        this.field23624.reset();
                    }
                }

                boolean var14 = false;

                for (Entry var6 : this.field23622.entrySet()) {
                    ChestTileEntity var7 = (ChestTileEntity) var6.getKey();
                    boolean var8 = (Boolean) var6.getValue();
                    float var9 = (float) var7.getPos().getX();
                    float var10 = (float) var7.getPos().getY() + 0.1F;
                    float var11 = (float) var7.getPos().getZ();
                    if (!this.field23621
                            && (
                            this.field23625 == null
                                    || mc.player.getDistanceSq(var9, var10, var11)
                                    > mc.player.getDistanceSq(var9, var10, var11)
                    )
                            && !var8
                            && Math.sqrt(mc.player.getDistanceSq(var9, var10, var11)) < 5.0
                            && this.field23624.getElapsedTime() > 1000L
                            && mc.currentScreen == null) {
                        BlockRayTraceResult var12 = (BlockRayTraceResult) BlockUtil.method34570(var7.getPos());
                        if (var12.getPos().getX() == var7.getPos().getX()
                                && var12.getPos().getY() == var7.getPos().getY()
                                && var12.getPos().getZ() == var7.getPos().getZ()) {
                            this.field23625 = var7;
                            float[] var13 = RotationHelper.method34144((double) var9 + 0.5, (double) var11 + 0.5, (double) var10 + 0.35);
                            var1.setYaw(var13[0]);
                            var1.setPitch(var13[1]);
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
                this.field23623.reset();
                if (mc.currentScreen == null && InvManagerUtils.method25875()) {
                    this.field23624.reset();
                }
            } else {
                if (!this.field23623.isEnabled()) {
                    this.field23623.start();
                }

                if (!((float) Client.getInstance().getPlayerTracker().getMode() < this.getNumberValueBySettingName("Delay") * 20.0F)) {
                    if (InvManagerUtils.method25875()) {
                        if (this.getBooleanValueFromSettingName("Close")) {
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

                            for (Slot var7 : var4.field4727.inventorySlots) {
                                if (var7.getHasStack() && var7.slotNumber < var4.field4727.method18165() * 9) {
                                    ItemStack var8 = var7.getStack();
                                    if (!this.method16369(var8)) {
                                        if (!this.field23621) {
                                            if ((float) this.field23623.getElapsedTime() < this.getNumberValueBySettingName("First Item") * 1000.0F) {
                                                return;
                                            }

                                            this.field23621 = !this.field23621;
                                        }

                                        if (!this.getBooleanValueFromSettingName("Fix ViaVersion")) {
                                            InvManagerUtils.method25869(var4.field4727.windowId, var7.slotNumber, 0, ClickType.QUICK_MOVE, mc.player);
                                        } else {
                                            InvManagerUtils.fixedClick(var4.field4727.windowId, var7.slotNumber, 0, ClickType.QUICK_MOVE, mc.player, true);
                                        }

                                        this.field23623.reset();
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

                                if (this.getBooleanValueFromSettingName("Close")) {
                                    mc.player.method2772();
                                }

                                for (ChestTileEntity var10 : this.field23622.keySet()) {
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
            if (BlockUtil.getBlockFromPosition(var11) instanceof ChestBlock || BlockUtil.getBlockFromPosition(var11) instanceof Class3467) {
                return true;
            }
        }

        return false;
    }

    private boolean method16369(ItemStack var1) {
        Item var4 = var1.getItem();
        if (!this.getBooleanValueFromSettingName("Ignore Junk")) {
            return false;
        } else if (!(var4 instanceof SwordItem)) {
            if (var4 instanceof PickaxeItem) {
                return !InvManager.method16442(var1);
            } else if (!(var4 instanceof AxeItem)) {
                if (var4 instanceof ShovelItem) {
                    return !InvManager.isHoe(var1);
                } else if (!(var4 instanceof PotionItem)) {
                    if (var4 instanceof BlockItem) {
                        return !BlockFly.shouldPlaceItem(var4);
                    } else if (!(var4 instanceof ArrowItem)
                            && (!(var4 instanceof BowItem) || !Client.getInstance().moduleManager.getModuleByClass(InvManager.class).getBooleanValueFromSettingName("Archery"))) {
                        if (var4 == Items.WATER_BUCKET && Client.getInstance().moduleManager.getModuleByClass(AutoMLG.class).isEnabled()) {
                            return false;
                        } else {
                            ArrayList var5 = new ArrayList<Item>(
                                    Arrays.asList(
                                            Items.COMPASS,
                                            Items.field37839,
                                            Items.field37868,
                                            Items.EGG,
                                            Items.field37838,
                                            Items.field37835,
                                            Items.TNT,
                                            Items.BUCKET,
                                            Items.LAVA_BUCKET,
                                            Items.WATER_BUCKET,
                                            Items.field37424,
                                            Items.field38070,
                                            Items.EXPERIENCE_BOTTLE,
                                            Items.field37956,
                                            Items.field37536,
                                            Items.TORCH,
                                            Items.field38112,
                                            Items.field37960,
                                            Items.field37959,
                                            Items.field37841,
                                            Items.LEATHER,
                                            Items.field37972,
                                            Items.PISTON,
                                            Items.SNOWBALL,
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
        var3.removeIf(var0 -> !(var0 instanceof ChestTileEntity));

        for (TileEntity var5 : var3) {
            if (!this.field23622.containsKey((ChestTileEntity) var5)) {
                this.field23622.put((ChestTileEntity) var5, false);
            }
        }

        for (ChestTileEntity var7 : this.field23622.keySet()) {
            if (!var3.contains(var7)) {
                this.field23622.remove(var7);
            }
        }
    }
}
