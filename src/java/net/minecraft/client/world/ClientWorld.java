package net.minecraft.client.world;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.player.AbstractClientPlayerEntity;
import net.minecraft.client.multiplayer.ClientChunkProvider;
import net.minecraft.client.multiplayer.PlayerController;
import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.crash.ReportedException;
import net.minecraft.tags.ITagCollectionSupplier;
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.RecipeManager;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.particles.IParticleData;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.*;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeColors;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.level.ColorResolver;
import net.minecraft.world.storage.MapData;
import net.optifine.CustomGuis;
import net.optifine.DynamicLights;
import net.optifine.Config;
import net.optifine.override.PlayerControllerOF;
import net.optifine.reflect.ReflectorForge;
import net.optifine.shaders.Shaders;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class ClientWorld extends World {
   public final Int2ObjectMap<Entity> entitiesById = new Int2ObjectOpenHashMap<>();
   private final ClientPlayNetHandler connection;
   private final WorldRenderer worldRenderer;
   private final ClientWorldInfo field_239130_d_;
   private DimensionRenderInfo field_239131_x_;
   private final Minecraft mc = Minecraft.getInstance();
   private final List<AbstractClientPlayerEntity> players = Lists.newArrayList();
   private Scoreboard scoreboard = new Scoreboard();
   private final Map<String, MapData> maps = Maps.newHashMap();
   private int timeLightningFlash;
   private final Object2ObjectArrayMap<ColorResolver, ColorCache> colorCaches = Util.make(
      new Object2ObjectArrayMap<>(3),      p_lambda$new$0_0_ -> {
              p_lambda$new$0_0_.put(BiomeColors.GRASS_COLOR, new ColorCache());
              p_lambda$new$0_0_.put(BiomeColors.FOLIAGE_COLOR, new ColorCache());
              p_lambda$new$0_0_.put(BiomeColors.WATER_COLOR, new ColorCache());
      }
   );
   private ClientChunkProvider field_239129_E_;
   private boolean playerUpdate = false;

   public ClientWorld(ClientPlayNetHandler p_i242067_1_, ClientWorldInfo p_i242067_2_, RegistryKey<World> p_i242067_3_, DimensionType p_i242067_4_, int p_i242067_5_, Supplier<IProfiler> p_i242067_6_, WorldRenderer p_i242067_7_, boolean p_i242067_8_, long p_i242067_9_) {
      super(p_i242067_2_, p_i242067_3_, p_i242067_4_, p_i242067_6_, true, p_i242067_8_, p_i242067_9_);
      this.connection = p_i242067_1_;
      this.field_239130_d_ = p_i242067_2_;
      this.worldRenderer = p_i242067_7_;

      if (p_i242067_1_ != null && p_i242067_4_ != null) {
         this.field_239131_x_ = DimensionRenderInfo.func_243495_a(p_i242067_4_);
         this.field_239129_E_ = new ClientChunkProvider(this, p_i242067_5_);
      }

      this.func_239136_a_(new BlockPos(8, 64, 8), 0.0F);
      this.calculateInitialSkylight();
      this.calculateInitialWeather();

      if (Reflector.CapabilityProvider_gatherCapabilities.exists())
      {
         Reflector.call(this, Reflector.CapabilityProvider_gatherCapabilities);
      }

      Reflector.postForgeBusEvent(Reflector.WorldEvent_Load_Constructor, this);
      if (this.mc.playerController != null && this.mc.playerController.getClass() == PlayerController.class)
      {
         this.mc.playerController = new PlayerControllerOF(this.mc, this.connection);
         CustomGuis.setPlayerControllerOF((PlayerControllerOF)this.mc.playerController);
      }
   }

   public DimensionRenderInfo func_239132_a_() {
      return this.field_239131_x_;
   }

   public void tick(BooleanSupplier var1) {
      this.getWorldBorder().tick();
      this.func_239141_x_();
      this.getProfiler().startSection("blocks");
      this.field_239129_E_.tick(var1);
      this.getProfiler().endSection();
   }

   private void func_239141_x_() {
      this.func_239134_a_(this.worldInfo.getGameTime() + 1L);
      if (this.worldInfo.getGameRulesInstance().getBoolean(GameRules.DO_DAYLIGHT_CYCLE)) {
         this.setDayTime(this.worldInfo.getDayTime() + 1L);
      }
   }

   public void func_239134_a_(long var1) {
      this.field_239130_d_.setGameTime(var1);
   }

   public void setDayTime(long time) {
      if (time < 0L)
      {
         time = -time;
         this.getGameRules().get(GameRules.DO_DAYLIGHT_CYCLE).set(false, (MinecraftServer)null);
      }
      else
      {
         this.getGameRules().get(GameRules.DO_DAYLIGHT_CYCLE).set(true, (MinecraftServer)null);
      }

      this.field_239130_d_.setDayTime(time);
   }

   public Iterable<Entity> getAllEntities() {
      return this.entitiesById.values();
   }

   public void tickEntities() {
      IProfiler iprofiler = this.getProfiler();
      iprofiler.startSection("entities");
      ObjectIterator<Entry<Entity>> objectiterator = this.entitiesById.int2ObjectEntrySet().iterator();

      while (objectiterator.hasNext())
      {
         Entry<Entity> entry = objectiterator.next();
         Entity entity = entry.getValue();

         if (!entity.isPassenger()) {
            iprofiler.startSection("tick");
            if (!entity.removed) {
               this.guardEntityTick(this::updateEntity, entity);
            }

            iprofiler.endSection();
            iprofiler.startSection("remove");

            if (entity.removed) {
               objectiterator.remove();
               this.removeEntity(entity);
            }

            iprofiler.endSection();
         }
      }

      this.tickBlockEntities();
      iprofiler.endSection();
   }

   public void updateEntity(Entity entityIn) {
      if (!(entityIn instanceof PlayerEntity) && !this.getChunkProvider().isChunkLoaded(entityIn)) {
         this.checkChunk(entityIn);
      } else {
         entityIn.setLocationAndAngles(entityIn.getPosX(), entityIn.getPosY(), entityIn.getPosZ());
         entityIn.prevRotationYaw = entityIn.rotationYaw;
         entityIn.prevRotationPitch = entityIn.rotationPitch;

         if (entityIn.addedToChunk || entityIn.isSpectator()) {
            entityIn.ticksExisted++;
            this.getProfiler().startSection(() -> Registry.ENTITY_TYPE.getKey(entityIn.getType()).toString());
            if (ReflectorForge.canUpdate(entityIn)) {
               entityIn.tick();
            }

            this.getProfiler().endSection();
         }

         this.checkChunk(entityIn);
         if (entityIn.addedToChunk) {
            for (Entity entity : entityIn.getPassengers()) {
               this.updateEntityRidden(entityIn, entity);
            }
         }
      }
   }

   public void updateEntityRidden(Entity var1, Entity var2) {
      if (var2.removed || var2.getRidingEntity() != var1) {
         var2.stopRiding();
      } else if (var2 instanceof PlayerEntity || this.getChunkProvider().isChunkLoaded(var2)) {
         var2.setLocationAndAngles(var2.getPosX(), var2.getPosY(), var2.getPosZ());
         var2.prevRotationYaw = var2.rotationYaw;
         var2.prevRotationPitch = var2.rotationPitch;
         if (var2.addedToChunk) {
            var2.ticksExisted++;
            var2.updateRidden();
         }

         this.checkChunk(var2);
         if (var2.addedToChunk) {
            for (Entity var6 : var2.getPassengers()) {
               this.updateEntityRidden(var2, var6);
            }
         }
      }
   }

   private void checkChunk(Entity var1) {
      if (var1.func_233578_ci_()) {
         this.getProfiler().startSection("chunkCheck");
         int var4 = MathHelper.floor(var1.getPosX() / 16.0);
         int var5 = MathHelper.floor(var1.getPosY() / 16.0);
         int var6 = MathHelper.floor(var1.getPosZ() / 16.0);
         if (!var1.addedToChunk || var1.chunkCoordX != var4 || var1.chunkCoordY != var5 || var1.chunkCoordZ != var6) {
            if (var1.addedToChunk && this.chunkExists(var1.chunkCoordX, var1.chunkCoordZ)) {
               this.getChunk(var1.chunkCoordX, var1.chunkCoordZ).removeEntityAtIndex(var1, var1.chunkCoordY);
            }

            if (!var1.func_233577_ch_() && !this.chunkExists(var4, var6)) {
               if (var1.addedToChunk) {
                  LOGGER.warn("Entity {} left loaded chunk area", var1);
               }

               var1.addedToChunk = false;
            } else {
               this.getChunk(var4, var6).addEntity(var1);
            }
         }

         this.getProfiler().endSection();
      }
   }

   public void onChunkUnloaded(Chunk chunkIn) {
      Collection collection;

      if (Reflector.ForgeWorld_tileEntitiesToBeRemoved.exists())
      {
         collection = (Collection)Reflector.getFieldValue(this, Reflector.ForgeWorld_tileEntitiesToBeRemoved);
      }
      else
      {
         collection = this.tileEntitiesToBeRemoved;
      }

      collection.addAll(chunkIn.getTileEntityMap().values());
      this.field_239129_E_.getLightManager().enableLightSources(chunkIn.getPos(), false);
   }

   public void onChunkLoaded(int var1, int var2) {
      this.colorCaches.forEach((var2x, var3) -> var3.invalidateChunk(var1, var2));
   }

   public void clearColorCaches() {
      this.colorCaches.forEach((var0, var1) -> var1.invalidateAll());
   }

   public boolean chunkExists(int var1, int var2) {
      return true;
   }

   public int getCountLoadedEntities() {
      return this.entitiesById.size();
   }

   public void addPlayer(int var1, AbstractClientPlayerEntity var2) {
      this.addEntityImpl(var1, var2);
      this.players.add(var2);
   }

   public void addEntity(int var1, Entity var2) {
      this.addEntityImpl(var1, var2);
   }

   private void addEntityImpl(int entityIdIn, Entity entityToSpawn) {
      if (!Reflector.EntityJoinWorldEvent_Constructor.exists() || !Reflector.postForgeBusEvent(Reflector.EntityJoinWorldEvent_Constructor, entityToSpawn, this))
      {
         this.removeEntityFromWorld(entityIdIn);
         this.entitiesById.put(entityIdIn, entityToSpawn);
         this.getChunkProvider().getChunk(MathHelper.floor(entityToSpawn.getPosX() / 16.0D), MathHelper.floor(entityToSpawn.getPosZ() / 16.0D), ChunkStatus.FULL, true).addEntity(entityToSpawn);

         if (Reflector.IForgeEntity_onAddedToWorld.exists())
         {
            Reflector.call(entityToSpawn, Reflector.IForgeEntity_onAddedToWorld);
         }

         this.onEntityAdded(entityToSpawn);
      }
   }

   public void removeEntityFromWorld(int eid) {
      Entity entity = this.entitiesById.remove(eid);
      if (entity != null) {
         entity.remove();
         this.removeEntity(entity);
      }
   }

   private void removeEntity(Entity entityIn) {
      entityIn.detach();
      if (entityIn.addedToChunk) {
         this.getChunk(entityIn.chunkCoordX, entityIn.chunkCoordZ).removeEntity(entityIn);
      }

      this.players.remove(entityIn);
      if (Reflector.IForgeEntity_onRemovedFromWorld.exists()) {
         Reflector.call(entityIn, Reflector.IForgeEntity_onRemovedFromWorld);
      }

      if (Reflector.EntityLeaveWorldEvent_Constructor.exists()) {
         Reflector.postForgeBusEvent(Reflector.EntityLeaveWorldEvent_Constructor, entityIn, this);
      }

      this.onEntityRemoved(entityIn);
   }

   public void addEntitiesToChunk(Chunk chunkIn) {
      for (Entry<Entity> entry : this.entitiesById.int2ObjectEntrySet())
      {
         Entity entity = entry.getValue();
         int i = MathHelper.floor(entity.getPosX() / 16.0D);
         int j = MathHelper.floor(entity.getPosZ() / 16.0D);

         if (i == chunkIn.getPos().x && j == chunkIn.getPos().z)
         {
            chunkIn.addEntity(entity);
         }
      }
   }

   @Nullable
   public Entity getEntityByID(int var1) {
      return (Entity)this.entitiesById.get(var1);
   }

   public void method6851(BlockPos var1, BlockState var2) {
      this.setBlockState(var1, var2, 19);
   }

   public void sendQuittingDisconnectingPacket() {
      this.connection.getNetworkManager().closeChannel(new TranslationTextComponent("multiplayer.status.quitting"));
   }

   public void animateTick(int posX, int posY, int posZ) {
      int i = 32;
      Random random = new Random();
      boolean flag = false;

      if (this.mc.playerController.getCurrentGameType() == GameType.CREATIVE)
      {
         for (ItemStack itemstack : this.mc.player.getHeldEquipment())
         {
            if (itemstack.getItem() == Blocks.BARRIER.asItem())
            {
               flag = true;
               break;
            }
         }
      }

      BlockPos.Mutable blockpos$mutable = new BlockPos.Mutable();

      for (int j = 0; j < 667; ++j)
      {
         this.animateTick(posX, posY, posZ, 16, random, flag, blockpos$mutable);
         this.animateTick(posX, posY, posZ, 32, random, flag, blockpos$mutable);
      }
   }

   public void animateTick(int var1, int var2, int var3, int var4, Random var5, boolean var6, BlockPos.Mutable var7) {
      int var10 = var1 + this.rand.nextInt(var4) - this.rand.nextInt(var4);
      int var11 = var2 + this.rand.nextInt(var4) - this.rand.nextInt(var4);
      int var12 = var3 + this.rand.nextInt(var4) - this.rand.nextInt(var4);
      var7.setPos(var10, var11, var12);
      BlockState var13 = this.getBlockState(var7);
      var13.getBlock().animateTick(var13, this, var7, var5);
      FluidState var14 = this.getFluidState(var7);
      if (!var14.isEmpty()) {
         var14.method23480(this, var7, var5);
         IParticleData var15 = var14.method23485();
         if (var15 != null && this.rand.nextInt(10) == 0) {
            boolean var16 = var13.method23454(this, var7, Direction.DOWN);
            BlockPos var17 = var7.down();
            this.method6854(var17, this.getBlockState(var17), var15, var16);
         }
      }

      if (var6 && var13.isIn(Blocks.BARRIER)) {
         this.addParticle(ParticleTypes.BARRIER, (double)var10 + 0.5, (double)var11 + 0.5, (double)var12 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!var13.method23456(this, var7)) {
         this.getBiome(var7)
            .getAmbientParticle()
            .ifPresent(
               var2x -> {
                  if (var2x.method25615(this.rand)) {
                     this.addParticle(
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
      if (var2.getFluidState().isEmpty()) {
         VoxelShape var7 = var2.method23414(this, var1);
         double var8 = var7.getEnd(Direction.Axis.Y);
         if (!(var8 < 1.0)) {
            if (!var2.isIn(BlockTags.field32781)) {
               double var10 = var7.getStart(Direction.Axis.Y);
               if (!(var10 > 0.0)) {
                  BlockPos var12 = var1.down();
                  BlockState var13 = this.getBlockState(var12);
                  VoxelShape var14 = var13.method23414(this, var12);
                  double var15 = var14.getEnd(Direction.Axis.Y);
                  if (var15 < 1.0 && var13.getFluidState().isEmpty()) {
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
         (double)var1.getX() + var3.getStart(Direction.Axis.X),
         (double)var1.getX() + var3.getEnd(Direction.Axis.X),
         (double)var1.getZ() + var3.getStart(Direction.Axis.Z),
         (double)var1.getZ() + var3.getEnd(Direction.Axis.Z),
         var4,
         var2
      );
   }

   private void method6856(double var1, double var3, double var5, double var7, double var9, IParticleData var11) {
      this.addParticle(
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
      ObjectIterator var3 = this.entitiesById.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         Entity var5 = (Entity)var4.getValue();
         if (var5.removed) {
            var3.remove();
            this.removeEntity(var5);
         }
      }
   }

   @Override
   public CrashReportCategory fillCrashReport(CrashReport var1) {
      CrashReportCategory var4 = super.fillCrashReport(var1);
      var4.addDetail("Server brand", () -> this.mc.player.method5395());
      var4.addDetail("Server type", () -> this.mc.getIntegratedServer() != null ? "Integrated singleplayer server" : "Non-integrated multiplayer server");
      return var4;
   }

   @Override
   public void playSound(PlayerEntity var1, double var2, double var4, double var6, SoundEvent var8, SoundCategory var9, float var10, float var11) {
      if (Reflector.field42848.exists()) {
         Object var14 = Reflector.field42848.call(var1, var8, var9, var10, var11);
         if (Reflector.method35064(var14, Reflector.field42809) || Reflector.call(var14, Reflector.field42980) == null) {
            return;
         }

         var8 = (SoundEvent) Reflector.call(var14, Reflector.field42980);
         var9 = (SoundCategory) Reflector.call(var14, Reflector.field42981);
         var10 = Reflector.callFloat(var14, Reflector.field42982);
      }

      if (var1 == this.mc.player) {
         this.method6745(var2, var4, var6, var8, var9, var10, var11, false);
      }
   }

   @Override
   public void playSoundFromEntity(PlayerEntity var1, Entity var2, SoundEvent var3, SoundCategory var4, float var5, float var6) {
      if (Reflector.field42848.exists()) {
         Object var9 = Reflector.field42848.call(var1, var3, var4, var5, var6);
         if (Reflector.method35064(var9, Reflector.field42809) || Reflector.call(var9, Reflector.field42980) == null) {
            return;
         }

         var3 = (SoundEvent) Reflector.call(var9, Reflector.field42980);
         var4 = (SoundCategory) Reflector.call(var9, Reflector.field42981);
         var5 = Reflector.callFloat(var9, Reflector.field42982);
      }

      if (var1 == this.mc.player) {
         this.mc.getSoundHandler().method1000(new Class6332(var3, var4, var2));
      }
   }

   public void method6858(BlockPos var1, SoundEvent var2, SoundCategory var3, float var4, float var5, boolean var6) {
      this.method6745((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5, var2, var3, var4, var5, var6);
   }

   @Override
   public void method6745(double var1, double var3, double var5, SoundEvent var7, SoundCategory var8, float var9, float var10, boolean var11) {
      double var14 = this.mc.gameRenderer.getActiveRenderInfo().getPos().method11343(var1, var3, var5);
      MinecraftSoundManager var16 = new MinecraftSoundManager(var7, var8, var9, var10, var1, var3, var5);
      if (var11 && var14 > 100.0) {
         double var17 = Math.sqrt(var14) / 40.0;
         this.mc.getSoundHandler().method1001(var16, (int)(var17 * 20.0));
      } else {
         this.mc.getSoundHandler().method1000(var16);
      }
   }

   public void method6804(double var1, double var3, double var5, double var7, double var9, double var11, CompoundNBT var13) {
      this.mc.particles.method1199(new Class4591(this, var1, var3, var5, var7, var9, var11, this.mc.particles, var13));
   }

   public void sendPacketToServer(IPacket<?> var1) {
      this.connection.sendPacket(var1);
   }

   public RecipeManager getRecipeManager() {
      return this.connection.getRecipeManager();
   }

   public void method6859(Scoreboard var1) {
      this.scoreboard = var1;
   }

   public ITickList<Block> method6860() {
      return Class6804.<Block>method20727();
   }

   public ITickList<Fluid> getPendingFluidTicks() {
      return Class6804.<Fluid>method20727();
   }

   public ClientChunkProvider getChunkProvider() {
      return this.field_239129_E_;
   }

   public boolean setBlockState(BlockPos pos, BlockState newState, int flags) {
      this.playerUpdate = this.method6863();
      boolean var6 = super.setBlockState(pos, newState, flags);
      this.playerUpdate = false;
      return var6;
   }

   private boolean method6863() {
      if (!(this.mc.playerController instanceof PlayerControllerOF)) {
         return false;
      } else {
         PlayerControllerOF var3 = (PlayerControllerOF)this.mc.playerController;
         return var3.method23162();
      }
   }

   public boolean method6864() {
      return this.playerUpdate;
   }

   public void onEntityAdded(Entity var1) {
      Class9387.method35629(var1, this);
      if (Config.isDynamicLights()) {
         DynamicLights.method36307(var1, Config.method26874());
      }
   }

   public void onEntityRemoved(Entity var1) {
      Class9387.method35630(var1, this);
      if (Config.isDynamicLights()) {
         DynamicLights.method36308(var1, Config.method26874());
      }
   }

   @Nullable
   @Override
   public MapData method6798(String var1) {
      return this.maps.get(var1);
   }

   @Override
   public void method6799(MapData var1) {
      this.maps.put(var1.getName(), var1);
   }

   @Override
   public int method6800() {
      return 0;
   }

   @Override
   public Scoreboard method6805() {
      return this.scoreboard;
   }

   @Override
   public ITagCollectionSupplier method6817() {
      return this.connection.method15798();
   }

   @Override
   public DynamicRegistries func_241828_r() {
      return this.connection.method15802();
   }

   @Override
   public void notifyBlockUpdate(BlockPos var1, BlockState var2, BlockState var3, int var4) {
      this.worldRenderer.method901(this, var1, var2, var3, var4);
   }

   @Override
   public void markBlockRangeForRenderUpdate(BlockPos var1, BlockState var2, BlockState var3) {
      this.worldRenderer.method904(var1, var2, var3);
   }

   public void method6868(int var1, int var2, int var3) {
      this.worldRenderer.method905(var1, var2, var3);
   }

   @Override
   public void sendBlockBreakProgress(int var1, BlockPos var2, int var3) {
      this.worldRenderer.method920(var1, var2, var3);
   }

   @Override
   public void method6801(int var1, BlockPos var2, int var3) {
      this.worldRenderer.method918(var1, var2, var3);
   }

   @Override
   public void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4) {
      try {
         this.worldRenderer.method919(var1, var2, var3, var4);
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
   public void addParticle(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.worldRenderer.method911(var1, var1.getType().method24006(), var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method6747(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.worldRenderer.method911(var1, var1.getType().method24006() || var2, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public void method6748(IParticleData var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.worldRenderer.method912(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method6749(IParticleData var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.worldRenderer.method912(var1, var1.getType().method24006() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public List<AbstractClientPlayerEntity> method6870() {
      return this.players;
   }

   @Override
   public Biome method6871(int var1, int var2, int var3) {
      return this.func_241828_r().<Biome>getRegistry(Registry.BIOME_KEY).getOrThrow(Biomes.PLAINS);
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
      int var8 = var7.getSkyColor();
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

      if (this.timeLightningFlash > 0) {
         float var22 = (float)this.timeLightningFlash - var2;
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
      return this.timeLightningFlash;
   }

   @Override
   public void setTimeLightningFlash(int var1) {
      this.timeLightningFlash = var1;
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      boolean var5 = this.func_239132_a_().method19307();
      boolean var6 = Config.isShaders();
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
               if (Config.isShaders()) {
                  return Shaders.field40934;
               }

               return 0.8F;
            case 5:
            case 6:
               if (Config.isShaders()) {
                  return Shaders.field40933;
               }

               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int getBlockColor(BlockPos var1, ColorResolver var2) {
      ColorCache var5 = (ColorCache)this.colorCaches.get(var2);
      return var5.method32731(var1, () -> this.method6879(var1, var2));
   }

   public int method6879(BlockPos var1, ColorResolver var2) {
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
            var11.setPos(var10.method32366(), var10.method32367(), var10.method32368());
            int var12 = var2.method32943(this.getBiome(var11), (double)var11.getX(), (double)var11.getZ());
            var7 += (var12 & 0xFF0000) >> 16;
            var8 += (var12 & 0xFF00) >> 8;
            var9 += var12 & 0xFF;
         }

         return (var7 / var6 & 0xFF) << 16 | (var8 / var6 & 0xFF) << 8 | var9 / var6 & 0xFF;
      }
   }

   public BlockPos method6880() {
      BlockPos var3 = new BlockPos(this.worldInfo.getSpawnX(), this.worldInfo.getSpawnY(), this.worldInfo.getSpawnZ());
      if (!this.getWorldBorder().contains(var3)) {
         var3 = this.method7006(Heightmap.Type.MOTION_BLOCKING, new BlockPos(this.getWorldBorder().getCenterX(), 0.0, this.getWorldBorder().getCenterZ()));
      }

      return var3;
   }

   public float method6881() {
      return this.worldInfo.method20032();
   }

   public void func_239136_a_(BlockPos var1, float var2) {
      this.worldInfo.setSpawn(var1, var2);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public ClientWorldInfo getWorldInfo() {
      return this.field_239130_d_;
   }

   public static class ClientWorldInfo implements ISpawnWorldInfo {
      private final boolean field29049;
      private final GameRules field29050;
      private final boolean field29051;
      private int field29052;
      private int field29053;
      private int field29054;
      private float field29055;
      private long field29056;
      private long field29057;
      private boolean field29058;
      private Difficulty field29059;
      private boolean field29060;

      public ClientWorldInfo(Difficulty var1, boolean var2, boolean var3) {
         this.field29059 = var1;
         this.field29049 = var2;
         this.field29051 = var3;
         this.field29050 = new GameRules();
      }

      @Override
      public int getSpawnX() {
         return this.field29052;
      }

      @Override
      public int getSpawnY() {
         return this.field29053;
      }

      @Override
      public int getSpawnZ() {
         return this.field29054;
      }

      @Override
      public float method20032() {
         return this.field29055;
      }

      @Override
      public long getGameTime() {
         return this.field29056;
      }

      @Override
      public long getDayTime() {
         return this.field29057;
      }

      @Override
      public void method20035(int var1) {
         this.field29052 = var1;
      }

      @Override
      public void method20036(int var1) {
         this.field29053 = var1;
      }

      @Override
      public void method20037(int var1) {
         this.field29054 = var1;
      }

      @Override
      public void method20038(float var1) {
         this.field29055 = var1;
      }

      public void setGameTime(long var1) {
         this.field29056 = var1;
      }

      public void setDayTime(long var1) {
         this.field29057 = var1;
      }

      @Override
      public void setSpawn(BlockPos var1, float var2) {
         this.field29052 = var1.getX();
         this.field29053 = var1.getY();
         this.field29054 = var1.getZ();
         this.field29055 = var2;
      }

      @Override
      public boolean method20042() {
         return false;
      }

      @Override
      public boolean method20043() {
         return this.field29058;
      }

      @Override
      public void method20044(boolean var1) {
         this.field29058 = var1;
      }

      @Override
      public boolean isHardcore() {
         return this.field29049;
      }

      @Override
      public GameRules getGameRulesInstance() {
         return this.field29050;
      }

      @Override
      public Difficulty method20047() {
         return this.field29059;
      }

      @Override
      public boolean method20048() {
         return this.field29060;
      }

      @Override
      public void method20049(CrashReportCategory var1) {
         ISpawnWorldInfo.super.method20049(var1);
      }

      public void method20050(Difficulty var1) {
         Reflector.field42855.method20229(var1, this.field29059);
         this.field29059 = var1;
      }

      public void method20051(boolean var1) {
         this.field29060 = var1;
      }

      public double method20052() {
         return !this.field29051 ? 63.0 : 0.0;
      }

      public double method20053() {
         return !this.field29051 ? 0.03125 : 1.0;
      }
   }
}
