// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods.impl.player;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.combat.KillAura;
import com.mentalfrostbyte.jello.settings.impl.StringSetting;
import mapped.*;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.math.MathHelper;

import java.util.ArrayList;
import java.util.Arrays;

public class OldHitting extends Module
{
    public static boolean field15857;
    private boolean field15858;
    
    public OldHitting() {
        super(Category.PLAYER, "OldHitting", "Reverts to 1.7/1.8 hitting");
        this.addSetting(new StringSetting("Animation", "Animation mode", 0, "Vanilla", "Tap", "Tap2", "Slide", "Slide2", "Scale", "Leaked", "Ninja", "Down"));
        this.method9915(true);
    }
    
    @EventListener
    @HigherPriority
    private void method10435(final UpdateWalkingEventI updateWalkingEvent) {
        if (!this.isEnabled() && ViaManager.field40167 != Class7906.field32452) {
            return;
        }
        if (updateWalkingEvent.isPre()) {
            final boolean b = OldHitting.mc.player.getHeldItemMainhand() != null && OldHitting.mc.player.getHeldItemMainhand().getItem() instanceof SwordItem;
            final boolean method9898 = Client.getInstance().moduleManager().getModuleByClass(KillAura.class).method9898();
            boolean b2 = true;
            Label_0104: {
                if (!OldHitting.mc.player.method1809()) {
                    if (OldHitting.mc.field4691.getType() == RayTraceResult.Type.BLOCK) {
                        if (!Client.getInstance().moduleManager().getModuleByClass(KillAura.class).method9898()) {
                            final Block method9899 = OldHitting.mc.world.getBlockState(((BlockRayTraceResult) OldHitting.mc.field4691).getPos()).method21696();
                            if (!new ArrayList(Arrays.asList(Blocks.CHEST, Blocks.field29409, Blocks.field29468, Blocks.CRAFTING_TABLE, Blocks.field29417, Blocks.field29299, Blocks.BLAST_FURNACE, Blocks.field29398, Blocks.field29465, Blocks.field29466, Blocks.field29467, Blocks.field29216, Blocks.field29220, Blocks.field29316, Blocks.field29475, Blocks.field29481, Blocks.field29345, Blocks.field29471)).contains(method9899)) {
                                if (!(method9899 instanceof Class3907)) {
                                    if (!(method9899 instanceof Class3906)) {
                                        if (!(method9899 instanceof Class3898)) {
                                            if (!(method9899 instanceof Class3969)) {
                                                break Label_0104;
                                            }
                                            if (method9899 == Blocks.field29318) {
                                                break Label_0104;
                                            }
                                        }
                                    }
                                }
                            }
                            b2 = false;
                        }
                    }
                }
            }
            boolean field15857 = false;
            Label_0459: {
                Label_0446: {
                    if (OldHitting.mc.gameSettings.field23445.method1056()) {
                        if (b) {
                            if (b2) {
                                if (b2) {
                                    break Label_0446;
                                }
                            }
                        }
                    }
                    if (!method9898) {
                        field15857 = false;
                        break Label_0459;
                    }
                }
                field15857 = true;
            }
            if (!(OldHitting.field15857 = field15857)) {
                RotationManager.field34858.remove(OldHitting.mc.player);
            }
            else if (!RotationManager.field34858.contains(OldHitting.mc.player)) {
                RotationManager.field34858.add(OldHitting.mc.player);
            }
            if (OldHitting.field15857 && !this.field15858) {
                this.field15858 = !this.field15858;
                if (!method9898) {
                    ColorUtils.method19163();
                }
            }
            else if (!OldHitting.field15857) {
                if (this.field15858) {
                    this.field15858 = !this.field15858;
                }
            }
        }
    }
    
    @EventListener
    @LowerPriority
    private void method10436(final EventReceivePacket eventReceivePacket) {
        if (!this.isEnabled() && ViaManager.field40167 != Class7906.field32452) {
            return;
        }
        if (OldHitting.mc.player != null) {
            if (eventReceivePacket.getPacket() instanceof Class4402) {
                final Class4402 class5724 = (Class4402) eventReceivePacket.getPacket();
                if (class5724.method13247() != null) {
                    if (class5724.method13248() == OldHitting.mc.player.getEntityId()) {
                        if (class5724.method13247().getItem() instanceof Class4100) {
                            eventReceivePacket.setCancelled(true);
                        }
                    }
                }
            }
        }
    }
    
    @EventListener
    @LowerPriority
    private void method10437(final Class5716 class5716) {
        if (!this.isEnabled() && ViaManager.field40167 != Class7906.field32452) {
            return;
        }
        final float method16964 = class5716.method16964();
        if (class5716.method16966() && class5716.method16967() == Class2226.field13697 && class5716.method16968().getItem() instanceof Class4100) {
            class5716.method16971(false);
            return;
        }
        if (class5716.method16967() == Class2226.field13697 && OldHitting.field15857) {
            return;
        }
        if (OldHitting.field15857 && class5716.method16966()) {
            class5716.setCancelled(true);
            final String method16965 = this.getStringSettingValueByName("Animation");
            switch (method16965) {
                case "Vanilla": {
                    this.method10441(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Tap": {
                    this.method10442(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Tap2": {
                    this.method10443(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Slide": {
                    this.method10444(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Slide2": {
                    this.method10445(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Scale": {
                    this.method10446(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Leaked": {
                    this.method10447(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Ninja": {
                    this.method10440(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Tomy": {
                    this.method10439(0.0f, method16964, class5716.method16969());
                    break;
                }
                case "Down": {
                    this.method10448(0.0f, method16964, class5716.method16969());
                    break;
                }
            }
        }
    }
    
    private void method10438(final float n, final float n2, final float n3, final float n4, final MatrixStack class7351) {
        class7351.method22566(new Vector3f(n2, n3, n4).rotationDegrees(n));
    }
    
    private void method10439(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(method35638 * -20.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -20.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * -69.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10440(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.47999998927116394, -0.38999998569488525, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(100.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-50.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(n2 * 3.1415927f);
        this.method10438(method35638 * -10.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -30.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * 109.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-90.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10441(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(method35638 * -20.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -20.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * -69.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10442(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.0, -3.5, 0.0);
        class7351.method22564(0.5600000023841858, -0.5199999809265137, -0.7200000286102295);
        class7351.method22564(0.5600000023841858, -0.2199999988079071, -0.7199999690055847);
        this.method10438(45.0f, 0.0f, 1.0f, 0.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(0.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35638 * -9.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-9.0f, 0.0f, 0.0f, 1.0f, class7351);
        class7351.method22564(0.0, 3.200000047683716, 0.0);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        class7351.method22565(2.7f, 2.7f, 2.7f);
    }
    
    private void method10443(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.6480000019073486, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-method35638 * 10.0f, 1.0f, -2.0f, 3.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10444(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.6480000019073486, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-method35638 * 20.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10445(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.6f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(n2 * n2 * 3.1415927f);
        final float method35639 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(method35638 * -20.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(method35639 * -20.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(method35639 * -69.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10446(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, n * -0.2f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f - method35638 * 0.3f;
        class7351.method22565(n3, n3, n3);
    }
    
    private void method10447(final float n, final float n2, final MatrixStack class7351) {
        class7351.method22564(0.56, -0.52, -0.72);
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        this.method10438(method35638 * 10.0f, -4.0f, -2.0f, 5.0f, class7351);
        this.method10438(method35638 * 30.0f, 1.0f, -0.0f, -1.0f, class7351);
    }
    
    private void method10448(final float n, final float n2, final MatrixStack class7351) {
        final float method35638 = MathHelper.sin(MathHelper.method35640(n2) * 3.1415927f);
        class7351.method22564(0.47999998927116394, -0.550000011920929, -0.7199999690055847);
        class7351.method22564(0.0, method35638 * -0.2f, 0.0);
        this.method10438(77.0f, 0.0f, 1.0f, 0.0f, class7351);
        this.method10438(-10.0f, 0.0f, 0.0f, 1.0f, class7351);
        this.method10438(-80.0f, 1.0f, 0.0f, 0.0f, class7351);
        final float n3 = 1.2f;
        class7351.method22565(n3, n3, n3);
    }
    
    static {
        OldHitting.field15857 = false;
    }
}
