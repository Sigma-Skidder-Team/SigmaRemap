package com.mentalfrostbyte.jello.module.impl.world;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;

import java.util.List;

public class FightBot extends Module {
    public Entity targetEntity;
    public Vector3d targetPosition;

    public FightBot() {
        super(ModuleCategory.WORLD, "FightBot", "Jello AI Fight Bot");
    }

    @EventTarget
    public void onTick(TickEvent var1) {
        if (this.isEnabled()) {
            this.updateTarget();
            if (this.targetEntity != null) {
                
            }
        }
    }

    private void updateTarget() {
        List<Entity> potentialTargets = this.findEntities();
        if (!potentialTargets.isEmpty()) {
            this.targetEntity = potentialTargets.get(0);
            this.targetPosition = this.targetEntity.getPositionVec();
        } else {
            this.targetEntity = null;
        }
    }

    private List<Entity> findEntities() {
        List<Entity> entities = Lists.newArrayList(mc.world.getEntities());
        entities.remove(mc.player);

        entities.removeIf(entity -> !(entity instanceof PlayerEntity) || !Client.getInstance().getCombatManager().isValidTarget(entity));

        List<Entity> validTargets = BlockUtil.getVisibleEntities(entities);
        return validTargets.size() <= 1 ? validTargets : validTargets.subList(0, Math.min(3, validTargets.size() - 1));
    }
}
