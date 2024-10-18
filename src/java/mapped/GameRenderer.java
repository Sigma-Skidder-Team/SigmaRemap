package mapped;

import com.google.gson.JsonSyntaxException;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.EventRenderShulker;
import com.mentalfrostbyte.jello.event.impl.Render2DEvent;
import com.mentalfrostbyte.jello.event.impl.RenderFireEvent;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GLX;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.NativeImage;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.util.Util;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileHelper;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.resources.IResourceManagerReloadListener;
import net.minecraft.util.CachedBlockInfo;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.ScreenShotHelper;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraftforge.resource.IResourceType;
import net.minecraftforge.resource.VanillaResourceType;
import net.optifine.Config;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersRender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class GameRenderer implements IResourceManagerReloadListener, AutoCloseable {
   private static final ResourceLocation field800 = new ResourceLocation("textures/misc/nausea.png");
   private static final Logger LOGGER = LogManager.getLogger();
   private final Minecraft mc;
   private final IResourceManager resourceManager;
   private final Random field804 = new Random();
   private float farPlaneDistance;
   public final FirstPersonRenderer itemRenderer;
   private final Class194 field807;
   private final RenderTypeBuffers field808;
   private int rendererUpdateCount;
   private float field810;
   private float field811;
   private float field812;
   private float field813;
   public boolean renderHand = true;
   private boolean field815 = true;
   private long field816;
   private long field817 = Util.milliTime();
   public final Class1699 lightmapTexture;
   private final OverlayTexture field819 = new OverlayTexture();
   private boolean field820;
   private float field821 = 1.0F;
   private float field822;
   private float field823;
   private ItemStack itemActivationItem;
   private int itemActivationTicks;
   private float itemActivationOffX;
   private float itemActivationOffY;
   public ShaderGroup shaderGroup;
   public static final ResourceLocation[] field829 = new ResourceLocation[]{
      new ResourceLocation("shaders/post/notch.json"),
      new ResourceLocation("shaders/post/fxaa.json"),
      new ResourceLocation("shaders/post/art.json"),
      new ResourceLocation("shaders/post/bumpy.json"),
      new ResourceLocation("shaders/post/blobs2.json"),
      new ResourceLocation("shaders/post/pencil.json"),
      new ResourceLocation("shaders/post/color_convolve.json"),
      new ResourceLocation("shaders/post/deconverge.json"),
      new ResourceLocation("shaders/post/flip.json"),
      new ResourceLocation("shaders/post/invert.json"),
      new ResourceLocation("shaders/post/ntsc.json"),
      new ResourceLocation("shaders/post/outline.json"),
      new ResourceLocation("shaders/post/phosphor.json"),
      new ResourceLocation("shaders/post/scan_pincushion.json"),
      new ResourceLocation("shaders/post/sobel.json"),
      new ResourceLocation("shaders/post/bits.json"),
      new ResourceLocation("shaders/post/desaturate.json"),
      new ResourceLocation("shaders/post/green.json"),
      new ResourceLocation("shaders/post/blur.json"),
      new ResourceLocation("shaders/post/wobble.json"),
      new ResourceLocation("shaders/post/blobs.json"),
      new ResourceLocation("shaders/post/antialias.json"),
      new ResourceLocation("shaders/post/creeper.json"),
      new ResourceLocation("shaders/post/spider.json")
   };
   public static final int field830 = field829.length;
   public int shaderIndex = field830;
   private boolean useShader;
   private final ActiveRenderInfo activeRender = new ActiveRenderInfo();
   private boolean field834 = false;
   private World field835 = null;
   private float field836 = 128.0F;
   private long field837 = 0L;
   private int field838 = 0;
   private int field839 = 0;
   private int field840 = 0;
   private float field841 = 0.0F;
   private float field842 = 0.0F;
   private ShaderGroup[] fxaaShaders = new ShaderGroup[10];
   private boolean field844 = false;

   public GameRenderer(Minecraft var1, IResourceManager var2, RenderTypeBuffers var3) {
      this.mc = var1;
      this.resourceManager = var2;
      this.itemRenderer = var1.getFirstPersonRenderer();
      this.field807 = new Class194(var1.getTextureManager());
      this.lightmapTexture = new Class1699(this, var1);
      this.field808 = var3;
      this.shaderGroup = null;
   }

   @Override
   public void close() {
      this.lightmapTexture.close();
      this.field807.close();
      this.field819.close();
      this.stopUseShader();
   }

   public void stopUseShader() {
      if (this.shaderGroup != null) {
         this.shaderGroup.close();
      }

      this.shaderGroup = null;
      this.shaderIndex = field830;
   }

   public void method734() {
      this.useShader = !this.useShader;
   }

   public void loadEntityShader(Entity var1) {
      if (this.shaderGroup != null) {
         this.shaderGroup.close();
      }

      this.shaderGroup = null;
      if (!(var1 instanceof Class1081)) {
         if (!(var1 instanceof Class1101)) {
            if (!(var1 instanceof EndermanEntity)) {
               if (Reflector.field42880.exists()) {
                  Reflector.method35062(Reflector.field42880, var1, this);
               }
            } else {
               this.loadShader(new ResourceLocation("shaders/post/invert.json"));
            }
         } else {
            this.loadShader(new ResourceLocation("shaders/post/spider.json"));
         }
      } else {
         this.loadShader(new ResourceLocation("shaders/post/creeper.json"));
      }
   }

   public void loadShader(ResourceLocation var1) {
      if (GLX.isUsingFBOs()) {
         if (this.shaderGroup != null) {
            this.shaderGroup.close();
         }

         try {
            this.shaderGroup = new ShaderGroup(this.mc.getTextureManager(), this.resourceManager, this.mc.getFramebuffer(), var1);
            this.shaderGroup.createBindFramebuffers(this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight());
            this.useShader = true;
         } catch (IOException var5) {
            LOGGER.warn("Failed to load shader: {}", var1, var5);
            this.shaderIndex = field830;
            this.useShader = false;
         } catch (JsonSyntaxException var6) {
            LOGGER.warn("Failed to parse shader: {}", var1, var6);
            this.shaderIndex = field830;
            this.useShader = false;
         }
      }
   }

   @Override
   public void method737(IResourceManager var1) {
      if (this.shaderGroup != null) {
         this.shaderGroup.close();
      }

      this.shaderGroup = null;
      if (this.shaderIndex != field830) {
         this.loadShader(field829[this.shaderIndex]);
      } else {
         this.loadEntityShader(this.mc.getRenderViewEntity());
      }
   }

   public void renderWorld() {
      this.updateFovModifierHand();
      this.lightmapTexture.method7315();
      if (this.mc.getRenderViewEntity() == null) {
         this.mc.setRenderViewEntity(this.mc.player);
      }

      this.activeRender.method37498();
      this.rendererUpdateCount++;
      this.itemRenderer.method37592();
      this.mc.worldRenderer.method856(this.activeRender);
      this.field813 = this.field812;
      if (!this.mc.ingameGUI.getBossOverlay().method5958()) {
         if (this.field812 > 0.0F) {
            this.field812 -= 0.0125F;
         }
      } else {
         this.field812 += 0.05F;
         if (this.field812 > 1.0F) {
            this.field812 = 1.0F;
         }
      }

      if (this.itemActivationTicks > 0) {
         this.itemActivationTicks--;
         if (this.itemActivationTicks == 0) {
            this.itemActivationItem = null;
         }
      }
   }

   @Nullable
   public ShaderGroup getShaderGroup() {
      return this.shaderGroup;
   }

   public void updateShaderGroupSize(int var1, int var2) {
      if (this.shaderGroup != null) {
         this.shaderGroup.createBindFramebuffers(var1, var2);
      }

      this.mc.worldRenderer.method870(var1, var2);
   }

   public void getMouseOver(float var1) {
      Entity entity = this.mc.getRenderViewEntity();

      if (entity != null && this.mc.world != null)
      {
         this.mc.getProfiler().startSection("pick");
         this.mc.pointedEntity = null;

         double d0 = (double)this.mc.playerController.getBlockReachDistance();
         this.mc.objectMouseOver = entity.pick(d0, var1, false);

         Vector3d vector3d = entity.getEyePosition(var1);
         boolean flag = false;
         int i = 3;
         double d1 = d0;
         if (this.mc.playerController.extendedReach())
         {
            d1 = 6.0D;
            d0 = d1;
         }
         else
         {
            if (d0 > 3.0D)
            {
               flag = true;
            }

            d0 = d0;
         }

         d1 = d1 * d1;

         if (this.mc.objectMouseOver != null) {
            d1 = this.mc.objectMouseOver.getHitVec().squareDistanceTo(vector3d);
         }

         Vector3d vector3d1 = entity.getLook(1.0F);
         Vector3d vector3d2 = vector3d.add(vector3d1.x * d0, vector3d1.y * d0, vector3d1.z * d0);
         float f = 1.0F;
         AxisAlignedBB axisalignedbb = entity.getBoundingBox().expand(vector3d1.scale(d0)).grow(1.0, 1.0, 1.0);
         EntityRayTraceResult entityraytraceresult = ProjectileHelper.rayTraceEntities(entity, vector3d, vector3d2, axisalignedbb, var0 -> !var0.isSpectator() && var0.canBeCollidedWith(), d1);

         if (entityraytraceresult != null) {
            Entity entity1 = entityraytraceresult.getEntity();
            Vector3d vector3d3 = entityraytraceresult.getHitVec();
            double d2 = vector3d.squareDistanceTo(vector3d3);
            if (flag && d2 > 9.0) {
               this.mc.objectMouseOver = BlockRayTraceResult.createMiss(
                  vector3d3, Direction.getFacingFromVector(vector3d1.x, vector3d1.y, vector3d1.z), new BlockPos(vector3d3)
               );
            } else if (d2 < d1 || this.mc.objectMouseOver == null) {
               this.mc.objectMouseOver = entityraytraceresult;

               if (entity1 instanceof LivingEntity || entity1 instanceof ItemFrameEntity) {
                  this.mc.pointedEntity = entity1;
               }
            }
         }

         this.mc.getProfiler().endSection();
      }
   }

   private void updateFovModifierHand() {
      float var3 = 1.0F;
      if (this.mc.getRenderViewEntity() instanceof AbstractClientPlayerEntity) {
         AbstractClientPlayerEntity var4 = (AbstractClientPlayerEntity)this.mc.getRenderViewEntity();
         var3 = var4.getFOVModifier();
      }

      this.field811 = this.field810;
      this.field810 = this.field810 + (var3 - this.field810) * 0.5F;
      if (this.field810 > 1.5F) {
         this.field810 = 1.5F;
      }

      if (this.field810 < 0.1F) {
         this.field810 = 0.1F;
      }
   }

   private double method743(ActiveRenderInfo var1, float var2, boolean var3) {
      if (!this.field820) {
         double var6 = 70.0;
         if (var3) {
            var6 = this.mc.gameSettings.fov;
            if (Config.method26940()) {
               var6 *= (double) MathHelper.lerp(var2, this.field811, this.field810);
            }
         }

         boolean var8 = false;
         if (this.mc.currentScreen == null) {
            var8 = this.mc.gameSettings.field44762.isKeyDown();
         }

         if (!var8) {
            if (Config.field34162) {
               Config.field34162 = false;
               this.mc.gameSettings.smoothCamera = Config.field34163;
               this.mc.worldRenderer.setDisplayListEntitiesDirty();
            }
         } else {
            if (!Config.field34162) {
               Config.field34162 = true;
               Config.field34163 = this.mc.gameSettings.smoothCamera;
               this.mc.gameSettings.smoothCamera = true;
               this.mc.worldRenderer.setDisplayListEntitiesDirty();
            }

            if (Config.field34162) {
               var6 /= 4.0;
            }
         }

         if (var1.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)var1.getRenderViewEntity()).getShouldBeDead()) {
            float var9 = Math.min((float)((LivingEntity)var1.getRenderViewEntity()).deathTime + var2, 20.0F);
            var6 /= (double)((1.0F - 500.0F / (var9 + 500.0F)) * 2.0F + 1.0F);
         }

         FluidState var10 = var1.method37512();
         if (!var10.isEmpty()) {
            var6 = var6 * 60.0 / 70.0;
         }

         return !Reflector.field42877.exists() ? var6 : Reflector.method35060(Reflector.field42877, this, var1, var2, var6);
      } else {
         return 90.0;
      }
   }

   private void hurtCameraEffect(MatrixStack var1, float var2) {
      if (this.mc.getRenderViewEntity() instanceof LivingEntity) {
         LivingEntity var5 = (LivingEntity)this.mc.getRenderViewEntity();
         float var6 = (float)var5.hurtTime - var2;
         if (var5.getShouldBeDead()) {
            float var7 = Math.min((float)var5.deathTime + var2, 20.0F);
            var1.rotate(Vector3f.ZP.rotationDegrees(40.0F - 8000.0F / (var7 + 200.0F)));
         }

         if (var6 < 0.0F) {
            return;
         }

         var6 /= (float)var5.maxHurtTime;
         var6 = MathHelper.sin(var6 * var6 * var6 * var6 * (float) Math.PI);
         float var10 = var5.attackedAtYaw;
         var1.rotate(Vector3f.YP.rotationDegrees(-var10));
         var1.rotate(Vector3f.ZP.rotationDegrees(-var6 * 14.0F));
         var1.rotate(Vector3f.YP.rotationDegrees(var10));
      }
   }

   private void applyBobbing(MatrixStack var1, float var2) {
      if (this.mc.getRenderViewEntity() instanceof PlayerEntity) {
         PlayerEntity var5 = (PlayerEntity)this.mc.getRenderViewEntity();
         float var6 = var5.distanceWalkedModified - var5.prevDistanceWalkedModified;
         float var7 = -(var5.distanceWalkedModified + var6 * var2);
         float var8 = MathHelper.lerp(var2, var5.prevCameraYaw, var5.cameraYaw);
         var1.translate(
            (double)(MathHelper.sin(var7 * (float) Math.PI) * var8 * 0.5F),
            (double)(-Math.abs(MathHelper.cos(var7 * (float) Math.PI) * var8)),
            0.0
         );
         var1.rotate(Vector3f.ZP.rotationDegrees(MathHelper.sin(var7 * (float) Math.PI) * var8 * 3.0F));
         var1.rotate(Vector3f.XP.rotationDegrees(Math.abs(MathHelper.cos(var7 * (float) Math.PI - 0.2F) * var8) * 5.0F));
      }
   }

   private void renderHand(MatrixStack var1, ActiveRenderInfo var2, float var3) {
      this.method747(var1, var2, var3, true, true, false);
   }

   public void method747(MatrixStack var1, ActiveRenderInfo var2, float var3, boolean var4, boolean var5, boolean var6) {
      if (!this.field820) {
         Shaders.method33160(true);
         this.method748(this.method749(var2, var3, false));
         Class8892 var9 = var1.getLast();
         var9.getMatrix().method35503();
         var9.method32362().method32824();
         boolean var10 = false;
         if (var4) {
            var1.push();
            this.hurtCameraEffect(var1, var3);
            if (this.mc.gameSettings.viewBobbing) {
               this.applyBobbing(var1, var3);
            }

            var10 = this.mc.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)this.mc.getRenderViewEntity()).isSleeping();
            if (this.mc.gameSettings.getPointOfView().func_243192_a()
               && !var10
               && !this.mc.gameSettings.hideGUI
               && this.mc.playerController.getCurrentGameType() != GameType.SPECTATOR) {
               this.lightmapTexture.method7317();
               if (!Config.isShaders()) {
                  this.itemRenderer
                     .method37590(
                        var3, var1, this.field808.getBufferSource(), this.mc.player, this.mc.getRenderManager().method32208(this.mc.player, var3)
                     );
               } else {
                  ShadersRender.method17156(
                     this.itemRenderer,
                     var3,
                     var1,
                     this.field808.getBufferSource(),
                     this.mc.player,
                     this.mc.getRenderManager().method32208(this.mc.player, var3),
                     var6
                  );
               }

               this.lightmapTexture.method7316();
            }

            var1.pop();
         }

         Shaders.method33160(false);
         if (!var5) {
            return;
         }

         this.lightmapTexture.method7316();
         RenderFireEvent var11 = new RenderFireEvent();
         Client.getInstance().getEventManager().call(var11);
         if (this.mc.gameSettings.getPointOfView().func_243192_a() && !var10 && !var11.isCancelled()) {
            OverlayRenderer.method18789(this.mc, var1);
            this.hurtCameraEffect(var1, var3);
         }

         if (this.mc.gameSettings.viewBobbing) {
            this.applyBobbing(var1, var3);
         }
      }
   }

   public void method748(Matrix4f var1) {
      RenderSystem.matrixMode(5889);
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var1);
      RenderSystem.matrixMode(5888);
   }

   public Matrix4f method749(ActiveRenderInfo var1, float var2, boolean var3) {
      MatrixStack var6 = new MatrixStack();
      var6.getLast().getMatrix().method35503();
      if (Config.isShaders() && Shaders.method33161()) {
         Shaders.method33104(var6);
      }

      this.field836 = this.farPlaneDistance * 2.0F;
      if (this.field836 < 173.0F) {
         this.field836 = 173.0F;
      }

      if (this.field821 != 1.0F) {
         var6.translate((double)this.field822, (double)(-this.field823), 0.0);
         var6.scale(this.field821, this.field821, 1.0F);
      }

      var6.getLast()
         .getMatrix()
         .method35508(
            Matrix4f.method35511(
               this.method743(var1, var2, var3),
               (float)this.mc.getMainWindow().getFramebufferWidth() / (float)this.mc.getMainWindow().getFramebufferHeight(),
               0.05F,
               this.field836
            )
         );
      return var6.getLast().getMatrix();
   }

   public static float method750(LivingEntity var0, float var1) {
      int var4 = var0.getActivePotionEffect(Effects.NIGHT_VISION).method8628();
      return var4 <= 200 ? 0.7F + MathHelper.sin(((float)var4 - var1) * (float) Math.PI * 0.2F) * 0.3F : 1.0F;
   }

   public void updateCameraAndRender(float var1, long var2, boolean var4) {
      this.method758();
      if (!this.mc.isGameFocused() && this.mc.gameSettings.field44589 && (!this.mc.gameSettings.touchscreen || !this.mc.mouseHelper.method36737())) {
         if (Util.milliTime() - this.field817 > 500L) {
            this.mc.displayInGameMenu(false);
         }
      } else {
         this.field817 = Util.milliTime();
      }

      if (!this.mc.skipRenderWorld) {
         int var7 = (int)(
            this.mc.mouseHelper.method36738() * (double)this.mc.getMainWindow().getScaledWidth() / (double)this.mc.getMainWindow().getWidth()
         );
         int var8 = (int)(
            this.mc.mouseHelper.method36739() * (double)this.mc.getMainWindow().getScaledHeight() / (double)this.mc.getMainWindow().getHeight()
         );
         if (var4 && this.mc.world != null && !Config.method26988()) {
            this.mc.getProfiler().startSection("level");
            Client.getInstance().getEventManager().call(new Render2DEvent(var1, var2));
            this.renderWorld(var1, var2, new MatrixStack());
            if (this.mc.isSingleplayer() && this.field816 < Util.milliTime() - 1000L) {
               this.field816 = Util.milliTime();
               if (!this.mc.getIntegratedServer().method1305()) {
                  this.method752();
               }
            }

            this.mc.worldRenderer.method860();
            if (this.shaderGroup != null && this.useShader) {
               RenderSystem.disableBlend();
               RenderSystem.disableDepthTest();
               RenderSystem.disableAlphaTest();
               RenderSystem.enableTexture();
               RenderSystem.matrixMode(5890);
               RenderSystem.pushMatrix();
               RenderSystem.loadIdentity();
               this.shaderGroup.method6526(var1);
               RenderSystem.popMatrix();
               RenderSystem.enableTexture();
            }

            this.mc.getFramebuffer().bindFramebuffer(true);
         } else {
            RenderSystem.viewport(0, 0, this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight());
         }

         MainWindow var9 = this.mc.getMainWindow();
         RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
         RenderSystem.matrixMode(5889);
         RenderSystem.loadIdentity();
         RenderSystem.ortho(0.0, (double)var9.getFramebufferWidth() / var9.getGuiScaleFactor(), (double)var9.getFramebufferHeight() / var9.getGuiScaleFactor(), 0.0, 1000.0, 3000.0);
         RenderSystem.matrixMode(5888);
         RenderSystem.loadIdentity();
         RenderSystem.translatef(0.0F, 0.0F, -2000.0F);
         RenderHelper.setupGui3DDiffuseLighting();
         MatrixStack var10 = new MatrixStack();
         if (this.lightmapTexture.method7328()) {
            this.lightmapTexture.method7327(false);
         }

         if (var4 && this.mc.world != null) {
            this.mc.getProfiler().endStartSection("gui");
            if (this.mc.player != null) {
               float var11 = MathHelper.lerp(var1, this.mc.player.prevTimeInPortal, this.mc.player.timeInPortal);
               if (var11 > 0.0F && this.mc.player.isPotionActive(Effects.NAUSEA) && this.mc.gameSettings.screenEffectScale < 1.0F) {
                  this.func_243497_c(var11 * (1.0F - this.mc.gameSettings.screenEffectScale));
               }
            }

            if (!this.mc.gameSettings.hideGUI || this.mc.currentScreen != null) {
               RenderSystem.method27939();
               this.renderItemActivation(this.mc.getMainWindow().getScaledWidth(), this.mc.getMainWindow().getScaledHeight(), var1);
               this.mc.ingameGUI.method5961(var10, var1);
               if (this.mc.gameSettings.field44699 && !this.mc.gameSettings.showDebugInfo) {
                  Config.method26954(var10);
               }

               if (this.mc.gameSettings.showDebugInfo) {
                  Class8578.method30657(var10, (int)this.mc.getMainWindow().getGuiScaleFactor());
               }

               RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
            }

            this.mc.getProfiler().endSection();
         }

         RenderSystem.pushMatrix();
         Client.getInstance().method19928();
         RenderSystem.popMatrix();
         if (this.field844 != (this.mc.loadingGui != null)) {
            if (this.mc.loadingGui != null) {
               ResourceLoadProgressGui.loadLogoTexture(this.mc);
               if (this.mc.loadingGui instanceof ResourceLoadProgressGui) {
                  ResourceLoadProgressGui var16 = (ResourceLoadProgressGui)this.mc.loadingGui;
                  var16.method5679();
               }
            }

            this.field844 = this.mc.loadingGui != null;
         }

         if (this.mc.loadingGui != null) {
            try {
               this.mc.loadingGui.render(var10, var7, var8, this.mc.getTickLength());
            } catch (Throwable var15) {
               CrashReport var12 = CrashReport.makeCrashReport(var15, "Rendering overlay");
               CrashReportCategory var13 = var12.makeCategory("Overlay render details");
               var13.addDetail("Overlay name", () -> this.mc.loadingGui.getClass().getCanonicalName());
               throw new ReportedException(var12);
            }
         } else if (this.mc.currentScreen != null && Client.getInstance().getGuiManager().method33480() == null) {
            try {
               if (Reflector.field42867.exists()) {
                  Reflector.callVoid(Reflector.field42867, this.mc.currentScreen, var10, var7, var8, this.mc.getTickLength());
               } else {
                  this.mc.currentScreen.render(var10, var7, var8, this.mc.getTickLength());
                  Client.getInstance().getEventManager().call(new EventRenderShulker());
               }
            } catch (Throwable var14) {
               CrashReport var17 = CrashReport.makeCrashReport(var14, "Rendering screen");
               CrashReportCategory var18 = var17.makeCategory("Screen render details");
               var18.addDetail("Screen name", () -> this.mc.currentScreen.getClass().getCanonicalName());
               var18.addDetail(
                  "Mouse location",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%f, %f)",
                        var7,
                        var8,
                        this.mc.mouseHelper.method36738(),
                        this.mc.mouseHelper.method36739()
                     )
               );
               var18.addDetail(
                  "Screen size",
                  () -> String.format(
                        Locale.ROOT,
                        "Scaled: (%d, %d). Absolute: (%d, %d). Scale factor of %f",
                        this.mc.getMainWindow().getScaledWidth(),
                        this.mc.getMainWindow().getScaledHeight(),
                        this.mc.getMainWindow().getFramebufferWidth(),
                        this.mc.getMainWindow().getFramebufferHeight(),
                        this.mc.getMainWindow().getGuiScaleFactor()
                     )
               );
               throw new ReportedException(var17);
            }
         }

         this.lightmapTexture.method7327(true);
      }

      this.method759();
      this.method757();
      Class8777.method31650();
      Class8578.method30656();
      if (this.mc.gameSettings.field44698) {
         this.mc.gameSettings.showDebugProfilerChart = true;
      }
   }

   private void method752() {
      if (this.mc.worldRenderer.method872() > 10 && this.mc.worldRenderer.method921() && !this.mc.getIntegratedServer().method1305()) {
         NativeImage var3 = ScreenShotHelper.createScreenshot(this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight(), this.mc.getFramebuffer());
         Util.method38493().execute(() -> {
            int var4 = var3.method7886();
            int var5 = var3.method7887();
            int var6 = 0;
            int var7 = 0;
            if (var4 > var5) {
               var6 = (var4 - var5) / 2;
               var4 = var5;
            } else {
               var7 = (var5 - var4) / 2;
               var5 = var4;
            }

            try (NativeImage var8 = new NativeImage(64, 64, false)) {
               var3.method7907(var6, var7, var4, var5, var8);
               var8.method7898(this.mc.getIntegratedServer().method1306());
            } catch (IOException var29) {
               LOGGER.warn("Couldn't save auto screenshot", var29);
            } finally {
               var3.close();
            }
         });
      }
   }

   private boolean isDrawBlockOutline() {
      if (!this.field815) {
         return false;
      } else {
         Entity var3 = this.mc.getRenderViewEntity();
         boolean var4 = var3 instanceof PlayerEntity && !this.mc.gameSettings.hideGUI;
         if (var4 && !((PlayerEntity)var3).abilities.allowEdit) {
            ItemStack var5 = ((LivingEntity)var3).getHeldItemMainhand();
            RayTraceResult var6 = this.mc.objectMouseOver;
            if (var6 != null && var6.getType() == RayTraceResult.Type.BLOCK) {
               BlockPos var7 = ((BlockRayTraceResult)var6).getPos();
               BlockState var8 = this.mc.world.getBlockState(var7);
               if (this.mc.playerController.getCurrentGameType() != GameType.SPECTATOR) {
                  CachedBlockInfo var9 = new CachedBlockInfo(this.mc.world, var7, false);
                  var4 = !var5.isEmpty()
                     && (var5.method32175(this.mc.world.method6817(), var9) || var5.method32176(this.mc.world.method6817(), var9));
               } else {
                  var4 = var8.method23445(this.mc.world, var7) != null;
               }
            }
         }

         return var4;
      }
   }

   public void renderWorld(float partialTicks, long finishTimeNano, MatrixStack matrixStackIn) {
      this.lightmapTexture.updateLightmap(partialTicks);
      if (this.mc.getRenderViewEntity() == null) {
         this.mc.setRenderViewEntity(this.mc.player);
      }

      this.getMouseOver(partialTicks);
      if (Config.isShaders()) {
         Shaders.beginRender(this.mc, this.activeRender, partialTicks, finishTimeNano);
      }

      this.mc.getProfiler().startSection("center");
      boolean flag = Config.isShaders();
      if (flag) {
         Shaders.beginRenderPass(partialTicks, finishTimeNano);
      }

      boolean flag1 = this.isDrawBlockOutline();
      this.mc.getProfiler().endStartSection("camera");
      ActiveRenderInfo activerenderinfo = this.activeRender;
      this.farPlaneDistance = (float)(this.mc.gameSettings.renderDistanceChunks * 16);
      if (Config.isFogFancy()) {
         this.farPlaneDistance *= 0.95F;
      }

      if (Config.isFogFast()) {
         this.farPlaneDistance *= 0.83F;
      }

      MatrixStack matrixstack = new MatrixStack();
      matrixstack.getLast().getMatrix().method35508(this.method749(activerenderinfo, partialTicks, true));
      MatrixStack matrixstack1 = matrixstack;
      if (Shaders.isEffectsModelView()) {
         matrixstack = matrixStackIn;
      }

      this.hurtCameraEffect(matrixstack, partialTicks);
      if (this.mc.gameSettings.viewBobbing) {
         this.applyBobbing(matrixstack, partialTicks);
      }

      float f = MathHelper.lerp(partialTicks, this.mc.player.prevTimeInPortal, this.mc.player.timeInPortal)
         * this.mc.gameSettings.screenEffectScale
         * this.mc.gameSettings.screenEffectScale;
      if (f > 0.0F) {
         int i = !this.mc.player.isPotionActive(Effects.NAUSEA) ? 20 : 7;
         float f1 = 5.0F / (f * f + 5.0F) - f * 0.04F;
         f1 *= f1;
         Vector3f vector3f = new Vector3f(0.0F, MathHelper.SQRT_2 / 2.0F, MathHelper.SQRT_2 / 2.0F);
         matrixstack.rotate(vector3f.rotationDegrees(((float)this.rendererUpdateCount + partialTicks) * (float)i));
         matrixstack.scale(1.0F / f1, 1.0F, 1.0F);
         float f2 = -((float)this.rendererUpdateCount + partialTicks) * (float)i;
         matrixstack.rotate(vector3f.rotationDegrees(f2));
      }

      if (Shaders.isEffectsModelView()) {
         matrixstack = matrixstack1;
      }

      Matrix4f matrix4f = matrixstack.getLast().getMatrix();
      this.method748(matrix4f);
      activerenderinfo.update(
         this.mc.world,
         (Entity)(this.mc.getRenderViewEntity() != null ? this.mc.getRenderViewEntity() : this.mc.player),
         !this.mc.gameSettings.getPointOfView().func_243192_a(),
         this.mc.gameSettings.getPointOfView().func_243193_b(),
         partialTicks
      );
      if (Reflector.ForgeHooksClient_onCameraSetup.exists()) {
         Object object = Reflector.ForgeHooksClient_onCameraSetup.call(this, activerenderinfo, partialTicks);
         float f4 = Reflector.callFloat(object, Reflector.EntityViewRenderEvent_CameraSetup_getYaw);
         float f5 = Reflector.callFloat(object, Reflector.EntityViewRenderEvent_CameraSetup_getPitch);
         float f3 = Reflector.callFloat(object, Reflector.EntityViewRenderEvent_CameraSetup_getRoll);
         activerenderinfo.setAnglesInternal(f4, f5);
         matrixStackIn.rotate(Vector3f.ZP.rotationDegrees(f3));
      }

      matrixStackIn.rotate(Vector3f.XP.rotationDegrees(activerenderinfo.getPitch()));
      matrixStackIn.rotate(Vector3f.YP.rotationDegrees(activerenderinfo.getYaw() + 180.0F));
      this.mc.worldRenderer.updateCameraAndRender(matrixStackIn, partialTicks, finishTimeNano, flag1, activerenderinfo, this, this.lightmapTexture, matrix4f);
      if (Reflector.ForgeHooksClient_dispatchRenderLast.exists()) {
         this.mc.getProfiler().endStartSection("forge_render_last");
         Reflector.callVoid(Reflector.ForgeHooksClient_dispatchRenderLast, this.mc.worldRenderer, matrixStackIn, partialTicks, matrix4f, finishTimeNano);
      }

      this.mc.getProfiler().endStartSection("hand");
      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(matrixStackIn.getLast().getMatrix());
      Client.getInstance().hook3DRenderEvent();
      RenderSystem.popMatrix();
      if (this.renderHand && ! Shaders.isShadowPass) {
         if (flag) {
            ShadersRender.renderHand1(this, matrixStackIn, activerenderinfo, partialTicks);
            Shaders.renderCompositeFinal();
         }

         RenderSystem.clear(256, Minecraft.IS_RUNNING_ON_MAC);
         if (!flag) {
            this.renderHand(matrixStackIn, activerenderinfo, partialTicks);
         } else {
            ShadersRender.renderFPOverlay(this, matrixStackIn, activerenderinfo, partialTicks);
         }
      }

      if (flag) {
         Shaders.endRender();
      }

      this.mc.getProfiler().endSection();
   }

   public void resetData() {
      this.itemActivationItem = null;
      this.field807.method596();
      this.activeRender.method37518();
   }

   public Class194 method756() {
      return this.field807;
   }

   private void method757() {
      this.field840 = 0;
      if (!Config.method26938() || !Config.isSingleProcessor()) {
         this.field837 = 0L;
         this.field838 = 0;
      } else if (this.mc.isIntegratedServerRunning()) {
         IntegratedServer var3 = this.mc.getIntegratedServer();
         if (var3 != null) {
            boolean var4 = this.mc.isGamePaused();
            if (!var4 && !(this.mc.currentScreen instanceof Class1312)) {
               if (this.field839 > 0) {
                  Class8578.field38580.method31034();
                  Config.method26885((long)this.field839);
                  Class8578.field38580.method31035();
                  this.field840 = this.field839;
               }

               long var5 = System.nanoTime() / 1000000L;
               if (this.field837 != 0L && this.field838 != 0) {
                  long var7 = var5 - this.field837;
                  if (var7 < 0L) {
                     this.field837 = var5;
                     var7 = 0L;
                  }

                  if (var7 >= 50L) {
                     this.field837 = var5;
                     int var9 = var3.method1375();
                     int var10 = var9 - this.field838;
                     if (var10 < 0) {
                        this.field838 = var9;
                        var10 = 0;
                     }

                     if (var10 < 1 && this.field839 < 100) {
                        this.field839 += 2;
                     }

                     if (var10 > 1 && this.field839 > 0) {
                        this.field839--;
                     }

                     this.field838 = var9;
                  }
               } else {
                  this.field837 = var5;
                  this.field838 = var3.method1375();
                  this.field842 = 1.0F;
                  this.field841 = 50.0F;
               }
            } else {
               if (this.mc.currentScreen instanceof Class1312) {
                  Config.method26885(20L);
               }

               this.field837 = 0L;
               this.field838 = 0;
            }
         }
      }
   }

   private void method758() {
      Config.method26990();
      Class9084.method33876();
      if (!this.field834) {
         Class9787.method38575();
         if (Config.method26959() == 64 && Config.method26960() == 32) {
            Config.method26962(true);
         }

         this.field834 = true;
      }

      ClientWorld var3 = this.mc.world;
      if (var3 != null) {
         if (Config.method26929() != null) {
            String var4 = "HD_U".replace("HD_U", "HD Ultra").replace("L", "Light");
            String var5 = var4 + " " + Config.method26929();
            StringTextComponent var6 = new StringTextComponent(I18n.format("of.message.newVersion", "§n" + var5 + "§r"));
            var6.setStyle(Style.EMPTY.setClickEvent(new ClickEvent(ClickEvent$Action.OPEN_URL, "https://optifine.net/downloads")));
            this.mc.ingameGUI.getChatGUI().sendChatMessage(var6);
            Config.method26930((String)null);
         }

         if (Config.method26961()) {
            Config.method26962(false);
            StringTextComponent var7 = new StringTextComponent(I18n.format("of.message.java64Bit"));
            this.mc.ingameGUI.getChatGUI().sendChatMessage(var7);
         }
      }

      if (this.mc.currentScreen instanceof VanillaMainMenuScreen) {
         this.method760((VanillaMainMenuScreen)this.mc.currentScreen);
      }

      if (this.field835 != var3) {
         Class9387.method35632(this.field835, var3);
         Config.updateThreadPriorities();
         this.field837 = 0L;
         this.field838 = 0;
         this.field835 = var3;
      }

      if (!this.setFxaaShader(Shaders.field40878)) {
         Shaders.field40878 = 0;
      }

      if (this.mc.currentScreen != null && this.mc.currentScreen.getClass() == ChatScreen.class) {
         this.mc.displayGuiScreen(new Class1333((ChatScreen)this.mc.currentScreen));
      }
   }

   private void method759() {
      if (this.mc.world != null && Config.method26981() && Class4379.method13743("CheckGlErrorFrameFinish", 10000L)) {
         int var3 = GlStateManager.method23859();
         if (var3 != 0 && Class9084.method33877(var3)) {
            String var4 = Config.method26985(var3);
            StringTextComponent var5 = new StringTextComponent(I18n.format("of.message.openglError", var3, var4));
            this.mc.ingameGUI.getChatGUI().sendChatMessage(var5);
         }
      }
   }

   private void method760(VanillaMainMenuScreen var1) {
      try {
         String var4 = null;
         Calendar var5 = Calendar.getInstance();
         var5.setTime(new Date());
         int var6 = var5.get(5);
         int var7 = var5.get(2) + 1;
         if (var6 == 8 && var7 == 4) {
            var4 = "Happy birthday, OptiFine!";
         }

         if (var6 == 14 && var7 == 8) {
            var4 = "Happy birthday, sp614x!";
         }

         if (var4 == null) {
            return;
         }

         Reflector.method35082(var1, Reflector.field43011, var4);
      } catch (Throwable var8) {
      }
   }

   public boolean setFxaaShader(int p_setFxaaShader_1_) {
      if (!GLX.isUsingFBOs())
      {
         return false;
      }
      else if (this.shaderGroup != null && this.shaderGroup != this.fxaaShaders[2] && this.shaderGroup != this.fxaaShaders[4])
      {
         return true;
      }
      else if (p_setFxaaShader_1_ != 2 && p_setFxaaShader_1_ != 4)
      {
         if (this.shaderGroup == null)
         {
            return true;
         }
         else
         {
            this.shaderGroup.close();
            this.shaderGroup = null;
            return true;
         }
      }
      else if (this.shaderGroup != null && this.shaderGroup == this.fxaaShaders[p_setFxaaShader_1_])
      {
         return true;
      }
      else if (this.mc.world == null)
      {
         return true;
      }
      else
      {
         this.loadShader(new ResourceLocation("shaders/post/fxaa_of_" + p_setFxaaShader_1_ + "x.json"));
         this.fxaaShaders[p_setFxaaShader_1_] = this.shaderGroup;
         return this.useShader;
      }
   }

   public IResourceType method762() {
      return VanillaResourceType.SHADERS;
   }

   public void displayItemActivation(ItemStack var1) {
      this.itemActivationItem = var1;
      this.itemActivationTicks = 40;
      this.itemActivationOffX = this.field804.nextFloat() * 2.0F - 1.0F;
      this.itemActivationOffY = this.field804.nextFloat() * 2.0F - 1.0F;
   }

   public void renderItemActivation(int var1, int var2, float var3) {
      if (this.itemActivationItem != null && this.itemActivationTicks > 0) {
         int var6 = 40 - this.itemActivationTicks;
         float var7 = ((float)var6 + var3) / 40.0F;
         float var8 = var7 * var7;
         float var9 = var7 * var8;
         float var10 = 10.25F * var9 * var8 - 24.95F * var8 * var8 + 25.5F * var9 - 13.8F * var8 + 4.0F * var7;
         float var11 = var10 * (float) Math.PI;
         float var12 = this.itemActivationOffX * (float)(var1 / 4);
         float var13 = this.itemActivationOffY * (float)(var2 / 4);
         RenderSystem.enableAlphaTest();
         RenderSystem.pushMatrix();
         RenderSystem.pushLightingAttributes();
         RenderSystem.enableDepthTest();
         RenderSystem.disableCull();
         MatrixStack var14 = new MatrixStack();
         var14.push();
         var14.translate(
            (double)((float)(var1 / 2) + var12 * MathHelper.method37771(MathHelper.sin(var11 * 2.0F))),
            (double)((float)(var2 / 2) + var13 * MathHelper.method37771(MathHelper.sin(var11 * 2.0F))),
            -50.0
         );
         float var15 = 50.0F + 175.0F * MathHelper.sin(var11);
         var14.scale(var15, -var15, var15);
         var14.rotate(Vector3f.YP.rotationDegrees(900.0F * MathHelper.method37771(MathHelper.sin(var11))));
         var14.rotate(Vector3f.XP.rotationDegrees(6.0F * MathHelper.cos(var7 * 8.0F)));
         var14.rotate(Vector3f.ZP.rotationDegrees(6.0F * MathHelper.cos(var7 * 8.0F)));
         Class7735 var16 = this.field808.getBufferSource();
         this.mc.getItemRenderer().renderItem(this.itemActivationItem, ItemCameraTransformsTransformType.FIXED, 15728880, OverlayTexture.NO_OVERLAY, var14, var16);
         var14.pop();
         var16.finish();
         RenderSystem.popAttributes();
         RenderSystem.popMatrix();
         RenderSystem.enableCull();
         RenderSystem.disableDepthTest();
      }
   }

   private void func_243497_c(float var1) {
      int var4 = this.mc.getMainWindow().getScaledWidth();
      int var5 = this.mc.getMainWindow().getScaledHeight();
      double var6 = MathHelper.lerp((double)var1, 2.0, 1.0);
      float var8 = 0.2F * var1;
      float var9 = 0.4F * var1;
      float var10 = 0.2F * var1;
      double var11 = (double)var4 * var6;
      double var13 = (double)var5 * var6;
      double var15 = ((double)var4 - var11) / 2.0;
      double var17 = ((double)var5 - var13) / 2.0;
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.enableBlend();
      RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.ONE, DestFactor.field12927, GlStateManager.SourceFactor.ONE, DestFactor.field12927);
      RenderSystem.color4f(var8, var9, var10, 1.0F);
      this.mc.getTextureManager().bindTexture(field800);
      Tessellator tessellator = Tessellator.getInstance();
      BufferBuilder bufferbuilder = tessellator.getBuffer();
      bufferbuilder.begin(7, DefaultVertexFormats.field43344);
      bufferbuilder.pos(var15, var17 + var13, -90.0).tex(0.0F, 1.0F).endVertex();
      bufferbuilder.pos(var15 + var11, var17 + var13, -90.0).tex(1.0F, 1.0F).endVertex();
      bufferbuilder.pos(var15 + var11, var17, -90.0).tex(1.0F, 0.0F).endVertex();
      bufferbuilder.pos(var15, var17, -90.0).tex(0.0F, 0.0F).endVertex();
      tessellator.draw();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableBlend();
      RenderSystem.depthMask(true);
      RenderSystem.enableDepthTest();
   }

   public float method766(float var1) {
      return MathHelper.lerp(var1, this.field813, this.field812);
   }

   public float method767() {
      return this.farPlaneDistance;
   }

   public ActiveRenderInfo getActiveRenderInfo() {
      return this.activeRender;
   }

   public Class1699 method769() {
      return this.lightmapTexture;
   }

   public OverlayTexture method770() {
      return this.field819;
   }
}
