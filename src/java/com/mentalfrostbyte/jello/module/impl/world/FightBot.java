package com.mentalfrostbyte.jello.module.impl.world;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.module.impl.misc.JelloAIBot;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.RotationHelper;
import mapped.Rotations;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;

import java.util.List;

public class FightBot extends PremiumModule {
    public Entity targetEntity;

    public FightBot() {
        super(ModuleCategory.WORLD, "FightBot", "Jello AI Fight Bot");
    }

    private final TimerUtil timer = new TimerUtil();

    @Override
    public void onEnable() {
        timer.reset();
        super.onEnable();
    }

    @EventTarget
    public void onUpdate(EventUpdate event) {
        if (this.isEnabled() && !event.isPre()) {
            this.updateTarget();
            if (this.targetEntity != null) {
                Rotations rots = RotationHelper.getRotations(this.targetEntity, false);
                if (rots != null) {
                    float reachDistance = mc.playerController.getBlockReachDistance();

                    double distanceToTarget = mc.player.getDistance(this.targetEntity);
                    if (distanceToTarget <= reachDistance && mc.player.getCooledAttackStrength(0.5F) >= 1.0 && timer.getElapsedTime() > 90L) {
                        mc.player.rotationYaw = rots.yaw;
                        mc.player.rotationPitch = rots.pitch;
                        mc.playerController.attackEntity(mc.player, targetEntity);
                        mc.player.swingArm(Hand.MAIN_HAND);
                        timer.reset();
                    }
                }
            }
        }
    }

    private void updateTarget() {
        if (Client.getInstance().getModuleManager().getModuleByClass(JelloAIBot.class).isEnabled()) {
            if (!timer.isEnabled())
                timer.start();
            this.targetEntity = JelloAIBot.targetEntity;
        } else
            this.targetEntity = null;
    }

    private List<Entity> findEntities() {
        List<Entity> entities = Lists.newArrayList(mc.world.getAllEntities());
        entities.remove(mc.player);

        entities.removeIf(entity -> !(entity instanceof PlayerEntity) || !Client.getInstance().getCombatManager().isTargetABot(entity));

        List<Entity> validTargets = BlockUtil.getVisibleEntities(entities);
        return validTargets.size() <= 1 ? validTargets : validTargets.subList(0, Math.min(3, validTargets.size() - 1));
    }
}
