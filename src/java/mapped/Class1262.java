package mapped;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.common.collect.UnmodifiableIterator;
import com.mentalfrostbyte.jello.unmapped.Class8005;
import com.mojang.datafixers.DataFixUtils;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSets;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class1262 extends AbstractGui {
   private static final Map<Class101, String> field6664 = Util.make(
      new EnumMap<Class101, String>(Class101.class), var0 -> {
         var0.put(Class101.field295, "SW");
         var0.put(Class101.field296, "S");
         var0.put(Class101.field297, "OW");
         var0.put(Class101.field298, "O");
         var0.put(Class101.field299, "M");
         var0.put(Class101.field300, "ML");
      }
   );
   private final Minecraft field6665;
   private final FontRenderer field6666;
   private RayTraceResult field6667;
   private RayTraceResult field6668;
   private Class7481 field6669;
   private Chunk field6670;
   private CompletableFuture<Chunk> field6671;
   private String field6672 = null;
   private List<String> field6673 = null;
   public List<String> field6674 = null;
   private long field6675 = 0L;
   private long field6676 = 0L;

   public Class1262(Minecraft var1) {
      this.field6665 = var1;
      this.field6666 = var1.fontRenderer;
   }

   public void method5877() {
      this.field6671 = null;
      this.field6670 = null;
   }

   public void method5878(MatrixStack var1) {
      this.field6665.getProfiler().startSection("debug");
      RenderSystem.pushMatrix();
      Entity var4 = this.field6665.getRenderViewEntity();
      this.field6667 = var4.method3289(20.0, 0.0F, false);
      this.field6668 = var4.method3289(20.0, 0.0F, true);
      this.method5879(var1);
      this.method5880(var1);
      RenderSystem.popMatrix();
      if (this.field6665.gameSettings.field44666) {
         int var5 = this.field6665.getMainWindow().getScaledWidth();
         this.method5890(var1, this.field6665.getFrameTimer(), 0, var5 / 2, true);
         IntegratedServer var6 = this.field6665.getIntegratedServer();
         if (var6 != null) {
            this.method5890(var1, var6.method1419(), var5 - Math.min(var5 / 2, 240), var5 / 2, false);
         }
      }

      this.field6665.getProfiler().endSection();
   }

   public void method5879(MatrixStack var1) {
      List var4 = this.field6673;
      if (var4 == null || System.currentTimeMillis() > this.field6675) {
         var4 = this.method5881();
         var4.add("");
         boolean var5 = this.field6665.getIntegratedServer() != null;
         var4.add(
            "Debug: Pie [shift]: "
               + (!this.field6665.gameSettings.showDebugProfilerChart ? "hidden" : "visible")
               + (!var5 ? " FPS" : " FPS + TPS")
               + " [alt]: "
               + (!this.field6665.gameSettings.field44666 ? "hidden" : "visible")
         );
         var4.add("For help: press F3 + Q");
         this.field6673 = var4;
         this.field6675 = System.currentTimeMillis() + 100L;
      }

      Class9718[] var13 = new Class9718[var4.size()];
      Class7717[] var6 = new Class7717[var4.size()];

      for (int var7 = 0; var7 < var4.size(); var7++) {
         String var8 = (String)var4.get(var7);
         if (!Strings.isNullOrEmpty(var8)) {
            byte var9 = 9;
            int var10 = this.field6666.getStringWidth(var8);
            byte var11 = 2;
            int var12 = 2 + var9 * var7;
            var6[var7] = new Class7717(1, var12 - 1, 2 + var10 + 1, var12 + var9 - 1);
            var13[var7] = new Class9718(2, var12);
         }
      }

      Class7540.method24652(var1.method35296().method32361(), var6, -1873784752);
      this.field6666.method38808(var4, var13, 14737632, var1.method35296().method32361(), false, this.field6666.method38829());
   }

   public void method5880(MatrixStack var1) {
      List var4 = this.field6674;
      if (var4 == null || System.currentTimeMillis() > this.field6676) {
         var4 = this.method5888();
         this.field6674 = var4;
         this.field6676 = System.currentTimeMillis() + 100L;
      }

      Class9718[] var5 = new Class9718[var4.size()];
      Class7717[] var6 = new Class7717[var4.size()];

      for (int var7 = 0; var7 < var4.size(); var7++) {
         String var8 = (String)var4.get(var7);
         if (!Strings.isNullOrEmpty(var8)) {
            byte var9 = 9;
            int var10 = this.field6666.getStringWidth(var8);
            int var11 = this.field6665.getMainWindow().getScaledWidth() - 2 - var10;
            int var12 = 2 + var9 * var7;
            var6[var7] = new Class7717(var11 - 1, var12 - 1, var11 + var10 + 1, var12 + var9 - 1);
            var5[var7] = new Class9718(var11, var12);
         }
      }

      Class7540.method24652(var1.method35296().method32361(), var6, -1873784752);
      this.field6666.method38808(var4, var5, 14737632, var1.method35296().method32361(), false, this.field6666.method38829());
   }

   public List<String> method5881() {
      if (this.field6665.debug != this.field6672) {
         StringBuffer var3 = new StringBuffer(this.field6665.debug);
         int var4 = Class7944.method26956();
         int var5 = this.field6665.debug.indexOf("T: ");
         if (var5 >= 0) {
            var3.insert(var5, "(" + var4 + " chunk updates) ");
         }

         int var6 = Class7944.method26955();
         int var7 = this.field6665.debug.indexOf(" fps ");
         if (var7 >= 0) {
            var3.insert(var7, "/" + var6);
         }

         if (Class7944.method26979()) {
            var3.append(" sf");
         }

         if (Class7944.method26919()) {
            var3.append(" fr");
         }

         if (Class7944.method26890()) {
            var3.append(" af");
         }

         if (Class7944.method26892()) {
            var3.append(" aa");
         }

         if (Class7944.method26977()) {
            var3.append(" reg");
         }

         if (Class7944.method26921()) {
            var3.append(" sh");
         }

         this.field6665.debug = var3.toString();
         this.field6672 = this.field6665.debug;
      }

      List var9 = this.method5882();
      StringBuilder var10 = new StringBuilder();
      AtlasTexture var11 = Class7944.method26969();
      var10.append(", A: ");
      if (Class4501.method14213()) {
         var10.append(var11.method1118() + Class8389.method29403());
         var10.append("/");
      }

      var10.append(var11.method1117() + Class8389.method29402());
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

   public List<String> method5882() {
      IntegratedServer var3 = this.field6665.getIntegratedServer();
      NetworkManager var4 = this.field6665.getConnection().getNetworkManager();
      float var5 = var4.method30715();
      float var6 = var4.method30714();
      String var7;
      if (var3 != null) {
         var7 = String.format("Integrated server @ %.0f ms ticks, %.0f tx, %.0f rx", var3.method1417(), var5, var6);
      } else {
         var7 = String.format("\"%s\" server, %.0f tx, %.0f rx", this.field6665.player.method5395(), var5, var6);
      }

      BlockPos var8 = this.field6665.getRenderViewEntity().getPosition();
      String var9 = SharedConstants.getVersion().getName();
      if (!this.field6665.isSingleplayer()) {
         var9 = Class5989.method18569(Class8005.method27349()).method18580();
      }

      if (this.field6665.isReducedDebug()) {
         return Lists.newArrayList(
            new String[]{
               "Minecraft " + var9 + " (" + this.field6665.getVersion() + "/" + ClientBrandRetriever.getClientModName() + ")",
               this.field6665.debug,
               var7,
               this.field6665.worldRenderer.method871(),
               this.field6665.worldRenderer.method873(),
               "P: " + this.field6665.particles.method1208() + ". T: " + this.field6665.world.method6844(),
               this.field6665.world.method6758(),
               "",
               String.format("Chunk-relative: %d %d %d", var8.getX() & 15, var8.getY() & 15, var8.getZ() & 15)
            }
         );
      } else {
         Entity var10 = this.field6665.getRenderViewEntity();
         Direction var11 = var10.method3386();
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

         Class7481 var13 = new Class7481(var8);
         if (!Objects.equals(this.field6669, var13)) {
            this.field6669 = var13;
            this.method5877();
         }

         World var14 = this.method5885();
         LongSet var15 = var14 instanceof ServerWorld ? ((ServerWorld)var14).method6949() : LongSets.EMPTY_SET;
         List<String> var16 = Lists.newArrayList(
            new String[]{
               "Minecraft "
                  + SharedConstants.getVersion().getName()
                  + " ("
                  + this.field6665.getVersion()
                  + "/"
                  + ClientBrandRetriever.getClientModName()
                  + ("release".equalsIgnoreCase(this.field6665.getVersionType()) ? "" : "/" + this.field6665.getVersionType())
                  + ")",
               this.field6665.debug,
               var7,
               this.field6665.worldRenderer.method871(),
               this.field6665.worldRenderer.method873(),
               "P: " + this.field6665.particles.method1208() + ". T: " + this.field6665.world.method6844(),
               this.field6665.world.method6758()
            }
         );
         String var17 = this.method5884();
         if (var17 != null) {
            var16.add(var17);
         }

         var16.add(this.field6665.world.getDimensionKey().getLocation() + " FC: " + var15.size());
         var16.add("");
         var16.add(
            String.format(
               Locale.ROOT,
               "XYZ: %.3f / %.5f / %.3f",
               this.field6665.getRenderViewEntity().getPosX(),
               this.field6665.getRenderViewEntity().getPosY(),
               this.field6665.getRenderViewEntity().getPosZ()
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
               Locale.ROOT, "Facing: %s (%s) (%.1f / %.1f)", var11, var12, MathHelper.method37792(var10.rotationYaw), MathHelper.method37792(var10.rotationPitch)
            )
         );
         if (this.field6665.world != null) {
            if (this.field6665.world.method7017(var8)) {
               Chunk var18 = this.method5887();
               if (var18.method7141()) {
                  var16.add("Waiting for chunk...");
               } else {
                  int var19 = this.field6665.world.getChunkProvider().getLightManager().method640(var8, 0);
                  int var20 = this.field6665.world.method7020(Class1977.field12881, var8);
                  int var21 = this.field6665.world.method7020(Class1977.field12882, var8);
                  var16.add("Client Light: " + var19 + " (" + var20 + " sky, " + var21 + " block)");
                  Chunk var22 = this.method5886();
                  if (var22 != null) {
                     Class196 var23 = var14.getChunkProvider().getLightManager();
                     var16.add(
                        "Server Light: ("
                           + var23.method638(Class1977.field12881).method643(var8)
                           + " sky, "
                           + var23.method638(Class1977.field12882).method643(var8)
                           + " block)"
                     );
                  } else {
                     var16.add("Server Light: (?? sky, ?? block)");
                  }

                  StringBuilder var35 = new StringBuilder("CH");

                  for (Class101 var27 : Class101.values()) {
                     if (var27.method284()) {
                        var35.append(" ").append(field6664.get(var27)).append(": ").append(var18.method7071(var27, var8.getX(), var8.getZ()));
                     }
                  }

                  var16.add(var35.toString());
                  var35.setLength(0);
                  var35.append("SH");

                  for (Class101 var40 : Class101.values()) {
                     if (var40.method285()) {
                        var35.append(" ").append(field6664.get(var40)).append(": ");
                        if (var22 != null) {
                           var35.append(var22.method7071(var40, var8.getX(), var8.getZ()));
                        } else {
                           var35.append("??");
                        }
                     }
                  }

                  var16.add(var35.toString());
                  if (var8.getY() >= 0 && var8.getY() < 256) {
                     var16.add(
                        "Biome: "
                           + this.field6665
                              .world
                              .method6867()
                              .<Biome>getRegistry(Registry.BIOME_KEY)
                              .getKey(this.field6665.world.getBiome(var8))
                     );
                     long var28 = 0L;
                     float var39 = 0.0F;
                     if (var22 != null) {
                        var39 = var14.method7000();
                        var28 = var22.method7093();
                     }

                     Class9755 var41 = new Class9755(var14.method6997(), var14.method6784(), var28, var39);
                     var16.add(
                        String.format(
                           Locale.ROOT,
                           "Local Difficulty: %.2f // %.2f (Day %d)",
                           var41.method38328(),
                           var41.method38330(),
                           this.field6665.world.method6784() / 24000L
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
                     + Stream.<Class179>of(Class179.values())
                        .<CharSequence>map(var1 -> Character.toUpperCase(var1.method517().charAt(0)) + ": " + var33.getInt(var1))
                        .collect(Collectors.joining(", "))
               );
            } else {
               var16.add("SC: N/A");
            }
         }

         Class1647 var32 = this.field6665.gameRenderer.getShaderGroup();
         if (var32 != null) {
            var16.add("Shader: " + var32.method6527());
         }

         var16.add(this.field6665.getSoundHandler().method1014() + String.format(" (Mood %d%%)", Math.round(this.field6665.player.method5387() * 100.0F)));
         return var16;
      }
   }

   @Nullable
   private ServerWorld method5883() {
      IntegratedServer var3 = this.field6665.getIntegratedServer();
      return var3 == null ? null : var3.method1318(this.field6665.world.getDimensionKey());
   }

   @Nullable
   private String method5884() {
      ServerWorld var3 = this.method5883();
      return var3 == null ? null : var3.method6758();
   }

   private World method5885() {
      return (World)DataFixUtils.orElse(
         Optional.<IntegratedServer>ofNullable(this.field6665.getIntegratedServer())
            .<ServerWorld>flatMap(var1 -> Optional.ofNullable(var1.method1318(this.field6665.world.getDimensionKey()))),
         this.field6665.world
      );
   }

   @Nullable
   private Chunk method5886() {
      if (this.field6671 == null) {
         ServerWorld var3 = this.method5883();
         if (var3 != null) {
            this.field6671 = var3.getChunkProvider()
               .method7358(this.field6669.field32174, this.field6669.field32175, ChunkStatus.FULL, false)
               .<Chunk>thenApply(var0 -> (Chunk)var0.map(var0x -> (Chunk)var0x, var0x -> null));
         }

         if (this.field6671 == null) {
            this.field6671 = CompletableFuture.<Chunk>completedFuture(this.method5887());
         }
      }

      return this.field6671.getNow((Chunk)null);
   }

   private Chunk method5887() {
      if (this.field6670 == null) {
         this.field6670 = this.field6665.world.getChunk(this.field6669.field32174, this.field6669.field32175);
      }

      return this.field6670;
   }

   public List<String> method5888() {
      long var3 = Runtime.getRuntime().maxMemory();
      long var5 = Runtime.getRuntime().totalMemory();
      long var7 = Runtime.getRuntime().freeMemory();
      long var9 = var5 - var7;
      ArrayList var11 = Lists.newArrayList(
         new String[]{
            String.format("Java: %s %dbit", System.getProperty("java.version"), !this.field6665.isJava64bit() ? 32 : 64),
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
      if (Class9299.field42763.method20214()) {
         var11.add("");

         for (String var20 : (Iterable<String>)Class9299.method35062(Class9299.field42763, true, false)) {
            if (!var20.startsWith("Minecraft ")) {
               var11.add(var20);
            }
         }
      }

      if (this.field6665.isReducedDebug()) {
         return var11;
      } else {
         if (this.field6667.getType() == RayTraceResult.Type.BLOCK) {
            BlockPos var24 = ((BlockRayTraceResult)this.field6667).getPos();
            BlockState var27 = this.field6665.world.getBlockState(var24);
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Block: " + var24.getX() + ", " + var24.getY() + ", " + var24.getZ());
            var11.add(String.valueOf(Registry.BLOCK.getKey(var27.getBlock())));
            UnmodifiableIterator var21 = var27.method23468().entrySet().iterator();

            while (var21.hasNext()) {
               Entry var22 = (Entry)var21.next();
               var11.add(this.method5889(var22));
            }

            Collection<ResourceLocation> var30;
            if (!Class9299.field42818.method20214()) {
               var30 = this.field6665.getConnection().method15798().method32657().method27138(var27.getBlock());
            } else {
               var30 = (Collection)Class9299.method35070(var27.getBlock(), Class9299.field42818);
            }

            for (ResourceLocation var23 : var30) {
               var11.add("#" + var23);
            }
         }

         if (this.field6668.getType() == RayTraceResult.Type.BLOCK) {
            BlockPos var25 = ((BlockRayTraceResult)this.field6668).getPos();
            FluidState var28 = this.field6665.world.getFluidState(var25);
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Fluid: " + var25.getX() + ", " + var25.getY() + ", " + var25.getZ());
            var11.add(String.valueOf(Registry.field16070.getKey(var28.method23472())));
            UnmodifiableIterator var31 = var28.method23468().entrySet().iterator();

            while (var31.hasNext()) {
               Entry var34 = (Entry)var31.next();
               var11.add(this.method5889(var34));
            }

            Collection<ResourceLocation> var32;
            if (!Class9299.field42853.method20214()) {
               var32 = this.field6665.getConnection().method15798().method32659().method27138(var28.method23472());
            } else {
               var32 = (Collection)Class9299.method35070(var28.method23472(), Class9299.field42853);
            }

            for (ResourceLocation var36 : var32) {
               var11.add("#" + var36);
            }
         }

         Entity var26 = this.field6665.pointedEntity;
         if (var26 != null) {
            var11.add("");
            var11.add(TextFormatting.UNDERLINE + "Targeted Entity");
            var11.add(String.valueOf(Registry.ENTITY_TYPE.getKey(var26.getType())));
            if (Class9299.field42842.method20214()) {
               Collection var29 = (Collection)Class9299.method35070(var26.getType(), Class9299.field42842);
               var29.forEach(var1 -> var11.add("#" + var1));
            }
         }

         return var11;
      }
   }

   private String method5889(Entry<Class8550<?>, Comparable<?>> var1) {
      Class8550<?> var4 = var1.getKey();
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

   private void method5890(MatrixStack var1, FrameTimer var2, int var3, int var4, boolean var5) {
      if (!var5) {
         int var8 = (int)(512.0 / this.field6665.getMainWindow().method8049());
         var3 = Math.max(var3, var8);
         var4 = this.field6665.getMainWindow().getScaledWidth() - var3;
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

         int var32 = this.field6665.getMainWindow().getScaledHeight();
         method5686(var1, var3, var32 - 60, var3 + var14, var32, -1873784752);
         BufferBuilder var33 = Tessellator.getInstance().getBuffer();
         RenderSystem.enableBlend();
         RenderSystem.disableTexture();
         RenderSystem.method27938();
         var33.begin(7, DefaultVertexFormats.POSITION_COLOR);

         for (Class9367 var22 = Class6979.method21542().method21548(); var15 != var10; var15 = var2.method38596(var15 + 1)) {
            int var23 = var2.method38593(var11[var15], !var5 ? 60 : 30, !var5 ? 20 : 60);
            int var24 = !var5 ? 60 : 100;
            int var25 = this.method5891(MathHelper.method37775(var23, 0, var24), 0, var24 / 2, var24);
            int var26 = var25 >> 24 & 0xFF;
            int var27 = var25 >> 16 & 0xFF;
            int var28 = var25 >> 8 & 0xFF;
            int var29 = var25 & 0xFF;
            var33.method17040(var22, (float)(var12 + 1), (float)var32, 0.0F).color(var27, var28, var29, var26).endVertex();
            var33.method17040(var22, (float)(var12 + 1), (float)(var32 - var23 + 1), 0.0F).color(var27, var28, var29, var26).endVertex();
            var33.method17040(var22, (float)var12, (float)(var32 - var23 + 1), 0.0F).color(var27, var28, var29, var26).endVertex();
            var33.method17040(var22, (float)var12, (float)var32, 0.0F).color(var27, var28, var29, var26).endVertex();
            var12++;
         }

         var33.method17065();
         Class4395.method13895(var33);
         RenderSystem.enableTexture();
         RenderSystem.disableBlend();
         if (!var5) {
            method5686(var1, var3 + 1, var32 - 60 + 1, var3 + 14, var32 - 60 + 10, -1873784752);
            this.field6666.method38801(var1, "20 TPS", (float)(var3 + 2), (float)(var32 - 60 + 2), 14737632);
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 60, -1);
         } else {
            method5686(var1, var3 + 1, var32 - 30 + 1, var3 + 14, var32 - 30 + 10, -1873784752);
            this.field6666.method38801(var1, "60 FPS", (float)(var3 + 2), (float)(var32 - 30 + 2), 14737632);
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 30, -1);
            method5686(var1, var3 + 1, var32 - 60 + 1, var3 + 14, var32 - 60 + 10, -1873784752);
            this.field6666.method38801(var1, "30 FPS", (float)(var3 + 2), (float)(var32 - 60 + 2), 14737632);
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 60, -1);
         }

         this.method5684(var1, var3, var3 + var14 - 1, var32 - 1, -1);
         this.method5685(var1, var3, var32 - 60, var32, -1);
         this.method5685(var1, var3 + var14 - 1, var32 - 60, var32, -1);
         if (var5 && this.field6665.gameSettings.framerateLimit > 0 && this.field6665.gameSettings.framerateLimit <= 250) {
            this.method5684(var1, var3, var3 + var14 - 1, var32 - 1 - (int)(1800.0 / (double)this.field6665.gameSettings.framerateLimit), -16711681);
         }

         String var34 = var18 + " ms min";
         String var35 = var16 / (long)var14 + " ms avg";
         String var36 = var19 + " ms max";
         this.field6666.drawStringWithShadow(var1, var34, (float)(var3 + 2), (float)(var32 - 60 - 9), 14737632);
         this.field6666.drawStringWithShadow(var1, var35, (float)(var3 + var14 / 2 - this.field6666.getStringWidth(var35) / 2), (float)(var32 - 60 - 9), 14737632);
         this.field6666.drawStringWithShadow(var1, var36, (float)(var3 + var14 - this.field6666.getStringWidth(var36)), (float)(var32 - 60 - 9), 14737632);
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
      int var14 = MathHelper.method37775((int) MathHelper.lerp(var3, (float)var6, (float)var10), 0, 255);
      int var15 = MathHelper.method37775((int) MathHelper.lerp(var3, (float)var7, (float)var11), 0, 255);
      int var16 = MathHelper.method37775((int) MathHelper.lerp(var3, (float)var8, (float)var12), 0, 255);
      int var17 = MathHelper.method37775((int) MathHelper.lerp(var3, (float)var9, (float)var13), 0, 255);
      return var14 << 24 | var15 << 16 | var16 << 8 | var17;
   }

   private static long method5893(long var0) {
      return var0 / 1024L / 1024L;
   }
}
