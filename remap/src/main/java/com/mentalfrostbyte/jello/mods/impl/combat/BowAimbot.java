// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class BowAimbot extends Module
{
    private List<Entity> field15703;
    
    public BowAimbot() {
        super(Category.COMBAT, "BowAimbot", "Automatically aims at players while using a bow");
        this.field15703 = new ArrayList<Entity>();
        this.addSetting(new StringSetting("Sort mode", "Sort mode", 0, "Angle", "Range"));
        this.addSetting(new NumberSetting("Range", "Range value", 70.0f, Float.class, 10.0f, 100.0f, 1.0f));
        this.addSetting(new BooleanSetting("Silent", "Server-sided rotations.", false));
        this.addSetting(new BooleanSetting("Teams", "Target team", true));
        this.addSetting(new BooleanSetting("Players", "Target players", true));
        this.addSetting(new BooleanSetting("Animals/Monsters", "Target animals and monsters", false));
        this.addSetting(new BooleanSetting("Anti-Bot", "Doesn't target bots", true));
        this.addSetting(new BooleanSetting("Invisible", "Target invisible entites", true));
    }
    
    @Override
    public void onDisable() {
        this.field15703.clear();
    }
    
    @EventListener
    private void method10191(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.isPre()) {
            if (!(BowAimbot.mc.player.method2766().getItem() instanceof Class4087)) {
                this.field15703.clear();
            }
            else {
                this.field15703 = this.method10193(this.method9914().getNumberSettingValueByName("Range"));
            }
            if (!this.field15703.isEmpty()) {
                if (this.getBooleanValueFromSettingName("Silent")) {
                    final float[] method30921 = Class8845.method30921(this.field15703.get(0));
                    updateWalkingEvent.method17043(method30921[0]);
                    updateWalkingEvent.method17041(method30921[1]);
                }
            }
        }
    }
    
    @EventListener
    private void method10192(final Class5740 class5740) {
        if (this.isEnabled() && !this.getBooleanValueFromSettingName("Silent")) {
            if (!this.field15703.isEmpty()) {
                final float[] method30921 = Class8845.method30921(this.field15703.get(0));
                BowAimbot.mc.player.rotationYaw = method30921[0];
                BowAimbot.mc.player.rotationPitch = method30921[1];
            }
        }
    }
    
    public List<Entity> method10193(final float n) {
        final List<Entity> method19138 = ColorUtils.method19138();
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class399 = iterator.next();
            if (class399 == BowAimbot.mc.player) {
                iterator.remove();
            }
            else if (Client.getInstance().getFriendManager().method29878(class399)) {
                iterator.remove();
            }
            else if (!(class399 instanceof LivingEntity)) {
                iterator.remove();
            }
            else if (((LivingEntity)class399).method2664() == 0.0f) {
                iterator.remove();
            }
            else if (BowAimbot.mc.player.method1732(class399) > n) {
                iterator.remove();
            }
            else if (!BowAimbot.mc.player.method2646((LivingEntity)class399)) {
                iterator.remove();
            }
            else if (class399 instanceof Class857) {
                iterator.remove();
            }
            else if (!this.getBooleanValueFromSettingName("Players") && class399 instanceof PlayerEntity) {
                iterator.remove();
            }
            else if (this.getBooleanValueFromSettingName("Anti-Bot") && class399 instanceof PlayerEntity && Client.getInstance().getBotManager().method31751(class399)) {
                iterator.remove();
            }
            else if (!this.getBooleanValueFromSettingName("Invisible") && class399.method1823()) {
                iterator.remove();
            }
            else if (!this.getBooleanValueFromSettingName("Animals/Monsters") && !(class399 instanceof PlayerEntity)) {
                iterator.remove();
            }
            else if (BowAimbot.mc.player.method1920() != null && BowAimbot.mc.player.method1920().equals(class399)) {
                iterator.remove();
            }
            else if (class399.method1850()) {
                iterator.remove();
            }
            else {
                if (!(class399 instanceof PlayerEntity) || !Class9011.method32262((PlayerEntity)class399) || this.getBooleanValueFromSettingName("Teams")) {
                    continue;
                }
                iterator.remove();
            }
        }
        final String method19139 = this.getStringSettingValueByName("Sort mode");
        switch (method19139) {
            case "Range": {
                Collections.sort((List<Object>)method19138, (Comparator<? super Object>)new Class4443(this));
                break;
            }
            case "Angle": {
                Collections.sort((List<Object>)method19138, (Comparator<? super Object>)new Class4463(this));
                break;
            }
        }
        return method19138;
    }
}
