package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.unmapped.Class6000;
import com.mentalfrostbyte.jello.unmapped.Class6002;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import mapped.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.*;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;

import java.util.*;

public class Test extends Module {
    public boolean field23743;
    public Animation field23751;
    public Vector3d field23752;
    private double field23735;
    private double field23736;
    private double field23737;
    private double field23738;
    private double field23739;
    private double field23740;
    private double field23741;
    private double field23742;
    private long field23744;
    private float field23745;
    private float field23746;
    private float field23747;
    private float field23748;
    private float field23749;
    private float field23750;
    private Entity field23753;

    public Test() {
        super(ModuleCategory.MISC, "Test", "A mod for testing things");
        this.registerSetting(new Class6000("Bezier", "ey", 0.57F, -0.035F, 0.095F, -0.0F));
        this.registerSetting(
                new BooleanSetting("Test Checkbox", "A test checkbox", true)
                        .method18616(var0 -> Client.getInstance().getLogger().info("Changed checkbox: " + var0.getCurrentValue()))
        );
        this.registerSetting(
                new NumberSetting<Float>("Test Slider", "A test slider", 0.5F, Float.class, 0.0F, 1.0F, 0.1F)
                        .method18616(var0 -> Client.getInstance().getLogger().info("Changed slider: " + var0.getCurrentValue()))
        );
        this.registerSetting(
                new Class6002("Test Type", "A test type button", 0, "hello", "goodbye")
                        .method18616(var0 -> Client.getInstance().getLogger().info("Changed type: " + var0.getCurrentValue()))
        );
        this.registerSetting(
                new Class6007(
                        "Test Suboptions",
                        "A test suboption",
                        false,
                        new BooleanSetting("Test Checkbox", "A test checkbox", true),
                        new NumberSetting<Float>("Test Slider", "A test slider", 0.5F, Float.class, 0.0F, 1.0F, 0.1F)
                )
        );
    }

    public static float[] method16562(Entity var0) {
        double var3 = var0.getPosX() - mc.player.getPosX();
        double var5 = var0.getPosZ() - mc.player.getPosZ();
        double var7 = mc.player.getPosY() + (double) mc.player.method3393() - (var0.getPosY() + (double) var0.method3393());
        float var9 = (float) Math.toDegrees(Math.atan2(var5, var3)) - 90.0F;
        double var10 = MathHelper.method37766(var3 * var3 + var5 * var5);
        float var12 = (float) (-(Math.atan2(var7, var10) * 180.0 / Math.PI));
        return new float[]{var9, -var12};
    }

    public static float method16563(float var0, double var1, double var3) {
        double var7 = var1 - mc.player.getPosX();
        double var9 = var3 - mc.player.getPosZ();
        double var11 = 0.0;
        if (var9 < 0.0 && var7 < 0.0) {
            if (var7 != 0.0) {
                var11 = 90.0 + Math.toDegrees(Math.atan(var9 / var7));
            }
        } else if (var9 < 0.0 && var7 > 0.0) {
            if (var7 != 0.0) {
                var11 = -90.0 + Math.toDegrees(Math.atan(var9 / var7));
            }
        } else if (var9 != 0.0) {
            var11 = Math.toDegrees(-Math.atan(var7 / var9));
        }

        return MathHelper.method37792(-(var0 - (float) var11));
    }

    public static float method16565(float var0, Entity var1, double var2) {
        double var6 = var1.getPosX() - mc.player.getPosX();
        double var8 = var1.getPosZ() - mc.player.getPosZ();
        double var10 = var2 - 2.2 + (double) var1.method3393() - mc.player.getPosY();
        double var12 = MathHelper.method37766(var6 * var6 + var8 * var8);
        double var14 = -Math.toDegrees(Math.atan(var10 / var12));
        return -MathHelper.method37792(var0 - (float) var14) - 2.5F;
    }

    @Override
    public void onEnable() {
        this.field23739 = 0.0;
        this.field23751 = new Animation(1000, 100000, Direction.FORWARDS);
        this.field23745 = MathHelper.method37792(mc.player.rotationYaw);
        this.field23745 = 39.0F;
        this.field23746 = mc.player.rotationPitch;
        double var3 = mc.player.getPosX();
        double var5 = mc.player.getPosY();
        double var7 = mc.player.getPosZ();
        double var9 = 3200000.000000002;
        this.field23743 = false;
        this.field23738 = 0.0;
    }

    @Override
    public void onDisable() {
        mc.timer.timerSpeed = 1.0F;
    }

    @EventTarget
    @LowerPriority
    public void method16547(Class4435 var1) {
        if (this.isEnabled()) {
            double var4 = Math.sqrt(var1.method13992() * var1.method13992() + var1.method13996() * var1.method13996());
            ColorUtils.method17725(var1.method13994());
        }
    }

    @EventTarget
    public void method16548(Class4399 var1) {
        if (!this.isEnabled() || !var1.method13921()) {
        }
    }

    @EventTarget
    public void method16549(TickEvent var1) {
        if (!this.isEnabled()) {
        }
    }

    @EventTarget
    public void method16550(Class4415 var1) {
        if (!this.isEnabled()) {
        }
    }

    @EventTarget
    public void method16551(Render3DEvent var1) {
    }

    @EventTarget
    public void method16552(StopUseItemEvent var1) {
        if (!this.isEnabled()) {
        }
    }

    @EventTarget
    public void method16553(SafeWalkEvent var1) {
        if (!this.isEnabled()) {
        }
    }

    @EventTarget
    @LowestPriority
    public void method16554(WorldLoadEvent var1) {
    }

    @EventTarget
    @LowestPriority
    public void method16555(Class4430 var1) {
        if (!this.isEnabled()) {
        }
    }

    @EventTarget
    @LowestPriority
    public void method16556(ClickEvent var1) {
        if (!this.isEnabled() || mc.currentScreen != null) {
        }
    }

    @EventTarget
    public void method16557(Render3DEvent var1) {
    }

    @EventTarget
    @LowestPriority
    public void method16558(SendPacketEvent var1) {
        Packet var4 = var1.method13932();
        if (this.isEnabled() && mc.player != null) {
            if (!(var4 instanceof CUseEntityPacket)) {
                if (!(var4 instanceof CPlayerPacket)) {
                    if (!(var4 instanceof CHeldItemChangePacket)) {
                        if (!(var4 instanceof CPlayerTryUseItemPacket)) {
                            if (!(var4 instanceof CAnimateHandPacket)) {
                                if (!(var4 instanceof CPlayerTryUseItemOnBlockPacket)) {
                                    if (!(var4 instanceof CPlayerDiggingPacket)) {
                                        if (!(var4 instanceof CCloseWindowPacket)) {
                                            if (!(var4 instanceof CClientStatusPacket)) {
                                                if (!(var4 instanceof CChatMessagePacket)) {
                                                    if (!(var4 instanceof CClientSettingsPacket)) {
                                                        if (!(var4 instanceof CKeepAlivePacket) && var4 instanceof CClickWindowPacket) {
                                                            CClickWindowPacket var5 = (CClickWindowPacket) var4;
                                                        }
                                                    } else {
                                                        CClientSettingsPacket var11 = (CClientSettingsPacket) var4;
                                                    }
                                                } else {
                                                    new CChatMessagePacket();
                                                }
                                            } else {
                                                CClientStatusPacket var12 = (CClientStatusPacket) var4;
                                                if (var12.getStatus() != CClientStatusPacketState.field14279) {
                                                }
                                            }
                                        }
                                    } else {
                                        CPlayerDiggingPacket var13 = (CPlayerDiggingPacket) var4;
                                        if (var13.getAction() != CPlayerDiggingPacket.Action.RELEASE_USE_ITEM) {
                                        }
                                    }
                                } else {
                                    CPlayerTryUseItemOnBlockPacket var14 = (CPlayerTryUseItemOnBlockPacket) var4;
                                }
                            }
                        } else {
                            CPlayerTryUseItemPacket var15 = (CPlayerTryUseItemPacket) var4;
                            if (var15.getHand() != Hand.field183) {
                            }
                        }
                    } else {
                        CHeldItemChangePacket var16 = (CHeldItemChangePacket) var4;
                    }
                } else {
                    CPlayerPacket var17 = (CPlayerPacket) var4;
                    double var8 = var17.getY(0.0);
                    String var10 = !var17.isOnGround() ? "§c" : "§a";
                    Class8906.method32487(var10 + var8);
                }
            } else {
                CUseEntityPacket var18 = (CUseEntityPacket) var4;
                Entity var6 = var18.getEntityFromWorld(mc.world);
                if (var6 != null) {
                    var6.getName().getString();
                } else {
                    String var10000 = "null";
                }

                if (var18.getAction() != CUseEntityPacket.Action.ATTACK) {
                }
            }

            if (!(var4 instanceof CPlayerPacket) && !(var4 instanceof CKeepAlivePacket) && var4 instanceof CConfirmTransactionPacket) {
            }
        }
    }

    @EventTarget
    public void method16559(RecievePacketEvent var1) {
        Packet var4 = var1.getPacket();
        if (this.isEnabled()) {
            if (!(var4 instanceof SEntityPacket)) {
            }

            if (!(var4 instanceof SKeepAlivePacket)) {
                if (!(var4 instanceof SConfirmTransactionPacket)) {
                    if (!(var4 instanceof SPlayerPositionLookPacket)) {
                        if (!(var4 instanceof SUpdateScorePacket)) {
                            if (!(var4 instanceof SDisplayObjectivePacket)) {
                                if (!(var4 instanceof STeamsPacket)) {
                                    if (!(var4 instanceof SEntityVelocityPacket)) {
                                        if (var4 instanceof SExplosionPacket && this.getBooleanValueFromSetttingName("Explosions")) {
                                            SExplosionPacket var5 = (SExplosionPacket) var1.getPacket();
                                        }
                                    } else {
                                        SEntityVelocityPacket var8 = (SEntityVelocityPacket) var1.getPacket();
                                        if (var8.method17565() != mc.player.getEntityId()) {
                                        }
                                    }
                                } else {
                                    STeamsPacket var9 = (STeamsPacket) var4;
                                    if (var9.method17525().startsWith("team_")) {
                                    }

                                    for (String var7 : var9.method17527()) {
                                        if (!var7.contains("§") && var7.length() < 2) {
                                        }
                                    }
                                }
                            } else {
                                SDisplayObjectivePacket var10 = (SDisplayObjectivePacket) var4;
                            }
                        } else {
                            SUpdateScorePacket var11 = (SUpdateScorePacket) var4;
                        }
                    } else {
                        SPlayerPositionLookPacket var12 = (SPlayerPositionLookPacket) var4;
                    }
                } else {
                    SConfirmTransactionPacket var13 = (SConfirmTransactionPacket) var4;
                }
            } else {
                SKeepAlivePacket var14 = (SKeepAlivePacket) var4;
            }

            ArrayList var15 = new ArrayList<Class>(
                    Arrays.asList(
                            SKeepAlivePacket.class,
                            SConfirmTransactionPacket.class,
                            SPlayerPositionLookPacket.class,
                            SEntityEquipmentPacket.class,
                            SSpawnParticlePacket.class,
                            SMultiBlockChangePacket.class,
                            SChatPacket.class,
                            SEntityHeadLookPacket.class,
                            SEntityVelocityPacket.class
                    )
            );
            if (var15.contains(var4.getClass())) {
            }

            if (!(var4 instanceof SUpdateBossInfoPacket)) {
            }
        }
    }

    public List<Entity> method16560(float var1) {
        List var4 = ColorUtils.method17708();
        Iterator var5 = var4.iterator();

        while (var5.hasNext()) {
            Entity var6 = (Entity) var5.next();
            if (var6 != mc.player) {
                if (!Client.getInstance().getFriendManager().method26997(var6)) {
                    if (var6 instanceof LivingEntity) {
                        if (((LivingEntity) var6).getHealth() != 0.0F) {
                            if (!(mc.player.method3275(var6) > var1)) {
                                if (mc.player.method3026((LivingEntity) var6)) {
                                    if (!(var6 instanceof ArmorStandEntity) && !(var6 instanceof PlayerEntity)) {
                                        if (var6 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var6)) {
                                            var5.remove();
                                        } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var6)) {
                                            var5.remove();
                                        } else if (!var6.method3362()) {
                                            if (var6 instanceof PlayerEntity && Class8781.method31662((PlayerEntity) var6)) {
                                                var5.remove();
                                            }
                                        } else {
                                            var5.remove();
                                        }
                                    } else {
                                        var5.remove();
                                    }
                                } else {
                                    var5.remove();
                                }
                            } else {
                                var5.remove();
                            }
                        } else {
                            var5.remove();
                        }
                    } else {
                        var5.remove();
                    }
                } else {
                    var5.remove();
                }
            } else {
                var5.remove();
            }
        }

        Collections.sort(var4, new Class3597(this));
        return var4;
    }

    public Entity method16561(float var1) {
        List var4 = ColorUtils.method17708();
        Entity var5 = null;
        Iterator var6 = var4.iterator();

        while (var6.hasNext()) {
            Entity var7 = (Entity) var6.next();
            if (var7 != mc.player) {
                if (!Client.getInstance().getFriendManager().method26997(var7)) {
                    if (var7 instanceof LivingEntity) {
                        if (((LivingEntity) var7).getHealth() != 0.0F) {
                            if (!(mc.player.method3275(var7) > var1)) {
                                if (mc.player.method3026((LivingEntity) var7)) {
                                    if (!(var7 instanceof ArmorStandEntity)) {
                                        if (var7 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var7)) {
                                            var6.remove();
                                        } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var7)) {
                                            var6.remove();
                                        } else if (!var7.method3362()) {
                                            if (var5 == null || mc.player.method3275(var7) < mc.player.method3275(var5)) {
                                                var5 = var7;
                                            }
                                        } else {
                                            var6.remove();
                                        }
                                    } else {
                                        var6.remove();
                                    }
                                } else {
                                    var6.remove();
                                }
                            } else {
                                var6.remove();
                            }
                        } else {
                            var6.remove();
                        }
                    } else {
                        var6.remove();
                    }
                } else {
                    var6.remove();
                }
            } else {
                var6.remove();
            }
        }

        return var5;
    }

    private double method16564(double var1, double var3) {
        return var1 + Math.random() * (var3 - var1);
    }
}
