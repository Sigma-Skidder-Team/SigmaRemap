// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.world;

import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import mapped.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import org.lwjgl.opengl.GL11;

public class Auto32k extends Module
{
    public BlockPos field15568;
    public int field15569;
    public int field15570;
    public int field15571;
    public int field15572;
    public short field15573;
    public Class4308 field15574;
    public boolean field15575;
    
    public Auto32k() {
        super(Category.WORLD, "Auto32k", "Automaticly places 32k shulker + hopper in hotbar");
        this.field15569 = -1;
        this.field15570 = -1;
        this.field15571 = 0;
        this.field15572 = -1;
        this.field15573 = 0;
        this.field15575 = false;
    }
    
    @Override
    public void onEnable() {
        this.field15568 = null;
        for (final BlockPos field15568 : Class4609.method13675(Class4609.method13691(Auto32k.mc.playerController.method27315()))) {
            if (Class4609.method13680(Auto32k.mc.player, field15568) >= 2.0f) {
                if (!Class4609.method13665(Auto32k.mc.player, field15568)) {
                    continue;
                }
                if (field15568.getY() < Auto32k.mc.player.posY - 2.0) {
                    continue;
                }
                if (field15568.getY() > Auto32k.mc.player.posY - 1.0) {
                    continue;
                }
                if (this.method9981(field15568)) {
                    this.field15568 = field15568;
                    break;
                }
                continue;
            }
        }
        this.field15570 = InvManagerUtil.method29340(Items.field31150, Items.field31146, Items.field31147, Items.field31144, Items.field31142, Items.field31148, Items.field31138, Items.field31143, Items.field31140, Items.field31137, Items.field31136, Items.field31141, Items.field31145, Items.field31149, Items.field31134, Items.field31135, Items.field31139);
        this.field15569 = InvManagerUtil.method29340(Items.field31028);
        if (this.field15569 == -1) {
            this.field15569 = InvManagerUtil.method29319(Items.field31028);
            if (this.field15569 != -1) {
                if (this.field15569 >= 36 && this.field15569 <= 44) {
                    this.field15569 %= 9;
                }
                else {
                    this.field15569 = InvManagerUtil.method29354(this.field15569);
                }
            }
        }
        if (this.field15570 == -1) {
            this.field15570 = InvManagerUtil.method29320(Items.field31150, Items.field31146, Items.field31147, Items.field31144, Items.field31142, Items.field31148, Items.field31138, Items.field31143, Items.field31140, Items.field31137, Items.field31136, Items.field31141, Items.field31145, Items.field31149, Items.field31134, Items.field31135, Items.field31139);
            if (this.field15570 != -1) {
                if (this.field15570 >= 36 && this.field15570 <= 44) {
                    this.field15570 %= 9;
                }
                else {
                    this.field15570 = InvManagerUtil.method29354(this.field15570);
                }
            }
        }
        this.field15571 = 0;
    }
    
    public boolean method9981(final BlockPos class354) {
        final BlockState method6701 = Auto32k.mc.world.getBlockState(class354);
        final BlockState method6702 = Auto32k.mc.world.getBlockState(class354.method1137());
        final BlockState method6703 = Auto32k.mc.world.getBlockState(class354.method1138(2));
        if (method6701.isSolid()) {
            if (method6702.method21706()) {
                return method6703.method21706();
            }
        }
        return false;
    }
    
    @Override
    public void onDisable() {
    }
    
    @EventListener
    private void method9982(final Custom3DRenderEvent custom3DRenderEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field15568 != null) {
            GL11.glAlphaFunc(516, 0.0f);
            final BlockPos field15568 = this.field15568;
            final double n = field15568.getX() - Auto32k.mc.field4644.method5833().method18161().getX();
            final double n2 = field15568.getY() - Auto32k.mc.field4644.method5833().method18161().getY();
            final double n3 = field15568.getZ() - Auto32k.mc.field4644.method5833().method18161().getZ();
            RenderUtil.method26909(new Class7644(n, n2 + 1.625, n3, n + 1.0, n2 + 3.0, n3 + 1.0), AllUtils.applyAlpha(ClientColors.PALE_ORANGE.color, 0.3f));
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
            GL11.glBlendFunc(770, 771);
            GL11.glEnable(3042);
            GL11.glEnable(2848);
            GL11.glDisable(3553);
            GL11.glEnable(2929);
            GL11.glDisable(2896);
            GL11.glDepthMask(false);
            final float n4 = 8.0f;
            if (true) {
                GL11.glPushMatrix();
                final int method19118 = AllUtils.applyAlpha(ClientColors.PALE_ORANGE.color, 0.5f);
                GL11.glColor4f((method19118 >> 16 & 0xFF) / 255.0f, (method19118 >> 8 & 0xFF) / 255.0f, (method19118 & 0xFF) / 255.0f, (method19118 >> 24 & 0xFF) / 255.0f);
                GL11.glTranslated(n + 0.5, n2 + 1.0099999904632568, n3 + 0.5);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 0.0f);
                GL11.glLineWidth(3.4f);
                this.method9983(n4);
                GL11.glPopMatrix();
            }
            final int method19119 = AllUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, 0.5f);
            final float n5 = (method19119 >> 24 & 0xFF) / 255.0f;
            final float n6 = (method19119 >> 16 & 0xFF) / 255.0f;
            final float n7 = (method19119 >> 8 & 0xFF) / 255.0f;
            final float n8 = (method19119 & 0xFF) / 255.0f;
            for (int n9 = 0; n9 < n4 - 1.0f; ++n9) {
                final float n10 = n9 / n4;
                final double cos = Math.cos(n10 * 3.141592653589793 / 2.0);
                GL11.glPushMatrix();
                GL11.glColor4f(n6, n7, n8, n5 * (1.0f - n10) * 0.25f);
                GL11.glTranslated(n + 0.5, n2 + 2.009999990463257 + n9, n3 + 0.5);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 0.0f);
                GL11.glLineWidth(3.4f);
                this.method9983((float)(n4 * cos));
                GL11.glPopMatrix();
            }
            for (int n11 = 0; n11 < n4 - 1.0f; ++n11) {
                final float n12 = n11 / n4;
                final double cos2 = Math.cos(n12 * 3.141592653589793 / 2.0);
                GL11.glPushMatrix();
                GL11.glColor4f(n6, n7, n8, n5 * (1.0f - n12) * 0.25f);
                GL11.glTranslated(n + 0.5, n2 - n11 + 0.009999999776482582, n3 + 0.45);
                GL11.glRotatef(90.0f, 0.0f, 0.0f, 0.0f);
                GL11.glLineWidth(3.4f);
                this.method9983((float)(n4 * cos2));
                GL11.glPopMatrix();
            }
            GL11.glEnable(3553);
            GL11.glDisable(2848);
            GL11.glDepthMask(true);
            GL11.glEnable(2896);
            GL11.glColor3f(1.0f, 1.0f, 1.0f);
        }
    }
    
    private void method9983(final float n) {
        GL11.glBegin(2);
        for (int i = 0; i < 360; ++i) {
            final double n2 = i * 3.141592653589793 / 180.0;
            GL11.glVertex2d(Math.cos(n2) * n, Math.sin(n2) * n);
        }
        GL11.glEnd();
    }
    
    @EventListener
    private void method9984(final UpdateWalkingEventI updateWalkingEvent) {
        if (!this.isEnabled()) {
            return;
        }
        if (this.field15569 == -1) {
            return;
        }
        if (this.field15570 == -1) {
            return;
        }
        if (this.field15568 != null) {
            if (this.field15571 != 0) {
                if (this.field15571 == 1) {
                    final float n = Class4609.method13673(this.field15568.method1137(), Direction.UP)[0];
                    final float n2 = Class4609.method13673(this.field15568.method1137(), Direction.UP)[1];
                    updateWalkingEvent.method17043(n);
                    updateWalkingEvent.method17041(n2);
                    final int field2743 = Auto32k.mc.player.inventory.field2743;
                    Auto32k.mc.player.inventory.field2743 = this.field15569;
                    final Class2201 method27319 = Auto32k.mc.playerController.method27319(Auto32k.mc.player, Auto32k.mc.world, Class316.field1877, new BlockRayTraceResult(Class4609.method13702(Direction.UP, this.field15568), Direction.UP, this.field15568, false));
                    Auto32k.mc.player.method2707(Class316.field1877);
                    if (method27319 == Class2201.field13400) {
                        ++this.field15571;
                        Auto32k.mc.method5269().method17292(new Class4336(Auto32k.mc.player, Class287.field1591));
                        Auto32k.mc.player.field4085.field24728 = true;
                        Auto32k.mc.player.inventory.field2743 = this.field15570;
                        final BlockRayTraceResult class5745 = new BlockRayTraceResult(Class4609.method13702(Direction.UP, this.field15568.method1137()), Direction.UP, this.field15568.method1137(), false);
                        Auto32k.mc.playerController.method27319(Auto32k.mc.player, Auto32k.mc.world, Class316.field1877, class5745);
                        Auto32k.mc.player.method2707(Class316.field1877);
                        Auto32k.mc.player.field4085.field24728 = false;
                        Auto32k.mc.method5269().method17292(new Class4336(Auto32k.mc.player, Class287.field1592));
                        Auto32k.mc.playerController.method27319(Auto32k.mc.player, Auto32k.mc.world, Class316.field1877, class5745);
                    }
                }
            }
            else {
                final float n3 = Class4609.method13673(this.field15568, Direction.UP)[0];
                final float n4 = Class4609.method13673(this.field15568, Direction.UP)[1];
                updateWalkingEvent.method17043(n3);
                updateWalkingEvent.method17041(n4);
                ++this.field15571;
            }
        }
    }
    
    @EventListener
    private void method9985(final EventReceivePacket eventReceivePacket) {
        if (this.isEnabled()) {
            if (eventReceivePacket.getPacket() instanceof Class4308) {
                this.field15574 = (Class4308) eventReceivePacket.getPacket();
                if (this.isEnabled()) {
                    if (this.field15574.method12952() == Class8471.field34770) {
                        eventReceivePacket.setCancelled(true);
                    }
                }
                this.field15572 = this.field15574.method12951();
                this.field15575 = false;
            }
            if (eventReceivePacket.getPacket() instanceof Class4272) {
                final Class4272 class5724 = (Class4272) eventReceivePacket.getPacket();
                final int method12820 = class5724.method12820();
                final ItemStack method12821 = class5724.method12821();
                final int method12822 = class5724.method12819();
                if (this.field15572 == method12822) {
                    if (method12820 == 0) {
                        if (method12821.getItem() != Items.AIR) {
                            if (!this.field15575) {
                                eventReceivePacket.setCancelled(true);
                                final Class5799 method12823 = Auto32k.mc.method5269();
                                final int n = method12822;
                                final int n2 = method12820;
                                final int n3 = 1;
                                final Class2133 field12438 = Class2133.field12438;
                                final ItemStack class5725 = method12821;
                                final short field12439 = this.field15573;
                                this.field15573 = (short)(field12439 + 1);
                                method12823.method17292(new Class4256(n, n2, n3, field12438, class5725, field12439));
                                int n4 = -1;
                                for (int i = 44; i > 9; --i) {
                                    if (Auto32k.mc.player.container.getSlot(i).method20053().method27620()) {
                                        n4 = i;
                                        break;
                                    }
                                }
                                if (n4 != -1) {
                                    Auto32k.mc.player.container.getSlot(n4).method20055(method12821);
                                    if (n4 >= 36) {
                                        Auto32k.mc.player.inventory.field2743 = n4 % 9;
                                    }
                                }
                                this.field15575 = true;
                            }
                        }
                    }
                }
            }
            if (eventReceivePacket.getPacket() instanceof Class4284) {
                this.method9909(false);
            }
        }
    }
    
    @EventListener
    private void method9986(final Class5721 class5721) {
        if (this.isEnabled()) {
            if (class5721.method16990() instanceof Class4389) {
                class5721.setCancelled(true);
            }
            if (class5721.method16990() instanceof Class4381) {
                final float n = Class4609.method13673(this.field15568.method1137(), Direction.UP)[0];
                final float n2 = Class4609.method13673(this.field15568.method1137(), Direction.UP)[1];
            }
            if (class5721.method16990() instanceof Class4353) {
                ((Class4353)class5721.method16990()).field19504 = false;
            }
        }
    }
}
