package com.mentalfrostbyte.jello.module.impl.misc;

import com.google.common.collect.Lists;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.impl.world.FightBot;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.world.BlockUtil;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.vector.Vector3d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JelloAIBot extends Module {
    public static Entity targetEntity;
    public Vector3d targetPosition;
    public Thread calculationThread;
    public boolean isCalculating = false;
    private List<Class9510> pathToTarget;

    public JelloAIBot() {
        super(ModuleCategory.MISC, "JelloAIBot", "Experimental");
    }

    @Override
    public void onEnable() {
        Client.getInstance().getModuleManager().getModuleByClass(FightBot.class).setEnabled(true);
        super.onEnable();
    }

    @Override
    public void onDisable() {
        Client.getInstance().getModuleManager().getModuleByClass(FightBot.class).setEnabled(false);
        Client.getInstance().method19950().method31738();
        this.calculationThread = null;
    }

    public Entity findTarget() {
        ArrayList<Entity> entities = Lists.newArrayList(mc.world.getAllEntities());
        entities.remove(mc.player);
        Iterator<Entity> iterator = entities.iterator();

        while (iterator.hasNext()) {
            Entity entity = iterator.next();
            if (!(entity instanceof PlayerEntity) ||
                    Client.getInstance().getCombatManager().isTargetABot(entity) ||
                    !MultiUtilities.isAboveBounds(entity, 2.0F)) {
                iterator.remove();
            }
        }

        List<Entity> visibleEntities = BlockUtil.getVisibleEntities(entities);
        return visibleEntities.size() != 0 ? visibleEntities.get(0) : null;
    }

    public boolean isTargetFarEnough() {
        return this.targetEntity == null || this.targetEntity.positionVec.method11341(this.targetPosition) > 6.0;
    }

    @EventTarget
    public void onTick(TickEvent event) {
        if (mc.player != null) {
            if (mc.player.ticksExisted % 14 == 0) {
                Entity newTarget = this.findTarget();
                if (this.calculationThread == null &&
                        (this.pathToTarget == null || this.pathToTarget.isEmpty() ||
                                (newTarget != this.targetEntity || this.isTargetFarEnough()) && newTarget != null)) {
                    this.calculationThread = new Thread(() -> {
                        MultiUtilities.addChatMessage("calc");
                        this.isCalculating = true;

                        try {
                            Class9823 pathCalculator = new Class9823();
                            Class9510 playerPosition = new Class9510(new Class9110(mc.player.getPosition()));
                            Class7860 targetPosition = new Class7860(this.targetEntity = newTarget);
                            this.targetPosition = this.targetEntity.positionVec;
                            Class7267 pathRequest = new Class7267(playerPosition, targetPosition);
                            pathRequest.field31173 = true;
                            pathRequest.field31176 = 310;
                            pathRequest.field31170 = 20000;
                            pathRequest.field31174 = true;
                            pathRequest.field31175 = true;
                            this.pathToTarget = pathCalculator.method38776(pathRequest);
                            Client.getInstance().method19950().method31739(this.pathToTarget);
                            this.calculationThread = null;
                            MultiUtilities.addChatMessage("calc" + this.pathToTarget.size());
                        } catch (Exception e) {
                            e.printStackTrace();
                            this.calculationThread = null;
                        }
                    });
                    this.calculationThread.start();
                }
            }
        }
    }
}
