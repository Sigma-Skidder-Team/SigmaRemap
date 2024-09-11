package mapped;

import com.google.common.base.Charsets;
import com.google.common.collect.*;
import com.mojang.blaze3d.matrix.MatrixStack;
import net.minecraft.block.BlockState;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.entity.Entity;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.registry.Registry;

import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Collectors;

public class ParticleManager implements Class268 {
   private static final List<Class6843> field1167 = ImmutableList.of(
      Class6843.field29734, Class6843.field29735, Class6843.field29737, Class6843.field29736, Class6843.field29738
   );
   public ClientWorld field1168;
   private final Map<Class6843, Queue<Class4587>> field1169 =  com.google.common.collect.Maps.newIdentityHashMap();
   private final Queue<Class4589> field1170 = Queues.newArrayDeque();
   private final TextureManager field1171;
   private final Random field1172 = new Random();
   private final Map<ResourceLocation, Class3499<?>> field1173 = new HashMap<ResourceLocation, Class3499<?>>();
   private final Queue<Class4587> field1174 = Queues.newArrayDeque();
   private final Map<ResourceLocation, Class8976> field1175 = com.google.common.collect.Maps.newHashMap();
   private final AtlasTexture field1176 = new AtlasTexture(AtlasTexture.field1103);

   public ParticleManager(ClientWorld var1, TextureManager var2) {
      var2.method1073(this.field1176.getTextureLocation(), this.field1176);
      this.field1168 = var1;
      this.field1171 = var2;
      this.method1190();
   }

   private void method1190() {
      this.method1192(ParticleTypes.field34048, Class3531::new);
      this.method1192(ParticleTypes.field34049, Class3506::new);
      this.method1191(ParticleTypes.BARRIER, new Class3516());
      this.method1191(ParticleTypes.field34051, new Class3554());
      this.method1192(ParticleTypes.field34052, Class3542::new);
      this.method1192(ParticleTypes.field34103, Class3547::new);
      this.method1192(ParticleTypes.field34101, Class3568::new);
      this.method1192(ParticleTypes.field34106, Class3544::new);
      this.method1192(ParticleTypes.field34107, Class3529::new);
      this.method1192(ParticleTypes.field34053, Class3550::new);
      this.method1192(ParticleTypes.field34079, Class3500::new);
      this.method1192(ParticleTypes.field34054, Class3563::new);
      this.method1192(ParticleTypes.field34102, Class3507::new);
      this.method1192(ParticleTypes.field34055, Class3543::new);
      this.method1192(ParticleTypes.field34056, Class3545::new);
      this.method1192(ParticleTypes.field34105, Class3503::new);
      this.method1192(ParticleTypes.field34057, Class3538::new);
      this.method1192(ParticleTypes.field34058, Class3513::new);
      this.method1192(ParticleTypes.field34059, Class3564::new);
      this.method1192(ParticleTypes.field34060, Class3504::new);
      this.method1192(ParticleTypes.field34061, Class3509::new);
      this.method1192(ParticleTypes.field34062, Class3508::new);
      this.method1192(ParticleTypes.field34063, Class3535::new);
      this.method1191(ParticleTypes.field34064, new Class3551());
      this.method1192(ParticleTypes.field34065, Class3519::new);
      this.method1192(ParticleTypes.field34066, Class3511::new);
      this.method1192(ParticleTypes.field34067, Class3539::new);
      this.method1192(ParticleTypes.field34068, Class3540::new);
      this.method1191(ParticleTypes.field34069, new Class3520());
      this.method1192(ParticleTypes.field34070, Class3555::new);
      this.method1192(ParticleTypes.field34071, Class3521::new);
      this.method1192(ParticleTypes.field34072, Class3546::new);
      this.method1192(ParticleTypes.field34073, Class3523::new);
      this.method1192(ParticleTypes.field34074, Class3553::new);
      this.method1192(ParticleTypes.field34076, Class3552::new);
      this.method1192(ParticleTypes.field34075, Class3553::new);
      this.method1192(ParticleTypes.field34077, Class3537::new);
      this.method1192(ParticleTypes.field34078, Class3501::new);
      this.method1192(ParticleTypes.field34080, Class3566::new);
      this.method1192(ParticleTypes.field34081, Class3518::new);
      this.method1191(ParticleTypes.field34082, new Class3512());
      this.method1191(ParticleTypes.field34083, new Class3525());
      this.method1191(ParticleTypes.field34084, new Class3534());
      this.method1192(ParticleTypes.field34085, Class3557::new);
      this.method1192(ParticleTypes.field34086, Class3517::new);
      this.method1192(ParticleTypes.field34087, Class3560::new);
      this.method1192(ParticleTypes.field34104, Class3559::new);
      this.method1192(ParticleTypes.field34088, Class3515::new);
      this.method1192(ParticleTypes.field34089, Class3502::new);
      this.method1192(ParticleTypes.field34090, Class3536::new);
      this.method1192(ParticleTypes.field34091, Class3526::new);
      this.method1192(ParticleTypes.field34092, Class3532::new);
      this.method1192(ParticleTypes.field34093, Class3510::new);
      this.method1192(ParticleTypes.field34094, Class3549::new);
      this.method1192(ParticleTypes.field34096, Class3505::new);
      this.method1192(ParticleTypes.field34097, Class3498::new);
      this.method1192(ParticleTypes.field34095, Class3530::new);
      this.method1192(ParticleTypes.field34098, Class3562::new);
      this.method1192(ParticleTypes.field34099, Class3565::new);
      this.method1192(ParticleTypes.field34100, Class3524::new);
      this.method1192(ParticleTypes.field34108, Class3528::new);
      this.method1192(ParticleTypes.field34109, Class3561::new);
      this.method1192(ParticleTypes.field34110, Class3533::new);
      this.method1192(ParticleTypes.field34111, Class3548::new);
      this.method1192(ParticleTypes.field34112, Class3556::new);
      this.method1192(ParticleTypes.field34113, Class3522::new);
      this.method1192(ParticleTypes.field34114, Class3541::new);
      this.method1192(ParticleTypes.field34115, Class3514::new);
      this.method1192(ParticleTypes.field34116, Class3558::new);
      this.method1192(ParticleTypes.field34117, Class3527::new);
      this.method1192(ParticleTypes.field34118, Class3569::new);
      this.method1192(ParticleTypes.field34119, Class3567::new);
   }

   private <T extends IParticleData> void method1191(ParticleType<T> var1, Class3499<T> var2) {
      this.field1173.put(Registry.PARTICLE_TYPE.getKey(var1), var2);
   }

   private <T extends IParticleData> void method1192(ParticleType<T> var1, Class9116<T> var2) {
      Class8976 var5 = new Class8976(this);
      this.field1175.put(Registry.PARTICLE_TYPE.getKey(var1), var5);
      this.field1173.put(Registry.PARTICLE_TYPE.getKey(var1), var2.method34002(var5));
   }

   @Override
   public CompletableFuture<Void> method777(Class7121 var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6) {
      Map<ResourceLocation, List<ResourceLocation>> var9 = com.google.common.collect.Maps.newConcurrentMap();
      CompletableFuture[] var10 = Registry.PARTICLE_TYPE
         .method9190()
         .stream()
         .map(var4x -> CompletableFuture.runAsync(() -> this.method1194(var2, var4x, var9), var5))
         .toArray(CompletableFuture[]::new);
      return CompletableFuture.allOf(var10)
              .thenApplyAsync(var4x -> {
            var3.startTick();
            var3.startSection("stitching");
            Class8226 var7 = this.field1176.method1092(var2, var9.values().stream().<ResourceLocation>flatMap(Collection::stream), var3, 0);
            var3.endSection();
            var3.endTick();
            return var7;
         }, var5)
         .<Class8226>thenCompose(var1::method22225)
         .thenAcceptAsync(
            var3x -> {
               this.field1169.clear();
               var4.startTick();
               var4.startSection("upload");
               this.field1176.method1091(var3x);
               var4.endStartSection("bindSpriteSets");
               TextureAtlasSprite var6x = this.field1176.getSprite(Class1714.method7513());
               var9.forEach(
                  (var2xx, var3xx) -> {
                     ImmutableList var6xx = !var3xx.isEmpty()
                        ? var3xx.stream().<TextureAtlasSprite>map(this.field1176::getSprite).collect(ImmutableList.toImmutableList())
                        : ImmutableList.of(var6x);
                     this.field1175.get(var2xx).method32939(var6xx);
                  }
               );
               var4.endSection();
               var4.endTick();
            },
            var6
         );
   }

   public void close() {
      this.field1176.method1099();
   }

   private void method1194(IResourceManager var1, ResourceLocation var2, Map<ResourceLocation, List<ResourceLocation>> var3) {
      ResourceLocation var6 = new ResourceLocation(var2.getNamespace(), "particles/" + var2.getPath() + ".json");

      try (
         Class1783 var7 = var1.method580(var6);
         InputStreamReader var9 = new InputStreamReader(var7.method7763(), Charsets.UTF_8);
      ) {
         Class8532 var11 = Class8532.method30266(JSONUtils.fromJson(var9));
         List<ResourceLocation> var12 = var11.method30265();
         boolean var13 = this.field1175.containsKey(var2);
         if (var12 == null) {
            if (var13) {
               throw new IllegalStateException("Missing texture list for particle " + var2);
            }
         } else {
            if (!var13) {
               throw new IllegalStateException("Redundant texture list for particle " + var2);
            }

            var3.put(
               var2, var12.stream().map(var0 -> new ResourceLocation(var0.getNamespace(), "particle/" + var0.getPath())).collect(Collectors.toList())
            );
         }
      } catch (IOException var41) {
         throw new IllegalStateException("Failed to load description for particle " + var2, var41);
      }
   }

   public void method1195(Entity var1, IParticleData var2) {
      this.field1170.add(new Class4589(this.field1168, var1, var2));
   }

   public void method1196(Entity var1, IParticleData var2, int var3) {
      this.field1170.add(new Class4589(this.field1168, var1, var2, var3));
   }

   @Nullable
   public Class4587 method1197(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      Class4587 var16 = this.method1198(var1, var2, var4, var6, var8, var10, var12);
      if (var16 == null) {
         return null;
      } else {
         this.method1199(var16);
         return var16;
      }
   }

   @Nullable
   private <T extends IParticleData> Class4587 method1198(T var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      Class3499 var16 = this.field1173.get(Registry.PARTICLE_TYPE.getKey(var1.getType()));
      return var16 != null ? var16.method12199(var1, this.field1168, var2, var4, var6, var8, var10, var12) : null;
   }

   public void method1199(Class4587 var1) {
      if (var1 != null && (!(var1 instanceof Class4603) || Class7944.method26850())) {
         this.field1174.add(var1);
      }
   }

   public void tick() {
      this.field1169.forEach((var1, var2) -> {
         this.field1168.getProfiler().startSection(var1.toString());
         this.method1201(var2);
         this.field1168.getProfiler().endSection();
      });
      if (!this.field1170.isEmpty()) {
         ArrayList var3 = Lists.newArrayList();

         for (Class4589 var5 : this.field1170) {
            var5.method14500();
            if (!var5.method14522()) {
               var3.add(var5);
            }
         }

         this.field1170.removeAll(var3);
      }

      Class4587 var6;
      if (!this.field1174.isEmpty()) {
         while ((var6 = this.field1174.poll()) != null) {
            Queue var7 = this.field1169.computeIfAbsent(var6.method14501(), var0 -> EvictingQueue.create(16384));
            if (!(var6 instanceof Class4618) || !this.method1209(var6, var7)) {
               var7.add(var6);
            }
         }
      }
   }

   private void method1201(Collection<Class4587> var1) {
      if (!var1.isEmpty()) {
         long var4 = System.currentTimeMillis();
         int var6 = var1.size();
         Iterator var7 = var1.iterator();

         while (var7.hasNext()) {
            Class4587 var8 = (Class4587)var7.next();
            this.method1202(var8);
            if (!var8.method14522()) {
               var7.remove();
            }

            var6--;
            if (System.currentTimeMillis() > var4 + 20L) {
               break;
            }
         }

         if (var6 > 0) {
            int var11 = var6;

            for (Iterator var9 = var1.iterator(); var9.hasNext() && var11 > 0; var11--) {
               Class4587 var10 = (Class4587)var9.next();
               var10.method14518();
               var9.remove();
            }
         }
      }
   }

   private void method1202(Class4587 var1) {
      try {
         var1.method14500();
      } catch (Throwable var7) {
         CrashReport var5 = CrashReport.makeCrashReport(var7, "Ticking Particle");
         CrashReportCategory var6 = var5.makeCategory("Particle being ticked");
         var6.addDetail("Particle", var1::toString);
         var6.addDetail("Particle Type", var1.method14501()::toString);
         throw new ReportedException(var5);
      }
   }

   public void method1203(MatrixStack var1, Class7735 var2, Class1699 var3, ActiveRenderInfo var4, float var5) {
      this.method1204(var1, var2, var3, var4, var5, (Class7647)null);
   }

   public void method1204(MatrixStack var1, Class7735 var2, Class1699 var3, ActiveRenderInfo var4, float var5, Class7647 var6) {
      var3.method7317();
      Runnable var9 = () -> {
         RenderSystem.disableAlphaTest();
         RenderSystem.method27939();
         RenderSystem.enableDepthTest();
         RenderSystem.method27840();
         if (Class9299.field42864.method20245()) {
            RenderSystem.method27860(33986);
            RenderSystem.enableTexture();
            RenderSystem.method27860(33984);
         }
      };
      FluidState var10 = var4.method37512();
      boolean var11 = var10.method23486(FluidTags.field40469);
      RenderSystem.pushMatrix();
      RenderSystem.method27888(var1.getLast().getMatrix());
      Collection<Class6843> var12 = field1167;
      if (Class9299.field42864.method20245()) {
         var12 = this.field1169.keySet();
      }

      for (Class6843 var14 : var12) {
         if (var14 != Class6843.field29739) {
            var9.run();
            Iterable<Class4587> var15 = this.field1169.get(var14);
            if (var15 != null) {
               RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
               Tessellator var16 = Tessellator.getInstance();
               BufferBuilder var17 = var16.getBuffer();
               var14.method20824(var17, this.field1171);

               for (Class4587 var19 : var15) {
                  if (var6 == null || !var19.method14526() || var6.method25122(var19.method14523())) {
                     try {
                        if (var11 || !(var19 instanceof Class4607) || var19.field22044 != 0.0 || var19.field22045 != 0.0 || var19.field22046 != 0.0) {
                           var19.method14510(var17, var4, var5);
                        }
                     } catch (Throwable var23) {
                        CrashReport var21 = CrashReport.makeCrashReport(var23, "Rendering Particle");
                        CrashReportCategory var22 = var21.makeCategory("Particle being rendered");
                        var22.addDetail("Particle", var19::toString);
                        var22.addDetail("Particle Type", var14::toString);
                        throw new ReportedException(var21);
                     }
                  }
               }

               var14.method20825(var16);
            }
         }
      }

      RenderSystem.popMatrix();
      RenderSystem.depthMask(true);
      RenderSystem.depthFunc(515);
      RenderSystem.disableBlend();
      RenderSystem.method27939();
      var3.method7316();
      RenderSystem.method27841();
      RenderSystem.enableDepthTest();
   }

   public void clearEffects(ClientWorld var1) {
      this.field1168 = var1;
      this.field1169.clear();
      this.field1170.clear();
   }

   public void method1206(BlockPos var1, BlockState var2) {
      boolean var6;
      if (Class9299.field42824.method20214() && Class9299.field42830.method20214()) {
         Block var5 = var2.getBlock();
         var6 = !Class9299.method35064(var2, Class9299.field42830, this.field1168, var1)
            && !Class9299.method35064(var2, Class9299.field42824, this.field1168, var1, this);
      } else {
         var6 = !var2.isAir();
      }

      if (var6) {
         VoxelShape var9 = var2.method23412(this.field1168, var1);
         double var7 = 0.25;
         var9.method19520(
            (var3, var5x, var7x, var9x, var11, var13) -> {
               double var17 = Math.min(1.0, var9x - var3);
               double var19 = Math.min(1.0, var11 - var5x);
               double var21 = Math.min(1.0, var13 - var7x);
               int var23 = Math.max(2, MathHelper.method37774(var17 / 0.25));
               int var24 = Math.max(2, MathHelper.method37774(var19 / 0.25));
               int var25 = Math.max(2, MathHelper.method37774(var21 / 0.25));

               for (int var26 = 0; var26 < var23; var26++) {
                  for (int var27 = 0; var27 < var24; var27++) {
                     for (int var28 = 0; var28 < var25; var28++) {
                        double var29 = ((double)var26 + 0.5) / (double)var23;
                        double var31 = ((double)var27 + 0.5) / (double)var24;
                        double var33 = ((double)var28 + 0.5) / (double)var25;
                        double var35 = var29 * var17 + var3;
                        double var37 = var31 * var19 + var5x;
                        double var39 = var33 * var21 + var7x;
                        this.method1199(
                           new Class4609(
                                 this.field1168,
                                 (double)var1.getX() + var35,
                                 (double)var1.getY() + var37,
                                 (double)var1.getZ() + var39,
                                 var29 - 0.5,
                                 var31 - 0.5,
                                 var33 - 0.5,
                                 var2
                              )
                              .method14540(var1)
                        );
                     }
                  }
               }
            }
         );
      }
   }

   public void addBlockHitEffects(BlockPos var1, Direction var2) {
      BlockState var5 = this.field1168.getBlockState(var1);
      if (var5.getRenderType() != BlockRenderType.field9885) {
         int var6 = var1.getX();
         int var7 = var1.getY();
         int var8 = var1.getZ();
         float var9 = 0.1F;
         AxisAlignedBB var10 = var5.method23412(this.field1168, var1).method19514();
         double var11 = (double)var6 + this.field1172.nextDouble() * (var10.maxX - var10.minX - 0.2F) + 0.1F + var10.minX;
         double var13 = (double)var7 + this.field1172.nextDouble() * (var10.maxY - var10.minY - 0.2F) + 0.1F + var10.minY;
         double var15 = (double)var8 + this.field1172.nextDouble() * (var10.maxZ - var10.minZ - 0.2F) + 0.1F + var10.minZ;
         if (var2 == Direction.DOWN) {
            var13 = (double)var7 + var10.minY - 0.1F;
         }

         if (var2 == Direction.field673) {
            var13 = (double)var7 + var10.maxY + 0.1F;
         }

         if (var2 == Direction.NORTH) {
            var15 = (double)var8 + var10.minZ - 0.1F;
         }

         if (var2 == Direction.SOUTH) {
            var15 = (double)var8 + var10.maxZ + 0.1F;
         }

         if (var2 == Direction.WEST) {
            var11 = (double)var6 + var10.minX - 0.1F;
         }

         if (var2 == Direction.EAST) {
            var11 = (double)var6 + var10.maxX + 0.1F;
         }

         this.method1199(new Class4609(this.field1168, var11, var13, var15, 0.0, 0.0, 0.0, var5).method14540(var1).method14513(0.2F).method14512(0.6F));
      }
   }

   public String method1208() {
      return String.valueOf(this.field1169.values().stream().mapToInt(Collection::size).sum());
   }

   private boolean method1209(Class4587 var1, Queue<Class4587> var2) {
      for (Class4587 var6 : var2) {
         if (var6 instanceof Class4618 && var1.field22038 == var6.field22038 && var1.field22039 == var6.field22039 && var1.field22040 == var6.field22040) {
            var6.field22055 = 0;
            return true;
         }
      }

      return false;
   }

   public void method1210(BlockPos var1, BlockRayTraceResult var2) {
      BlockState var5 = this.field1168.getBlockState(var1);
      if (var5 != null) {
         boolean var6 = Class9299.method35064(var5, Class9299.field42825, this.field1168, var2, this);
         if (!var6) {
            Direction var7 = var2.getFace();
            this.addBlockHitEffects(var1, var7);
         }
      }
   }
}
