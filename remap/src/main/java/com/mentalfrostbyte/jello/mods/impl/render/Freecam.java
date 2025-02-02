// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.render;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.settings.impl.NumberSetting;
import com.mojang.authlib.GameProfile;
import mapped.*;
import net.minecraft.util.math.AxisAlignedBB;

public class Freecam extends Module
{
    public static PlayerEntity field15901;
    private double field15902;
    private double field15903;
    private double field15904;
    private double field15905;
    private double field15906;
    private double field15907;
    private float field15908;
    private float field15909;
    private int field15910;
    public float field15911;
    public float field15912;
    public boolean field15913;
    public boolean field15914;
    public boolean field15915;
    public boolean field15916;
    public boolean field15917;
    public boolean field15918;
    
    public Freecam() {
        super(Category.RENDER, "Freecam", "Move client side but not server side");
        this.addSetting(new NumberSetting("Speed", "Speed value", 4.0f, Float.class, 1.0f, 10.0f, 0.1f));
    }
    
    @EventListener
    public void method10497(final Class5729 class5729) {
        if (this.isEnabled()) {
            if (class5729.method17016() instanceof ClientPlayerEntity) {
                if (class5729.method17016() != Freecam.field15901) {
                    class5729.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    public void method10498(final Class5741 class5741) {
        if (this.isEnabled()) {
            if (Freecam.field15901 == null) {
                this.onEnable();
            }
            Freecam.mc.player.field4078 = Freecam.mc.player.rotationPitch;
            final AxisAlignedBB field2403 = Freecam.mc.player.boundingBox;
            Freecam.field15901.setPosition((field2403.minX + field2403.maxX) / 2.0, field2403.minY, (field2403.minZ + field2403.maxZ) / 2.0);
            final double n = this.field15905 + (this.field15902 - this.field15905) * class5741.field23312;
            final double n2 = this.field15906 + (this.field15903 - this.field15906) * class5741.field23312;
            final double n3 = this.field15907 + (this.field15904 - this.field15907) * class5741.field23312;
            Freecam.mc.player.posX = n;
            Freecam.mc.player.lastTickPosX = n;
            Freecam.mc.player.field3018 = n;
            Freecam.mc.player.prevPosX = n;
            Freecam.mc.player.posY = n2;
            Freecam.mc.player.lastTickPosY = n2;
            Freecam.mc.player.field3019 = n2;
            Freecam.mc.player.prevPosY = n2;
            Freecam.mc.player.posZ = n3;
            Freecam.mc.player.lastTickPosZ = n3;
            Freecam.mc.player.field3020 = n3;
            Freecam.mc.player.prevPosZ = n3;
            if (Class7482.method23148()) {
                Freecam.mc.player.field3013 = 0.099999994f;
            }
        }
    }
    
    @EventListener
    public void method10499(final Class5739 class5739) {
        if (this.isEnabled()) {
            Freecam.field15901.method1685();
            Freecam.field15901.boundingBox = new AxisAlignedBB(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
        }
    }
    
    @Override
    public void onEnable() {
        this.field15902 = Freecam.mc.player.posX;
        this.field15903 = Freecam.mc.player.posY;
        this.field15904 = Freecam.mc.player.posZ;
        this.field15908 = Freecam.mc.player.rotationYaw;
        this.field15909 = Freecam.mc.player.rotationPitch;
        Freecam.field15901 = new Class755(Freecam.mc.world, new GameProfile(Freecam.mc.player.method2844().getId(), Freecam.mc.player.getName().getFormattedText()));
        Freecam.field15901.inventory = Freecam.mc.player.inventory;
        Freecam.field15901.method1728(this.field15902, this.field15903, this.field15904, this.field15908, this.field15909);
        Freecam.field15901.noClip = true;
        Freecam.field15901.entityCollisionReduction = Freecam.mc.player.entityCollisionReduction;
        Freecam.field15901.field2953 = this.field15908;
        Freecam.field15901.field2954 = this.field15908;
        Freecam.field15901.field2951 = this.field15908;
        Freecam.field15901.field2952 = this.field15908;
        Freecam.mc.world.method6819(this.field15910 = (int)(Math.random() * -10000.0), Freecam.field15901);
        this.field15913 = Freecam.mc.gameSettings.field23435.method1056();
        this.field15914 = Freecam.mc.gameSettings.field23437.method1056();
        this.field15915 = Freecam.mc.gameSettings.field23436.method1056();
        this.field15916 = Freecam.mc.gameSettings.field23438.method1056();
        this.field15912 = ((this.field15913 != this.field15914) ? ((float)(this.field15913 ? 1 : -1)) : 0.0f);
        this.field15911 = ((this.field15915 != this.field15916) ? ((float)(this.field15915 ? 1 : -1)) : 0.0f);
        this.field15917 = Freecam.mc.gameSettings.field23439.method1056();
        this.field15918 = Freecam.mc.gameSettings.field23440.method1056();
        Freecam.mc.gameSettings.field23435.field2162 = false;
        Freecam.mc.gameSettings.field23437.field2162 = false;
        Freecam.mc.gameSettings.field23436.field2162 = false;
        Freecam.mc.gameSettings.field23438.field2162 = false;
        Freecam.mc.gameSettings.field23439.field2162 = false;
        Freecam.mc.gameSettings.field23440.field2162 = false;
    }
    
    @Override
    public void onDisable() {
        Freecam.mc.gameSettings.field23435.field2162 = this.field15913;
        Freecam.mc.gameSettings.field23437.field2162 = this.field15914;
        Freecam.mc.gameSettings.field23436.field2162 = this.field15915;
        Freecam.mc.gameSettings.field23438.field2162 = this.field15916;
        Freecam.mc.gameSettings.field23439.field2162 = this.field15917;
        Freecam.mc.gameSettings.field23440.field2162 = this.field15918;
        Freecam.mc.world.method6821(this.field15910);
        Freecam.mc.player.method1685();
        if (Freecam.field15901 != null) {
            Freecam.mc.player.entityCollisionReduction = Freecam.field15901.entityCollisionReduction;
        }
        Freecam.field15901 = null;
    }
    
    @EventListener
    private void method10500(final Class5713 class5713) {
        if (this.isEnabled()) {
            class5713.setCancelled(true);
        }
    }
    
    @EventListener
    private void method10501(final Class5752 class5752) {
        if (this.isEnabled()) {
            if (class5752.method17061() != Freecam.mc.gameSettings.field23440.field2161.field32860) {
                if (class5752.method17061() != Freecam.mc.gameSettings.field23439.field2161.field32860) {
                    if (class5752.method17061() != Freecam.mc.gameSettings.field23435.field2161.field32860) {
                        if (class5752.method17061() != Freecam.mc.gameSettings.field23437.field2161.field32860) {
                            if (class5752.method17061() != Freecam.mc.gameSettings.field23436.field2161.field32860) {
                                if (class5752.method17061() == Freecam.mc.gameSettings.field23438.field2161.field32860) {
                                    class5752.setCancelled(true);
                                    this.field15916 = true;
                                }
                            }
                            else {
                                class5752.setCancelled(true);
                                this.field15915 = true;
                            }
                        }
                        else {
                            class5752.setCancelled(true);
                            this.field15914 = true;
                        }
                    }
                    else {
                        class5752.setCancelled(true);
                        this.field15913 = true;
                    }
                }
                else {
                    class5752.setCancelled(true);
                    this.field15917 = true;
                }
            }
            else {
                class5752.setCancelled(true);
                this.field15918 = true;
            }
            this.field15912 = ((this.field15913 != this.field15914) ? ((float)(this.field15913 ? 1 : -1)) : 0.0f);
            this.field15911 = ((this.field15915 != this.field15916) ? ((float)(this.field15915 ? 1 : -1)) : 0.0f);
        }
    }
    
    @EventListener
    private void method10502(final Class5715 class5715) {
        if (this.isEnabled()) {
            if (class5715.method16963() != Freecam.mc.gameSettings.field23440.field2161.field32860) {
                if (class5715.method16963() != Freecam.mc.gameSettings.field23439.field2161.field32860) {
                    if (class5715.method16963() != Freecam.mc.gameSettings.field23435.field2161.field32860) {
                        if (class5715.method16963() != Freecam.mc.gameSettings.field23437.field2161.field32860) {
                            if (class5715.method16963() != Freecam.mc.gameSettings.field23436.field2161.field32860) {
                                if (class5715.method16963() == Freecam.mc.gameSettings.field23438.field2161.field32860) {
                                    class5715.setCancelled(true);
                                    this.field15916 = false;
                                }
                            }
                            else {
                                class5715.setCancelled(true);
                                this.field15915 = false;
                            }
                        }
                        else {
                            class5715.setCancelled(true);
                            this.field15914 = false;
                        }
                    }
                    else {
                        class5715.setCancelled(true);
                        this.field15913 = false;
                    }
                }
                else {
                    class5715.setCancelled(true);
                    this.field15917 = false;
                }
            }
            else {
                class5715.setCancelled(true);
                this.field15918 = false;
            }
            this.field15912 = ((this.field15913 != this.field15914) ? ((float)(this.field15913 ? 1 : -1)) : 0.0f);
            this.field15911 = ((this.field15915 != this.field15916) ? ((float)(this.field15915 ? 1 : -1)) : 0.0f);
        }
    }
    
    @EventListener
    public void method10503(final Class5722 class5722) {
        if (this.isEnabled()) {
            class5722.setCancelled(true);
        }
    }
    
    @EventListener
    public void method10504(final UpdateWalkingEvent updateWalkingEvent) {
        if (this.isEnabled() && updateWalkingEvent.method17046()) {
            updateWalkingEvent.method17043(this.field15908 % 360.0f);
            updateWalkingEvent.method17041(this.field15909);
            Freecam.mc.player.field4077 = this.field15908;
            Freecam.mc.player.field4078 = this.field15909;
            final float[] method23145 = Class7482.method23145(this.field15912, this.field15911);
            final float n = method23145[1];
            final float n2 = method23145[2];
            final float n3 = method23145[0];
            final double cos = Math.cos(Math.toRadians(n3));
            final double sin = Math.sin(Math.toRadians(n3));
            final double n4 = this.getNumberSettingValueByName("Speed") / 2.0f;
            this.field15905 = this.field15902;
            this.field15907 = this.field15904;
            this.field15906 = this.field15903;
            this.field15902 += (n * cos + n2 * sin) * n4;
            this.field15904 += (n * sin - n2 * cos) * n4;
            if (this.field15917) {
                this.field15903 += n4;
            }
            if (this.field15918) {
                this.field15903 -= n4;
            }
        }
    }
    
    @EventListener
    private void method10505(final Class5723 class5723) {
        if (!this.isEnabled()) {
            return;
        }
        if (Freecam.mc.player != null) {
            if (class5723.method16998() instanceof Class4328) {
                final Class4328 class5724 = (Class4328)class5723.method16998();
                this.field15908 = class5724.field19380;
                this.field15909 = class5724.field19381;
                class5724.field19380 = Freecam.mc.player.rotationYaw;
                class5724.field19381 = Freecam.mc.player.rotationPitch;
                final double field19377 = class5724.field19377;
                final double field19378 = class5724.field19378;
                final double field19379 = class5724.field19379;
                final float field19380 = PlayerEntity.field2997.field34097;
                Freecam.mc.player.method1889(new AxisAlignedBB(field19377 - field19380, field19378, field19379 - field19380, field19377 + field19380, field19378 + PlayerEntity.field2997.field34098, field19379 + field19380));
                class5723.setCancelled(true);
                Freecam.field15901.setMotion(0.0, 0.0, 0.0);
            }
        }
    }
    
    @EventListener
    private void method10506(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (class5721.method16990() instanceof Class4380) {
                Freecam.field15901.method2707(Class316.field1877);
            }
            if (class5721.method16990() instanceof Class4381) {
                if (((Class4381)class5721.method16990()).method13170(Freecam.mc.world) == null) {
                    class5721.setCancelled(true);
                }
            }
        }
    }
    
    @EventListener
    private void method10507(final Class5746 class5746) {
        if (this.isEnabled()) {
            class5746.setCancelled(true);
        }
    }
    
    @EventListener
    private void method10508(final Class5732 class5732) {
        if (this.isEnabled()) {
            this.method9907(false);
        }
    }
}
