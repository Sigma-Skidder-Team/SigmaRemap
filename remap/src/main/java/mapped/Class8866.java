// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.Teams;
import com.mentalfrostbyte.jello.mods.impl.player.Blink;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class Class8866
{
    private float[] field37266;
    public final int field37267 = 3;
    private final Module field37268;
    public Minecraft field37269;
    public boolean field37270;
    
    public Class8866(final Module field37268) {
        this.field37269 = Minecraft.getInstance();
        this.field37268 = field37268;
        this.method31133();
    }
    
    public boolean isBlocking() {
        return this.field37270;
    }
    
    public void method31129(final boolean field37270) {
        this.field37270 = field37270;
    }
    
    public void method31130(final Entity class399, final float n, final float n2) {
        if (this.field37268.getBooleanValueFromSettingName("Interact autoblock")) {
            final EntityRayTraceResult method19144 = AllUtils.method19144(this.field37268.getBooleanValueFromSettingName("Raytrace") ? null : class399, n, n2, p0 -> true, this.field37268.getNumberSettingValueByName("Range"));
            if (method19144 != null) {
                this.field37269.method5269().method17292(new Class4381(method19144.getEntity(), Class316.field1877, method19144.getHitVec()));
                this.field37269.method5269().method17292(new Class4381(method19144.getEntity(), Class316.field1877));
            }
        }
        AllUtils.method19163();
        this.method31129(true);
    }
    
    public void stopAutoBlock() {
        AllUtils.method19164();
        this.method31129(false);
    }
    
    public boolean method31132() {
        if (!this.field37268.getStringSettingValueByName("Autoblock Mode").equals("None")) {
            if (this.field37269.player.getHeldItemMainhand().getItem() instanceof SwordItem) {
                return !this.isBlocking();
            }
        }
        return false;
    }
    
    public void method31133() {
        this.field37266 = new float[3];
        float n = 20.0f / this.field37268.getNumberSettingValueByName("Min CPS");
        float n2 = 20.0f / this.field37268.getNumberSettingValueByName("Max CPS");
        if (n > n2) {
            final float n3 = n;
            n = n2;
            n2 = n3;
        }
        for (int i = 0; i < 3; ++i) {
            this.field37266[i] = n + (float)Math.random() * (n2 - n);
        }
    }
    
    public float method31134(final int n) {
        if (n >= 0 && n < this.field37266.length) {
            return this.field37266[n];
        }
        return -1.0f;
    }
    
    public boolean method31135(final int n) {
        return n >= (int)this.field37266[0];
    }
    
    public void method31136() {
        float n = 20.0f / this.field37268.getNumberSettingValueByName("Min CPS");
        float n2 = 20.0f / this.field37268.getNumberSettingValueByName("Max CPS");
        if (n > n2) {
            final float n3 = n;
            n = n2;
            n2 = n3;
        }
        this.field37266[0] = this.field37266[1] + (this.field37266[0] - (int)this.field37266[0]);
        for (int i = 1; i < 3; ++i) {
            this.field37266[1] = n + (float)Math.random() * (n2 - n);
        }
    }
    
    public List<Class8131> method31137(final float n) {
        final ArrayList list = new ArrayList();
        for (final Entity class399 : AllUtils.method19138()) {
            list.add(new Class8131(class399, Class8845.method30922(class399)));
        }
        final Iterator iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            final Class8131 class400 = (Class8131)iterator2.next();
            final Entity method26798 = class400.method26798();
            if (method26798 != this.field37269.player && method26798 != Blink.field15771) {
                if (!Client.getInstance().getFriendManager().method29878(method26798)) {
                    if (method26798 instanceof LivingEntity) {
                        if (((LivingEntity)method26798).method2664() != 0.0f) {
                            if (this.field37269.player.method1732(method26798) <= n) {
                                if (this.field37269.player.method2646((LivingEntity)method26798)) {
                                    if (!(method26798 instanceof Class857)) {
                                        if (!this.field37268.getBooleanValueFromSettingName("Players") && method26798 instanceof PlayerEntity) {
                                            iterator2.remove();
                                        }
                                        else if (method26798 instanceof PlayerEntity && Client.getInstance().getBotManager().isBot(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!this.field37268.getBooleanValueFromSettingName("Invisible") && method26798.method1823()) {
                                            iterator2.remove();
                                        }
                                        else if (!this.field37268.getBooleanValueFromSettingName("Animals/Monsters") && !(method26798 instanceof PlayerEntity)) {
                                            iterator2.remove();
                                        }
                                        else if (this.field37269.player.method1920() != null && this.field37269.player.method1920().equals(method26798)) {
                                            iterator2.remove();
                                        }
                                        else if (!method26798.method1850()) {
                                            if (method26798 instanceof PlayerEntity) {
                                                if (Class9011.method32262((PlayerEntity)method26798)) {
                                                    if (Client.getInstance().moduleManager().getModuleByClass(Teams.class).isEnabled()) {
                                                        iterator2.remove();
                                                        continue;
                                                    }
                                                }
                                            }
                                            if (this.field37268.getBooleanValueFromSettingName("Through walls")) {
                                                continue;
                                            }
                                            final Class7988 method26799 = Class8845.method30924(method26798);
                                            if (method26799 != null) {
                                                Class8131.method26803(class400, method26799);
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
            else {
                iterator2.remove();
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4455(this));
        return list;
    }
    
    public List<Class8131> method31138(final List<Class8131> list) {
        final String method9887 = this.field37268.getStringSettingValueByName("Sort Mode");
        switch (method9887) {
            case "Range": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4464(this));
                break;
            }
            case "Health": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4459(this));
                break;
            }
            case "Angle": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4452(this));
                break;
            }
            case "Prev Range": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4431(this));
                break;
            }
            case "Armor": {
                Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4458(this));
                break;
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4448(this));
        return list;
    }
}
