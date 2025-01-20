package net.minecraft.client.renderer;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.*;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientChunkProvider;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.settings.ParticleStatus;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.crash.ReportedException;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.world.DimensionRenderInfo;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particles.IParticleData;
import net.minecraft.resources.IResourceManagerReloadListener;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3f;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.resource.IResourceType;
import net.minecraftforge.resource.VanillaResourceType;
import net.optifine.DynamicLights;
import net.optifine.Config;
import net.optifine.reflect.ReflectorForge;
import net.optifine.render.RenderStateManager;
import net.optifine.shaders.Shaders;
import net.optifine.shaders.ShadersRender;
import net.optifine.util.BiomeUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.*;

public class WorldRenderer implements IResourceManagerReloadListener, AutoCloseable {
   private static final Logger field930 = LogManager.getLogger();
   private static final ResourceLocation field931 = new ResourceLocation("textures/environment/moon_phases.png");
   private static final ResourceLocation field932 = new ResourceLocation("textures/environment/sun.png");
   private static final ResourceLocation field933 = new ResourceLocation("textures/environment/clouds.png");
   private static final ResourceLocation field934 = new ResourceLocation("textures/environment/end_sky.png");
   private static final ResourceLocation field935 = new ResourceLocation("textures/misc/forcefield.png");
   private static final ResourceLocation field936 = new ResourceLocation("textures/environment/rain.png");
   private static final ResourceLocation field937 = new ResourceLocation("textures/environment/snow.png");
   public static final Direction[] field938 = Direction.values();
   private final Minecraft mc;
   private final TextureManager field940;
   public final EntityRendererManager renderManager;
   private final RenderTypeBuffers renderTypeTextures;
   private ClientWorld world;
   private Set<Class8066> chunksToUpdate = new ObjectLinkedOpenHashSet();
   private ObjectList<Class7002> field945 = new ObjectArrayList(69696);
   private final Set<TileEntity> field946 = Sets.newHashSet();
   private Class9242 viewFrustum;
   private final Class7831 field948 = DefaultVertexFormats.field43341;
   private Class1698 field949;
   private Class1698 field950;
   private Class1698 field951;
   private boolean field952 = true;
   private Class1698 field953;
   private final Class9633 field954 = new Class9633(100);
   private int field955;
   private final Int2ObjectMap<Class1995> field956 = new Int2ObjectOpenHashMap();
   private final Long2ObjectMap<SortedSet<Class1995>> field957 = new Long2ObjectOpenHashMap();
   private final Map<BlockPos, Class6340> field958 = Maps.newHashMap();
   public Framebuffer entityOutlineFramebuffer;
   private ShaderGroup field960;
   private Framebuffer field961;
   private Framebuffer field962;
   private Framebuffer field963;
   private Framebuffer field964;
   private Framebuffer field965;
   private ShaderGroup field966;
   private double frustumUpdatePosX = Double.MIN_VALUE;
   private double frustumUpdatePosY = Double.MIN_VALUE;
   private double frustumUpdatePosZ = Double.MIN_VALUE;
   private int frustumUpdatePosChunkX = Integer.MIN_VALUE;
   private int frustumUpdatePosChunkY = Integer.MIN_VALUE;
   private int frustumUpdatePosChunkZ = Integer.MIN_VALUE;
   private double field973 = Double.MIN_VALUE;
   private double field974 = Double.MIN_VALUE;
   private double field975 = Double.MIN_VALUE;
   private double field976 = Double.MIN_VALUE;
   private double field977 = Double.MIN_VALUE;
   private int field978 = Integer.MIN_VALUE;
   private int field979 = Integer.MIN_VALUE;
   private int field980 = Integer.MIN_VALUE;
   private Vector3d field981 = Vector3d.ZERO;
   private CloudOption field982;
   private Class9016 field983;
   private final Class7831 field984 = DefaultVertexFormats.field43334;
   private int field985 = -1;
   private int field986;
   private int field987;
   private boolean field988;
   private Class7647 field989;
   private final Class7755[] field990 = new Class7755[8];
   private final Class9184 field991 = new Class9184(0.0, 0.0, 0.0);
   private double field992;
   private double field993;
   private double field994;
   private boolean field995 = true;
   private int field996;
   private int field997;
   private final float[] field998 = new float[1024];
   private final float[] field999 = new float[1024];
   public Entity field1000;
   public Set field1001 = new LinkedHashSet();
   public Set field1002 = new LinkedHashSet();
   private Set<Class8066> chunksToUpdatePrev = new ObjectLinkedOpenHashSet();
   private Deque field1004 = new ArrayDeque();
   private List<Class7002> renderInfosEntities = new ArrayList<Class7002>(1024);
   private List<Class7002> renderInfosTileEntities = new ArrayList<Class7002>(1024);
   private ObjectList field1007 = new ObjectArrayList(1024);
   private List field1008 = new ArrayList(1024);
   private List field1009 = new ArrayList(1024);
   private ObjectList field1010 = new ObjectArrayList(1024);
   private List field1011 = new ArrayList(1024);
   private List field1012 = new ArrayList(1024);
   private int field1013 = 0;
   private int field1014 = 0;
   private static final Set field1015 = Collections.<Direction>unmodifiableSet(new HashSet(Arrays.asList(Direction.VALUES)));
   private int field1016;
   private int field1017 = 0;
   private Class8391 renderEnv = new Class8391(Blocks.AIR.getDefaultState(), new BlockPos(0, 0, 0));
   public boolean field1019 = false;
   public boolean field1020 = false;
   private boolean field1021 = false;
   private static int field1022 = 0;
   public int field1023 = -1;
   public static final int field1024 = 201435902;
   private static boolean field1025 = false;
   private Map<String, List<Entity>> field1026 = new HashMap<String, List<Entity>>();
   private Map<RenderType, Map> field1027 = new LinkedHashMap<RenderType, Map>();

   @Nullable
   private Class8066 method854(BlockPos var1, Class8066 var2, Direction var3) {
      BlockPos var4 = var2.method27723(var3);
      if (MathHelper.abs(var1.getX() - var4.getX()) > this.field985 * 16) {
         return null;
      } else if (var4.getY() >= 0 && var4.getY() < 256) {
         return MathHelper.abs(var1.getZ() - var4.getZ()) > this.field985 * 16 ? null : this.viewFrustum.method34761(var4);
      } else {
         return null;
      }
   }

   public WorldRenderer(Minecraft var1, RenderTypeBuffers var2) {
      this.mc = var1;
      this.renderManager = var1.getRenderManager();
      this.renderTypeTextures = var2;
      this.field940 = var1.getTextureManager();

      for (int var3 = 0; var3 < 32; var3++) {
         for (int var4 = 0; var4 < 32; var4++) {
            float var5 = (float)(var4 - 16);
            float var6 = (float)(var3 - 16);
            float var7 = MathHelper.sqrt(var5 * var5 + var6 * var6);
            this.field998[var3 << 5 | var4] = -var6 / var7;
            this.field999[var3 << 5 | var4] = var5 / var7;
         }
      }

      this.method865();
      this.method863();
      this.method862();
   }

   private void method855(Class1699 var1, float var2, double var3, double var5, double var7) {
      if (Reflector.field42948.exists()) {
         Class8296 var9 = (Class8296) Reflector.call(this.world.func_239132_a_(), Reflector.field42948);
         if (var9 != null) {
            var9.method28999(this.field955, var2, this.world, this.mc, var1, var3, var5, var7);
            return;
         }
      }

      float var48 = this.mc.world.method6792(var2);
      if (!(var48 <= 0.0F)) {
         if (Config.method26821()) {
            return;
         }

         var1.method7317();
         ClientWorld var10 = this.mc.world;
         int var11 = MathHelper.floor(var3);
         int var12 = MathHelper.floor(var5);
         int var13 = MathHelper.floor(var7);
         Tessellator var14 = Tessellator.getInstance();
         BufferBuilder var15 = var14.getBuffer();
         RenderSystem.enableAlphaTest();
         RenderSystem.disableCull();
         RenderSystem.normal3f(0.0F, 1.0F, 0.0F);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.method27939();
         RenderSystem.enableDepthTest();
         int var16 = 5;
         if (Config.method26820()) {
            var16 = 10;
         }

         RenderSystem.depthMask(Minecraft.isFabulousGraphicsEnabled());
         int var17 = -1;
         float var18 = (float)this.field955 + var2;
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         BlockPos.Mutable var19 = new BlockPos.Mutable();

         for (int var20 = var13 - var16; var20 <= var13 + var16; var20++) {
            for (int var21 = var11 - var16; var21 <= var11 + var16; var21++) {
               int var22 = (var20 - var13 + 16) * 32 + var21 - var11 + 16;
               double var23 = (double)this.field998[var22] * 0.5;
               double var25 = (double)this.field999[var22] * 0.5;
               var19.setPos(var21, 0, var20);
               Biome var27 = var10.getBiome(var19);
               if (var27.getPrecipitation() != Biome.RainType.NONE) {
                  int var28 = var10.getTopPosition(Heightmap.Type.MOTION_BLOCKING, var19).getY();
                  int var29 = var12 - var16;
                  int var30 = var12 + var16;
                  if (var29 < var28) {
                     var29 = var28;
                  }

                  if (var30 < var28) {
                     var30 = var28;
                  }

                  int var31 = var28;
                  if (var28 < var12) {
                     var31 = var12;
                  }

                  if (var29 != var30) {
                     Random var32 = new Random((long)(var21 * var21 * 3121 + var21 * 45238971 ^ var20 * var20 * 418711 + var20 * 13761));
                     var19.setPos(var21, var29, var20);
                     float var33 = var27.getTemperature(var19);
                     if (var33 >= 0.15F) {
                        if (var17 != 0) {
                           if (var17 >= 0) {
                              var14.draw();
                           }

                           var17 = 0;
                           this.mc.getTextureManager().bindTexture(field936);
                           var15.begin(7, DefaultVertexFormats.field43340);
                        }

                        int var34 = this.field955 + var21 * var21 * 3121 + var21 * 45238971 + var20 * var20 * 418711 + var20 * 13761 & 31;
                        float var35 = -((float)var34 + var2) / 32.0F * (3.0F + var32.nextFloat());
                        double var36 = (double)((float)var21 + 0.5F) - var3;
                        double var38 = (double)((float)var20 + 0.5F) - var7;
                        float var40 = MathHelper.sqrt(var36 * var36 + var38 * var38) / (float)var16;
                        float var41 = ((1.0F - var40 * var40) * 0.5F + 0.5F) * var48;
                        var19.setPos(var21, var31, var20);
                        int var42 = method944(var10, var19);
                        var15.pos((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .tex(0.0F, (float)var29 * 0.25F + var35)
                           .color(1.0F, 1.0F, 1.0F, var41)
                           .method17034(var42)
                           .endVertex();
                        var15.pos((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .tex(1.0F, (float)var29 * 0.25F + var35)
                           .color(1.0F, 1.0F, 1.0F, var41)
                           .method17034(var42)
                           .endVertex();
                        var15.pos((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .tex(1.0F, (float)var30 * 0.25F + var35)
                           .color(1.0F, 1.0F, 1.0F, var41)
                           .method17034(var42)
                           .endVertex();
                        var15.pos((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .tex(0.0F, (float)var30 * 0.25F + var35)
                           .color(1.0F, 1.0F, 1.0F, var41)
                           .method17034(var42)
                           .endVertex();
                     } else {
                        if (var17 != 1) {
                           if (var17 >= 0) {
                              var14.draw();
                           }

                           var17 = 1;
                           this.mc.getTextureManager().bindTexture(field937);
                           var15.begin(7, DefaultVertexFormats.field43340);
                        }

                        float var49 = -((float)(this.field955 & 511) + var2) / 512.0F;
                        float var50 = (float)(var32.nextDouble() + (double)var18 * 0.01 * (double)((float)var32.nextGaussian()));
                        float var51 = (float)(var32.nextDouble() + (double)(var18 * (float)var32.nextGaussian()) * 0.001);
                        double var37 = (double)((float)var21 + 0.5F) - var3;
                        double var39 = (double)((float)var20 + 0.5F) - var7;
                        float var52 = MathHelper.sqrt(var37 * var37 + var39 * var39) / (float)var16;
                        float var53 = ((1.0F - var52 * var52) * 0.3F + 0.5F) * var48;
                        var19.setPos(var21, var31, var20);
                        int var43 = method944(var10, var19);
                        int var44 = var43 >> 16 & 65535;
                        int var45 = (var43 & 65535) * 3;
                        int var46 = (var44 * 3 + 240) / 4;
                        int var47 = (var45 * 3 + 240) / 4;
                        var15.pos((double)var21 - var3 - var23 + 0.5, (double)var30 - var5, (double)var20 - var7 - var25 + 0.5)
                           .tex(0.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .color(1.0F, 1.0F, 1.0F, var53)
                           .method17029(var47, var46)
                           .endVertex();
                        var15.pos((double)var21 - var3 + var23 + 0.5, (double)var30 - var5, (double)var20 - var7 + var25 + 0.5)
                           .tex(1.0F + var50, (float)var29 * 0.25F + var49 + var51)
                           .color(1.0F, 1.0F, 1.0F, var53)
                           .method17029(var47, var46)
                           .endVertex();
                        var15.pos((double)var21 - var3 + var23 + 0.5, (double)var29 - var5, (double)var20 - var7 + var25 + 0.5)
                           .tex(1.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .color(1.0F, 1.0F, 1.0F, var53)
                           .method17029(var47, var46)
                           .endVertex();
                        var15.pos((double)var21 - var3 - var23 + 0.5, (double)var29 - var5, (double)var20 - var7 - var25 + 0.5)
                           .tex(0.0F + var50, (float)var30 * 0.25F + var49 + var51)
                           .color(1.0F, 1.0F, 1.0F, var53)
                           .method17029(var47, var46)
                           .endVertex();
                     }
                  }
               }
            }
         }

         if (var17 >= 0) {
            var14.draw();
         }

         RenderSystem.enableCull();
         RenderSystem.disableBlend();
         RenderSystem.method27939();
         RenderSystem.disableAlphaTest();
         var1.method7316();
      }
   }

   public void method856(ActiveRenderInfo var1) {
      float var2 = this.mc.world.method6792(1.0F) / (Minecraft.isFancyGraphicsEnabled() ? 1.0F : 2.0F);
      if (!Config.method26820()) {
         var2 /= 2.0F;
      }

      if (!(var2 <= 0.0F) && Config.method26847()) {
         Random var3 = new Random((long)this.field955 * 312987231L);
         ClientWorld var4 = this.mc.world;
         BlockPos var5 = new BlockPos(var1.getPos());
         BlockPos var6 = null;
         int var7 = (int)(100.0F * var2 * var2) / (this.mc.gameSettings.particles == ParticleStatus.field15247 ? 2 : 1);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var3.nextInt(21) - 10;
            int var10 = var3.nextInt(21) - 10;
            BlockPos var11 = var4.getTopPosition(Heightmap.Type.MOTION_BLOCKING, var5.add(var9, 0, var10)).down();
            Biome var12 = var4.getBiome(var11);
            if (var11.getY() > 0
               && var11.getY() <= var5.getY() + 10
               && var11.getY() >= var5.getY() - 10
               && var12.getPrecipitation() == Biome.RainType.RAIN
               && var12.getTemperature(var11) >= 0.15F) {
               var6 = var11;
               if (this.mc.gameSettings.particles == ParticleStatus.field15248) {
                  break;
               }

               double var13 = var3.nextDouble();
               double var15 = var3.nextDouble();
               BlockState var17 = var4.getBlockState(var11);
               FluidState var18 = var4.getFluidState(var11);
               VoxelShape var19 = var17.method23414(var4, var11);
               double var20 = var19.method19522(Direction.Axis.Y, var13, var15);
               double var22 = (double)var18.method23475(var4, var11);
               double var24 = Math.max(var20, var22);
               Class7435 var26 = !var18.method23486(FluidTags.field40470) && !var17.isIn(Blocks.field36890) && !Class3244.method11655(var17)
                  ? ParticleTypes.field34091
                  : ParticleTypes.field34092;
               this.mc
                  .world
                  .addParticle(var26, (double)var11.getX() + var13, (double)var11.getY() + var24, (double)var11.getZ() + var15, 0.0, 0.0, 0.0);
            }
         }

         if (var6 != null && var3.nextInt(3) < this.field997++) {
            this.field997 = 0;
            if (var6.getY() > var5.getY() + 1
               && var4.getTopPosition(Heightmap.Type.MOTION_BLOCKING, var5).getY() > MathHelper.floor((float)var5.getY())) {
               this.mc.world.method6858(var6, SoundEvents.field27227, SoundCategory.field14731, 0.1F, 0.5F, false);
            } else {
               this.mc.world.method6858(var6, SoundEvents.field27226, SoundCategory.field14731, 0.2F, 1.0F, false);
            }
         }
      }
   }

   @Override
   public void close() {
      if (this.field960 != null) {
         this.field960.close();
      }

      if (this.field966 != null) {
         this.field966.close();
      }
   }

   @Override
   public void method737(IResourceManager var1) {
      this.field940.bindTexture(field935);
      RenderSystem.method27863(3553, 10242, 10497);
      RenderSystem.method27863(3553, 10243, 10497);
      RenderSystem.bindTexture(0);
      this.method857();
      if (Minecraft.isFabulousGraphicsEnabled()) {
         this.method858();
      }
   }

   public void method857() {
      if (this.field960 != null) {
         this.field960.close();
      }

      ResourceLocation var1 = new ResourceLocation("shaders/post/entity_outline.json");

      try {
         this.field960 = new ShaderGroup(this.mc.getTextureManager(), this.mc.getResourceManager(), this.mc.getFramebuffer(), var1);
         this.field960.createBindFramebuffers(this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight());
         this.entityOutlineFramebuffer = this.field960.method6521("final");
      } catch (IOException var3) {
         field930.warn("Failed to load shader: {}", var1, var3);
         this.field960 = null;
         this.entityOutlineFramebuffer = null;
      } catch (JsonSyntaxException var4) {
         field930.warn("Failed to parse shader: {}", var1, var4);
         this.field960 = null;
         this.entityOutlineFramebuffer = null;
      }
   }

   private void method858() {
      this.method859();
      ResourceLocation var1 = new ResourceLocation("shaders/post/transparency.json");

      try {
         ShaderGroup var2 = new ShaderGroup(this.mc.getTextureManager(), this.mc.getResourceManager(), this.mc.getFramebuffer(), var1);
         var2.createBindFramebuffers(this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight());
         Framebuffer var10 = var2.method6521("translucent");
         Framebuffer var11 = var2.method6521("itemEntity");
         Framebuffer var12 = var2.method6521("particles");
         Framebuffer var14 = var2.method6521("weather");
         Framebuffer var7 = var2.method6521("clouds");
         this.field966 = var2;
         this.field961 = var10;
         this.field962 = var11;
         this.field963 = var12;
         this.field964 = var14;
         this.field965 = var7;
      } catch (Exception var9) {
         String var3 = var9 instanceof JsonSyntaxException ? "parse" : "load";
         String var4 = "Failed to " + var3 + " shader: " + var1;
         Class2493 var5 = new Class2493(var4, var9);
         if (this.mc.getResourcePackList().func_232621_d_().size() > 1) {
            StringTextComponent var6;
            try {
               var6 = new StringTextComponent(this.mc.getResourceManager().getShader(var1).method7765());
            } catch (IOException var8) {
               var6 = null;
            }

            this.mc.gameSettings.graphicFanciness = GraphicsFanciness.FANCY;
            this.mc.throwResourcePackLoadError(var5, var6);
         } else {
            CrashReport var13 = this.mc.addGraphicsAndWorldToCrashReport(new CrashReport(var4, var5));
            this.mc.gameSettings.graphicFanciness = GraphicsFanciness.FANCY;
            this.mc.gameSettings.saveOptions();
            field930.fatal(var4, var5);
            this.mc.freeMemory();
            Minecraft.displayCrashReport(var13);
         }
      }
   }

   private void method859() {
      if (this.field966 != null) {
         this.field966.close();
         this.field961.deleteFramebuffer();
         this.field962.deleteFramebuffer();
         this.field963.deleteFramebuffer();
         this.field964.deleteFramebuffer();
         this.field965.deleteFramebuffer();
         this.field966 = null;
         this.field961 = null;
         this.field962 = null;
         this.field963 = null;
         this.field964 = null;
         this.field965 = null;
      }
   }

   public void method860() {
      if (this.isRenderEntityOutlines()) {
         RenderSystem.enableBlend();
         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ZERO, DestFactor.field12927);
         this.entityOutlineFramebuffer.framebufferRenderExt(this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight(), false);
         RenderSystem.disableBlend();
      }
   }

   public boolean isRenderEntityOutlines() {
      return !Config.isShaders() && !Config.isAntialiasing() ? this.entityOutlineFramebuffer != null && this.field960 != null && this.mc.player != null : false;
   }

   private void method862() {
      Tessellator var1 = Tessellator.getInstance();
      BufferBuilder var2 = var1.getBuffer();
      if (this.field951 != null) {
         this.field951.close();
      }

      this.field951 = new Class1698(this.field948);
      this.method864(var2, -16.0F, true);
      var2.finishDrawing();
      this.field951.method7303(var2);
   }

   private void method863() {
      Tessellator var1 = Tessellator.getInstance();
      BufferBuilder var2 = var1.getBuffer();
      if (this.field950 != null) {
         this.field950.close();
      }

      this.field950 = new Class1698(this.field948);
      this.method864(var2, 16.0F, false);
      var2.finishDrawing();
      this.field950.method7303(var2);
   }

   private void method864(BufferBuilder var1, float var2, boolean var3) {
      int var4 = 64;
      int var5 = 6;
      var1.begin(7, DefaultVertexFormats.field43341);
      int var6 = (this.field1013 / 64 + 1) * 64 + 64;

      for (int var7 = -var6; var7 <= var6; var7 += 64) {
         for (int var8 = -var6; var8 <= var6; var8 += 64) {
            float var9 = (float)var7;
            float var10 = (float)(var7 + 64);
            if (var3) {
               var10 = (float)var7;
               var9 = (float)(var7 + 64);
            }

            var1.pos((double)var9, (double)var2, (double)var8).endVertex();
            var1.pos((double)var10, (double)var2, (double)var8).endVertex();
            var1.pos((double)var10, (double)var2, (double)(var8 + 64)).endVertex();
            var1.pos((double)var9, (double)var2, (double)(var8 + 64)).endVertex();
         }
      }
   }

   private void method865() {
      Tessellator var1 = Tessellator.getInstance();
      BufferBuilder var2 = var1.getBuffer();
      if (this.field949 != null) {
         this.field949.close();
      }

      this.field949 = new Class1698(this.field948);
      this.method866(var2);
      var2.finishDrawing();
      this.field949.method7303(var2);
   }

   private void method866(BufferBuilder var1) {
      Random var2 = new Random(10842L);
      var1.begin(7, DefaultVertexFormats.field43341);

      for (int var3 = 0; var3 < 1500; var3++) {
         double var4 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var6 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var8 = (double)(var2.nextFloat() * 2.0F - 1.0F);
         double var10 = (double)(0.15F + var2.nextFloat() * 0.1F);
         double var12 = var4 * var4 + var6 * var6 + var8 * var8;
         if (var12 < 1.0 && var12 > 0.01) {
            var12 = 1.0 / Math.sqrt(var12);
            var4 *= var12;
            var6 *= var12;
            var8 *= var12;
            double var14 = var4 * 100.0;
            double var16 = var6 * 100.0;
            double var18 = var8 * 100.0;
            double var20 = Math.atan2(var4, var8);
            double var22 = Math.sin(var20);
            double var24 = Math.cos(var20);
            double var26 = Math.atan2(Math.sqrt(var4 * var4 + var8 * var8), var6);
            double var28 = Math.sin(var26);
            double var30 = Math.cos(var26);
            double var32 = var2.nextDouble() * Math.PI * 2.0;
            double var34 = Math.sin(var32);
            double var36 = Math.cos(var32);

            for (int var38 = 0; var38 < 4; var38++) {
               double var39 = 0.0;
               double var41 = (double)((var38 & 2) - 1) * var10;
               double var43 = (double)((var38 + 1 & 2) - 1) * var10;
               double var45 = 0.0;
               double var47 = var41 * var36 - var43 * var34;
               double var49 = var43 * var36 + var41 * var34;
               double var51 = var47 * var28 + 0.0 * var30;
               double var53 = 0.0 * var28 - var47 * var30;
               double var55 = var53 * var22 - var49 * var24;
               double var57 = var49 * var22 + var53 * var24;
               var1.pos(var14 + var55, var16 + var51, var18 + var57).endVertex();
            }
         }
      }
   }

   public void setWorldAndLoadRenderers(ClientWorld var1) {
      this.frustumUpdatePosX = Double.MIN_VALUE;
      this.frustumUpdatePosY = Double.MIN_VALUE;
      this.frustumUpdatePosZ = Double.MIN_VALUE;
      this.frustumUpdatePosChunkX = Integer.MIN_VALUE;
      this.frustumUpdatePosChunkY = Integer.MIN_VALUE;
      this.frustumUpdatePosChunkZ = Integer.MIN_VALUE;
      this.renderManager.setWorld(var1);
      this.world = var1;
      if (Config.isDynamicLights()) {
         DynamicLights.clear();
      }

      ChunkVisibility.reset();
      this.renderEnv.reset((BlockState)null, (BlockPos)null);
      BiomeUtils.onWorldChanged(this.world);
      Shaders.checkWorldChanged(this.world);
      if (var1 != null) {
         this.loadRenderers();
      } else {
         this.chunksToUpdate.clear();
         this.chunksToUpdatePrev.clear();
         this.clearRenderInfos();
         if (this.viewFrustum != null) {
            this.viewFrustum.deleteGlResources();
            this.viewFrustum = null;
         }

         if (this.field983 != null) {
            this.field983.method33331();
         }

         this.field983 = null;
         this.field946.clear();
      }
   }

   public void loadRenderers() {
      if (this.world != null) {
         if (Minecraft.isFabulousGraphicsEnabled()) {
            this.method858();
         } else {
            this.method859();
         }

         this.world.clearColorCaches();
         if (this.field983 == null) {
            this.field983 = new Class9016(this.world, this, Util.getServerExecutor(), this.mc.isJava64bit(), this.renderTypeTextures.method26535());
         } else {
            this.field983.method33318(this.world);
         }

         this.field995 = true;
         this.field952 = true;
         Class8928.method32635(Config.method26826());
         Class7551.method24695();
         if (Config.isDynamicLights()) {
            DynamicLights.clear();
         }

         SmartAnimations.method14214();
         field1025 = Minecraft.isAmbientOcclusionEnabled();
         this.field985 = this.mc.gameSettings.renderDistanceChunks;
         this.field1013 = this.field985 * 16;
         this.field1014 = this.field1013 * this.field1013;
         this.method865();
         this.method863();
         this.method862();
         if (this.viewFrustum != null) {
            this.viewFrustum.deleteGlResources();
         }

         this.method869();
         synchronized (this.field946) {
            this.field946.clear();
         }

         this.viewFrustum = new Class9242(this.field983, this.world, this.mc.gameSettings.renderDistanceChunks, this);
         if (this.world != null) {
            Entity var4 = this.mc.getRenderViewEntity();
            if (var4 != null) {
               this.viewFrustum.method34759(var4.getPosX(), var4.getPosZ());
            }
         }
      }

      if (this.mc.player == null) {
         this.field1021 = true;
      }
   }

   public void method869() {
      this.chunksToUpdate.clear();
      this.field983.method33325();
   }

   public void method870(int var1, int var2) {
      this.setDisplayListEntitiesDirty();
      if (this.field960 != null) {
         this.field960.createBindFramebuffers(var1, var2);
      }

      if (this.field966 != null) {
         this.field966.createBindFramebuffers(var1, var2);
      }
   }

   public String getDebugInfoRenders() {
      int var1 = this.viewFrustum.field42528.length;
      int var2 = this.method872();
      return String.format(
         "C: %d/%d %sD: %d, %s", var2, var1, this.mc.renderChunksMany ? "(s) " : "", this.field985, this.field983 == null ? "null" : this.field983.method33320()
      );
   }

   public int method872() {
      int var1 = 0;
      ObjectListIterator var2 = this.field945.iterator();

      while (var2.hasNext()) {
         Class7002 var3 = (Class7002)var2.next();
         if (!var3.field30281.method27715().method24109()) {
            var1++;
         }
      }

      return var1;
   }

   public String getDebugInfoEntities() {
      return "E: " + this.field986 + "/" + this.world.getCountLoadedEntities() + ", B: " + this.field987 + ", " + Config.method26778();
   }

   public void method874(ActiveRenderInfo var1, Class7647 var2, boolean var3, int var4, boolean var5) {
      Vector3d var6 = var1.getPos();
      if (this.mc.gameSettings.renderDistanceChunks != this.field985) {
         this.loadRenderers();
      }

      this.world.getProfiler().startSection("camera");
      double var7 = this.mc.player.getPosX() - this.frustumUpdatePosX;
      double var9 = this.mc.player.getPosY() - this.frustumUpdatePosY;
      double var11 = this.mc.player.getPosZ() - this.frustumUpdatePosZ;
      if (this.frustumUpdatePosChunkX != this.mc.player.chunkCoordX
         || this.frustumUpdatePosChunkY != this.mc.player.chunkCoordY
         || this.frustumUpdatePosChunkZ != this.mc.player.chunkCoordZ
         || var7 * var7 + var9 * var9 + var11 * var11 > 16.0) {
         this.frustumUpdatePosX = this.mc.player.getPosX();
         this.frustumUpdatePosY = this.mc.player.getPosY();
         this.frustumUpdatePosZ = this.mc.player.getPosZ();
         this.frustumUpdatePosChunkX = this.mc.player.chunkCoordX;
         this.frustumUpdatePosChunkY = this.mc.player.chunkCoordY;
         this.frustumUpdatePosChunkZ = this.mc.player.chunkCoordZ;
         this.viewFrustum.method34759(this.mc.player.getPosX(), this.mc.player.getPosZ());
      }

      if (Config.isDynamicLights()) {
         DynamicLights.method36309(this);
      }

      this.field983.method33321(var6);
      this.world.getProfiler().endStartSection("cull");
      this.mc.getProfiler().endStartSection("culling");
      BlockPos var13 = var1.getBlockPos();
      Class8066 var14 = this.viewFrustum.method34761(var13);
      int var15 = 16;
      BlockPos var16 = new BlockPos(
         MathHelper.floor(var6.x / 16.0) * 16,
         MathHelper.floor(var6.y / 16.0) * 16,
         MathHelper.floor(var6.z / 16.0) * 16
      );
      float var17 = var1.getPitch();
      float var18 = var1.getYaw();
      this.field995 = this.field995
         || !this.chunksToUpdate.isEmpty()
         || var6.x != this.field973
         || var6.y != this.field974
         || var6.z != this.field975
         || (double)var17 != this.field976
         || (double)var18 != this.field977;
      this.field973 = var6.x;
      this.field974 = var6.y;
      this.field975 = var6.z;
      this.field976 = (double)var17;
      this.field977 = (double)var18;
      this.mc.getProfiler().endStartSection("update");
      Class8578.field38578.method31034();
      int var19 = this.method927();
      if (var19 != this.field1017) {
         this.field1017 = var19;
         this.field995 = true;
      }

      Entity var20 = var1.getRenderViewEntity();
      int var21 = 256;
      if (!ChunkVisibility.method30744()) {
         this.field995 = true;
      }

      if (!var3 && this.field995 && Config.method26983() && ! Shaders.isShadowPass) {
         var21 = ChunkVisibility.method30743(this.world, var20, this.field985);
      }

      Class8066 var22 = this.viewFrustum.method34761(new BlockPos(var20.getPosX(), var20.getPosY(), var20.getPosZ()));
      if (Shaders.isShadowPass) {
         this.field945 = this.field1010;
         this.renderInfosEntities = this.field1011;
         this.renderInfosTileEntities = this.field1012;
         if (!var3 && this.field995) {
            this.clearRenderInfos();
            if (var22 != null && var22.method27718().getY() > var21) {
               this.renderInfosEntities.add(var22.method27746());
            }

            Iterator var23 = Class9252.method34804(this.world, 0.0, var20, this.field985, this.viewFrustum);

            while (var23.hasNext()) {
               Class8066 var24 = (Class8066)var23.next();
               if (var24 != null && var24.method27718().getY() <= var21) {
                  Class7002 var25 = var24.method27746();
                  if (!var24.field34609.get().method24109()) {
                     this.field945.add(var25);
                  }

                  if (Class8674.method31216(var24.method27740())) {
                     this.renderInfosEntities.add(var25);
                  }

                  if (var24.method27715().method24111().size() > 0) {
                     this.renderInfosTileEntities.add(var25);
                  }
               }
            }
         }
      } else {
         this.field945 = this.field1007;
         this.renderInfosEntities = this.field1008;
         this.renderInfosTileEntities = this.field1009;
      }

      if (!var3 && this.field995 && ! Shaders.isShadowPass) {
         this.field995 = false;
         this.clearRenderInfos();
         this.field1004.clear();
         Deque var41 = this.field1004;
         Entity.method3378(MathHelper.clamp((double)this.mc.gameSettings.renderDistanceChunks / 8.0, 1.0, 2.5) * (double)this.mc.gameSettings.field44575);
         boolean var43 = this.mc.renderChunksMany;
         BlockPos var45 = var1.getBlockPos();
         int var26 = var45.getY();
         int var27 = var26 >> 4 << 4;
         if (var27 > var21) {
            var21 += 16;
            if (var27 > var21 && var21 < 256) {
               if (var22 != null) {
                  this.renderInfosEntities.add(var22.method27746());
               }

               Vector3d var28 = new Vector3d((double)var45.getX(), (double)var21, (double)var45.getZ());
               Vector3d var29 = new Vector3d(var28.getX(), var28.getY(), var28.getZ());
               Vector3f var30 = var1.method37516();
               Vector3f var31 = new Vector3f(var30.method25269(), 0.0F, var30.method25271());
               if (!var31.normalize()) {
                  var31 = new Vector3f(1.0F, 0.0F, 0.0F);
               }

               double var32 = (double)(var31.method25269() * 16.0F);
               double var34 = (double)(var31.method25271() * 16.0F);
               double var36 = (double)(this.field985 * 16);

               for (double var38 = var36 * var36; var29.squareDistanceTo(var28) < var38; var29 = var29.add(var32, 0.0, var34)) {
                  Class8066 var40 = this.viewFrustum.method34761(new BlockPos(var29));
                  if (var40 == null) {
                     break;
                  }

                  if (var2.method25122(var40.field34614)) {
                     var40.method27710(var4);
                     var41.add(new Class7002(var40, (Direction)null, 0));
                     break;
                  }
               }
            }
         }

         if (var41.isEmpty()) {
            if (var14 != null && var14.method27718().getY() <= var21) {
               if (var5 && this.world.getBlockState(var13).method23409(this.world, var13)) {
                  var43 = false;
               }

               var14.method27710(var4);
               var41.add(new Class7002(var14, (Direction)null, 0));
            } else {
               int var49 = var16.getY() > 0 ? Math.min(var21, 248) : 8;
               if (var22 != null) {
                  this.renderInfosEntities.add(var22.method27746());
               }

               int var52 = MathHelper.floor(var6.x / 16.0) * 16;
               int var54 = MathHelper.floor(var6.z / 16.0) * 16;
               List<Class7002> var56 = Lists.newArrayList();

               for (int var58 = -this.field985; var58 <= this.field985; var58++) {
                  for (int var33 = -this.field985; var33 <= this.field985; var33++) {
                     Class8066 var61 = this.viewFrustum.method34761(new BlockPos(var52 + (var58 << 4) + 8, var49, var54 + (var33 << 4) + 8));
                     if (var61 != null && var2.method25122(var61.field34614)) {
                        var61.method27710(var4);
                        Class7002 var35 = var61.method27746();
                        Class7002.method21715(var35, (Direction)null, 0, 0);
                        var56.add(var35);
                     }
                  }
               }

               var56.sort(Comparator.comparingDouble(var1x -> var13.distanceSq(var1x.field30281.method27718().add(8, 8, 8))));
               var41.addAll(var56);
            }
         }

         this.mc.getProfiler().startSection("iteration");
         boolean var50 = Config.method26807();

         while (!var41.isEmpty()) {
            Class7002 var53 = (Class7002)var41.poll();
            Class8066 var55 = var53.field30281;
            Direction var57 = Class7002.method21716(var53);
            Class7457 var59 = var55.field34609.get();
            if (!var59.method24109() || var55.method27721()) {
               this.field945.add(var53);
            }

            if (Class8674.method31216(var55.method27740())) {
               this.renderInfosEntities.add(var53);
            }

            if (var59.method24111().size() > 0) {
               this.renderInfosTileEntities.add(var53);
            }

            Direction[] var60 = var43 ? ChunkVisibility.method30746(Class7002.method21717(var53)) : Direction.VALUES;

            for (Direction var37 : var60) {
               if (!var43 || var57 == null || var59.method24107(var57.getOpposite(), var37)) {
                  Class8066 var65 = this.method875(var16, var55, var37, var50, var21);
                  if (var65 != null && var65.method27710(var4) && var2.method25122(var65.field34614)) {
                     int var39 = Class7002.method21717(var53) | 1 << var37.ordinal();
                     Class7002 var66 = var65.method27746();
                     Class7002.method21715(var66, var37, var39, Class7002.method21718(var53) + 1);
                     var41.add(var66);
                  }
               }
            }
         }

         this.mc.getProfiler().endSection();
      }

      Class8578.field38578.method31035();
      if (Shaders.isShadowPass) {
         Shaders.method33136();
      } else {
         this.mc.getProfiler().endStartSection("rebuildNear");
         Set var42 = this.chunksToUpdate;
         this.chunksToUpdate = this.chunksToUpdatePrev;
         this.chunksToUpdatePrev = var42;
         this.chunksToUpdate.clear();
         Class8578.field38577.method31034();
         ObjectListIterator var44 = this.field945.iterator();

         while (var44.hasNext()) {
            Class7002 var46 = (Class7002)var44.next();
            Class8066 var47 = var46.field30281;
            if (var47.method27721() || var42.contains(var47)) {
               this.field995 = true;
               BlockPos var48 = var47.method27718();
               boolean var51 = (double)Class7317.method23175(
                     var16, (float)(var48.getX() + 8), (float)(var48.getY() + 8), (float)(var48.getZ() + 8)
                  )
                  < 768.0;
               if (!var47.method27722() && !var51) {
                  this.chunksToUpdate.add(var47);
               } else if (!var47.method27731()) {
                  this.field1002.add(var47);
               } else {
                  this.mc.getProfiler().startSection("build near");
                  this.field983.method33324(var47);
                  var47.method27720();
                  this.mc.getProfiler().endSection();
               }
            }
         }

         Class8578.field38577.method31035();
         this.chunksToUpdate.addAll(var42);
         this.mc.getProfiler().endSection();
      }
   }

   @Nullable
   private Class8066 method875(BlockPos var1, Class8066 var2, Direction var3, boolean var4, int var5) {
      Class8066 var6 = var2.method27745(var3);
      if (var6 == null) {
         return null;
      } else if (var6.method27718().getY() > var5) {
         return null;
      } else {
         if (var4) {
            BlockPos var7 = var6.method27718();
            int var8 = var1.getX() - var7.getX();
            int var9 = var1.getZ() - var7.getZ();
            int var10 = var8 * var8 + var9 * var9;
            if (var10 > this.field1014) {
               return null;
            }
         }

         return var6;
      }
   }

   private void method876(Matrix4f var1, Matrix4f var2, double var3, double var5, double var7, Class7647 var9) {
      this.field989 = var9;
      Matrix4f var10 = var2.method35514();
      var10.method35508(var1);
      var10.method35507();
      this.field991.field42185 = var3;
      this.field991.field42186 = var5;
      this.field991.field42187 = var7;
      this.field990[0] = new Class7755(-1.0F, -1.0F, -1.0F, 1.0F);
      this.field990[1] = new Class7755(1.0F, -1.0F, -1.0F, 1.0F);
      this.field990[2] = new Class7755(1.0F, 1.0F, -1.0F, 1.0F);
      this.field990[3] = new Class7755(-1.0F, 1.0F, -1.0F, 1.0F);
      this.field990[4] = new Class7755(-1.0F, -1.0F, 1.0F, 1.0F);
      this.field990[5] = new Class7755(1.0F, -1.0F, 1.0F, 1.0F);
      this.field990[6] = new Class7755(1.0F, 1.0F, 1.0F, 1.0F);
      this.field990[7] = new Class7755(-1.0F, 1.0F, 1.0F, 1.0F);

      for (int var11 = 0; var11 < 8; var11++) {
         this.field990[var11].method25709(var10);
         this.field990[var11].method25711();
      }
   }

   public void updateCameraAndRender(MatrixStack matrixStackIn, float var2, long var3, boolean var5, ActiveRenderInfo var6, GameRenderer var7, Class1699 var8, Matrix4f var9) {
      TileEntityRendererDispatcher.instance.method27961(this.world, this.mc.getTextureManager(), this.mc.fontRenderer, var6, this.mc.objectMouseOver);
      this.renderManager.method32213(this.world, var6, this.mc.pointedEntity);
      IProfiler var10 = this.world.getProfiler();
      var10.endStartSection("light_updates");

      //this.mc.world.getChunkProvider().getLightManager().tick(Integer.MAX_VALUE, true, true);

      Vector3d var11 = var6.getPos();
      double var12 = var11.getX();
      double var14 = var11.getY();
      double var16 = var11.getZ();
      Matrix4f var18 = matrixStackIn.getLast().getMatrix();
      var10.endStartSection("culling");
      boolean var19 = this.field989 != null;
      Class7647 var20;
      if (var19) {
         var20 = this.field989;
         var20.method25119(this.field991.field42185, this.field991.field42186, this.field991.field42187);
      } else {
         var20 = new Class7647(var18, var9);
         var20.method25119(var12, var14, var16);
      }

      this.mc.getProfiler().endStartSection("captureFrustum");
      if (this.field988) {
         this.method876(var18, var9, var11.x, var11.y, var11.z, var19 ? new Class7647(var18, var9) : var20);
         this.field988 = false;
      }

      var10.endStartSection("clear");
      if (Config.isShaders()) {
         Shaders.method33045(0, 0, this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight());
      } else {
         RenderSystem.viewport(0, 0, this.mc.getMainWindow().getFramebufferWidth(), this.mc.getMainWindow().getFramebufferHeight());
      }

      FogRenderer.method32584(var6, var2, this.mc.world, this.mc.gameSettings.renderDistanceChunks, var7.method766(var2));
      RenderSystem.clear(16640, Minecraft.IS_RUNNING_ON_MAC);
      boolean var21 = Config.isShaders();
      if (var21) {
         Shaders.method33049();
      }

      if (var21) {
         Shaders.method33050(matrixStackIn, var6, var2);
      }

      var20.field32828 = Config.isShaders() && ! Shaders.method33005();
      float var22 = var7.method767();
      boolean var23 = this.mc.world.func_239132_a_().method19300(MathHelper.floor(var12), MathHelper.floor(var14))
         || this.mc.ingameGUI.getBossOverlay().method5959();
      if ((Config.method26879() || Config.method26880() || Config.method26884()) && ! Shaders.isShadowPass) {
         FogRenderer.method32587(var6, Class2040.field13337, var22, var23, var2);
         var10.endStartSection("sky");
         if (var21) {
            Shaders.method33068();
         }

         this.method888(matrixStackIn, var2);
         if (var21) {
            Shaders.method33072();
         }
      } else {
         GlStateManager.disableBlend();
      }

      var10.endStartSection("fog");
      FogRenderer.method32587(var6, Class2040.field13338, Math.max(var22 - 16.0F, 32.0F), var23, var2);
      var10.endStartSection("terrain_setup");
      this.method940(var6, var20, this.mc.player.isSpectator());
      this.method874(var6, var20, var19, this.field996++, this.mc.player.isSpectator());
      var10.endStartSection("updatechunks");
      byte var24 = 30;
      int var25 = this.mc.gameSettings.framerateLimit;
      long var26 = 33333333L;
      long var28;
      if ((double)var25 == AbstractOption.FRAMERATE_LIMIT.getMaxValue()) {
         var28 = 0L;
      } else {
         var28 = (long)(1000000000 / var25);
      }

      long var30 = Util.nanoTime() - var3;
      long var32 = this.field954.method37554(var30);
      long var34 = var32 * 3L / 2L;
      long var36 = MathHelper.method37776(var34, var28, 33333333L);
      Class8578.field38576.method31034();
      this.method891(var3 + var36);
      Class8578.field38576.method31035();
      var10.endStartSection("terrain");
      Class8578.field38579.method31034();
      if (this.mc.gameSettings.ofSmoothFps) {
         this.mc.getProfiler().endStartSection("finish");
         GL11.glFinish();
         this.mc.getProfiler().endStartSection("terrain");
      }

      if (Config.method26806() && FogRenderer.field40354) {
         GlStateManager.method23889(false);
      }

      this.method880(RenderType.method14300(), matrixStackIn, var12, var14, var16);
      this.mc.getTextureManager().getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).method1130(false, this.mc.gameSettings.field44600 > 0);
      this.method880(RenderType.method14301(), matrixStackIn, var12, var14, var16);
      this.mc.getTextureManager().getTexture(AtlasTexture.LOCATION_BLOCKS_TEXTURE).method1137();
      this.method880(RenderType.method14302(), matrixStackIn, var12, var14, var16);
      if (var21) {
         ShadersRender.method17151();
      }

      Class8578.field38579.method31035();
      if (this.world.func_239132_a_().method19307()) {
         RenderHelper.setupDiffuseGuiLighting(matrixStackIn.getLast().getMatrix());
      } else {
         RenderHelper.setupLevelDiffuseLighting(matrixStackIn.getLast().getMatrix());
      }

      if (var21) {
         Shaders.method33078();
      }

      Class5736.method17918();
      var10.endStartSection("entities");
      field1022++;
      this.field986 = 0;
      this.field987 = 0;
      this.field1016 = 0;
      if (this.field962 != null) {
         this.field962.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
         this.field962.func_237506_a_(this.mc.getFramebuffer());
         this.mc.getFramebuffer().bindFramebuffer(false);
      }

      if (this.field964 != null) {
         this.field964.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
      }

      if (this.isRenderEntityOutlines()) {
         this.entityOutlineFramebuffer.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
         this.mc.getFramebuffer().bindFramebuffer(false);
      }

      boolean flag3 = false;
      Class7735 irendertypebuffer$impl = this.renderTypeTextures.getBufferSource();
      if (Config.isFastRender()) {
         RenderStateManager.enableCache();
      }

      for (Class7002 var41 : this.renderInfosEntities) {
         Class8066 var42 = var41.field30281;
         Chunk var43 = var42.method27740();

         for (Entity var45 : var43.method7146()[var42.method27718().getY() / 16]) {
            if ((this.renderManager.method32218(var45, var20, var12, var14, var16) || var45.method3417(this.mc.player))
               && (var45 != var6.getRenderViewEntity() || var6.method37511() || var6.getRenderViewEntity() instanceof LivingEntity && ((LivingEntity)var6.getRenderViewEntity()).isSleeping())
               && (!(var45 instanceof ClientPlayerEntity) || var6.getRenderViewEntity() == var45)) {
               String var46 = var45.getClass().getName();
               List<Entity> var47 = this.field1026.get(var46);
               if (var47 == null) {
                  var47 = new ArrayList<>();
                  this.field1026.put(var46, var47);
               }

               var47.add(var45);
            }
         }
      }

      for (List<Entity> var58 : this.field1026.values()) {
         for (Entity var65 : var58) {
            this.field986++;
            if (var65.ticksExisted == 0) {
               var65.lastTickPosX = var65.getPosX();
               var65.lastTickPosY = var65.getPosY();
               var65.lastTickPosZ = var65.getPosZ();
            }

            Object var71;
            if (this.isRenderEntityOutlines() && this.mc.isEntityGlowing(var65)) {
               flag3 = true;
               Class7734 var76 = this.renderTypeTextures.method26538();
               var71 = var76;
               int var81 = var65.getTeamColor();
               short var85 = 255;
               int var48 = var81 >> 16 & 0xFF;
               int var49 = var81 >> 8 & 0xFF;
               int var50 = var81 & 0xFF;
               var76.method25599(var48, var49, var50, 255);
            } else {
               var71 = irendertypebuffer$impl;
            }

            this.field1000 = var65;
            if (var21) {
               Shaders.method33079(var65);
            }

            this.method879(var65, var12, var14, var16, var2, matrixStackIn, (Class7733)var71);
            this.field1000 = null;
         }

         var58.clear();
      }

      this.method878(matrixStackIn);
      irendertypebuffer$impl.finish(RenderType.getEntitySolid(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
      irendertypebuffer$impl.finish(RenderType.getEntityCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
      irendertypebuffer$impl.finish(RenderType.getEntityCutoutNoCull(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
      irendertypebuffer$impl.finish(RenderType.getEntitySmoothCutout(AtlasTexture.LOCATION_BLOCKS_TEXTURE));
      if (var21) {
         Shaders.endEntities();
         Shaders.beginBlockEntities();
      }

      var10.endStartSection("blockentities");
      Class5947.method18475();
      boolean var57 = Reflector.field42943.exists();
      Class7647 var59 = var20;

      for (Class7002 var66 : this.renderInfosTileEntities) {
         List<TileEntity> var72 = var66.field30281.method27715().method24111();
         if (!var72.isEmpty()) {
            for (TileEntity var82 : var72) {
               if (var57) {
                  AxisAlignedBB var86 = (AxisAlignedBB) Reflector.call(var82, Reflector.field42943);
                  if (var86 != null && !var59.method25122(var86)) {
                     continue;
                  }
               }

               if (var21) {
                  Shaders.nextBlockEntity(var82);
               }

               BlockPos var88 = var82.getPos();
               Object var89 = irendertypebuffer$impl;
               matrixStackIn.push();
               if (Minecraft.getInstance().shouldTranslate) {
                  matrixStackIn.translate((double)var88.getX() - var12, (double)var88.getY() - var14, (double)var88.getZ() - var16);
               }

               SortedSet var91 = (SortedSet)this.field957.get(var88.toLong());
               if (var91 != null && !var91.isEmpty()) {
                  int var51 = ((Class1995)var91.last()).method8285();
                  if (var51 >= 0) {
                     Class8892 var52 = matrixStackIn.getLast();
                     Class5427 var53 = new Class5427(
                        this.renderTypeTextures.method26537().method25597(ModelBakery.field40518.get(var51)), var52.getMatrix(), var52.method32362()
                     );
                     var89 = (Class7733)var2x -> {
                        IVertexBuilder var3x = irendertypebuffer$impl.method25597(var2x);
                        return var2x.method14355() ? Class7802.method26050(var53, var3x) : var3x;
                     };
                  }
               }

               TileEntityRendererDispatcher.instance.method27962(var82, var2, matrixStackIn, (Class7733)var89);
               matrixStackIn.pop();
               this.field1016++;
            }
         }
      }

      synchronized (this.field946) {
         for (TileEntity var73 : this.field946) {
            if (var57) {
               AxisAlignedBB var78 = (AxisAlignedBB) Reflector.call(var73, Reflector.field42943);
               if (var78 != null && !var59.method25122(var78)) {
                  continue;
               }
            }

            if (var21) {
               Shaders.nextBlockEntity(var73);
            }

            BlockPos var83 = var73.getPos();
            matrixStackIn.push();
            matrixStackIn.translate((double)var83.getX() - var12, (double)var83.getY() - var14, (double)var83.getZ() - var16);
            TileEntityRendererDispatcher.instance.method27962(var73, var2, matrixStackIn, irendertypebuffer$impl);
            matrixStackIn.pop();
            this.field1016++;
         }
      }

      this.method878(matrixStackIn);
      irendertypebuffer$impl.finish(RenderType.method14300());
      irendertypebuffer$impl.finish(Class8624.method30906());
      irendertypebuffer$impl.finish(Class8624.method30907());
      irendertypebuffer$impl.finish(Class8624.method30902());
      irendertypebuffer$impl.finish(Class8624.method30903());
      irendertypebuffer$impl.finish(Class8624.method30904());
      irendertypebuffer$impl.finish(Class8624.method30905());
      irendertypebuffer$impl.finish(Class8624.method30900());
      this.renderTypeTextures.method26538().method25600();
      if (Config.isFastRender()) {
         RenderStateManager.method32259();
      }

      if (flag3) {
         this.field960.method6526(var2);
         this.mc.getFramebuffer().bindFramebuffer(false);
      }

      if (var21) {
         Shaders.method33093();
      }

      this.field1019 = true;
      var10.endStartSection("destroyProgress");
      ObjectIterator var63 = this.field957.long2ObjectEntrySet().iterator();

      while (var63.hasNext()) {
         Entry var68 = (Entry)var63.next();
         BlockPos var74 = BlockPos.fromLong(var68.getLongKey());
         double var79 = (double)var74.getX() - var12;
         double var87 = (double)var74.getY() - var14;
         double var90 = (double)var74.getZ() - var16;
         if (!(var79 * var79 + var87 * var87 + var90 * var90 > 1024.0)) {
            SortedSet var92 = (SortedSet)var68.getValue();
            if (var92 != null && !var92.isEmpty()) {
               int var93 = ((Class1995)var92.last()).method8285();
               matrixStackIn.push();
               matrixStackIn.translate((double)var74.getX() - var12, (double)var74.getY() - var14, (double)var74.getZ() - var16);
               Class8892 var94 = matrixStackIn.getLast();
               Class5427 var54 = new Class5427(
                  this.renderTypeTextures.method26537().method25597(ModelBakery.field40518.get(var93)), var94.getMatrix(), var94.method32362()
               );
               this.mc.getBlockRendererDispatcher().method807(this.world.getBlockState(var74), var74, this.world, matrixStackIn, var54);
               matrixStackIn.pop();
            }
         }
      }

      this.field1019 = false;
      field1022--;
      this.method878(matrixStackIn);
      RayTraceResult var64 = this.mc.objectMouseOver;
      if (var5 && var64 != null && var64.getType() == RayTraceResult.Type.BLOCK) {
         var10.endStartSection("outline");
         BlockPos var69 = ((BlockRayTraceResult)var64).getPos();
         BlockState var75 = this.world.getBlockState(var69);
         boolean var80;
         if (Reflector.field42830.exists() && Reflector.field42882.exists()) {
            var80 = !Reflector.callBoolean(Reflector.field42882, this, var6, var64, var2, matrixStackIn, irendertypebuffer$impl)
               && !Reflector.method35064(var75, Reflector.field42830, this.world, var69)
               && this.world.getWorldBorder().contains(var69);
         } else {
            var80 = !var75.isAir() && this.world.getWorldBorder().contains(var69);
         }

         if (var80) {
            IVertexBuilder var84 = irendertypebuffer$impl.method25597(RenderType.getLines());
            this.method894(matrixStackIn, var84, var6.getRenderViewEntity(), var12, var14, var16, var69, var75);
         }

         if (var21) {
            irendertypebuffer$impl.finish(RenderType.getLines());
         }
      } else if (var64 != null && var64.getType() == RayTraceResult.Type.ENTITY) {
         Reflector.field42882.call(this, var6, var64, var2, matrixStackIn, irendertypebuffer$impl);
      }

      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(matrixStackIn.getLast().getMatrix());
      boolean var70 = GlStateManager.method23868();
      GlStateManager.method23780();
      this.mc.debugRenderer.method27453(matrixStackIn, irendertypebuffer$impl, var12, var14, var16);
      GlStateManager.method23869(var70);
      RenderSystem.popMatrix();
      irendertypebuffer$impl.finish(Class8624.method30909());
      irendertypebuffer$impl.finish(Class8624.method30900());
      irendertypebuffer$impl.finish(Class8624.method30901());
      irendertypebuffer$impl.finish(RenderType.method14331());
      irendertypebuffer$impl.finish(RenderType.method14332());
      irendertypebuffer$impl.finish(RenderType.method14334());
      irendertypebuffer$impl.finish(RenderType.method14335());
      irendertypebuffer$impl.finish(RenderType.method14333());
      irendertypebuffer$impl.finish(RenderType.method14336());
      irendertypebuffer$impl.finish(RenderType.method14337());
      irendertypebuffer$impl.finish(RenderType.method14328());
      this.renderTypeTextures.method26537().finish();
      if (var21) {
         irendertypebuffer$impl.finish();
         Shaders.method33100();
         ShadersRender.method17154(var7, matrixStackIn, var6, var2);
         Shaders.method33101();
      }

      if (this.field966 != null) {
         irendertypebuffer$impl.finish(RenderType.getLines());
         irendertypebuffer$impl.finish();
         this.field961.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
         this.field961.func_237506_a_(this.mc.getFramebuffer());
         var10.endStartSection("translucent");
         this.method880(RenderType.method14304(), matrixStackIn, var12, var14, var16);
         var10.endStartSection("string");
         this.method880(RenderType.method14343(), matrixStackIn, var12, var14, var16);
         this.field963.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
         this.field963.func_237506_a_(this.mc.getFramebuffer());
         Class4510.field21779.method14231();
         var10.endStartSection("particles");
         this.mc.particles.method1204(matrixStackIn, irendertypebuffer$impl, var8, var6, var2, var20);
         Class4510.field21779.method14232();
      } else {
         var10.endStartSection("translucent");
         if (var21) {
            Shaders.method33102();
         }

         this.method880(RenderType.method14304(), matrixStackIn, var12, var14, var16);
         if (var21) {
            Shaders.method33103();
         }

         irendertypebuffer$impl.finish(RenderType.getLines());
         irendertypebuffer$impl.finish();
         var10.endStartSection("string");
         this.method880(RenderType.method14343(), matrixStackIn, var12, var14, var16);
         var10.endStartSection("particles");
         if (var21) {
            Shaders.method33095();
         }

         this.mc.particles.method1204(matrixStackIn, irendertypebuffer$impl, var8, var6, var2, var20);
         if (var21) {
            Shaders.method33096();
         }
      }

      GlStateManager.method23889(true);
      RenderSystem.pushMatrix();
      RenderSystem.multMatrix(matrixStackIn.getLast().getMatrix());
      if (this.mc.gameSettings.method37153() != CloudOption.OFF) {
         if (this.field966 != null) {
            this.field965.framebufferClear(Minecraft.IS_RUNNING_ON_MAC);
            Class4510.field21781.method14231();
            var10.endStartSection("clouds");
            this.method889(matrixStackIn, var2, var12, var14, var16);
            Class4510.field21781.method14232();
         } else {
            var10.endStartSection("clouds");
            this.method889(matrixStackIn, var2, var12, var14, var16);
         }
      }

      if (this.field966 != null) {
         Class4510.field21780.method14231();
         var10.endStartSection("weather");
         this.method855(var8, var2, var12, var14, var16);
         this.method892(var6);
         Class4510.field21780.method14232();
         this.field966.method6526(var2);
         this.mc.getFramebuffer().bindFramebuffer(false);
      } else {
         RenderSystem.depthMask(false);
         if (Config.isShaders()) {
            GlStateManager.depthMask(Shaders.method33002());
         }

         var10.endStartSection("weather");
         if (var21) {
            Shaders.method33098();
         }

         this.method855(var8, var2, var12, var14, var16);
         if (var21) {
            Shaders.method33099();
         }

         this.method892(var6);
         RenderSystem.depthMask(true);
      }

      this.method882(var6);
      RenderSystem.shadeModel(7424);
      RenderSystem.depthMask(true);
      RenderSystem.disableBlend();
      RenderSystem.popMatrix();
      FogRenderer.resetFog();
   }

   public void method878(MatrixStack var1) {
      if (!var1.method35297()) {
         throw new IllegalStateException("Pose stack not empty");
      }
   }

   public void method879(Entity var1, double var2, double var4, double var6, float var8, MatrixStack var9, Class7733 var10) {
      double var11 = MathHelper.lerp((double)var8, var1.lastTickPosX, var1.getPosX());
      double var13 = MathHelper.lerp((double)var8, var1.lastTickPosY, var1.getPosY());
      double var15 = MathHelper.lerp((double)var8, var1.lastTickPosZ, var1.getPosZ());
      float var17 = MathHelper.lerp(var8, var1.prevRotationYaw, var1.rotationYaw);
      this.renderManager.renderEntityStatic(var1, var11 - var2, var13 - var4, var15 - var6, var17, var8, var9, var10, this.renderManager.method32208(var1, var8));
   }

   public void method880(RenderType var1, MatrixStack var2, double var3, double var5, double var7) {
      var1.method14231();
      boolean var9 = Config.isShaders();
      if (var1 == RenderType.method14304() && ! Shaders.isShadowPass) {
         this.mc.getProfiler().startSection("translucent_sort");
         double var10 = var3 - this.field992;
         double var12 = var5 - this.field993;
         double var14 = var7 - this.field994;
         if (var10 * var10 + var12 * var12 + var14 * var14 > 1.0) {
            this.field992 = var3;
            this.field993 = var5;
            this.field994 = var7;
            int var16 = 0;
            this.field1001.clear();
            ObjectListIterator var17 = this.field945.iterator();

            while (var17.hasNext()) {
               Class7002 var18 = (Class7002)var17.next();
               if (var16 < 15 && var18.field30281.method27715().method24113(var1)) {
                  this.field1001.add(var18.field30281);
                  var16++;
               }
            }
         }

         this.mc.getProfiler().endSection();
      }

      this.mc.getProfiler().startSection("filterempty");
      if (var9) {
         ShadersRender.method17162(var1);
      }

      boolean var29 = SmartAnimations.isActive();
      RenderSystem.pushMatrix();
      RenderSystem.loadIdentity();
      RenderSystem.multMatrix(var2.getLast().getMatrix());
      this.mc.getProfiler().method22507(() -> "render_" + var1);
      boolean var11 = var1 != RenderType.method14304();
      ObjectListIterator<Class7002> var30 = this.field945.listIterator(var11 ? 0 : this.field945.size());
      if (Config.isRenderRegions()) {
         int var31 = Integer.MIN_VALUE;
         int var33 = Integer.MIN_VALUE;
         Class8836 var34 = null;
         Map<Class7126, Map<Class8836,  List<Class1698>>> var36 = this.field1027.computeIfAbsent(var1, var0 -> new LinkedHashMap<>(16));
         Map var38 = null;
         List<Class1698> var39 = null;

         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            Class7002 var19 = var11 ? var30.next() : var30.previous();
            Class8066 var20 = var19.field30281;
            if (!var20.method27715().method24110(var1)) {
               Class1698 var21 = var20.method27711(var1);
               Class8836 var22 = var21.method7310();
               if (var20.field34624 != var31 || var20.field34625 != var33) {
                  Class7126 var23 = Class7126.method22234(var20.field34624, var20.field34625);
                  var38 = (Map) var36.computeIfAbsent(var23, var0 -> new LinkedHashMap<>(8));
                  var31 = var20.field34624;
                  var33 = var20.field34625;
                  var34 = null;
               }

               if (var22 != var34) {
                  var39 = (List<Class1698>) var38.computeIfAbsent(var22, var0 -> new ArrayList<>());
                  var34 = var22;
               }

               var39.add(var21);
               if (SmartAnimations.isActive()) {
                  BitSet var44 = var20.method27715().method24112(var1);
                  if (var44 != null) {
                     SmartAnimations.method14216(var44);
                  }
               }
            }
         }

         for (java.util.Map.Entry<Class7126, Map<Class8836,  List<Class1698>>> var41 : var36.entrySet()) {
            Class7126 var42 = var41.getKey();
            Map<Class8836,  List<Class1698>> var43 = var41.getValue();

            for (java.util.Map.Entry<Class8836,  List<Class1698>> var24 : var43.entrySet()) {
               Class8836 var25 = var24.getKey();
               List<Class1698> var26 = var24.getValue();

               for (Class1698 var28 : var26) {
                  var28.method7307(7);
               }

               this.method881(var42.method22235(), 0, var42.method22236(), var3, var5, var7, var25);
               var26.clear();
            }
         }
      } else {
         while (var11 ? var30.hasNext() : var30.hasPrevious()) {
            Class7002 var13 = var11 ? (Class7002)var30.next() : (Class7002)var30.previous();
            Class8066 var32 = var13.field30281;
            if (!var32.method27715().method24110(var1)) {
               Class1698 var15 = var32.method27711(var1);
               GlStateManager.pushMatrix();
               BlockPos var35 = var32.method27718();
               GlStateManager.translated((double)var35.getX() - var3, (double)var35.getY() - var5, (double)var35.getZ() - var7);
               var15.method7302();
               DefaultVertexFormats.field43334.method26218(0L);
               GlStateManager.method23890();
               if (var9) {
                  ShadersRender.method17166();
               }

               var15.method7307(7);
               GlStateManager.popMatrix();
               if (var29) {
                  BitSet var37 = var32.method27715().method24112(var1);
                  if (var37 != null) {
                     SmartAnimations.method14216(var37);
                  }
               }
            }
         }
      }

      GlStateManager.method23891();
      RenderSystem.popMatrix();
      Class1698.method7308();
      RenderSystem.clearCurrentColor();
      DefaultVertexFormats.field43334.method26219();
      this.mc.getProfiler().endSection();
      if (var9) {
         ShadersRender.method17163(var1);
      }

      var1.method14232();
   }

   private void method881(int var1, int var2, int var3, double var4, double var6, double var8, Class8836 var10) {
      GlStateManager.pushMatrix();
      GlStateManager.translated((double)var1 - var4, (double)var2 - var6, (double)var3 - var8);
      var10.method31986();
      GlStateManager.method23890();
      GlStateManager.popMatrix();
   }

   private void method882(ActiveRenderInfo var1) {
      Tessellator var2 = Tessellator.getInstance();
      BufferBuilder var3 = var2.getBuffer();
      if (this.mc.debugWireframe || this.mc.debugChunkPath) {
         double var4 = var1.getPos().getX();
         double var6 = var1.getPos().getY();
         double var8 = var1.getPos().getZ();
         RenderSystem.depthMask(true);
         RenderSystem.disableCull();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableTexture();

         for (ObjectListIterator var10 = this.field945.iterator(); var10.hasNext(); RenderSystem.popMatrix()) {
            Class7002 var11 = (Class7002)var10.next();
            Class8066 var12 = var11.field30281;
            RenderSystem.pushMatrix();
            BlockPos var13 = var12.method27718();
            RenderSystem.translated((double)var13.getX() - var4, (double)var13.getY() - var6, (double)var13.getZ() - var8);
            if (this.mc.debugWireframe) {
               var3.begin(1, DefaultVertexFormats.POSITION_COLOR);
               RenderSystem.lineWidth(10.0F);
               int var14 = Class7002.method21718(var11) == 0 ? 0 : MathHelper.method37818((float)Class7002.method21718(var11) / 50.0F, 0.9F, 0.9F);
               int var15 = var14 >> 16 & 0xFF;
               int var16 = var14 >> 8 & 0xFF;
               int var17 = var14 & 0xFF;
               Direction var18 = Class7002.method21716(var11);
               if (var18 != null) {
                  var3.pos(8.0, 8.0, 8.0).color(var15, var16, var17, 255).endVertex();
                  var3.pos((double)(8 - 16 * var18.getXOffset()), (double)(8 - 16 * var18.getYOffset()), (double)(8 - 16 * var18.getZOffset()))
                     .color(var15, var16, var17, 255)
                     .endVertex();
               }

               var2.draw();
               RenderSystem.lineWidth(1.0F);
            }

            if (this.mc.debugChunkPath && !var12.method27715().method24109()) {
               var3.begin(1, DefaultVertexFormats.POSITION_COLOR);
               RenderSystem.lineWidth(10.0F);
               int var24 = 0;

               for (Direction var30 : field938) {
                  for (Direction var22 : field938) {
                     boolean var23 = var12.method27715().method24107(var30, var22);
                     if (!var23) {
                        var24++;
                        var3.pos((double)(8 + 8 * var30.getXOffset()), (double)(8 + 8 * var30.getYOffset()), (double)(8 + 8 * var30.getZOffset()))
                           .color(1, 0, 0, 1)
                           .endVertex();
                        var3.pos((double)(8 + 8 * var22.getXOffset()), (double)(8 + 8 * var22.getYOffset()), (double)(8 + 8 * var22.getZOffset()))
                           .color(1, 0, 0, 1)
                           .endVertex();
                     }
                  }
               }

               var2.draw();
               RenderSystem.lineWidth(1.0F);
               if (var24 > 0) {
                  var3.begin(7, DefaultVertexFormats.POSITION_COLOR);
                  float var26 = 0.5F;
                  float var28 = 0.2F;
                  var3.pos(0.5, 15.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 15.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 15.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 15.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 0.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 0.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 0.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 0.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 15.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 15.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 0.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 0.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 0.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 0.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 15.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 15.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 0.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 0.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 15.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 15.5, 0.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 15.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 15.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(15.5, 0.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var3.pos(0.5, 0.5, 15.5).color(0.9F, 0.9F, 0.0F, 0.2F).endVertex();
                  var2.draw();
               }
            }
         }

         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
      }

      if (this.field989 != null) {
         RenderSystem.disableCull();
         RenderSystem.disableTexture();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.lineWidth(10.0F);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(
            (float)(this.field991.field42185 - var1.getPos().x),
            (float)(this.field991.field42186 - var1.getPos().y),
            (float)(this.field991.field42187 - var1.getPos().z)
         );
         RenderSystem.depthMask(true);
         var3.begin(7, DefaultVertexFormats.POSITION_COLOR);
         this.method884(var3, 0, 1, 2, 3, 0, 1, 1);
         this.method884(var3, 4, 5, 6, 7, 1, 0, 0);
         this.method884(var3, 0, 1, 5, 4, 1, 1, 0);
         this.method884(var3, 2, 3, 7, 6, 0, 0, 1);
         this.method884(var3, 0, 4, 7, 3, 0, 1, 0);
         this.method884(var3, 1, 5, 6, 2, 1, 0, 1);
         var2.draw();
         RenderSystem.depthMask(false);
         var3.begin(1, DefaultVertexFormats.field43341);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         this.method883(var3, 0);
         this.method883(var3, 1);
         this.method883(var3, 1);
         this.method883(var3, 2);
         this.method883(var3, 2);
         this.method883(var3, 3);
         this.method883(var3, 3);
         this.method883(var3, 0);
         this.method883(var3, 4);
         this.method883(var3, 5);
         this.method883(var3, 5);
         this.method883(var3, 6);
         this.method883(var3, 6);
         this.method883(var3, 7);
         this.method883(var3, 7);
         this.method883(var3, 4);
         this.method883(var3, 0);
         this.method883(var3, 4);
         this.method883(var3, 1);
         this.method883(var3, 5);
         this.method883(var3, 2);
         this.method883(var3, 6);
         this.method883(var3, 3);
         this.method883(var3, 7);
         var2.draw();
         RenderSystem.popMatrix();
         RenderSystem.depthMask(true);
         RenderSystem.disableBlend();
         RenderSystem.enableCull();
         RenderSystem.enableTexture();
         RenderSystem.lineWidth(1.0F);
      }
   }

   private void method883(IVertexBuilder var1, int var2) {
      var1.pos((double)this.field990[var2].method25701(), (double)this.field990[var2].method25702(), (double)this.field990[var2].method25703())
         .endVertex();
   }

   private void method884(IVertexBuilder var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      float var9 = 0.25F;
      var1.pos((double)this.field990[var2].method25701(), (double)this.field990[var2].method25702(), (double)this.field990[var2].method25703())
         .color((float)var6, (float)var7, (float)var8, 0.25F)
         .endVertex();
      var1.pos((double)this.field990[var3].method25701(), (double)this.field990[var3].method25702(), (double)this.field990[var3].method25703())
         .color((float)var6, (float)var7, (float)var8, 0.25F)
         .endVertex();
      var1.pos((double)this.field990[var4].method25701(), (double)this.field990[var4].method25702(), (double)this.field990[var4].method25703())
         .color((float)var6, (float)var7, (float)var8, 0.25F)
         .endVertex();
      var1.pos((double)this.field990[var5].method25701(), (double)this.field990[var5].method25702(), (double)this.field990[var5].method25703())
         .color((float)var6, (float)var7, (float)var8, 0.25F)
         .endVertex();
   }

   public void tick() {
      this.field955++;
      if (this.field955 % 20 == 0) {
         ObjectIterator var1 = this.field956.values().iterator();

         while (var1.hasNext()) {
            Class1995 var2 = (Class1995)var1.next();
            int var3 = var2.method8287();
            if (this.field955 - var3 > 400) {
               var1.remove();
               this.method886(var2);
            }
         }
      }

      if (Config.isRenderRegions() && this.field955 % 20 == 0) {
         this.field1027.clear();
      }
   }

   private void method886(Class1995 var1) {
      long var2 = var1.method8283().toLong();
      Set var4 = (Set)this.field957.get(var2);
      var4.remove(var1);
      if (var4.isEmpty()) {
         this.field957.remove(var2);
      }
   }

   private void method887(MatrixStack var1) {
      if (Config.method26879()) {
         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.depthMask(false);
         this.field940.bindTexture(field934);
         Tessellator var2 = Tessellator.getInstance();
         BufferBuilder var3 = var2.getBuffer();

         for (int var4 = 0; var4 < 6; var4++) {
            var1.push();
            if (var4 == 1) {
               var1.rotate(Vector3f.XP.rotationDegrees(90.0F));
            }

            if (var4 == 2) {
               var1.rotate(Vector3f.XP.rotationDegrees(-90.0F));
            }

            if (var4 == 3) {
               var1.rotate(Vector3f.XP.rotationDegrees(180.0F));
            }

            if (var4 == 4) {
               var1.rotate(Vector3f.ZP.rotationDegrees(90.0F));
            }

            if (var4 == 5) {
               var1.rotate(Vector3f.ZP.rotationDegrees(-90.0F));
            }

            Matrix4f var5 = var1.getLast().getMatrix();
            var3.begin(7, DefaultVertexFormats.POSITION_TEX_COLOR);
            int var6 = 40;
            int var7 = 40;
            int var8 = 40;
            if (Config.method26911()) {
               Vector3d var9 = new Vector3d((double)var6 / 255.0, (double)var7 / 255.0, (double)var8 / 255.0);
               var9 = Class9680.method37877(var9, this.world, this.mc.getRenderViewEntity(), 0.0F);
               var6 = (int)(var9.x * 255.0);
               var7 = (int)(var9.y * 255.0);
               var8 = (int)(var9.z * 255.0);
            }

            var3.pos(var5, -100.0F, -100.0F, -100.0F).tex(0.0F, 0.0F).color(var6, var7, var8, 255).endVertex();
            var3.pos(var5, -100.0F, -100.0F, 100.0F).tex(0.0F, 16.0F).color(var6, var7, var8, 255).endVertex();
            var3.pos(var5, 100.0F, -100.0F, 100.0F).tex(16.0F, 16.0F).color(var6, var7, var8, 255).endVertex();
            var3.pos(var5, 100.0F, -100.0F, -100.0F).tex(16.0F, 0.0F).color(var6, var7, var8, 255).endVertex();
            var2.draw();
            var1.pop();
         }

         RenderSystem.depthMask(true);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
      }
   }

   public void method888(MatrixStack var1, float var2) {
      if (Reflector.field42947.exists()) {
         Class9797 var3 = (Class9797) Reflector.call(this.world.func_239132_a_(), Reflector.field42947);
         if (var3 != null) {
            var3.method38636(this.field955, var2, var1, this.world, this.mc);
            return;
         }
      }

      if (this.mc.world.func_239132_a_().method19305() == DimensionRenderInfo.FogType.END) {
         this.method887(var1);
      } else if (this.mc.world.func_239132_a_().method19305() == DimensionRenderInfo.FogType.NORMAL) {
         RenderSystem.disableTexture();
         boolean var20 = Config.isShaders();
         if (var20) {
            Shaders.method33116();
         }

         Vector3d var4 = this.world.method6873(this.mc.gameRenderer.getActiveRenderInfo().getBlockPos(), var2);
         var4 = Class9680.method37869(
            var4,
            this.mc.world,
            this.mc.getRenderViewEntity().getPosX(),
            this.mc.getRenderViewEntity().getPosY() + 1.0,
            this.mc.getRenderViewEntity().getPosZ()
         );
         if (var20) {
            Shaders.method33069(var4);
         }

         float var5 = (float)var4.x;
         float var6 = (float)var4.y;
         float var7 = (float)var4.z;
         FogRenderer.method32588();
         BufferBuilder var8 = Tessellator.getInstance().getBuffer();
         RenderSystem.depthMask(false);
         RenderSystem.method27840();
         if (var20) {
            Shaders.method33121();
         }

         RenderSystem.color3f(var5, var6, var7);
         if (var20) {
            Shaders.method33071(var1);
         }

         if (Config.method26879()) {
            this.field950.method7302();
            this.field948.method26218(0L);
            this.field950.method7306(var1.getLast().getMatrix(), 7);
            Class1698.method7308();
            this.field948.method26219();
         }

         RenderSystem.method27841();
         if (var20) {
            Shaders.method33122();
         }

         RenderSystem.disableAlphaTest();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         float[] var9 = this.world.func_239132_a_().func_230492_a_(this.world.method7001(var2), var2);
         if (var9 != null && Config.method26880()) {
            RenderSystem.disableTexture();
            if (var20) {
               Shaders.method33116();
            }

            RenderSystem.shadeModel(7425);
            var1.push();
            var1.rotate(Vector3f.XP.rotationDegrees(90.0F));
            float var10 = MathHelper.sin(this.world.method6750(var2)) < 0.0F ? 180.0F : 0.0F;
            var1.rotate(Vector3f.ZP.rotationDegrees(var10));
            var1.rotate(Vector3f.ZP.rotationDegrees(90.0F));
            float var11 = var9[0];
            float var12 = var9[1];
            float var13 = var9[2];
            Matrix4f var14 = var1.getLast().getMatrix();
            var8.begin(6, DefaultVertexFormats.POSITION_COLOR);
            var8.pos(var14, 0.0F, 100.0F, 0.0F).color(var11, var12, var13, var9[3]).endVertex();
            int var15 = 16;

            for (int var16 = 0; var16 <= 16; var16++) {
               float var17 = (float)var16 * (float) (Math.PI * 2) / 16.0F;
               float var18 = MathHelper.sin(var17);
               float var19 = MathHelper.cos(var17);
               var8.pos(var14, var18 * 120.0F, var19 * 120.0F, -var19 * 40.0F * var9[3]).color(var9[0], var9[1], var9[2], 0.0F).endVertex();
            }

            var8.finishDrawing();
            WorldVertexBufferUploader.draw(var8);
            var1.pop();
            RenderSystem.shadeModel(7424);
         }

         RenderSystem.enableTexture();
         if (var20) {
            Shaders.method33115();
         }

         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12927, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
         var1.push();
         float var22 = 1.0F - this.world.method6792(var2);
         RenderSystem.color4f(1.0F, 1.0F, 1.0F, var22);
         var1.rotate(Vector3f.YP.rotationDegrees(-90.0F));
         Class8862.method32263(this.world, this.field940, var1, var2);
         if (var20) {
            Shaders.method33054(var1);
         }

         var1.rotate(Vector3f.XP.rotationDegrees(this.world.method7001(var2) * 360.0F));
         if (var20) {
            Shaders.method33055(var1);
         }

         Matrix4f var23 = var1.getLast().getMatrix();
         float var24 = 30.0F;
         if (Config.method26881()) {
            this.field940.bindTexture(field932);
            var8.begin(7, DefaultVertexFormats.field43344);
            var8.pos(var23, -var24, 100.0F, -var24).tex(0.0F, 0.0F).endVertex();
            var8.pos(var23, var24, 100.0F, -var24).tex(1.0F, 0.0F).endVertex();
            var8.pos(var23, var24, 100.0F, var24).tex(1.0F, 1.0F).endVertex();
            var8.pos(var23, -var24, 100.0F, var24).tex(0.0F, 1.0F).endVertex();
            var8.finishDrawing();
            WorldVertexBufferUploader.draw(var8);
         }

         var24 = 20.0F;
         if (Config.method26882()) {
            this.field940.bindTexture(field931);
            int var26 = this.world.method7002();
            int var28 = var26 % 4;
            int var30 = var26 / 4 % 2;
            float var31 = (float)(var28 + 0) / 4.0F;
            float var34 = (float)(var30 + 0) / 2.0F;
            float var35 = (float)(var28 + 1) / 4.0F;
            float var36 = (float)(var30 + 1) / 2.0F;
            var8.begin(7, DefaultVertexFormats.field43344);
            var8.pos(var23, -var24, -100.0F, var24).tex(var35, var36).endVertex();
            var8.pos(var23, var24, -100.0F, var24).tex(var31, var36).endVertex();
            var8.pos(var23, var24, -100.0F, -var24).tex(var31, var34).endVertex();
            var8.pos(var23, -var24, -100.0F, -var24).tex(var35, var34).endVertex();
            var8.finishDrawing();
            WorldVertexBufferUploader.draw(var8);
         }

         RenderSystem.disableTexture();
         if (var20) {
            Shaders.method33116();
         }

         float var27 = this.world.method6875(var2) * var22;
         if (var27 > 0.0F && Config.method26884() && !Class8862.method32264(this.world)) {
            RenderSystem.color4f(var27, var27, var27, var27);
            this.field949.method7302();
            this.field948.method26218(0L);
            this.field949.method7306(var1.getLast().getMatrix(), 7);
            Class1698.method7308();
            this.field948.method26219();
         }

         RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
         RenderSystem.disableBlend();
         RenderSystem.enableAlphaTest();
         RenderSystem.method27840();
         if (var20) {
            Shaders.method33121();
         }

         var1.pop();
         RenderSystem.disableTexture();
         if (var20) {
            Shaders.method33116();
         }

         RenderSystem.color3f(0.0F, 0.0F, 0.0F);
         double var29 = this.mc.player.getEyePosition(var2).y - this.world.getWorldInfo().method20052();
         boolean var32 = false;
         if (var29 < 0.0) {
            var1.push();
            var1.translate(0.0, 12.0, 0.0);
            this.field951.method7302();
            this.field948.method26218(0L);
            this.field951.method7306(var1.getLast().getMatrix(), 7);
            Class1698.method7308();
            this.field948.method26219();
            var1.pop();
            var32 = true;
         }

         if (this.world.func_239132_a_().method19304()) {
            RenderSystem.color3f(var5 * 0.2F + 0.04F, var6 * 0.2F + 0.04F, var7 * 0.6F + 0.1F);
         } else {
            RenderSystem.color3f(var5, var6, var7);
         }

         RenderSystem.enableTexture();
         RenderSystem.depthMask(true);
         RenderSystem.method27841();
      }
   }

   public void method889(MatrixStack var1, float var2, double var3, double var5, double var7) {
      if (!Config.method26823()) {
         if (Reflector.field42946.exists()) {
            Class8098 var9 = (Class8098) Reflector.call(this.world.func_239132_a_(), Reflector.field42946);
            if (var9 != null) {
               var9.method28052(this.field955, var2, var1, this.world, this.mc, var3, var5, var7);
               return;
            }
         }

         float var31 = this.world.func_239132_a_().method19303();
         if (!Float.isNaN(var31)) {
            if (Config.isShaders()) {
               Shaders.method33076();
            }

            RenderSystem.disableCull();
            RenderSystem.enableBlend();
            RenderSystem.enableAlphaTest();
            RenderSystem.enableDepthTest();
            RenderSystem.method27939();
            RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ONE, DestFactor.field12932);
            RenderSystem.method27840();
            RenderSystem.depthMask(true);
            float var10 = 12.0F;
            float var11 = 4.0F;
            double var12 = 2.0E-4;
            double var14 = (double)(((float)this.field955 + var2) * 0.03F);
            double var16 = (var3 + var14) / 12.0;
            double var18 = (double)(var31 - (float)var5 + 0.33F);
            var18 += this.mc.gameSettings.field44691 * 128.0;
            double var20 = var7 / 12.0 + 0.33F;
            var16 -= (double)(MathHelper.floor(var16 / 2048.0) * 2048);
            var20 -= (double)(MathHelper.floor(var20 / 2048.0) * 2048);
            float var22 = (float)(var16 - (double) MathHelper.floor(var16));
            float var23 = (float)(var18 / 4.0 - (double) MathHelper.floor(var18 / 4.0)) * 4.0F;
            float var24 = (float)(var20 - (double) MathHelper.floor(var20));
            Vector3d var25 = this.world.method6874(var2);
            int var26 = (int)Math.floor(var16);
            int var27 = (int)Math.floor(var18 / 4.0);
            int var28 = (int)Math.floor(var20);
            if (var26 != this.field978
               || var27 != this.field979
               || var28 != this.field980
               || this.mc.gameSettings.method37153() != this.field982
               || this.field981.squareDistanceTo(var25) > 2.0E-4) {
               this.field978 = var26;
               this.field979 = var27;
               this.field980 = var28;
               this.field981 = var25;
               this.field982 = this.mc.gameSettings.method37153();
               this.field952 = true;
            }

            if (this.field952) {
               this.field952 = false;
               BufferBuilder var29 = Tessellator.getInstance().getBuffer();
               if (this.field953 != null) {
                  this.field953.close();
               }

               this.field953 = new Class1698(DefaultVertexFormats.field43349);
               this.method890(var29, var16, var18, var20, var25);
               var29.finishDrawing();
               this.field953.method7303(var29);
            }

            this.field940.bindTexture(field933);
            var1.push();
            var1.scale(12.0F, 1.0F, 12.0F);
            var1.translate((double)(-var22), (double)var23, (double)(-var24));
            if (this.field953 != null) {
               this.field953.method7302();
               DefaultVertexFormats.field43349.method26218(0L);
               int var35 = this.field982 == CloudOption.field11186 ? 0 : 1;

               for (int var30 = var35; var30 < 2; var30++) {
                  if (var30 == 0) {
                     RenderSystem.colorMask(false, false, false, false);
                  } else {
                     RenderSystem.colorMask(true, true, true, true);
                  }

                  this.field953.method7306(var1.getLast().getMatrix(), 7);
               }

               Class1698.method7308();
               DefaultVertexFormats.field43349.method26219();
            }

            var1.pop();
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.disableAlphaTest();
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
            RenderSystem.method27841();
            if (Config.isShaders()) {
               Shaders.method33077();
            }
         }
      }
   }

   private void method890(BufferBuilder var1, double var2, double var4, double var6, Vector3d var8) {
      float var9 = 4.0F;
      float var10 = 0.00390625F;
      int var11 = 8;
      int var12 = 4;
      float var13 = 9.765625E-4F;
      float var14 = (float) MathHelper.floor(var2) * 0.00390625F;
      float var15 = (float) MathHelper.floor(var6) * 0.00390625F;
      float var16 = (float)var8.x;
      float var17 = (float)var8.y;
      float var18 = (float)var8.z;
      float var19 = var16 * 0.9F;
      float var20 = var17 * 0.9F;
      float var21 = var18 * 0.9F;
      float var22 = var16 * 0.7F;
      float var23 = var17 * 0.7F;
      float var24 = var18 * 0.7F;
      float var25 = var16 * 0.8F;
      float var26 = var17 * 0.8F;
      float var27 = var18 * 0.8F;
      var1.begin(7, DefaultVertexFormats.field43349);
      float var28 = (float)Math.floor(var4 / 4.0) * 4.0F;
      if (Config.method26822()) {
         for (int var29 = -3; var29 <= 4; var29++) {
            for (int var30 = -3; var30 <= 4; var30++) {
               float var31 = (float)(var29 * 8);
               float var32 = (float)(var30 * 8);
               if (var28 > -5.0F) {
                  var1.pos((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .color(var22, var23, var24, 0.8F)
                     .method17030(0.0F, -1.0F, 0.0F)
                     .endVertex();
                  var1.pos((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                     .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .color(var22, var23, var24, 0.8F)
                     .method17030(0.0F, -1.0F, 0.0F)
                     .endVertex();
                  var1.pos((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .color(var22, var23, var24, 0.8F)
                     .method17030(0.0F, -1.0F, 0.0F)
                     .endVertex();
                  var1.pos((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                     .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .color(var22, var23, var24, 0.8F)
                     .method17030(0.0F, -1.0F, 0.0F)
                     .endVertex();
               }

               if (var28 <= 5.0F) {
                  var1.pos((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .color(var16, var17, var18, 0.8F)
                     .method17030(0.0F, 1.0F, 0.0F)
                     .endVertex();
                  var1.pos((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 8.0F))
                     .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                     .color(var16, var17, var18, 0.8F)
                     .method17030(0.0F, 1.0F, 0.0F)
                     .endVertex();
                  var1.pos((double)(var31 + 8.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .color(var16, var17, var18, 0.8F)
                     .method17030(0.0F, 1.0F, 0.0F)
                     .endVertex();
                  var1.pos((double)(var31 + 0.0F), (double)(var28 + 4.0F - 9.765625E-4F), (double)(var32 + 0.0F))
                     .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                     .color(var16, var17, var18, 0.8F)
                     .method17030(0.0F, 1.0F, 0.0F)
                     .endVertex();
               }

               if (var29 > -1) {
                  for (int var33 = 0; var33 < 8; var33++) {
                     var1.pos((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .tex((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(-1.0F, 0.0F, 0.0F)
                        .endVertex();
                     var1.pos((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .tex((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(-1.0F, 0.0F, 0.0F)
                        .endVertex();
                     var1.pos((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .tex((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(-1.0F, 0.0F, 0.0F)
                        .endVertex();
                     var1.pos((double)(var31 + (float)var33 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .tex((var31 + (float)var33 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(-1.0F, 0.0F, 0.0F)
                        .endVertex();
                  }
               }

               if (var29 <= 1) {
                  for (int var38 = 0; var38 < 8; var38++) {
                     var1.pos((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 8.0F))
                        .tex((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(1.0F, 0.0F, 0.0F)
                        .endVertex();
                     var1.pos((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 8.0F))
                        .tex((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 8.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(1.0F, 0.0F, 0.0F)
                        .endVertex();
                     var1.pos((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 4.0F), (double)(var32 + 0.0F))
                        .tex((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(1.0F, 0.0F, 0.0F)
                        .endVertex();
                     var1.pos((double)(var31 + (float)var38 + 1.0F - 9.765625E-4F), (double)(var28 + 0.0F), (double)(var32 + 0.0F))
                        .tex((var31 + (float)var38 + 0.5F) * 0.00390625F + var14, (var32 + 0.0F) * 0.00390625F + var15)
                        .color(var19, var20, var21, 0.8F)
                        .method17030(1.0F, 0.0F, 0.0F)
                        .endVertex();
                  }
               }

               if (var30 > -1) {
                  for (int var39 = 0; var39 < 8; var39++) {
                     var1.pos((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, -1.0F)
                        .endVertex();
                     var1.pos((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var39 + 0.0F))
                        .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, -1.0F)
                        .endVertex();
                     var1.pos((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, -1.0F)
                        .endVertex();
                     var1.pos((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var39 + 0.0F))
                        .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var39 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, -1.0F)
                        .endVertex();
                  }
               }

               if (var30 <= 1) {
                  for (int var40 = 0; var40 < 8; var40++) {
                     var1.pos((double)(var31 + 0.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, 1.0F)
                        .endVertex();
                     var1.pos((double)(var31 + 8.0F), (double)(var28 + 4.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, 1.0F)
                        .endVertex();
                     var1.pos((double)(var31 + 8.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .tex((var31 + 8.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, 1.0F)
                        .endVertex();
                     var1.pos((double)(var31 + 0.0F), (double)(var28 + 0.0F), (double)(var32 + (float)var40 + 1.0F - 9.765625E-4F))
                        .tex((var31 + 0.0F) * 0.00390625F + var14, (var32 + (float)var40 + 0.5F) * 0.00390625F + var15)
                        .color(var25, var26, var27, 0.8F)
                        .method17030(0.0F, 0.0F, 1.0F)
                        .endVertex();
                  }
               }
            }
         }
      } else {
         boolean var34 = true;
         int var35 = 32;

         for (int var36 = -32; var36 < 32; var36 += 32) {
            for (int var37 = -32; var37 < 32; var37 += 32) {
               var1.pos((double)(var36 + 0), (double)var28, (double)(var37 + 32))
                  .tex((float)(var36 + 0) * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .color(var16, var17, var18, 0.8F)
                  .method17030(0.0F, -1.0F, 0.0F)
                  .endVertex();
               var1.pos((double)(var36 + 32), (double)var28, (double)(var37 + 32))
                  .tex((float)(var36 + 32) * 0.00390625F + var14, (float)(var37 + 32) * 0.00390625F + var15)
                  .color(var16, var17, var18, 0.8F)
                  .method17030(0.0F, -1.0F, 0.0F)
                  .endVertex();
               var1.pos((double)(var36 + 32), (double)var28, (double)(var37 + 0))
                  .tex((float)(var36 + 32) * 0.00390625F + var14, (float)(var37 + 0) * 0.00390625F + var15)
                  .color(var16, var17, var18, 0.8F)
                  .method17030(0.0F, -1.0F, 0.0F)
                  .endVertex();
               var1.pos((double)(var36 + 0), (double)var28, (double)(var37 + 0))
                  .tex((float)(var36 + 0) * 0.00390625F + var14, (float)(var37 + 0) * 0.00390625F + var15)
                  .color(var16, var17, var18, 0.8F)
                  .method17030(0.0F, -1.0F, 0.0F)
                  .endVertex();
            }
         }
      }
   }

   public void method891(long var1) {
      var1 = (long)((double)var1 + 1.0E8);
      this.field995 = this.field995 | this.field983.method33323();
      long var3 = Util.nanoTime();
      boolean var5 = false;
      if (this.field1002.size() > 0) {
         Iterator var6 = this.field1002.iterator();

         while (var6.hasNext()) {
            Class8066 var7 = (Class8066)var6.next();
            if (!this.field983.method33335(var7)) {
               break;
            }

            var7.method27720();
            var6.remove();
            this.chunksToUpdate.remove(var7);
            this.field1001.remove(var7);
         }
      }

      if (this.field1001.size() > 0) {
         Iterator var16 = this.field1001.iterator();
         if (var16.hasNext()) {
            Class8066 var18 = (Class8066)var16.next();
            if (this.field983.method33336(var18)) {
               var16.remove();
            }
         }
      }

      double var17 = 0.0;
      int var8 = Config.method26816();
      if (!this.chunksToUpdate.isEmpty()) {
         Iterator var9 = this.chunksToUpdate.iterator();

         while (var9.hasNext()) {
            Class8066 var10 = (Class8066)var9.next();
            boolean var11 = var10.method27742();
            boolean var12;
            if (!var10.method27722() && !var11) {
               var12 = this.field983.method33335(var10);
            } else {
               var12 = this.field983.method33334(var10);
            }

            if (!var12) {
               break;
            }

            var10.method27720();
            var9.remove();
            if (!var11) {
               double var13 = 2.0 * Class9333.method35300(var10);
               var17 += var13;
               if (var17 > (double)var8) {
                  break;
               }
            }
         }
      }
   }

   private void method892(ActiveRenderInfo var1) {
      BufferBuilder var2 = Tessellator.getInstance().getBuffer();
      WorldBorder var3 = this.world.getWorldBorder();
      double var4 = (double)(this.mc.gameSettings.renderDistanceChunks * 16);
      if (!(var1.getPos().x < var3.method24532() - var4)
         || !(var1.getPos().x > var3.method24530() + var4)
         || !(var1.getPos().z < var3.method24533() - var4)
         || !(var1.getPos().z > var3.method24531() + var4)) {
         if (Config.isShaders()) {
            Shaders.method33117();
            Shaders.method33021(Shaders.field40819);
         }

         double var6 = 1.0 - var3.method24528(var1.getPos().x, var1.getPos().z) / var4;
         var6 = Math.pow(var6, 4.0);
         double var8 = var1.getPos().x;
         double var10 = var1.getPos().y;
         double var12 = var1.getPos().z;
         RenderSystem.enableBlend();
         RenderSystem.enableDepthTest();
         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12927, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
         this.field940.bindTexture(field935);
         RenderSystem.depthMask(Minecraft.isFabulousGraphicsEnabled());
         RenderSystem.pushMatrix();
         int var14 = var3.method24529().method8765();
         float var15 = (float)(var14 >> 16 & 0xFF) / 255.0F;
         float var16 = (float)(var14 >> 8 & 0xFF) / 255.0F;
         float var17 = (float)(var14 & 0xFF) / 255.0F;
         RenderSystem.color4f(var15, var16, var17, (float)var6);
         RenderSystem.method27856(-3.0F, -3.0F);
         RenderSystem.method27852();
         RenderSystem.method27939();
         RenderSystem.enableAlphaTest();
         RenderSystem.disableCull();
         float var18 = (float)(Util.milliTime() % 3000L) / 3000.0F;
         float var19 = 0.0F;
         float var20 = 0.0F;
         float var21 = 128.0F;
         var2.begin(7, DefaultVertexFormats.field43344);
         double var22 = Math.max((double) MathHelper.floor(var12 - var4), var3.method24531());
         double var24 = Math.min((double) MathHelper.method37774(var12 + var4), var3.method24533());
         if (var8 > var3.method24532() - var4) {
            float var26 = 0.0F;

            for (double var27 = var22; var27 < var24; var26 += 0.5F) {
               double var29 = Math.min(1.0, var24 - var27);
               float var31 = (float)var29 * 0.5F;
               this.method893(var2, var8, var10, var12, var3.method24532(), 256, var27, var18 + var26, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var3.method24532(), 256, var27 + var29, var18 + var31 + var26, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var3.method24532(), 0, var27 + var29, var18 + var31 + var26, var18 + 128.0F);
               this.method893(var2, var8, var10, var12, var3.method24532(), 0, var27, var18 + var26, var18 + 128.0F);
               var27++;
            }
         }

         if (var8 < var3.method24530() + var4) {
            float var35 = 0.0F;

            for (double var38 = var22; var38 < var24; var35 += 0.5F) {
               double var41 = Math.min(1.0, var24 - var38);
               float var44 = (float)var41 * 0.5F;
               this.method893(var2, var8, var10, var12, var3.method24530(), 256, var38, var18 + var35, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var3.method24530(), 256, var38 + var41, var18 + var44 + var35, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var3.method24530(), 0, var38 + var41, var18 + var44 + var35, var18 + 128.0F);
               this.method893(var2, var8, var10, var12, var3.method24530(), 0, var38, var18 + var35, var18 + 128.0F);
               var38++;
            }
         }

         var22 = Math.max((double) MathHelper.floor(var8 - var4), var3.method24530());
         var24 = Math.min((double) MathHelper.method37774(var8 + var4), var3.method24532());
         if (var12 > var3.method24533() - var4) {
            float var36 = 0.0F;

            for (double var39 = var22; var39 < var24; var36 += 0.5F) {
               double var42 = Math.min(1.0, var24 - var39);
               float var45 = (float)var42 * 0.5F;
               this.method893(var2, var8, var10, var12, var39, 256, var3.method24533(), var18 + var36, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var39 + var42, 256, var3.method24533(), var18 + var45 + var36, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var39 + var42, 0, var3.method24533(), var18 + var45 + var36, var18 + 128.0F);
               this.method893(var2, var8, var10, var12, var39, 0, var3.method24533(), var18 + var36, var18 + 128.0F);
               var39++;
            }
         }

         if (var12 < var3.method24531() + var4) {
            float var37 = 0.0F;

            for (double var40 = var22; var40 < var24; var37 += 0.5F) {
               double var43 = Math.min(1.0, var24 - var40);
               float var46 = (float)var43 * 0.5F;
               this.method893(var2, var8, var10, var12, var40, 256, var3.method24531(), var18 + var37, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var40 + var43, 256, var3.method24531(), var18 + var46 + var37, var18 + 0.0F);
               this.method893(var2, var8, var10, var12, var40 + var43, 0, var3.method24531(), var18 + var46 + var37, var18 + 128.0F);
               this.method893(var2, var8, var10, var12, var40, 0, var3.method24531(), var18 + var37, var18 + 128.0F);
               var40++;
            }
         }

         var2.finishDrawing();
         WorldVertexBufferUploader.draw(var2);
         RenderSystem.enableCull();
         RenderSystem.disableAlphaTest();
         RenderSystem.method27856(0.0F, 0.0F);
         RenderSystem.method27853();
         RenderSystem.enableAlphaTest();
         RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
         RenderSystem.disableBlend();
         RenderSystem.popMatrix();
         RenderSystem.depthMask(true);
         if (Config.isShaders()) {
            Shaders.method33118();
         }
      }
   }

   private void method893(BufferBuilder var1, double var2, double var4, double var6, double var8, int var10, double var11, float var13, float var14) {
      var1.pos(var8 - var2, (double)var10 - var4, var11 - var6).tex(var13, var14).endVertex();
   }

   private void method894(MatrixStack var1, IVertexBuilder var2, Entity var3, double var4, double var6, double var8, BlockPos var10, BlockState var11) {
      method896(
         var1,
         var2,
         var11.method23413(this.world, var10, ISelectionContext.forEntity(var3)),
         (double)var10.getX() - var4,
         (double)var10.getY() - var6,
         (double)var10.getZ() - var8,
         0.0F,
         0.0F,
         0.0F,
         0.4F
      );
   }

   public static void method895(
           MatrixStack var0, IVertexBuilder var1, VoxelShape var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12
   ) {
      List var13 = var2.method19521();
      int var14 = MathHelper.method37774((double)var13.size() / 3.0);

      for (int var15 = 0; var15 < var13.size(); var15++) {
         AxisAlignedBB var16 = (AxisAlignedBB)var13.get(var15);
         float var17 = ((float)var15 % (float)var14 + 1.0F) / (float)var14;
         float var18 = (float)(var15 / var14);
         float var19 = var17 * (float)(var18 == 0.0F ? 1 : 0);
         float var20 = var17 * (float)(var18 == 1.0F ? 1 : 0);
         float var21 = var17 * (float)(var18 == 2.0F ? 1 : 0);
         method896(var0, var1, VoxelShapes.create(var16.offset(0.0, 0.0, 0.0)), var3, var5, var7, var19, var20, var21, 1.0F);
      }
   }

   private static void method896(
           MatrixStack var0, IVertexBuilder var1, VoxelShape var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12
   ) {
      Matrix4f var13 = var0.getLast().getMatrix();
      var2.method19519((var12x, var14, var16, var18, var20, var22) -> {
         var1.pos(var13, (float)(var12x + var3), (float)(var14 + var5), (float)(var16 + var7)).color(var9, var10, var11, var12).endVertex();
         var1.pos(var13, (float)(var18 + var3), (float)(var20 + var5), (float)(var22 + var7)).color(var9, var10, var11, var12).endVertex();
      });
   }

   public static void method897(MatrixStack var0, IVertexBuilder var1, AxisAlignedBB var2, float var3, float var4, float var5, float var6) {
      method899(
         var0,
         var1,
         var2.minX,
         var2.minY,
         var2.minZ,
         var2.maxX,
         var2.maxY,
         var2.maxZ,
         var3,
         var4,
         var5,
         var6,
         var3,
         var4,
         var5
      );
   }

   public static void method898(
      MatrixStack var0,
      IVertexBuilder var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      float var17
   ) {
      method899(var0, var1, var2, var4, var6, var8, var10, var12, var14, var15, var16, var17, var14, var15, var16);
   }

   public static void method899(
      MatrixStack var0,
      IVertexBuilder var1,
      double var2,
      double var4,
      double var6,
      double var8,
      double var10,
      double var12,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20
   ) {
      Matrix4f var21 = var0.getLast().getMatrix();
      float var22 = (float)var2;
      float var23 = (float)var4;
      float var24 = (float)var6;
      float var25 = (float)var8;
      float var26 = (float)var10;
      float var27 = (float)var12;
      var1.pos(var21, var22, var23, var24).color(var14, var19, var20, var17).endVertex();
      var1.pos(var21, var25, var23, var24).color(var14, var19, var20, var17).endVertex();
      var1.pos(var21, var22, var23, var24).color(var18, var15, var20, var17).endVertex();
      var1.pos(var21, var22, var26, var24).color(var18, var15, var20, var17).endVertex();
      var1.pos(var21, var22, var23, var24).color(var18, var19, var16, var17).endVertex();
      var1.pos(var21, var22, var23, var27).color(var18, var19, var16, var17).endVertex();
      var1.pos(var21, var25, var23, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var26, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var26, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var26, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var26, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var26, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var26, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var23, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var23, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var23, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var23, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var23, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var22, var26, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var26, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var23, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var26, var27).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var26, var24).color(var14, var15, var16, var17).endVertex();
      var1.pos(var21, var25, var26, var27).color(var14, var15, var16, var17).endVertex();
   }

   public static void method900(
           BufferBuilder var0, double var1, double var3, double var5, double var7, double var9, double var11, float var13, float var14, float var15, float var16
   ) {
      var0.pos(var1, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var3, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var1, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var5).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var11).color(var13, var14, var15, var16).endVertex();
      var0.pos(var7, var9, var11).color(var13, var14, var15, var16).endVertex();
   }

   public void method901(IBlockReader var1, BlockPos var2, BlockState var3, BlockState var4, int var5) {
      this.method902(var2, false);
   }

   private void method902(BlockPos var1, boolean var2) {
      for (int var3 = var1.getZ() - 1; var3 <= var1.getZ() + 1; var3++) {
         for (int var4 = var1.getX() - 1; var4 <= var1.getX() + 1; var4++) {
            for (int var5 = var1.getY() - 1; var5 <= var1.getY() + 1; var5++) {
               this.method907(var4 >> 4, var5 >> 4, var3 >> 4, var2);
            }
         }
      }
   }

   public void method903(int var1, int var2, int var3, int var4, int var5, int var6) {
      for (int var7 = var3 - 1; var7 <= var6 + 1; var7++) {
         for (int var8 = var1 - 1; var8 <= var4 + 1; var8++) {
            for (int var9 = var2 - 1; var9 <= var5 + 1; var9++) {
               this.markForRerender(var8 >> 4, var9 >> 4, var7 >> 4);
            }
         }
      }
   }

   public void method904(BlockPos var1, BlockState var2, BlockState var3) {
      if (this.mc.getModelManager().method1026(var2, var3)) {
         this.method903(var1.getX(), var1.getY(), var1.getZ(), var1.getX(), var1.getY(), var1.getZ());
      }
   }

   public void method905(int var1, int var2, int var3) {
      for (int var4 = var3 - 1; var4 <= var3 + 1; var4++) {
         for (int var5 = var1 - 1; var5 <= var1 + 1; var5++) {
            for (int var6 = var2 - 1; var6 <= var2 + 1; var6++) {
               this.markForRerender(var5, var6, var4);
            }
         }
      }
   }

   public void markForRerender(int var1, int var2, int var3) {
      this.method907(var1, var2, var3, false);
   }

   private void method907(int var1, int var2, int var3, boolean var4) {
      this.viewFrustum.method34760(var1, var2, var3, var4);
   }

   public void method908(SoundEvent var1, BlockPos var2) {
      this.method909(var1, var2, var1 == null ? null : Class3283.method11814(var1));
   }

   public void method909(SoundEvent var1, BlockPos var2, Class3283 var3) {
      Class6340 var4 = this.field958.get(var2);
      if (var4 != null) {
         this.mc.getSoundHandler().method1009(var4);
         this.field958.remove(var2);
      }

      if (var1 != null) {
         Class3283 var5 = Class3283.method11814(var1);
         if (Reflector.field42969.method20245()) {
            var5 = var3;
         }

         if (var5 != null) {
            this.mc.ingameGUI.method5984(var5.method11813());
         }

         MinecraftSoundManager var6 = MinecraftSoundManager.method19295(var1, (double)var2.getX(), (double)var2.getY(), (double)var2.getZ());
         this.field958.put(var2, var6);
         this.mc.getSoundHandler().method1000(var6);
      }

      this.method910(this.world, var2, var1 != null);
   }

   private void method910(World var1, BlockPos var2, boolean var3) {
      for (LivingEntity var5 : var1.<LivingEntity>getEntitiesWithinAABB(LivingEntity.class, new AxisAlignedBB(var2).grow(3.0))) {
         var5.setPartying(var2, var3);
      }
   }

   public void method911(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.method912(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   public void method912(IParticleData var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      try {
         this.method915(var1, var2, var3, var4, var6, var8, var10, var12, var14);
      } catch (Throwable var19) {
         CrashReport var17 = CrashReport.makeCrashReport(var19, "Exception while adding particle");
         CrashReportCategory var18 = var17.makeCategory("Particle being added");
         var18.addDetail("ID", Registry.PARTICLE_TYPE.getKey(var1.getType()));
         var18.addDetail("Parameters", var1.getParameters());
         var18.addDetail("Position", () -> CrashReportCategory.getCoordinateInfo(var4, var6, var8));
         throw new ReportedException(var17);
      }
   }

   private <T extends IParticleData> void method913(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.method911(var1, var1.getType().method24006(), var2, var4, var6, var8, var10, var12);
   }

   @Nullable
   private Class4587 method914(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      return this.method915(var1, var2, false, var3, var5, var7, var9, var11, var13);
   }

   @Nullable
   private Class4587 method915(IParticleData var1, boolean var2, boolean var3, double var4, double var6, double var8, double var10, double var12, double var14) {
      ActiveRenderInfo var16 = this.mc.gameRenderer.getActiveRenderInfo();
      if (this.mc != null && var16.method37510() && this.mc.particles != null) {
         ParticleStatus var17 = this.method916(var3);
         if (var1 == ParticleTypes.field34069 && !Config.method26842()) {
            return null;
         } else if (var1 == ParticleTypes.field34070 && !Config.method26842()) {
            return null;
         } else if (var1 == ParticleTypes.POOF && !Config.method26842()) {
            return null;
         } else if (var1 == ParticleTypes.field34098 && !Config.method26846()) {
            return null;
         } else if (var1 == ParticleTypes.field34092 && !Config.method26844()) {
            return null;
         } else if (var1 == ParticleTypes.field34085 && !Config.method26844()) {
            return null;
         } else if (var1 == ParticleTypes.field34068 && !Config.method26849()) {
            return null;
         } else if (var1 == ParticleTypes.field34048 && !Config.method26849()) {
            return null;
         } else if (var1 == ParticleTypes.field34063 && !Config.method26849()) {
            return null;
         } else if (var1 == ParticleTypes.field34081 && !Config.method26849()) {
            return null;
         } else if (var1 == ParticleTypes.field34100 && !Config.method26849()) {
            return null;
         } else if (var1 == ParticleTypes.field34090 && !Config.method26848()) {
            return null;
         } else if (var1 == ParticleTypes.field34074 && !Config.method26843()) {
            return null;
         } else if (var1 == ParticleTypes.field34075 && !Config.method26843()) {
            return null;
         } else if (var1 == ParticleTypes.field34062 && !Config.method26841()) {
            return null;
         } else if (var1 == ParticleTypes.field34060 && !Config.method26897()) {
            return null;
         } else if (var1 == ParticleTypes.field34057 && !Config.method26897()) {
            return null;
         } else if (var1 == ParticleTypes.field34072 && !Config.method26850()) {
            return null;
         } else {
            if (!var2) {
               double var18 = 1024.0;
               if (var1 == ParticleTypes.CRIT) {
                  var18 = 38416.0;
               }

               if (var16.getPos().method11343(var4, var6, var8) > var18) {
                  return null;
               }

               if (var17 == ParticleStatus.field15248) {
                  return null;
               }
            }

            Class4587 var20 = this.mc.particles.method1197(var1, var4, var6, var8, var10, var12, var14);
            if (var1 == ParticleTypes.BUBBLE) {
               Class9680.method37864(var20, this.world, var4, var6, var8, this.renderEnv);
            }

            if (var1 == ParticleTypes.field34099) {
               Class9680.method37864(var20, this.world, var4, var6, var8, this.renderEnv);
            }

            if (var1 == ParticleTypes.field34091) {
               Class9680.method37864(var20, this.world, var4, var6, var8, this.renderEnv);
            }

            if (var1 == ParticleTypes.field34087) {
               Class9680.method37857(var20);
            }

            if (var1 == ParticleTypes.field34090) {
               Class9680.method37856(var20);
            }

            if (var1 == ParticleTypes.field34062) {
               Class9680.method37859(var20, this.world, var4, var6, var8);
            }

            return var20;
         }
      } else {
         return null;
      }
   }

   private ParticleStatus method916(boolean var1) {
      ParticleStatus var2 = this.mc.gameSettings.particles;
      if (var1 && var2 == ParticleStatus.field15248 && this.world.rand.nextInt(10) == 0) {
         var2 = ParticleStatus.field15247;
      }

      if (var2 == ParticleStatus.field15247 && this.world.rand.nextInt(3) == 0) {
         var2 = ParticleStatus.field15248;
      }

      return var2;
   }

   public void deleteAllDisplayLists() {
   }

   public void method918(int var1, BlockPos var2, int var3) {
      switch (var1) {
         case 1023:
         case 1028:
         case 1038:
            ActiveRenderInfo var4 = this.mc.gameRenderer.getActiveRenderInfo();
            if (var4.method37510()) {
               double var5 = (double)var2.getX() - var4.getPos().x;
               double var7 = (double)var2.getY() - var4.getPos().y;
               double var9 = (double)var2.getZ() - var4.getPos().z;
               double var11 = Math.sqrt(var5 * var5 + var7 * var7 + var9 * var9);
               double var13 = var4.getPos().x;
               double var15 = var4.getPos().y;
               double var17 = var4.getPos().z;
               if (var11 > 0.0) {
                  var13 += var5 / var11 * 2.0;
                  var15 += var7 / var11 * 2.0;
                  var17 += var9 / var11 * 2.0;
               }

               if (var1 == 1023) {
                  this.world.playSound(var13, var15, var17, SoundEvents.field27248, SoundCategory.field14733, 1.0F, 1.0F, false);
               } else if (var1 == 1038) {
                  this.world.playSound(var13, var15, var17, SoundEvents.field26558, SoundCategory.field14733, 1.0F, 1.0F, false);
               } else {
                  this.world.playSound(var13, var15, var17, SoundEvents.field26537, SoundCategory.field14733, 5.0F, 1.0F, false);
               }
            }
      }
   }

   public void method919(PlayerEntity var1, int var2, BlockPos var3, int var4) {
      Random var5 = this.world.rand;
      switch (var2) {
         case 1000:
            this.world.method6858(var3, SoundEvents.field26495, SoundCategory.field14732, 1.0F, 1.0F, false);
            break;
         case 1001:
            this.world.method6858(var3, SoundEvents.field26496, SoundCategory.field14732, 1.0F, 1.2F, false);
            break;
         case 1002:
            this.world.method6858(var3, SoundEvents.field26497, SoundCategory.field14732, 1.0F, 1.2F, false);
            break;
         case 1003:
            this.world.method6858(var3, SoundEvents.field26544, SoundCategory.field14734, 1.0F, 1.2F, false);
            break;
         case 1004:
            this.world.method6858(var3, SoundEvents.field26578, SoundCategory.field14734, 1.0F, 1.2F, false);
            break;
         case 1005:
            this.world.method6858(var3, SoundEvents.field26699, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1006:
            this.world.method6858(var3, SoundEvents.field27259, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1007:
            this.world.method6858(var3, SoundEvents.field27261, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1008:
            this.world.method6858(var3, SoundEvents.field26571, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1009:
            this.world.method6858(var3, SoundEvents.field26582, SoundCategory.field14732, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);
            break;
         case 1010:
            if (Item.getItemById(var4) instanceof Class3283) {
               if (Reflector.field42969.method20245()) {
                  this.method909(((Class3283) Item.getItemById(var4)).method11815(), var3, (Class3283) Item.getItemById(var4));
               } else {
                  this.method908(((Class3283) Item.getItemById(var4)).method11815(), var3);
               }
            } else {
               this.method908((SoundEvent)null, var3);
            }
            break;
         case 1011:
            this.world.method6858(var3, SoundEvents.field26698, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1012:
            this.world.method6858(var3, SoundEvents.field27258, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1013:
            this.world.method6858(var3, SoundEvents.field27260, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1014:
            this.world.method6858(var3, SoundEvents.field26570, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1015:
            this.world.method6858(var3, SoundEvents.field26621, SoundCategory.field14733, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1016:
            this.world.method6858(var3, SoundEvents.field26620, SoundCategory.field14733, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1017:
            this.world.method6858(var3, SoundEvents.field26542, SoundCategory.field14733, 10.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1018:
            this.world.method6858(var3, SoundEvents.field26406, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1019:
            this.world.method6858(var3, SoundEvents.field27283, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1020:
            this.world.method6858(var3, SoundEvents.field27284, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1021:
            this.world.method6858(var3, SoundEvents.field27285, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1022:
            this.world.method6858(var3, SoundEvents.field27240, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1024:
            this.world.method6858(var3, SoundEvents.field27243, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1025:
            this.world.method6858(var3, SoundEvents.field26384, SoundCategory.field14734, 0.05F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1026:
            this.world.method6858(var3, SoundEvents.field27293, SoundCategory.field14733, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1027:
            this.world.method6858(var3, SoundEvents.field27300, SoundCategory.field14734, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1029:
            this.world.method6858(var3, SoundEvents.field26341, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1030:
            this.world.method6858(var3, SoundEvents.field26347, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1031:
            this.world.method6858(var3, SoundEvents.field26344, SoundCategory.field14732, 0.3F, this.world.rand.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1032:
            this.mc.getSoundHandler().method1000(MinecraftSoundManager.method19296(SoundEvents.field26977, var5.nextFloat() * 0.4F + 0.8F, 0.25F));
            break;
         case 1033:
            this.world.method6858(var3, SoundEvents.field26456, SoundCategory.field14732, 1.0F, 1.0F, false);
            break;
         case 1034:
            this.world.method6858(var3, SoundEvents.field26455, SoundCategory.field14732, 1.0F, 1.0F, false);
            break;
         case 1035:
            this.world.method6858(var3, SoundEvents.field26420, SoundCategory.field14732, 1.0F, 1.0F, false);
            break;
         case 1036:
            this.world.method6858(var3, SoundEvents.field26706, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1037:
            this.world.method6858(var3, SoundEvents.field26707, SoundCategory.field14732, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1039:
            this.world.method6858(var3, SoundEvents.field26919, SoundCategory.field14733, 0.3F, this.world.rand.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1040:
            this.world.method6858(var3, SoundEvents.field27286, SoundCategory.field14734, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1041:
            this.world.method6858(var3, SoundEvents.field26687, SoundCategory.field14734, 2.0F, (var5.nextFloat() - var5.nextFloat()) * 0.2F + 1.0F, false);
            break;
         case 1042:
            this.world.method6858(var3, SoundEvents.field26642, SoundCategory.field14732, 1.0F, this.world.rand.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1043:
            this.world.method6858(var3, SoundEvents.field26414, SoundCategory.field14732, 1.0F, this.world.rand.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1044:
            this.world.method6858(var3, SoundEvents.field27106, SoundCategory.field14732, 1.0F, this.world.rand.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 1500:
            Class3475.method12164(this.world, var3, var4 > 0);
            break;
         case 1501:
            this.world.method6858(var3, SoundEvents.field26726, SoundCategory.field14732, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var40 = 0; var40 < 8; var40++) {
               this.world
                  .addParticle(
                     ParticleTypes.field34085,
                     (double)var3.getX() + var5.nextDouble(),
                     (double)var3.getY() + 1.2,
                     (double)var3.getZ() + var5.nextDouble(),
                     0.0,
                     0.0,
                     0.0
                  );
            }
            break;
         case 1502:
            this.world.method6858(var3, SoundEvents.field27011, SoundCategory.field14732, 0.5F, 2.6F + (var5.nextFloat() - var5.nextFloat()) * 0.8F, false);

            for (int var39 = 0; var39 < 5; var39++) {
               double var42 = (double)var3.getX() + var5.nextDouble() * 0.6 + 0.2;
               double var44 = (double)var3.getY() + var5.nextDouble() * 0.6 + 0.2;
               double var45 = (double)var3.getZ() + var5.nextDouble() * 0.6 + 0.2;
               this.world.addParticle(ParticleTypes.field34092, var42, var44, var45, 0.0, 0.0, 0.0);
            }
            break;
         case 1503:
            this.world.method6858(var3, SoundEvents.field26557, SoundCategory.field14732, 1.0F, 1.0F, false);

            for (int var38 = 0; var38 < 16; var38++) {
               double var41 = (double)var3.getX() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               double var43 = (double)var3.getY() + 0.8125;
               double var11 = (double)var3.getZ() + (5.0 + var5.nextDouble() * 6.0) / 16.0;
               this.world.addParticle(ParticleTypes.field34092, var41, var43, var11, 0.0, 0.0, 0.0);
            }
            break;
         case 2000:
            Direction var6 = Direction.byIndex(var4);
            int var7 = var6.getXOffset();
            int var8 = var6.getYOffset();
            int var9 = var6.getZOffset();
            double var10 = (double)var3.getX() + (double)var7 * 0.6 + 0.5;
            double var12 = (double)var3.getY() + (double)var8 * 0.6 + 0.5;
            double var14 = (double)var3.getZ() + (double)var9 * 0.6 + 0.5;

            for (int var46 = 0; var46 < 10; var46++) {
               double var48 = var5.nextDouble() * 0.2 + 0.01;
               double var50 = var10 + (double)var7 * 0.01 + (var5.nextDouble() - 0.5) * (double)var9 * 0.5;
               double var51 = var12 + (double)var8 * 0.01 + (var5.nextDouble() - 0.5) * (double)var8 * 0.5;
               double var53 = var14 + (double)var9 * 0.01 + (var5.nextDouble() - 0.5) * (double)var7 * 0.5;
               double var54 = (double)var7 * var48 + var5.nextGaussian() * 0.01;
               double var55 = (double)var8 * var48 + var5.nextGaussian() * 0.01;
               double var62 = (double)var9 * var48 + var5.nextGaussian() * 0.01;
               this.method913(ParticleTypes.field34092, var50, var51, var53, var54, var55, var62);
            }
            break;
         case 2001:
            BlockState var16 = Block.method11536(var4);
            if (!ReflectorForge.method37050(var16, this.world, var3)) {
               SoundType var47 = var16.getSoundType();
               if (Reflector.field42827.exists()) {
                  var47 = (SoundType) Reflector.call(var16, Reflector.field42827, this.world, var3, null);
               }

               this.world
                  .method6858(var3, var47.getBreakSound(), SoundCategory.field14732, (var47.getVolume() + 1.0F) / 2.0F, var47.getPitch() * 0.8F, false);
            }

            this.mc.particles.method1206(var3, var16);
            break;
         case 2002:
         case 2007:
            Vector3d var17 = Vector3d.method11330(var3);

            for (int var18 = 0; var18 < 8; var18++) {
               this.method913(
                  new Class7438(ParticleTypes.field34082, new ItemStack(Items.SPLASH_POTION)),
                  var17.x,
                  var17.y,
                  var17.z,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            float var49 = (float)(var4 >> 16 & 0xFF) / 255.0F;
            float var19 = (float)(var4 >> 8 & 0xFF) / 255.0F;
            float var20 = (float)(var4 >> 0 & 0xFF) / 255.0F;
            Class7435 var21 = var2 == 2007 ? ParticleTypes.field34081 : ParticleTypes.field34063;

            for (int var52 = 0; var52 < 100; var52++) {
               double var23 = var5.nextDouble() * 4.0;
               double var25 = var5.nextDouble() * Math.PI * 2.0;
               double var27 = Math.cos(var25) * var23;
               double var61 = 0.01 + var5.nextDouble() * 0.5;
               double var64 = Math.sin(var25) * var23;
               Class4587 var66 = this.method914(
                  var21,
                  var21.getType().method24006(),
                  var17.x + var27 * 0.1,
                  var17.y + 0.3,
                  var17.z + var64 * 0.1,
                  var27,
                  var61,
                  var64
               );
               if (var66 != null) {
                  float var34 = 0.75F + var5.nextFloat() * 0.25F;
                  var66.method14514(var49 * var34, var19 * var34, var20 * var34);
                  var66.method14513((float)var23);
               }
            }

            this.world.method6858(var3, SoundEvents.field27123, SoundCategory.field14734, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            break;
         case 2003:
            double var22 = (double)var3.getX() + 0.5;
            double var24 = (double)var3.getY();
            double var26 = (double)var3.getZ() + 0.5;

            for (int var58 = 0; var58 < 8; var58++) {
               this.method913(
                  new Class7438(ParticleTypes.field34082, new ItemStack(Items.field37979)),
                  var22,
                  var24,
                  var26,
                  var5.nextGaussian() * 0.15,
                  var5.nextDouble() * 0.2,
                  var5.nextGaussian() * 0.15
               );
            }

            for (double var59 = 0.0; var59 < Math.PI * 2; var59 += Math.PI / 20) {
               this.method913(
                  ParticleTypes.field34090,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -5.0,
                  0.0,
                  Math.sin(var59) * -5.0
               );
               this.method913(
                  ParticleTypes.field34090,
                  var22 + Math.cos(var59) * 5.0,
                  var24 - 0.4,
                  var26 + Math.sin(var59) * 5.0,
                  Math.cos(var59) * -7.0,
                  0.0,
                  Math.sin(var59) * -7.0
               );
            }
            break;
         case 2004:
            for (int var57 = 0; var57 < 20; var57++) {
               double var60 = (double)var3.getX() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               double var63 = (double)var3.getY() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               double var65 = (double)var3.getZ() + 0.5 + (var5.nextDouble() - 0.5) * 2.0;
               this.world.addParticle(ParticleTypes.field34092, var60, var63, var65, 0.0, 0.0, 0.0);
               this.world.addParticle(ParticleTypes.field34074, var60, var63, var65, 0.0, 0.0, 0.0);
            }
            break;
         case 2005:
            Class3336.method11885(this.world, var3, var4);
            break;
         case 2006:
            for (int var56 = 0; var56 < 200; var56++) {
               float var29 = var5.nextFloat() * 4.0F;
               float var30 = var5.nextFloat() * (float) (Math.PI * 2);
               double var31 = (double)(MathHelper.cos(var30) * var29);
               double var33 = 0.01 + var5.nextDouble() * 0.5;
               double var35 = (double)(MathHelper.sin(var30) * var29);
               Class4587 var37 = this.method914(
                  ParticleTypes.field34056,
                  false,
                  (double)var3.getX() + var31 * 0.1,
                  (double)var3.getY() + 0.3,
                  (double)var3.getZ() + var35 * 0.1,
                  var31,
                  var33,
                  var35
               );
               if (var37 != null) {
                  var37.method14513(var29);
               }
            }

            if (var4 == 1) {
               this.world.method6858(var3, SoundEvents.field26538, SoundCategory.field14733, 1.0F, var5.nextFloat() * 0.1F + 0.9F, false);
            }
            break;
         case 2008:
            this.world
               .addParticle(
                  ParticleTypes.field34070, (double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5, 0.0, 0.0, 0.0
               );
            break;
         case 2009:
            for (int var28 = 0; var28 < 8; var28++) {
               this.world
                  .addParticle(
                     ParticleTypes.field34053,
                     (double)var3.getX() + var5.nextDouble(),
                     (double)var3.getY() + 1.2,
                     (double)var3.getZ() + var5.nextDouble(),
                     0.0,
                     0.0,
                     0.0
                  );
            }
            break;
         case 3000:
            this.world
               .method6747(
                  ParticleTypes.field34069, true, (double)var3.getX() + 0.5, (double)var3.getY() + 0.5, (double)var3.getZ() + 0.5, 0.0, 0.0, 0.0
               );
            this.world
               .method6858(
                  var3,
                  SoundEvents.field26556,
                  SoundCategory.field14732,
                  10.0F,
                  (1.0F + (this.world.rand.nextFloat() - this.world.rand.nextFloat()) * 0.2F) * 0.7F,
                  false
               );
            break;
         case 3001:
            this.world.method6858(var3, SoundEvents.field26540, SoundCategory.field14733, 64.0F, 0.8F + this.world.rand.nextFloat() * 0.3F, false);
      }
   }

   public void method920(int var1, BlockPos var2, int var3) {
      if (var3 >= 0 && var3 < 10) {
         Class1995 var5 = (Class1995)this.field956.get(var1);
         if (var5 != null) {
            this.method886(var5);
         }

         if (var5 == null
            || var5.method8283().getX() != var2.getX()
            || var5.method8283().getY() != var2.getY()
            || var5.method8283().getZ() != var2.getZ()) {
            var5 = new Class1995(var1, var2);
            this.field956.put(var1, var5);
         }

         var5.method8284(var3);
         var5.method8286(this.field955);
         ((SortedSet)this.field957.computeIfAbsent(var5.method8283().toLong(), var0 -> Sets.newTreeSet())).add(var5);
      } else {
         Class1995 var4 = (Class1995)this.field956.remove(var1);
         if (var4 != null) {
            this.method886(var4);
         }
      }
   }

   public boolean method921() {
      return this.chunksToUpdate.isEmpty() && this.field983.method33330();
   }

   public void setDisplayListEntitiesDirty() {
      this.field995 = true;
      this.field952 = true;
   }

   public int method923() {
      return this.viewFrustum.field42528.length;
   }

   public int method924() {
      return this.field945.size();
   }

   public int method925() {
      return this.field986;
   }

   public int method926() {
      return this.field1016;
   }

   public int method927() {
      if (this.world == null) {
         return 0;
      } else {
         ClientChunkProvider var1 = this.world.getChunkProvider();
         return var1 == null ? 0 : var1.getLoadedChunksCount();
      }
   }

   public int method928() {
      return this.chunksToUpdate.size();
   }

   public Class8066 method929(BlockPos var1) {
      return this.viewFrustum.method34761(var1);
   }

   public ClientWorld method930() {
      return this.world;
   }

   private void clearRenderInfos() {
      if (field1022 > 0) {
         this.field945 = new ObjectArrayList(this.field945.size() + 16);
         this.renderInfosEntities = new ArrayList<Class7002>(this.renderInfosEntities.size() + 16);
         this.renderInfosTileEntities = new ArrayList<Class7002>(this.renderInfosTileEntities.size() + 16);
      } else {
         this.field945.clear();
         this.renderInfosEntities.clear();
         this.renderInfosTileEntities.clear();
      }
   }

   public void method932() {
      if (this.field1021) {
         this.loadRenderers();
         this.field1021 = false;
      }
   }

   public void method933() {
      if (this.field983 != null) {
         this.field983.method33332();
      }
   }

   public void method934() {
      if (this.field983 != null) {
         this.field983.method33333();
      }
   }

   public int method935() {
      return this.field996;
   }

   public int method936() {
      return ++this.field996;
   }

   public RenderTypeBuffers method937() {
      return this.renderTypeTextures;
   }

   public List<Class7002> method938() {
      return this.renderInfosEntities;
   }

   public List<Class7002> method939() {
      return this.renderInfosTileEntities;
   }

   private void method940(ActiveRenderInfo var1, Class7647 var2, boolean var3) {
      if (this.field1023 == 0) {
         this.method941(var1, var2, var3);
         this.mc.ingameGUI.getChatGUI().method5941(201435902);
      }

      if (this.field1023 > -1) {
         this.field1023--;
      }
   }

   private void method941(ActiveRenderInfo var1, Class7647 var2, boolean var3) {
      int var4 = this.mc.gameSettings.field44705;
      boolean var5 = this.mc.gameSettings.ofLazyChunkLoading;

      try {
         this.mc.gameSettings.field44705 = 1000;
         this.mc.gameSettings.ofLazyChunkLoading = false;
         WorldRenderer var6 = Config.method26874();
         int var7 = var6.method927();
         long var8 = System.currentTimeMillis();
         Config.method26810("Loading visible chunks");
         long var10 = System.currentTimeMillis() + 5000L;
         int var12 = 0;
         boolean var13 = false;

         do {
            var13 = false;

            for (int var14 = 0; var14 < 100; var14++) {
               var6.setDisplayListEntitiesDirty();
               var6.method874(var1, var2, false, this.field996++, var3);
               if (!var6.method921()) {
                  var13 = true;
               }

               var12 += var6.method928();

               while (!var6.method921()) {
                  var6.method891(System.nanoTime() + 1000000000L);
               }

               var12 -= var6.method928();
               if (!var13) {
                  break;
               }
            }

            if (var6.method927() != var7) {
               var13 = true;
               var7 = var6.method927();
            }

            if (System.currentTimeMillis() > var10) {
               Config.method26815("Chunks loaded: " + var12);
               var10 = System.currentTimeMillis() + 5000L;
            }
         } while (var13);

         Config.method26815("Chunks loaded: " + var12);
         Config.method26815("Finished loading visible chunks");
         Class9016.field41247 = 0;
      } finally {
         this.mc.gameSettings.field44705 = var4;
         this.mc.gameSettings.ofLazyChunkLoading = var5;
      }
   }

   public IResourceType method942() {
      return VanillaResourceType.MODELS;
   }

   public void method943(Collection<TileEntity> var1, Collection<TileEntity> var2) {
      synchronized (this.field946) {
         this.field946.removeAll(var1);
         this.field946.addAll(var2);
      }
   }

   public static int method944(IBlockDisplayReader var0, BlockPos var1) {
      return method945(var0, var0.getBlockState(var1), var1);
   }

   public static int method945(IBlockDisplayReader var0, BlockState var1, BlockPos var2) {
      if (var1.method23398(var0, var2)) {
         return 15728880;
      } else {
         int var3 = var0.getLightFor(LightType.SKY, var2);
         int var4 = var0.getLightFor(LightType.BLOCK, var2);
         int var5 = var1.method23494(var0, var2);
         if (var4 < var5) {
            var4 = var5;
         }

         int var6 = var3 << 20 | var4 << 4;
         if (Config.isDynamicLights() && var0 instanceof IBlockReader && (!field1025 || !var1.method23409(var0, var2))) {
            var6 = DynamicLights.method36314(var2, var6);
         }

         return var6;
      }
   }

   @Nullable
   public Framebuffer method946() {
      return this.entityOutlineFramebuffer;
   }

   @Nullable
   public Framebuffer method947() {
      return this.field961;
   }

   @Nullable
   public Framebuffer method948() {
      return this.field962;
   }

   @Nullable
   public Framebuffer method949() {
      return this.field963;
   }

   @Nullable
   public Framebuffer method950() {
      return this.field964;
   }

   @Nullable
   public Framebuffer method951() {
      return this.field965;
   }
}
