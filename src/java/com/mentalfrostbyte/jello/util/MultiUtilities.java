package com.mentalfrostbyte.jello.util;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.resource.TrueTypeFont;
import com.mentalfrostbyte.jello.util.player.MovementUtil;
import mapped.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.network.play.NetworkPlayerInfo;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.client.*;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.*;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import org.apache.commons.codec.binary.Base64;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import totalcross.json.JSONArray;
import totalcross.json.JSONObject;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.*;
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
      ArrayList<PlayerEntity> var2 = new ArrayList<>();
      mc.world.entitiesById.forEach((var1, var2x) -> {
         if (var2x instanceof PlayerEntity) {
            var2.add((PlayerEntity) var2x);
         }
      });
      return var2;
   }

   public static Color method17681(Color var0, Color var1, float var2) {
      float var5 = 1.0F - var2;
      float var6 = (float) var0.getRed() * var2 + (float) var1.getRed() * var5;
      float var7 = (float) var0.getGreen() * var2 + (float) var1.getGreen() * var5;
      float var8 = (float) var0.getBlue() * var2 + (float) var1.getBlue() * var5;
      return new Color(var6 / 255.0F, var7 / 255.0F, var8 / 255.0F);
   }

   public static Color method17682(Color... var0) {
      if (var0 != null) {
         if (var0.length > 0) {
            float var3 = 1.0F / (float) var0.length;
            float var4 = 0.0F;
            float var5 = 0.0F;
            float var6 = 0.0F;
            float var7 = 0.0F;

            for (Color var11 : var0) {
               if (var11 == null) {
                  var11 = Color.BLACK;
               }

               var4 += (float) var11.getRed() * var3;
               var5 += (float) var11.getGreen() * var3;
               var6 += (float) var11.getBlue() * var3;
               var7 += (float) var11.getAlpha() * var3;
            }

            return new Color(var4 / 255.0F, var5 / 255.0F, var6 / 255.0F, var7 / 255.0F);
         } else {
            return Color.WHITE;
         }
      } else {
         return Color.WHITE;
      }
   }

   public static boolean method17684(Entity var0) {
      ClientWorld var3 = mc.world;
      AxisAlignedBB var4 = var0.boundingBox;
      return var3.method7014(var4);
   }

   public static boolean method17686() {
      return mc.player.moveStrafing != 0.0F || mc.player.moveForward != 0.0F;
   }

   public static int applyAlpha(int color, float alpha) {
      return (int) (alpha * 255.0F) << 24 | color & 16777215;
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
      float var14 = (float) var5 * var2 + (float) var9 * var13;
      float var15 = (float) var6 * var2 + (float) var10 * var13;
      float var16 = (float) var7 * var2 + (float) var11 * var13;
      float var17 = (float) var8 * var2 + (float) var12 * var13;
      return (int) var14 << 24 | ((int) var15 & 0xFF) << 16 | ((int) var16 & 0xFF) << 8 | (int) var17 & 0xFF;
   }

   public static int method17691(int var0, float var1) {
      int var4 = var0 >> 24 & 0xFF;
      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = (int) ((float) var5 * (1.0F - var1));
      int var9 = (int) ((float) var6 * (1.0F - var1));
      int var10 = (int) ((float) var7 * (1.0F - var1));
      return var4 << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
   }

   public static int method17692(int var0, float var1) {
      int var4 = var0 >> 24 & 0xFF;
      int var5 = var0 >> 16 & 0xFF;
      int var6 = var0 >> 8 & 0xFF;
      int var7 = var0 & 0xFF;
      int var8 = (int) ((float) var5 + (float) (255 - var5) * var1);
      int var9 = (int) ((float) var6 + (float) (255 - var6) * var1);
      int var10 = (int) ((float) var7 + (float) (255 - var7) * var1);
      return var4 << 24 | (var8 & 0xFF) << 16 | (var9 & 0xFF) << 8 | var10 & 0xFF;
   }

   public static String getSkinUrlByID(String uuid) throws Exception {
      String skinURL = "";
      URL profileURL = new URL("https://sessionserver.mojang.com/session/minecraft/profile/" + uuid);
      BufferedReader var5 = new BufferedReader(new InputStreamReader(profileURL.openStream()));
      String var6 = "";

      String var7;
      while ((var7 = var5.readLine()) != null) {
         var6 = var6 + var7;
      }

      String var8 = "";
      JSONObject var9 = new JSONObject(var6);

      for (Object var12 : var9.getJSONArray("properties")) {
         JSONObject var13 = (JSONObject) var12;
         if (var13.has("value") && var13.has("name")) {
            var8 = var13.getString("value");
         }
      }

      if (Base64.isBase64(var8)) {
         String var14 = new String(Base64.decodeBase64(var8));
         JSONObject var15 = new JSONObject(var14);
         if (var15.has("textures")) {
            JSONObject var16 = var15.getJSONObject("textures");
            if (var16.has("SKIN")) {
               skinURL = var16.getJSONObject("SKIN").getString("url");
            }
         }

         System.out.println(skinURL);
         return skinURL;
      } else {
         return skinURL;
      }
   }

   public static List<String> method17700(String uuid) throws Exception {
      ArrayList<String> var3 = new ArrayList<>();
      String var4;
      System.out.println("https://api.mojang.com/user/profiles/" + uuid.replaceAll("-", "") + "/names");
      CloseableHttpClient var5 = HttpClients.createDefault();
      HttpGet var6 = new HttpGet("https://api.mojang.com/user/profiles/" + uuid.replaceAll("-", "") + "/names");
      CloseableHttpResponse var7 = var5.execute(var6);
      int var8 = var7.getStatusLine().getStatusCode();
      if (var8 == 204) {
         ArrayList<String> var15 = new ArrayList<>();
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
      float var8;
      float var9;
      if (!(var7 <= var6)) {
         var8 = var2;
         var9 = var1 * var2 / var0;
      } else {
         var8 = var0 * var3 / var1;
         var9 = var3;
      }

      float var10 = (var2 - var8) / 2.0F;
      float var11 = (var3 - var9) / 2.0F;
      return new float[] { var10, var11, var8, var9 };
   }

   public static int method17705() {
      for (NetworkPlayerInfo var3 : mc.getConnection().method15790()) {
         if (var3.method19966().getId().equals(mc.player.getUniqueID()) && !mc.isIntegratedServerRunning()) {
            return var3.method19969();
         }
      }

      return 0;
   }

   public static List<Entity> getEntitesInWorld() {
      ArrayList<Entity> entities = new ArrayList<>();
      mc.world.entitiesById.forEach((entity1, entity2) -> entities.add(entity2));
      return entities;
   }

   public static float[] method17709(int var0) {
      float var3 = (float) (var0 >> 24 & 0xFF) / 255.0F;
      float var4 = (float) (var0 >> 16 & 0xFF) / 255.0F;
      float var5 = (float) (var0 >> 8 & 0xFF) / 255.0F;
      float var6 = (float) (var0 & 0xFF) / 255.0F;
      return new float[] { var4, var5, var6, var3 };
   }

   public static float method17710(int var0) {
      return (float) (var0 >> 24 & 0xFF) / 255.0F;
   }

   public static Entity getEntityFromRayTrace(float yaw, float pitch, float reachDistanceModifier,
         double boundingBoxExpansion) {
      EntityRayTraceResult rayTraceResult = rayTraceFromPlayer(yaw, pitch, reachDistanceModifier, boundingBoxExpansion);
      return rayTraceResult == null ? null : rayTraceResult.getEntity();
   }

   public static EntityRayTraceResult rayTraceFromPlayer(float yaw, float pitch, float reachDistanceModifier,
         double boundingBoxExpansion) {
      Vector3d playerEyesPos = new Vector3d(
            mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ());
      Entity renderViewEntity = mc.getRenderViewEntity();

      if (renderViewEntity != null && mc.world != null) {
         double reachDistance = (double) mc.playerController.getBlockReachDistance();
         if (reachDistanceModifier != 0.0F) {
            reachDistance = (double) reachDistanceModifier;
         }

         Vector3d lookVector = getLookVector(pitch, yaw);
         Vector3d rayEndPos = playerEyesPos.add(lookVector.x * reachDistance, lookVector.y * reachDistance,
               lookVector.z * reachDistance);
         AxisAlignedBB searchBox = renderViewEntity.getBoundingBox().expand(lookVector.scale(reachDistance)).grow(1.0,
               1.0, 1.0);

         return traceEntityRay(
               mc.world, renderViewEntity, playerEyesPos, rayEndPos, searchBox,
               entity -> entity instanceof LivingEntity || entity instanceof FallingBlockEntity,
               (double) (reachDistanceModifier * reachDistanceModifier), boundingBoxExpansion);
      } else {
         return null;
      }
   }

   public static EntityRayTraceResult traceEntityRay(
         World world, Entity sourceEntity, Vector3d startPos, Vector3d endPos, AxisAlignedBB searchBox,
         Predicate<Entity> entityFilter, double maxDistance, double boundingBoxExpansion) {
      double closestDistance = maxDistance;
      Entity closestEntity = null;

      for (Entity entity : world.getEntitiesInAABBexcluding(sourceEntity, searchBox, entityFilter)) {
         AxisAlignedBB expandedBox = entity.getBoundingBox().grow(boundingBoxExpansion);
         Optional<Vector3d> hitResult = expandedBox.rayTrace(startPos, endPos);

         if (!hitResult.isPresent()) {
            if (method17715(sourceEntity.getPositionVec(), expandedBox)) {
               closestEntity = entity;
               break;
            }
         } else {
            double distanceToHit = startPos.squareDistanceTo(hitResult.get());
            if (distanceToHit < closestDistance) {
               closestEntity = entity;
               closestDistance = distanceToHit;
            }
         }
      }

      return closestEntity != null ? new EntityRayTraceResult(closestEntity) : null;
   }

   public static boolean rayTraceEntity(PlayerEntity player, Entity entity) {
      Minecraft mc = Minecraft.getInstance();

      Vector3d playerEyesPos = player.getEyePosition(1.0F);
      Vector3d lookDirection = player.getLook(1.0F);

      double reachDistance = mc.playerController.getBlockReachDistance();
      Vector3d endPos = playerEyesPos.add(lookDirection.x * reachDistance, lookDirection.y * reachDistance,
            lookDirection.z * reachDistance);

      AxisAlignedBB entityBoundingBox = entity.getBoundingBox().grow(0.3D);

      RayTraceContext context = new RayTraceContext(
            playerEyesPos,
            endPos,
            RayTraceContext.BlockMode.COLLIDER,
            RayTraceContext.FluidMode.NONE,
            player);
      RayTraceResult rayTraceResult = mc.world.rayTraceBlocks(context);

      if (rayTraceResult.getType() == RayTraceResult.Type.MISS) {
         Optional<Vector3d> hitResult = entityBoundingBox.rayTrace(playerEyesPos, endPos);

         return hitResult.isPresent();
      }

      return false;
   }

   public static EntityRayTraceResult method17714(Entity var0, float var1, float var2, Predicate<Entity> var3,
         double var4) {
      double var8 = var4 * var4;
      Entity var10 = null;
      Vector3d var11 = null;
      Vector3d var12 = new Vector3d(
            mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ());
      Vector3d var13 = getLookVector(var2, var1);
      Vector3d var14 = var12.add(var13.x * var8, var13.y * var8, var13.z * var8);

      for (Entity var16 : mc.world
            .getEntitiesInAABBexcluding(mc.player,
                  mc.player.getBoundingBox().expand(var13.scale(var8)).grow(1.0, 1.0, 1.0), var3)) {
         AxisAlignedBB var17 = var16.getBoundingBox();
         Optional<Vector3d> var18 = var17.rayTrace(var12, var14);
         if (var18.isPresent()) {
            double var19 = var12.squareDistanceTo(var18.get());
            if (var19 < var8 && (var16 == var0 || var0 == null)) {
               var11 = var18.get().method11337(var16.getPosX(), var16.getPosY(), var16.getPosZ());
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

   public static boolean isCubecraft() {
      return mc.getIntegratedServer() == null && mc.getCurrentServerData() != null
            && mc.getCurrentServerData().serverIP.toLowerCase().contains("cubecraft.net");
   }

   public static Vector3d getLookVector(float var0, float var1) {
      float var4 = var0 * (float) (Math.PI / 180.0);
      float var5 = -var1 * (float) (Math.PI / 180.0);
      float var6 = MathHelper.cos(var5);
      float var7 = MathHelper.sin(var5);
      float var8 = MathHelper.cos(var4);
      float var9 = MathHelper.sin(var4);
      return new Vector3d((double) (var7 * var8), (double) (-var9), (double) (var6 * var8));
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

   public static boolean method17729() {
      AxisAlignedBB var2 = mc.player.boundingBox.offset(0.0, -1.0, 0.0);
      if (mc.player.getRidingEntity() != null) {
         double var4 = mc.player.getRidingEntity().prevPosX - mc.player.getRidingEntity().getPosX();
         double var6 = mc.player.getRidingEntity().prevPosZ - mc.player.getRidingEntity().getPosZ();
         var2 = mc.player.getRidingEntity().boundingBox.expand(Math.abs(var4), 1.0, Math.abs(var6));
      }

      Stream<VoxelShape> var3 = mc.world.getCollisionShapes(mc.player, var2);
      return var3.findAny().isPresent();
   }

   public static boolean isAboveBounds(Entity var0, float var1) {
      AxisAlignedBB var4 = new AxisAlignedBB(
            var0.boundingBox.minX,
            var0.boundingBox.minY - (double) var1,
            var0.boundingBox.minZ,
            var0.boundingBox.maxX,
            var0.boundingBox.maxY,
            var0.boundingBox.maxZ);
      Stream<VoxelShape> var5 = mc.world.getCollisionShapes(mc.player, var4);
      return var5.findAny().isPresent();
   }

   public static void block() {
      mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.MAIN_HAND));
      mc.getConnection().sendPacket(new CPlayerTryUseItemPacket(Hand.OFF_HAND));
   }

   public static void unblock() {
      mc.getConnection().sendPacket(new CPlayerDiggingPacket(CPlayerDiggingPacket.Action.RELEASE_USE_ITEM,
            new BlockPos(0, 0, 0), Direction.DOWN));
   }

   public static void swing(Entity var0, boolean swing) {
      if (var0 == null) {
         return;
      }

      boolean isOnePointEight = false;

      if (isOnePointEight && swing) {
         mc.player.swingArm(Hand.MAIN_HAND);
      }

      mc.getConnection().getNetworkManager().sendNoEventPacket(new CUseEntityPacket(var0, mc.player.isSneaking()));

      boolean canSwing = (double) mc.player.getCooledAttackStrength(0.5F) > 0.9 || isOnePointEight;

      mc.player.resetCooldown();
      if (!isOnePointEight && swing) {
         mc.player.swingArm(Hand.MAIN_HAND);
      }

      mc.playerController.attackEntity(mc.player, var0);
   }

   public static String getKeyName(int var0) {
      for (Class2287 var6 : Class2287.values()) {
         if (var6.field15204 == var0) {
            return var6.field15201;
         }
      }

      InputMappingsInput var7 = InputMappings.method38637(var0, 0);
      String[] var8 = var7.getTranslationKey().split("\\.");
      if (var8.length != 0) {
         String var9 = var8[var8.length - 1];
         if (!var9.isEmpty()) {
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

   public static boolean projectToScreen(float x, float y, float z, FloatBuffer modelMatrix,
         FloatBuffer projectionMatrix, IntBuffer viewport, FloatBuffer screenCoords) {
      float[] inVector = field24951;
      float[] outVector = field24952;

      // Load input coordinates into the vector
      inVector[0] = x;
      inVector[1] = y;
      inVector[2] = z;
      inVector[3] = 1.0F;

      // Apply the model and projection transformations
      transformVector(modelMatrix, inVector, outVector);
      transformVector(projectionMatrix, outVector, inVector);

      // Perform perspective division if the w-component is non-zero
      if ((double) inVector[3] != 0.0) {
         inVector[3] = 1.0F / inVector[3] * 0.5F;
         inVector[0] = inVector[0] * inVector[3] + 0.5F;
         inVector[1] = inVector[1] * inVector[3] + 0.5F;
         inVector[2] = inVector[2] * inVector[3] + 0.5F;

         // Map to screen coordinates using the viewport
         screenCoords.put(0, inVector[0] * (float) viewport.get(viewport.position() + 2)
               + (float) viewport.get(viewport.position() + 0));
         screenCoords.put(1, inVector[1] * (float) viewport.get(viewport.position() + 3)
               + (float) viewport.get(viewport.position() + 1));
         screenCoords.put(2, inVector[2]);

         return true;
      } else {
         return false;
      }
   }

   private static void transformVector(FloatBuffer matrixBuffer, float[] inputVector, float[] outputVector) {
      for (int i = 0; i < 4; i++) {
         outputVector[i] = inputVector[0] * matrixBuffer.get(matrixBuffer.position() + i)
               + inputVector[1] * matrixBuffer.get(matrixBuffer.position() + 4 + i)
               + inputVector[2] * matrixBuffer.get(matrixBuffer.position() + 8 + i)
               + inputVector[3] * matrixBuffer.get(matrixBuffer.position() + 12 + i);
      }
   }

   public static void method17739() {
      if (mc.getRenderViewEntity() instanceof PlayerEntity && Client.getInstance().guiManager.method33470()) {
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
         mc.gameRenderer.shaderGroup.listShaders.get(0).getShaderManager().getShaderUniform("Radius").set((float) var0);
         mc.gameRenderer.shaderGroup.listShaders.get(1).getShaderManager().getShaderUniform("Radius").set((float) var0);
      }
   }

   public static void resetShaders() {
      if (mc.gameRenderer.shaderIndex == GameRenderer.SHADER_COUNT) {
         mc.gameRenderer.shaderGroup = null;
      } else {
         mc.gameRenderer.loadShader(GameRenderer.SHADERS_TEXTURES[mc.gameRenderer.shaderIndex]);
      }
   }

   public static Class2258 method17744(Entity var0) {
      if (var0 instanceof LivingEntity) {
         if (!(var0 instanceof PlayerEntity)) {
            return !(var0 instanceof MobEntity) && !(var0 instanceof MonsterEntity) && !(var0 instanceof SlimeEntity)
                  && !(var0 instanceof Class1111)
                        ? Class2258.field14691
                        : Class2258.field14689;
         } else {
            return Class2258.field14690;
         }
      } else {
         return Class2258.field14692;
      }
   }

   public static String[] method17745(String var0, int var1, TrueTypeFont var2) {
      String[] var5 = var0.split(" ");
      HashMap<Integer, String> var6 = new HashMap();
      int var7 = 0;

      for (String var11 : var5) {
         String var12 = var6.get(var7) != null ? (String) var6.get(var7) : "";
         boolean var13 = var6.get(var7) == null;
         boolean var14 = var2.getWidth(var12) + var2.getWidth(var11) <= var1;
         boolean var15 = var2.getWidth(var11) >= var1;
         if (!var14 && !var15) {
            var7++;
            var12 = var6.get(var7) != null ? (String) var6.get(var7) : "";
            var13 = var6.get(var7) == null;
            var14 = var2.getWidth(var12) + var2.getWidth(var11) <= var1;
            var15 = var2.getWidth(var11) >= var1;
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
                     if (var2.getWidth(var17) > var1) {
                        var16++;
                        continue;
                     }

                     var6.put(++var7, var17);
                     var11 = var11.substring(var11.length() - var16, var11.length());
                  }

                  var12 = var6.get(var7) != null ? (String) var6.get(var7) : "";
                  var14 = var2.getWidth(var12) + var2.getWidth(var11) <= var1;
                  var15 = var2.getWidth(var11) >= var1;
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
               } catch (IOException ignored) {
               }
            } catch (UnknownHostException ignored) {
            }
         }).start();
      }
   }

   public static double[] method17747() {
      return new double[] { 0.0, 0.0625, 0.125, 0.25, 0.3125, 0.5, 0.625, 0.75, 0.8125, 0.875, 0.9375, 1.0, 1.0625,
            1.125, 1.25, 1.3125, 1.375 };
   }

   public static void method17749(boolean var0) {
      double var3 = mc.player.getPosX();
      double var5 = mc.player.getPosY();
      double var7 = mc.player.getPosZ();
      int var9 = 49 + MovementUtil.getJumpBoost() * 17;

      for (int var10 = 0; var10 < var9; var10++) {
         double var11 = !var0 ? 0.0 : method17750();
         mc.getConnection().sendPacket(
               new CPlayerPacket.PositionPacket(var3 + var11, var5 + 0.06248 + method17750(), var7 + var11, false));
         if (isHypixel()) {
            mc.getConnection().sendPacket(
                  new CPlayerPacket.PositionPacket(var3 + var11, var5 + 0.05 + method17750(), var7 + var11, false));
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
      double var3 = var0.getCenter().x;
      double var5 = var0.minY;
      double var7 = var0.getCenter().z;
      double var9 = (var0.maxY - var5) * 0.95;
      double var11 = (var0.maxX - var0.minX) * 0.95;
      double var13 = (var0.maxZ - var0.minZ) * 0.95;
      double var15 = Math.max(var5, Math.min(var5 + var9, mc.player.getPosY() + (double) mc.player.getEyeHeight()));
      double var17 = Math.max(var3 - var11 / 2.0, Math.min(var3 + var11 / 2.0, mc.player.getPosX()));
      double var19 = Math.max(var7 - var13 / 2.0, Math.min(var7 + var13 / 2.0, mc.player.getPosZ()));
      return new Vector3d(var17, var15, var19);
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

   public static Class9629<Direction, Vector3d> method17760(double var0) {
      AxisAlignedBB var4 = mc.player.boundingBox;
      Direction[] var5 = new Direction[] { Direction.EAST, Direction.WEST, Direction.SOUTH, Direction.NORTH };

      for (Direction var9 : var5) {
         Iterator var10 = mc.world
               .getCollisionShapes(mc.player,
                     var4.expand(var0 * (double) var9.getXOffset(), 0.0, var0 * (double) var9.getZOffset()))
               .iterator();
         if (var10.hasNext()) {
            Vector3d var11 = mc.player
                  .getPositionVec()
                  .add(mc.player
                        .getAllowedMovement(new Vector3d((double) var9.getXOffset(), 0.0, (double) var9.getZOffset())));
            return new Class9629<>(var9, var11);
         }
      }

      return null;
   }

   public static boolean method17761() {
      double var2 = 1.0E-7;
      return mc.world
            .getCollisionShapes(mc.player, mc.player.boundingBox.expand(var2, 0.0, var2).expand(-var2, 0.0, -var2))
            .findAny().isPresent();
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
