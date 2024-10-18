package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import lol.Texture;
import mapped.TextureLoader;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class ResourceList {
    public static Texture multiplayerPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/multiplayer.png");
    public static Texture optionsPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/options.png");
    public static Texture singleplayerPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/singleplayer.png");
    public static Texture shopPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/shop.png");
    public static Texture altPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/alt.png");
    public static Texture logoLargePNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/logo_large.png");
    public static Texture logoLarge2xPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/logo_large@2x.png");
    public static Texture verticalScrollBarTopPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbartop.png");
    public static Texture verticalScrollBarBottomPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbarbottom.png");
    public static Texture checkPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/check.png");
    public static Texture trashcanPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/trashcan.png");
    public static Texture jelloWatermarkPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark.png");
    public static Texture jelloWatermark2xPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark@2x.png");
    public static Texture shadowLeftPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_left.png");
    public static Texture shadowRightPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_right.png");
    public static Texture shadowTopPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_top.png");
    public static Texture shadowBottomPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_bottom.png");
    public static Texture shadowCorner1PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner.png");
    public static Texture shadowCorner2PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_2.png");
    public static Texture shadowCorner3PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_3.png");
    public static Texture shadowCorner4PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_4.png");
    public static Texture playPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/play.png");
    public static Texture pausePNG = loadTexture("com/mentalfrostbyte/gui/resources/music/pause.png");
    public static Texture forwardsPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/forwards.png");
    public static Texture backwardsPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/backwards.png");
    public static Texture bgPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/bg.png");
    public static Texture artworkPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/artwork.png");
    public static Texture particlePNG = loadTexture("com/mentalfrostbyte/gui/resources/music/particle.png");
    public static Texture repeatPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/repeat.png");
    public static Texture playIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/play-icon.png");
    public static Texture infoIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/info-icon.png");
    public static Texture shoutIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/shout-icon.png");
    public static Texture alertIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/alert-icon.png");
    public static Texture directionIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/direction-icon.png");
    public static Texture cancelIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/cancel-icon.png");
    public static Texture doneIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/done-icon.png");
    public static Texture gingerbreadIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/gingerbread-icon.png");
    public static Texture floatingBorderPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/floating_border.png");
    public static Texture floatingCornerPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/floating_corner.png");
    public static Texture cerclePNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/cercle.png");
    public static Texture selectPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/select.png");
    public static Texture activePNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/active.png");
    public static Texture errorsPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/errors.png");
    public static Texture shadowPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/shadow.png");
    public static Texture imgPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/img.png");
    public static Texture skinPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/skin.png");
    public static Texture loadingIndicatorPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/loading_indicator.png");
    public static Texture mentalfrostbytePNG = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/mentalfrostbyte.png");
    public static Texture sigmaPNG = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/sigma.png");
    public static Texture tomyPNG = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/tomy.png");
    public static Texture androPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/andro.png");
    public static Texture lpPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/lp.png");
    public static Texture cxPNG = loadTexture("com/mentalfrostbyte/gui/resources/user/cx.png");
    public static Texture codyPNG = loadTexture("com/mentalfrostbyte/gui/resources/user/cody.png");
    public static Texture accountPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/account.png");
    public static Texture waypointPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/waypoint.png");
    public static Texture noaddonsPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/noaddons.png");
    public static Texture jelloPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/jello.png");
    public static Texture sigmaLigmaPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/sigma.png");
    public static Texture searchPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/search.png");
    public static Texture optionsPNG1 = loadTexture("com/mentalfrostbyte/gui/resources/jello/options.png");
    public static Texture dvdPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/dvd.png");
    public static Texture gemPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/gem.png");
    public static Texture foregroundPNG = loadTexture("com/mentalfrostbyte/gui/resources/background/foreground.png");
    public static Texture backgroundPNG = loadTexture("com/mentalfrostbyte/gui/resources/background/background.png");
    public static Texture middlePNG = loadTexture("com/mentalfrostbyte/gui/resources/background/middle.png");
    public static Texture youtubePNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/youtube.png");
    public static Texture guildedPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/guilded.png");
    public static Texture redditPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/reddit.png");
    public static Texture panoramaPNG = createScaledAndProcessedTexture1("com/mentalfrostbyte/gui/resources/background/panorama5.png", 0.25F, 30);;

    public static Texture singlePlayer = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/singleplayer.png");;
    public static Texture multiplayer = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/multiplayer.png");
    public static Texture options = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/options.png");
    public static Texture language = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/language.png");
    public static Texture accounts = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/accounts.png");
    public static Texture exit = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/exit.png");
    public static Texture mainmenubackground = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/mainmenubackground.png");
    public static Texture big = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/big.png");
    public static Texture agora = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/agora.png");
    public static Texture checkbox = loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/checkbox.png");
    public static ClientResource regular28 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 28.0F);
    public static ClientResource regular25 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 25.0F);
    public static ClientResource regular20 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 20.0F);
    public static ClientResource regular17 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 17.0F);
    public static ClientResource regular15 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 15.0F);
    public static ClientResource regular12 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 12.0F);
    public static ClientResource bold22 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 22.0F);
    public static ClientResource bold18 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 18.0F);
    public static ClientResource bold16 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 16.0F);
    public static ClientResource bold14 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 14.0F);
    public static ClientResource medium17 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Medium.ttf", 0, 17.0F);

    public static Texture loadTexture(String filePath) {
        try {
            String extension = filePath.substring(filePath.lastIndexOf(".") + 1).toUpperCase();
            return loadTexture(filePath, extension);
        } catch (Exception e) {
            Client.getInstance().getLogger().error(
                    "Unable to load texture " + filePath +
                            ". Please make sure it is a valid path and has a valid extension."
            );
            throw e;
        }
    }

    public static Texture loadTexture(String filePath, String fileType) {
        try {
            return TextureLoader.getTexture(fileType, readInputStream(filePath));
        } catch (IOException e) {
            try (InputStream inputStream = readInputStream(filePath)) {
                byte[] header = new byte[8];
                inputStream.read(header);
                StringBuilder headerInfo = new StringBuilder();
                for (int value : header) {
                    headerInfo.append(" ").append(value);
                }
                throw new IllegalStateException("Unable to load texture " + filePath + " header: " + headerInfo);
            } catch (IOException ex) {
                throw new IllegalStateException("Unable to load texture " + filePath, ex);
            }
        }
    }

    public static InputStream readInputStream(String fileName) {
        try {
            // The file path within the Minecraft assets folder
            String assetPath = "assets/minecraft/" + fileName;

            // Attempt to load the resource directly from the classpath
            InputStream resourceStream = Client.getInstance().getClass().getClassLoader().getResourceAsStream(assetPath);

            if (resourceStream != null) {
                return resourceStream;
            } else {
                throw new IllegalStateException("Resource not found: " + assetPath);
            }
        } catch (Exception e) {
            throw new IllegalStateException(
                    "Unable to load resource " + fileName + ". Error during resource loading.", e
            );
        }
    }

    public static Texture createScaledAndProcessedTexture1(String var0, float var1, int var2) {
        try {
            BufferedImage var5 = ImageIO.read(readInputStream(var0));
            BufferedImage var6 = new BufferedImage((int) (var1 * (float) var5.getWidth(null)), (int) (var1 * (float) var5.getHeight(null)), 2);
            Graphics2D var7 = (Graphics2D) var6.getGraphics();
            var7.scale(var1, var1);
            var7.drawImage(var5, 0, 0, null);
            var7.dispose();
            var5 = ImageUtil.method35032(var6, var2);
            var5 = ImageUtil.method35042(var5, 0.0F, 1.3F, -0.35F);
            return TextureUtil.method32933(var0, var5);
        } catch (IOException var8) {
            throw new IllegalStateException(
                    "Unable to find " + var0 + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names."
            );
        }
    }

    public static Texture createScaledAndProcessedTexture2(String var0, float var1, int var2) {
        try {
            BufferedImage var5 = ImageIO.read(readInputStream(var0));
            BufferedImage var6 = new BufferedImage((int) (var1 * (float) var5.getWidth(null)), (int) (var1 * (float) var5.getHeight(null)), 2);
            Graphics2D var7 = (Graphics2D) var6.getGraphics();
            var7.scale(var1, var1);
            var7.drawImage(var5, 0, 0, null);
            var7.dispose();
            var5 = ImageUtil.method35032(ImageUtil.method35041(var6, var2), var2);
            var5 = ImageUtil.method35042(var5, 0.0F, 1.1F, 0.0F);
            return TextureUtil.method32933(var0, var5);
        } catch (IOException var8) {
            throw new IllegalStateException(
                    "Unable to find " + var0 + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names."
            );
        }
    }
}
