package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.particles.IParticleData;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class ClientWorld extends World {
   public final Int2ObjectMap<Entity> field9025 = new Int2ObjectOpenHashMap();
   private final ClientPlayNetHandler field9026;
   private final WorldRenderer field9027;
   private final Class6606 field9028;
   private Class6349 field9029;
   private final Minecraft field9030 = Minecraft.getInstance();
   private final List<AbstractClientPlayerEntity> field9031 = Lists.newArrayList();
   private Class6886 field9032 = new Class6886();
   private final Map<String, Class7529> field9033 = Maps.newHashMap();
   private int field9034;
   private final Object2ObjectArrayMap<Class8980, Class8960> field9035 = Util.<Object2ObjectArrayMap<Class8980, Class8960>>make(
      new Object2ObjectArrayMap(3), var0 -> {
         var0.put(Class8527.field38301, new Class8960());
         var0.put(Class8527.field38302, new Class8960());
         var0.put(Class8527.field38303, new Class8960());
      }
   );
   private Class1705 field9036;
   private boolean field9037 = false;

   public ClientWorld(
           ClientPlayNetHandler var1, Class6606 var2, RegistryKey<World> var3, DimensionType var4, int var5, Supplier<IProfiler> var6, WorldRenderer var7, boolean var8, long var9
   ) {
      super(var2, var3, var4, var6, true, var8, var9);
      this.field9026 = var1;
      this.field9028 = var2;
      this.field9027 = var7;
      if (var1 != null && var4 != null) {
         this.field9029 = Class6349.method19301(var4);
         this.field9036 = new Class1705(this, var5);
      }

      this.method6882(new BlockPos(8, 64, 8), 0.0F);
      this.method6766();
      this.method6768();
      if (Class9299.field42768.method20214()) {
         Class9299.method35070(this, Class9299.field42768);
      }

      Class9299.method35085(Class9299.field43004, this);
      if (this.field9030.playerController != null && this.field9030.playerController.getClass() == PlayerController.class) {
         this.field9030.playerController = new Class7316(this.field9030, this.field9026);
         Class7050.method21971((Class7316)this.field9030.playerController);
      }
   }

   public Class6349 method6830() {
      return this.field9029;
   }

   public void tick(BooleanSupplier var1) {
      this.method6810().method24555();
      this.method6832();
      this.getProfiler().startSection("blocks");
      this.field9036.method7401(var1);
      this.getProfiler().endSection();
   }

   private void method6832() {
      this.method6833(this.worldInfo.method20033() + 1L);
      if (this.worldInfo.method20046().method17135(Class5462.field24232)) {
         this.method6834(this.worldInfo.method20034() + 1L);
      }
   }

   public void method6833(long var1) {
      this.field9028.method20039(var1);
   }

   public void method6834(long var1) {
      if (var1 >= 0L) {
         this.method6789().<Class7466>method17128(Class5462.field24232).method24175(true, (MinecraftServer)null);
      } else {
         var1 = -var1;
         this.method6789().<Class7466>method17128(Class5462.field24232).method24175(false, (MinecraftServer)null);
      }

      this.field9028.method20040(var1);
   }

   public Iterable<Entity> method6835() {
      return this.field9025.values();
   }

   public void tickEntities() {
      IProfiler var3 = this.getProfiler();
      var3.startSection("entities");
      ObjectIterator var4 = this.field9025.int2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Entity var6 = (Entity)var5.getValue();
         if (!var6.isPassenger()) {
            var3.startSection("tick");
            if (!var6.removed) {
               this.method6754(this::method6837, var6);
            }

            var3.endSection();
            var3.startSection("remove");
            if (var6.removed) {
               var4.remove();
               this.method6849(var6);
            }

            var3.endSection();
         }
      }

      this.method6753();
      var3.endSection();
   }

   public void method6837(Entity var1) {
      if (!(var1 instanceof PlayerEntity) && !this.getChunkProvider().method7351(var1)) {
         this.method6839(var1);
      } else {
         var1.method3274(var1.getPosX(), var1.getPosY(), var1.getPosZ());
         var1.prevRotationYaw = var1.rotationYaw;
         var1.prevRotationPitch = var1.rotationPitch;
         if (var1.addedToChunk || var1.isSpectator()) {
            var1.ticksExisted++;
            this.getProfiler().method22504(() -> Registry.ENTITY_TYPE.getKey(var1.getType()).toString());
            if (Class9561.method37057(var1)) {
               var1.tick();
            }

            this.getProfiler().endSection();
         }

         this.method6839(var1);
         if (var1.addedToChunk) {
            for (Entity var5 : var1.method3408()) {
               this.method6838(var1, var5);
            }
         }
      }
   }

   public void method6838(Entity var1, Entity var2) {
      if (var2.removed || var2.getRidingEntity() != var1) {
         var2.stopRiding();
      } else if (var2 instanceof PlayerEntity || this.getChunkProvider().method7351(var2)) {
         var2.method3274(var2.getPosX(), var2.getPosY(), var2.getPosZ());
         var2.prevRotationYaw = var2.rotationYaw;
         var2.prevRotationPitch = var2.rotationPitch;
         if (var2.addedToChunk) {
            var2.ticksExisted++;
            var2.method2868();
         }

         this.method6839(var2);
         if (var2.addedToChunk) {
            for (Entity var6 : var2.method3408()) {
               this.method6838(var2, var6);
            }
         }
      }
   }

   private void method6839(Entity var1) {
      if (var1.method3406()) {
         this.getProfiler().startSection("chunkCheck");
         int var4 = MathHelper.floor(var1.getPosX() / 16.0);
         int var5 = MathHelper.floor(var1.getPosY() / 16.0);
         int var6 = MathHelper.floor(var1.getPosZ() / 16.0);
         if (!var1.addedToChunk || var1.chunkCoordX != var4 || var1.chunkCoordY != var5 || var1.chunkCoordZ != var6) {
            if (var1.addedToChunk && this.method6843(var1.chunkCoordX, var1.chunkCoordZ)) {
               this.getChunk(var1.chunkCoordX, var1.chunkCoordZ).method7133(var1, var1.chunkCoordY);
            }

            if (!var1.method3405() && !this.method6843(var4, var6)) {
               if (var1.addedToChunk) {
                  LOGGER.warn("Entity {} left loaded chunk area", var1);
               }

               var1.addedToChunk = false;
            } else {
               this.getChunk(var4, var6).method7063(var1);
            }
         }

         this.getProfiler().endSection();
      }
   }

   public void method6840(Chunk var1) {
      List<TileEntity> var4;
      if (!Class9299.field42944.method20238()) {
         var4 = this.tileEntitiesToBeRemoved;
      } else {
         var4 = (List<TileEntity>) Class9299.method35072(this, Class9299.field42944);
      }

      var4.addAll(var1.method7145().values());
      this.field9036.getLightManager().method605(var1.method7072(), false);
   }

   public void method6841(int var1, int var2) {
      this.field9035.forEach((var2x, var3) -> var3.method32732(var1, var2));
   }

   public void method6842() {
      this.field9035.forEach((var0, var1) -> var1.method32733());
   }

   @Override
   public boolean method6843(int var1, int var2) {
      return true;
   }

   public int method6844() {
      return this.field9025.size();
   }

   public void method6845(int var1, AbstractClientPlayerEntity var2) {
      this.method6847(var1, var2);
      this.field9031.add(var2);
   }

   public void method6846(int var1, Entity var2) {
      this.method6847(var1, var2);
   }

   private void method6847(int var1, Entity var2) {
      if (!Class9299.field42807.method20241() || !Class9299.method35085(Class9299.field42807, var2, this)) {
         this.method6848(var1);
         this.field9025.put(var1, var2);
         this.getChunkProvider()
            .method7346(MathHelper.floor(var2.getPosX() / 16.0), MathHelper.floor(var2.getPosZ() / 16.0), ChunkStatus.FULL, true)
            .method7063(var2);
         if (Class9299.field42836.method20214()) {
            Class9299.method35070(var2, Class9299.field42836);
         }

         this.method6865(var2);
      }
   }

   public void method6848(int var1) {
      Entity var4 = (Entity)this.field9025.remove(var1);
      if (var4 != null) {
         var4.method2904();
         this.method6849(var4);
      }
   }

   private void method6849(Entity var1) {
      var1.detach();
      if (var1.addedToChunk) {
         this.getChunk(var1.chunkCoordX, var1.chunkCoordZ).method7132(var1);
      }

      this.field9031.remove(var1);
      if (Class9299.field42837.method20214()) {
         Class9299.method35070(var1, Class9299.field42837);
      }

      if (Class9299.field42794.method20241()) {
         Class9299.method35085(Class9299.field42794, var1, this);
      }

      this.method6866(var1);
   }

   public void method6850(Chunk var1) {
      ObjectIterator var4 = this.field9025.int2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Entity var6 = (Entity)var5.getValue();
         int var7 = MathHelper.floor(var6.getPosX() / 16.0);
         int var8 = MathHelper.floor(var6.getPosZ() / 16.0);
         if (var7 == var1.method7072().field32174 && var8 == var1.method7072().field32175) {
            var1.method7063(var6);
         }
      }
   }

   @Nullable
   @Override
   public Entity getEntityByID(int var1) {
      return (Entity)this.field9025.get(var1);
   }

   public void method6851(BlockPos var1, BlockState var2) {
      this.setBlockState(var1, var2, 19);
   }

   @Override
   public void sendQuittingDisconnectingPacket() {
      this.field9026.getNetworkManager().method30701(new TranslationTextComponent("multiplayer.status.quitting"));
   }

   public void method6852(int var1, int var2, int var3) {
      int var6 = 32;
      Random var7 = new Random();
      boolean var8 = false;
      if (this.field9030.playerController.method23157() == Class1894.field11103) {
         for (ItemStack var10 : this.field9030.player.method2946()) {
            if (var10.getItem() == Blocks.field36765.method11581()) {
               var8 = true;
               break;
            }
         }
      }

      BlockPos.Mutable var11 = new BlockPos.Mutable();

      for (int var12 = 0; var12 < 667; var12++) {
         this.method6853(var1, var2, var3, 16, var7, var8, var11);
         this.method6853(var1, var2, var3, 32, var7, var8, var11);
      }
   }

   public void method6853(int var1, int var2, int var3, int var4, Random var5, boolean var6, BlockPos.Mutable var7) {
      int var10 = var1 + this.rand.nextInt(var4) - this.rand.nextInt(var4);
      int var11 = var2 + this.rand.nextInt(var4) - this.rand.nextInt(var4);
      int var12 = var3 + this.rand.nextInt(var4) - this.rand.nextInt(var4);
      var7.method8372(var10, var11, var12);
      BlockState var13 = this.getBlockState(var7);
      var13.getBlock().method11512(var13, this, var7, var5);
      FluidState var14 = this.getFluidState(var7);
      if (!var14.method23474()) {
         var14.method23480(this, var7, var5);
         IParticleData var15 = var14.method23485();
         if (var15 != null && this.rand.nextInt(10) == 0) {
            boolean var16 = var13.method23454(this, var7, Direction.DOWN);
            BlockPos var17 = var7.down();
            this.method6854(var17, this.getBlockState(var17), var15, var16);
         }
      }

      if (var6 && var13.method23448(Blocks.field36765)) {
         this.method6746(ParticleTypes.BARRIER, (double)var10 + 0.5, (double)var11 + 0.5, (double)var12 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!var13.method23456(this, var7)) {
         this.getBiome(var7)
            .method32522()
            .ifPresent(
               var2x -> {
                  if (var2x.method25615(this.rand)) {
                     this.method6746(
                        var2x.method25614(),
                        (double)var7.getX() + this.rand.nextDouble(),
                        (double)var7.getY() + this.rand.nextDouble(),
                        (double)var7.getZ() + this.rand.nextDouble(),
                        0.0,
                        0.0,
                        0.0
                     );
                  }
               }
            );
      }
   }

   private void method6854(BlockPos var1, BlockState var2, IParticleData var3, boolean var4) {
      if (var2.method23449().method23474()) {
         VoxelShape var7 = var2.method23414(this, var1);
         double var8 = var7.method19513(Class113.field414);
         if (!(var8 < 1.0)) {
            if (!var2.method23446(BlockTags.field32781)) {
               double var10 = var7.method19512(Class113.field414);
               if (!(var10 > 0.0)) {
                  BlockPos var12 = var1.down();
                  BlockState var13 = this.getBlockState(var12);
                  VoxelShape var14 = var13.method23414(this, var12);
                  double var15 = var14.method19513(Class113.field414);
                  if (var15 < 1.0 && var13.method23449().method23474()) {
                     this.method6855(var1, var3, var7, (double)var1.getY() - 0.05);
                  }
               } else {
                  this.method6855(var1, var3, var7, (double)var1.getY() + var10 - 0.05);
               }
            }
         } else if (var4) {
            this.method6856(
               (double)var1.getX(),
               (double)(var1.getX() + 1),
               (double)var1.getZ(),
               (double)(var1.getZ() + 1),
               (double)(var1.getY() + 1) - 0.05,
               var3
            );
         }
      }
   }

   private void method6855(BlockPos var1, IParticleData var2, VoxelShape var3, double var4) {
      this.method6856(
         (double)var1.getX() + var3.method19512(Class113.field413),
         (double)var1.getX() + var3.method19513(Class113.field413),
         (double)var1.getZ() + var3.method19512(Class113.field415),
         (double)var1.getZ() + var3.method19513(Class113.field415),
         var4,
         var2
      );
   }

   private void method6856(double var1, double var3, double var5, double var7, double var9, IParticleData var11) {
      this.method6746(
         var11,
         MathHelper.lerp(this.rand.nextDouble(), var1, var3),
         var9,
         MathHelper.lerp(this.rand.nextDouble(), var5, var7),
         0.0,
         0.0,
         0.0
      );
   }

   public void method6857() {
      ObjectIterator var3 = this.field9025.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         Entity var5 = (Entity)var4.getValue();
         if (var5.removed) {
            var3.remove();
            this.method6849(var5);
         }
      }
   }

   @Override
   public CrashReportCategory fillCrashReport(CrashReport var1) {
      CrashReportCategory var4 = super.fillCrashReport(var1);
      var4.addDetail("Server brand", () -> this.field9030.player.method5395());
      var4.addDetail("Server type", () -> this.field9030.getIntegratedServer() != null ? "Integrated singleplayer server" : "Non-integrated multiplayer server");
      return var4;
   }

   @Override
   public void method6743(PlayerEntity var1, double var2, double var4, double var6, SoundEvent var8, Class2266 var9, float var10, float var11) {
      if (Class9299.field42848.method20214()) {
         Object var14 = Class9299.field42848.method20217(var1, var8, var9, var10, var11);
         if (Class9299.method35064(var14, Class9299.field42809) || Class9299.method35070(var14, Class9299.field42980) == null) {
            return;
         }

         var8 = (SoundEvent)Class9299.method35070(var14, Class9299.field42980);
         var9 = (Class2266)Class9299.method35070(var14, Class9299.field42981);
         var10 = Class9299.method35067(var14, Class9299.field42982);
      }

      if (var1 == this.field9030.player) {
         this.method6745(var2, var4, var6, var8, var9, var10, var11, false);
      }
   }

   @Override
   public void method6744(PlayerEntity var1, Entity var2, SoundEvent var3, Class2266 var4, float var5, float var6) {
      if (Class9299.field42848.method20214()) {
         Object var9 = Class9299.field42848.method20217(var1, var3, var4, var5, var6);
         if (Class9299.method35064(var9, Class9299.field42809) || Class9299.method35070(var9, Class9299.field42980) == null) {
            return;
         }

         var3 = (SoundEvent)Class9299.method35070(var9, Class9299.field42980);
         var4 = (Class2266)Class9299.method35070(var9, Class9299.field42981);
         var5 = Class9299.method35067(var9, Class9299.field42982);
      }

      if (var1 == this.field9030.player) {
         this.field9030.getSoundHandler().method1000(new Class6332(var3, var4, var2));
      }
   }

   public void method6858(BlockPos var1, SoundEvent var2, Class2266 var3, float var4, float var5, boolean var6) {
      this.method6745((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5, var2, var3, var4, var5, var6);
   }

   @Override
   public void method6745(double var1, double var3, double var5, SoundEvent var7, Class2266 var8, float var9, float var10, boolean var11) {
      double var14 = this.field9030.gameRenderer.getActiveRenderInfo().getPos().method11343(var1, var3, var5);
      MinecraftSoundManager var16 = new MinecraftSoundManager(var7, var8, var9, var10, var1, var3, var5);
      if (var11 && var14 > 100.0) {
         double var17 = Math.sqrt(var14) / 40.0;
         this.field9030.getSoundHandler().method1001(var16, (int)(var17 * 20.0));
      } else {
         this.field9030.getSoundHandler().method1000(var16);
      }
   }

   @Override
   public void method6804(double var1, double var3, double var5, double var7, double var9, double var11, CompoundNBT var13) {
      this.field9030.particles.method1199(new Class4591(this, var1, var3, var5, var7, var9, var11, this.field9030.particles, var13));
   }

   @Override
   public void method6811(Packet<?> var1) {
      this.field9026.sendPacket(var1);
   }

   @Override
   public Class282 method6816() {
      return this.field9026.method15783();
   }

   public void method6859(Class6886 var1) {
      this.field9032 = var1;
   }

   @Override
   public Class6802<Block> method6860() {
      return Class6804.<Block>method20727();
   }

   @Override
   public Class6802<Fluid> method6861() {
      return Class6804.<Fluid>method20727();
   }

   public Class1705 getChunkProvider() {
      return this.field9036;
   }

   @Override
   public boolean setBlockState(BlockPos pos, BlockState newState, int flags) {
      this.field9037 = this.method6863();
      boolean var6 = super.setBlockState(pos, newState, flags);
      this.field9037 = false;
      return var6;
   }

   private boolean method6863() {
      if (!(this.field9030.playerController instanceof Class7316)) {
         return false;
      } else {
         Class7316 var3 = (Class7316)this.field9030.playerController;
         return var3.method23162();
      }
   }

   public boolean method6864() {
      return this.field9037;
   }

   public void method6865(Entity var1) {
      Class9387.method35629(var1, this);
      if (Class7944.method26970()) {
         Class9446.method36307(var1, Class7944.method26874());
      }
   }

   public void method6866(Entity var1) {
      Class9387.method35630(var1, this);
      if (Class7944.method26970()) {
         Class9446.method36308(var1, Class7944.method26874());
      }
   }

   @Nullable
   @Override
   public Class7529 method6798(String var1) {
      return this.field9033.get(var1);
   }

   @Override
   public void method6799(Class7529 var1) {
      this.field9033.put(var1.method24608(), var1);
   }

   @Override
   public int method6800() {
      return 0;
   }

   @Override
   public Class6886 method6805() {
      return this.field9032;
   }

   @Override
   public Class8933 method6817() {
      return this.field9026.method15798();
   }

   @Override
   public DynamicRegistries method6867() {
      return this.field9026.method15802();
   }

   @Override
   public void notifyBlockUpdate(BlockPos var1, BlockState var2, BlockState var3, int var4) {
      this.field9027.method901(this, var1, var2, var3, var4);
   }

   @Override
   public void markBlockRangeForRenderUpdate(BlockPos var1, BlockState var2, BlockState var3) {
      this.field9027.method904(var1, var2, var3);
   }

   public void method6868(int var1, int var2, int var3) {
      this.field9027.method905(var1, var2, var3);
   }

   @Override
   public void method6803(int var1, BlockPos var2, int var3) {
      this.field9027.method920(var1, var2, var3);
   }

   @Override
   public void method6801(int var1, BlockPos var2, int var3) {
      this.field9027.method918(var1, var2, var3);
   }

   @Override
   public void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4) {
      try {
         this.field9027.method919(var1, var2, var3, var4);
      } catch (Throwable var10) {
         CrashReport var8 = CrashReport.makeCrashReport(var10, "Playing level event");
         CrashReportCategory var9 = var8.makeCategory("Level event being played");
         var9.addDetail("Block coordinates", CrashReportCategory.method32804(var3));
         var9.addDetail("Event source", var1);
         var9.addDetail("Event type", var2);
         var9.addDetail("Event data", var4);
         throw new ReportedException(var8);
      }
   }

   @Override
   public void method6746(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.field9027.method911(var1, var1.getType().method24006(), var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method6747(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.field9027.method911(var1, var1.getType().method24006() || var2, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public void method6748(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.field9027.method912(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method6749(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.field9027.method912(var1, var1.getType().method24006() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public List<AbstractClientPlayerEntity> method6870() {
      return this.field9031;
   }

   @Override
   public Biome method6871(int var1, int var2, int var3) {
      return this.method6867().<Biome>getRegistry(Registry.BIOME_KEY).getOrThrow(Class9495.field44122);
   }

   public float method6872(float var1) {
      float var4 = this.method7001(var1);
      float var5 = 1.0F - (MathHelper.cos(var4 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      var5 = MathHelper.clamp(var5, 0.0F, 1.0F);
      var5 = 1.0F - var5;
      var5 = (float)((double)var5 * (1.0 - (double)(this.method6792(var1) * 5.0F) / 16.0));
      var5 = (float)((double)var5 * (1.0 - (double)(this.method6790(var1) * 5.0F) / 16.0));
      return var5 * 0.8F + 0.2F;
   }

   public Vector3d method6873(BlockPos var1, float var2) {
      float var5 = this.method7001(var2);
      float var6 = MathHelper.cos(var5 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var6 = MathHelper.clamp(var6, 0.0F, 1.0F);
      Biome var7 = this.getBiome(var1);
      int var8 = var7.method32498();
      float var9 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var8 & 0xFF) / 255.0F;
      var9 *= var6;
      var10 *= var6;
      var11 *= var6;
      float var12 = this.method6792(var2);
      if (var12 > 0.0F) {
         float var13 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.6F;
         float var14 = 1.0F - var12 * 0.75F;
         var9 = var9 * var14 + var13 * (1.0F - var14);
         var10 = var10 * var14 + var13 * (1.0F - var14);
         var11 = var11 * var14 + var13 * (1.0F - var14);
      }

      float var20 = this.method6790(var2);
      if (var20 > 0.0F) {
         float var21 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.2F;
         float var15 = 1.0F - var20 * 0.75F;
         var9 = var9 * var15 + var21 * (1.0F - var15);
         var10 = var10 * var15 + var21 * (1.0F - var15);
         var11 = var11 * var15 + var21 * (1.0F - var15);
      }

      if (this.field9034 > 0) {
         float var22 = (float)this.field9034 - var2;
         if (var22 > 1.0F) {
            var22 = 1.0F;
         }

         var22 *= 0.45F;
         var9 = var9 * (1.0F - var22) + 0.8F * var22;
         var10 = var10 * (1.0F - var22) + 0.8F * var22;
         var11 = var11 * (1.0F - var22) + 1.0F * var22;
      }

      return new Vector3d((double)var9, (double)var10, (double)var11);
   }

   public Vector3d method6874(float var1) {
      float var4 = this.method7001(var1);
      float var5 = MathHelper.cos(var4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var5 = MathHelper.clamp(var5, 0.0F, 1.0F);
      float var6 = 1.0F;
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = this.method6792(var1);
      if (var9 > 0.0F) {
         float var10 = (var6 * 0.3F + var7 * 0.59F + var8 * 0.11F) * 0.6F;
         float var11 = 1.0F - var9 * 0.95F;
         var6 = var6 * var11 + var10 * (1.0F - var11);
         var7 = var7 * var11 + var10 * (1.0F - var11);
         var8 = var8 * var11 + var10 * (1.0F - var11);
      }

      var6 *= var5 * 0.9F + 0.1F;
      var7 *= var5 * 0.9F + 0.1F;
      var8 *= var5 * 0.85F + 0.15F;
      float var17 = this.method6790(var1);
      if (var17 > 0.0F) {
         float var18 = (var6 * 0.3F + var7 * 0.59F + var8 * 0.11F) * 0.2F;
         float var12 = 1.0F - var17 * 0.95F;
         var6 = var6 * var12 + var18 * (1.0F - var12);
         var7 = var7 * var12 + var18 * (1.0F - var12);
         var8 = var8 * var12 + var18 * (1.0F - var12);
      }

      return new Vector3d((double)var6, (double)var7, (double)var8);
   }

   public float method6875(float var1) {
      float var4 = this.method7001(var1);
      float var5 = 1.0F - (MathHelper.cos(var4 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      var5 = MathHelper.clamp(var5, 0.0F, 1.0F);
      return var5 * var5 * 0.5F;
   }

   public int getTimeLightningFlash() {
      return this.field9034;
   }

   @Override
   public void setTimeLightningFlash(int var1) {
      this.field9034 = var1;
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      boolean var5 = this.method6830().method19307();
      boolean var6 = Class7944.method26921();
      if (!var2) {
         return var5 ? 0.9F : 1.0F;
      } else {
         switch (Class8070.field34651[var1.ordinal()]) {
            case 1:
               return var5 ? 0.9F : (var6 ? Shaders.field40932 : 0.5F);
            case 2:
               return var5 ? 0.9F : 1.0F;
            case 3:
            case 4:
               if (Class7944.method26921()) {
                  return Shaders.field40934;
               }

               return 0.8F;
            case 5:
            case 6:
               if (Class7944.method26921()) {
                  return Shaders.field40933;
               }

               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int method6878(BlockPos var1, Class8980 var2) {
      Class8960 var5 = (Class8960)this.field9035.get(var2);
      return var5.method32731(var1, () -> this.method6879(var1, var2));
   }

   public int method6879(BlockPos var1, Class8980 var2) {
      int var5 = Minecraft.getInstance().gameSettings.biomeBlendRadius;
      if (var5 == 0) {
         return var2.method32943(this.getBiome(var1), (double)var1.getX(), (double)var1.getZ());
      } else {
         int var6 = (var5 * 2 + 1) * (var5 * 2 + 1);
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         Class8893 var10 = new Class8893(
            var1.getX() - var5, var1.getY(), var1.getZ() - var5, var1.getX() + var5, var1.getY(), var1.getZ() + var5
         );
         BlockPos.Mutable var11 = new BlockPos.Mutable();

         while (var10.method32365()) {
            var11.method8372(var10.method32366(), var10.method32367(), var10.method32368());
            int var12 = var2.method32943(this.getBiome(var11), (double)var11.getX(), (double)var11.getZ());
            var7 += (var12 & 0xFF0000) >> 16;
            var8 += (var12 & 0xFF00) >> 8;
            var9 += var12 & 0xFF;
         }

         return (var7 / var6 & 0xFF) << 16 | (var8 / var6 & 0xFF) << 8 | var9 / var6 & 0xFF;
      }
   }

   public BlockPos method6880() {
      BlockPos var3 = new BlockPos(this.worldInfo.method20029(), this.worldInfo.method20030(), this.worldInfo.method20031());
      if (!this.method6810().method24523(var3)) {
         var3 = this.method7006(Class101.field299, new BlockPos(this.method6810().getCenterX(), 0.0, this.method6810().getCenterZ()));
      }

      return var3;
   }

   public float method6881() {
      return this.worldInfo.method20032();
   }

   public void method6882(BlockPos var1, float var2) {
      this.worldInfo.method20041(var1, var2);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public Class6606 getWorldInfo() {
      return this.field9028;
   }
}
