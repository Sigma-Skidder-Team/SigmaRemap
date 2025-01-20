package com.mentalfrostbyte.jello.module.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventFOV;
import com.mentalfrostbyte.jello.event.impl.EventRayTraceResult;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.BlockFly;
import com.mentalfrostbyte.jello.module.impl.movement.blockfly.BlockFlyAACMode;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import net.minecraft.entity.ai.attributes.Attributes;
import com.mentalfrostbyte.jello.util.player.MovementUtils;
import net.minecraft.entity.ai.attributes.ModifiableAttributeInstance;
import net.minecraft.item.Items;

public class AutoSprint extends Module {
    private final double[] TrackMotion = new double[]{0.0, 0.0};
    private boolean isSprinting;

    public AutoSprint() {
        super(ModuleCategory.PLAYER, "AutoSprint", "Sprints for you");
        this.registerSetting(new BooleanSetting("Keep Sprint", "Keep Sprinting after hitting a player", true));
    }

    @EventTarget
    public void TickEvent(TickEvent event) {
        if (this.isEnabled()) {
            ModuleWithModuleSettings getModule = (ModuleWithModuleSettings) Client.getInstance().moduleManager.getModuleByClass(BlockFly.class);
            Module BlockFly = getModule.parentModule;
            if (BlockFly == null || !BlockFly.isEnabled() || !(BlockFly instanceof BlockFlyAACMode) || BlockFly.getBooleanValueFromSettingName("Haphe (AACAP)")) {
                mc.player.setSprinting(mc.player.moveForward > 0.0F && !((BlockFly) Client.getInstance().moduleManager.getModuleByClass(BlockFly.class)).method16732());
            }
        }
    }

    @EventTarget
    public void sigma(EventFOV event) {
        if (this.isEnabled()
                && !(mc.player.moveForward <= 0.0F)
                && (!mc.player.isHandActive() || mc.player.getActiveItemStack().getItem() != Items.BOW)
                && !((BlockFly) Client.getInstance().moduleManager.getModuleByClass(BlockFly.class)).method16732()) {
            ModifiableAttributeInstance getAttribute = mc.player.getAttribute(Attributes.MOVEMENT_SPEED);
            float BlockFly = (float) (
                    (getAttribute.getBaseValue() + 0.03F + (double) (0.015F * (float) MovementUtils.getSpeedBoost())) / (double) mc.player.abilities.getWalkSpeed() + 1.0
            )
                    / 2.0F;
            event.fovModifier = BlockFly;
        }
    }

    @EventTarget
    public void RayTraceEvent(EventRayTraceResult event) {
        if (this.isEnabled() && this.getBooleanValueFromSettingName("Keep Sprint")) {
            if (!event.isHovering()) {
                if (this.TrackMotion.length == 2) {
                    double MotionX = this.TrackMotion[0] - mc.player.getMotion().x;
                    double MotionZ = this.TrackMotion[1] - mc.player.getMotion().z;
                    if (MotionX != 0.0 || MotionZ != 0.0) {
                        mc.player.setMotion(this.TrackMotion[0], mc.player.getMotion().y, this.TrackMotion[1]);
                    }
                     // if the player should be sprinting but isnt start sprinting
                    if (this.isSprinting && !mc.player.isSprinting()) {
                        mc.player.setSprinting(true);
                    }
                }
            } else {
                this.TrackMotion[0] = mc.player.getMotion().x;
                this.TrackMotion[1] = mc.player.getMotion().z;
                this.isSprinting = mc.player.isSprinting();
            }
        }
    }
}
