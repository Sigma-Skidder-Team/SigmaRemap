package mapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.fluid.FluidState;
import net.minecraft.network.NetworkManager;
import net.minecraft.state.Property;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.lighting.WorldLightManager;
import net.minecraft.world.server.ServerWorld;
import net.optifine.Config;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DebugOverlayGui extends AbstractGui {
   private static final Map<Heightmap.Type, String> HEIGHTMAP_NAMES = Util.make(
           new EnumMap<>(Heightmap.Type.class), var0 -> {
         var0.put(Heightmap.Type.WORLD_SURFACE_WG, "SW");
         var0.put(Heightmap.Type.WORLD_SURFACE, "S");
         var0.put(Heightmap.Type.OCEAN_FLOOR_WG, "OW");
         var0.put(Heightmap.Type.OCEAN_FLOOR, "O");
         var0.put(Heightmap.Type.MOTION_BLOCKING, "M");
         var0.put(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, "ML");
      }
   );
   private final Minecraft mc;
   private final FontRenderer fontRenderer;
   private RayTraceResult rayTraceBlock;
   private RayTraceResult rayTraceFluid;
   private ChunkPos chunkPos;
   private Chunk chunk;
   private CompletableFuture<Chunk> futureChunk;
   private String debugOF = null;
   private List<String> debugInfoLeft = null;
   public List<String> debugInfoRight = null;
   private long updateInfoLeftTimeMs = 0L;
   private long updateInfoRightTimeMs = 0L;

   public DebugOverlayGui(Minecraft var1) {
      this.mc = var1;
      this.fontRenderer = var1.fontRenderer;
   }

   public void resetChunk() {
      this.futureChunk = null;
      this.chunk = null;
   }

   public void render(MatrixStack var1) {
      this.mc.getProfiler().startSection("debug");
      RenderSystem.pushMatrix();
      Entity var4 = this.mc.getRenderViewEntity();
      this.rayTraceBlock = var4.pick(20.0, 0.0F, false);
      this.rayTraceFluid = var4.pick(20.0, 0.0F, true);
      this.renderDebugInfoLeft(var1);
      this.renderDebugInfoRight(var1);
      RenderSystem.popMatrix();
      if (this.mc.gameSettings.showLagometer) {
         int var5 = this.mc.getMainWindow().getScaledWidth();
         this.func_238509_a_(var1, this.mc.getFrameTimer(), 0, var5 / 2, true);
         IntegratedServer var6 = this.mc.getIntegratedServer();
         if (var6 != null) {
            this.func_238509_a_(var1, var6.getFrameTimer(), var5 - Math.min(var5 / 2, 240), var5 / 2, false);
         }
      }

      this.mc.getProfiler().endSection();
   }

   public void renderDebugInfoLeft(MatrixStack var1) {
      List<String> var4 = this.debugInfoLeft;
      if (var4 == null || System.currentTimeMillis() > this.updateInfoLeftTimeMs) {
         var4 = this.getDebugInfoLeft();
         var4.add("");
         boolean var5 = this.mc.getIntegratedServer() != null;
         var4.add(
            "Debug: Pie [shift]: "
               + (!this.mc.gameSettings.showDebugProfilerChart ? "hidden" : "visible")
               + (!var5 ? " FPS" : " FPS + TPS")
               + " [alt]: "
               + (!this.mc.gameSettings.showLagometer ? "hidden" : "visible")
         );
         var4.add("For help: press F3 + Q");
         this.debugInfoLeft = var4;
         this.updateInfoLeftTimeMs = System.currentTimeMillis() + 100L;
      }

      GuiPoint[] var13 = new GuiPoint[var4.size()];
      GuiRect[] var6 = new GuiRect[var4.size()];

      for (int var7 = 0; var7 < var4.size(); var7++) {
         String var8 = (String)var4.get(var7);
         if (!Strings.isNullOrEmpty(var8)) {
            byte var9 = 9;
            int var10 = this.fontRenderer.getStringWidth(var8);
            byte var11 = 2;
            int var12 = 2 + var9 * var7;
            var6[var7] = new GuiRect(1, var12 - 1, 2 + var10 + 1, var12 + var9 - 1);
            var13[var7] = new GuiPoint(2, var12);
         }
      }

      GuiUtils.fill(var1.getLast().getMatrix(), var6, -1873784752);
      this.fontRenderer.renderStrings(var4, var13, 14737632, var1.getLast().getMatrix(), false, this.fontRenderer.method38829());
   }

   public void renderDebugInfoRight(MatrixStack var1) {
      List var4 = this.debugInfoRight;
      if (var4 == null || System.currentTimeMillis() > this.updateInfoRightTimeMs) {
         var4 = this.getDebugInfoRight();
         this.debugInfoRight = var4;
         this.updateInfoRightTimeMs = System.currentTimeMillis() + 100L;
      }

      GuiPoint[] var5 = new GuiPoint[var4.size()];
      GuiRect[] var6 = new GuiRect[var4.size()];

      for (int var7 = 0; var7 < var4.size(); var7++) {
         String var8 = (String)var4.get(var7);
         if (!Strings.isNullOrEmpty(var8)) {
            byte var9 = 9;
            int var10 = this.fontRenderer.getStringWidth(var8);
            int var11 = this.mc.getMainWindow().getScaledWidth() - 2 - var10;
            int var12 = 2 + var9 * var7;
            var6[var7] = new GuiRect(var11 - 1, var12 - 1, var11 + var10 + 1, var12 + var9 - 1);
            var5[var7] = new GuiPoint(var11, var12);
         }
      }

      GuiUtils.fill(var1.getLast().getMatrix(), var6, -1873784752);
      this.fontRenderer.renderStrings(var4, var5, 14737632, var1.getLast().getMatrix(), false, this.fontRenderer.method38829());
   }

   public List<String> getDebugInfoLeft() {
      if (this.mc.debug != this.debugOF) {
         StringBuffer var3 = new StringBuffer(this.mc.debug);
         int var4 = Config.getChunkUpdates();
         int var5 = this.mc.debug.indexOf("T: ");
         if (var5 >= 0) {
            var3.insert(var5, "(" + var4 + " chunk updates) ");
         }

         int var6 = Config.getFpsMin();
         int var7 = this.mc.debug.indexOf(" fps ");
         if (var7 >= 0) {
            var3.insert(var7, "/" + var6);
         }

         if (Config.isSmoothFps()) {
            var3.append(" sf");
         }

         if (Config.isFastRender()) {
            var3.append(" fr");
         }

         if (Config.isAnisotropicFiltering()) {
            var3.append(" af");
         }

         if (Config.isAntialiasing()) {
            var3.append(" aa");
         }

         if (Config.isRenderRegions()) {
            var3.append(" reg");
         }

         if (Config.isShaders()) {
            var3.append(" sh");
         }

         this.mc.debug = var3.toString();
         this.debugOF = this.mc.debug;
      }

      List<String> var9 = this.getInfoLeft();
      StringBuilder var10 = new StringBuilder();
      AtlasTexture var11 = Config.getTextureMap();
      var10.append(", A: ");
      if (SmartAnimations.isActive()) {
         var10.append(var11.getCountAnimationsActive() + TextureAnimations.getCountAnimationsActive());
         var10.append("/");
      }

      var10.append(var11.getCountAnimations() + TextureAnimations.getCountAnimations());
      String var12 = var10.toString();

      for (int var13 = 0; var13 < var9.size(); var13++) {
         String var8 = (String)var9.get(var13);
         if (var8 != null && var8.startsWith("P: ")) {
            var8 = var8 + var12;
            var9.set(var13, var8);
            break;
         }
      }

      return var9;
   }

   public List<String> getInfoLeft() {
      IntegratedServer var3 = this.mc.getIntegratedServer();
      NetworkManager var4 = this.mc.getConnection().getNetworkManager();
      float var5 = var4.getPacketsSent();
      float var6 = var4.getPacketsReceived();
      String var7;
      if (var3 != null) {
         var7 = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", var3.method1417(), var5, var6);
      } else {
         var7 = String.format("\"%s\" server, %.0f tx, %.0f rx", this.mc.player.method5395(), var5, var6);
      }

      BlockPos var8 = this.mc.getRenderViewEntity().getPosition();
      String var9 = SharedConstants.getVersion().getName();

      if (this.mc.isReducedDebug()) {
         return Lists.newArrayList(
                 "Minecraft " + var9 + " (" + this.mc.getVersion() + "/" + ClientBrandRetriever.getClientModName() + ")",
                 this.mc.debug,
                 var7,
                 this.mc.worldRenderer.getDebugInfoRenders(),
                 this.mc.worldRenderer.getDebugInfoEntities(),
                 "P: " + this.mc.particles.getStatistics() + ". T: " + this.mc.world.getCountLoadedEntities(),
                 this.mc.world.getProviderName(),
                 "",
                 String.format("Chunk-relative: %d %d %d", var8.getX() & 15, var8.getY() & 15, var8.getZ() & 15));
      } else {
         Entity var10 = this.mc.getRenderViewEntity();
         Direction var11 = var10.getHorizontalFacing();
         String var12;
         switch (Class7968.field34258[var11.ordinal()]) {
            case 1:
               var12 = "Towards negative Z";
               break;
            case 2:
               var12 = "Towards positive Z";
               break;
            case 3:
               var12 = "Towards negative X";
               break;
            case 4:
               var12 = "Towards positive X";
               break;
            default:
               var12 = "Invalid";
         }

         ChunkPos var13 = new ChunkPos(var8);
         if (!Objects.equals(this.chunkPos, var13)) {
            this.chunkPos = var13;
            this.resetChunk();
         }

         World var14 = this.getWorld();
         LongSet var15 = var14 instanceof ServerWorld ? ((ServerWorld)var14).method6949() : LongSets.EMPTY_SET;
         List<String> var16 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + SharedConstants.getVersion().getName()
                  + " ("
                  + this.mc.getVersion()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.mc.getVersionType()) ? "" : "/" + this.mc.getVersionType())
                  + ")",
               this.mc.debug,
               var7,
               this.mc.worldRenderer.getDebugInfoRenders(),
               this.mc.worldRenderer.getDebugInfoEntities(),
               "P: " + this.mc.particles.getStatistics() + ". T: " + this.mc.world.getCountLoadedEntities(),
               this.mc.world.getProviderName()
            }
         );
         String var17 = this.getServerChunkStats();
         if (var17 != null) {
            var16.add(var17);
         }

         var16.add(this.mc.world.getDimensionKey().getLocation() + " FC: " + var15.size());
         var16.add("");
         var16.add(
            String.format(
               Locale.ROOT,
               "XYZ: %.3f / %.5f / %.3f",
               this.mc.getRenderViewEntity().getPosX(),
               this.mc.getRenderViewEntity().getPosY(),
               this.mc.getRenderViewEntity().getPosZ()
            )
         );
         var16.add(String.format("Block: %d %d %d", var8.getX(), var8.getY(), var8.getZ()));
         var16.add(
            String.format(
               "Chunk: %d %d %d in %d %d %d",
               var8.getX() & 15,
               var8.getY() & 15,
               var8.getZ() & 15,
               var8.getX() >> 4,
               var8.getY() >> 4,
               var8.getZ() >> 4
            )
         );
         var16.add(
            String.format(
               Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", var11, var12, MathHelper.wrapDegrees(var10.rotationYaw), MathHelper.wrapDegrees(var10.rotationPitch)
            )
         );
         if (this.mc.world != null) {
            if (this.mc.world.isBlockLoaded(var8)) {
               Chunk var18 = this.getChunk();
               if (var18.isEmpty()) {
                  var16.add("Waiting for chunk...");
               } else {
                  int var19 = this.mc.world.getChunkProvider().getLightManager().method640(var8, 0);
                  int var20 = this.mc.world.getLightFor(LightType.SKY, var8);
                  int var21 = this.mc.world.getLightFor(LightType.BLOCK, var8);
                  var16.add("Client Light: " + var19 + " (" + var20 + " sky, " + var21 + " block)");
                  Chunk var22 = this.getServerChunk();
                  if (var22 != null) {
                     WorldLightManager var23 = var14.getChunkProvider().getLightManager();
                     var16.add(
                        "Server Light: ("
                           + var23.getLightEngine(LightType.SKY).method643(var8)
                           + " sky, "
                           + var23.getLightEngine(LightType.BLOCK).method643(var8)
                           + " block)"
                     );
                  } else {
                     var16.add("Server Light: (?? sky, ?? block)");
                  }

                  StringBuilder var35 = new StringBuilder("CH");

                  for (Heightmap.Type var27 : Heightmap.Type.values()) {
                     if (var27.method284()) {
                        var35.append(" ").append(HEIGHTMAP_NAMES.get(var27)).append(": ").append(var18.getTopBlockY(var27, var8.getX(), var8.getZ()));
                     }
                  }

                  var16.add(var35.toString());
                  var35.setLength(0);
                  var35.append("SH");

                  for (Heightmap.Type var40 : Heightmap.Type.values()) {
                     if (var40.isUsageClient()) {
                        var35.append(" ").append(HEIGHTMAP_NAMES.get(var40)).append(": ");
                        if (var22 != null) {
                           var35.append(var22.getTopBlockY(var40, var8.getX(), var8.getZ()));
                        } else {
                           var35.append("??");
                        }
                     }
                  }

                  var16.add(var35.toString());
                  if (var8.getY() >= 0 && var8.getY() < 256) {
                     var16.add(
                        "Biome: "
                           + this.mc
                              .world
                              .func_241828_r()
                              .<Biome>getRegistry(Registry.BIOME_KEY)
                              .getKey(this.mc.world.getBiome(var8))
                     );
                     long var28 = 0L;
                     float var39 = 0.0F;
                     if (var22 != null) {
                        var39 = var14.method7000();
                        var28 = var22.getInhabitedTime();
                     }

                     Class9755 var41 = new Class9755(var14.method6997(), var14.method6784(), var28, var39);
                     var16.add(
                        String.format(
                           Locale.ROOT,
                           "Local Difficulty: %.2f // %.2f (Day %d)",
                           var41.method38328(),
                           var41.method38330(),
                           this.mc.world.method6784() / 24000L
                        )
                     );
                  }
               }
            } else {
               var16.add("Outside of world...");
            }
         } else {
            var16.add("Outside of world...");
         }

         ServerWorld var30 = this.method5883();
         if (var30 != null) {
            Class7307 var31 = var30.getChunkProvider().method7385();
            if (var31 != null) {
               Object2IntMap var33 = var31.method23091();
               int var34 = var31.method23090();
               var16.add(
                  "SC: "
                     + var34
                     + ", "
                     + Stream.<EntityClassification>of(EntityClassification.values())
                        .<CharSequence>map(var1 -> Character.toUpperCase(var1.method517().charAt(0)) + ": " + var33.getInt(var1))
                        .collect(Collectors.joining(", "))
               );
            } else {
               var16.add("SC: N/A");
            }
         }

         ShaderGroup var32 = this.mc.gameRenderer.getShaderGroup();
         if (var32 != null) {
            var16.add("ShaderGroup: " + var32.method6527());
         }

         var16.add(this.mc.getSoundHandler().method1014() + String.format(" (Mood %d%%)", Math.round(this.mc.player.method5387() * 100.0F)));
         return var16;
      }
   }

   @Nullable
   private ServerWorld method5883() {
      IntegratedServer var3 = this.mc.getIntegratedServer();
      return var3 == null ? null : var3.method1318(this.mc.world.getDimensionKey());
   }

   @Nullable
   private String getServerChunkStats() {
      ServerWorld var3 = this.method5883();
      return var3 == null ? null : var3.getProviderName();
   }

   private World getWorld() {
      return (World)DataFixUtils.orElse(
         Optional.<IntegratedServer>ofNullable(this.mc.getIntegratedServer())
            .<ServerWorld>flatMap(var1 -> Optional.ofNullable(var1.method1318(this.mc.world.getDimensionKey()))),
         this.mc.world
      );
   }

   @Nullable
   private Chunk getServerChunk() {
      if (this.futureChunk == null) {
         ServerWorld var3 = this.method5883();
         if (var3 != null) {
            this.futureChunk = var3.getChunkProvider()
               .method7358(this.chunkPos.x, this.chunkPos.z, ChunkStatus.FULL, false)
               .<Chunk>thenApply(var0 -> (Chunk)var0.map(var0x -> (Chunk)var0x, var0x -> null));
         }

         if (this.futureChunk == null) {
            this.futureChunk = CompletableFuture.<Chunk>completedFuture(this.getChunk());
         }
      }

      return this.futureChunk.getNow((Chunk)null);
   }

   private Chunk getChunk() {
      if (this.chunk == null) {
         this.chunk = this.mc.world.getChunk(this.chunkPos.x, this.chunkPos.z);
      }

      return this.chunk;
   }

   public List<String> getDebugInfoRight() {
      long var3 = Runtime.getRuntime().maxMemory();
      long var5 = Runtime.getRuntime().totalMemory();
      long var7 = Runtime.getRuntime().freeMemory();
      long var9 = var5 - var7;
      ArrayList var11 = Lists.newArrayList(
         new String[]{
            String.format("Java: %s %dbit", System.getProperty("java.version"), !this.mc.isJava64bit() ? 32 : 64),
            String.format("Mem: % 2d%% %03d/%03dMB", var9 * 100L / var3, method5893(var9), method5893(var3)),
            String.format("Allocated: % 2d%% %03dMB", var5 * 100L / var3, method5893(var5)),
            "",
            String.format("CPU: %s", PlatformDescriptors.getCpuInfo()),
            "",
            String.format(
               "Display: %dx%d (%s)", Minecraft.getInstance().getMainWindow().getFramebufferWidth(), Minecraft.getInstance().getMainWindow().getFramebufferHeight(), PlatformDescriptors.method33485()
            ),
            PlatformDescriptors.method33487(),
            PlatformDescriptors.method33488()
         }
      );
      long var12 = Class9323.method35236();
      long var14 = Class9323.method35237();
      long var16 = Class9323.method35240();
      String var18 = "Native: " + method5893(var12) + "/" + method5893(var14) + "+" + method5893(var16) + "MB";
      var11.add(3, var18);
      var11.set(4, "GC: " + Class8777.method31655() + "MB/s");
      if (Reflector.field42763.exists()) {
         var11.add("");

         for (String var20 : (Iterable<String>) Reflector.method35062(Reflector.field42763, true, false)) {
            if (!var20.startsWith("Minecraft ")) {
               var11.add(var20);
            }
         }
      }

      if (this.mc.isReducedDebug()) {
         return var11;
      } else {
         if (this.rayTraceBlock.getType() == RayTraceResult.Type.BLOCK) {
            BlockPos var24 = ((BlockRayTraceResult)this.rayTraceBlock).getPos();
            BlockState var27 = this.mc.world.getBlockState(var24);
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Block: " + var24.getX() + ", " + var24.getY() + ", " + var24.getZ());
            var11.add(String.valueOf(Registry.BLOCK.getKey(var27.getBlock())));
            UnmodifiableIterator var21 = var27.method23468().entrySet().iterator();

            while (var21.hasNext()) {
               Entry var22 = (Entry)var21.next();
               var11.add(this.method5889(var22));
            }

            Collection<ResourceLocation> var30;
            if (!Reflector.field42818.exists()) {
               var30 = this.mc.getConnection().method15798().method32657().method27138(var27.getBlock());
            } else {
               var30 = (Collection) Reflector.call(var27.getBlock(), Reflector.field42818);
            }

            for (ResourceLocation var23 : var30) {
               var11.add("#" + var23);
            }
         }

         if (this.rayTraceFluid.getType() == RayTraceResult.Type.BLOCK) {
            BlockPos var25 = ((BlockRayTraceResult)this.rayTraceFluid).getPos();
            FluidState var28 = this.mc.world.getFluidState(var25);
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Fluid: " + var25.getX() + ", " + var25.getY() + ", " + var25.getZ());
            var11.add(String.valueOf(Registry.FLUID.getKey(var28.getFluid())));
            UnmodifiableIterator var31 = var28.method23468().entrySet().iterator();

            while (var31.hasNext()) {
               Entry var34 = (Entry)var31.next();
               var11.add(this.method5889(var34));
            }

            Collection<ResourceLocation> var32;
            if (!Reflector.field42853.exists()) {
               var32 = this.mc.getConnection().method15798().method32659().method27138(var28.getFluid());
            } else {
               var32 = (Collection) Reflector.call(var28.getFluid(), Reflector.field42853);
            }

            for (ResourceLocation var36 : var32) {
               var11.add("#" + var36);
            }
         }

         Entity var26 = this.mc.pointedEntity;
         if (var26 != null) {
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Entity");
            var11.add(String.valueOf(Registry.ENTITY_TYPE.getKey(var26.getType())));
            if (Reflector.field42842.exists()) {
               Collection var29 = (Collection) Reflector.call(var26.getType(), Reflector.field42842);
               var29.forEach(var1 -> var11.add("#" + var1));
            }
         }

         return var11;
      }
   }

   private String method5889(Entry<Property<?>, Comparable<?>> var1) {
      Property<?> var4 = var1.getKey();
      Comparable<?> var5 = var1.getValue();
      String var6 = Util.method38485(var4, var5);
      if (!Boolean.TRUE.equals(var5)) {
         if (Boolean.FALSE.equals(var5)) {
            var6 = TextFormatting.RED + var6;
         }
      } else {
         var6 = TextFormatting.GREEN + var6;
      }

      return var4.method30472() + ": " + var6;
   }

   private void func_238509_a_(MatrixStack var1, FrameTimer var2, int var3, int var4, boolean var5) {
      if (!var5) {
         int var8 = (int)(512.0 / this.mc.getMainWindow().getGuiScaleFactor());
         var3 = Math.max(var3, var8);
         var4 = this.mc.getMainWindow().getScaledWidth() - var3;
         RenderSystem.disableDepthTest();
         int var9 = var2.method38594();
         int var10 = var2.method38595();
         long[] var11 = var2.method38597();
         int var12 = var3;
         int var13 = Math.max(0, var11.length - var4);
         int var14 = var11.length - var13;
         int var15 = var2.method38596(var9 + var13);
         long var16 = 0L;
         int var18 = Integer.MAX_VALUE;
         int var19 = Integer.MIN_VALUE;

         for (int var20 = 0; var20 < var14; var20++) {
            int var21 = (int)(var11[var2.method38596(var15 + var20)] / 1000000L);
            var18 = Math.min(var18, var21);
            var19 = Math.max(var19, var21);
            var16 += (long)var21;
         }

         int var32 = this.mc.getMainWindow().getScaledHeight();
         fill(var1, var3, var32 - 60, var3 + var14, var32, -1873784752);
         BufferBuilder var33 = Tessellator.getInstance().getBuffer();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.defaultBlendFunc();
         var33.begin(7, DefaultVertexFormats.POSITION_COLOR);

         for (Matrix4f var22 = Class6979.method21542().method21548(); var15 != var10; var15 = var2.method38596(var15 + 1)) {
            int var23 = var2.method38593(var11[var15], !var5 ? 60 : 30, !var5 ? 20 : 60);
            int var24 = !var5 ? 60 : 100;
            int var25 = this.method5891(MathHelper.clamp(var23, 0, var24), 0, var24 / 2, var24);
            int var26 = var25 >> 24 & 0xFF;
            int var27 = var25 >> 16 & 0xFF;
            int var28 = var25 >> 8 & 0xFF;
            int var29 = var25 & 0xFF;
            var33.pos(var22, (float)(var12 + 1), (float)var32, 0.0F).color(var27, var28, var29, var26).endVertex();
            var33.pos(var22, (float)(var12 + 1), (float)(var32 - var23 + 1), 0.0F).color(var27, var28, var29, var26).endVertex();
            var33.pos(var22, (float)var12, (float)(var32 - var23 + 1), 0.0F).color(var27, var28, var29, var26).endVertex();
            var33.pos(var22, (float)var12, (float)var32, 0.0F).color(var27, var28, var29, var26).endVertex();
            var12++;
         }

         var33.finishDrawing();
         WorldVertexBufferUploader.draw(var33);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         if (!var5) {
            fill(var1, var3 + 1, var32 - 60 + 1, var3 + 14, var32 - 60 + 10, -1873784752);
            this.fontRenderer.method38801(var1, "20 TPS", (float)(var3 + 2), (float)(var32 - 60 + 2), 14737632);
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 60, -1);
         } else {
            fill(var1, var3 + 1, var32 - 30 + 1, var3 + 14, var32 - 30 + 10, -1873784752);
            this.fontRenderer.method38801(var1, "60 FPS", (float)(var3 + 2), (float)(var32 - 30 + 2), 14737632);
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 30, -1);
            fill(var1, var3 + 1, var32 - 60 + 1, var3 + 14, var32 - 60 + 10, -1873784752);
            this.fontRenderer.method38801(var1, "30 FPS", (float)(var3 + 2), (float)(var32 - 60 + 2), 14737632);
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 60, -1);
         }

         this.method5684(var1, var3, var3 + var14 - 1, var32 - 1, -1);
         this.method5685(var1, var3, var32 - 60, var32, -1);
         this.method5685(var1, var3 + var14 - 1, var32 - 60, var32, -1);
         if (var5 && this.mc.gameSettings.framerateLimit > 0 && this.mc.gameSettings.framerateLimit <= 250) {
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 1 - (int)(1800.0 / (double)this.mc.gameSettings.framerateLimit), -16711681);
         }

         String var34 = var18 + " ms min";
         String var35 = var16 / (long)var14 + " ms avg";
         String var36 = var19 + " ms max";
         this.fontRenderer.drawStringWithShadow(var1, var34, (float)(var3 + 2), (float)(var32 - 60 - 9), 14737632);
         this.fontRenderer.drawStringWithShadow(var1, var35, (float)(var3 + var14 / 2 - this.fontRenderer.getStringWidth(var35) / 2), (float)(var32 - 60 - 9), 14737632);
         this.fontRenderer.drawStringWithShadow(var1, var36, (float)(var3 + var14 - this.fontRenderer.getStringWidth(var36)), (float)(var32 - 60 - 9), 14737632);
         RenderSystem.enableDepthTest();
      }
   }

   private int method5891(int var1, int var2, int var3, int var4) {
      return var1 >= var3
         ? this.method5892(-256, -65536, (float)(var1 - var3) / (float)(var4 - var3))
         : this.method5892(-16711936, -256, (float)var1 / (float)var3);
   }

   private int method5892(int var1, int var2, float var3) {
      int var6 = var1 >> 24 & 0xFF;
      int var7 = var1 >> 16 & 0xFF;
      int var8 = var1 >> 8 & 0xFF;
      int var9 = var1 & 0xFF;
      int var10 = var2 >> 24 & 0xFF;
      int var11 = var2 >> 16 & 0xFF;
      int var12 = var2 >> 8 & 0xFF;
      int var13 = var2 & 0xFF;
      int var14 = MathHelper.clamp((int) MathHelper.lerp(var3, (float)var6, (float)var10), 0, 255);
      int var15 = MathHelper.clamp((int) MathHelper.lerp(var3, (float)var7, (float)var11), 0, 255);
      int var16 = MathHelper.clamp((int) MathHelper.lerp(var3, (float)var8, (float)var12), 0, 255);
      int var17 = MathHelper.clamp((int) MathHelper.lerp(var3, (float)var9, (float)var13), 0, 255);
      return var14 << 24 | var15 << 16 | var16 << 8 | var17;
   }

   private static long method5893(long var0) {
      return var0 / 1024L / 1024L;
   }
}
