package com.mentalfrostbyte.jello.music;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.Class4413;
import com.mentalfrostbyte.jello.event.impl.Class4415;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class9133;
import com.mentalfrostbyte.jello.unmapped.Class9578;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.sapher.youtubedl.YoutubeDL;
import com.sapher.youtubedl.YoutubeDLException;
import com.sapher.youtubedl.YoutubeDLRequest;
import com.sapher.youtubedl.YoutubeDLResponse;
import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONObject;

import javax.imageio.ImageIO;
import javax.sound.sampled.*;
import javax.sound.sampled.FloatControl.Type;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class MusicManager {
    private static final float field32167 = 32768.0F;
    private static final Minecraft field32143 = Minecraft.getInstance();
    public BufferedImage field32149;
    public String field32150 = "";
    public List<double[]> field32163 = new ArrayList<double[]>();
    public ArrayList<Double> field32165 = new ArrayList<Double>();
    public SourceDataLine field32166;
    private boolean field32144 = false;
    private Class9578 field32145;
    private int field32146 = 50;
    private long field32147 = -1L;
    private final Thread field32148 = new Thread();
    private Texture field32151;
    private BufferedImage field32152;
    private Texture field32153;
    private boolean field32154 = false;
    private boolean field32155;
    private transient volatile Thread field32156 = null;
    private int field32157;
    private long field32158 = 0L;
    private int field32159;
    private Class9133 field32160;
    private boolean field32161 = true;
    private Class189 field32162 = Class189.field717;
    private boolean field32164 = false;
    private double field32168;
    private boolean field32169 = false;
    private double field32170 = 0.0;

    private static float[] method24305(byte[] var0, AudioFormat var1) {
        float[] var4 = new float[var0.length / var1.getFrameSize()];

        for (int var5 = 0; var5 < var0.length; var5 += var1.getFrameSize()) {
            int var6 = !var1.isBigEndian() ? method24307(var0, var5, var1.getFrameSize()) : method24308(var0, var5, var1.getFrameSize());
            var4[var5 / var1.getFrameSize()] = (float) var6 / 32768.0F;
        }

        return var4;
    }

    private static double[] method24306(float[] var0, float[] var1) {
        double[] var4 = new double[var0.length / 2];

        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5] = Math.sqrt(var0[var5] * var0[var5] + var1[var5] * var1[var5]);
        }

        return var4;
    }

    private static int method24307(byte[] var0, int var1, int var2) {
        int var5 = 0;

        for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var0[var1 + var6] & 255;
            var5 += var7 << 8 * var6;
        }

        return var5;
    }

    private static int method24308(byte[] var0, int var1, int var2) {
        int var5 = 0;

        for (int var6 = 0; var6 < var2; var6++) {
            int var7 = var0[var1 + var6] & 255;
            var5 += var7 << 8 * (var2 - var6 - 1);
        }

        return var5;
    }

    public void method24293() {
        Client.getInstance().getEventManager().register(this);
        this.method24295();
        if (!this.method24330()) {
            this.method24331();
        }

        this.field32164 = false;
    }

    public void method24294() {
        JSONObject var3 = new JSONObject();
        var3.put("volume", this.field32146);
        var3.method21800("spectrum", this.field32161);
        var3.put("repeat", this.field32162.field719);
        Client.getInstance().getConfig().put("music", var3);
    }

    private void method24295() {
        if (Client.getInstance().getConfig().has("music")) {
            JSONObject var3 = Client.getInstance().getConfig().method21769("music");
            if (var3 != null) {
                if (var3.has("volume")) {
                    this.field32146 = Math.max(0, Math.min(100, var3.method21767("volume")));
                }

                if (var3.has("spectrum")) {
                    this.field32161 = var3.method21763("spectrum");
                }

                if (var3.has("repeat")) {
                    this.field32162 = Class189.method578(var3.method21767("repeat"));
                }
            }
        }
    }

    @EventTarget
    private void method24296(Class4415 var1) {
        if (Client.getInstance().getClientMode() == ClientMode.JELLO) {
            if (this.field32144 && this.field32163.size() != 0) {
                double[] var4 = this.field32163.get(0);
                if (this.field32165.isEmpty()) {
                    for (int var5 = 0; var5 < var4.length; var5++) {
                        if (this.field32165.size() < 1024) {
                            this.field32165.add(var4[var5]);
                        }
                    }
                }

                float var10 = 60.0F / (float) Minecraft.getFps();

                for (int var6 = 0; var6 < var4.length; var6++) {
                    double var7 = this.field32165.get(var6) - var4[var6];
                    boolean var9 = !(this.field32165.get(var6) < Double.MAX_VALUE);
                    this.field32165.set(var6, Math.min(2.256E7, Math.max(0.0, this.field32165.get(var6) - var7 * (double) Math.min(0.335F * var10, 1.0F))));
                    if (var9) {
                        this.field32165.set(var6, 0.0);
                    }
                }

                if (this.field32165.isEmpty()) {
                }
            }
        }
    }

    @EventTarget
    private void method24297(Class4413 var1) {
        if (this.field32144 && this.field32163.size() != 0 && this.field32161) {
            this.method24298();
        }
    }

    private void method24298() {
        if (this.field32163.size() != 0) {
            if (this.field32151 != null) {
                if (this.field32165.size() != 0) {
                    float var3 = 114.0F;
                    float var4 = (float) Math.ceil((float) field32143.mainWindow.method8043() / var3);

                    for (int var5 = 0; (float) var5 < var3; var5++) {
                        float var6 = 1.0F - (float) (var5 + 1) / var3;
                        float var7 = (float) field32143.mainWindow.method8044() / 1080.0F;
                        float var8 = ((float) (Math.sqrt(this.field32165.get(var5)) / 12.0) - 5.0F) * var7;
                        RenderUtil.method11424(
                                (float) var5 * var4,
                                (float) field32143.mainWindow.method8044() - var8,
                                var4,
                                var8,
                                Class5628.method17688(ClientColors.MID_GREY.getColor, 0.2F * var6)
                        );
                    }

                    RenderUtil.method11476();

                    for (int var13 = 0; (float) var13 < var3; var13++) {
                        float var14 = (float) field32143.mainWindow.method8044() / 1080.0F;
                        float var15 = ((float) (Math.sqrt(this.field32165.get(var13)) / 12.0) - 5.0F) * var14;
                        RenderUtil.method11424((float) var13 * var4, (float) field32143.mainWindow.method8044() - var15, var4, var15, ClientColors.LIGHT_GREYISH_BLUE.getColor);
                    }

                    RenderUtil.method11477(Class2329.field15940);
                    if (this.field32151 != null && this.field32153 != null) {
                        RenderUtil.method11454(0.0F, 0.0F, (float) field32143.mainWindow.method8043(), (float) field32143.mainWindow.method8044(), this.field32153, 0.4F);
                    }

                    RenderUtil.method11478();
                    double var9 = 0.0;
                    short var16 = 4750;

                    for (int var17 = 0; var17 < 3; var17++) {
                        var9 = Math.max(var9, Math.sqrt(this.field32165.get(var17)) - 1000.0);
                    }

                    float var18 = 1.0F + (float) Math.round((float) (var9 / (double) (var16 - 1000)) * 0.14F * 75.0F) / 75.0F;
                    GL11.glPushMatrix();
                    GL11.glTranslated(60.0, field32143.mainWindow.method8044() - 55, 0.0);
                    GL11.glScalef(var18, var18, 0.0F);
                    GL11.glTranslated(-60.0, -(field32143.mainWindow.method8044() - 55), 0.0);
                    RenderUtil.method11455(10.0F, (float) (field32143.mainWindow.method8044() - 110), 100.0F, 100.0F, this.field32151);
                    RenderUtil.method11463(10.0F, (float) (field32143.mainWindow.method8044() - 110), 100.0F, 100.0F, 14.0F, 0.3F);
                    GL11.glPopMatrix();
                    String[] var11 = this.field32150.split(" - ");
                    int var12 = 30;
                    if (var11.length <= 1) {
                        RenderUtil.method11439(
                                ResourceRegistry.JelloLightFont18_1,
                                130.0F,
                                (float) (field32143.mainWindow.method8044() - 70),
                                var11[0],
                                Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.5F)
                        );
                        RenderUtil.method11439(
                                ResourceRegistry.JelloLightFont18,
                                130.0F,
                                (float) (field32143.mainWindow.method8044() - 70),
                                var11[0],
                                Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.7F)
                        );
                    } else {
                        RenderUtil.method11439(
                                ResourceRegistry.JelloMediumFont20_1,
                                130.0F,
                                (float) (field32143.mainWindow.method8044() - 81),
                                var11[0],
                                Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.4F)
                        );
                        RenderUtil.method11439(
                                ResourceRegistry.JelloLightFont18_1,
                                130.0F,
                                (float) (field32143.mainWindow.method8044() - 56),
                                var11[1],
                                Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.5F)
                        );
                        RenderUtil.method11439(
                                ResourceRegistry.JelloLightFont18,
                                130.0F,
                                (float) (field32143.mainWindow.method8044() - 56),
                                var11[1],
                                Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.7F)
                        );
                        RenderUtil.method11439(
                                ResourceRegistry.JelloMediumFont20,
                                130.0F,
                                (float) (field32143.mainWindow.method8044() - 81),
                                var11[0],
                                Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6F)
                        );
                    }
                }
            }
        }
    }

    @EventTarget
    private void method24299(TickEvent var1) {
        if (!this.field32144) {
            this.field32163.clear();
            this.field32165.clear();
        }

        try {
            if (this.field32154 && this.field32152 != null && this.field32149 != null && this.field32160 == null && !field32143.isGamePaused()) {
                if (this.field32153 != null) {
                    this.field32153.release();
                }

                if (this.field32151 != null) {
                    this.field32151.release();
                }

                this.field32153 = TextureUtil.method32933("picture", this.field32152);
                this.field32151 = TextureUtil.method32933("picture", this.field32149);
                Client.getInstance().getNotificationManager().post(new Notification("Now Playing", this.field32150, 7000, this.field32151));
                this.field32154 = false;
            }
        } catch (IOException var5) {
            var5.printStackTrace();
        }

        if (!this.field32154) {
            this.method24301(this.field32160);
        }
    }

    public Class9133 method24300() {
        int var3 = 0;
        return var3 >= this.field32145.field44778.size() ? null : this.field32145.field44778.get(var3);
    }

    private void method24301(Class9133 var1) {
        if (this.field32160 != null) {
            this.field32163.clear();
            new Thread(() -> this.method24309(this.field32160)).start();
        }
    }

    private void method24302() {
        this.field32163.clear();
        if (this.field32145 != null) {
            while (this.field32156 != null && this.field32156.isAlive()) {
                this.field32156.interrupt();
            }

            this.field32156 = new Thread(
                    () -> {
                        Object var3 = null;
                        if (this.field32159 < 0 || this.field32159 >= this.field32145.field44778.size()) {
                            this.field32159 = 0;
                        }

                        for (int var4 = this.field32159; var4 < this.field32145.field44778.size(); var4++) {
                            URL var5 = Class9275.method34960(this.field32145.field44778.get(var4).field41970);
                            Client.getClientLogger().dummyMethod(var5.toString());
                            this.field32157 = var4;
                            this.field32160 = this.field32145.field44778.get(var4);
                            this.field32163.clear();

                            while (!this.field32144) {
                                try {
                                    Thread.sleep(300L);
                                } catch (InterruptedException var23) {
                                }

                                double[] var6 = new double[0];
                                this.field32163.clear();
                                if (Thread.interrupted()) {
                                    if (this.field32166 != null) {
                                        this.field32166.close();
                                    }

                                    return;
                                }
                            }

                            try {
                                URL var28 = this.method24323(var5);
                                Client.getClientLogger().dummyMethod(var28 == null ? "No stream" : var28.toString());
                                if (var28 != null) {
                                    URLConnection var7 = var28.openConnection();
                                    var7.setConnectTimeout(14000);
                                    var7.setReadTimeout(14000);
                                    var7.setUseCaches(true);
                                    var7.setDoOutput(true);
                                    var7.setRequestProperty("Connection", "Keep-Alive");
                                    InputStream var8 = var7.getInputStream();
                                    Class1782 var9 = new Class1782(var8, new Class8808(this));
                                    Class8490 var10 = new Class8490(var9);
                                    Class8583 var11 = var10.method30073();
                                    List var12 = var11.method30672();
                                    if (var12.isEmpty()) {
                                        Client.getClientLogger().dummyMethod("No content");
                                    }

                                    Class7356 var13 = (Class7356) var11.method30672().get(1);
                                    AudioFormat var14 = new AudioFormat((float) var13.method23338(), var13.method23339(), var13.method23337(), true, true);
                                    this.field32166 = AudioSystem.getSourceDataLine(var14);
                                    this.field32166.open();
                                    this.field32166.start();
                                    this.field32147 = (long) var11.method30680();
                                    if (this.field32147 > 1300L) {
                                        var9.close();
                                        Client.getInstance().getNotificationManager().post(new Notification("Now Playing", "Music is too long."));
                                    }

                                    Class6542 var15 = new Class6542(var13.method23320());
                                    Class8210 var16 = new Class8210();

                                    while (var13.method23323()) {
                                        while (!this.field32144) {
                                            Thread.sleep(300L);
                                            double[] var17 = new double[0];
                                            this.field32163.clear();
                                            if (Thread.interrupted()) {
                                                this.field32166.close();
                                                return;
                                            }
                                        }

                                        Class1994 var18 = var13.method23324();
                                        var15.method19888(var18.method8282(), var16);
                                        var3 = var16.method28523();
                                        this.field32166.write((byte[]) var3, 0, ((Object[]) var3).length);
                                        float[] var29 = method24305(var16.method28523(), var14);
                                        Class7898 var19 = new Class7898(var29.length);
                                        float[][] var20 = var19.method26462(var29);
                                        float[] var21 = var20[0];
                                        float[] var22 = var20[1];
                                        this.field32163.add(method24306(var21, var22));
                                        if (this.field32163.size() > 18) {
                                            this.field32163.remove(0);
                                        }

                                        this.method24328(this.field32166, this.field32146);
                                        if (!Thread.interrupted()) {
                                            this.field32158 = Math.round(var13.method23327());
                                            this.field32170 = var13.method23326();
                                            if (this.field32169) {
                                                var13.method23325(this.field32168);
                                                this.field32158 = (long) this.field32168;
                                                this.field32169 = false;
                                            }
                                        }

                                        if (!var13.method23323()
                                                && (this.field32162 == Class189.field718 || this.field32162 == Class189.field717 && this.field32145.field44778.size() == 1)) {
                                            var13.method23325(0.0);
                                            this.field32158 = 0L;
                                        }

                                        if (Thread.interrupted()) {
                                            this.field32166.close();
                                            return;
                                        }
                                    }

                                    this.field32166.close();
                                    var9.close();
                                } else {
                                    Thread.sleep(1000L);
                                }
                            } catch (IOException var24) {
                                if (var24.getMessage() != null && var24.getMessage().contains("403")) {
                                    System.out.println("installing");
                                    this.method24332();
                                }
                            } catch (LineUnavailableException var25) {
                                var25.printStackTrace();
                            } catch (InterruptedException var26) {
                                var26.printStackTrace();
                                break;
                            }

                            if (this.field32162 == Class189.field718) {
                                var4--;
                            } else if (this.field32162 == Class189.field717 && var4 == this.field32145.field44778.size() - 1) {
                                var4 = -1;
                            } else if (this.field32162 == Class189.field716) {
                                return;
                            }

                            if (var4 < -1 || var4 >= this.field32145.field44778.size()) {
                                var4 = 0;
                            }
                        }
                    }
            );
            this.field32156.start();
        }
    }

    public void method24303(Class189 var1) {
        this.field32162 = var1;
        this.method24294();
    }

    public Class189 method24304() {
        return this.field32162;
    }

    public void method24309(Class9133 var1) {
        try {
            this.field32154 = true;
            BufferedImage var4 = ImageIO.read(new URL(var1.field41972));
            this.field32152 = ImageUtil.method35032(var4, 15);
            this.field32152 = this.field32152
                    .getSubimage(0, (int) ((float) this.field32152.getHeight() * 0.75F), this.field32152.getWidth(), (int) ((float) this.field32152.getHeight() * 0.2F));
            this.field32150 = var1.field41971;
            if (var4.getHeight() != var4.getWidth()) {
                if (this.field32150.contains("[NCS Release]")) {
                    this.field32149 = var4.getSubimage(1, 3, 170, 170);
                } else {
                    this.field32149 = var4.getSubimage(70, 0, 180, 180);
                }
            } else {
                this.field32149 = var4;
            }

            this.field32160 = null;
        } catch (IOException | NumberFormatException var5) {
            var5.printStackTrace();
        }
    }

    public void method24310(boolean var1) {
        if (!var1 && this.field32166 != null) {
            this.field32166.flush();
        }

        this.field32144 = var1;
    }

    public void method24311(int var1) {
        this.field32146 = var1;
        this.method24294();
    }

    public void method24312(boolean var1) {
        this.field32161 = var1;
        this.method24294();
    }

    public boolean method24313() {
        return this.field32161;
    }

    public int method24314() {
        return this.field32146;
    }

    public void method24315() {
        if (this.field32145 != null) {
            this.field32159 = this.field32157 - 1;
            this.field32158 = 0L;
            this.field32170 = 0.0;
            this.method24302();
        }
    }

    public void method24316() {
        if (this.field32145 != null) {
            this.field32159 = this.field32157 + 1;
            this.field32158 = 0L;
            this.field32170 = 0.0;
            this.method24302();
        }
    }

    public void method24317(Class9578 var1, Class9133 var2) {
        if (var1 == null) {
            var1 = new Class9578("temp", "temp", Class2125.field13868);
            var1.field44778.add(var2);
        }

        this.field32145 = var1;
        this.field32144 = true;
        this.field32158 = 0L;
        this.field32170 = 0.0;

        for (int var5 = 0; var5 < var1.field44778.size(); var5++) {
            if (var1.field44778.get(var5) == var2) {
                this.field32159 = var5;
            }
        }

        this.method24302();
    }

    public boolean method24318() {
        return true;
    }

    public boolean method24319() {
        return this.field32144;
    }

    public URL method24320() {
        return null;
    }

    public long method24321() {
        return this.field32158;
    }

    public double method24322() {
        return this.field32170;
    }

    public URL method24323(URL var1) {
        String var4 = var1.toString();
        String var5 = System.getProperty("user.home");
        YoutubeDLRequest var6 = new YoutubeDLRequest(var4, var5);
        var6.setOption("g");
        var6.setOption("no-check-certificate", " ");
        var6.setOption("rm-cache-dir", " ");
        var6.setOption("retries", 10);
        var6.setOption("f", 18);

        try {
            YoutubeDL.setExecutablePath(this.method24333());
            YoutubeDLResponse var7 = YoutubeDL.execute(var6);
            String var8 = var7.getOut();
            return new URL(var8);
        } catch (YoutubeDLException var9) {
            if (var9.getMessage() != null
                    && var9.getMessage().contains("ERROR: This video contains content from")
                    && var9.getMessage().contains("who has blocked it in your country on copyright grounds")) {
                Client.getInstance().getNotificationManager().post(new Notification("Now Playing", "Not available in your region."));
            } else {
                var9.printStackTrace();
                this.method24332();
            }
        } catch (MalformedURLException var10) {
            Class5628.method17678("URL E " + var10.toString());
            var10.printStackTrace();
        }

        return null;
    }

    public String method24324() {
        return this.field32150;
    }

    public Texture method24325() {
        return this.field32153;
    }

    public Texture method24326() {
        return this.field32151;
    }

    public int method24327() {
        return (int) this.field32147;
    }

    private void method24328(SourceDataLine var1, int var2) {
        try {
            FloatControl var5 = (FloatControl) var1.getControl(Type.MASTER_GAIN);
            BooleanControl var6 = (BooleanControl) var1.getControl(javax.sound.sampled.BooleanControl.Type.MUTE);
            if (var2 == 0) {
                var6.setValue(true);
            } else {
                var6.setValue(false);
                var5.setValue((float) (Math.log((double) var2 / 100.0) / Math.log(10.0) * 20.0));
            }
        } catch (Exception var7) {
        }
    }

    public void method24329(double var1) {
        this.field32168 = var1;
        this.field32158 = (long) this.field32168;
        this.field32169 = true;
    }

    public boolean method24330() {
        File var3 = new File(Client.getInstance().getFile() + "/music/youtube-dl");
        if (Util.getOSType() == OS.WINDOWS) {
            var3 = new File(Client.getInstance().getFile() + "/music/youtube-dl.exe");
        }

        return var3.exists();
    }

    public void method24331() {
        Client.getInstance().getLogger().dummyMethod("Updating dependencies threaded");
        new Thread(() -> this.method24332()).start();
    }

    public void method24332() {
        if (!this.field32164) {
            File var3 = new File(Client.getInstance().getFile() + "/music/");
            var3.mkdirs();
            Client.getInstance().getLogger().dummyMethod("Updating dependencies");
            if (Util.getOSType() == OS.WINDOWS) {
                try {
                    File var4 = new File(Client.getInstance().getFile() + "/music/youtube-dl.exe");
                    CloseableHttpClient var5 = HttpClients.createDefault();
                    CloseableHttpResponse var6 = var5.execute(new HttpGet("https://github.com/ytdl-org/youtube-dl/releases/download/2021.12.17/youtube-dl.exe"));
                    Throwable var7 = null;

                    try {
                        HttpEntity var8 = var6.getEntity();
                        if (var8 != null) {
                            try (FileOutputStream var9 = new FileOutputStream(var4)) {
                                var8.writeTo(var9);
                            }
                        }
                    } catch (Throwable var97) {
                        var7 = var97;
                        throw var97;
                    } finally {
                        if (var6 != null) {
                            if (var7 != null) {
                                try {
                                    var6.close();
                                } catch (Throwable var88) {
                                    var7.addSuppressed(var88);
                                }
                            } else {
                                var6.close();
                            }
                        }
                    }
                } catch (IOException var99) {
                    var99.printStackTrace();
                }
            } else {
                try {
                    File var100 = new File(Client.getInstance().getFile() + "/music/youtube-dl");
                    CloseableHttpClient var101 = HttpClients.createDefault();
                    CloseableHttpResponse var102 = var101.execute(new HttpGet("https://github.com/ytdl-org/youtube-dl/releases/download/2021.12.17/youtube-dl"));
                    Throwable var103 = null;

                    try {
                        HttpEntity var104 = var102.getEntity();
                        if (var104 != null) {
                            try (FileOutputStream var105 = new FileOutputStream(var100)) {
                                var104.writeTo(var105);
                            }
                        }
                    } catch (Throwable var93) {
                        var103 = var93;
                        throw var93;
                    } finally {
                        if (var102 != null) {
                            if (var103 != null) {
                                try {
                                    var102.close();
                                } catch (Throwable var86) {
                                    var103.addSuppressed(var86);
                                }
                            } else {
                                var102.close();
                            }
                        }
                    }
                } catch (IOException var95) {
                    var95.printStackTrace();
                }
            }

            System.out.println("done");
            this.field32164 = true;
        }
    }

    public String method24333() {
        String var3 = Client.getInstance().getFile().getAbsolutePath() + "/music/youtube-dl";
        if (Util.getOSType() != OS.WINDOWS) {
            File var4 = new File(var3);
            var4.setExecutable(true);
        } else {
            var3 = var3 + ".exe";
        }

        return var3;
    }

    public boolean method24334() {
        if (Util.getOSType() == OS.WINDOWS) {
            return true;
        } else {
            File var3 = new File("/usr/local/bin/python");
            if (var3.exists()) {
                Process var4 = null;

                try {
                    var4 = new ProcessBuilder("/usr/local/bin/python", "-V").start();
                    InputStream var5 = var4.getErrorStream();
                    InputStreamReader var6 = new InputStreamReader(var5);
                    BufferedReader var7 = new BufferedReader(var6);

                    String var8;
                    try {
                        while ((var8 = var7.readLine()) != null) {
                            if (var8.contains("2.7.17")) {
                                return true;
                            }
                        }
                    } catch (IOException var10) {
                    }
                } catch (IOException var11) {
                }
            }

            return false;
        }
    }

    public boolean method24335() {
        if (Util.getOSType() != OS.WINDOWS) {
            return true;
        } else {
            boolean var3 = false;

            try {
                var3 = Advapi32Util.registryGetIntValue(
                        WinReg.HKEY_LOCAL_MACHINE, "SOFTWARE\\WOW6432Node\\Microsoft\\VisualStudio\\10.0\\VC\\VCRedist\\x86", "Installed"
                )
                        == 1;
            } catch (RuntimeException var5) {
            }

            try {
                var3 = var3
                        || Advapi32Util.registryGetIntValue(WinReg.HKEY_LOCAL_MACHINE, "SOFTWARE\\Microsoft\\VisualStudio\\10.0\\VC\\VCRedist\\x86", "Installed") == 1;
            } catch (RuntimeException var6) {
            }

            return var3;
        }
    }
}
