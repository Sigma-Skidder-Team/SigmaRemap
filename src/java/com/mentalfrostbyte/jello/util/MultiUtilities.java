package com.mentalfrostbyte.jello.util;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.impl.combat.Teams;
import com.mentalfrostbyte.jello.module.impl.player.Blink;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mojang.authlib.Agent;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.YggdrasilUserAuthentication;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.client.CChatMessagePacket;
import net.minecraft.network.play.client.CPlayerDiggingPacket;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.client.CPlayerTryUseItemPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.awt.Color;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MultiUtilities {
   private static final Minecraft mc = Minecraft.getInstance();
   public static final float[] field24951 = new float[4];
   public static final float[] field24952 = new float[4];
   public static final ResourceLocation field24953 = new ResourceLocation("shaders/post/blur.json");
   private static boolean field24954 = false;

   public static void addChatMessage(String text) {
      StringTextComponent textComp = new StringTextComponent(text);
      mc.ingameGUI.getChatGUI().sendChatMessage(textComp);
   }

   public static void sendChatMessage(String text) {
      mc.getConnection().sendPacket(new CChatMessagePacket(text));
   }

   public static List<PlayerEntity> method17680() {
      ArrayList var2 = new ArrayList();
      mc.world.entitiesById.forEach((var1, var2x) -> {
         if (var2x instanceof PlayerEntity) {
            var2.add((PlayerEntity)var2x);
         }
      });
      return var2;
   }

   public static Color method17681(Color var0, Color var1, float var2) {
      float var5 = 1.0F - var2;
      float var6 = (float)var0.getRed() * var2 + (float)var1.getRed() * var5;
      float var7 = (float)var0.getGreen() * var2 + (float)var1.getGreen() * var5;
      float var8 = (float)var0.getBlue() * var2 + (float)var1.getBlue() * var5;
      return new Color(var6 / 255.0F, var7 / 255.0F, var8 / 255.0F);
   }

   public static Color method17682(Color... var0) {
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

   public static Entity method17683(Entity var0, List<Entity> var1) {
      if (var1.size() <= 0) {
         return null;
      } else {
         Entity var4 = null;

         for (int var5 = 0; var5 < var1.size(); var5++) {
            if (var4 == null || var0.getDistance((Entity)var1.get(var5)) < var0.getDistance(var4)) {
               var4 = (Entity)var1.get(var5);
            }
         }

         return var4;
      }
   }

   public static final boolean method17684(Entity var0) {
      ClientWorld var3 = mc.world;
      AxisAlignedBB var4 = var0.boundingBox;
      return var3.method7014(var4);
   }

   public static final boolean method17685(Entity var0) {
      double var3 = var0.getPosX() - var0.lastTickPosX;
      double var5 = var0.getPosY() - var0.lastTickPosY;
      double var7 = var0.getPosZ() - var0.lastTickPosZ;
      return var3 != 0.0 || var5 != 0.0 || var7 != 0.0;
   }

   public static final boolean method17686() {
      return mc.player.moveStrafing != 0.0F || mc.player.moveForward != 0.0F;
   }

   public static float[] method17687(double var0, double var2, double var4) {
      double var8 = var0 - mc.player.getPosX();
      double var10 = var2 - (mc.player.getPosY() + (double) mc.player.getEyeHeight());
      double var12 = var4 - mc.player.getPosZ();
      double var14 = (double) MathHelper.sqrt(var8 * var8 + var12 * var12);
      float var16 = (float)(Math.atan2(var12, var8) * 180.0 / Math.PI) - 90.0F;
      float var17 = (float)(-(Math.atan2(var10, var14) * 180.0 / Math.PI));
      return new float[]{
         mc.player.rotationYaw + MathHelper.method37792(var16 - mc.player.rotationYaw),
         mc.player.rotationPitch + MathHelper.method37792(var17 - mc.player.rotationPitch)
      };
   }

   public static int applyAlpha(int color, float alpha) {
      return (int)(alpha * 255.0F) << 24 | color & 16777215;
   }

   public static int method17689(int var0) {
      Color var3 = new Color(var0);
      double var4 = (double)((299 * var3.getRed() + 587 * var3.getGreen() + 114 * var3.getBlue()) / 1000);
      return !(var4 >= 128.0) ? Color.white.getRGB() : Color.black.getRGB();
   }

   public static int method17690(int var0, int var1, float var2) {
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

   public static int method17691(int var0, float var1) {
      int var4 = var0 >> 24 & 0xFF;
      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = (int)((float)var5 * (1.0F - var1));
      int var9 = (int)((float)var6 * (1.0F - var1));
      int var10 = (int)((float)var7 * (1.0F - var1));
      return var4 << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
   }

   public static int method17692(int var0, float var1) {
      int var4 = var0 >> 24 & 0xFF;
      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = (int)((float)var5 + (float)(255 - var5) * var1);
      int var9 = (int)((float)var6 + (float)(255 - var6) * var1);
      int var10 = (int)((float)var7 + (float)(255 - var7) * var1);
      return var4 << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
   }

   public static String method17693(String var0) {
      return var0.replaceAll("(?i)&([a-f0-9])", "§$1");
   }

   public boolean method17694(char var1) {
      return "ÀÁÂÈÊËÍÓÔÕÚßãõğİıŒœŞşŴŵžȇ\u0000\u0000\u0000\u0000\u0000\u0000\u0000 !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u0000ÇüéâäàåçêëèïîìÄÅÉæÆôöòûùÿÖÜø£Ø×ƒáíóúñÑªº¿®¬½¼¡«»░▒▓│┤╡╢╖╕╣║╗╝╜╛┐└┴┬├─┼╞╟╚╔╩╦╠═╬╧╨╤╥╙╘╒╓╫╪┘┌█▄▌▐▀αβΓπΣσμτΦΘΩδ∞∅∈∩≡±≥≤⌠⌡÷≈°∙·√ⁿ²■\u0000"
            .indexOf(var1)
         != -1;
   }

   public static void method17695(String var0) {
      try {
         Desktop var3 = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
         if (var3 != null && var3.isSupported(Desktop.Action.BROWSE)) {
            try {
               var3.browse(new URI(var0));
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }
      } catch (Exception var6) {
      }
   }

   public static List<String> method17696(String var0) {
      String var3 = null;
      Object var4 = new ArrayList();

      try {
         var3 = method17697(var0);
      } catch (Exception var7) {
      }

      if (var3 == null) {
         return (List<String>)var4;
      } else {
         try {
            var4 = method17700(var3);
         } catch (Exception var6) {
         }

         return (List<String>)var4;
      }
   }

   public static String method17697(String var0) throws Exception {
      URL var3 = new URL("https://api.mojang.com/users/profiles/minecraft/" + var0);
      BufferedReader var4 = new BufferedReader(new InputStreamReader(var3.openStream()));
      String var5 = "";

      String var6;
      while ((var6 = var4.readLine()) != null) {
         var5 = var5 + var6;
      }

      var4.close();
      JSONObject var7 = new JSONObject(var5);
      return var7.getString("id");
   }

   public static String method17699(String var0) throws Exception {
      String var3 = "";
      URL var4 = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + var0);
      BufferedReader var5 = new BufferedReader(new InputStreamReader(var4.openStream()));
      String var6 = "";

      String var7;
      while ((var7 = var5.readLine()) != null) {
         var6 = var6 + var7;
      }

      String var8 = "";
      JSONObject var9 = new JSONObject(var6);

      for (Object var12 : var9.getJSONArray("properties")) {
         JSONObject var13 = (JSONObject)var12;
         if (var13.has("value") && var13.has("name")) {
            var8 = var13.getString("value");
         }
      }

      if (Base64.isBase64(var8)) {
         String var14 = new String(Base64.decodeBase64(var8));
         JSONObject var15 = new JSONObject(var14);
         if (var15.has("textures")) {
            JSONObject var16 = var15.getJsonObject("textures");
            System.out.println("tex");
            if (var16.has("SKIN")) {
               var3 = var16.getJsonObject("SKIN").getString("url");
            }
         }

         System.out.println(var3);
         return var3;
      } else {
         return var3;
      }
   }

   public static List<String> method17700(String var0) throws Exception {
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

         for (int var10 = 0; var10 < var9.length(); var10++) {
            JSONObject var11 = new JSONObject(var9.get(var10).toString());
            var3.add(var11.getString("name"));
         }

         return var3;
      }
   }

   public static float[] method17701(float var0, float var1, float var2, float var3) {
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

   public static float method17702(float var0, float var1, float var2) {
      float var5 = MathHelper.method37792(var1 - var0);
      if (var5 > var2) {
         var5 = var2;
      }

      if (var5 < -var2) {
         var5 = -var2;
      }

      return var0 + var5;
   }

   public static float method17703(Integer[] var0) {
      int var3 = var0.length / 2;
      return var0.length % 2 != 1 ? (float)(var0[var3 - 1] + var0[var3]) / 2.0F : (float)var0[var3].intValue();
   }

   public static int method17704(Color var0) {
      int var3 = var0.getRed();
      int var4 = var0.getGreen();
      int var5 = var0.getBlue();
      var3 = var3 << 16 & 0xFF0000;
      var4 = var4 << 8 & 0xFF00;
      var5 &= 255;
      return 0xFF000000 | var3 | var4 | var5;
   }

   public static int method17705() {
      for (Class6589 var3 : mc.getConnection().method15790()) {
         if (var3.method19966().getId().equals(mc.player.getUniqueID()) && !mc.isIntegratedServerRunning()) {
            return var3.method19969();
         }
      }

      return 0;
   }

   public static Color method17706(float var0) {
      float var3 = 14000.0F;
      float var4 = (float)(System.currentTimeMillis() % (long)((int)var3)) / var3;
      Color var5 = new Color((int)Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var4, 1.0F, 1.0F))), 16));
      return new Color(
         (float)var5.getRed() / 255.0F * var0, (float)var5.getGreen() / 255.0F * var0, (float)var5.getBlue() / 255.0F * var0, (float)var5.getAlpha() / 255.0F
      );
   }

   public static Color method17707(float var0, int var1) {
      float var4 = (float)(((long)var1 + System.currentTimeMillis()) % (long)((int)var0)) / var0;
      Color var5 = new Color((int)Long.parseLong(Integer.toHexString(Integer.valueOf(Color.HSBtoRGB(var4, 1.0F, 1.0F))), 16));
      return new Color((float)var5.getRed() / 255.0F, (float)var5.getGreen() / 255.0F, (float)var5.getBlue() / 255.0F, (float)var5.getAlpha() / 255.0F);
   }

   public static List<Entity> getEntitesInWorld() {
      ArrayList<Entity> entities = new ArrayList<>();
      mc.world.entitiesById.forEach((entity1, entity2) -> entities.add(entity2));
      return entities;
   }

   public static float[] method17709(int var0) {
      float var3 = (float)(var0 >> 24 & 0xFF) / 255.0F;
      float var4 = (float)(var0 >> 16 & 0xFF) / 255.0F;
      float var5 = (float)(var0 >> 8 & 0xFF) / 255.0F;
      float var6 = (float)(var0 & 0xFF) / 255.0F;
      return new float[]{var4, var5, var6, var3};
   }

   public static float method17710(int var0) {
      return (float)(var0 >> 24 & 0xFF) / 255.0F;
   }

   public static Entity method17711(float var0, float var1, float var2, double var3) {
      EntityRayTraceResult var7 = method17712(var0, var1, var2, var3);
      return var7 == null ? null : var7.getEntity();
   }

   public static EntityRayTraceResult method17712(float var0, float var1, float var2, double var3) {
      Vector3d var7 = new Vector3d(
         mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ()
      );
      Entity var8 = mc.getRenderViewEntity();
      if (var8 != null && mc.world != null) {
         double var9 = (double) mc.playerController.getBlockReachDistance();
         if (var2 != 0.0F) {
            var9 = (double)var2;
         }

         Vector3d var11 = method17721(var1, var0);
         Vector3d var12 = var7.add(var11.x * var9, var11.y * var9, var11.z * var9);
         float var13 = 1.0F;
         AxisAlignedBB var14 = var8.getBoundingBox().expand(var11.scale(var9)).grow(1.0, 1.0, 1.0);
         return method17713(
            mc.world, var8, var7, var12, var14, var0x -> var0x instanceof LivingEntity || var0x instanceof Class907, (double)(var2 * var2), var3
         );
      } else {
         return null;
      }
   }

   public static EntityRayTraceResult method17713(
           World var0, Entity var1, Vector3d var2, Vector3d var3, AxisAlignedBB var4, Predicate<Entity> var5, double var6, double var8
   ) {
      double var12 = var6;
      Entity var14 = null;

      for (Entity var16 : var0.getEntitiesInAABBexcluding(var1, var4, var5)) {
         AxisAlignedBB var17 = var16.getBoundingBox().method19664(var8);
         Optional var18 = var17.method19680(var2, var3);
         if (!var18.isPresent()) {
            if (method17715(var1.getPositionVec(), var17)) {
               var14 = var16;
               break;
            }
         } else {
            double var19 = var2.squareDistanceTo((Vector3d)var18.get());
            if (var19 < var12) {
               var14 = var16;
               var12 = var19;
            }
         }
      }

      return var14 != null ? new EntityRayTraceResult(var14) : null;
   }

   public static EntityRayTraceResult method17714(Entity var0, float var1, float var2, Predicate<Entity> var3, double var4) {
      double var8 = var4 * var4;
      Entity var10 = null;
      Vector3d var11 = null;
      Vector3d var12 = new Vector3d(
         mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ()
      );
      Vector3d var13 = method17721(var2, var1);
      Vector3d var14 = var12.add(var13.x * var8, var13.y * var8, var13.z * var8);

      for (Entity var16 : mc.world
         .getEntitiesInAABBexcluding(mc.player, mc.player.getBoundingBox().expand(var13.scale(var8)).grow(1.0, 1.0, 1.0), var3)) {
         AxisAlignedBB var17 = var16.getBoundingBox();
         Optional var18 = var17.method19680(var12, var14);
         if (var18.isPresent()) {
            double var19 = var12.squareDistanceTo((Vector3d)var18.get());
            if (var19 < var8 && (var16 == var0 || var0 == null)) {
               var11 = ((Vector3d)var18.get()).method11337(var16.getPosX(), var16.getPosY(), var16.getPosZ());
               var10 = var16;
               var8 = var19;
            }
         }
      }

      return var10 != null && var11 != null ? new EntityRayTraceResult(var10, var11) : null;
   }

   public static boolean method17715(Vector3d var0, AxisAlignedBB var1) {
      return var0.x >= var1.minX
         && var0.x <= var1.maxX
         && var0.y >= var1.minY
         && var0.y <= var1.maxY
         && var0.z >= var1.minZ
         && var0.z <= var1.maxZ;
   }

   public static boolean isHypixel() {
      return !field24954
         && mc.getIntegratedServer() == null
         && mc.getCurrentServerData() != null
         && mc.getCurrentServerData().serverIP.toLowerCase().contains("hypixel.net");
   }

   public static boolean isMinemen() {
      return mc.getIntegratedServer() == null && mc.getCurrentServerData() != null && mc.getCurrentServerData().serverIP.toLowerCase().contains("minemen.club");
   }

   public static boolean isCubecraft() {
      return mc.getIntegratedServer() == null && mc.getCurrentServerData() != null && mc.getCurrentServerData().serverIP.toLowerCase().contains("cubecraft.net");
   }

   public static boolean isMineplex() {
      return mc.getIntegratedServer() == null && mc.getCurrentServerData() != null && mc.getCurrentServerData().serverIP.toLowerCase().contains("mineplex.com");
   }

   public static boolean isLocalhost() {
      return mc.getCurrentServerData() == null || mc.getCurrentServerData().serverIP.toLowerCase().contains("localhost");
   }

   public static Vector3d method17721(float var0, float var1) {
      float var4 = var0 * (float) (Math.PI / 180.0);
      float var5 = -var1 * (float) (Math.PI / 180.0);
      float var6 = MathHelper.cos(var5);
      float var7 = MathHelper.sin(var5);
      float var8 = MathHelper.cos(var4);
      float var9 = MathHelper.sin(var4);
      return new Vector3d((double)(var7 * var8), (double)(-var9), (double)(var6 * var8));
   }

   public static UUID method17722(String var0) {
      return UUID.fromString(var0.replaceFirst("(\\p{XDigit}{8})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}{4})(\\p{XDigit}+)", "$1-$2-$3-$4-$5"));
   }

   public static int method17723(int var0, int var1) {
      int var4 = Math.abs(var1 - var0) % 360;
      return var4 <= 180 ? var4 : 360 - var4;
   }

   public static double setPlayerXMotion(double var0) {
      mc.player.setMotion(var0, mc.player.getMotion().y, mc.player.getMotion().z);
      return var0;
   }

   public static double setPlayerYMotion(double var0) {
      mc.player.setMotion(mc.player.getMotion().x, var0, mc.player.getMotion().z);
      return var0;
   }

   public static double setPlayerZMotion(double var0) {
      mc.player.setMotion(mc.player.getMotion().x, mc.player.getMotion().y, var0);
      return var0;
   }

   public static boolean method17727(double var0, double var2, boolean var4) {
      AxisAlignedBB var7 = mc.player.boundingBox;
      if (var4) {
         var7 = var7.grow(1.235F, 0.0, 1.235F);
      }

      AxisAlignedBB var8 = new AxisAlignedBB(
         var7.minX + var0, var7.minY - 1.5, var7.minZ + var2, var7.maxX + var0, var7.maxY, var7.maxZ + var2
      );
      Stream var9 = mc.world.getCollisionShapes(mc.player, var8);
      return var9.count() != 0L;
   }

   public static boolean method17728(double var0, double var2) {
      return method17727(var0, var2, false);
   }

   public static boolean method17729() {
      AxisAlignedBB var2 = mc.player.boundingBox.offset(0.0, -1.0, 0.0);
      if (mc.player.getRidingEntity() != null) {
         double var4 = mc.player.getRidingEntity().prevPosX - mc.player.getRidingEntity().getPosX();
         double var6 = mc.player.getRidingEntity().prevPosZ - mc.player.getRidingEntity().getPosZ();
         var2 = mc.player.getRidingEntity().boundingBox.expand(Math.abs(var4), 1.0, Math.abs(var6));
      }

      Stream var3 = mc.world.getCollisionShapes(mc.player, var2);
      return var3.count() != 0L;
   }

   public static boolean isAboveBounds(Entity var0, float var1) {
      AxisAlignedBB var4 = new AxisAlignedBB(
         var0.boundingBox.minX,
         var0.boundingBox.minY - (double)var1,
         var0.boundingBox.minZ,
         var0.boundingBox.maxX,
         var0.boundingBox.maxY,
         var0.boundingBox.maxZ
      );
      Stream<VoxelShape> var5 = mc.world.getCollisionShapes(mc.player, var4);
      return var5.findAny().isPresent();
   }

   public static List<BlockPos> method17731(Entity var0) {
      ArrayList var3 = new ArrayList();
      float var4 = 1;

      for (float var5 = -var4; var5 <= var4; var5++) {
         for (float var6 = -var4; var6 <= var4; var6++) {
            BlockPos var7 = new BlockPos(var0.getPosX() + (double)var5, var0.getPosY() - 1.0, var0.getPosZ() + (double)var6);
            var3.add(var7);
         }
      }

      return var3;
   }

   public static Session method17732(String var0, String var1) {
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

   public static void block() {
      mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
      mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.OFF_HAND));
   }

   public static void unblock() {
      mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.RELEASE_USE_ITEM, new BlockPos(0, 0, 0), Direction.DOWN));
   }

   public static void swing(Entity var0, boolean swing) {
      if (var0 == null) {
         return;
      }

      /*




       */
   }

   public static String method17736(int var0) {
      for (Class2287 var6 : Class2287.values()) {
         if (var6.field15204 == var0) {
            return var6.field15201;
         }
      }

      InputMappingsInput var7 = InputMappings.method38637(var0, 0);
      String[] var8 = var7.getTranslationKey().split("\\.");
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

   public static boolean method17737(float var0, float var1, float var2, FloatBuffer var3, FloatBuffer var4, IntBuffer var5, FloatBuffer var6) {
      float[] var9 = field24951;
      float[] var10 = field24952;
      var9[0] = var0;
      var9[1] = var1;
      var9[2] = var2;
      var9[3] = 1.0F;
      method17738(var3, var9, var10);
      method17738(var4, var10, var9);
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

   private static void method17738(FloatBuffer var0, float[] var1, float[] var2) {
      for (int var5 = 0; var5 < 4; var5++) {
         var2[var5] = var1[0] * var0.get(var0.position() + 0 + var5)
            + var1[1] * var0.get(var0.position() + 4 + var5)
            + var1[2] * var0.get(var0.position() + 8 + var5)
            + var1[3] * var0.get(var0.position() + 12 + var5);
      }
   }

   public static void method17739() {
      if (mc.getRenderViewEntity() instanceof PlayerEntity && Client.getInstance().getGuiManager().method33470()) {
         if (mc.gameRenderer.shaderGroup != null) {
            mc.gameRenderer.shaderGroup.close();
         }

         mc.gameRenderer.loadShader(field24953);
      }

      method17741(20);
   }

   public static void method17740(float var0) {
      method17741(Math.round(var0 * 20.0F));
   }

   public static void method17741(int var0) {
      if (mc.gameRenderer.shaderGroup != null) {
         mc.gameRenderer.shaderGroup.elements.get(0).method7410().getFromName("Radius").setValue((float)var0);
         mc.gameRenderer.shaderGroup.elements.get(1).method7410().getFromName("Radius").setValue((float)var0);
      }
   }

   public static void method17742() {
      if (mc.gameRenderer.shaderIndex == GameRenderer.field830) {
         mc.gameRenderer.shaderGroup = null;
      } else {
         mc.gameRenderer.loadShader(GameRenderer.field829[mc.gameRenderer.shaderIndex]);
      }
   }

   public static boolean method17743(String var0) {
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

   public static Class2258 method17744(Entity var0) {
      if (var0 instanceof LivingEntity) {
         if (!(var0 instanceof PlayerEntity)) {
            return !(var0 instanceof MobEntity) && !(var0 instanceof Class1009) && !(var0 instanceof Class1108) && !(var0 instanceof Class1111)
               ? Class2258.field14691
               : Class2258.field14689;
         } else {
            return Class2258.field14690;
         }
      } else {
         return Class2258.field14692;
      }
   }

   public static String[] method17745(String var0, int var1, ClientResource var2) {
      String[] var5 = var0.split(" ");
      HashMap<Integer, String> var6 = new HashMap();
      int var7 = 0;

      for (String var11 : var5) {
         String var12 = var6.get(var7) != null ? (String)var6.get(var7) : "";
         boolean var13 = var6.get(var7) == null;
         boolean var14 = var2.getStringWidth(var12) + var2.getStringWidth(var11) <= var1;
         boolean var15 = var2.getStringWidth(var11) >= var1;
         if (!var14 && !var15) {
            var7++;
            var12 = var6.get(var7) != null ? (String)var6.get(var7) : "";
            var13 = var6.get(var7) == null;
            var14 = var2.getStringWidth(var12) + var2.getStringWidth(var11) <= var1;
            var15 = var2.getStringWidth(var11) >= var1;
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
                     if (var2.getStringWidth(var17) > var1) {
                        var16++;
                        continue;
                     }

                     var6.put(++var7, var17);
                     var11 = var11.substring(var11.length() - var16, var11.length());
                  }

                  var12 = var6.get(var7) != null ? (String)var6.get(var7) : "";
                  var14 = var2.getStringWidth(var12) + var2.getStringWidth(var11) <= var1;
                  var15 = var2.getStringWidth(var11) >= var1;
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

      return var6.values().toArray(new String[var6.values().size()]);
   }

   public static void method17746(ServerData var0) {
      field24954 = var0.serverIP.toLowerCase().contains("hypixel.net");
      if (field24954) {
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
                              field24954 = false;
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

   public static double[] method17747() {
      return new double[]{0.0, 0.0625, 0.125, 0.25, 0.3125, 0.5, 0.625, 0.75, 0.8125, 0.875, 0.9375, 1.0, 1.0625, 1.125, 1.25, 1.3125, 1.375};
   }

   public static boolean method17748(Entity var0, boolean var1, boolean var2, boolean var3) {
      if (var0 != mc.player && var0 != Blink.clientPlayerEntity) {
         if (Client.getInstance().getFriendManager().method26997(var0)) {
            return false;
         } else if (var0 instanceof LivingEntity) {
            if (((LivingEntity)var0).getHealth() == 0.0F) {
               return false;
            } else if (!mc.player.canAttack((LivingEntity)var0)) {
               return false;
            } else if (var0 instanceof ArmorStandEntity) {
               return false;
            } else if (!var1 && var0 instanceof PlayerEntity) {
               return false;
            } else if (var0 instanceof PlayerEntity && Client.getInstance().getCombatManager().isValidTarget(var0)) {
               return false;
            } else if (!var3 && var0.isInvisible()) {
               return false;
            } else if (!var2 && !(var0 instanceof PlayerEntity)) {
               return false;
            } else if (mc.player.getRidingEntity() != null && mc.player.getRidingEntity().equals(var0)) {
               return false;
            } else {
               return !var0.method3362()
                  ? !(var0 instanceof PlayerEntity)
                     || !Class8781.method31662((PlayerEntity)var0)
                     || !Client.getInstance().getModuleManager().getModuleByClass(Teams.class).isEnabled()
                  : false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void method17749(boolean var0) {
      double var3 = mc.player.getPosX();
      double var5 = mc.player.getPosY();
      double var7 = mc.player.getPosZ();
      int var9 = 49 + MovementUtils.method37079() * 17;

      for (int var10 = 0; var10 < var9; var10++) {
         double var11 = !var0 ? 0.0 : method17750();
         mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var3 + var11, var5 + 0.06248 + method17750(), var7 + var11, false));
         if (isHypixel()) {
            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var3 + var11, var5 + 0.05 + method17750(), var7 + var11, false));
         }

         mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var3 + var11, var5, var7 + var11, false));
      }

      mc.getConnection().sendPacket(new CPlayerPacket(true));
   }

   public static double method17750() {
      return Math.random() * 1.0E-8;
   }

   public static Vector3d method17751(Entity var0) {
      return method17752(var0.boundingBox);
   }

   public static Vector3d method17752(AxisAlignedBB var0) {
      double var3 = var0.method19685().x;
      double var5 = var0.minY;
      double var7 = var0.method19685().z;
      double var9 = (var0.maxY - var5) * 0.95;
      double var11 = (var0.maxX - var0.minX) * 0.95;
      double var13 = (var0.maxZ - var0.minZ) * 0.95;
      double var15 = Math.max(var5, Math.min(var5 + var9, mc.player.getPosY() + (double) mc.player.getEyeHeight()));
      double var17 = Math.max(var3 - var11 / 2.0, Math.min(var3 + var11 / 2.0, mc.player.getPosX()));
      double var19 = Math.max(var7 - var13 / 2.0, Math.min(var7 + var13 / 2.0, mc.player.getPosZ()));
      return new Vector3d(var17, var15, var19);
   }

   public static float method17753(float var0) {
      float var3 = MathHelper.method37792(mc.player.rotationYaw);
      float var4 = 180.0F;
      float var5 = 0.0F;
      MovementInput var6 = mc.player.movementInput;
      float var7 = var6.field43908;
      float var8 = var6.field43907;
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
         float var10 = MathHelper.method37794(var0 + var9, var3);
         if (Math.abs(var10) < Math.abs(var4)) {
            var4 = var10;
            var5 = MathHelper.method37792(var0 + var9);
         }
      }

      return var5;
   }

   public static double method17754(Vector3d var0) {
      double var3 = mc.player.getPosX() - var0.x;
      double var5 = mc.player.getPosY() + (double) mc.player.getEyeHeight() - var0.y;
      double var7 = mc.player.getPosZ() - var0.z;
      return Math.sqrt(var3 * var3 + var5 * var5 + var7 * var7);
   }

   public static double method17755(AxisAlignedBB var0) {
      Vector3d var3 = method17752(var0);
      return method17754(var3);
   }

   public static float method17756(float var0, float var1) {
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
   public static <K, V extends Comparable<? super V>> Map<K, V> method17757(Map<K, V> var0, boolean var1) {
      List<Entry<K, V>> var4 = new LinkedList<>(var0.entrySet());

      if (!var1) {
         var4.sort(Entry.comparingByValue());
      } else {
         var4.sort(Entry.comparingByValue(Comparator.reverseOrder()));
      }

      Map<K, V> var5 = new LinkedHashMap<>();
      for (Entry<K, V> var7 : var4) {
         var5.put(var7.getKey(), var7.getValue());
      }

      return var5;
   }
   public static float[] method17758(Vector3d var0, Vector3d var1) {
      double var4 = var1.x - var0.x;
      double var6 = (var1.y - var0.y) * -1.0;
      double var8 = var1.z - var0.z;
      double var10 = (double) MathHelper.sqrt(var4 * var4 + var8 * var8);
      return new float[]{
         (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var8, var4)) - 90.0), (float) MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(var6, var10)))
      };
   }

   public static Direction method17759(double var0) {
      AxisAlignedBB var4 = mc.player.boundingBox;
      Direction[] var5 = new Direction[]{Direction.EAST, Direction.WEST, Direction.SOUTH, Direction.NORTH};

      for (Direction var9 : var5) {
         if (mc.world
               .getCollisionShapes(mc.player, var4.expand(var0 * (double)var9.getXOffset(), 0.0, var0 * (double)var9.getZOffset()))
               .count()
            > 0L) {
            return var9;
         }
      }

      return null;
   }

   public static Class9629<Direction, Vector3d> method17760(double var0) {
      AxisAlignedBB var4 = mc.player.boundingBox;
      Direction[] var5 = new Direction[]{Direction.EAST, Direction.WEST, Direction.SOUTH, Direction.NORTH};

      for (Direction var9 : var5) {
         Iterator var10 = mc.world
            .getCollisionShapes(mc.player, var4.expand(var0 * (double)var9.getXOffset(), 0.0, var0 * (double)var9.getZOffset()))
            .iterator();
         if (var10.hasNext()) {
            Vector3d var11 = mc.player
               .getPositionVec()
               .add(mc.player.getAllowedMovement(new Vector3d((double)var9.getXOffset(), 0.0, (double)var9.getZOffset())));
            return new Class9629<Direction, Vector3d>(var9, var11);
         }
      }

      return null;
   }

   public static boolean method17761() {
      double var2 = 1.0E-7;
      return mc.world
            .getCollisionShapes(mc.player, mc.player.boundingBox.expand(var2, 0.0, var2).expand(-var2, 0.0, -var2))
            .count()
         > 0L;
   }

   public static long method17762() {
      long var2 = System.currentTimeMillis() / 720000L;
      var2 <<= 1;
      var2 = var2 % 2L != 0L ? var2 >> 2 : var2 << 1;
      return var2 % 3L != 0L ? var2 * 2L : var2 / 2L;
   }

   public static boolean method17763(Entity var0) {
      if (!(var0.getPosY() < 1.0)) {
         if (!var0.onGround) {
            AxisAlignedBB var3 = var0.getBoundingBox();
            var3 = var3.expand(0.0, -var0.getPosY(), 0.0);
            return mc.world.getCollisionShapes(mc.player, var3).count() == 0L;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
