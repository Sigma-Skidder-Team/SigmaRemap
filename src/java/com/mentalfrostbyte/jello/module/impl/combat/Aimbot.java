package com.mentalfrostbyte.jello.module.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.combat.aimbot.BasicAimbot;
import com.mentalfrostbyte.jello.module.impl.combat.aimbot.CandCAimbot;
import com.mentalfrostbyte.jello.module.impl.combat.aimbot.SmoothAimbot;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.ArmorStandEntity;
import mapped.Class8781;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.Iterator;
import java.util.List;

public class Aimbot extends ModuleWithModuleSettings {
    public Aimbot() {
        super(ModuleCategory.COMBAT,
                "Aimbot",
                "Automatically aim at players",
                new BasicAimbot(),
                new SmoothAimbot(),
                new CandCAimbot());
        this.registerSetting(new BooleanSetting("Players", "Aim at players", true));
        this.registerSetting(new BooleanSetting("Animals/Monsters", "Aim at animals and monsters", false));
        this.registerSetting(new BooleanSetting("Invisible", "Aim at invisible entites", true));
    }

    public Entity getTarget(float var1) {
        List var4 = MultiUtilities.getEntitesInWorld();
        Entity var5 = null;
        Iterator var6 = var4.iterator();

        while (var6.hasNext()) {
            Entity var7 = (Entity) var6.next();
            if (var7 != mc.player) {
                if (!Client.getInstance().friendManager.method26997(var7)) {
                    if (var7 instanceof LivingEntity) {
                        if (((LivingEntity) var7).getHealth() != 0.0F) {
                            if (!(mc.player.getDistance(var7) > var1)) {
                                if (mc.player.canAttack((LivingEntity) var7)) {
                                    if (!(var7 instanceof ArmorStandEntity)) {
                                        if (!this.getBooleanValueFromSettingName("Players") && var7 instanceof PlayerEntity) {
                                            var6.remove();
                                        } else if (var7 instanceof PlayerEntity && Client.getInstance().combatManager.isTargetABot(var7)) {
                                            var6.remove();
                                        } else if (!this.getBooleanValueFromSettingName("Invisible") && var7.isInvisible()) {
                                            var6.remove();
                                        } else if (!this.getBooleanValueFromSettingName("Animals/Monsters") && !(var7 instanceof PlayerEntity)) {
                                            var6.remove();
                                        } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var7)) {
                                            var6.remove();
                                        } else if (!var7.method3362()) {
                                            if (var7 instanceof PlayerEntity
                                                    && Class8781.method31662((PlayerEntity) var7)
                                                    && Client.getInstance().moduleManager.getModuleByClass(Teams.class).isEnabled()) {
                                                var6.remove();
                                            } else if (var5 == null || mc.player.getDistance(var7) < mc.player.getDistance(var5)) {
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
}
