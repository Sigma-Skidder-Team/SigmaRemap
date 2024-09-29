package mapped;

import com.google.common.collect.Maps;
import com.mentalfrostbyte.jello.module.impl.render.FPSBooster;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.block.BlockState;
import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.entity.PlayerRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Quaternion;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.optifine.DynamicLights;
import net.optifine.Config;
import net.optifine.entity.model.CustomEntityModels;
import net.optifine.shaders.Shaders;

import java.util.Collections;
import java.util.Map;

public class EntityRendererManager {
   private static final RenderType field40010 = RenderType.method14323(new ResourceLocation("textures/misc/shadow.png"));
   private final Map<EntityType<?>, EntityRenderer<?>> field40011 = Maps.newHashMap();
   private final Map<String, PlayerRenderer> field40012 = Maps.newHashMap();
   private final PlayerRenderer field40013;
   private final FontRenderer field40014;
   public final TextureManager field40015;
   private World world;
   public ActiveRenderInfo info;
   private Quaternion field40018;
   public Entity field40019;
   public final GameSettings options;
   private boolean renderShadow = true;
   private boolean debugBoundingBox;
   public EntityRenderer renderRender = null;

   public <E extends Entity> int method32208(E var1, float var2) {
      int var5 = this.<Entity>getRenderer(var1).method17894(var1, var2);
      if (Config.isDynamicLights()) {
         var5 = DynamicLights.method36315(var1, var5);
      }

      return var5;
   }

   private <T extends Entity> void method32209(EntityType<T> var1, EntityRenderer<? super T> var2) {
      this.field40011.put(var1, var2);
   }

   private void method32210(ItemRenderer var1, IReloadableResourceManager var2) {
      this.method32209(EntityType.field41005, new Class5741(this));
      this.method32209(EntityType.field41006, new Class5742(this));
      this.method32209(EntityType.field41007, new Class5728(this));
      this.method32209(EntityType.field41008, new Class5653(this));
      this.method32209(EntityType.field41009, new Class5705(this));
      this.method32209(EntityType.field41010, new Class5710(this));
      this.method32209(EntityType.field41011, new Class5725(this));
      this.method32209(EntityType.field41012, new Class5747(this));
      this.method32209(EntityType.field41013, new Class5703(this));
      this.method32209(EntityType.field41051, new Class5732(this));
      this.method32209(EntityType.field41014, new Class5745(this));
      this.method32209(EntityType.field41015, new Class5695(this));
      this.method32209(EntityType.field41052, new Class5732(this));
      this.method32209(EntityType.field41016, new Class5699(this));
      this.method32209(EntityType.field41017, new Class5698(this));
      this.method32209(EntityType.field41018, new Class5654(this));
      this.method32209(EntityType.field41019, new Class5687(this, 0.87F));
      this.method32209(EntityType.field41020, new Class5720(this));
      this.method32209(EntityType.field41021, new Class5665(this));
      this.method32209(EntityType.field41089, new Class5735(this, var1));
      this.method32209(EntityType.field41022, new Class5659(this));
      this.method32209(EntityType.field41023, new Class5723(this));
      this.method32209(EntityType.field41024, new Class5718(this));
      this.method32209(EntityType.field41025, new Class5674(this));
      this.method32209(EntityType.field41026, new Class5673(this));
      this.method32209(EntityType.field41090, new Class5735(this, var1));
      this.method32209(EntityType.field41028, new Class5722(this));
      this.method32209(EntityType.field41027, new Class5677(this));
      this.method32209(EntityType.field41091, new Class5735(this, var1));
      this.method32209(EntityType.field41029, new Class5731(this));
      this.method32209(EntityType.field41030, new Class5735(this, var1, 1.0F, true));
      this.method32209(EntityType.field41031, new Class5721(this));
      this.method32209(EntityType.field41044, new Class5735(this, var1, 3.0F, true));
      this.method32209(EntityType.field41032, new Class5726(this, var1));
      this.method32209(EntityType.field41112, new Class5738(this));
      this.method32209(EntityType.FOX, new Class5650(this));
      this.method32209(EntityType.field41053, new Class5732(this));
      this.method32209(EntityType.field41034, new Class5684(this));
      this.method32209(EntityType.field41035, new Class5744(this, 6.0F));
      this.method32209(EntityType.field41036, new Class5658(this));
      this.method32209(EntityType.field41037, new Class5706(this));
      this.method32209(EntityType.field41054, new Class5732(this));
      this.method32209(EntityType.field41038, new Class5688(this));
      this.method32209(EntityType.field41039, new Class5664(this));
      this.method32209(EntityType.field41040, new Class5679(this));
      this.method32209(EntityType.field41041, new Class5746(this));
      this.method32209(EntityType.field41042, new Class5724(this, var1));
      this.method32209(EntityType.field41043, new Class5736(this, var1));
      this.method32209(EntityType.field41045, new Class5739(this));
      this.method32209(EntityType.field41046, new Class5719(this));
      this.method32209(EntityType.field41047, new Class5709(this));
      this.method32209(EntityType.field41048, new Class5717(this));
      this.method32209(EntityType.field41049, new Class5652(this));
      this.method32209(EntityType.field41050, new Class5732(this));
      this.method32209(EntityType.field41058, new Class5694(this));
      this.method32209(EntityType.field41057, new Class5687(this, 0.92F));
      this.method32209(EntityType.field41059, new Class5711(this));
      this.method32209(EntityType.field41060, new Class5737(this));
      this.method32209(EntityType.field41061, new Class5696(this));
      this.method32209(EntityType.field41062, new Class5697(this));
      this.method32209(EntityType.field41063, new Class5681(this));
      this.method32209(EntityType.field41064, new Class5691(this));
      this.method32209(EntityType.field41065, new Class5671(this, false));
      this.method32209(EntityType.field41066, new Class5671(this, false));
      this.method32209(EntityType.field41067, new Class5680(this));
      this.method32209(EntityType.field41068, new Class5700(this));
      this.method32209(EntityType.field41092, new Class5735(this, var1));
      this.method32209(EntityType.field41070, new Class5748(this));
      this.method32209(EntityType.RABBIT, new Class5656(this));
      this.method32209(EntityType.field41072, new Class5701(this));
      this.method32209(EntityType.field41073, new Class5750(this));
      this.method32209(EntityType.SHEEP, new Class5749(this));
      this.method32209(EntityType.field41076, new Class5730(this));
      this.method32209(EntityType.field41075, new Class5683(this));
      this.method32209(EntityType.field41077, new Class5704(this));
      this.method32209(EntityType.field41079, new Class5686(this));
      this.method32209(EntityType.field41078, new Class5666(this));
      this.method32209(EntityType.field41080, new Class5675(this));
      this.method32209(EntityType.field41081, new Class5735(this, var1, 0.75F, true));
      this.method32209(EntityType.field41083, new Class5735(this, var1));
      this.method32209(EntityType.field41082, new Class5660(this));
      this.method32209(EntityType.field41055, new Class5732(this));
      this.method32209(EntityType.field41084, new Class5729(this));
      this.method32209(EntityType.field41085, new Class5702(this));
      this.method32209(EntityType.field41086, new Class5682(this));
      this.method32209(EntityType.field41087, new Class5668(this));
      this.method32209(EntityType.field41056, new Class5733(this));
      this.method32209(EntityType.field41069, new Class5740(this));
      this.method32209(EntityType.field41094, new Class5709(this));
      this.method32209(EntityType.field41093, new Class5716(this));
      this.method32209(EntityType.field41095, new Class5655(this));
      this.method32209(EntityType.field41096, new Class5689(this));
      this.method32209(EntityType.field41097, new Class5670(this));
      this.method32209(EntityType.field41098, new Class5692(this, var2));
      this.method32209(EntityType.field41099, new Class5678(this));
      this.method32209(EntityType.field41100, new Class5707(this));
      this.method32209(EntityType.field41101, new Class5708(this));
      this.method32209(EntityType.field41102, new Class5693(this));
      this.method32209(EntityType.field41103, new Class5667(this));
      this.method32209(EntityType.field41104, new Class5734(this));
      this.method32209(EntityType.field41105, new Class5690(this));
      this.method32209(EntityType.field41106, new Class5672(this));
      this.method32209(EntityType.field41108, new Class5686(this));
      this.method32209(EntityType.field41107, new Class5663(this));
      this.method32209(EntityType.field41110, new Class5671(this, true));
      this.method32209(EntityType.field41109, new Class5669(this, var2));
      this.method32209(EntityType.field41088, new Class5657(this));
   }

   public EntityRendererManager(TextureManager var1, ItemRenderer var2, IReloadableResourceManager var3, FontRenderer var4, GameSettings var5) {
      this.field40015 = var1;
      this.field40014 = var4;
      this.options = var5;
      this.method32210(var2, var3);
      this.field40013 = new PlayerRenderer(this);
      this.field40012.put("default", this.field40013);
      this.field40012.put("slim", new PlayerRenderer(this, true));
      Class222.method830(this.field40012);
   }

   public void method32211() {
      for (EntityType var4 : Registry.ENTITY_TYPE) {
         if (var4 != EntityType.PLAYER && !this.field40011.containsKey(var4)) {
            throw new IllegalStateException("No renderer registered for " + Registry.ENTITY_TYPE.getKey(var4));
         }
      }
   }

   public <T extends Entity> EntityRenderer<? super T> getRenderer(T var1) {
      if (!(var1 instanceof AbstractClientPlayerEntity)) {
         return (EntityRenderer<? super T>)this.field40011.get(var1.getType());
      } else {
         String var4 = ((AbstractClientPlayerEntity)var1).method5377();
         PlayerRenderer var5 = this.field40012.get(var4);
         return (EntityRenderer<? super T>) (var5 == null ? this.field40013 : var5);
      }
   }

   public void method32213(World var1, ActiveRenderInfo var2, Entity var3) {
      this.world = var1;
      this.info = var2;
      this.field40018 = var2.getRotation();
      this.field40019 = var3;
   }

   public void method32214(Quaternion var1) {
      this.field40018 = var1;
   }

   public void method32215(boolean var1) {
      this.renderShadow = var1;
   }

   public void method32216(boolean var1) {
      this.debugBoundingBox = var1;
   }

   public boolean method32217() {
      return this.debugBoundingBox;
   }

   public <E extends Entity> boolean method32218(E var1, Class7647 var2, double var3, double var5, double var7) {
      EntityRenderer var11 = this.<Entity>getRenderer(var1);
      return var11.method17854(var1, var2, var3, var5, var7);
   }

   public <E extends Entity> void renderEntityStatic(
           E var1, double var2, double var4, double var6, float var8, float var9, MatrixStack var10, Class7733 var11, int var12
   ) {
      if (!FPSBooster.field23568 || !(var1 instanceof ArmorStandEntity) && !(var1 instanceof Class1099) && !(var1 instanceof ItemFrameEntity)) {
         if (this.info != null) {
            EntityRenderer <? super E > var15 = this.getRenderer(var1);

            try {
               Vector3d var16 = var15.getRenderOffset(var1, var9);
               double var17 = var2 + var16.getX();
               double var19 = var4 + var16.getY();
               double var21 = var6 + var16.getZ();
               var10.push();
               var10.translate(var17, var19, var21);
               if (CustomEntityModels.isActive()) {
                  this.renderRender = var15;
               }

               if (EmissiveTextures.isActive()) {
                  EmissiveTextures.beginRender();
               }

               var15.render(var1, var8, var9, var10, var11, var12);
               if (EmissiveTextures.isActive()) {
                  if (EmissiveTextures.hasEmissive()) {
                     EmissiveTextures.beginRenderEmissive();
                     var15.render(var1, var8, var9, var10, var11, Class1699.field9258);
                     EmissiveTextures.endRenderEmissive();
                  }

                  EmissiveTextures.endRender();
               }

               if (var1.canRenderOnFire()) {
                  this.renderFire(var10, var11, var1);
               }

               var10.translate(-var16.getX(), -var16.getY(), -var16.getZ());
               if (this.options.entityShadows && this.renderShadow && var15.shadowSize > 0.0F && !var1.isInvisible()) {
                  double var23 = this.getDistanceToCamera(var1.getPosX(), var1.getPosY(), var1.getPosZ());
                  float var25 = (float)((1.0 - var23 / 256.0) * (double)var15.shadowOpaque);
                  if (var25 > 0.0F) {
                     renderShadow(var10, var11, var1, var25, var9, this.world, var15.shadowSize);
                  }
               }

               if (this.debugBoundingBox && !var1.isInvisible() && ! Minecraft.getInstance().isReducedDebug()) {
                  this.renderDebugBoundingBox(var10, var11.method25597(RenderType.getLines()), var1, var9);
               }

               var10.pop();
            } catch (Throwable var29) {
               CrashReport var26 = CrashReport.makeCrashReport(var29, "Rendering entity in world");
               CrashReportCategory var27 = var26.makeCategory("Entity being rendered");
               var1.fillCrashReport(var27);
               CrashReportCategory var28 = var26.makeCategory("Renderer details");
               var28.addDetail("Assigned renderer", var15);
               var28.addDetail("Location", CrashReportCategory.getCoordinateInfo(var2, var4, var6));
               var28.addDetail("Rotation", var8);
               var28.addDetail("Delta", var9);
               throw new ReportedException(var26);
            }
         }
      }
   }

   private void renderDebugBoundingBox(MatrixStack var1, IVertexBuilder var2, Entity var3, float var4) {
      if (! Shaders.isShadowPass) {
         float var7 = var3.getWidth() / 2.0F;
         this.method32221(var1, var2, var3, 1.0F, 1.0F, 1.0F);
         if (var3 instanceof Class1007) {
            double var10 = -MathHelper.lerp((double)var4, var3.lastTickPosX, var3.getPosX());
            double var12 = -MathHelper.lerp((double)var4, var3.lastTickPosY, var3.getPosY());
            double var14 = -MathHelper.lerp((double)var4, var3.lastTickPosZ, var3.getPosZ());

            for (Class908 var19 : ((Class1007)var3).method4332()) {
               var1.push();
               double var20 = var10 + MathHelper.lerp((double)var4, var19.lastTickPosX, var19.getPosX());
               double var22 = var12 + MathHelper.lerp((double)var4, var19.lastTickPosY, var19.getPosY());
               double var24 = var14 + MathHelper.lerp((double)var4, var19.lastTickPosZ, var19.getPosZ());
               var1.translate(var20, var22, var24);
               this.method32221(var1, var2, var19, 0.25F, 1.0F, 0.0F);
               var1.pop();
            }
         }

         if (var3 instanceof LivingEntity) {
            float var8 = 0.01F;
            WorldRenderer.method898(
               var1,
               var2,
               (double)(-var7),
               (double)(var3.getEyeHeight() - 0.01F),
               (double)(-var7),
               (double)var7,
               (double)(var3.getEyeHeight() + 0.01F),
               (double)var7,
               1.0F,
               0.0F,
               0.0F,
               1.0F
            );
         }

         Vector3d var26 = var3.getLook(var4);
         Matrix4f var9 = var1.getLast().getMatrix();
         var2.pos(var9, 0.0F, var3.getEyeHeight(), 0.0F).color(0, 0, 255, 255).endVertex();
         var2.pos(var9, (float)(var26.x * 2.0), (float)((double)var3.getEyeHeight() + var26.y * 2.0), (float)(var26.z * 2.0))
            .color(0, 0, 255, 255)
            .endVertex();
      }
   }

   private void method32221(MatrixStack var1, IVertexBuilder var2, Entity var3, float var4, float var5, float var6) {
      AxisAlignedBB var9 = var3.getBoundingBox().offset(-var3.getPosX(), -var3.getPosY(), -var3.getPosZ());
      WorldRenderer.method897(var1, var2, var9, var4, var5, var6, 1.0F);
   }

   private void renderFire(MatrixStack var1, Class7733 var2, Entity var3) {
      TextureAtlasSprite var6 = ModelBakery.field40508.getSprite();
      TextureAtlasSprite var7 = ModelBakery.LOCATION_FIRE_1.getSprite();
      var1.push();
      float var8 = var3.getWidth() * 1.4F;
      var1.method35292(var8, var8, var8);
      float var9 = 0.5F;
      float var10 = 0.0F;
      float var11 = var3.getHeight() / var8;
      float var12 = 0.0F;
      var1.rotate(Vector3f.YP.rotationDegrees(-this.info.getYaw()));
      var1.translate(0.0, 0.0, (double)(-0.3F + (float)((int)var11) * 0.02F));
      float var13 = 0.0F;
      int var14 = 0;
      IVertexBuilder var15 = var2.method25597(Class8624.method30907());
      boolean var16 = Config.method26894();
      if (var16) {
         var15.method17044(Class9025.field41288);
      }

      for (Class8892 var17 = var1.getLast(); var11 > 0.0F; var14++) {
         TextureAtlasSprite var18 = var14 % 2 != 0 ? var7 : var6;
         var15.method17043(var18);
         float var19 = var18.getMinU();
         float var20 = var18.getMinV();
         float var21 = var18.getMaxU();
         float var22 = var18.getMaxV();
         if (var14 / 2 % 2 == 0) {
            float var23 = var21;
            var21 = var19;
            var19 = var23;
         }

         method32223(var17, var15, var9 - 0.0F, 0.0F - var12, var13, var21, var22);
         method32223(var17, var15, -var9 - 0.0F, 0.0F - var12, var13, var19, var22);
         method32223(var17, var15, -var9 - 0.0F, 1.4F - var12, var13, var19, var20);
         method32223(var17, var15, var9 - 0.0F, 1.4F - var12, var13, var21, var20);
         var11 -= 0.45F;
         var12 -= 0.45F;
         var9 *= 0.9F;
         var13 += 0.03F;
      }

      if (var16) {
         var15.method17044((RenderType)null);
         GlStateManager.method23864();
      }

      var1.pop();
   }

   private static void method32223(Class8892 var0, IVertexBuilder var1, float var2, float var3, float var4, float var5, float var6) {
      var1.pos(var0.getMatrix(), var2, var3, var4)
         .color(255, 255, 255, 255)
         .tex(var5, var6)
         .method17028(0, 10)
         .method17034(240)
         .method17041(var0.method32362(), 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   private static void renderShadow(MatrixStack var0, Class7733 var1, Entity var2, float var3, float var4, IWorldReader var5, float var6) {
      if (!Config.isShaders() || ! Shaders.field40794) {
         float var9 = var6;
         if (var2 instanceof MobEntity) {
            MobEntity var25 = (MobEntity)var2;
            if (var25.isChild()) {
               var9 = var6 * 0.5F;
            }
         }

         double var10 = MathHelper.lerp((double)var4, var2.lastTickPosX, var2.getPosX());
         double var12 = MathHelper.lerp((double)var4, var2.lastTickPosY, var2.getPosY());
         double var14 = MathHelper.lerp((double)var4, var2.lastTickPosZ, var2.getPosZ());
         int var16 = MathHelper.floor(var10 - (double)var9);
         int var17 = MathHelper.floor(var10 + (double)var9);
         int var18 = MathHelper.floor(var12 - (double)var9);
         int var19 = MathHelper.floor(var12);
         int var20 = MathHelper.floor(var14 - (double)var9);
         int var21 = MathHelper.floor(var14 + (double)var9);
         Class8892 var22 = var0.getLast();
         IVertexBuilder var23 = var1.method25597(field40010);

         for (BlockPos var26 : BlockPos.method8359(new BlockPos(var16, var18, var20), new BlockPos(var17, var19, var21))) {
            method32225(var22, var23, var5, var26, var10, var12, var14, var9, var3);
         }
      }
   }

   private static void method32225(
           Class8892 var0, IVertexBuilder var1, IWorldReader var2, BlockPos var3, double var4, double var6, double var8, float var10, float var11
   ) {
      BlockPos var14 = var3.down();
      BlockState var15 = var2.getBlockState(var14);
      if (var15.getRenderType() != BlockRenderType.field9885 && var2.method7015(var3) > 3 && var15.method23456(var2, var14)) {
         VoxelShape var16 = var15.method23412(var2, var3.down());
         if (!var16.isEmpty()) {
            float var17 = (float)(((double)var11 - (var6 - (double)var3.getY()) / 2.0) * 0.5 * (double)var2.method7009(var3));
            if (var17 >= 0.0F) {
               if (var17 > 1.0F) {
                  var17 = 1.0F;
               }

               AxisAlignedBB var18 = var16.getBoundingBox();
               double var19 = (double)var3.getX() + var18.minX;
               double var21 = (double)var3.getX() + var18.maxX;
               double var23 = (double)var3.getY() + var18.minY;
               double var25 = (double)var3.getZ() + var18.minZ;
               double var27 = (double)var3.getZ() + var18.maxZ;
               float var29 = (float)(var19 - var4);
               float var30 = (float)(var21 - var4);
               float var31 = (float)(var23 - var6);
               float var32 = (float)(var25 - var8);
               float var33 = (float)(var27 - var8);
               float var34 = -var29 / 2.0F / var10 + 0.5F;
               float var35 = -var30 / 2.0F / var10 + 0.5F;
               float var36 = -var32 / 2.0F / var10 + 0.5F;
               float var37 = -var33 / 2.0F / var10 + 0.5F;
               method32226(var0, var1, var17, var29, var31, var32, var34, var36);
               method32226(var0, var1, var17, var29, var31, var33, var34, var37);
               method32226(var0, var1, var17, var30, var31, var33, var35, var37);
               method32226(var0, var1, var17, var30, var31, var32, var35, var36);
            }
         }
      }
   }

   private static void method32226(Class8892 var0, IVertexBuilder var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.pos(var0.getMatrix(), var3, var4, var5)
         .color(1.0F, 1.0F, 1.0F, var2)
         .tex(var6, var7)
         .method17035(OverlayTexture.NO_OVERLAY)
         .method17034(15728880)
         .method17041(var0.method32362(), 0.0F, 1.0F, 0.0F)
         .endVertex();
   }

   public void setWorld(World var1) {
      this.world = var1;
      if (var1 == null) {
         this.info = null;
      }
   }

   public double method32228(Entity var1) {
      return this.info.getPos().squareDistanceTo(var1.getPositionVec());
   }

   public double getDistanceToCamera(double var1, double var3, double var5) {
      return this.info.getPos().method11343(var1, var3, var5);
   }

   public Quaternion method32230() {
      return this.field40018;
   }

   public FontRenderer method32231() {
      return this.field40014;
   }

   public Map<EntityType<?>, EntityRenderer<?>> method32232() {
      return this.field40011;
   }

   public Map<String, PlayerRenderer> method32233() {
      return Collections.<String, PlayerRenderer>unmodifiableMap(this.field40012);
   }
}
