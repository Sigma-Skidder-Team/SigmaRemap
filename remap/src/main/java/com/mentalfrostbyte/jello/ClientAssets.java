// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello;

import java.awt.Graphics2D;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

import com.mentalfrostbyte.Client;
import mapped.BufferedImage;
import mapped.BufferedImageUtil;
import mapped.Class9577;
import org.apache.commons.codec.digest.DigestUtils;
import slick2d.Texture;

import java.io.InputStream;

public class ClientAssets
{
    public static Texture multiplayer;
    public static Texture options;
    public static Texture singeplayer;
    public static Texture shop;
    public static Texture alt;
    public static Texture logo_large;
    public static Texture logo_large2x;
    public static Texture verticalscrollbartop;
    public static Texture verticalscrollbarbottom;
    public static Texture[] panorama;
    public static Texture check;
    public static Texture trashcan;
    public static Texture jello_watermark;
    public static Texture jello_watermark2x;
    public static Texture shadow_left;
    public static Texture shadow_right;
    public static Texture shadow_top;
    public static Texture shadow_bottom;
    public static Texture shadow_corner;
    public static Texture shadow_corner_2;
    public static Texture shadow_corner_3;
    public static Texture shadow_corner_4;
    public static Texture getBlurredPanorama;
    public static Texture playmusic;
    public static Texture pause;
    public static Texture forwards;
    public static Texture backwards;
    public static Texture bg;
    public static Texture artwork;
    public static Texture particle;
    public static Texture repeat;
    public static Texture play;
    public static Texture info;
    public static Texture shout;
    public static Texture alert;
    public static Texture direction;
    public static Texture cancel;
    public static Texture done;
    public static Texture gingerbread;
    public static Texture floating_border;
    public static Texture floating_corner;
    public static Texture cercle;
    public static Texture select;
    public static Texture active;
    public static Texture errors;
    public static Texture shadow;
    public static Texture img;
    public static Texture skin;
    public static Texture loading_indicator;
    public static Texture mentalfrostbyte;
    public static Texture sigma;
    public static Texture tomy;
    public static Texture andro;
    public static Texture lp;
    public static Texture cx;
    public static Texture cody;
    public static Texture account;
    public static Texture waypoint;
    public static Texture noaddons;
    public static Texture jello;
    public static Texture sigma2;
    public static Texture search;
    public static Texture options2;
    public static Texture dvd;
    public static Texture gem;
    public static Texture foreground;
    public static Texture background;
    public static Texture middle;
    public static Texture youtube;
    public static Texture guilded;
    public static Texture reddit;
    private static byte[] xorKey2;
    
    public static void decryptTextures() {
        ClientAssets.multiplayer = getTexture("com/mentalfrostbyte/gui/resources/jello/icons/multiplayer.png");
        ClientAssets.options = getTexture("com/mentalfrostbyte/gui/resources/jello/icons/options.png");
        ClientAssets.singeplayer = getTexture("com/mentalfrostbyte/gui/resources/jello/icons/singleplayer.png");
        ClientAssets.shop = getTexture("com/mentalfrostbyte/gui/resources/jello/icons/shop.png");
        ClientAssets.alt = getTexture("com/mentalfrostbyte/gui/resources/jello/icons/alt.png");
        ClientAssets.panorama[0] = getTexture("com/mentalfrostbyte/gui/resources/" + getPanorama());
        ClientAssets.logo_large = getTexture("com/mentalfrostbyte/gui/resources/jello/logo_large.png");
        ClientAssets.logo_large2x = getTexture("com/mentalfrostbyte/gui/resources/jello/logo_large@2x.png");
        ClientAssets.shadow_left = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_left.png");
        ClientAssets.shadow_right = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_right.png");
        ClientAssets.shadow_top = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_top.png");
        ClientAssets.shadow_bottom = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_bottom.png");
        ClientAssets.shadow_corner = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner.png");
        ClientAssets.shadow_corner_2 = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_2.png");
        ClientAssets.shadow_corner_3 = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_3.png");
        ClientAssets.shadow_corner_4 = getTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_4.png");
        ClientAssets.floating_corner = getTexture("com/mentalfrostbyte/gui/resources/jello/floating_corner.png");
        ClientAssets.floating_border = getTexture("com/mentalfrostbyte/gui/resources/jello/floating_border.png");
        ClientAssets.verticalscrollbartop = getTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbartop.png");
        ClientAssets.verticalscrollbarbottom = getTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbarbottom.png");
        ClientAssets.check = getTexture("com/mentalfrostbyte/gui/resources/component/check.png");
        ClientAssets.waypoint = getTexture("com/mentalfrostbyte/gui/resources/component/waypoint.png");
        ClientAssets.trashcan = getTexture("com/mentalfrostbyte/gui/resources/component/trashcan.png");
        ClientAssets.gem = getTexture("com/mentalfrostbyte/gui/resources/sigma/gem.png");
        ClientAssets.jello_watermark = getTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark.png");
        ClientAssets.jello_watermark2x = getTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark@2x.png");
        ClientAssets.playmusic = getTexture("com/mentalfrostbyte/gui/resources/music/play.png");
        ClientAssets.pause = getTexture("com/mentalfrostbyte/gui/resources/music/pause.png");
        ClientAssets.forwards = getTexture("com/mentalfrostbyte/gui/resources/music/forwards.png");
        ClientAssets.backwards = getTexture("com/mentalfrostbyte/gui/resources/music/backwards.png");
        ClientAssets.bg = getTexture("com/mentalfrostbyte/gui/resources/music/bg.png");
        ClientAssets.artwork = getTexture("com/mentalfrostbyte/gui/resources/music/artwork.png");
        ClientAssets.particle = getTexture("com/mentalfrostbyte/gui/resources/music/particle.png");
        ClientAssets.repeat = getTexture("com/mentalfrostbyte/gui/resources/music/repeat.png");
        ClientAssets.play = getTexture("com/mentalfrostbyte/gui/resources/notifications/play-icon.png");
        ClientAssets.info = getTexture("com/mentalfrostbyte/gui/resources/notifications/info-icon.png");
        ClientAssets.shout = getTexture("com/mentalfrostbyte/gui/resources/notifications/shout-icon.png");
        ClientAssets.alert = getTexture("com/mentalfrostbyte/gui/resources/notifications/alert-icon.png");
        ClientAssets.direction = getTexture("com/mentalfrostbyte/gui/resources/notifications/direction-icon.png");
        ClientAssets.cancel = getTexture("com/mentalfrostbyte/gui/resources/notifications/cancel-icon.png");
        ClientAssets.done = getTexture("com/mentalfrostbyte/gui/resources/notifications/done-icon.png");
        ClientAssets.gingerbread = getTexture("com/mentalfrostbyte/gui/resources/notifications/gingerbread-icon.png");
        ClientAssets.cercle = getTexture("com/mentalfrostbyte/gui/resources/alt/cercle.png");
        ClientAssets.select = getTexture("com/mentalfrostbyte/gui/resources/alt/select.png");
        ClientAssets.active = getTexture("com/mentalfrostbyte/gui/resources/alt/active.png");
        ClientAssets.errors = getTexture("com/mentalfrostbyte/gui/resources/alt/errors.png");
        ClientAssets.shadow = getTexture("com/mentalfrostbyte/gui/resources/alt/shadow.png");
        ClientAssets.img = getTexture("com/mentalfrostbyte/gui/resources/alt/img.png");
        ClientAssets.skin = getTexture("com/mentalfrostbyte/gui/resources/alt/skin.png");
        ClientAssets.noaddons = getTexture("com/mentalfrostbyte/gui/resources/loading/noaddons.png");
        ClientAssets.jello = getTexture("com/mentalfrostbyte/gui/resources/loading/jello.png");
        ClientAssets.sigma2 = getTexture("com/mentalfrostbyte/gui/resources/loading/sigma.png");
        ClientAssets.loading_indicator = getTexture("com/mentalfrostbyte/gui/resources/jello/loading_indicator.png");
        ClientAssets.search = getTexture("com/mentalfrostbyte/gui/resources/jello/search.png");
        ClientAssets.options2 = getTexture("com/mentalfrostbyte/gui/resources/jello/options.png");
        ClientAssets.mentalfrostbyte = getTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/mentalfrostbyte.png");
        ClientAssets.sigma = getTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/sigma.png");
        ClientAssets.tomy = getTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/tomy.png");
        ClientAssets.andro = getTexture("com/mentalfrostbyte/gui/resources/sigma/andro.png");
        ClientAssets.lp = getTexture("com/mentalfrostbyte/gui/resources/sigma/lp.png");
        ClientAssets.cx = getTexture("com/mentalfrostbyte/gui/resources/user/cx.png");
        ClientAssets.cody = getTexture("com/mentalfrostbyte/gui/resources/user/cody.png");
        ClientAssets.account = getTexture("com/mentalfrostbyte/gui/resources/jello/account.png");
        ClientAssets.foreground = getTexture("com/mentalfrostbyte/gui/resources/background/foreground.png");
        ClientAssets.background = getTexture("com/mentalfrostbyte/gui/resources/background/background.png");
        ClientAssets.middle = getTexture("com/mentalfrostbyte/gui/resources/background/middle.png");
        ClientAssets.youtube = getTexture("com/mentalfrostbyte/gui/resources/loading/youtube.png");
        ClientAssets.guilded = getTexture("com/mentalfrostbyte/gui/resources/loading/guilded.png");
        ClientAssets.reddit = getTexture("com/mentalfrostbyte/gui/resources/loading/reddit.png");
        ClientAssets.dvd = getTexture("com/mentalfrostbyte/gui/resources/jello/dvd.png");
        ClientAssets.getBlurredPanorama = method25395("com/mentalfrostbyte/gui/resources/" + getPanorama(), 0.25f, 30);
    }
    
    public static Texture getTexture(final String str) {
        try {
            return method25393(str, str.substring(str.lastIndexOf(".") + 1).toUpperCase());
        }
        catch (final Exception ex) {
            ex.printStackTrace();
            Client.getInstance().getLogger().error("Unable to load texture " + str + ". Please make sure it is a valid path and has a valid extension or load it directly from the load(name, type) function.");
            throw ex;
        }
    }
    
    public static Texture method25393(final String var0, final String var1) {
        try {
            return Class9577.method35873(var1, method25394(var0));
        } catch (IOException var24) {
            try {
                InputStream var5 = method25394(var0);
                Throwable var6 = null;

                try {
                    byte[] var7 = new byte[8];
                    var5.read(var7);
                    StringBuilder var8 = new StringBuilder();

                    for (byte var12 : var7) {
                        var8.append(" ").append(var12);
                    }

                    throw new IllegalStateException("Unable to load texture " + var0 + " header" + var8.toString());
                } catch (Throwable var21) {
                    var6 = var21;
                    throw var21;
                } finally {
                    if (var5 != null) {
                        if (var6 != null) {
                            try {
                                var5.close();
                            } catch (Throwable var20) {
                                var6.addSuppressed(var20);
                            }
                        } else {
                            var5.close();
                        }
                    }
                }
            } catch (IOException var23) {
                throw new IllegalStateException("Unable to load texture " + var0);
            }
        }
    }
    
    public static InputStream method25394(final String s) {
        try {
            final String string = DigestUtils.sha1Hex(s) + ".bmp";
            if (Client.getInstance().getClass().getClassLoader().getResource(string) != null) {
                try (final InputStream resourceAsStream = Client.getInstance().getClass().getClassLoader().getResourceAsStream(string);
                     final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
                    final byte[] array = new byte[4096];
                    int n = 0;
                    int read;
                    while ((read = resourceAsStream.read(array)) > -1) {
                        for (int i = 0; i < read; ++i) {
                            final byte[] array2 = array;
                            final int n2 = i;
                            array2[n2] ^= ClientAssets.xorKey2[n++ % ClientAssets.xorKey2.length];
                        }
                        byteArrayOutputStream.write(array, 0, read);
                    }
                    return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                }
            }
            return Client.getInstance().getClass().getClassLoader().getResourceAsStream(s);
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Unable to find " + s + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names.");
        }
    }
    
    public static Texture method25395(final String str, final float n, final int n2) {
        try {
            final java.awt.image.BufferedImage read = ImageIO.read(method25394(str));
            final java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage((int)(n * read.getWidth(null)), (int)(n * read.getHeight(null)), 2);
            final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.scale(n, n);
            graphics2D.drawImage(read, 0, 0, null);
            graphics2D.dispose();
            return BufferedImageUtil.getTexture(str, BufferedImage.method20836(BufferedImage.method20826(bufferedImage, n2), 0.0f, 1.3f, -0.35f));
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Unable to find " + str + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names.");
        }
    }
    
    public static Texture method25396(final String str, final float n, final int n2) {
        try {
            final java.awt.image.BufferedImage read = ImageIO.read(method25394(str));
            final java.awt.image.BufferedImage bufferedImage = new java.awt.image.BufferedImage((int)(n * read.getWidth(null)), (int)(n * read.getHeight(null)), 2);
            final Graphics2D graphics2D = (Graphics2D)bufferedImage.getGraphics();
            graphics2D.scale(n, n);
            graphics2D.drawImage(read, 0, 0, null);
            graphics2D.dispose();
            return BufferedImageUtil.getTexture(str, BufferedImage.method20836(BufferedImage.method20826(BufferedImage.method20835(bufferedImage, n2), n2), 0.0f, 1.1f, 0.0f));
        }
        catch (final IOException ex) {
            throw new IllegalStateException("Unable to find " + str + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names.");
        }
    }
    
    public static String getPanorama() {
        return "background/panorama5.png";
    }
    
    static {
        ClientAssets.panorama = new Texture[1];
        ClientAssets.xorKey2 = new byte[] { 89, -73, -35, -84, 17, -87, -79, -44 };
    }
}
