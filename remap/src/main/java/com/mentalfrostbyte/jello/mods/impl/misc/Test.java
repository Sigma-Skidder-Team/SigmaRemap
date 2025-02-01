// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.misc;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.*;
import com.mentalfrostbyte.jello.settings.Setting;
import mapped.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;

import java.util.Iterator;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test extends Module
{
    private double field16082;
    private double field16083;
    private double field16084;
    private double field16085;
    private double field16086;
    private double field16087;
    private double field16088;
    private double field16089;
    public boolean field16090;
    private long field16091;
    private float field16092;
    private float field16093;
    private float field16094;
    private float field16095;
    private float field16096;
    private float field16097;
    public Class9572 field16098;
    private Entity field16099;
    
    public Test() {
        super(Category.MISC, "Test", "A mod for testing things");
        this.addSetting(new BezierSetting("Bezier", "ey", 0.57f, -0.035f, 0.095f, -0.0f));
        this.addSetting(new BooleanSetting("Test Checkbox", "A test checkbox", true).method15195(class4997 -> Client.method35173().method35187().method20240("Changed checkbox: " + class4997.method15198())));
        this.addSetting(new NumberSetting("Test Slider", "A test slider", 0.5f, Float.class, 0.0f, 1.0f, 0.1f).method15195(class4997 -> Client.method35173().method35187().method20240("Changed slider: " + class4997.method15198())));
        this.addSetting(new ButtonSetting("Test Type", "A test type button", 0, new String[] { "hello", "goodbye" }).method15195(class4997 -> Client.method35173().method35187().method20240("Changed type: " + class4997.method15198())));
        this.addSetting(new SubOptionSettingExtender("Test Suboptions", "A test suboption", false, new Setting[] { new BooleanSetting("Test Checkbox", "A test checkbox", true), new NumberSetting("Test Slider", "A test slider", 0.5f, Float.class, 0.0f, 1.0f, 0.1f) }));
    }
    
    @Override
    public void method9879() {
        this.field16086 = 0.0;
        this.field16098 = new Class9572(1000, 100000, Direction.BACKWARDS);
        this.field16092 = Test.mc.player.rotationYaw;
        this.field16093 = Test.mc.player.rotationPitch;
        final double field2395 = Test.mc.player.posX;
        final double field2396 = Test.mc.player.posY;
        final double field2397 = Test.mc.player.posZ;
        this.field16090 = false;
        this.field16085 = 0.0;
    }
    
    @Override
    public void onDisable() {
    }
    
    @EventListener
    @Class6759
    public void method10775(final Class5717 class5717) {
        if (this.method9906()) {
            return;
        }
    }
    
    @EventListener
    public void method10776(final Class5743 class5743) {
        if (this.method9906()) {
            return;
        }
    }
    
    @EventListener
    public void method10777(final Class5740 class5740) {
        if (this.method9906()) {
            return;
        }
    }
    
    @EventListener
    public void method10778(final Class5751 class5751) {
        if (this.method9906()) {
            return;
        }
    }
    
    @EventListener
    public void method10779(final Class5744 class5744) {
        if (this.method9906() && class5744.method17046()) {
            final Entity method10786 = this.method10786(3.3f);
            if (this.method10786(8.0f) != null) {
                if (this.field16087 < 1.0) {
                    this.field16087 += 20.0f / MathHelper.method35658(new Random(), 4, 8);
                }
                ++this.field16085;
            }
            if (method10786 == null) {
                if (this.method10786(8.0f) != null) {
                    if (this.field16085 >= (int)this.field16087) {
                        Class9274.method34209("" + this.method10786(8.0f));
                        Test.mc.player.method2707(Class316.field1877);
                        this.field16087 -= (int)this.field16087;
                        this.field16085 = 0.0;
                    }
                }
            }
            else {
                final float[] method10787 = Class8845.method30912(method10786);
                Test.mc.player.rotationYaw = method10787[0];
                Test.mc.player.rotationPitch = method10787[1];
                if (this.field16099 != null) {
                    this.field16087 -= (int)this.field16087;
                    ColorUtils.method19165(this.field16099, true);
                }
            }
            this.field16099 = method10786;
        }
    }
    
    @EventListener
    @Class6755
    public void method10780(final Class5732 class5732) {
    }
    
    @EventListener
    @Class6755
    public void method10781(final Class5752 class5752) {
        if (this.method9906()) {
            return;
        }
    }
    
    @EventListener
    @Class6755
    public void method10782(final Class5748 class5748) {
        if (this.method9906() && Test.mc.field4700 == null) {
            if (this.field16099 != null) {
                this.field16090 = true;
            }
        }
    }
    
    @EventListener
    @Class6755
    public void method10783(final Class5721 class5721) {
        final IPacket method16990 = class5721.method16990();
        if (this.method9906() && Test.mc.player != null) {
            if (!(method16990 instanceof Class4381)) {
                if (!(method16990 instanceof Class4353)) {
                    if (!(method16990 instanceof Class4321)) {
                        if (!(method16990 instanceof Class4307)) {
                            if (!(method16990 instanceof Class4380)) {
                                if (!(method16990 instanceof Class4329)) {
                                    if (!(method16990 instanceof Class4399)) {
                                        if (!(method16990 instanceof Class4389)) {
                                            if (!(method16990 instanceof Class4323)) {
                                                if (method16990 instanceof Class4317) {
                                                    final Class4317 class5722 = new Class4317();
                                                }
                                            }
                                            else if (((Class4323)method16990).method12987() != Class2218.field13623) {}
                                        }
                                    }
                                    else if (((Class4399)method16990).method13239() != Class2003.field11245) {}
                                }
                                else {
                                    final Class4329 class5723 = (Class4329)method16990;
                                }
                            }
                            else {
                                Class9274.method34209("swing");
                            }
                        }
                        else {
                            final Class4307 class5724 = (Class4307)method16990;
                        }
                    }
                    else {
                        final Class4321 class5725 = (Class4321)method16990;
                    }
                }
                else {
                    final Class4353 class5726 = (Class4353)method16990;
                    final double field19500 = class5726.field19500;
                    Class9274.method34209((class5726.method13083() ? "§a" : "§c") + class5726.field19500);
                }
            }
            else {
                final Entity method16991 = ((Class4381)method16990).method13170(Test.mc.world);
                final String str = (method16991 != null) ? method16991.getName().getFormattedText() : "null";
                if (this.field16090) {
                    class5721.method16961(true);
                }
                Class9274.method34209("§chit : " + str);
            }
            if (!(method16990 instanceof Class4353)) {
                if (!(method16990 instanceof Class4303)) {
                    if (method16990 instanceof Class4255) {}
                }
            }
        }
    }
    
    @EventListener
    public void method10784(final Class5723 class5723) {
        final IPacket method16998 = class5723.method16998();
        if (this.method9906()) {
            if (!(method16998 instanceof Class4396)) {
                if (!(method16998 instanceof Class4393)) {
                    if (method16998 instanceof Class4328) {
                        final Class4328 class5724 = (Class4328)method16998;
                    }
                }
                else {
                    final Class4393 class5725 = (Class4393)method16998;
                }
            }
            else {
                final Class4396 class5726 = (Class4396)method16998;
            }
            if (new ArrayList(Arrays.asList(Class4396.class, Class4393.class, Class4328.class, Class4402.class, Class4278.class, Class4312.class, Class4378.class, Class4364.class, Class4273.class)).contains(((Class4396)method16998).getClass())) {}
            if (!(method16998 instanceof Class4301)) {}
        }
    }
    
    public List<Entity> method10785(final float n) {
        final List<Entity> method19138 = ColorUtils.method19138();
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class399 = iterator.next();
            if (class399 != Test.mc.player) {
                if (!Client.method35173().method35190().method29878(class399)) {
                    if (class399 instanceof LivingEntity) {
                        if (((LivingEntity)class399).method2664() != 0.0f) {
                            if (Test.mc.player.method1732(class399) <= n) {
                                if (Test.mc.player.method2646((LivingEntity)class399)) {
                                    if (!(class399 instanceof Class857) && !(class399 instanceof PlayerEntity)) {
                                        if (class399 instanceof PlayerEntity && Client.method35173().method35191().method31751(class399)) {
                                            iterator.remove();
                                        }
                                        else if (Test.mc.player.method1920() != null && Test.mc.player.method1920().equals(class399)) {
                                            iterator.remove();
                                        }
                                        else if (!class399.method1850()) {
                                            if (!(class399 instanceof PlayerEntity)) {
                                                continue;
                                            }
                                            if (!Class9011.method32262((PlayerEntity)class399)) {
                                                continue;
                                            }
                                            iterator.remove();
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
        Collections.sort((List<Object>)method19138, (Comparator<? super Object>)new Class4439(this));
        return method19138;
    }
    
    public Entity method10786(final float n) {
        final List<Entity> method19138 = ColorUtils.method19138();
        Entity class399 = null;
        final Iterator<Entity> iterator = method19138.iterator();
        while (iterator.hasNext()) {
            final Entity class400 = iterator.next();
            if (class400 != Test.mc.player) {
                if (!Client.method35173().method35190().method29878(class400)) {
                    if (class400 instanceof LivingEntity) {
                        if (((LivingEntity)class400).method2664() != 0.0f) {
                            if (Test.mc.player.method1732(class400) <= n) {
                                if (Test.mc.player.method2646((LivingEntity)class400)) {
                                    if (!(class400 instanceof Class857)) {
                                        if (class400 instanceof PlayerEntity && Client.method35173().method35191().method31751(class400)) {
                                            iterator.remove();
                                        }
                                        else if (Test.mc.player.method1920() != null && Test.mc.player.method1920().equals(class400)) {
                                            iterator.remove();
                                        }
                                        else if (!class400.method1850()) {
                                            if (class399 != null && Test.mc.player.method1732(class400) >= Test.mc.player.method1732(class399)) {
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
    
    public static float[] method10787(final Entity class399) {
        final double x = class399.posX - Test.mc.player.posX;
        final double y = class399.posZ - Test.mc.player.posZ;
        return new float[] { (float)Math.toDegrees(Math.atan2(y, x)) - 90.0f, -(float)(-(Math.atan2(Test.mc.player.posY + Test.mc.player.method1892() - (class399.posY + class399.method1892()), MathHelper.sqrt(x * x + y * y)) * 180.0 / 3.141592653589793)) };
    }
    
    public static float method10788(final float n, final double n2, final double n3) {
        final double n4 = n2 - Test.mc.player.posX;
        final double n5 = n3 - Test.mc.player.posZ;
        double degrees = 0.0;
        if (n5 < 0.0 && n4 < 0.0) {
            if (n4 != 0.0) {
                degrees = 90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 < 0.0 && n4 > 0.0) {
            if (n4 != 0.0) {
                degrees = -90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 != 0.0) {
            degrees = Math.toDegrees(-Math.atan(n4 / n5));
        }
        return MathHelper.method35668(-(n - (float)degrees));
    }
    
    private double method10789(final double n, final double n2) {
        return n + Math.random() * (n2 - n);
    }
    
    public static float method10790(final float n, final Entity class399, final double n2) {
        final double n3 = class399.posX - Test.mc.player.posX;
        final double n4 = class399.posZ - Test.mc.player.posZ;
        return -MathHelper.method35668(n - (float)(-Math.toDegrees(Math.atan((n2 - 2.2 + class399.method1892() - Test.mc.player.posY) / MathHelper.sqrt(n3 * n3 + n4 * n4))))) - 2.5f;
    }
}
