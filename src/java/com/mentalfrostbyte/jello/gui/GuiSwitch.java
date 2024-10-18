package com.mentalfrostbyte.jello.gui;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.ClientMode;
import com.mentalfrostbyte.jello.unmapped.*;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.render.animation.Direction;
import lol.ClientColors;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;

import java.net.MalformedURLException;
import java.net.URL;

public class GuiSwitch extends Screen {
    public static Animation field21069 = new Animation(300, 200, Direction.BACKWARDS);
    public static float field21070;
    public static float field21071;

    public GuiSwitch() {
        super("Switch");
        this.method13300(false);
        int var3 = 537;
        int var4 = 264;
        int var5 = 93;
        int var6 = 61;
        int var7 = (this.getWidthA() - var3) / 2;
        int var8 = (this.getHeightA() - var5) / 2 + 14;
        RectangleFaded var9 = null;
        RectangleFaded var10 = null;
        RectangleFaded var11 = null;
        this.addToList(var9 = new RectangleFaded(this, "pb", var7, var8, var3, var5, ResourcesDecrypter.noaddonsPNG));
        this.addToList(var11 = new RectangleFaded(this, "pb2", var7, var5 + var8 + 9, var4, var6, ResourcesDecrypter.sigmaLigmaPNG));
        this.addToList(var10 = new RectangleFaded(this, "pb3", var7 + var4 + 9, var5 + var8 + 9, var4, var6, ResourcesDecrypter.jelloPNG));
        var9.doThis((var0, var1) -> {
            Client.getInstance().setupClient(ClientMode.NOADDONS);
            Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
        });
        var10.doThis((var0, var1) -> {
            Client.getInstance().setupClient(ClientMode.JELLO);
            Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
        });
        var11.doThis((var0, var1) -> {
            Client.getInstance().setupClient(ClientMode.CLASSIC);
            Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
        });
        CustomGuiScreen var12 = new CustomGuiScreen(this, "socialbtns", (this.getWidthA() - 174) / 2, this.getHeightA() - 70, 174, 34);
        ImageQ var13;
        var12.addToList(var13 = new ImageQ(var12, "youtube", 0, 0, 65, 34, ResourcesDecrypter.youtubePNG));
        ImageQ var14;
        var12.addToList(var14 = new ImageQ(var12, "reddit", 85, 0, 36, 34, ResourcesDecrypter.redditPNG));
        ImageQ var15;
        var12.addToList(var15 = new ImageQ(var12, "guilded", 142, 0, 32, 34, ResourcesDecrypter.guildedPNG));
        var13.doThis((var0, var1) -> {
            try {
                Util.getOSType().openURL(new URL("https://www.youtube.com/@sigmaclient2950"));
            } catch (MalformedURLException var5x) {
            }
        });
        var14.doThis((var0, var1) -> {
            try {
                Util.getOSType().openURL(new URL("https://www.reddit.com/r/SigmaClient/"));
            } catch (MalformedURLException var5x) {
            }
        });
        var15.doThis((var0, var1) -> {
            try {
                Util.getOSType().openURL(new URL("https://discord.gg/KBGX8FTAXa"));
            } catch (MalformedURLException var5x) {
            }
        });
        this.addToList(var12);
    }

    @Override
    public void method13028(int var1, int var2) {
        float var5 = (float) var1 - field21070;
        float var6 = (float) var2 - field21071;
        field21070 += var5 * 0.09F;
        field21071 += var6 * 0.09F;
        super.method13028(var1, var2);
    }

    @Override
    public void draw(float var1) {
        if (CustomResourceLoadProgressGui.field6779 != null) {
            field21069.changeDirection(Direction.FORWARDS);
            int var4 = 40;
            float var5 = -field21070 / (float) Minecraft.getInstance().mainWindow.getWidth();
            float var6 = -field21071 / (float) Minecraft.getInstance().mainWindow.getHeight();
            RenderUtil.method11455(
                    (float) var4 * var5,
                    (float) var4 * var6,
                    (float) (Minecraft.getInstance().mainWindow.getWidth() + var4),
                    (float) (Minecraft.getInstance().mainWindow.getHeight() + var4),
                    CustomResourceLoadProgressGui.field6779
            );
            float var7 = MathUtils.lerp(field21069.calcPercent(), 0.16, 0.71, 0.0, 0.99);
            int var8 = (Minecraft.getInstance().mainWindow.getWidth() - 455) / 2;
            int var9 = (int) ((float) ((Minecraft.getInstance().mainWindow.getHeight() - 78) / 2 - 14) - 116.0F * var7);
            RenderUtil.renderBackgroundBox(
                    0.0F,
                    0.0F,
                    (float) Minecraft.getInstance().mainWindow.getWidth(),
                    (float) Minecraft.getInstance().mainWindow.getHeight(),
                    MultiUtilities.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.3F)
            );
            super.draw(var1);
            RenderUtil.drawImage(
                    0.0F,
                    0.0F,
                    (float) Minecraft.getInstance().mainWindow.getWidth(),
                    (float) Minecraft.getInstance().mainWindow.getHeight(),
                    CustomResourceLoadProgressGui.field6780,
                    MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 1.0F - field21069.calcPercent())
            );
            RenderUtil.renderBackgroundBox(
                    0.0F,
                    0.0F,
                    (float) Minecraft.getInstance().mainWindow.getWidth(),
                    (float) Minecraft.getInstance().mainWindow.getHeight(),
                    MultiUtilities.applyAlpha(0, 0.75F * (1.0F - field21069.calcPercent()))
            );
            RenderUtil.method11455((float) var8, (float) var9, 455.0F, 78.0F, CustomResourceLoadProgressGui.field6778);
        }
    }

    @Override
    public void keyPressed(int var1) {
        super.keyPressed(var1);
        if (var1 == 256) {
            Minecraft.getInstance().displayGuiScreen(new VanillaMainMenuScreen());
        }
    }
}
