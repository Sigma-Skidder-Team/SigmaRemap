package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.client.CInputPacket;
import net.minecraft.network.play.client.CMoveVehiclePacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.client.CSteerBoatPacket;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class InfiniteAura extends Module {
    private int field23897;
    private boolean field23898;
    private float field23899;
    private final List<List<Class8472>> field23900;
    private Thread field23901;

    public InfiniteAura() {
        super(ModuleCategory.COMBAT, "InfiniteAura", "Basically infinite aura");
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 8.0F, 120.0F, 1.0F));
        this.registerSetting(new NumberSetting<Float>("CPS", "CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F));
        this.registerSetting(new NumberSetting<Float>("Targets", "Number of targets", 4.0F, Float.class, 1.0F, 10.0F, 1.0F));
        this.registerSetting(new BooleanSetting("Players", "Hit players", true));
        this.registerSetting(new BooleanSetting("Animals/Monsters", "Hit animals and monsters", false));
        this.registerSetting(new BooleanSetting("Anti-Bot", "Doesn't hit bots", true));
        this.registerSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
        this.registerSetting(new BooleanSetting("No Swing", "Doesn't swing", false));
        this.field23900 = new ArrayList<List<Class8472>>();
    }

    // $VF: synthetic method
    public static Minecraft method16778() {
        return mc;
    }

    // $VF: synthetic method
    public static Minecraft method16779() {
        return mc;
    }

    @Override
    public void onEnable() {
        this.field23898 = false;
        this.field23897 = (int) (20.0F / this.method16004().getNumberValueBySettingName("CPS"));
        this.field23899 = (float) this.field23897;
    }

    @Override
    public void onDisable() {
        this.field23900.clear();
        this.field23898 = false;
        this.field23901 = null;
    }

    @EventTarget
    @LowerPriority
    public void method16772(TickEvent var1) {
        if (this.isEnabled()) {
            List<Class8012> var4 = this.method16775((float) ((int) this.getNumberValueBySettingName("Range")));
            if (var4 != null && var4.size() != 0) {
                if (this.field23899 < 1.0F) {
                    this.field23899 = this.field23899 + 20.0F / this.method16004().getNumberValueBySettingName("CPS");
                }

                this.field23897++;
                if (this.field23897 >= (int) this.field23899 && this.field23901 == null) {
                    this.field23897 = 0;
                    this.field23900.clear();
                    this.field23899 = this.field23899 - (float) ((int) this.field23899);
                    Entity var5 = mc.player.getRidingEntity() == null ? mc.player : mc.player.getRidingEntity();
                    this.field23901 = new Thread(() -> {
                        try {
                            int var5x = 0;

                            for (Class8012 var7 : var4) {
                                Entity var8 = var7.method27397();
                                if ((int) this.getNumberValueBySettingName("Targets") < ++var5x) {
                                    break;
                                }

                                Class8472 var9 = new Class8472(var5.getPosX(), var5.getPosY(), var5.getPosZ());
                                Class8472 var10 = new Class8472(var8.getPosX(), var8.getPosY(), var8.getPosZ());
                                ArrayList var11 = Class8901.method32447(var10, var9);
                                this.field23900.add(var11);
                                Collections.reverse(var11);
                                this.method16773(var11, Client.getInstance().getModuleManager().getModuleByClass(Criticals.class).isEnabled());
                                ColorUtils.method17735(var8, !this.getBooleanValueFromSetttingName("No Swing"));
                                Collections.reverse(var11);
                                this.method16773(var11, false);
                            }
                        } catch (Exception var12) {
                            this.field23901 = null;
                        }

                        this.field23901 = null;
                    });
                    this.field23901.start();
                }
            } else {
                this.field23898 = false;
                this.field23900.clear();
            }
        }
    }

    public void method16773(List<Class8472> var1, boolean var2) {
        Entity var5 = mc.player.getRidingEntity();
        Class8472 var6 = null;

        for (Class8472 var8 : var1) {
            var6 = var8;
            if (var5 == null) {
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var8.method29876(), var8.method29877(), var8.method29878(), true));
            } else {
                var5.positionVec.x = var8.method29876() + 0.5;
                var5.positionVec.y = var8.method29877();
                var5.positionVec.z = var8.method29878() + 0.5;
                mc.getConnection().sendPacket(new CSteerBoatPacket(false, false));
                mc.getConnection().sendPacket(new CPlayerPacket.RotationPacket(mc.player.rotationYaw, mc.player.rotationPitch, false));
                mc.getConnection().sendPacket(new CInputPacket(0.0F, 1.0F, false, false));
                BoatEntity var9 = new BoatEntity(mc.world, var8.method29876() + 0.5, var8.method29877(), var8.method29878() + 0.5);
                var9.rotationYaw = var5.rotationYaw;
                var9.rotationPitch = var5.rotationPitch;
                mc.getConnection().sendPacket(new CMoveVehiclePacket(var9));
            }
        }

        if (var2 && var6 != null) {
            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var6.method29876(), var6.method29877() + 1.0E-14, var6.method29878(), false));
            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var6.method29876(), var6.method29877(), var6.method29878(), false));
        }
    }

    @EventTarget
    public void method16774(Render3DEvent var1) {
        if (this.isEnabled() && this.field23900 != null && this.field23900.size() != 0) {
            for (List<Class8472> var5 : this.field23900) {
                GL11.glPushMatrix();
                GL11.glEnable(2848);
                GL11.glBlendFunc(770, 771);
                GL11.glEnable(3042);
                GL11.glDisable(3553);
                GL11.glDisable(2929);
                GL11.glEnable(32925);
                GL11.glLineWidth(1.4F);
                GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
                GL11.glBegin(3);

                for (Class8472 var7 : var5) {
                    GL11.glVertex3d(
                            var7.method29876() - mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                            var7.method29877() - mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                            var7.method29878() - mc.gameRenderer.getActiveRenderInfo().getPos().getZ()
                    );
                }

                GL11.glEnd();
                GL11.glPushMatrix();
                GL11.glTranslated(
                        mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                        mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                        mc.gameRenderer.getActiveRenderInfo().getPos().getZ()
                );
                GL11.glPopMatrix();
                GL11.glDisable(3042);
                GL11.glEnable(3553);
                GL11.glEnable(2929);
                GL11.glDisable(32925);
                GL11.glDisable(2848);
                GL11.glPopMatrix();
            }
        }
    }

    public List<Class8012> method16775(float var1) {
        ArrayList var4 = new ArrayList();

        for (Entity var6 : ColorUtils.method17708()) {
            var4.add(new Class8012(var6));
        }

        Iterator var7 = var4.iterator();

        while (var7.hasNext()) {
            Entity var8 = ((Class8012) var7.next()).method27397();
            if (var8 != mc.player) {
                if (!Client.getInstance().getFriendManager().method26997(var8)) {
                    if (var8 instanceof LivingEntity) {
                        if (((LivingEntity) var8).getHealth() != 0.0F) {
                            if (!(mc.player.method3275(var8) > var1)) {
                                if (mc.player.method3026((LivingEntity) var8)) {
                                    if (!(var8 instanceof ArmorStandEntity)) {
                                        if (!this.getBooleanValueFromSetttingName("Players") && var8 instanceof PlayerEntity) {
                                            var7.remove();
                                        } else if (var8 instanceof PlayerEntity && Client.getInstance().getCombatManager().method29346(var8)) {
                                            var7.remove();
                                        } else if (!this.getBooleanValueFromSetttingName("Invisible") && var8.method3342()) {
                                            var7.remove();
                                        } else if (!this.getBooleanValueFromSetttingName("Animals/Monsters") && !(var8 instanceof PlayerEntity)) {
                                            var7.remove();
                                        } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var8)) {
                                            var7.remove();
                                        } else if (!var8.method3362()) {
                                            if (var8 instanceof PlayerEntity
                                                    && Class8781.method31662((PlayerEntity) var8)
                                                    && Client.getInstance().getModuleManager().getModuleByClass(Teams.class).isEnabled()) {
                                                var7.remove();
                                            }
                                        } else {
                                            var7.remove();
                                        }
                                    } else {
                                        var7.remove();
                                    }
                                } else {
                                    var7.remove();
                                }
                            } else {
                                var7.remove();
                            }
                        } else {
                            var7.remove();
                        }
                    } else {
                        var7.remove();
                    }
                } else {
                    var7.remove();
                }
            } else {
                var7.remove();
            }
        }

        Collections.sort(var4, new Class3595(this));
        return var4;
    }

    public boolean method16776() {
        return this.field23898
                && Minecraft.getInstance().player.getHeldItemMainhand() != null
                && Minecraft.getInstance().player.getHeldItemMainhand().getItem() instanceof ItemSword;
    }

    @Override
    public boolean method15988() {
        return this.isEnabled() && this.method16776() && Client.getInstance().method19939().isalive();
    }
}
