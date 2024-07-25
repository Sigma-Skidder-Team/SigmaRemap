package remapped;

import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.minecraft.util.text.StringTextComponent;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class class_314 {
   private static final MinecraftClient field_1158 = MinecraftClient.getInstance();
   public static final float field_1159 = 0.3F;
   public static final float[] field_1162 = new float[4];
   public static final float[] field_1164 = new float[4];
   public static final Identifier field_1160 = new Identifier("shaders/post/blur.json");
   private static boolean field_1163 = false;

   public static void method_1443(String var0) {
      StringTextComponent var3 = new StringTextComponent(var0);
      field_1158.field_9614.method_13991().method_18676(var3);
   }

   public static void method_1423(String var0) {
      field_1158.method_8614().method_4813(new class_3211(var0));
   }

   public static List<class_704> method_1435() {
      ArrayList var2 = new ArrayList();
      field_1158.field_9601.field_568.forEach((var1, var2x) -> {
         if (var2x instanceof class_704) {
            var2.add((class_704)var2x);
         }
      });
      return var2;
   }

   public static Color method_1388(Color var0, Color var1, float var2) {
      float var5 = 1.0F - var2;
      float var6 = (float)var0.getRed() * var2 + (float)var1.getRed() * var5;
      float var7 = (float)var0.getGreen() * var2 + (float)var1.getGreen() * var5;
      float var8 = (float)var0.getBlue() * var2 + (float)var1.getBlue() * var5;
      return new Color(var6 / 255.0F, var7 / 255.0F, var8 / 255.0F);
   }

   public static Color method_1389(Color... var0) {
      if (var0 != null) {
         if (var0.length > 0) {
            float var3 = 1.0F / (float)var0.length;
            float var4 = 0.0F;
            float var5 = 0.0F;
            float var6 = 0.0F;
            float var7 = 0.0F;

            for (Color var11 : var0) {
               if (var11 == null) {
                  var11 = Color.BLACK;
               }

               var4 += (float)var11.getRed() * var3;
               var5 += (float)var11.getGreen() * var3;
               var6 += (float)var11.getBlue() * var3;
               var7 += (float)var11.getAlpha() * var3;
            }

            return new Color(var4 / 255.0F, var5 / 255.0F, var6 / 255.0F, var7 / 255.0F);
         } else {
            return Color.WHITE;
         }
      } else {
         return Color.WHITE;
      }
   }

   public static Entity method_1436(Entity var0, List<Entity> var1) {
      if (var1.size() <= 0) {
         return null;
      } else {
         Entity var4 = null;

         for (int var5 = 0; var5 < var1.size(); var5++) {
            if (var4 == null || var0.method_37175((Entity)var1.get(var5)) < var0.method_37175(var4)) {
               var4 = (Entity)var1.get(var5);
            }
         }

         return var4;
      }
   }

   public static final boolean method_1437(Entity var0) {
      class_174 var3 = field_1158.field_9601;
      class_4092 var4 = var0.field_41712;
      return var3.method_22550(var4);
   }

   public static final boolean method_1385(Entity var0) {
      double var3 = var0.method_37302() - var0.field_41754;
      double var5 = var0.method_37309() - var0.field_41713;
      double var7 = var0.method_37156() - var0.field_41724;
      return var3 != 0.0 || var5 != 0.0 || var7 != 0.0;
   }

   public static final boolean method_1434() {
      return field_1158.thePlayer.field_29676 != 0.0F || field_1158.thePlayer.field_29673 != 0.0F;
   }

   public static float[] method_1424(double var0, double var2, double var4) {
      double var8 = var0 - field_1158.thePlayer.method_37302();
      double var10 = var2 - (field_1158.thePlayer.method_37309() + (double)field_1158.thePlayer.method_37277());
      double var12 = var4 - field_1158.thePlayer.method_37156();
      double var14 = (double)class_9299.method_42842(var8 * var8 + var12 * var12);
      float var16 = (float)(Math.atan2(var12, var8) * 180.0 / Math.PI) - 90.0F;
      float var17 = (float)(-(Math.atan2(var10, var14) * 180.0 / Math.PI));
      return new float[]{
         field_1158.thePlayer.field_41701 + class_9299.method_42810(var16 - field_1158.thePlayer.field_41701),
         field_1158.thePlayer.field_41755 + class_9299.method_42810(var17 - field_1158.thePlayer.field_41755)
      };
   }

   public static int method_1444(int var0, float var1) {
      return (int)(var1 * 255.0F) << 24 | var0 & 16777215;
   }

   public static int method_1416(int var0) {
      Color var3 = new Color(var0);
      double var4 = (double)((299 * var3.getRed() + 587 * var3.getGreen() + 114 * var3.getBlue()) / 1000);
      return !(var4 >= 128.0) ? Color.white.getRGB() : Color.black.getRGB();
   }

   public static int method_1442(int var0, int var1, float var2) {
      int var5 = var0 >> 24 & 0xFF;
      int var6 = var0 >> 16 & 0xFF;
      int var7 = var0 >> 8 & 0xFF;
      int var8 = var0 & 0xFF;
      int var9 = var1 >> 24 & 0xFF;
      int var10 = var1 >> 16 & 0xFF;
      int var11 = var1 >> 8 & 0xFF;
      int var12 = var1 & 0xFF;
      float var13 = 1.0F - var2;
      float var14 = (float)var5 * var2 + (float)var9 * var13;
      float var15 = (float)var6 * var2 + (float)var10 * var13;
      float var16 = (float)var7 * var2 + (float)var11 * var13;
      float var17 = (float)var8 * var2 + (float)var12 * var13;
      return (int)var14 << 24 | ((int)var15 & 0xFF) << 16 | ((int)var16 & 0xFF) << 8 | (int)var17 & 0xFF;
   }

   public static int method_1401(int var0, float var1) {
      int var4 = var0 >> 24 & 0xFF;
      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = (int)((float)var5 * (1.0F - var1));
      int var9 = (int)((float)var6 * (1.0F - var1));
      int var10 = (int)((float)var7 * (1.0F - var1));
      return var4 << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
   }

   public static int method_1455(int var0, float var1) {
      int var4 = var0 >> 24 & 0xFF;
      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = (int)((float)var5 + (float)(255 - var5) * var1);
      int var9 = (int)((float)var6 + (float)(255 - var6) * var1);
      int var10 = (int)((float)var7 + (float)(255 - var7) * var1);
      return var4 << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
   }

   public static String method_1467(String var0) {
      return var0.replaceAll("(?i)&([a-f0-9])", "§$1");
   }

   public boolean method_1391(char var1) {
      return "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
            .indexOf(var1)
         != -1;
   }

   public static void method_1425(String var0) {
      try {
         Desktop var3 = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
         if (var3 != null && var3.isSupported(Action.BROWSE)) {
            try {
               var3.browse(new URI(var0));
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }
      } catch (Exception var6) {
      }
   }

   public static List<String> method_1457(String var0) {
      String var3 = null;
      Object var4 = new ArrayList();

      try {
         var3 = method_1404(var0);
      } catch (Exception var7) {
      }

      if (var3 == null) {
         return (List<String>)var4;
      } else {
         try {
            var4 = method_1414(var3);
         } catch (Exception var6) {
         }

         return (List<String>)var4;
      }
   }

   public static String method_1404(String var0) throws Exception {
      URL var3 = new URL("https://api.mojang.com/users/profiles/minecraft/" + var0);
      BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.openStream()));
      String var5 = "";

      String var6;
      while ((var6 = var4.readLine()) != null) {
         var5 = var5 + var6;
      }

      var4.close();
      JSONObjectImpl var7 = new JSONObjectImpl(var5);
      return var7.method_5861("id");
   }

   public static String method_1382(String var0) throws Exception {
      String var3 = "";
      String var4 = method_1404(var0);
      URL var5 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + var4);
      BufferedReader var6 = new BufferedReader(new InputStreamReader(var5.openStream()));
      String var7 = "";

      String var8;
      while ((var8 = var6.readLine()) != null) {
         var7 = var7 + var8;
      }

      String var9 = "";
      JSONObjectImpl var10 = new JSONObjectImpl(var7);

      for (Object var13 : var10.method_5849("properties")) {
         JSONObjectImpl var14 = (JSONObjectImpl)var13;
         if (var14.method_5850("value") && var14.method_5850("name")) {
            var9 = var14.method_5861("value");
         }
      }

      if (Base64.isBase64(var9)) {
         String var15 = new String(Base64.decodeBase64(var9));
         JSONObjectImpl var16 = new JSONObjectImpl(var15);
         if (var16.method_5850("textures")) {
            JSONObjectImpl var17 = var16.method_5848("textures");
            if (var17.method_5850("SKIN")) {
               var3 = var17.method_5848("SKIN").method_5861("url");
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   public static String method_1411(String var0) throws Exception {
      String var3 = "";
      URL var4 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + var0);
      BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
      String var6 = "";

      String var7;
      while ((var7 = var5.readLine()) != null) {
         var6 = var6 + var7;
      }

      String var8 = "";
      JSONObjectImpl var9 = new JSONObjectImpl(var6);

      for (Object var12 : var9.method_5849("properties")) {
         JSONObjectImpl var13 = (JSONObjectImpl)var12;
         if (var13.method_5850("value") && var13.method_5850("name")) {
            var8 = var13.method_5861("value");
         }
      }

      if (Base64.isBase64(var8)) {
         String var14 = new String(Base64.decodeBase64(var8));
         JSONObjectImpl var15 = new JSONObjectImpl(var14);
         if (var15.method_5850("textures")) {
            JSONObjectImpl var16 = var15.method_5848("textures");
            System.out.println("tex");
            if (var16.method_5850("SKIN")) {
               var3 = var16.method_5848("SKIN").method_5861("url");
            }
         }

         System.out.println(var3);
         return var3;
      } else {
         return var3;
      }
   }

   public static List<String> method_1414(String var0) throws Exception {
      ArrayList var3 = new ArrayList();
      String var4 = "";
      System.out.println("https://api.mojang.com/user/profiles/" + var0.replaceAll("-", "") + "/names");
      CloseableHttpClient var5 = HttpClients.createDefault();
      HttpGet var6 = new HttpGet("https://api.mojang.com/user/profiles/" + var0.replaceAll("-", "") + "/names");
      CloseableHttpResponse var7 = var5.execute(var6);
      int var8 = var7.getStatusLine().getStatusCode();
      if (var8 == 204) {
         ArrayList var15 = new ArrayList();
         var15.add("Unknown Name");
         return var15;
      } else {
         try {
            var4 = EntityUtils.toString(var7.getEntity());
         } finally {
            var7.close();
         }

         JSONArray var9 = new JSONArray(var4);

         for (int var10 = 0; var10 < var9.method_6142(); var10++) {
            JSONObjectImpl var11 = new JSONObjectImpl(var9.method_6130(var10).toString());
            var3.add(var11.method_5861("name"));
         }

         return var3;
      }
   }

   public static float[] method_1464(float var0, float var1, float var2, float var3) {
      float var6 = var0 / var1;
      float var7 = var2 / var3;
      float var8 = 0.0F;
      float var9 = 0.0F;
      if (!(var7 <= var6)) {
         var8 = var2;
         var9 = var1 * var2 / var0;
      } else {
         var8 = var0 * var3 / var1;
         var9 = var3;
      }

      float var10 = (var2 - var8) / 2.0F;
      float var11 = (var3 - var9) / 2.0F;
      return new float[]{var10, var11, var8, var9};
   }

   public static float method_1427(float var0, float var1, float var2) {
      float var5 = class_9299.method_42810(var1 - var0);
      if (var5 > var2) {
         var5 = var2;
      }

      if (var5 < -var2) {
         var5 = -var2;
      }

      return var0 + var5;
   }

   public static float method_1415(Integer[] var0) {
      int var3 = var0.length / 2;
      return var0.length % 2 != 1 ? (float)(var0[var3 - 1] + var0[var3]) / 2.0F : (float)var0[var3].intValue();
   }

   public static int method_1446(Color var0) {
      int var3 = var0.getRed();
      int var4 = var0.getGreen();
      int var5 = var0.getBlue();
      var3 = var3 << 16 & 0xFF0000;
      var4 = var4 << 8 & 0xFF00;
      var5 &= 255;
      return 0xFF000000 | var3 | var4 | var5;
   }

   public static int method_1448() {
      for (class_753 var3 : field_1158.method_8614().method_4798()) {
         if (var3.method_3392().getId().equals(field_1158.thePlayer.method_37328()) && !field_1158.method_8566()) {
            return var3.method_3394();
         }
      }

      return 0;
   }

   public static Color method_1394(float var0) {
      float var3 = 14000.0F;
      float var4 = (float)(System.currentTimeMillis() % (long)((int)var3)) / var3;
      Color var5 = new Color((int)Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var4, 1.0F, 1.0F))), 16));
      return new Color(
         (float)var5.getRed() / 255.0F * var0, (float)var5.getGreen() / 255.0F * var0, (float)var5.getBlue() / 255.0F * var0, (float)var5.getAlpha() / 255.0F
      );
   }

   public static Color method_1395(float var0, int var1) {
      float var4 = (float)(((long)var1 + System.currentTimeMillis()) % (long)((int)var0)) / var0;
      Color var5 = new Color((int)Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var4, 1.0F, 1.0F))), 16));
      return new Color((float)var5.getRed() / 255.0F, (float)var5.getGreen() / 255.0F, (float)var5.getBlue() / 255.0F, (float)var5.getAlpha() / 255.0F);
   }

   public static List<Entity> method_1440() {
      ArrayList var2 = new ArrayList();
      field_1158.field_9601.field_568.forEach((var1, var2x) -> var2.add(var2x));
      return var2;
   }

   public static float[] method_1412(int var0) {
      float var3 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      float var4 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var5 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var6 = (float)(var0 & 0xFF) / 255.0F;
      return new float[]{var4, var5, var6, var3};
   }

   public static float method_1407(int var0) {
      return (float)(var0 >> 24 & 0xFF) / 255.0F;
   }

   public static Entity method_1458(float var0, float var1, float var2, double var3) {
      class_5631 var7 = method_1461(var0, var1, var2, var3);
      return var7 == null ? null : var7.method_25524();
   }

   public static class_5631 method_1461(float var0, float var1, float var2, double var3) {
      class_1343 var7 = new class_1343(
         field_1158.thePlayer.method_37302(),
         field_1158.thePlayer.method_37309() + (double)field_1158.thePlayer.method_37277(),
         field_1158.thePlayer.method_37156()
      );
      Entity var8 = field_1158.getRenderViewEntity();
      if (var8 != null && field_1158.field_9601 != null) {
         double var9 = (double)field_1158.playerController.method_42146();
         if (var2 != 0.0F) {
            var9 = (double)var2;
         }

         class_1343 var11 = method_1449(var1, var0);
         class_1343 var12 = var7.method_6214(var11.field_7336 * var9, var11.field_7333 * var9, var11.field_7334 * var9);
         float var13 = 1.0F;
         class_4092 var14 = var8.method_37241().method_18929(var11.method_6209(var9)).method_18899(1.0, 1.0, 1.0);
         return method_1433(
            field_1158.field_9601, var8, var7, var12, var14, var0x -> var0x instanceof class_5834 || var0x instanceof class_1453, (double)(var2 * var2), var3
         );
      } else {
         return null;
      }
   }

   public static class_5631 method_1433(
           World var0, Entity var1, class_1343 var2, class_1343 var3, class_4092 var4, Predicate<Entity> var5, double var6, double var8
   ) {
      double var12 = var6;
      Entity var14 = null;

      for (Entity var16 : var0.method_25867(var1, var4, var5)) {
         class_4092 var17 = var16.method_37241().method_18898(var8);
         Optional var18 = var17.method_18923(var2, var3);
         if (!var18.isPresent()) {
            if (method_1386(var1.method_37245(), var17)) {
               var14 = var16;
               break;
            }
         } else {
            double var19 = var2.method_6204((class_1343)var18.get());
            if (var19 < var12) {
               var14 = var16;
               var12 = var19;
            }
         }
      }

      return var14 != null ? new class_5631(var14) : null;
   }

   public static class_5631 method_1410(Entity var0, float var1, float var2, Predicate<Entity> var3, double var4) {
      double var8 = var4 * var4;
      Entity var10 = null;
      class_1343 var11 = null;
      class_1343 var12 = new class_1343(
         field_1158.thePlayer.method_37302(),
         field_1158.thePlayer.method_37309() + (double)field_1158.thePlayer.method_37277(),
         field_1158.thePlayer.method_37156()
      );
      class_1343 var13 = method_1449(var2, var1);
      class_1343 var14 = var12.method_6214(var13.field_7336 * var8, var13.field_7333 * var8, var13.field_7334 * var8);

      for (Entity var16 : field_1158.field_9601
         .method_25867(field_1158.thePlayer, field_1158.thePlayer.method_37241().method_18929(var13.method_6209(var8)).method_18899(1.0, 1.0, 1.0), var3)) {
         class_4092 var17 = var16.method_37241();
         Optional var18 = var17.method_18923(var12, var14);
         if (var18.isPresent()) {
            double var19 = var12.method_6204((class_1343)var18.get());
            if (var19 < var8 && (var16 == var0 || var0 == null)) {
               var11 = ((class_1343)var18.get()).method_6193(var16.method_37302(), var16.method_37309(), var16.method_37156());
               var10 = var16;
               var8 = var19;
            }
         }
      }

      return var10 != null && var11 != null ? new class_5631(var10, var11) : null;
   }

   public static boolean method_1386(class_1343 var0, class_4092 var1) {
      return var0.field_7336 >= var1.field_19941
         && var0.field_7336 <= var1.field_19940
         && var0.field_7333 >= var1.field_19937
         && var0.field_7333 <= var1.field_19939
         && var0.field_7334 >= var1.field_19938
         && var0.field_7334 <= var1.field_19942;
   }

   public static boolean method_1387() {
      return !field_1163
         && field_1158.method_8515() == null
         && field_1158.method_8530() != null
         && field_1158.method_8530().field_12675.toLowerCase().contains("hypixel.net");
   }

   public static boolean method_1384() {
      return field_1158.method_8515() == null
         && field_1158.method_8530() != null
         && field_1158.method_8530().field_12675.toLowerCase().contains("minemen.club");
   }

   public static boolean method_1392() {
      return field_1158.method_8515() == null
         && field_1158.method_8530() != null
         && field_1158.method_8530().field_12675.toLowerCase().contains("cubecraft.net");
   }

   public static boolean method_1381() {
      return field_1158.method_8515() == null
         && field_1158.method_8530() != null
         && field_1158.method_8530().field_12675.toLowerCase().contains("mineplex.com");
   }

   public static boolean method_1445() {
      return field_1158.method_8530() == null || field_1158.method_8530().field_12675.toLowerCase().contains("localhost");
   }

   public static class_1343 method_1449(float var0, float var1) {
      float var4 = var0 * (float) (Math.PI / 180.0);
      float var5 = -var1 * (float) (Math.PI / 180.0);
      float var6 = class_9299.method_42840(var5);
      float var7 = class_9299.method_42818(var5);
      float var8 = class_9299.method_42840(var4);
      float var9 = class_9299.method_42818(var4);
      return new class_1343((double)(var7 * var8), (double)(-var9), (double)(var6 * var8));
   }

   public static UUID method_1465(String var0) {
      return UUID.fromString(var0.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"));
   }

   public static int method_1421(int var0, int var1) {
      int var4 = Math.abs(var1 - var0) % 360;
      return var4 <= 180 ? var4 : 360 - var4;
   }

   public static double method_1463(double var0) {
      field_1158.thePlayer.method_37214(var0, field_1158.thePlayer.method_37098().field_7333, field_1158.thePlayer.method_37098().field_7334);
      return var0;
   }

   public static double method_1408(double var0) {
      field_1158.thePlayer.method_37214(field_1158.thePlayer.method_37098().field_7336, var0, field_1158.thePlayer.method_37098().field_7334);
      return var0;
   }

   public static double method_1405(double var0) {
      field_1158.thePlayer.method_37214(field_1158.thePlayer.method_37098().field_7336, field_1158.thePlayer.method_37098().field_7333, var0);
      return var0;
   }

   public static boolean method_1454(double var0, double var2, boolean var4) {
      class_4092 var7 = field_1158.thePlayer.field_41712;
      if (var4) {
         var7 = var7.method_18899(1.235F, 0.0, 1.235F);
      }

      class_4092 var8 = new class_4092(
         var7.field_19941 + var0, var7.field_19937 - 1.5, var7.field_19938 + var2, var7.field_19940 + var0, var7.field_19939, var7.field_19942 + var2
      );
      Stream var9 = field_1158.field_9601.method_6680(field_1158.thePlayer, var8);
      return var9.count() != 0L;
   }

   public static boolean method_1453(double var0, double var2) {
      return method_1454(var0, var2, false);
   }

   public static boolean method_1452() {
      class_4092 var2 = field_1158.thePlayer.field_41712.method_18918(0.0, -1.0, 0.0);
      if (field_1158.thePlayer.method_37243() != null) {
         double var4 = field_1158.thePlayer.method_37243().field_41767 - field_1158.thePlayer.method_37243().method_37302();
         double var6 = field_1158.thePlayer.method_37243().field_41725 - field_1158.thePlayer.method_37243().method_37156();
         var2 = field_1158.thePlayer.method_37243().field_41712.method_18928(Math.abs(var4), 1.0, Math.abs(var6));
      }

      Stream var3 = field_1158.field_9601.method_6680(field_1158.thePlayer, var2);
      return var3.count() != 0L;
   }

   public static boolean method_1413(Entity var0, float var1) {
      class_4092 var4 = new class_4092(
         var0.field_41712.field_19941,
         var0.field_41712.field_19937 - (double)var1,
         var0.field_41712.field_19938,
         var0.field_41712.field_19940,
         var0.field_41712.field_19939,
         var0.field_41712.field_19942
      );
      Stream var5 = field_1158.field_9601.method_6680(field_1158.thePlayer, var4);
      return var5.count() != 0L;
   }

   public static List<class_1331> method_1447(Entity var0) {
      ArrayList var3 = new ArrayList();
      byte var4 = 1;

      for (float var5 = (float)(-var4); var5 <= (float)var4; var5++) {
         for (float var6 = (float)(-var4); var6 <= (float)var4; var6++) {
            class_1331 var7 = new class_1331(var0.method_37302() + (double)var5, var0.method_37309() - 1.0, var0.method_37156() + (double)var6);
            var3.add(var7);
         }
      }

      return var3;
   }

   public static Session method_1439(String var0, String var1) {
      YggdrasilAuthenticationService var4 = new YggdrasilAuthenticationService(Proxy.NO_PROXY, "");
      YggdrasilUserAuthentication var5 = (YggdrasilUserAuthentication)var4.createUserAuthentication(Agent.MINECRAFT);
      var5.setUsername(var0);
      var5.setPassword(var1);

      try {
         var5.logIn();
         return new Session(var5.getSelectedProfile().getName(), var5.getSelectedProfile().getId().toString(), var5.getAuthenticatedToken(), "mojang");
      } catch (AuthenticationException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public static void method_1396() {
      field_1158.method_8614().method_4813(new class_1022(class_2584.field_12791));
      field_1158.method_8614().method_4813(new class_1022(class_2584.field_12794));
   }

   public static void method_1459() {
      field_1158.method_8614().method_4813(new class_1586(class_7500.field_38259, new class_1331(0, 0, 0), Direction.field_802));
   }

   public static void method_1431(Entity var0, boolean var1) {
      boolean var4 = class_3347.method_15348().equals(class_412.field_1747);
      class_3645 var5 = new class_3645(var0, true);
      SigmaMainClass.getInstance().getEventManager().call(var5);
      if (!var5.method_29716()) {
         if (var4 && var1) {
            field_1158.thePlayer.method_26597(class_2584.field_12791);
         }

         field_1158.method_8614().method_4813(new class_3398(var5.method_16973(), field_1158.thePlayer.method_37252()));
         if (class_2931.method_13423(class_4382.method_20431(12), field_1158.thePlayer.method_26617(class_2584.field_12791)) > 0) {
            field_1158.field_9572.method_43051(var5.method_16973(), class_3090.field_15360);
         }

         boolean var6 = (double)field_1158.thePlayer.method_3203(0.5F) > 0.9 || var4;
         boolean var7 = var6
            && field_1158.thePlayer.field_41706 > 0.0F
            && !field_1158.thePlayer.field_41726
            && !field_1158.thePlayer.method_26505()
            && !field_1158.thePlayer.method_37285()
            && !field_1158.thePlayer.isPotionActive(Effects.field_19736)
            && !field_1158.thePlayer.method_37070();
         if (var7 || field_1158.thePlayer.field_41726 && SigmaMainClass.getInstance().getModuleManager().getModuleByClass(CriticalsModule.class).method_42015()) {
            field_1158.field_9572.method_43051(var5.method_16973(), class_3090.field_15322);
         }

         field_1158.thePlayer.method_3164();
         if (!var4 && var1) {
            field_1158.thePlayer.method_26597(class_2584.field_12791);
         }

         var5.method_16974();
         SigmaMainClass.getInstance().getEventManager().call(var5);
      }
   }

   public static String method_1451(int var0) {
      for (class_5818 var6 : class_5818.values()) {
         if (var6.field_29469 == var0) {
            return var6.field_29488;
         }
      }

      class_3654 var7 = class_9732.method_44940(var0, 0);
      String[] var8 = var7.method_16985().split("\\.");
      if (var8.length != 0) {
         String var9 = var8[var8.length - 1];
         if (var9.length() != 0) {
            String var10 = "";
            if (var0 <= 4) {
               var10 = "Mouse ";
            }

            return var10 + var9.substring(0, 1).toUpperCase() + var9.substring(1);
         } else {
            return "Unknown";
         }
      } else {
         return "Unknown";
      }
   }

   public static boolean method_1398(float var0, float var1, float var2, FloatBuffer var3, FloatBuffer var4, IntBuffer var5, FloatBuffer var6) {
      float[] var9 = field_1162;
      float[] var10 = field_1164;
      var9[0] = var0;
      var9[1] = var1;
      var9[2] = var2;
      var9[3] = 1.0F;
      method_1390(var3, var9, var10);
      method_1390(var4, var10, var9);
      if ((double)var9[3] != 0.0) {
         var9[3] = 1.0F / var9[3] * 0.5F;
         var9[0] = var9[0] * var9[3] + 0.5F;
         var9[1] = var9[1] * var9[3] + 0.5F;
         var9[2] = var9[2] * var9[3] + 0.5F;
         var6.put(0, var9[0] * (float)var5.get(var5.position() + 2) + (float)var5.get(var5.position() + 0));
         var6.put(1, var9[1] * (float)var5.get(var5.position() + 3) + (float)var5.get(var5.position() + 1));
         var6.put(2, var9[2]);
         return true;
      } else {
         return false;
      }
   }

   private static void method_1390(FloatBuffer var0, float[] var1, float[] var2) {
      for (int var5 = 0; var5 < 4; var5++) {
         var2[var5] = var1[0] * var0.get(var0.position() + 0 + var5)
            + var1[1] * var0.get(var0.position() + 4 + var5)
            + var1[2] * var0.get(var0.position() + 8 + var5)
            + var1[3] * var0.get(var0.position() + 12 + var5);
      }
   }

   public static void method_1403() {
      if (field_1158.getRenderViewEntity() instanceof class_704 && SigmaMainClass.getInstance().getGUIManager().method_31000()) {
         if (field_1158.gameRenderer.field_40620 != null) {
            field_1158.gameRenderer.field_40620.close();
         }

         field_1158.gameRenderer.method_35934(field_1160);
      }

      method_1400(20);
   }

   public static void method_1399(float var0) {
      method_1400(Math.round(var0 * 20.0F));
   }

   public static void method_1400(int var0) {
      if (field_1158.gameRenderer.field_40620 != null) {
         field_1158.gameRenderer.field_40620.field_19813.get(0).method_33272().method_19853("Radius").method_32385((float)var0);
         field_1158.gameRenderer.field_40620.field_19813.get(1).method_33272().method_19853("Radius").method_32385((float)var0);
      }
   }

   public static void method_1430() {
      if (field_1158.gameRenderer.field_40626 == GameRenderer.field_40631) {
         field_1158.gameRenderer.field_40620 = null;
      } else {
         field_1158.gameRenderer.method_35934(GameRenderer.field_40635[field_1158.gameRenderer.field_40626]);
      }
   }

   public static boolean method_1406(String var0) {
      var0 = var0 != null ? var0.toLowerCase() : "";
      if (!var0.equals("yorik100".toLowerCase())) {
         if (!var0.equals("TheDeadlySam".toLowerCase())) {
            if (!var0.equals("Andro24".toLowerCase())) {
               if (!var0.equals("Sigma".toLowerCase())) {
                  if (!var0.equals("SigmaTTT".toLowerCase())) {
                     if (!var0.equals("Tomygames".toLowerCase())) {
                        if (!var0.equals("LeakedPvP".toLowerCase())) {
                           if (!var0.equals("Omikron".toLowerCase())) {
                              if (!var0.equals("Haydal".toLowerCase())) {
                                 if (!var0.equals("TayZak".toLowerCase())) {
                                    if (!var0.equals("ParfumAuJasmin".toLowerCase())) {
                                       if (!var0.equals("Loyisa".toLowerCase())) {
                                          if (!var0.equals("gamerboy35787".toLowerCase())) {
                                             if (!var0.equals("MysticArceus".toLowerCase())) {
                                                if (!var0.equals("Casperhq".toLowerCase())) {
                                                   if (!var0.equals("Flyinqq".toLowerCase())) {
                                                      if (!var0.equals("cxbot".toLowerCase())) {
                                                         if (!var0.equals("ImJoi".toLowerCase())) {
                                                            if (!var0.equals("_CloudPlayer".toLowerCase())) {
                                                               return !var0.equals("Daawn".toLowerCase()) ? var0.equals("SubwayZ".toLowerCase()) : true;
                                                            } else {
                                                               return true;
                                                            }
                                                         } else {
                                                            return true;
                                                         }
                                                      } else {
                                                         return true;
                                                      }
                                                   } else {
                                                      return true;
                                                   }
                                                } else {
                                                   return true;
                                                }
                                             } else {
                                                return true;
                                             }
                                          } else {
                                             return true;
                                          }
                                       } else {
                                          return true;
                                       }
                                    } else {
                                       return true;
                                    }
                                 } else {
                                    return true;
                                 }
                              } else {
                                 return true;
                              }
                           } else {
                              return true;
                           }
                        } else {
                           return true;
                        }
                     } else {
                        return true;
                     }
                  } else {
                     return true;
                  }
               } else {
                  return true;
               }
            } else {
               return true;
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public static class_9374 method_1426(Entity var0) {
      if (var0 instanceof class_5834) {
         if (!(var0 instanceof class_704)) {
            return !(var0 instanceof class_5886) && !(var0 instanceof class_1173) && !(var0 instanceof class_378) && !(var0 instanceof class_516)
               ? class_9374.field_47923
               : class_9374.field_47924;
         } else {
            return class_9374.field_47922;
         }
      } else {
         return class_9374.field_47926;
      }
   }

   public static String[] method_1393(String var0, int var1, class_3384 var2) {
      String[] var5 = var0.split(" ");
      HashMap var6 = new HashMap();
      int var7 = 0;

      for (String var11 : var5) {
         String var12 = var6.get(var7) != null ? (String)var6.get(var7) : "";
         boolean var13 = var6.get(var7) == null;
         boolean var14 = var2.method_18547(var12) + var2.method_18547(var11) <= var1;
         boolean var15 = var2.method_18547(var11) >= var1;
         if (!var14 && !var15) {
            var7++;
            var12 = var6.get(var7) != null ? (String)var6.get(var7) : "";
            var13 = var6.get(var7) == null;
            var14 = var2.method_18547(var12) + var2.method_18547(var11) <= var1;
            var15 = var2.method_18547(var11) >= var1;
         }

         if (var14) {
            if (!var13) {
               var6.put(var7, var12 + " " + var11);
            } else {
               var6.put(var7, var11);
            }
         } else if (var15) {
            while (var15 && !var14) {
               int var16 = 0;

               while (true) {
                  if (var16 <= var11.length()) {
                     String var17 = var11.substring(0, var11.length() - var16);
                     if (var2.method_18547(var17) > var1) {
                        var16++;
                        continue;
                     }

                     var6.put(++var7, var17);
                     var11 = var11.substring(var11.length() - var16, var11.length());
                  }

                  var12 = var6.get(var7) != null ? (String)var6.get(var7) : "";
                  var14 = var2.method_18547(var12) + var2.method_18547(var11) <= var1;
                  var15 = var2.method_18547(var11) >= var1;
                  var13 = var6.get(var7) == null;
                  break;
               }
            }

            if (!var14) {
               var7++;
            }

            var6.put(var7, var11);
         }
      }

      return var6.values().<String>toArray(new String[var6.values().size()]);
   }

   public static void method_1417(class_2560 var0) {
      field_1163 = var0.field_12675.toLowerCase().contains("hypixel.net");
      if (field_1163) {
         new Thread(() -> {
            try {
               InetAddress var2 = InetAddress.getByName("hypixel.net");
               HttpGet var3 = new HttpGet("http://" + var2.getHostAddress());
               CloseableHttpClient var4 = HttpClients.createDefault();

               try {
                  CloseableHttpResponse var5 = var4.execute(var3);
                  Throwable var6 = null;

                  try {
                     if (var5.getStatusLine().getStatusCode() == 403) {
                        HttpEntity var7 = var5.getEntity();
                        if (var7 != null) {
                           String var8 = EntityUtils.toString(var7);
                           if (var8.contains("1003")) {
                              field_1163 = false;
                           }
                        }
                     }
                  } catch (Throwable var19) {
                     var6 = var19;
                     throw var19;
                  } finally {
                     if (var5 != null) {
                        if (var6 != null) {
                           try {
                              var5.close();
                           } catch (Throwable var18) {
                              var6.addSuppressed(var18);
                           }
                        } else {
                           var5.close();
                        }
                     }
                  }
               } catch (ClientProtocolException var21) {
               } catch (IOException var22) {
               }
            } catch (UnknownHostException var23) {
            }
         }).start();
      }
   }

   public static double[] method_1466() {
      return new double[]{0.0, 0.0625, 0.125, 0.25, 0.3125, 0.5, 0.625, 0.75, 0.8125, 0.875, 0.9375, 1.0, 1.0625, 1.125, 1.25, 1.3125, 1.375};
   }

   public static boolean method_1402(Entity var0, boolean var1, boolean var2, boolean var3) {
      if (var0 != field_1158.thePlayer && var0 != BlinkModule.field_27898) {
         if (SigmaMainClass.getInstance().method_3307().method_14460(var0)) {
            return false;
         } else if (var0 instanceof class_5834) {
            if (((class_5834)var0).method_26551() == 0.0F) {
               return false;
            } else if (!field_1158.thePlayer.method_26608((class_5834)var0)) {
               return false;
            } else if (var0 instanceof class_9399) {
               return false;
            } else if (!var1 && var0 instanceof class_704) {
               return false;
            } else if (var0 instanceof class_704 && SigmaMainClass.getInstance().method_3331().method_20495(var0)) {
               return false;
            } else if (!var3 && var0.method_37109()) {
               return false;
            } else if (!var2 && !(var0 instanceof class_704)) {
               return false;
            } else if (field_1158.thePlayer.method_37243() != null && field_1158.thePlayer.method_37243().equals(var0)) {
               return false;
            } else {
               return !var0.method_37367()
                  ? !(var0 instanceof class_704)
                     || !class_5876.method_26760((class_704)var0)
                     || !SigmaMainClass.getInstance().getModuleManager().getModuleByClass(TeamsModule.class).method_42015()
                  : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void method_1450(boolean var0) {
      double var3 = field_1158.thePlayer.method_37302();
      double var5 = field_1158.thePlayer.method_37309();
      double var7 = field_1158.thePlayer.method_37156();
      int var9 = 49 + class_8865.method_40769() * 17;

      for (int var10 = 0; var10 < var9; var10++) {
         double var11 = !var0 ? 0.0 : method_1397();
         field_1158.method_8614().method_4813(new class_9515(var3 + var11, var5 + 0.06248 + method_1397(), var7 + var11, false));
         if (method_1387()) {
            field_1158.method_8614().method_4813(new class_9515(var3 + var11, var5 + 0.05 + method_1397(), var7 + var11, false));
         }

         field_1158.method_8614().method_4813(new class_9515(var3 + var11, var5, var7 + var11, false));
      }

      field_1158.method_8614().method_4813(new class_4609(true));
   }

   public static double method_1397() {
      return Math.random() * 1.0E-8;
   }

   public static class_1343 method_1429(Entity var0) {
      return method_1428(var0.field_41712);
   }

   public static class_1343 method_1428(class_4092 var0) {
      double var3 = var0.method_18926().field_7336;
      double var5 = var0.field_19937;
      double var7 = var0.method_18926().field_7334;
      double var9 = (var0.field_19939 - var5) * 0.95;
      double var11 = (var0.field_19940 - var0.field_19941) * 0.95;
      double var13 = (var0.field_19942 - var0.field_19938) * 0.95;
      double var15 = Math.max(var5, Math.min(var5 + var9, field_1158.thePlayer.method_37309() + (double)field_1158.thePlayer.method_37277()));
      double var17 = Math.max(var3 - var11 / 2.0, Math.min(var3 + var11 / 2.0, field_1158.thePlayer.method_37302()));
      double var19 = Math.max(var7 - var13 / 2.0, Math.min(var7 + var13 / 2.0, field_1158.thePlayer.method_37156()));
      return new class_1343(var17, var15, var19);
   }

   public static float method_1438(float var0) {
      float var3 = class_9299.method_42810(field_1158.thePlayer.field_41701);
      float var4 = 180.0F;
      float var5 = 0.0F;
      class_8859 var6 = field_1158.thePlayer.field_30533;
      float var7 = var6.field_45287;
      float var8 = var6.field_45282;
      if (var7 == 0.0F) {
         if (var8 != 0.0F) {
            var3 += (float)(!(var8 > 0.0F) ? 90 : -90);
            var8 = 0.0F;
         }
      } else {
         if (!(var8 >= 1.0F)) {
            if (var8 <= -1.0F) {
               var3 += (float)(!(var7 > 0.0F) ? -45 : 45);
               var8 = 0.0F;
            }
         } else {
            var3 += (float)(!(var7 > 0.0F) ? 45 : -45);
            var8 = 0.0F;
         }

         if (!(var7 > 0.0F)) {
            if (var7 < 0.0F) {
               var7 = -1.0F;
               var3 -= 180.0F;
            }
         } else {
            var7 = 1.0F;
         }
      }

      for (float var9 = 0.0F; var9 < 360.0F; var9 += 45.0F) {
         float var10 = class_9299.method_42834(var0 + var9, var3);
         if (Math.abs(var10) < Math.abs(var4)) {
            var4 = var10;
            var5 = class_9299.method_42810(var0 + var9);
         }
      }

      return var5;
   }

   public static double method_1419(class_1343 var0) {
      double var3 = field_1158.thePlayer.method_37302() - var0.field_7336;
      double var5 = field_1158.thePlayer.method_37309() + (double)field_1158.thePlayer.method_37277() - var0.field_7333;
      double var7 = field_1158.thePlayer.method_37156() - var0.field_7334;
      return Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
   }

   public static double method_1420(class_4092 var0) {
      class_1343 var3 = method_1428(var0);
      return method_1419(var3);
   }

   public static float method_1422(float var0, float var1) {
      var0 %= 360.0F;
      var1 %= 360.0F;
      if (var0 < 0.0F) {
         var0 += 360.0F;
      }

      if (var1 < 0.0F) {
         var1 += 360.0F;
      }

      float var4 = var1 - var0;
      return !(var4 > 180.0F) ? (!(var4 < -180.0F) ? var4 : var4 + 360.0F) : var4 - 360.0F;
   }

   public static <K, V extends Comparable<? super V>> Map<K, V> method_1456(Map<K, V> var0, boolean var1) {
      LinkedList var4 = new LinkedList(var0.entrySet());
      if (!var1) {
         var4.sort(Entry.comparingByValue());
      } else {
         var4.sort(Entry.comparingByValue(Comparator.reverseOrder()));
      }

      LinkedHashMap var5 = new LinkedHashMap();

      for (Entry var7 : var4) {
         var5.put(var7.getKey(), var7.getValue());
      }

      return var5;
   }

   public static float[] method_1441(class_1343 var0, class_1343 var1) {
      double var4 = var1.field_7336 - var0.field_7336;
      double var6 = (var1.field_7333 - var0.field_7333) * -1.0;
      double var8 = var1.field_7334 - var0.field_7334;
      double var10 = (double)class_9299.method_42842(var4 * var4 + var8 * var8);
      return new float[]{
         (float)class_9299.method_42809(Math.toDegrees(Math.atan2(var8, var4)) - 90.0), (float)class_9299.method_42809(Math.toDegrees(Math.atan2(var6, var10)))
      };
   }

   public static Direction method_1409(double var0) {
      class_4092 var4 = field_1158.thePlayer.field_41712;
      Direction[] var5 = new Direction[]{Direction.field_804, Direction.field_809, Direction.field_800, Direction.field_818};

      for (Direction var9 : var5) {
         if (field_1158.field_9601
               .method_6680(field_1158.thePlayer, var4.method_18928(var0 * (double)var9.method_1041(), 0.0, var0 * (double)var9.method_1034()))
               .count()
            > 0L) {
            return var9;
         }
      }

      return null;
   }

   public static class_9097<Direction, class_1343> method_1462(double var0) {
      class_4092 var4 = field_1158.thePlayer.field_41712;
      Direction[] var5 = new Direction[]{Direction.field_804, Direction.field_809, Direction.field_800, Direction.field_818};

      for (Direction var9 : var5) {
         Iterator var10 = field_1158.field_9601
            .method_6680(field_1158.thePlayer, var4.method_18928(var0 * (double)var9.method_1041(), 0.0, var0 * (double)var9.method_1034()))
            .iterator();
         if (var10.hasNext()) {
            class_1343 var11 = field_1158.thePlayer
               .method_37245()
               .method_6215(field_1158.thePlayer.method_37287(new class_1343((double)var9.method_1041(), 0.0, (double)var9.method_1034())));
            return new class_9097<Direction, class_1343>(var9, var11);
         }
      }

      return null;
   }

   public static boolean method_1383() {
      double var2 = 1.0E-7;
      return field_1158.field_9601
            .method_6680(field_1158.thePlayer, field_1158.thePlayer.field_41712.method_18928(var2, 0.0, var2).method_18928(-var2, 0.0, -var2))
            .count()
         > 0L;
   }

   public static long method_1418() {
      long var2 = System.currentTimeMillis() / 720000L;
      var2 <<= 1;
      var2 = var2 % 2L != 0L ? var2 >> 2 : var2 << 1;
      return var2 % 3L != 0L ? var2 * 2L : var2 / 2L;
   }

   public static boolean method_1432(Entity var0) {
      if (!(var0.method_37309() < 1.0)) {
         if (!var0.field_41726) {
            class_4092 var3 = var0.method_37241();
            var3 = var3.method_18928(0.0, -var0.method_37309(), 0.0);
            return field_1158.field_9601.method_6680(field_1158.thePlayer, var3).count() == 0L;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
