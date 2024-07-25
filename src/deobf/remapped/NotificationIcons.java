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
   public static class_8343 field_11015;
   public static class_8343 field_11029;
   public static class_8343 field_11012;
   public static class_8343 field_10999;
   public static class_8343 field_10990;
   public static class_8343 field_11032;
   public static class_8343 field_11058;
   public static class_8343 field_11025;
   public static class_8343 field_11047;
   public static class_8343[] field_11059 = new class_8343[1];
   public static class_8343 field_11014;
   public static class_8343 field_11060;
   public static class_8343 field_10995;
   public static class_8343 field_11024;
   public static class_8343 field_11010;
   public static class_8343 field_11018;
   public static class_8343 field_10997;
   public static class_8343 field_10992;
   public static class_8343 field_11057;
   public static class_8343 field_11051;
   public static class_8343 field_11013;
   public static class_8343 field_11038;
   public static class_8343 field_11005;
   public static class_8343 field_11037;
   public static class_8343 field_11000;
   public static class_8343 field_11046;
   public static class_8343 field_11040;
   public static class_8343 field_11041;
   public static class_8343 field_11009;
   public static class_8343 field_11006;
   public static class_8343 field_11055;
   public static class_8343 field_11028;
   public static class_8343 field_11050;
   public static class_8343 field_11044;
   public static class_8343 field_11017;
   public static class_8343 field_10993;
   public static class_8343 field_11026;
   public static class_8343 field_11004;
   public static class_8343 field_11030;
   public static class_8343 field_11034;
   public static class_8343 field_10996;
   public static class_8343 field_11019;
   public static class_8343 field_11022;
   public static class_8343 field_11008;
   public static class_8343 field_11052;
   public static class_8343 field_11045;
   public static class_8343 field_11027;
   public static class_8343 field_10986;
   public static class_8343 field_11056;
   public static class_8343 field_11023;
   public static class_8343 field_11049;
   public static class_8343 field_11021;
   public static class_8343 field_11001;
   public static class_8343 field_11053;
   public static class_8343 field_10989;
   public static class_8343 field_11007;
   public static class_8343 field_11054;
   public static class_8343 field_10991;
   public static class_8343 field_11048;
   public static class_8343 field_11035;
   public static class_8343 field_11003;
   public static class_8343 field_11036;
   public static class_8343 field_11042;
   public static class_8343 field_11016;
   public static class_8343 field_11011;
   public static class_8343 field_11033;
   public static class_8343 field_11039;
   public static class_8343 field_10998;
   public static class_8343 field_11031;
   public static class_8343 field_10994;
   public static class_8343 field_11043;
   private static byte[] field_10987 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};
   private static byte[] field_11002 = new byte[]{89, -73, -35, -84, 17, -87, -79, -44};
   public static final String field_11020 = "com/mentalfrostbyte/gui/resources/";

   public static void method_10227() {
      field_11015 = method_10231("com/mentalfrostbyte/gui/resources/jello/icons/multiplayer.png");
      field_11029 = method_10231("com/mentalfrostbyte/gui/resources/jello/icons/options.png");
      field_11012 = method_10231("com/mentalfrostbyte/gui/resources/jello/icons/singleplayer.png");
      field_10999 = method_10231("com/mentalfrostbyte/gui/resources/jello/icons/shop.png");
      field_10990 = method_10231("com/mentalfrostbyte/gui/resources/jello/icons/alt.png");
      field_11059[0] = method_10231("com/mentalfrostbyte/gui/resources/" + method_10230());
      field_11032 = method_10231("com/mentalfrostbyte/gui/resources/jello/logo_large.png");
      field_11058 = method_10231("com/mentalfrostbyte/gui/resources/jello/logo_large@2x.png");
      field_11010 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_left.png");
      field_11018 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_right.png");
      field_10997 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_top.png");
      field_10992 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_bottom.png");
      field_11057 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_corner.png");
      field_11051 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_corner_2.png");
      field_11013 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_corner_3.png");
      field_11038 = method_10231("com/mentalfrostbyte/gui/resources/jello/shadow_corner_4.png");
      field_10996 = method_10231("com/mentalfrostbyte/gui/resources/jello/floating_corner.png");
      field_11034 = method_10231("com/mentalfrostbyte/gui/resources/jello/floating_border.png");
      field_11025 = method_10231("com/mentalfrostbyte/gui/resources/component/verticalscrollbartop.png");
      field_11047 = method_10231("com/mentalfrostbyte/gui/resources/component/verticalscrollbarbottom.png");
      field_11014 = method_10231("com/mentalfrostbyte/gui/resources/component/check.png");
      field_10991 = method_10231("com/mentalfrostbyte/gui/resources/component/waypoint.png");
      field_11060 = method_10231("com/mentalfrostbyte/gui/resources/component/trashcan.png");
      field_11011 = method_10231("com/mentalfrostbyte/gui/resources/sigma/gem.png");
      field_10995 = method_10231("com/mentalfrostbyte/gui/resources/sigma/jello_watermark.png");
      field_11024 = method_10231("com/mentalfrostbyte/gui/resources/sigma/jello_watermark@2x.png");
      field_11037 = method_10231("com/mentalfrostbyte/gui/resources/music/play.png");
      field_11000 = method_10231("com/mentalfrostbyte/gui/resources/music/pause.png");
      field_11046 = method_10231("com/mentalfrostbyte/gui/resources/music/forwards.png");
      field_11040 = method_10231("com/mentalfrostbyte/gui/resources/music/backwards.png");
      field_11041 = method_10231("com/mentalfrostbyte/gui/resources/music/bg.png");
      field_11009 = method_10231("com/mentalfrostbyte/gui/resources/music/artwork.png");
      field_11006 = method_10231("com/mentalfrostbyte/gui/resources/music/particle.png");
      field_11055 = method_10231("com/mentalfrostbyte/gui/resources/music/repeat.png");
      field_11028 = method_10231("com/mentalfrostbyte/gui/resources/notifications/play-icon.png");
      field_11050 = method_10231("com/mentalfrostbyte/gui/resources/notifications/info-icon.png");
      field_11044 = method_10231("com/mentalfrostbyte/gui/resources/notifications/shout-icon.png");
      field_11017 = method_10231("com/mentalfrostbyte/gui/resources/notifications/alert-icon.png");
      field_10993 = method_10231("com/mentalfrostbyte/gui/resources/notifications/direction-icon.png");
      field_11026 = method_10231("com/mentalfrostbyte/gui/resources/notifications/cancel-icon.png");
      field_11004 = method_10231("com/mentalfrostbyte/gui/resources/notifications/done-icon.png");
      field_11030 = method_10231("com/mentalfrostbyte/gui/resources/notifications/gingerbread-icon.png");
      field_11019 = method_10231("com/mentalfrostbyte/gui/resources/alt/cercle.png");
      field_11022 = method_10231("com/mentalfrostbyte/gui/resources/alt/select.png");
      field_11008 = method_10231("com/mentalfrostbyte/gui/resources/alt/active.png");
      field_11052 = method_10231("com/mentalfrostbyte/gui/resources/alt/errors.png");
      field_11045 = method_10231("com/mentalfrostbyte/gui/resources/alt/shadow.png");
      field_11027 = method_10231("com/mentalfrostbyte/gui/resources/alt/img.png");
      field_10986 = method_10231("com/mentalfrostbyte/gui/resources/alt/skin.png");
      field_11048 = method_10231("com/mentalfrostbyte/gui/resources/loading/noaddons.png");
      field_11035 = method_10231("com/mentalfrostbyte/gui/resources/loading/jello.png");
      field_11003 = method_10231("com/mentalfrostbyte/gui/resources/loading/sigma.png");
      field_11056 = method_10231("com/mentalfrostbyte/gui/resources/jello/loading_indicator.png");
      field_11036 = method_10231("com/mentalfrostbyte/gui/resources/jello/search.png");
      field_11042 = method_10231("com/mentalfrostbyte/gui/resources/jello/options.png");
      field_11023 = method_10231("com/mentalfrostbyte/gui/resources/mentalfrostbyte/mentalfrostbyte.png");
      field_11049 = method_10231("com/mentalfrostbyte/gui/resources/mentalfrostbyte/sigma.png");
      field_11021 = method_10231("com/mentalfrostbyte/gui/resources/mentalfrostbyte/tomy.png");
      field_11001 = method_10231("com/mentalfrostbyte/gui/resources/sigma/andro.png");
      field_11053 = method_10231("com/mentalfrostbyte/gui/resources/sigma/lp.png");
      field_10989 = method_10231("com/mentalfrostbyte/gui/resources/user/cx.png");
      field_11007 = method_10231("com/mentalfrostbyte/gui/resources/user/cody.png");
      field_11054 = method_10231("com/mentalfrostbyte/gui/resources/jello/account.png");
      field_11033 = method_10231("com/mentalfrostbyte/gui/resources/background/foreground.png");
      field_11039 = method_10231("com/mentalfrostbyte/gui/resources/background/background.png");
      field_10998 = method_10231("com/mentalfrostbyte/gui/resources/background/middle.png");
      field_11031 = method_10231("com/mentalfrostbyte/gui/resources/loading/youtube.png");
      field_10994 = method_10231("com/mentalfrostbyte/gui/resources/loading/guilded.png");
      field_11043 = method_10231("com/mentalfrostbyte/gui/resources/loading/reddit.png");
      field_11016 = method_10231("com/mentalfrostbyte/gui/resources/jello/dvd.png");
      field_11005 = method_10233("com/mentalfrostbyte/gui/resources/" + method_10230(), 0.25F, 30);
   }

   public static class_8343 method_10231(String var0) {
      try {
         String var3 = var0.substring(var0.lastIndexOf(".") + 1).toUpperCase();
         return method_10232(var0, var3);
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

   public static class_8343 method_10232(String var0, String var1) {
      try {
         return class_2487.method_11386(var1, method_10226(var0));
      } catch (IOException var24) {
         try (InputStream var5 = method_10226(var0)) {
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

   public static InputStream method_10226(String var0) {
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

   public static class_8343 method_10233(String var0, float var1, int var2) {
      try {
         BufferedImage var5 = ImageIO.read(method_10226(var0));
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

   public static class_8343 method_10229(String var0, float var1, int var2) {
      try {
         BufferedImage var5 = ImageIO.read(method_10226(var0));
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

   public static String method_10230() {
      return "background/panorama5.png";
   }
}
