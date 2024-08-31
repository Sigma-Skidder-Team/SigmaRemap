package com.mentalfrostbyte.jello.unmapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import mapped.Texture;
import mapped.TextureLoader;
import org.apache.commons.codec.digest.DigestUtils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResourcesDecrypter {
    public static final String field32485 = "com/mentalfrostbyte/gui/resources/";
    public static Texture multiplayerPNG;
    public static Texture optionsPNG;
    public static Texture singleplayerPNG;
    public static Texture shopPNG;
    public static Texture altPNG;
    public static Texture logoLargePNG;
    public static Texture logoLarge2xPNG;
    public static Texture verticalScrollBarTopPNG;
    public static Texture verticalScrollBarBottomPNG;
    public static Texture[] panoramaPNGs = new Texture[1];
    public static Texture checkPNG;
    public static Texture trashcanPNG;
    public static Texture jelloWatermarkPNG;
    public static Texture jelloWatermark2xPNG;
    public static Texture shadowLeftPNG;
    public static Texture shadowRightPNG;
    public static Texture shadowTopPNG;
    public static Texture shadowBottomPNG;
    public static Texture shadowCorner1PNG;
    public static Texture shadowCorner2PNG;
    public static Texture shadowCorner3PNG;
    public static Texture shadowCorner4PNG;
    public static Texture panoramaPNG;
    public static Texture playPNG;
    public static Texture pausePNG;
    public static Texture forwardsPNG;
    public static Texture backwardsPNG;
    public static Texture bgPNG;
    public static Texture artworkPNG;
    public static Texture particlePNG;
    public static Texture repeatPNG;
    public static Texture playIconPNG;
    public static Texture infoIconPNG;
    public static Texture shoutIconPNG;
    public static Texture alertIconPNG;
    public static Texture directionIconPNG;
    public static Texture cancelIconPNG;
    public static Texture doneIconPNG;
    public static Texture gingerbreadIconPNG;
    public static Texture floatingBorderPNG;
    public static Texture floatingCornerPNG;
    public static Texture cerclePNG;
    public static Texture selectPNG;
    public static Texture activePNG;
    public static Texture errorsPNG;
    public static Texture shadowPNG;
    public static Texture imgPNG;
    public static Texture skinPNG;
    public static Texture loadingIndicatorPNG;
    public static Texture mentalfrostbytePNG;
    public static Texture sigmaPNG;
    public static Texture tomyPNG;
    public static Texture androPNG;
    public static Texture lpPNG;
    public static Texture cxPNG;
    public static Texture codyPNG;
    public static Texture accountPNG;
    public static Texture waypointPNG;
    public static Texture noaddonsPNG;
    public static Texture jelloPNG;
    public static Texture sigmaLigmaPNG;
    public static Texture searchPNG;
    public static Texture optionsPNG1;
    public static Texture dvdPNG;
    public static Texture gemPNG;
    public static Texture foregroundPNG;
    public static Texture backgroundPNG;
    public static Texture middlePNG;
    public static Texture youtubePNG;
    public static Texture guildedPNG;
    public static Texture redditPNG;
    private static final byte[] xorKey = new byte[]{89, -73, -35, -84, 17, -87, -79, -44};

    public static void decrypt() {
        multiplayerPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/multiplayer.png");
        optionsPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/options.png");
        singleplayerPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/singleplayer.png");
        shopPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/shop.png");
        altPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/alt.png");
        panoramaPNGs[0] = loadTexture("com/mentalfrostbyte/gui/resources/" + getPanoramaPNG());
        logoLargePNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/logo_large.png");
        logoLarge2xPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/logo_large@2x.png");
        shadowLeftPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_left.png");
        shadowRightPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_right.png");
        shadowTopPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_top.png");
        shadowBottomPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_bottom.png");
        shadowCorner1PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner.png");
        shadowCorner2PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_2.png");
        shadowCorner3PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_3.png");
        shadowCorner4PNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_4.png");
        floatingCornerPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/floating_corner.png");
        floatingBorderPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/floating_border.png");
        verticalScrollBarTopPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbartop.png");
        verticalScrollBarBottomPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbarbottom.png");
        checkPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/check.png");
        waypointPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/waypoint.png");
        trashcanPNG = loadTexture("com/mentalfrostbyte/gui/resources/component/trashcan.png");
        gemPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/gem.png");
        jelloWatermarkPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark.png");
        jelloWatermark2xPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark@2x.png");
        playPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/play.png");
        pausePNG = loadTexture("com/mentalfrostbyte/gui/resources/music/pause.png");
        forwardsPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/forwards.png");
        backwardsPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/backwards.png");
        bgPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/bg.png");
        artworkPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/artwork.png");
        particlePNG = loadTexture("com/mentalfrostbyte/gui/resources/music/particle.png");
        repeatPNG = loadTexture("com/mentalfrostbyte/gui/resources/music/repeat.png");
        playIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/play-icon.png");
        infoIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/info-icon.png");
        shoutIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/shout-icon.png");
        alertIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/alert-icon.png");
        directionIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/direction-icon.png");
        cancelIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/cancel-icon.png");
        doneIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/done-icon.png");
        gingerbreadIconPNG = loadTexture("com/mentalfrostbyte/gui/resources/notifications/gingerbread-icon.png");
        cerclePNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/cercle.png");
        selectPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/select.png");
        activePNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/active.png");
        errorsPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/errors.png");
        shadowPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/shadow.png");
        imgPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/img.png");
        skinPNG = loadTexture("com/mentalfrostbyte/gui/resources/alt/skin.png");
        noaddonsPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/noaddons.png");
        jelloPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/jello.png");
        sigmaLigmaPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/sigma.png");
        loadingIndicatorPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/loading_indicator.png");
        searchPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/search.png");
        optionsPNG1 = loadTexture("com/mentalfrostbyte/gui/resources/jello/options.png");
        mentalfrostbytePNG = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/mentalfrostbyte.png");
        sigmaPNG = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/sigma.png");
        tomyPNG = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/tomy.png");
        androPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/andro.png");
        lpPNG = loadTexture("com/mentalfrostbyte/gui/resources/sigma/lp.png");
        cxPNG = loadTexture("com/mentalfrostbyte/gui/resources/user/cx.png");
        codyPNG = loadTexture("com/mentalfrostbyte/gui/resources/user/cody.png");
        accountPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/account.png");
        foregroundPNG = loadTexture("com/mentalfrostbyte/gui/resources/background/foreground.png");
        backgroundPNG = loadTexture("com/mentalfrostbyte/gui/resources/background/background.png");
        middlePNG = loadTexture("com/mentalfrostbyte/gui/resources/background/middle.png");
        youtubePNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/youtube.png");
        guildedPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/guilded.png");
        redditPNG = loadTexture("com/mentalfrostbyte/gui/resources/loading/reddit.png");
        dvdPNG = loadTexture("com/mentalfrostbyte/gui/resources/jello/dvd.png");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/activate.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/deactivate.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/click.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/error.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/pop.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/connect.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/switch.mp3");
        readInputStream("com/mentalfrostbyte/gui/resources/audio/clicksound.mp3");
        panoramaPNG = createScaledAndProcessedTexture1("com/mentalfrostbyte/gui/resources/" + getPanoramaPNG(), 0.25F, 30);
    }

    public static Texture loadTexture(String var0) {
        try {
            String var3 = var0.substring(var0.lastIndexOf(".") + 1).toUpperCase();
            return loadTexture(var0, var3);
        } catch (Exception var4) {
            var4.printStackTrace();
            Client.getInstance()
                    .getLogger()
                    .error(
                            "Unable to load texture "
                                    + var0
                                    + ". Please make sure it is a valid path and has a valid extension or load it directly from the load(name, type) function."
                    );
            throw var4;
        }
    }

    public static Texture loadTexture(String var0, String var1) {
        try {
            return TextureLoader.getTexture(var1, readInputStream(var0));
        } catch (IOException var24) {
            try (InputStream var5 = readInputStream(var0)) {
                byte[] var7 = new byte[8];
                var5.read(var7);
                StringBuilder var8 = new StringBuilder();

                for (int var12 : var7) {
                    var8.append(" ").append(var12);
                }

                throw new IllegalStateException("Unable to load texture " + var0 + " header" + var8);
            } catch (IOException var23) {
                throw new IllegalStateException("Unable to load texture " + var0);
            }
        }
    }

    public static InputStream readInputStream(String fileName) {
        try {
            String sha1HexResult = DigestUtils.sha1Hex(fileName);

            System.out.println(fileName + " : " + sha1HexResult);

            String encryptedFileName = sha1HexResult + ".bmp";

            InputStream resourceStream = Client.getInstance().getClass().getClassLoader().getResourceAsStream(encryptedFileName);

            if (resourceStream != null) {
                if (!Files.exists(Paths.get("lol"))) {
                    Files.createDirectory(Paths.get("lol"));
                }

                File outputFile = new File("lol", fileName);
                outputFile.getParentFile().mkdirs();

                try (OutputStream fileOutputStream = Files.newOutputStream(outputFile.toPath());
                     ByteArrayOutputStream decryptedOutputStream = new ByteArrayOutputStream()) {

                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    int xorIndex = 0;

                    while ((bytesRead = resourceStream.read(buffer)) != -1) {
                        for (int i = 0; i < bytesRead; i++) {
                            buffer[i] ^= xorKey[xorIndex++ % xorKey.length];
                        }
                        decryptedOutputStream.write(buffer, 0, bytesRead);
                    }

                    if (!Files.exists(outputFile.toPath())) {
                        decryptedOutputStream.writeTo(fileOutputStream);
                        System.out.println("Decrypted file saved to: " + outputFile.getAbsolutePath());
                    }
                    return new ByteArrayInputStream(decryptedOutputStream.toByteArray());
                }
            } else {
                return Client.getInstance().getClass().getClassLoader().getResourceAsStream(fileName);
            }
        } catch (IOException e) {
            throw new IllegalStateException(
                    "Unable to process " + fileName + ". Error during decryption or resource loading.", e
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

    public static String getPanoramaPNG() {
        return "background/panorama5.png";
    }
}
