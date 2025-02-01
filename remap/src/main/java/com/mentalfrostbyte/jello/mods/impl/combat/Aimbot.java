// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;
import com.mentalfrostbyte.jello.mods.impl.combat.aimbots.BasicAimbot;
import com.mentalfrostbyte.jello.mods.impl.combat.aimbots.CANDCAimbot;
import com.mentalfrostbyte.jello.mods.impl.combat.aimbots.SmoothAimbot;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import mapped.ColorUtils;
import mapped.Class857;
import mapped.Class9011;
import mapped.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Iterator;
import java.util.List;

public class Aimbot extends ModuleWithSettings
{
    public Aimbot() {
        super(Category.COMBAT, "Aimbot", "Automatically aim at players", new Module[] { new BasicAimbot(), new SmoothAimbot(), new CANDCAimbot() });
        this.addSetting(new BooleanSetting("Players", "Aim at players", true));
        this.addSetting(new BooleanSetting("Animals/Monsters", "Aim at animals and monsters", false));
        this.addSetting(new BooleanSetting("Invisible", "Aim at invisible entites", true));
    }
    
    public Entity method10266(final float n) {
        final List<Entity> method19138 = ColorUtils.method19138();
        Entity class399 = null;
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class400 = iterator.next();
            if (class400 != Aimbot.mc.player) {
                if (!Client.method35173().method35190().method29878(class400)) {
                    if (class400 instanceof LivingEntity) {
                        if (((LivingEntity)class400).method2664() != 0.0f) {
                            if (Aimbot.mc.player.method1732(class400) <= n) {
                                if (Aimbot.mc.player.method2646((LivingEntity)class400)) {
                                    if (!(class400 instanceof Class857)) {
                                        if (!this.method9883("Players") && class400 instanceof PlayerEntity) {
                                            iterator.remove();
                                        }
                                        else if (class400 instanceof PlayerEntity && Client.method35173().method35191().method31751(class400)) {
                                            iterator.remove();
                                        }
                                        else if (!this.method9883("Invisible") && class400.method1823()) {
                                            iterator.remove();
                                        }
                                        else if (!this.method9883("Animals/Monsters") && !(class400 instanceof PlayerEntity)) {
                                            iterator.remove();
                                        }
                                        else if (Aimbot.mc.player.method1920() != null && Aimbot.mc.player.method1920().equals(class400)) {
                                            iterator.remove();
                                        }
                                        else if (!class400.method1850()) {
                                            if (class400 instanceof PlayerEntity) {
                                                if (Class9011.method32262((PlayerEntity)class400)) {
                                                    if (Client.method35173().method35189().method21551(Teams.class).method9906()) {
                                                        iterator.remove();
                                                        continue;
                                                    }
                                                }
                                            }
                                            if (class399 != null && Aimbot.mc.player.method1732(class400) >= Aimbot.mc.player.method1732(class399)) {
                                                continue;
                                            }
                                            class399 = class400;
                                        }
                                        else {
                                            iterator.remove();
                                        }
                                    }
                                    else {
                                        iterator.remove();
                                    }
                                }
                                else {
                                    iterator.remove();
                                }
                            }
                            else {
                                iterator.remove();
                            }
                        }
                        else {
                            iterator.remove();
                        }
                    }
                    else {
                        iterator.remove();
                    }
                }
                else {
                    iterator.remove();
                }
            }
            else {
                iterator.remove();
            }
        }
        return class399;
    }
}
