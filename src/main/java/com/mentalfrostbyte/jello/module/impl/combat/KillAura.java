package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowestPriority;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.Jesus;
import com.mentalfrostbyte.jello.module.impl.movement.Speed;
import com.mentalfrostbyte.jello.module.impl.movement.Step;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ColorSetting;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.util.ClientColors;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import com.mentalfrostbyte.jello.util.player.Rots;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mojang.blaze3d.systems.RenderSystem;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.SwordItem;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SEntityPacket;
import net.minecraft.network.play.server.SEntityStatusPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.EntityRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class KillAura extends Module {
    public static boolean criticalSpoofActive = false;
    public static int attackDelayTicks;

    public static List<TimedEntity> targets;
    public static TimedEntity timedTarget;
    public static Entity target;

    public static InteractAutoBlock autoblockController;
    public static Rotations previousRotations = new Rotations(0.0F, 0.0F);
    private Rotations aimRotations;
    private Rotations renderRotations;

    public HashMap<Entity, Animation> espAnimationsByEntity = new HashMap<>();

    private int attackTickCounter;
    private int criticalSpoofState;
    private int groundedTicks;
    private int targetIndex;
    private int lastHotbarSlot;
    private int stopUseItemBlockTicks;
    private int reblockCountdownTicks;
    private int testModeHitCounter;
    private float aacRotationDurationTicks;
    private float aacRotationProgressTicks;
    private boolean aacUseAlternateCurve;
    private float testModeYawVelocity;
    private double[] hypixelSpoofPosition;

    public KillAura() {
        super(ModuleCategory.COMBAT, "KillAura", "Automatically attacks entities");
        this.registerSetting(new ModeSetting("Mode", "Mode", 0, "Single", "Switch", "Multi", "Multi2"));
        this.registerSetting(
                new ModeSetting("Autoblock Mode", "Autoblock Mode", 0, "None", "NCP", "Basic1", "Basic2", "Vanilla"));
        this.registerSetting(
                new ModeSetting("Sort Mode", "Sort Mode", 0, "Range", "Health", "Angle", "Armor", "Prev Range"));
        this.registerSetting(
                new ModeSetting("Attack Mode", "Attacks after or before sending the movement", 0, "Pre", "Post"));
        this.registerSetting(new ModeSetting("Rotation Mode", "The way you will look at entities", 0, "NCP", "AAC",
                "Smooth", "LockView", "Test", "Test2", "None"));
        this.registerSetting(new NumberSetting<Float>("Range", "Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.01F));
        this.registerSetting(
                new NumberSetting<Float>("Block Range", "Block Range value", 4.0F, Float.class, 2.8F, 8.0F, 0.2F));
        this.registerSetting(
                new NumberSetting<Float>("Min CPS", "Min CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F)
                        .addObserver(var1 -> this.autoblockController.method36818()));
        this.registerSetting(
                new NumberSetting<Float>("Max CPS", "Max CPS value", 8.0F, Float.class, 1.0F, 20.0F, 1.0F)
                        .addObserver(var1 -> this.autoblockController.method36818()));
        this.registerSetting(
                new NumberSetting<Float>("Hit box expand", "Hit Box expand", 0.05F, Float.class, 0.0F, 1.0F, 0.01F));
        this.registerSetting(
                new NumberSetting<Float>("Hit Chance", "Hit Chance", 100.0F, Float.class, 25.0F, 100.0F, 1.0F));
        this.registerSetting(new BooleanSetting("Interact autoblock", "Send interact packet when blocking", true));
        this.registerSetting(new BooleanSetting("Players", "Hit players", true));
        this.registerSetting(new BooleanSetting("Animals", "Hit animals", false));
        this.registerSetting(new BooleanSetting("Monsters", "Hit monsters", false));
        this.registerSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
        this.registerSetting(new BooleanSetting("Raytrace", "Helps the aura become more legit", true));
        this.registerSetting(new BooleanSetting("Cooldown", "Use attack cooldown (1.9+)", false));
        this.registerSetting(new BooleanSetting("No swing", "Hit without swinging", false));
        this.registerSetting(new BooleanSetting("Disable on death", "Disable on death", true));
        this.registerSetting(new BooleanSetting("Through walls", "Target entities through walls", true));
        this.registerSetting(
                new BooleanSetting("Smart Reach", "Allows you to get more reach (depends on your ping)", true));
        this.registerSetting(new BooleanSetting("Silent", "Silent rotations", true));
        this.registerSetting(new BooleanSetting("ESP", "ESP on targets", true));
        this.registerSetting(
                new ColorSetting("ESP Color", "The render color", ClientColors.LIGHT_GREYISH_BLUE.getColor()));
    }

    public static Rotations getRenderRotations(KillAura killaura) {
        return killaura.renderRotations;
    }

    public static Rotations getAimRotations(KillAura killaura) {
        return killaura.aimRotations;
    }

    public static int getTargetIndex(KillAura killaura) {
        return killaura.targetIndex;
    }

    public static int setTargetIndex(KillAura killaura, int var1) {
        return killaura.targetIndex = var1;
    }

    @Override
    public void initialize() {
        targets = new ArrayList<>();
        autoblockController = new InteractAutoBlock(this);
        super.initialize();
    }

    @Override
    public void onEnable() {
        targets = new ArrayList<>();
        target = null;
        timedTarget = null;
        this.attackTickCounter = (int) autoblockController.method36819(0);
        this.criticalSpoofState = 0;
        this.targetIndex = 0;
        attackDelayTicks = 0;
        this.renderRotations = new Rotations(mc.player.lastReportedYaw, mc.player.lastReportedPitch);
        this.aimRotations = new Rotations(mc.player.rotationYaw, mc.player.rotationPitch);
        previousRotations = new Rotations(mc.player.rotationYaw, mc.player.rotationPitch);
        this.aacRotationProgressTicks = -1.0F;
        autoblockController.setBlocking(mc.player.getHeldItem(Hand.MAIN_HAND).getItem() instanceof SwordItem
                && mc.gameSettings.keyBindUseItem.isKeyDown());
        this.aacUseAlternateCurve = false;
        this.reblockCountdownTicks = -1;
        autoblockController.field44349.clear();
        this.espAnimationsByEntity.clear();
        if (mc.player.onGround) {
            this.groundedTicks = 1;
        }

        super.onEnable();
    }

    @Override
    public void onDisable() {
        Rots.rotating = false;
        target = null;
        timedTarget = null;
        targets = null;
        criticalSpoofActive = false;
        super.onDisable();
    }

    @EventTarget
    public void onWorldChange(WorldLoadEvent event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Disable on death")) {
            Client.getInstance().notificationManager.send(new Notification("Aura", "Aura disabled due to respawn"));
            this.toggle();
        }
    }

    @EventTarget
    public void onTick(TickEvent event) {
        if (!this.isEnabled()) {
            return;
        }

        if (this.aacRotationProgressTicks != -1.0F) {
            this.aacRotationProgressTicks++;
        }

        if (this.getBooleanValueFromSettingName("Disable on death") && !mc.player.isAlive()) {
            this.toggle();
            Client.getInstance().notificationManager.send(new Notification("Aura", "Aura disabled due to death"));
        }
    }

    @EventTarget
    public void onStopuseItem(StopUseItemEvent event) {
        if (!this.isEnabled()) {
            return;
        }

        if (!this.getStringSettingValueByName("Autoblock Mode").equals("None")
                && (mc.player.getHeldItemMainhand().getItem() instanceof SwordItem
                || this.lastHotbarSlot != mc.player.inventory.currentItem)
                && target != null) {
            event.setCancelled(true);
            return;
        }

        if (mc.player.getHeldItemMainhand().getItem() instanceof SwordItem) {
            this.stopUseItemBlockTicks = 2;
        }
    }

    @EventTarget
    @LowestPriority
    public void onUpdate(EventUpdate event) {
        if (!this.isEnabled() || mc.player == null) {
            return;
        }

        if (!event.isPre()) {
            this.lastHotbarSlot = mc.player.inventory.currentItem;

            if (target != null && autoblockController.canBlock() && this.aimRotations != null) {
                autoblockController.block(target, this.aimRotations.yaw, this.aimRotations.pitch);
            }
            return;
        }

        if (this.stopUseItemBlockTicks > 0) {
            this.stopUseItemBlockTicks--;
        }

        if (target != null && autoblockController.isBlocking() && MovementUtil.isMoving()
                && this.getStringSettingValueByName("Autoblock Mode").equals("NCP")) {
            autoblockController.method36816();
        }

        if (autoblockController.isBlocking()
                && (!(mc.player.getHeldItemMainhand().getItem() instanceof SwordItem) || target == null)) {
            autoblockController.setBlocking(false);
        }

        if (this.reblockCountdownTicks >= 0) {
            if (this.reblockCountdownTicks == 0) {
                autoblockController.method36816();
                autoblockController.setBlocking(true);
            }
            this.reblockCountdownTicks--;
        }

        this.updateTargetsAndState();

        if (targets == null || targets.isEmpty()) {
            return;
        }

        this.attackTickCounter++;

        var hitboxExpand = this.getNumberValueBySettingName("Hit box expand");
        var criticals = (ModuleWithModuleSettings) Client.getInstance().moduleManager.getModuleByClass(Criticals.class);

        if (criticals.isEnabled() && criticals.getStringSettingValueByName("Type").equalsIgnoreCase("Minis")) {
            this.applyCriticalsSpoof(event,
                    criticals.method16726().getStringSettingValueByName("Mode"),
                    criticals.method16726().getBooleanValueFromSettingName("Avoid Fall Damage"));
        }

        this.updateAimRotations();

        if (event.getYaw() - mc.player.rotationYaw != 0.0F) {
            this.aimRotations.yaw = event.getYaw();
            this.aimRotations.pitch = event.getPitch();
        }

        if (target != null) {
            Rots.prevYaw = this.aimRotations.yaw;
            Rots.prevPitch = this.aimRotations.pitch;

            event.setYaw(this.aimRotations.yaw);
            event.setPitch(this.aimRotations.pitch);

            Rots.yaw = this.aimRotations.yaw;
            Rots.pitch = this.aimRotations.pitch;

            mc.player.rotationYawHead = event.getYaw();
            mc.player.renderYawOffset = event.getYaw();
        }

        var canAttackNow = autoblockController.canAttack(this.attackTickCounter);

        var cooledAttack = !((double) mc.player.method2973() < 1.26) && this.getBooleanValueFromSettingName("Cooldown")
                ? mc.player.getCooledAttackStrength(0.0F)
                : 1.0F;

        var shouldAttack = attackDelayTicks == 0 && canAttackNow && cooledAttack >= 1.0F;

        if (canAttackNow) {
            autoblockController.setupDelay();
        }

        if (shouldAttack) {
            KillAuraAttackLambda attack = new KillAuraAttackLambda(this, hitboxExpand);
            var isPre = this.getStringSettingValueByName("Attack Mode").equals("Pre");

            if (!isPre) {
                event.attackPost(attack);
            } else {
                attack.run();
            }

            this.attackTickCounter = 0;
        }

        if (attackDelayTicks > 0) {
            attackDelayTicks--;
        }
    }

    @EventTarget
    public void on2D(EventRender event) {
        if (timedTarget == null
                || this.getBooleanValueFromSettingName("Silent")
                || this.getStringSettingValueByName("Rotation Mode").equals("None")) {
            return;
        }

        var yaw = MathHelper.wrapDegrees(
                this.renderRotations.yaw + (this.aimRotations.yaw - this.renderRotations.yaw) * mc.getRenderPartialTicks());
        var pitch = MathHelper.wrapDegrees(
                this.renderRotations.pitch + (this.aimRotations.pitch - this.renderRotations.pitch) * mc.getRenderPartialTicks());

        mc.player.rotationYaw = yaw;
        mc.player.rotationPitch = pitch;
    }

    @EventTarget
    public void on3D(EventRender3D event) {
        if (targets != null) {
            var iterator = this.espAnimationsByEntity.entrySet().iterator();

            while (iterator.hasNext()) {
                var entry = iterator.next();

                entry.getValue().changeDirection(Animation.Direction.BACKWARDS);
                if (entry.getValue().calcPercent() == 0.0F) {
                    iterator.remove();
                }
            }

            for (var target : targets) {
                if (target != null) {
                    if (!this.espAnimationsByEntity.containsKey(target.getEntity())) {
                        this.espAnimationsByEntity.put(target.getEntity(), new Animation(250, 250));
                    } else {
                        this.espAnimationsByEntity.get(target.getEntity()).changeDirection(Animation.Direction.FORWARDS);
                    }
                }
            }

            for (var entry : this.espAnimationsByEntity.entrySet()) {
                this.drawTargetIndicatorRing(entry.getKey());
            }
        }
    }

    @EventTarget
    public void onReceivePacket(ReceivePacketEvent event) {
        IPacket<?> packet = event.getPacket();

        if (packet instanceof SEntityStatusPacket status) {
            if (status.getOpCode() == 3) {
                autoblockController.field44349.remove(status.getEntity(mc.world));
            }
            return;
        }

        if (!(packet instanceof SEntityPacket entityPacket)) {
            return;
        }

        if (!entityPacket.func_229745_h_() || (entityPacket.posX == 0 && entityPacket.posY == 0 && entityPacket.posZ == 0)) {
            return;
        }

        for (var entry : autoblockController.field44349.entrySet()) {
            var tracked = entry.getKey();
            var samples = entry.getValue();

            if (entityPacket.getEntity(mc.world) == tracked) {
                var motion = tracked.field_242272_av.scale(2.4414062E-4F);
                samples.add(new Class9629<>(motion, System.currentTimeMillis()));
            }
        }
    }

    public void drawTargetIndicatorRing(Entity target) {
        GL11.glPushMatrix();
        GL11.glEnable(2848);
        GL11.glDisable(3553);
        GL11.glEnable(32925);
        GL11.glEnable(2929);
        GL11.glLineWidth(1.4F);

        double tickDelta = Minecraft.getInstance().timer.renderPartialTicks;
        if (!target.isAlive()) {
            tickDelta = 0.0;
        }

        GL11.glTranslated(
                target.lastTickPosX + (target.getPosX() - target.lastTickPosX) * tickDelta,
                target.lastTickPosY + (target.getPosY() - target.lastTickPosY) * tickDelta,
                target.lastTickPosZ + (target.getPosZ() - target.lastTickPosZ) * tickDelta);
        GL11.glTranslated(
                -mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                -mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                -mc.gameRenderer.getActiveRenderInfo().getPos().getZ());
        GL11.glEnable(32823);
        GL11.glEnable(3008);
        GL11.glEnable(3042);
        GL11.glAlphaFunc(519, 0.0F);

        long animationPeriodMs = 1800;
        float phase = (float) (System.currentTimeMillis() % animationPeriodMs) / (float) animationPeriodMs;
        boolean reverseGradient = phase > 0.5F;

        phase = !reverseGradient ? phase * 2.0F : 1.0F - phase * 2.0F % 1.0F;

        GL11.glTranslatef(0.0F, (target.getHeight() + 0.4F) * phase, 0.0F);
        float pulse = (float) Math.sin((double) phase * Math.PI);
        this.drawAnimatedRing(reverseGradient, 0.45F * pulse, 0.6F, 0.35F * pulse, this.espAnimationsByEntity.get(target).calcPercent());
        GL11.glPushMatrix();
        GL11.glTranslated(
                mc.gameRenderer.getActiveRenderInfo().getPos().getX(),
                mc.gameRenderer.getActiveRenderInfo().getPos().getY(),
                mc.gameRenderer.getActiveRenderInfo().getPos().getZ());
        GL11.glPopMatrix();
        GL11.glEnable(3553);
        GL11.glDisable(32925);
        GL11.glDisable(2848);
        GL11.glPopMatrix();
    }

    public void drawAnimatedRing(boolean reverseGradient, float ringHeight, float ringRadius, float ringAlphaScale, float progressAlpha) {
        RenderSystem.shadeModel(7425);
        GL11.glDisable(32823);
        GL11.glDisable(2929);
        GL11.glBegin(5);
        int angleStep = (int) (360.0F / (40.0F * ringRadius));
        Color baseColor = new Color(this.parseSettingValueToIntBySettingName("ESP Color"));
        float red = (float) baseColor.getRed() / 255.0F;
        float green = (float) baseColor.getGreen() / 255.0F;
        float blue = (float) baseColor.getBlue() / 255.0F;

        for (int angle = 0; angle <= 360 + angleStep; angle += angleStep) {
            int clampedAngle = angle;
            if (angle > 360) {
                clampedAngle = 0;
            }

            double x = Math.sin((double) clampedAngle * Math.PI / 180.0) * (double) ringRadius;
            double z = Math.cos((double) clampedAngle * Math.PI / 180.0) * (double) ringRadius;
            GL11.glColor4f(red, green, blue, !reverseGradient ? 0.0F : ringAlphaScale * progressAlpha);
            GL11.glVertex3d(x, 0.0, z);
            GL11.glColor4f(red, green, blue, reverseGradient ? 0.0F : ringAlphaScale * progressAlpha);
            GL11.glVertex3d(x, ringHeight, z);
        }

        GL11.glEnd();
        GL11.glLineWidth(2.2F);
        GL11.glBegin(3);

        for (int angle = 0; angle <= 360 + angleStep; angle += angleStep) {
            int clampedAngle = angle;
            if (angle > 360) {
                clampedAngle = 0;
            }

            double x = Math.sin((double) clampedAngle * Math.PI / 180.0) * (double) ringRadius;
            double z = Math.cos((double) clampedAngle * Math.PI / 180.0) * (double) ringRadius;
            GL11.glColor4f(red, green, blue, (0.5F + 0.5F * ringAlphaScale) * progressAlpha);
            GL11.glVertex3d(x, !reverseGradient ? (double) ringHeight : 0.0, z);
        }

        GL11.glEnd();
        GL11.glEnable(2929);
        RenderSystem.shadeModel(7424);
    }

    public boolean isAutoBlockEnabled() {
        return target != null
                && mc.player.getHeldItemMainhand() != null
                && mc.player.getHeldItemMainhand().getItem() instanceof SwordItem
                && !this.getStringSettingValueByName("Autoblock Mode").equals("None");
    }

    @Override
    public boolean isEnabled2() {
        return this.isEnabled() && this.isAutoBlockEnabled();
    }

    public void applyCriticalsSpoof(EventUpdate event, String serverMode, boolean avoidFallDamage) {
        double yOffset = !serverMode.equals("Hypixel") ? 0.0 : 1.0E-14;
        boolean onGroundFlag = true;

        if (this.criticalSpoofState == 0 && this.groundedTicks >= 1 && Step.field23887 > 1) {
            if (autoblockController.method36820(this.attackTickCounter)) {
                this.criticalSpoofState = 1;
                onGroundFlag = avoidFallDamage;
                yOffset = !serverMode.equals("Cubecraft") ? 0.0626 : MovementUtil.getJumpValue() / 10.0;
                this.hypixelSpoofPosition = new double[]{event.getX(), event.getY() + yOffset, event.getZ()};
            }
        } else if (this.criticalSpoofState == 1) {
            this.criticalSpoofState = 0;
            onGroundFlag = false;

            if (serverMode.equals("Hypixel") && this.hypixelSpoofPosition != null && mc.player.getMotion().y < 0.0) {
                mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(
                        this.hypixelSpoofPosition[0],
                        this.hypixelSpoofPosition[1],
                        this.hypixelSpoofPosition[2],
                        false
                ));
                this.hypixelSpoofPosition = null;
            }
        }

        boolean isGrounded = !Jesus.isWalkingOnLiquid()
                && (mc.player.onGround || MultiUtilities.isAboveBounds(mc.player, 0.001F));

        if (!isGrounded) {
            this.groundedTicks = 0;
            this.criticalSpoofState = 0;
            return;
        }

        this.groundedTicks++;

        var speed = Client.getInstance().moduleManager.getModuleByClass(Speed.class);
        var speedOk = !speed.isEnabled()
                || speed.getStringSettingValueByName("Type").equalsIgnoreCase("Cubecraft")
                || speed.getStringSettingValueByName("Type").equalsIgnoreCase("Vanilla");

        if (speedOk
                && mc.player.collidedVertically
                && isGrounded
                && !mc.player.isJumping
                && !mc.player.isInWater()
                && !mc.gameSettings.keyBindJump.isKeyDown()) {
            criticalSpoofActive = yOffset > 0.001;

            event.setY(mc.player.getPosY() + yOffset);
            event.setGround(onGroundFlag);
        }
    }

    private Entity selectAutoBlockTarget(List<TimedEntity> candidates) {
        candidates = autoblockController.sortEntities(candidates);

        return !candidates.isEmpty()
                && candidates.get(0).getEntity().getDistance(mc.player) <= this.getNumberValueBySettingName("Block Range")
                ? candidates.get(0).getEntity()
                : null;
    }

    private void updateTargetsAndState() {
        float blockRange = this.getNumberValueBySettingName("Block Range");
        float range = this.getNumberValueBySettingName("Range");
        String mode = this.getStringSettingValueByName("Mode");

        List<TimedEntity> inBlockOrAttackRange = autoblockController.method36823(Math.max(blockRange, range));
        inBlockOrAttackRange = autoblockController.sortEntities(inBlockOrAttackRange);

        if (this.aimRotations == null) {
            this.onEnable();
        }

        if (inBlockOrAttackRange != null && !inBlockOrAttackRange.isEmpty() && !mc.gameSettings.keyBindAttack.isPressed()) {
            target = this.selectAutoBlockTarget(inBlockOrAttackRange);

            List<TimedEntity> inAttackRange = autoblockController.method36823(range);
            if (mode.equals("Single") || mode.equals("Multi")) {
                inAttackRange = autoblockController.sortEntities(inAttackRange);
            }

            if (inAttackRange.isEmpty()) {
                timedTarget = null;
                if (targets != null) {
                    targets.clear();
                }

                this.attackTickCounter = (int) autoblockController.method36819(0);
                this.criticalSpoofState = 0;
                criticalSpoofActive = false;

                this.aimRotations.yaw = mc.player.rotationYaw;
                this.aimRotations.pitch = mc.player.rotationPitch;

                previousRotations.yaw = this.aimRotations.yaw;
                previousRotations.pitch = this.aimRotations.pitch;

                this.aacRotationProgressTicks = -1.0F;
                this.reblockCountdownTicks = -1;
                return;
            }

            if (this.aacRotationProgressTicks == -1.0F) {
                float targetYaw = RotationHelper.getRotationsToVector(
                        MultiUtilities.getBestVisiblePoint(inAttackRange.get(0).getEntity())).yaw;

                float yawDelta = Math.abs(MultiUtilities.getNormalizedAngleDelta(targetYaw, previousRotations.yaw));
                this.aacRotationDurationTicks = yawDelta * 1.95F / 50.0F;

                this.aacRotationProgressTicks++;
            }

            targets = inAttackRange;

            float primaryYaw = RotationHelper.getRotationsToVector(
                    MultiUtilities.getBestVisiblePoint(targets.get(0).getEntity())).yaw;

            if (!targets.isEmpty() & !mode.equals("Switch")) {
                if (timedTarget != null && timedTarget.getEntity() != targets.get(0).getEntity()) {
                    float yawDelta = Math.abs(MultiUtilities.getNormalizedAngleDelta(primaryYaw, previousRotations.yaw));
                    this.aacRotationDurationTicks = yawDelta * 1.95F / 50.0F;
                }
                timedTarget = targets.get(0);
            }

            if (!mode.equals("Switch")) {
                if (!mode.equals("Multi2")) {
                    if (mode.equals("Single")
                            && !targets.isEmpty()
                            && (timedTarget == null || timedTarget.getEntity() != targets.get(0).getEntity())) {
                        timedTarget = targets.get(0);
                    }
                } else {
                    if (this.targetIndex >= targets.size()) {
                        this.targetIndex = 0;
                    }
                    timedTarget = targets.get(this.targetIndex);
                }
            } else if ((timedTarget == null
                    || timedTarget.getTimer() == null
                    || timedTarget.isExpired()
                    || !targets.contains(timedTarget)
                    || mc.player.getDistance(timedTarget.getEntity()) > range)
                    && !targets.isEmpty()) {
                if (this.targetIndex + 1 < targets.size()) {
                    if (timedTarget != null
                            && !Client.getInstance().friendManager.isEnemy(targets.get(this.targetIndex).getEntity())) {
                        this.targetIndex++;
                    }
                } else {
                    this.targetIndex = 0;
                }

                Vector3d aimPoint = MultiUtilities.getBestVisiblePoint(targets.get(this.targetIndex).getEntity());
                float yawDelta = Math.abs(MultiUtilities.getNormalizedAngleDelta(
                        RotationHelper.getRotationsToVector(aimPoint).yaw,
                        previousRotations.yaw
                ));

                this.aacRotationDurationTicks = yawDelta * 1.95F / 50.0F;

                timedTarget = new TimedEntity(
                        targets.get(this.targetIndex).getEntity(),
                        new ExpirationTimer(!this.getStringSettingValueByName("Rotation Mode").equals("NCP") ? 500L : 270L)
                );
            }

            if (this.targetIndex >= targets.size()) {
                this.targetIndex = 0;
            }

            if (!mode.equals("Multi")) {
                targets.clear();
                targets.add(timedTarget);
            }

            return;
        }

        timedTarget = null;
        target = null;

        if (targets != null) {
            targets.clear();
        }

        this.attackTickCounter = (int) autoblockController.method36819(0);
        this.criticalSpoofState = 0;
        criticalSpoofActive = false;

        this.aimRotations.yaw = mc.player.rotationYaw;
        this.aimRotations.pitch = mc.player.rotationPitch;

        previousRotations.yaw = this.aimRotations.yaw;
        previousRotations.pitch = this.aimRotations.pitch;

        this.aacRotationProgressTicks = -1.0F;
        this.reblockCountdownTicks = -1;
    }

    private void updateAimRotations() {
        Entity targetEntity = KillAura.timedTarget.getEntity();
        Rotations targetRotations = RotationHelper.getRotationsToTarget(targetEntity, !this.getBooleanValueFromSettingName("Through walls"));

        if (targetRotations == null) {
            return;
        }

        float deltaYaw = RotationHelper.getWrappedAngleDelta(this.aimRotations.yaw, targetRotations.yaw);
        float deltaPitch = targetRotations.pitch - this.aimRotations.pitch;

        switch (this.getStringSettingValueByName("Rotation Mode")) {
            case "Test":
                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;

                if (Math.abs(deltaYaw) > 80.0F) {
                    float jitter = (float) this.randomBetween(-10.2, 10.2);
                    float step = deltaYaw * deltaYaw * 1.13F / 2.0F + jitter;
                    this.aimRotations.yaw += step;
                    this.testModeYawVelocity = step;
                } else if (Math.abs(deltaYaw) > 30.0F) {
                    float jitter = (float) this.randomBetween(-10.2, 10.2);
                    float step = deltaYaw * 1.03F / 2.0F + jitter;
                    this.aimRotations.yaw += step;
                    this.testModeYawVelocity = step;
                } else if (Math.abs(deltaYaw) > 10.0F) {
                    Entity raytracedEntity = MultiUtilities.getEntityFromRayTrace(
                            this.aimRotations.pitch,
                            this.aimRotations.yaw,
                            this.getNumberValueBySettingName("Range"),
                            this.getNumberValueBySettingName("Hit box expand")
                    );

                    double jitterRange = raytracedEntity == null ? 13.4 : 1.4;

                    this.testModeYawVelocity = (float) ((double) this.testModeYawVelocity * 0.5296666666666666);
                    if (Math.abs(deltaYaw) < 20.0F) {
                        this.testModeYawVelocity = deltaYaw * 0.5F;
                    }

                    this.aimRotations.yaw = this.aimRotations.yaw + deltaYaw + this.testModeYawVelocity
                            + (float) this.randomBetween(-jitterRange, jitterRange);
                } else {
                    this.testModeYawVelocity = (float) ((double) this.testModeYawVelocity * 0.05);
                    double jitterRange = 0.0;
                    this.aimRotations.yaw = this.aimRotations.yaw + this.testModeYawVelocity
                            + (float) this.randomBetween(-jitterRange, jitterRange);
                }

                if (mc.player.ticksExisted % 5 == 0) {
                    double jitter = 10.0;
                    this.aimRotations.yaw = this.aimRotations.yaw
                            + (float) this.randomBetween(-jitter, jitter) / (mc.player.getDistance(targetEntity) + 1.0F);
                    this.aimRotations.pitch = this.aimRotations.pitch
                            + (float) this.randomBetween(-jitter, jitter) / (mc.player.getDistance(targetEntity) + 1.0F);
                }

                if (Math.abs(deltaPitch) > 10.0F) {
                    this.aimRotations.pitch = (float) ((double) this.aimRotations.pitch + (double) deltaPitch * 0.81
                            + this.randomBetween(-2.0, 2.0));
                }

                Entity hit = MultiUtilities.getEntityFromRayTrace(
                        this.renderRotations.pitch,
                        this.renderRotations.yaw,
                        this.getNumberValueBySettingName("Range"),
                        this.getNumberValueBySettingName("Hit box expand")
                );

                if (hit != null && (double) this.testModeHitCounter > this.randomBetween(2.0, 5.0)) {
                    this.testModeHitCounter = 0;
                    MultiUtilities.attack(hit, true);
                }
                break;
            case "NCP":
                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;
                this.aimRotations = targetRotations;
                break;
            case "AAC":
                float progress = this.aacRotationProgressTicks / Math.max(1.0F, this.aacRotationDurationTicks);

                double motionX = targetEntity.getPosX() - targetEntity.lastTickPosX;
                double motionZ = targetEntity.getPosZ() - targetEntity.lastTickPosZ;
                float moveSpeed = (float) Math.sqrt(motionX * motionX + motionZ * motionZ);

                float yawLerp = MathUtils.lerp(progress, 0.57, -0.135, 0.095, -0.3);
                float pitchLerp = Math.min(1.0F, MathUtils.lerp(progress, 0.57, -0.135, 0.095, -0.3));

                if (this.aacUseAlternateCurve) {
                    yawLerp = MathUtils.lerp(progress, 0.18, 0.13, 1.0, 1.046);
                    pitchLerp = Math.min(1.0F, MathUtils.lerp(progress, 0.18, 0.13, 1.0, 1.04));
                }

                float yawDelta = MultiUtilities.getNormalizedAngleDelta(previousRotations.yaw, targetRotations.yaw);
                float pitchDelta = targetRotations.pitch - previousRotations.pitch;

                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;

                this.aimRotations.yaw = previousRotations.yaw + yawLerp * yawDelta;
                this.aimRotations.pitch = (previousRotations.pitch + pitchLerp * pitchDelta) % 90.0F;

                if (progress == 0.0F || progress >= 1.0F || (double) moveSpeed > 0.1 && this.aacRotationDurationTicks < 4.0F) {
                    float yawDistance = Math.abs(MultiUtilities.getNormalizedAngleDelta(targetRotations.yaw, previousRotations.yaw));
                    this.aacRotationDurationTicks = (float) Math.round(yawDistance * 1.8F / 50.0F);

                    this.aacRotationProgressTicks = 0.0F;

                    previousRotations.yaw = this.aimRotations.yaw;
                    previousRotations.pitch = this.aimRotations.pitch;
                }
                break;
            case "Smooth":
                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;
                this.aimRotations.yaw = (float) ((double) this.aimRotations.yaw + (double) (deltaYaw * 2.0F) / 5.0);
                this.aimRotations.pitch = (float) ((double) this.aimRotations.pitch + (double) (deltaPitch * 2.0F) / 5.0);
                break;
            case "None":
                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;
                this.aimRotations.yaw = mc.player.rotationYaw;
                this.aimRotations.pitch = mc.player.rotationPitch;
                break;
            case "LockView":
                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;

                EntityRayTraceResult ray = MultiUtilities.rayTraceEntities(
                        targetEntity,
                        this.aimRotations.yaw,
                        this.aimRotations.pitch,
                        var0 -> true,
                        this.getNumberValueBySettingName("Range")
                );

                if (ray == null || ray.getEntity() != targetEntity) {
                    this.aimRotations = targetRotations;
                }
                break;
            case "Test2":
                EntityRayTraceResult ray2 = MultiUtilities.rayTraceEntities(
                        targetEntity,
                        this.aimRotations.yaw,
                        this.aimRotations.pitch,
                        var0 -> true,
                        this.getNumberValueBySettingName("Range")
                );

                if (ray2 != null && ray2.getEntity() == targetEntity) {
                    this.renderRotations.yaw = this.aimRotations.yaw;
                    this.renderRotations.pitch = this.aimRotations.pitch;

                    this.aimRotations.yaw = (float) ((double) this.aimRotations.yaw + (Math.random() - 0.5) * 2.0
                            + (double) (deltaYaw / 10.0F));
                    this.aimRotations.pitch = (float) ((double) this.aimRotations.pitch + (Math.random() - 0.5) * 2.0
                            + (double) (deltaPitch / 10.0F));

                    this.aacRotationProgressTicks = 0.0F;
                    this.aacRotationDurationTicks = 3.0F;
                    return;
                }

                float progress2 = this.aacRotationProgressTicks / Math.max(1.0F, this.aacRotationDurationTicks);

                double motionX2 = targetEntity.getPosX() - targetEntity.lastTickPosX;
                double motionZ2 = targetEntity.getPosZ() - targetEntity.lastTickPosZ;
                float moveSpeed2 = (float) Math.sqrt(motionX2 * motionX2 + motionZ2 * motionZ2);

                float yawLerp2 = MathUtils.lerp(progress2, 0.57, -0.135, 0.095, -0.3);
                float pitchLerp2 = Math.min(1.0F, MathUtils.lerp(progress2, 0.57, -0.135, 0.095, -0.3));

                float yawDelta2 = MultiUtilities.getNormalizedAngleDelta(previousRotations.yaw, targetRotations.yaw);
                float pitchDelta2 = targetRotations.pitch - previousRotations.pitch;

                this.renderRotations.yaw = this.aimRotations.yaw;
                this.renderRotations.pitch = this.aimRotations.pitch;

                this.aimRotations.yaw = previousRotations.yaw + yawLerp2 * yawDelta2;
                this.aimRotations.pitch = (previousRotations.pitch + pitchLerp2 * pitchDelta2) % 90.0F;

                if (progress2 == 0.0F || progress2 >= 1.0F || (double) moveSpeed2 > 0.1 && this.aacRotationDurationTicks < 4.0F) {
                    float yawDistance2 = Math.abs(MultiUtilities.getNormalizedAngleDelta(targetRotations.yaw, previousRotations.yaw));
                    this.aacRotationDurationTicks = (float) Math.round(yawDistance2 * 1.8F / 50.0F);
                    if (this.aacRotationDurationTicks < 3.0F) {
                        this.aacRotationDurationTicks = 3.0F;
                    }

                    this.aacRotationProgressTicks = 0.0F;

                    if (mc.pointedEntity == null && progress2 != 1.0F) {
                    }

                    previousRotations.yaw = this.aimRotations.yaw;
                    previousRotations.pitch = this.aimRotations.pitch;
                }
                break;
        }
    }

    private double randomBetween(double min, double max) {
        return min + Math.random() * (max - min);
    }
}