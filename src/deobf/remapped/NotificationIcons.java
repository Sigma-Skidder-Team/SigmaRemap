package remapped;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import org.apache.commons.codec.digest.DigestUtils;

public class NotificationIcons {
   public static class_8343 multiplayerBut;
   public static class_8343 optionsBut;
   public static class_8343 singleplayerBut;
   public static class_8343 shop;
   public static class_8343 alt;
   public static class_8343 logo_large;
   public static class_8343 logo_large2x;
   public static class_8343 verticalscrollbartop;
   public static class_8343 verticalscrollbarbottom;
   public static class_8343[] panorama5A = new class_8343[1];
   public static class_8343 check;
   public static class_8343 trashca;
   public static class_8343 watermark;
   public static class_8343 watermark2x;
   public static class_8343 shadow_left;
   public static class_8343 shadow_right;
   public static class_8343 shadow_top;
   public static class_8343 shadow_bottom;
   public static class_8343 shadow_corner;
   public static class_8343 shadow_corner_2;
   public static class_8343 shadow_corner_3;
   public static class_8343 shadow_corner_4;
   public static class_8343 panorama5;
   public static class_8343 musicplay;
   public static class_8343 musicpause;
   public static class_8343 musicforwards;
   public static class_8343 musicbackwards;
   public static class_8343 musicbg;
   public static class_8343 musicartwork;
   public static class_8343 musicparticle;
   public static class_8343 musicrepeat;
   public static class_8343 playicon;
   public static class_8343 infoicon;
   public static class_8343 shouticon;
   public static class_8343 alerticon;
   public static class_8343 directionicon;
   public static class_8343 cancelicon;
   public static class_8343 doneicon;
   public static class_8343 gingerbread;
   public static class_8343 floating_border;
   public static class_8343 floating_corner;
   public static class_8343 altcercle;
   public static class_8343 altselect;
   public static class_8343 altactive;
   public static class_8343 alterrors;
   public static class_8343 altshadow;
   public static class_8343 altimg;
   public static class_8343 altskin;
   public static class_8343 loadingindicator;
   public static class_8343 mentalfrostbyte;
   public static class_8343 sigmamental;
   public static class_8343 tomymental;
   public static class_8343 andro;
   public static class_8343 lp;
   public static class_8343 cx;
   public static class_8343 cody;
   public static class_8343 account;
   public static class_8343 waypoint;
   public static class_8343 noaddons;
   public static class_8343 jello;
   public static class_8343 sigma;
   public static class_8343 search;
   public static class_8343 options;
   public static class_8343 dvd;
   public static class_8343 gem;
   public static class_8343 foreground;
   public static class_8343 background;
   public static class_8343 middle;
   public static class_8343 youtube;
   public static class_8343 guilded;
   public static class_8343 reddit;
   private static byte[] field_10987 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   private static byte[] field_11002 = new byte[]{89, -73, -35, -84, 17, -87, -79, -44};
   public static final String resourcePath = "com/mentalfrostbyte/gui/resources/";

   public static void initList() {
      multiplayerBut = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/multiplayer.png");
      optionsBut = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/options.png");
      singleplayerBut = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/singleplayer.png");
      shop = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/shop.png");
      alt = loadTexture("com/mentalfrostbyte/gui/resources/jello/icons/alt.png");
      panorama5A[0] = loadTexture("com/mentalfrostbyte/gui/resources/" + getPanorama());
      logo_large = loadTexture("com/mentalfrostbyte/gui/resources/jello/logo_large.png");
      logo_large2x = loadTexture("com/mentalfrostbyte/gui/resources/jello/logo_large@2x.png");
      shadow_left = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_left.png");
      shadow_right = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_right.png");
      shadow_top = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_top.png");
      shadow_bottom = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_bottom.png");
      shadow_corner = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner.png");
      shadow_corner_2 = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_2.png");
      shadow_corner_3 = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_3.png");
      shadow_corner_4 = loadTexture("com/mentalfrostbyte/gui/resources/jello/shadow_corner_4.png");
      floating_corner = loadTexture("com/mentalfrostbyte/gui/resources/jello/floating_corner.png");
      floating_border = loadTexture("com/mentalfrostbyte/gui/resources/jello/floating_border.png");
      verticalscrollbartop = loadTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbartop.png");
      verticalscrollbarbottom = loadTexture("com/mentalfrostbyte/gui/resources/component/verticalscrollbarbottom.png");
      check = loadTexture("com/mentalfrostbyte/gui/resources/component/check.png");
      waypoint = loadTexture("com/mentalfrostbyte/gui/resources/component/waypoint.png");
      trashca = loadTexture("com/mentalfrostbyte/gui/resources/component/trashcan.png");
      gem = loadTexture("com/mentalfrostbyte/gui/resources/sigma/gem.png");
      watermark = loadTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark.png");
      watermark2x = loadTexture("com/mentalfrostbyte/gui/resources/sigma/jello_watermark@2x.png");
      musicplay = loadTexture("com/mentalfrostbyte/gui/resources/music/play.png");
      musicpause = loadTexture("com/mentalfrostbyte/gui/resources/music/pause.png");
      musicforwards = loadTexture("com/mentalfrostbyte/gui/resources/music/forwards.png");
      musicbackwards = loadTexture("com/mentalfrostbyte/gui/resources/music/backwards.png");
      musicbg = loadTexture("com/mentalfrostbyte/gui/resources/music/bg.png");
      musicartwork = loadTexture("com/mentalfrostbyte/gui/resources/music/artwork.png");
      musicparticle = loadTexture("com/mentalfrostbyte/gui/resources/music/particle.png");
      musicrepeat = loadTexture("com/mentalfrostbyte/gui/resources/music/repeat.png");
      playicon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/play-icon.png");
      infoicon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/info-icon.png");
      shouticon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/shout-icon.png");
      alerticon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/alert-icon.png");
      directionicon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/direction-icon.png");
      cancelicon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/cancel-icon.png");
      doneicon = loadTexture("com/mentalfrostbyte/gui/resources/notifications/done-icon.png");
      gingerbread = loadTexture("com/mentalfrostbyte/gui/resources/notifications/gingerbread-icon.png");
      altcercle = loadTexture("com/mentalfrostbyte/gui/resources/alt/cercle.png");
      altselect = loadTexture("com/mentalfrostbyte/gui/resources/alt/select.png");
      altactive = loadTexture("com/mentalfrostbyte/gui/resources/alt/active.png");
      alterrors = loadTexture("com/mentalfrostbyte/gui/resources/alt/errors.png");
      altshadow = loadTexture("com/mentalfrostbyte/gui/resources/alt/shadow.png");
      altimg = loadTexture("com/mentalfrostbyte/gui/resources/alt/img.png");
      altskin = loadTexture("com/mentalfrostbyte/gui/resources/alt/skin.png");
      noaddons = loadTexture("com/mentalfrostbyte/gui/resources/loading/noaddons.png");
      jello = loadTexture("com/mentalfrostbyte/gui/resources/loading/jello.png");
      sigma = loadTexture("com/mentalfrostbyte/gui/resources/loading/sigma.png");
      loadingindicator = loadTexture("com/mentalfrostbyte/gui/resources/jello/loading_indicator.png");
      search = loadTexture("com/mentalfrostbyte/gui/resources/jello/search.png");
      options = loadTexture("com/mentalfrostbyte/gui/resources/jello/options.png");
      mentalfrostbyte = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/mentalfrostbyte.png");
      sigmamental = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/sigma.png");
      tomymental = loadTexture("com/mentalfrostbyte/gui/resources/mentalfrostbyte/tomy.png");
      andro = loadTexture("com/mentalfrostbyte/gui/resources/sigma/andro.png");
      lp = loadTexture("com/mentalfrostbyte/gui/resources/sigma/lp.png");
      cx = loadTexture("com/mentalfrostbyte/gui/resources/user/cx.png");
      cody = loadTexture("com/mentalfrostbyte/gui/resources/user/cody.png");
      account = loadTexture("com/mentalfrostbyte/gui/resources/jello/account.png");
      foreground = loadTexture("com/mentalfrostbyte/gui/resources/background/foreground.png");
      background = loadTexture("com/mentalfrostbyte/gui/resources/background/background.png");
      middle = loadTexture("com/mentalfrostbyte/gui/resources/background/middle.png");
      youtube = loadTexture("com/mentalfrostbyte/gui/resources/loading/youtube.png");
      guilded = loadTexture("com/mentalfrostbyte/gui/resources/loading/guilded.png");
      reddit = loadTexture("com/mentalfrostbyte/gui/resources/loading/reddit.png");
      dvd = loadTexture("com/mentalfrostbyte/gui/resources/jello/dvd.png");
      panorama5 = processImage1("com/mentalfrostbyte/gui/resources/" + getPanorama(), 0.25F, 30);
   }

   public static class_8343 loadTexture(String var0) {
      try {
         String var3 = var0.substring(var0.lastIndexOf(".") + 1).toUpperCase();
         return processTexture(var0, var3);
      } catch (Exception var4) {
         var4.printStackTrace();
         SigmaMainClass.getInstance()
            .method_3326()
            .method_12864(
               "Unable to load texture "
                  + var0
                  + ". Please make sure it is a valid path and has a valid extension or load it directly from the load(name, type) function."
            );
         throw var4;
      }
   }

   public static class_8343 processTexture(String var0, String var1) {
      try {
         return class_2487.method_11386(var1, processBitmap(var0));
      } catch (IOException var24) {
         try (InputStream var5 = processBitmap(var0)) {
            byte[] var7 = new byte[8];
            var5.read(var7);
            StringBuilder var8 = new StringBuilder();

            for (byte var12 : var7) {
               var8.append(" ").append((int)var12);
            }

            throw new IllegalStateException("Unable to load texture " + var0 + " header" + var8.toString());
         } catch (IOException var23) {
            throw new IllegalStateException("Unable to load texture " + var0);
         }
      }
   }

   public static InputStream processBitmap(String var0) {
      try {
         String var3 = DigestUtils.sha1Hex(var0) + ".bmp";
         if (SigmaMainClass.getInstance().getClass().getClassLoader().getResource(var3) != null) {
            ByteArrayInputStream var41;
            try (
                    InputStream var4 = SigmaMainClass.getInstance().getClass().getClassLoader().getResourceAsStream(var3);
                    ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            ) {
               byte[] var8 = new byte[4096];
               int var9 = 0;

               int var10;
               while ((var10 = var4.read(var8)) > -1) {
                  for (int var11 = 0; var11 < var10; var11++) {
                     var8[var11] ^= field_11002[var9++ % field_11002.length];
                  }

                  var6.write(var8, 0, var10);
               }

               var41 = new ByteArrayInputStream(var6.toByteArray());
            }

            return var41;
         } else {
            return SigmaMainClass.getInstance().getClass().getClassLoader().getResourceAsStream(var0);
         }
      } catch (IOException var40) {
         throw new IllegalStateException(
            "Unable to find " + var0 + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names."
         );
      }
   }

   public static class_8343 processImage1(String var0, float var1, int var2) {
      try {
         BufferedImage var5 = ImageIO.read(processBitmap(var0));
         BufferedImage var6 = new BufferedImage((int)(var1 * (float)var5.getWidth(null)), (int)(var1 * (float)var5.getHeight(null)), 2);
         Graphics2D var7 = (Graphics2D)var6.getGraphics();
         var7.scale((double)var1, (double)var1);
         var7.drawImage(var5, 0, 0, null);
         var7.dispose();
         var5 = class_7849.method_35510(var6, var2);
         var5 = class_7849.method_35501(var5, 0.0F, 1.3F, -0.35F);
         return class_6568.method_30015(var0, var5);
      } catch (IOException var8) {
         throw new IllegalStateException(
            "Unable to find " + var0 + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names."
         );
      }
   }

   public static class_8343 processImage(String var0, float var1, int var2) {
      try {
         BufferedImage var5 = ImageIO.read(processBitmap(var0));
         BufferedImage var6 = new BufferedImage((int)(var1 * (float)var5.getWidth(null)), (int)(var1 * (float)var5.getHeight(null)), 2);
         Graphics2D var7 = (Graphics2D)var6.getGraphics();
         var7.scale((double)var1, (double)var1);
         var7.drawImage(var5, 0, 0, null);
         var7.dispose();
         var5 = class_7849.method_35510(class_7849.method_35502(var6, var2), var2);
         var5 = class_7849.method_35501(var5, 0.0F, 1.1F, 0.0F);
         return class_6568.method_30015(var0, var5);
      } catch (IOException var8) {
         throw new IllegalStateException(
            "Unable to find " + var0 + ". You've probably obfuscated the archive and forgot to transfer the assets or keep package names."
         );
      }
   }

   public static String getPanorama() {
      return "background/panorama5.png";
   }
}
