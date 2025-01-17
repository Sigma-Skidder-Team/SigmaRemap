// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte;

import java.util.Iterator;

import mapped.*;
import org.lwjgl.opengl.GL11;
import club.minnced.discord.rpc.DiscordRichPresence;
import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import org.lwjgl.glfw.GLFW;
import slick2d.Texture;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class Client
{
    public static final String field40678 = "Jello";
    public static final String field40679 = "5.0.0b6";
    public static final String field40680 = "Sigma Production";
    public static final boolean field40681 = false;
    private static Client field40682;
    private static Minecraft field40683;
    private final File field40684;
    private Class4405 field40685;
    private boolean field40686;
    private Class6658 field40687;
    private Class8678 field40688;
    private Class6883 field40689;
    private Class7060 field40690;
    private Class9070 field40691;
    private Class9000 field40692;
    private Class8706 field40693;
    private Class8949 field40694;
    private Class8491 field40695;
    private Class7643 field40696;
    private Class8617 field40697;
    private Class7861 field40698;
    private Class8707 field40699;
    private Class9198 field40700;
    private Class6466 field40701;
    private Class5837 field40702;
    private Class9086 field40703;
    private Class7951 field40704;
    private Class8434 field40705;
    private Class7658 field40706;
    private Class8088 field40707;
    private Class9367 field40708;
    private Class2209 field40709;
    public static ArrayList<Texture> field40710;
    public static boolean field40711;
    
    public static Client method35173() {
        return (Client.field40682 != null) ? Client.field40682 : (Client.field40682 = new Client());
    }
    
    public static Class6658 method35174() {
        return method35173().method35187();
    }
    
    private Client() {
        this.field40684 = new File("sigma5");
        this.field40686 = true;
        this.field40709 = Class2209.field13463;
    }
    
    public void method35175() {
        System.currentTimeMillis();
        Class9220.method34003();
        (this.field40687 = new Class6659(System.out, System.out, System.err)).method20240("Initializing...");
        try {
            if (!this.field40684.exists()) {
                this.field40684.mkdirs();
            }
            this.field40685 = Class9532.method35586(new File(this.field40684 + "/config.json"));
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
        this.field40688 = Class8678.method29718();
        this.field40689 = new Class6883();
        (this.field40691 = new Class9070()).method32666();
        ClientAssets.decryptTextures();
        (this.field40701 = new Class6466()).method19338();
        (this.field40702 = new Class5837()).method17548();
        this.field40692 = new Class9000();
        (this.field40693 = new Class8706()).method29876();
        (this.field40694 = new Class8949()).method31750();
        (this.field40695 = new Class8491()).method28365();
        (this.field40697 = new Class8617()).method29223();
        (this.field40705 = new Class8434()).method28160();
        (this.field40696 = new Class7643()).method24158();
        (this.field40703 = new Class9086()).method32831();
        (this.field40704 = new Class7951()).method25783();
        (this.field40698 = new Class7861()).method25457();
        (this.field40706 = new Class7658()).method24261();
        (this.field40699 = new Class8707()).method29895();
        (this.field40707 = new Class8088()).method26554();
        GLFW.glfwSetWindowTitle(Client.field40683.field4632.method7690(), (CharSequence)"Sigma 5.0");
        System.currentTimeMillis();
        this.method35177();
        this.field40687.method20240("Initialized.");
    }
    
    public void method35176() {
        final DiscordRPC instance = DiscordRPC.INSTANCE;
        final String s = "693493612754763907";
        final String s2 = "";
        final DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers();
        discordEventHandlers.ready = (p0 -> System.out.println("Ready!"));
        instance.Discord_Initialize(s, discordEventHandlers, true, s2);
        final DiscordRichPresence discordRichPresence = new DiscordRichPresence();
        discordRichPresence.startTimestamp = System.currentTimeMillis() / 1000L;
        discordRichPresence.state = "Playing Minecraft";
        discordRichPresence.details = "Jello for Sigma";
        discordRichPresence.largeImageKey = "jello";
        instance.Discord_UpdatePresence(discordRichPresence);
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                discordRPC.Discord_RunCallbacks();
                try {
                    Thread.sleep(2000L);
                    if (method35173().method35201().method19352() && (discordRichPresence2.smallImageKey == null || discordRichPresence2.smallImageKey.equals("premium"))) {
                        discordRichPresence2.smallImageKey = "premium";
                        discordRichPresence2.smallImageText = "Premium";
                        discordRPC.Discord_UpdatePresence(discordRichPresence2);
                    }
                    else {
                        continue;
                    }
                }
                catch (final InterruptedException ex) {}
            }
        }, "RPC-Callback-Handler").start();
    }
    
    public void method35177() {
    }
    
    public void method35178() {
        this.field40687.method20240("Shutting down...");
        try {
            if (this.field40692 != null) {
                this.field40692.method32142(this.field40685);
            }
            if (this.field40690 != null) {
                this.field40690.method21549(this.field40685);
            }
            final Class5736 class5736 = new Class5736(this.field40685);
            if (this.field40689 != null) {
                this.field40689.method21097(class5736);
            }
            Class9532.method35585(class5736.method17022(), new File(this.field40684 + "/config.json"));
        }
        catch (final IOException ex) {
            this.field40687.method20242("Unable to shutdown correctly. Config may be corrupt?");
            ex.printStackTrace();
        }
        this.field40687.method20240("Done.");
    }
    
    public void method35179() {
        try {
            Class9532.method35585(this.field40685, new File(this.field40684 + "/config.json"));
        }
        catch (final IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public void method35180() {
        this.field40692.method32134();
    }
    
    public void method35181() {
        GL11.glPushMatrix();
        final double n = Client.field40683.field4632.method7700() / (float)Math.pow(Client.field40683.field4632.method7700(), 2.0);
        GL11.glScaled(n, n, n);
        GL11.glScaled((double)Class9000.field37993, (double)Class9000.field37993, (double)Class9000.field37993);
        GL11.glDisable(2912);
        RenderSystem.disableDepthTest();
        RenderSystem.method30065(0.0f, 0.0f, 1000.0f);
        RenderSystem.method30000(519, 0.0f);
        RenderSystem.enableBlend();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        ClientAssets.gingerbread.bind();
        method35173().method35188().method21097(new Class5734());
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30028();
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.method30000(518, 0.1f);
        GL11.glPopMatrix();
    }
    
    public void method35182(final Texture e) {
        Client.field40710.add(e);
    }
    
    public void method35183() {
        if (!Client.field40710.isEmpty()) {
            final Iterator<Texture> iterator = Client.field40710.iterator();
            while (iterator.hasNext()) {
                iterator.next().method24923();
            }
            Client.field40710.clear();
        }
        if (method35173().method35209() != Class2209.field13466) {
            final double n = Client.field40683.field4632.method7700() / (float)Math.pow(Client.field40683.field4632.method7700(), 2.0);
            GL11.glScaled(n, n, 1.0);
            GL11.glScaled((double)Class9000.field37993, (double)Class9000.field37993, 1.0);
            RenderSystem.disableDepthTest();
            RenderSystem.method30059();
            RenderSystem.method30065(0.0f, 0.0f, 1000.0f);
            this.field40692.method32138();
            RenderSystem.method30060();
            RenderSystem.enableDepthTest();
            RenderSystem.enableAlphaTest();
            GL11.glAlphaFunc(518, 0.1f);
            final Class1663 method5290 = Client.field40683.method5290();
            Client.field40683.method5290();
            method5290.method5849(Class1663.field9428);
        }
    }
    
    public void method35184() {
        if (Client.field40683 != null) {
            if (Client.field40683.world != null) {
                if (Client.field40683.player != null) {
                    if (!Client.field40711) {
                        GL11.glTranslatef(0.0f, 0.0f, 0.0f);
                        RenderSystem.disableDepthTest();
                        RenderSystem.method30010(false);
                        GL11.glDisable(2896);
                        this.field40689.method21097(new Class5739());
                        RenderSystem.enableDepthTest();
                        RenderSystem.method30010(true);
                        final Class1663 method5290 = Client.field40683.method5290();
                        Client.field40683.method5290();
                        method5290.method5849(Class1663.field9428);
                    }
                }
            }
        }
    }
    
    public boolean method35185() {
        return this.field40686;
    }
    
    public void method35186(final boolean field40686) {
        this.field40686 = field40686;
    }
    
    public Class6658 method35187() {
        return this.field40687;
    }
    
    public Class6883 method35188() {
        return this.field40689;
    }
    
    public Class7060 method35189() {
        return this.field40690;
    }
    
    public Class8706 method35190() {
        return this.field40693;
    }
    
    public Class8949 method35191() {
        return this.field40694;
    }
    
    public Class8491 method35192() {
        return this.field40695;
    }
    
    public Class9000 method35193() {
        return this.field40692;
    }
    
    public Class8617 method35194() {
        return this.field40697;
    }
    
    public Class8434 method35195() {
        return this.field40705;
    }
    
    public Class9086 method35196() {
        return this.field40703;
    }
    
    public Class7951 method35197() {
        return this.field40704;
    }
    
    public Class7861 method35198() {
        return this.field40698;
    }
    
    public Class7643 method35199() {
        return this.field40696;
    }
    
    public Class7658 method35200() {
        return this.field40706;
    }
    
    public Class6466 method35201() {
        return this.field40701;
    }
    
    public Class8678 method35202() {
        return this.field40688;
    }
    
    public Class5837 method35203() {
        return this.field40702;
    }
    
    public Class9070 method35204() {
        return this.field40691;
    }
    
    public Class8088 method35205() {
        return this.field40707;
    }
    
    public Class4405 method35206() {
        return this.field40685;
    }
    
    public void method35207() {
        this.field40685 = new Class4405();
    }
    
    public File method35208() {
        return this.field40684;
    }
    
    public Class2209 method35209() {
        return this.field40709;
    }
    
    public void method35210(final Class2209 \u7d3f\uc854\uc3f2\u6f94\ub5d91) {
        this.field40709 = \u7d3f\uc854\uc3f2\u6f94\ub5d91;
        if (\u7d3f\uc854\uc3f2\u6f94\ub5d91 != Class2209.field13465) {
            if (\u7d3f\uc854\uc3f2\u6f94\ub5d91 == Class2209.field13464) {
                this.method35176();
                GLFW.glfwSetWindowTitle(Client.field40683.field4632.method7690(), (CharSequence)"Classic Sigma 5.0");
            }
        }
        else {
            Class9493.method35323();
            method35173().method35193().method32126();
            GLFW.glfwSetWindowTitle(Client.field40683.field4632.method7690(), (CharSequence)"Jello for Sigma 5.0");
        }
        if (this.field40690 == null) {
            if (Class1607.field8976 != null) {
                (this.field40690 = new Class7060()).method21544(this.field40709);
                this.field40690.method21548(this.field40685);
                this.field40690.method21547();
            }
        }
        System.gc();
    }
    
    static {
        Client.field40683 = Minecraft.method5277();
        Client.field40710 = new ArrayList<Texture>();
        Client.field40711 = false;
    }
}
