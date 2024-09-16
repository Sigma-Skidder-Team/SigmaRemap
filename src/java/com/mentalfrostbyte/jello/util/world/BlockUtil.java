package com.mentalfrostbyte.jello.util.world;

import com.google.common.collect.ImmutableList;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import net.minecraft.util.registry.Registry;
import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BlockUtil {
    private static final Minecraft mc = Minecraft.getInstance();

   public static boolean method34535(PlayerEntity var0, BlockPos var1) {
      return method34550(var0, var1) < method34560();
   }

   public static final Block getBlockFromPosition(BlockPos blockPos) {
      return mc.world.getBlockState(blockPos).getBlock();
   }

   public static final Block method34537(double var0, double var2, double var4) {
      return getBlockFromPosition(new BlockPos(var0, var2, var4));
   }

   public static boolean method34538(Block var0, BlockPos var1) {
      VoxelShape var4 = var0.method11579().method23414(mc.world, var1);
      return !method34578(var1)
         && mc.world.checkNoEntityCollision(mc.player, var4)
         && var1.getY() <= mc.player.getPosition().getY();
   }

   public static void method34539(BlockPos var0) {
      double var3 = (double)var0.getX() + 0.5 - Minecraft.getInstance().player.getPosX();
      double var5 = (double)var0.getY() + 0.5 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight());
      double var7 = (double)var0.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ();
      double var9 = (double) MathHelper.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      Minecraft.getInstance().player.rotationYaw = Minecraft.getInstance().player.rotationYaw
         + MathHelper.method37792(var11 - Minecraft.getInstance().player.rotationYaw);
      Minecraft.getInstance().player.rotationPitch = Minecraft.getInstance().player.rotationPitch
         + MathHelper.method37792(var12 - Minecraft.getInstance().player.rotationPitch);
   }

   public static void method34540(BlockPos var0) {
      double var3 = (double)var0.getX() + 0.5 - Minecraft.getInstance().player.getPosX();
      double var5 = (double)var0.getY() + 0.5 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight());
      double var7 = (double)var0.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ();
      double var9 = (double) MathHelper.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      Minecraft.getInstance()
         .getConnection()
         .sendPacket(
            new CPlayerPacket.RotationPacket(
               Minecraft.getInstance().player.rotationYaw + MathHelper.method37792(var11 - Minecraft.getInstance().player.rotationYaw),
               Minecraft.getInstance().player.rotationPitch + MathHelper.method37792(var12 - Minecraft.getInstance().player.rotationPitch),
               Minecraft.getInstance().player.onGround
            )
         );
   }

   public static float[] method34541(BlockPos var0) {
      double var3 = (double)var0.getX() + 0.5 - Minecraft.getInstance().player.getPosX();
      double var5 = (double)var0.getY() - 0.25 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight());
      double var7 = (double)var0.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ();
      double var9 = (double) MathHelper.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)(Math.atan2(var7, var3) * 180.0 / Math.PI) - 90.0F;
      float var12 = (float)(-(Math.atan2(var5, var9) * 180.0 / Math.PI));
      return new float[]{
         Minecraft.getInstance().player.rotationYaw + MathHelper.method37792(var11 - Minecraft.getInstance().player.rotationYaw),
         Minecraft.getInstance().player.rotationPitch + MathHelper.method37792(var12 - Minecraft.getInstance().player.rotationPitch)
      };
   }

   public static float[] method34542(BlockPos var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = 0.0F;
      switch (Class4438.field21590[var1.ordinal()]) {
         case 1:
            var4 += 0.49F;
            break;
         case 2:
            var5 -= 0.49F;
            break;
         case 3:
            var5 += 0.49F;
            break;
         case 4:
            var4 -= 0.49F;
            break;
         case 5:
            var6 += 0.0F;
         case 6:
            var6++;
      }

      double var7 = (double)var0.getX() + 0.5 - Minecraft.getInstance().player.getPosX() + (double)var4;
      double var9 = (double)var0.getY()
         - 0.02
         - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
         + (double)var6;
      double var11 = (double)var0.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double)var5;
      double var13 = (double) MathHelper.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{
         Minecraft.getInstance().player.rotationYaw + MathHelper.method37792(var15 - Minecraft.getInstance().player.rotationYaw),
         Minecraft.getInstance().player.rotationPitch + MathHelper.method37792(var16 - Minecraft.getInstance().player.rotationPitch)
      };
   }

   public static float[] method34543(BlockPos var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      float var6 = (float)(0.4F + Math.random() * 0.1F);
      switch (Class4438.field21590[var1.ordinal()]) {
         case 1:
            var4 += 0.49F;
            break;
         case 2:
            var5 -= 0.49F;
            break;
         case 3:
            var5 += 0.49F;
            break;
         case 4:
            var4 -= 0.49F;
            break;
         case 5:
            var6 = 0.0F;
            var4 = 0.26F - (float)(Math.random() * 0.2F);
            var5 = 0.26F - (float)(Math.random() * 0.2F);
         case 6:
            var6 = 1.0F;
            var4 = 0.26F - (float)(Math.random() * 0.2F);
            var5 = 0.26F - (float)(Math.random() * 0.2F);
      }

      if (var4 == 0.0F) {
         var4 = (float)(0.1F - Math.sin((double)(System.currentTimeMillis() - 500L) / 1200.0) * 0.2);
      }

      if (var5 == 0.0F) {
         var5 = (float)(0.1F - Math.sin((double)(System.currentTimeMillis() - 500L) / 1000.0) * 0.2);
      }

      if (var6 == 0.0F) {
         var6 = (float)(0.6F - Math.sin((double)(System.currentTimeMillis() - 500L) / 1600.0) * 0.2);
      }

      double var7 = (double)var0.getX() + 0.5 - Minecraft.getInstance().player.getPosX() + (double)var4;
      double var9 = (double)var0.getY()
         - 0.02
         - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
         + (double)var6;
      double var11 = (double)var0.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double)var5;
      double var13 = (double) MathHelper.sqrt(var7 * var7 + var11 * var11);
      float var15 = (float)(Math.atan2(var11, var7) * 180.0 / Math.PI) - 90.0F;
      float var16 = (float)(-(Math.atan2(var9, var13) * 180.0 / Math.PI));
      return new float[]{
         Minecraft.getInstance().player.rotationYaw + MathHelper.method37792(var15 - Minecraft.getInstance().player.rotationYaw),
         Minecraft.getInstance().player.rotationPitch + MathHelper.method37792(var16 - Minecraft.getInstance().player.rotationPitch)
      };
   }

   public static float method34544(BlockPos var0, Direction var1) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      switch (Class4438.field21590[var1.ordinal()]) {
         case 1:
            var4 += 0.49F;
            break;
         case 2:
            var5 -= 0.49F;
            break;
         case 3:
            var5 += 0.49F;
            break;
         case 4:
            var4 -= 0.49F;
      }

      double var6 = (double)var0.getX() + 0.5 - Minecraft.getInstance().player.getPosX() + (double)var4;
      double var8 = (double)var0.getZ() + 0.5 - Minecraft.getInstance().player.getPosZ() + (double)var5;
      double var10 = (double)var0.getY()
         - 0.02
         - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
         + 1.0;
      double var12 = (double)var0.getY() - 0.02 - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight());
      double var14 = (double) MathHelper.sqrt(var6 * var6 + var8 * var8);
      float var16 = (float)(-(Math.atan2(var10, var14) * 180.0 / Math.PI));
      float var17 = (float)(-(Math.atan2(var12, var14) * 180.0 / Math.PI));
      return var17 - var16;
   }

   public static List<BlockPos> method34545(List<BlockPos> var0) {
      var0.sort((var0x, var1) -> {
         float var4 = method34550(mc.player, var0x);
         float var5 = method34550(mc.player, var1);
         if (!(var4 > var5)) {
            return var4 != var5 ? -1 : 0;
         } else {
            return 1;
         }
      });
      return var0;
   }

   public static List<BlockPos> method34546(List<BlockPos> var0, Vector3d var1) {
      var0.sort((var1x, var2) -> {
         float var5 = method34551(var1, var1x);
         float var6 = method34551(var1, var2);
         if (!(var5 > var6)) {
            return var5 != var6 ? -1 : 0;
         } else {
            return 1;
         }
      });
      return var0;
   }

   public static List<BlockPos> method34547(List<BlockPos> var0, Vector3d var1, boolean var2) {
      if (!var2) {
         method34546(var0, var1);
      } else {
         var0.sort((var1x, var2x) -> !(method34552(var1, var1x) >= method34552(var1, var2x)) ? -1 : 1);
      }

      return var0;
   }

   public static List<Entity> getVisibleEntities(List<Entity> var0) {
      Collections.sort(var0, new Class3576());
      return var0;
   }

   public static List<PlayerEntity> method34549(List<PlayerEntity> var0) {
      Collections.sort(var0, new Class3583());
      return var0;
   }

   public static float method34550(Entity var0, BlockPos var1) {
      return method34553(var0, (double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
   }

   public static float method34551(Vector3d var0, BlockPos var1) {
      return method34554(var0, (double)var1.getX(), (double)var1.getY(), (double)var1.getZ());
   }

   public static float method34552(Vector3d var0, BlockPos var1) {
      return method34555(var0, (double)var1.getX(), (double)var1.getZ());
   }

   public static float method34553(Entity var0, double var1, double var3, double var5) {
      float var9 = (float)(var0.getPosX() - var1);
      float var10 = (float)(var0.getPosY() - var3);
      float var11 = (float)(var0.getPosZ() - var5);
      return method34558(var9, var10, var11);
   }

   public static float method34554(Vector3d var0, double var1, double var3, double var5) {
      float var9 = (float)(var0.getX() - var1);
      float var10 = (float)(var0.getY() - var3);
      float var11 = (float)(var0.getZ() - var5);
      return method34558(var9, var10, var11);
   }

   public static float method34555(Vector3d var0, double var1, double var3) {
      float var7 = (float)(var0.getX() - var1);
      float var8 = (float)(var0.getZ() - var3);
      return method34557(var7, var8);
   }

   public static float method34556(double var0, double var2, double var4, double var6, double var8, double var10) {
      float var14 = (float)(var0 - var6);
      float var15 = (float)(var2 - var8);
      float var16 = (float)(var4 - var10);
      return method34558(var14, var15, var16);
   }

   private static float method34557(float var0, float var1) {
      return MathHelper.method37765((var0 - 0.5F) * (var0 - 0.5F) + (var1 - 0.5F) * (var1 - 0.5F));
   }

   private static float method34558(float var0, float var1, float var2) {
      return MathHelper.method37765((var0 - 0.5F) * (var0 - 0.5F) + (var1 - 0.5F) * (var1 - 0.5F) + (var2 - 0.5F) * (var2 - 0.5F));
   }

   public static Block method34559(PlayerEntity var0) {
      return getBlockFromPosition(var0.getPosition().down());
   }

   public static float method34560() {
      return mc.playerController.getBlockReachDistance();
   }

   public static List<BlockPos> method34561(float var0) {
      ArrayList var3 = new ArrayList();

      for (float var4 = -var0; var4 <= var0; var4++) {
         for (float var5 = -var0; var5 <= var0; var5++) {
            for (float var6 = -var0; var6 <= var0; var6++) {
               BlockPos var7 = new BlockPos(
                  mc.player.getPosX() + (double)var5,
                  mc.player.getPosY() + (double)var4,
                  mc.player.getPosZ() + (double)var6
               );
               var3.add(var7);
            }
         }
      }

      return var3;
   }

   public static List<BlockPos> method34562(double var0, double var2, double var4) {
      ArrayList var8 = new ArrayList();

      for (float var9 = -method34560(); var9 <= method34560(); var9++) {
         for (float var10 = -method34560(); var10 <= method34560(); var10++) {
            for (float var11 = -method34560(); var11 <= method34560(); var11++) {
               BlockPos var12 = new BlockPos(var0 + (double)var10, var2 + (double)var9, var4 + (double)var11);
               var8.add(var12);
            }
         }
      }

      return var8;
   }

   public static List<BlockPos> method34563() {
      ArrayList var2 = new ArrayList();
      byte var3 = 90;
      byte var4 = 10;

      for (float var5 = (float)(-var3); var5 <= (float)var3; var5++) {
         for (float var6 = (float)(-var4); var6 <= (float)var4; var6++) {
            for (float var7 = (float)(-var4); var7 <= (float)var4; var7++) {
               BlockPos var8 = new BlockPos(
                  mc.player.getPosX() + (double)var6,
                  mc.player.getPosY() + (double)var5,
                  mc.player.getPosZ() + (double)var7
               );
               if (mc.world.getBlockState(var8).getBlock() instanceof Class3420) {
                  var2.add(var8);
               }
            }
         }
      }

      return var2;
   }

   public static BlockPos method34564(float var0, float var1, float var2) {
      BlockRayTraceResult var5 = rayTrace(var0, var1, var2);
      return var5 != null ? var5.getPos() : null;
   }

   public static float[] method34565() {
      BlockRayTraceResult var2 = method34566(MovementUtils.method37086() - 270.0F);
      if (var2.getType() != RayTraceResult.Type.MISS) {
         double var3 = var2.method31419().x - (double)var2.getPos().getX();
         double var5 = var2.method31419().z - (double)var2.getPos().getZ();
         double var7 = var2.method31419().y - (double)var2.getPos().getY();
         double var9 = (double)var2.getPos().getX() - Minecraft.getInstance().player.getPosX() + var3;
         double var11 = (double)var2.getPos().getY()
            - (Minecraft.getInstance().player.getPosY() + (double) Minecraft.getInstance().player.getEyeHeight())
            + var7;
         double var13 = (double)var2.getPos().getZ() - Minecraft.getInstance().player.getPosZ() + var5;
         double var15 = (double) MathHelper.sqrt(var9 * var9 + var13 * var13);
         float var17 = (float)(Math.atan2(var13, var9) * 180.0 / Math.PI) - 90.0F;
         float var18 = (float)(-(Math.atan2(var11, var15) * 180.0 / Math.PI));
         return new float[]{
            Minecraft.getInstance().player.rotationYaw + MathHelper.method37792(var17 - Minecraft.getInstance().player.rotationYaw),
            Minecraft.getInstance().player.rotationPitch + MathHelper.method37792(var18 - Minecraft.getInstance().player.rotationPitch)
         };
      } else {
         return null;
      }
   }

   public static BlockRayTraceResult method34566(float var0) {
      Vector3d var3 = new Vector3d(mc.player.field6119, mc.player.field6120 - 0.8F, mc.player.field6121);
      var0 = (float)Math.toRadians((double)var0);
      float var4 = 0.0F;
      float var5 = -MathHelper.sin(var0) * MathHelper.cos(var4);
      float var6 = MathHelper.cos(var0) * MathHelper.cos(var4);
      float var7 = 2.3F;
      Vector3d var8 = new Vector3d(
         mc.player.field6119 + (double)(var5 * var7),
         mc.player.field6120 - 0.8F - (double)(!mc.player.isJumping ? 0.0F : 0.6F),
         mc.player.field6121 + (double)(var6 * var7)
      );
      Entity var9 = mc.getRenderViewEntity();
      return mc.world.rayTraceBlocks(new RayTraceContext(var3, var8, Class2271.field14775, Class1985.field12962, var9));
   }

   public static BlockRayTraceResult rayTrace(float var0, float var1, float var2) {
      Vector3d var5 = new Vector3d(
         mc.player.field6119, mc.player.field6120 + (double) mc.player.getEyeHeight(), mc.player.field6121
      );
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var6 = -MathHelper.sin(var0) * MathHelper.cos(var1);
      float var7 = -MathHelper.sin(var1);
      float var8 = MathHelper.cos(var0) * MathHelper.cos(var1);
      if (var2 == 0.0F) {
         var2 = mc.playerController.getBlockReachDistance();
      }

      Vector3d var9 = new Vector3d(
         mc.player.field6119 + (double)(var6 * var2),
         mc.player.field6120 + (double)(var7 * var2) + (double) mc.player.getEyeHeight(),
         mc.player.field6121 + (double)(var8 * var2)
      );
      Entity var10 = mc.getRenderViewEntity();
      return mc.world.rayTraceBlocks(new RayTraceContext(var5, var9, Class2271.field14775, Class1985.field12962, var10));
   }

   public static BlockRayTraceResult method34568(float var0, float var1, float var2, EventUpdate var3) {
      Vector3d var6 = new Vector3d(var3.getX(), (double) mc.player.getEyeHeight() + var3.getY(), var3.getZ());
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var7 = -MathHelper.sin(var0) * MathHelper.cos(var1);
      float var8 = -MathHelper.sin(var1);
      float var9 = MathHelper.cos(var0) * MathHelper.cos(var1);
      if (var2 == 0.0F) {
         var2 = mc.playerController.getBlockReachDistance();
      }

      Vector3d var10 = new Vector3d(
         mc.player.field6119 + (double)(var7 * var2),
         mc.player.field6120 + (double)(var8 * var2) + (double) mc.player.getEyeHeight(),
         mc.player.field6121 + (double)(var9 * var2)
      );
      Entity var11 = mc.getRenderViewEntity();
      return mc.world.rayTraceBlocks(new RayTraceContext(var6, var10, Class2271.field14775, Class1985.field12962, var11));
   }

   public static RayTraceResult method34569(float var0, float var1, float var2, float var3) {
      double var6 = Math.cos((double) MovementUtils.method37086() * Math.PI / 180.0) * (double)var3;
      double var8 = Math.sin((double) MovementUtils.method37086() * Math.PI / 180.0) * (double)var3;
      Vector3d var10 = new Vector3d(
         mc.player.getPosX() + var6,
         mc.player.getPosY() + (double) mc.player.getEyeHeight(),
         mc.player.getPosZ() + var8
      );
      var0 = (float)Math.toRadians((double)var0);
      var1 = (float)Math.toRadians((double)var1);
      float var11 = -MathHelper.sin(var0) * MathHelper.cos(var1);
      float var12 = -MathHelper.sin(var1);
      float var13 = MathHelper.cos(var0) * MathHelper.cos(var1);
      if (var2 == 0.0F) {
         var2 = mc.playerController.getBlockReachDistance();
      }

      Vector3d var14 = new Vector3d(
         mc.player.field6119 + (double)(var11 * var2),
         mc.player.field6120 + (double)(var12 * var2) + (double) mc.player.getEyeHeight(),
         mc.player.field6121 + (double)(var13 * var2)
      );
      Entity var15 = mc.getRenderViewEntity();
      return mc.world.rayTraceBlocks(new RayTraceContext(var10, var14, Class2271.field14775, Class1985.field12962, var15));
   }

   public static RayTraceResult method34570(BlockPos var0) {
      Vector3d var3 = new Vector3d(
         mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ()
      );
      Vector3d var4 = new Vector3d(
         (double)var0.getX() + 0.5 + RandomUtils.nextDouble(0.01, 0.04),
         (double)var0.getY(),
         (double)var0.getZ() + 0.5 + RandomUtils.nextDouble(0.01, 0.04)
      );
      return mc.world.rayTraceBlocks(new RayTraceContext(var3, var4, Class2271.field14775, Class1985.field12962, mc.getRenderViewEntity()));
   }

   private boolean method34571(PositionFacing var1, float var2, float var3) {
      Vector3d var6 = new Vector3d(
         mc.player.getPosX(), mc.player.getPosY() + (double) mc.player.getEyeHeight(), mc.player.getPosZ()
      );
      var2 = (float)Math.toRadians((double)var2);
      var3 = (float)Math.toRadians((double)var3);
      float var7 = -MathHelper.sin(var2) * MathHelper.cos(var3);
      float var8 = -MathHelper.sin(var3);
      float var9 = MathHelper.cos(var2) * MathHelper.cos(var3);
      float var10 = mc.playerController.getBlockReachDistance();
      Vector3d var11 = new Vector3d(
         mc.player.getPosX() + (double)(var7 * var10),
         mc.player.getPosY() + (double)(var8 * var10) + (double) mc.player.getEyeHeight(),
         mc.player.getPosZ() + (double)(var9 * var10)
      );
      Entity var12 = mc.getRenderViewEntity();
      BlockRayTraceResult var13 = mc.world.rayTraceBlocks(new RayTraceContext(var6, var11, Class2271.field14775, Class1985.field12964, var12));
      return var13 == null ? false : var13.getPos().equals(var1.blockPos) && var13.getFace() == var1.direction;
   }

   public static Vector3d method34572(Direction var0, BlockPos var1) {
      float var4 = (float)Math.max(0, var0.method539());
      float var5 = (float)Math.max(0, var0.method541());
      float var6 = (float)var1.getX() + var4 + (var0.method539() != 0 ? 0.0F : (float)Math.random());
      float var7 = (float)var1.getY() + (var0.method540() != 0 ? 0.0F : (var0.method540() != 1 ? (float)Math.random() : 1.0F));
      float var8 = (float)var1.getZ() + var5 + (var0.method541() != 0 ? 0.0F : (float)Math.random());
      return new Vector3d((double)var6, (double)var7, (double)var8);
   }

   public static int method34573(BlockState var0) {
      Block var3 = var0.getBlock();
      Class9348 var4 = var3.getStateContainer();
      ImmutableList var5 = var4.getValidStates();
      return var5.indexOf(var0);
   }

   public static int method34574(Block var0) {
      return Registry.BLOCK.getId(var0);
   }

   public static Class7843 method34575(BlockPos var0, boolean var1) {
      Vector3i[] var4 = new Vector3i[]{
         new Vector3i(0, 0, 0), new Vector3i(-1, 0, 0), new Vector3i(1, 0, 0), new Vector3i(0, 0, 1), new Vector3i(0, 0, -1)
      };
      Class7306[] var5 = new Class7306[]{
         new Class7306(1, 1, 1, false),
         new Class7306(2, 1, 2, false),
         new Class7306(3, 1, 3, false),
         new Class7306(4, 1, 4, false),
         new Class7306(0, -1, 0, true)
      };

      for (Class7306 var9 : var5) {
         for (Vector3i var13 : var4) {
            Vector3i var14 = !var9.field31325
               ? new Vector3i(var13.getX() * var9.field31322, var13.getY() * var9.field31323, var13.getZ() * var9.field31324)
               : new Vector3i(var13.getX() + var9.field31322, var13.getY() + var9.field31323, var13.getZ() + var9.field31324);

            for (Direction var18 : Direction.values()) {
               if ((var18 != Direction.DOWN || !var1) && method34578(var0.method8337(var14).method8350(var18, -1))) {
                  return new Class7843(var0.method8337(var14).method8350(var18, -1), var18);
               }
            }
         }
      }

      return null;
   }

   public static List<BlockPos> method34576(BlockPos var0) {
      ArrayList var3 = new ArrayList();
      float var4 = method34560() - 3.0F;

      for (float var5 = -var4; var5 < 1.0F; var5++) {
         for (float var6 = -var4; var6 <= var4; var6++) {
            for (float var7 = -var4; var7 <= var4; var7++) {
               BlockPos var8 = var0.method8335((double)var6, (double)var5, (double)var7);
               if (mc.player.getPosY() >= (double)var8.getY()) {
                  var3.add(var8);
               }
            }
         }
      }

      return var3;
   }

   public static Class7843 method34577(BlockPos var0, boolean var1, boolean var2) {
      float var5 = method34560();

      for (BlockPos var8 : method34547(
         method34576(var0), new Vector3d(mc.player.getPosX(), mc.player.getPosY(), mc.player.getPosZ()), var2
      )) {
         for (Direction var12 : Direction.values()) {
            if ((var12 != Direction.DOWN || !var1) && !method34578(var8) && method34578(var8.method8350(var12, -1))) {
               return new Class7843(var8.method8350(var12, -1), var12);
            }
         }
      }

      return null;
   }

   public static boolean method34578(BlockPos var0) {
      if (var0 != null) {
         Block var3 = mc.world.getBlockState(var0).getBlock();
         return !var3.method11579().method23410() && var3.method11579().getMaterial().method31089()
            ? false
            : !(var3 instanceof Class3410) || method34573(mc.world.getBlockState(var0)) != 0;
      } else {
         return false;
      }
   }

   public static float[] method34579(float var0, float var1, Class7843 var2) {
      BlockRayTraceResult var5 = rayTrace(var0, var1, mc.playerController.getBlockReachDistance());
      if (var5 != null && var5.getPos().equals(var2.field33646)) {
         return new float[]{var0, var1};
      } else {
         float var6 = method34541(var2.field33646)[0];
         Vector3d var7 = new Vector3d(
            (double)var2.field33646.getX() + 0.5, (double)var2.field33646.getY() + 0.5, (double)var2.field33646.getZ() + 0.5
         );
         float var8 = (var6 + 90.0F) * (float) (Math.PI / 180.0);
         double var9 = (double)(-MathHelper.sin(var8)) / 2.1;
         double var11 = (double) MathHelper.cos(var8) / 2.1;
         var7 = var7.add(var9, 0.0, var11);
         float[] var13 = RotationHelper.method34144(var7.x, var7.z, var7.y);
         float var14 = var13[0];
         float var15 = var13[1];
         var8 = (var6 - 90.0F) * (float) (Math.PI / 180.0);
         var9 = (double)(-MathHelper.sin(var8)) / 2.1;
         var11 = (double) MathHelper.cos(var8) / 2.1;
         var7 = new Vector3d(
            (double)var2.field33646.getX() + 0.5, (double)var2.field33646.getY() + 0.5, (double)var2.field33646.getZ() + 0.5
         );
         var7 = var7.add(var9, 0.0, var11);
         float[] var16 = RotationHelper.method34144(var7.x, var7.z, var7.y);
         float var17 = var16[0];
         float var18 = var16[1];
         float var19 = Math.abs(RotationHelper.method34142(MathHelper.method37792(var0), MathHelper.method37792(var14)));
         float var20 = Math.abs(RotationHelper.method34142(MathHelper.method37792(var0), MathHelper.method37792(var17)));
         return !(var19 < var20) ? new float[]{var17, var18} : new float[]{var14, var15};
      }
   }

   public static Direction method34580(BlockPos var0) {
      Direction var3 = Direction.field673;
      float var4 = MathHelper.method37792(method34581(var0, Direction.field673)[0]);
      if (var4 >= 45.0F && var4 <= 135.0F) {
         var3 = Direction.EAST;
      } else if ((!(var4 >= 135.0F) || !(var4 <= 180.0F)) && (!(var4 <= -135.0F) || !(var4 >= -180.0F))) {
         if (var4 <= -45.0F && var4 >= -135.0F) {
            var3 = Direction.WEST;
         } else if (var4 >= -45.0F && var4 <= 0.0F || var4 <= 45.0F && var4 >= 0.0F) {
            var3 = Direction.NORTH;
         }
      } else {
         var3 = Direction.SOUTH;
      }

      if (MathHelper.method37792(method34581(var0, Direction.field673)[1]) > 75.0F || MathHelper.method37792(method34581(var0, Direction.field673)[1]) < -75.0F) {
         var3 = Direction.field673;
      }

      return var3;
   }

   public static float[] method34581(BlockPos var0, Direction var1) {
      double var4 = (double)var0.getX() + 0.5 - mc.player.getPosX() + (double)var1.method539() / 2.0;
      double var6 = (double)var0.getZ() + 0.5 - mc.player.getPosZ() + (double)var1.method541() / 2.0;
      double var8 = mc.player.getPosY() + (double) mc.player.getEyeHeight() - ((double)var0.getY() + 0.5);
      double var10 = (double) MathHelper.sqrt(var4 * var4 + var6 * var6);
      float var12 = (float)(Math.atan2(var6, var4) * 180.0 / Math.PI) - 90.0F;
      float var13 = (float)(Math.atan2(var8, var10) * 180.0 / Math.PI);
      if (var12 < 0.0F) {
         var12 += 360.0F;
      }

      return new float[]{var12, var13};
   }

   private float method34582(Entity var1, BlockPos var2) {
      float var5 = 6.0F;
      float var6 = (float)var2.getX() + 0.5F;
      float var7 = (float)var2.getY() + 1.0F;
      float var8 = (float)var2.getZ() + 0.5F;
      float var9 = var5 * 2.0F;
      Vector3d var10 = new Vector3d((double)var6, (double)var7, (double)var8);
      if (!var1.method3398()) {
         double var11 = (double)(MathHelper.sqrt(var1.getDistanceNearest3(var10)) / var9);
         if (var11 <= 1.0) {
            double var13 = var1.getPosX() - (double)var6;
            double var15 = var1.getPosYEye() - (double)var7;
            double var17 = var1.getPosZ() - (double)var8;
            double var19 = (double) MathHelper.sqrt(var13 * var13 + var15 * var15 + var17 * var17);
            if (var19 != 0.0) {
               var13 /= var19;
               var15 /= var19;
               var17 /= var19;
               double var21 = (double) Explosion.method25783(var10, var1);
               double var23 = (1.0 - var11) * var21;
               return (float)((int)((var23 * var23 + var23) / 2.0 * 7.0 * (double)var9 + 1.0));
            }
         }
      }

      return 0.0F;
   }

   // $VF: synthetic method
   public static Minecraft method34586() {
      return mc;
   }
}
