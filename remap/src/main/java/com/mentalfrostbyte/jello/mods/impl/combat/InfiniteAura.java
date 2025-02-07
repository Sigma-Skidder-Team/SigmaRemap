// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.combat;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.lwjgl.opengl.GL11;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class InfiniteAura extends Module
{
    private int field15646;
    private boolean field15647;
    private float field15648;
    private List<List<Class9407>> field15649;
    
    public InfiniteAura() {
        super(Category.COMBAT, "InfiniteAura", "Basically infinite aura");
        this.addSetting(new NumberSetting("Range", "Range value", 4.0f, Float.class, 8.0f, 120.0f, 1.0f));
        this.addSetting(new NumberSetting("CPS", "CPS value", 8.0f, Float.class, 1.0f, 20.0f, 1.0f));
        this.addSetting(new NumberSetting("Targets", "Number of targets", 4.0f, Float.class, 1.0f, 10.0f, 1.0f));
        this.addSetting(new BooleanSetting("Players", "Hit players", true));
        this.addSetting(new BooleanSetting("Animals/Monsters", "Hit animals and monsters", false));
        this.addSetting(new BooleanSetting("Anti-Bot", "Doesn't hit bots", true));
        this.addSetting(new BooleanSetting("Invisible", "Hit invisible entites", true));
        this.addSetting(new BooleanSetting("No Swing", "Doesn't swing", false));
        this.field15649 = new ArrayList<List<Class9407>>();
    }
    
    @Override
    public void onEnable() {
        this.field15647 = false;
        this.field15646 = (int)(20.0f / this.method9914().getNumberSettingValueByName("CPS"));
        this.field15648 = (float)this.field15646;
    }
    
    @Override
    public void onDisable() {
        this.field15649.clear();
        this.field15647 = false;
    }
    
    @EventListener
    @Class6759
    public void method10091(final Class5743 class5743) {
        if (!this.isEnabled()) {
            return;
        }
        final List<Class8131> method10094 = this.method10094((float)(int)this.getNumberSettingValueByName("Range"));
        if (method10094 == null || method10094.size() == 0) {
            this.field15647 = false;
            this.field15649.clear();
            return;
        }
        if (this.field15648 < 1.0f) {
            this.field15648 += 20.0f / this.method9914().getNumberSettingValueByName("CPS");
        }
        ++this.field15646;
        if (this.field15646 >= (int)this.field15648) {
            this.field15646 = 0;
            this.field15649.clear();
            this.field15648 -= (int)this.field15648;
            int n = 0;
            final Entity class5744 = (InfiniteAura.mc.player.method1920() == null) ? InfiniteAura.mc.player : InfiniteAura.mc.player.method1920();
            final Iterator iterator = method10094.iterator();
            while (iterator.hasNext()) {
                final Entity method10095 = ((Class8131)iterator.next()).method26798();
                if ((int)this.getNumberSettingValueByName("Targets") < ++n) {
                    break;
                }
                final ArrayList<Class9407> method10096 = Class9147.method33405(new Class9407(method10095.posX, method10095.posY, method10095.posZ), new Class9407(class5744.posX, class5744.posY, class5744.posZ));
                this.field15649.add(method10096);
                Collections.reverse(method10096);
                this.method10092(method10096, Client.getInstance().method35189().getModuleByClass(Criticals.class).isEnabled());
                ColorUtils.method19165(method10095, !this.method9883("No Swing"));
                Collections.reverse(method10096);
                this.method10092(method10096, false);
            }
        }
    }
    
    public void method10092(final List<Class9407> list, final boolean b) {
        final Entity method1920 = InfiniteAura.mc.player.method1920();
        Class9407 class9407 = null;
        final Iterator<Class9407> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Class9407 class9408 = class9407 = iterator.next();
            if (method1920 == null) {
                InfiniteAura.mc.method5269().method17292(new Class4354(class9408.method34993(), class9408.method34994(), class9408.method34995(), true));
            }
            else {
                method1920.posX = class9408.method34993() + 0.5;
                method1920.posY = class9408.method34994();
                method1920.posZ = class9408.method34995() + 0.5;
                InfiniteAura.mc.method5269().method17292(new Class4302(false, false));
                InfiniteAura.mc.method5269().method17292(new Class4356(InfiniteAura.mc.player.rotationYaw, InfiniteAura.mc.player.rotationPitch, false));
                InfiniteAura.mc.method5269().method17292(new Class4254(0.0f, 1.0f, false, false));
                final Class423 class9409 = new Class423(InfiniteAura.mc.world, class9408.method34993() + 0.5, class9408.method34994(), class9408.method34995() + 0.5);
                class9409.rotationYaw = method1920.rotationYaw;
                class9409.rotationPitch = method1920.rotationPitch;
                InfiniteAura.mc.method5269().method17292(new Class4251(class9409));
            }
        }
        if (b) {
            if (class9407 != null) {
                InfiniteAura.mc.method5269().method17292(new Class4354(class9407.method34993(), class9407.method34994() + 1.0E-14, class9407.method34995(), false));
                InfiniteAura.mc.method5269().method17292(new Class4354(class9407.method34993(), class9407.method34994(), class9407.method34995(), false));
            }
        }
    }
    
    @EventListener
    public void method10093(final Class5739 class5739) {
        if (this.isEnabled()) {
            if (this.field15649 != null) {
                if (this.field15649.size() != 0) {
                    for (final List<Class9407> list : this.field15649) {
                        GL11.glPushMatrix();
                        GL11.glEnable(2848);
                        GL11.glBlendFunc(770, 771);
                        GL11.glEnable(3042);
                        GL11.glDisable(3553);
                        GL11.glDisable(2929);
                        GL11.glEnable(32925);
                        GL11.glLineWidth(1.4f);
                        GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
                        GL11.glBegin(3);
                        for (final Class9407 class5740 : list) {
                            GL11.glVertex3d(class5740.method34993() - InfiniteAura.mc.field4644.method5833().method18161().getX(), class5740.method34994() - InfiniteAura.mc.field4644.method5833().method18161().getY(), class5740.method34995() - InfiniteAura.mc.field4644.method5833().method18161().getZ());
                        }
                        GL11.glEnd();
                        GL11.glPushMatrix();
                        GL11.glTranslated(InfiniteAura.mc.field4644.method5833().method18161().getX(), InfiniteAura.mc.field4644.method5833().method18161().getY(), InfiniteAura.mc.field4644.method5833().method18161().getZ());
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
        }
    }
    
    public List<Class8131> method10094(final float n) {
        final ArrayList list = new ArrayList();
        for (final Entity class399 : ColorUtils.method19138()) {
            list.add(new Class8131(class399, Class8845.method30922(class399)));
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Entity method26798 = ((Class8131)iterator2.next()).method26798();
            if (method26798 != InfiniteAura.mc.player) {
                if (!Client.getInstance().method35190().method29878(method26798)) {
                    if (method26798 instanceof LivingEntity) {
                        if (((LivingEntity)method26798).method2664() != 0.0f) {
                            if (InfiniteAura.mc.player.method1732(method26798) <= n) {
                                if (InfiniteAura.mc.player.method2646((LivingEntity)method26798)) {
                                    if (!(method26798 instanceof Class857)) {
                                        if (!this.method9883("Players") && method26798 instanceof PlayerEntity) {
                                            iterator2.remove();
                                        }
                                        else if (method26798 instanceof PlayerEntity && Client.getInstance().method35191().method31751(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!this.method9883("Invisible") && method26798.method1823()) {
                                            iterator2.remove();
                                        }
                                        else if (!this.method9883("Animals/Monsters") && !(method26798 instanceof PlayerEntity)) {
                                            iterator2.remove();
                                        }
                                        else if (InfiniteAura.mc.player.method1920() != null && InfiniteAura.mc.player.method1920().equals(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!method26798.method1850()) {
                                            if (!(method26798 instanceof PlayerEntity)) {
                                                continue;
                                            }
                                            if (!Class9011.method32262((PlayerEntity)method26798)) {
                                                continue;
                                            }
                                            if (!Client.getInstance().method35189().getModuleByClass(Teams.class).isEnabled()) {
                                                continue;
                                            }
                                            iterator2.remove();
                                        }
                                        else {
                                            iterator2.remove();
                                        }
                                    }
                                    else {
                                        iterator2.remove();
                                    }
                                }
                                else {
                                    iterator2.remove();
                                }
                            }
                            else {
                                iterator2.remove();
                            }
                        }
                        else {
                            iterator2.remove();
                        }
                    }
                    else {
                        iterator2.remove();
                    }
                }
                else {
                    iterator2.remove();
                }
            }
            else {
                iterator2.remove();
            }
        }
        Collections.sort(new InfiniteAuraComparator(this));
        return list;
    }
    
    public boolean method10095() {
        if (this.field15647) {
            if (Minecraft.method5277().player.getHeldItemMainhand() != null) {
                if (Minecraft.method5277().player.getHeldItemMainhand().getItem() instanceof Class4077) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method9898() {
        if (this.isEnabled()) {
            if (this.method10095()) {
                if (Client.getInstance().playerTracker().method29229()) {
                    return true;
                }
            }
        }
        return false;
    }
}
