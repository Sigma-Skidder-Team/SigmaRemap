package net.minecraft.entity.player;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import mapped.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.crash.ReportedException;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTDynamicOps;
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.entity.IAngerable;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.inventory.container.Container;
import net.minecraft.inventory.container.IContainerListener;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CClientSettingsPacket;
import net.minecraft.network.play.server.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.Direction;
import net.minecraft.util.math.*;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.filter.IChatFilter;
import net.minecraft.world.GameRules;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;

public class ServerPlayerEntity extends PlayerEntity implements IContainerListener {
   private static final Logger field4854 = LogManager.getLogger();
   public ServerPlayNetHandler connection;
   public final MinecraftServer field4856;
   public final Class9081 interactionManager;
   private final List<Integer> field4858 = Lists.newLinkedList();
   private final Class8019 field4859;
   private final Class8287 field4860;
   private float field4861 = Float.MIN_VALUE;
   private int field4862 = Integer.MIN_VALUE;
   private int field4863 = Integer.MIN_VALUE;
   private int field4864 = Integer.MIN_VALUE;
   private int field4865 = Integer.MIN_VALUE;
   private int field4866 = Integer.MIN_VALUE;
   private float field4867 = -1.0E8F;
   private int field4868 = -99999999;
   private boolean field4869 = true;
   private int field4870 = -99999999;
   private int field4871 = 60;
   private ChatVisibility field4872;
   private boolean field4873 = true;
   private long field4874 = Util.milliTime();
   private Entity field4875;
   private boolean field4876;
   private boolean field4877;
   private final Class6942 field4878 = new Class6942();
   private Vector3d field4879;
   private int field4880;
   private boolean field4881;
   private Vector3d field4882;
   private SectionPos field4883 = SectionPos.of(0, 0, 0);
   private RegistryKey<World> field4884 = World.OVERWORLD;
   private BlockPos field4885;
   private boolean field4886;
   private float field4887;
   private final IChatFilter field4888;
   private int field4889;
   public boolean field4890;
   public int ping;
   public boolean queuedEndExit;

   public ServerPlayerEntity(MinecraftServer var1, ServerWorld var2, GameProfile var3, Class9081 var4) {
      super(var2, var2.getSpawnPoint(), var2.method6948(), var3);
      var4.field41571 = this;
      this.interactionManager = var4;
      this.field4856 = var1;
      this.field4860 = var1.getPlayerList().method19485(this);
      this.field4859 = var1.getPlayerList().method19486(this);
      this.stepHeight = 1.0F;
      this.method2721(var2);
      this.field4888 = var1.method1438(this);
   }

   private void method2721(ServerWorld var1) {
      BlockPos var4 = var1.getSpawnPoint();
      if (var1.getDimensionType().hasSkyLight() && var1.getServer().func_240793_aU_().method20067() != GameType.field11104) {
         int var5 = Math.max(0, this.field4856.method1395(var1));
         int var6 = MathHelper.floor(var1.getWorldBorder().method24528((double)var4.getX(), (double)var4.getZ()));
         if (var6 < var5) {
            var5 = var6;
         }

         if (var6 <= 1) {
            var5 = 1;
         }

         long var7 = (long)(var5 * 2 + 1);
         long var9 = var7 * var7;
         int var11 = var9 <= 2147483647L ? (int)var9 : Integer.MAX_VALUE;
         int var12 = this.method2722(var11);
         int var13 = new Random().nextInt(var11);

         for (int var14 = 0; var14 < var11; var14++) {
            int var15 = (var13 + var12 * var14) % var11;
            int var16 = var15 % (var5 * 2 + 1);
            int var17 = var15 / (var5 * 2 + 1);
            BlockPos var18 = SpawnLocationHelper.func_241092_a_(var1, var4.getX() + var16 - var5, var4.getZ() + var17 - var5, false);
            if (var18 != null) {
               this.moveToBlockPosAndAngles(var18, 0.0F, 0.0F);
               if (var1.hasNoCollisions(this)) {
                  break;
               }
            }
         }
      } else {
         this.moveToBlockPosAndAngles(var4, 0.0F, 0.0F);

         while (!var1.hasNoCollisions(this) && this.getPosY() < 255.0) {
            this.setPosition(this.getPosX(), this.getPosY() + 1.0, this.getPosZ());
         }
      }
   }

   private int method2722(int var1) {
      return var1 > 16 ? 17 : var1 - 1;
   }

   @Override
   public void readAdditional(CompoundNBT var1) {
      super.readAdditional(var1);
      if (var1.contains("playerGameType", 99)) {
         if (!this.method3396().method1380()) {
            this.interactionManager
               .method33862(
                  GameType.getByID(var1.getInt("playerGameType")),
                  !var1.contains("previousPlayerGameType", 3) ? GameType.field11101 : GameType.getByID(var1.getInt("previousPlayerGameType"))
               );
         } else {
            this.interactionManager.method33862(this.method3396().method1286(), GameType.field11101);
         }
      }

      if (var1.contains("enteredNetherPosition", 10)) {
         CompoundNBT var4 = var1.getCompound("enteredNetherPosition");
         this.field4882 = new Vector3d(var4.getDouble("x"), var4.getDouble("y"), var4.getDouble("z"));
      }

      this.field4877 = var1.getBoolean("seenCredits");
      if (var1.contains("recipeBook", 10)) {
         this.field4878.method21380(var1.getCompound("recipeBook"), this.field4856.method1407());
      }

      if (this.isSleeping()) {
         this.wakeUp();
      }

      if (var1.contains("SpawnX", 99) && var1.contains("SpawnY", 99) && var1.contains("SpawnZ", 99)) {
         this.field4885 = new BlockPos(var1.getInt("SpawnX"), var1.getInt("SpawnY"), var1.getInt("SpawnZ"));
         this.field4886 = var1.getBoolean("SpawnForced");
         this.field4887 = var1.getFloat("SpawnAngle");
         if (var1.contains("SpawnDimension")) {
            this.field4884 = World.CODEC
               .parse(NBTDynamicOps.INSTANCE, var1.get("SpawnDimension"))
               .resultOrPartial(field4854::error)
               .orElse(World.OVERWORLD);
         }
      }
   }

   @Override
   public void writeAdditional(CompoundNBT var1) {
      super.writeAdditional(var1);
      var1.putInt("playerGameType", this.interactionManager.getGameType().getID());
      var1.putInt("previousPlayerGameType", this.interactionManager.method33864().getID());
      var1.putBoolean("seenCredits", this.field4877);
      if (this.field4882 != null) {
         CompoundNBT var4 = new CompoundNBT();
         var4.putDouble("x", this.field4882.x);
         var4.putDouble("y", this.field4882.y);
         var4.putDouble("z", this.field4882.z);
         var1.put("enteredNetherPosition", var4);
      }

      Entity var8 = this.method3415();
      Entity var5 = this.getRidingEntity();
      if (var5 != null && var8 != this && var8.method3413()) {
         CompoundNBT var6 = new CompoundNBT();
         CompoundNBT var7 = new CompoundNBT();
         var8.writeUnlessPassenger(var7);
         var6.putUniqueID("Attach", var5.getUniqueID());
         var6.put("Entity", var7);
         var1.put("RootVehicle", var6);
      }

      var1.put("recipeBook", this.field4878.method21379());
      var1.putString("Dimension", this.world.getDimensionKey().getLocation().toString());
      if (this.field4885 != null) {
         var1.putInt("SpawnX", this.field4885.getX());
         var1.putInt("SpawnY", this.field4885.getY());
         var1.putInt("SpawnZ", this.field4885.getZ());
         var1.putBoolean("SpawnForced", this.field4886);
         var1.putFloat("SpawnAngle", this.field4887);
         ResourceLocation.CODEC
            .encodeStart(NBTDynamicOps.INSTANCE, this.field4884.getLocation())
            .resultOrPartial(field4854::error)
            .ifPresent(var1x -> var1.put("SpawnDimension", var1x));
      }
   }

   public void method2725(int var1) {
      float var4 = (float)this.method2930();
      float var5 = (var4 - 1.0F) / var4;
      this.field4922 = MathHelper.clamp((float)var1 / var4, 0.0F, var5);
      this.field4870 = -1;
   }

   public void method2726(int var1) {
      this.field4920 = var1;
      this.field4870 = -1;
   }

   @Override
   public void method2727(int var1) {
      super.method2727(var1);
      this.field4870 = -1;
   }

   @Override
   public void method2728(ItemStack var1, int var2) {
      super.method2728(var1, var2);
      this.field4870 = -1;
   }

   public void method2729() {
      this.openContainer.addListener(this);
   }

   @Override
   public void method2730() {
      super.method2730();
      this.connection.sendPacket(new SCombatPacket(this.getCombatTracker(), Class1900.field11155));
   }

   @Override
   public void sendEndCombat() {
      super.sendEndCombat();
      this.connection.sendPacket(new SCombatPacket(this.getCombatTracker(), Class1900.field11156));
   }

   @Override
   public void onInsideBlock(BlockState var1) {
      CriteriaTriggers.field44468.method15169(this, var1);
   }

   @Override
   public Class6462 method2733() {
      return new Class6461(this);
   }

   @Override
   public void tick() {
      this.interactionManager.method33856();
      this.field4871--;
      if (this.hurtResistantTime > 0) {
         this.hurtResistantTime--;
      }

      this.openContainer.detectAndSendChanges();
      if (!this.world.isRemote && !this.openContainer.canInteractWith(this)) {
         this.method2772();
         this.openContainer = this.container;
      }

      while (!this.field4858.isEmpty()) {
         int var3 = Math.min(this.field4858.size(), Integer.MAX_VALUE);
         int[] var4 = new int[var3];
         Iterator var5 = this.field4858.iterator();
         int var6 = 0;

         while (var5.hasNext() && var6 < var3) {
            var4[var6++] = (Integer)var5.next();
            var5.remove();
         }

         this.connection.sendPacket(new SDestroyEntitiesPacket(var4));
      }

      Entity var7 = this.method2814();
      if (var7 != this) {
         if (!var7.isAlive()) {
            this.method2815(this);
         } else {
            this.setPositionAndRotation(var7.getPosX(), var7.getPosY(), var7.getPosZ(), var7.rotationYaw, var7.rotationPitch);
            this.getServerWorld().getChunkProvider().method7376(this);
            if (this.method2852()) {
               this.method2815(this);
            }
         }
      }

      CriteriaTriggers.field44487.method15046(this);
      if (this.field4879 != null) {
         CriteriaTriggers.field44485.method15118(this, this.field4879, this.ticksExisted - this.field4880);
      }

      this.field4859.method27414(this);
   }

   public void method2735() {
      try {
         if (!this.isSpectator() || this.world.isBlockLoaded(this.getPosition())) {
            super.tick();
         }

         for (int var3 = 0; var3 < this.inventory.getSizeInventory(); var3++) {
            ItemStack var7 = this.inventory.getStackInSlot(var3);
            if (var7.getItem().method11726()) {
               IPacket var8 = ((Class3314)var7.getItem()).method11858(var7, this.world, this);
               if (var8 != null) {
                  this.connection.sendPacket(var8);
               }
            }
         }

         if (this.getHealth() != this.field4867 || this.field4868 != this.foodStats.getFoodLevel() || this.foodStats.method37577() == 0.0F != this.field4869) {
            this.connection.sendPacket(new SUpdateHealthPacket(this.getHealth(), this.foodStats.getFoodLevel(), this.foodStats.method37577()));
            this.field4867 = this.getHealth();
            this.field4868 = this.foodStats.getFoodLevel();
            this.field4869 = this.foodStats.method37577() == 0.0F;
         }

         if (this.getHealth() + this.getAbsorptionAmount() != this.field4861) {
            this.field4861 = this.getHealth() + this.getAbsorptionAmount();
            this.method2736(Class9008.field41194, MathHelper.ceil(this.field4861));
         }

         if (this.foodStats.getFoodLevel() != this.field4862) {
            this.field4862 = this.foodStats.getFoodLevel();
            this.method2736(Class9008.field41195, MathHelper.ceil((float)this.field4862));
         }

         if (this.getAir() != this.field4863) {
            this.field4863 = this.getAir();
            this.method2736(Class9008.field41196, MathHelper.ceil((float)this.field4863));
         }

         if (this.method3070() != this.field4864) {
            this.field4864 = this.method3070();
            this.method2736(Class9008.field41197, MathHelper.ceil((float)this.field4864));
         }

         if (this.field4921 != this.field4866) {
            this.field4866 = this.field4921;
            this.method2736(Class9008.field41198, MathHelper.ceil((float)this.field4866));
         }

         if (this.field4920 != this.field4865) {
            this.field4865 = this.field4920;
            this.method2736(Class9008.field41199, MathHelper.ceil((float)this.field4865));
         }

         if (this.field4921 != this.field4870) {
            this.field4870 = this.field4921;
            this.connection.sendPacket(new SSetExperiencePacket(this.field4922, this.field4921, this.field4920));
         }

         if (this.ticksExisted % 20 == 0) {
            CriteriaTriggers.field44480.method15062(this);
         }
      } catch (Throwable var6) {
         CrashReport var4 = CrashReport.makeCrashReport(var6, "Ticking player");
         CrashReportCategory var5 = var4.makeCategory("Player being ticked");
         this.fillCrashReport(var5);
         throw new ReportedException(var4);
      }
   }

   private void method2736(Class9008 var1, int var2) {
      this.method2953().method20978(var1, this.method2956(), var1x -> var1x.method36052(var2));
   }

   @Override
   public void onDeath(DamageSource var1) {
      boolean var4 = this.world.getGameRules().getBoolean(GameRules.field24234);
      if (!var4) {
         this.connection.sendPacket(new SCombatPacket(this.getCombatTracker(), Class1900.field11157));
      } else {
         ITextComponent var5 = this.getCombatTracker().method27600();
         this.connection
            .method15672(
               new SCombatPacket(this.getCombatTracker(), Class1900.field11157, var5),
               var2 -> {
                  if (!var2.isSuccess()) {
                     String var6x = var5.getStringTruncated(256);
                     TranslationTextComponent var7x = new TranslationTextComponent(
                        "death.attack.message_too_long", new StringTextComponent(var6x).mergeStyle(TextFormatting.YELLOW)
                     );
                     IFormattableTextComponent var8 = new TranslationTextComponent("death.attack.even_more_magic", this.getDisplayName())
                        .modifyStyle(var1xx -> var1xx.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, var7x)));
                     this.connection.sendPacket(new SCombatPacket(this.getCombatTracker(), Class1900.field11157, var8));
                  }
               }
            );
         Team var6 = this.getTeam();
         if (var6 == null || var6.method28583() == Team.Visible.ALWAYS) {
            this.field4856.getPlayerList().method19484(var5, ChatType.SYSTEM, Util.DUMMY_UUID);
         } else if (var6.method28583() != Team.Visible.HIDE_FOR_OTHER_TEAMS) {
            if (var6.method28583() == Team.Visible.HIDE_FOR_OWN_TEAM) {
               this.field4856.getPlayerList().method19459(this, var5);
            }
         } else {
            this.field4856.getPlayerList().method19458(this, var5);
         }
      }

      this.method2949();
      if (this.world.getGameRules().getBoolean(GameRules.field24254)) {
         this.method2738();
      }

      if (!this.isSpectator()) {
         this.spawnDrops(var1);
      }

      this.method2953().method20978(Class9008.field41191, this.method2956(), Class9411::method36049);
      LivingEntity var7 = this.getAttackingEntity();
      if (var7 != null) {
         this.addStat(Stats.field40103.method172(var7.getType()));
         var7.awardKillScore(this, this.scoreValue, var1);
         this.createWitherRose(var7);
      }

      this.world.setEntityState(this, (byte)3);
      this.method2911(Stats.field40134);
      this.method2777(Stats.field40104.method172(Stats.field40107));
      this.method2777(Stats.field40104.method172(Stats.field40108));
      this.extinguish();
      this.setFlag(0, false);
      this.getCombatTracker().method27606();
   }

   private void method2738() {
      AxisAlignedBB var3 = new AxisAlignedBB(this.getPosition()).grow(32.0, 10.0, 32.0);
      this.world
         .<MobEntity>method7183(MobEntity.class, var3)
         .stream()
         .filter(var0 -> var0 instanceof IAngerable)
         .forEach(var1 -> ((IAngerable)var1).method4370(this));
   }

   @Override
   public void awardKillScore(Entity var1, int var2, DamageSource var3) {
      if (var1 != this) {
         super.awardKillScore(var1, var2, var3);
         this.method2876(var2);
         String var6 = this.method2956();
         String var7 = var1.method2956();
         this.method2953().method20978(Class9008.field41193, var6, Class9411::method36049);
         if (!(var1 instanceof PlayerEntity)) {
            this.method2911(Stats.field40135);
         } else {
            this.method2911(Stats.field40137);
            this.method2953().method20978(Class9008.field41192, var6, Class9411::method36049);
         }

         this.method2740(var6, var7, Class9008.field41200);
         this.method2740(var7, var6, Class9008.field41201);
         CriteriaTriggers.field44466.method15158(this, var1, var3);
      }
   }

   private void method2740(String var1, String var2, Class9008[] var3) {
      ScorePlayerTeam var6 = this.method2953().method20998(var2);
      if (var6 != null) {
         int var7 = var6.getColor().getColorIndex();
         if (var7 >= 0 && var7 < var3.length) {
            this.method2953().method20978(var3[var7], var1, Class9411::method36049);
         }
      }
   }

   @Override
   public boolean attackEntityFrom(DamageSource source, float var2) {
      if (this.isInvulnerableTo(source)) {
         return false;
      } else {
         boolean var5 = this.field4856.isDedicatedServer() && this.method2743() && "fall".equals(source.field39022);
         if (!var5 && this.field4871 > 0 && source != DamageSource.field39004) {
            return false;
         } else {
            if (source instanceof EntityDamageSource) {
               Entity var6 = source.getTrueSource();
               if (var6 instanceof PlayerEntity && !this.method2742((PlayerEntity)var6)) {
                  return false;
               }

               if (var6 instanceof AbstractArrowEntity) {
                  AbstractArrowEntity var7 = (AbstractArrowEntity)var6;
                  Entity var8 = var7.method3460();
                  if (var8 instanceof PlayerEntity && !this.method2742((PlayerEntity)var8)) {
                     return false;
                  }
               }
            }

            return super.attackEntityFrom(source, var2);
         }
      }
   }

   @Override
   public boolean method2742(PlayerEntity var1) {
      return this.method2743() ? super.method2742(var1) : false;
   }

   private boolean method2743() {
      return this.field4856.method1357();
   }

   @Nullable
   @Override
   public PortalInfo method2744(ServerWorld var1) {
      PortalInfo var4 = super.method2744(var1);
      if (var4 != null && this.world.getDimensionKey() == World.OVERWORLD && var1.getDimensionKey() == World.THE_END) {
         Vector3d var5 = var4.field45665.add(0.0, -1.0, 0.0);
         return new PortalInfo(var5, Vector3d.ZERO, 90.0F, 0.0F);
      } else {
         return var4;
      }
   }

   @Nullable
   @Override
   public Entity changeDimension(ServerWorld var1) {
      this.field4876 = true;
      ServerWorld var4 = this.getServerWorld();
      RegistryKey var5 = var4.getDimensionKey();
      if (var5 == World.THE_END && var1.getDimensionKey() == World.OVERWORLD) {
         this.detach();
         this.getServerWorld().method6934(this);
         if (!this.queuedEndExit) {
            this.queuedEndExit = true;
            this.connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24564, !this.field4877 ? 1.0F : 0.0F));
            this.field4877 = true;
         }

         return this;
      } else {
         Class6612 var6 = var1.getWorldInfo();
         this.connection
            .sendPacket(
               new SRespawnPacket(
                  var1.getDimensionType(),
                  var1.getDimensionKey(),
                  BiomeManager.getHashedSeed(var1.getSeed()),
                  this.interactionManager.getGameType(),
                  this.interactionManager.method33864(),
                  var1.isDebug(),
                  var1.method6966(),
                  true
               )
            );
         this.connection.sendPacket(new SServerDifficultyPacket(var6.method20047(), var6.method20048()));
         Class6395 var7 = this.field4856.getPlayerList();
         var7.method19454(this);
         var4.method6934(this);
         this.removed = false;
         PortalInfo var8 = this.method2744(var1);
         if (var8 != null) {
            var4.getProfiler().startSection("moving");
            if (var5 == World.OVERWORLD && var1.getDimensionKey() == World.THE_NETHER) {
               this.field4882 = this.getPositionVec();
            } else if (var1.getDimensionKey() == World.THE_END) {
               this.method2746(var1, new BlockPos(var8.field45665));
            }

            var4.getProfiler().endSection();
            var4.getProfiler().startSection("placing");
            this.setWorld(var1);
            var1.method6920(this);
            this.setRotation(var8.field45667, var8.field45668);
            this.moveForced(var8.field45665.x, var8.field45665.y, var8.field45665.z);
            var4.getProfiler().endSection();
            this.method2748(var4);
            this.interactionManager.method33871(var1);
            this.connection.sendPacket(new SPlayerAbilitiesPacket(this.abilities));
            var7.method19472(this, var1);
            var7.method19473(this);

            for (EffectInstance var10 : this.getActivePotionEffects()) {
               this.connection.sendPacket(new SPlayEntityEffectPacket(this.getEntityId(), var10));
            }

            this.connection.sendPacket(new SPlaySoundEventPacket(1032, BlockPos.ZERO, 0, false));
            this.field4870 = -1;
            this.field4867 = -1.0F;
            this.field4868 = -1;
         }

         return this;
      }
   }

   private void method2746(ServerWorld var1, BlockPos var2) {
      BlockPos.Mutable var5 = var2.method8354();

      for (int var6 = -2; var6 <= 2; var6++) {
         for (int var7 = -2; var7 <= 2; var7++) {
            for (int var8 = -1; var8 < 3; var8++) {
               BlockState var9 = var8 != -1 ? Blocks.AIR.getDefaultState() : Blocks.field36527.getDefaultState();
               var1.setBlockState(var5.method8374(var2).method8381(var7, var8, var6), var9);
            }
         }
      }
   }

   @Override
   public Optional<TeleportationRepositioner> method2747(ServerWorld var1, BlockPos var2, boolean var3) {
      Optional var6 = super.method2747(var1, var2, var3);
      if (!var6.isPresent()) {
         Direction.Axis var7 = this.world.getBlockState(this.field_242271_ac).<Direction.Axis>method23464(Class3401.field19060).orElse(Direction.Axis.X);
         Optional var8 = var1.method6937().method12332(var2, var7);
         if (!var8.isPresent()) {
            field4854.error("Unable to create a portal, likely target out of worldborder");
         }

         return var8;
      } else {
         return var6;
      }
   }

   private void method2748(ServerWorld var1) {
      RegistryKey var4 = var1.getDimensionKey();
      RegistryKey var5 = this.world.getDimensionKey();
      CriteriaTriggers.CHANGED_DIMENSION.testForAll(this, var4, var5);
      if (var4 == World.THE_NETHER && var5 == World.OVERWORLD && this.field4882 != null) {
         CriteriaTriggers.field44493.method15143(this, this.field4882);
      }

      if (var5 != World.THE_NETHER) {
         this.field4882 = null;
      }
   }

   @Override
   public boolean isSpectatedByPlayer(ServerPlayerEntity var1) {
      if (!var1.isSpectator()) {
         return !this.isSpectator() ? super.isSpectatedByPlayer(var1) : false;
      } else {
         return this.method2814() == this;
      }
   }

   private void method2750(TileEntity var1) {
      if (var1 != null) {
         SUpdateTileEntityPacket var4 = var1.method3776();
         if (var4 != null) {
            this.connection.sendPacket(var4);
         }
      }
   }

   @Override
   public void onItemPickup(Entity var1, int var2) {
      super.onItemPickup(var1, var2);
      this.openContainer.detectAndSendChanges();
   }

   @Override
   public Either<Class2104, Unit> method2752(BlockPos var1) {
      Direction var4 = this.world.getBlockState(var1).<Direction>get(HorizontalBlock.HORIZONTAL_FACING);
      if (this.isSleeping() || !this.isAlive()) {
         return Either.left(Class2104.field13718);
      } else if (!this.world.getDimensionType().isNatural()) {
         return Either.left(Class2104.field13714);
      } else if (!this.method2754(var1, var4)) {
         return Either.left(Class2104.field13716);
      } else if (!this.method2756(var1, var4)) {
         this.method2829(this.world.getDimensionKey(), var1, this.rotationYaw, false, true);
         if (!this.world.method6740()) {
            if (!this.isCreative()) {
               double var6 = 8.0;
               double var8 = 5.0;
               Vector3d var10 = Vector3d.method11330(var1);
               List var11 = this.world
                  .<MonsterEntity>getEntitiesInAABBexcluding(
                     MonsterEntity.class,
                     new AxisAlignedBB(
                        var10.getX() - 8.0,
                        var10.getY() - 5.0,
                        var10.getZ() - 8.0,
                        var10.getX() + 8.0,
                        var10.getY() + 5.0,
                        var10.getZ() + 8.0
                     ),
                     var1x -> var1x.method4344(this)
                  );
               if (!var11.isEmpty()) {
                  return Either.left(Class2104.field13719);
               }
            }

            Either var5 = super.method2752(var1).ifRight(var1x -> {
               this.method2911(Stats.field40162);
               CriteriaTriggers.field44481.method15062(this);
            });
            ((ServerWorld)this.world).method6902();
            return var5;
         } else {
            return Either.left(Class2104.field13715);
         }
      } else {
         return Either.left(Class2104.field13717);
      }
   }

   @Override
   public void startSleeping(BlockPos var1) {
      this.method2777(Stats.field40104.method172(Stats.field40108));
      super.startSleeping(var1);
   }

   private boolean method2754(BlockPos var1, Direction var2) {
      return this.method2755(var1) || this.method2755(var1.offset(var2.getOpposite()));
   }

   private boolean method2755(BlockPos var1) {
      Vector3d var4 = Vector3d.method11330(var1);
      return Math.abs(this.getPosX() - var4.getX()) <= 3.0
         && Math.abs(this.getPosY() - var4.getY()) <= 2.0
         && Math.abs(this.getPosZ() - var4.getZ()) <= 3.0;
   }

   private boolean method2756(BlockPos var1, Direction var2) {
      BlockPos var5 = var1.up();
      return !this.method2917(var5) || !this.method2917(var5.offset(var2.getOpposite()));
   }

   @Override
   public void stopSleepInBed(boolean var1, boolean var2) {
      if (this.isSleeping()) {
         this.getServerWorld().getChunkProvider().sendToAllTracking(this, new SAnimateHandPacket(this, 2));
      }

      super.stopSleepInBed(var1, var2);
      if (this.connection != null) {
         this.connection.method15668(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
      }
   }

   @Override
   public boolean startRiding(Entity var1, boolean var2) {
      Entity var5 = this.getRidingEntity();
      if (super.startRiding(var1, var2)) {
         Entity var6 = this.getRidingEntity();
         if (var6 != var5 && this.connection != null) {
            this.connection.method15668(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void stopRiding() {
      Entity var3 = this.getRidingEntity();
      super.stopRiding();
      Entity var4 = this.getRidingEntity();
      if (var4 != var3 && this.connection != null) {
         this.connection.method15668(this.getPosX(), this.getPosY(), this.getPosZ(), this.rotationYaw, this.rotationPitch);
      }
   }

   @Override
   public boolean isInvulnerableTo(DamageSource var1) {
      return super.isInvulnerableTo(var1) || this.method2821() || this.abilities.disableDamage && var1 == DamageSource.field39007;
   }

   @Override
   public void updateFallState(double var1, boolean var3, BlockState var4, BlockPos var5) {
   }

   @Override
   public void frostWalk(BlockPos var1) {
      if (!this.isSpectator()) {
         super.frostWalk(var1);
      }
   }

   public void method2763(double var1, boolean var3) {
      BlockPos var6 = this.getOnPosition();
      if (this.world.isBlockLoaded(var6)) {
         super.updateFallState(var1, var3, this.world.getBlockState(var6), var6);
      }
   }

   @Override
   public void method2764(Class954 var1) {
      var1.method3840(this);
      this.connection.sendPacket(new SOpenSignMenuPacket(var1.getPos()));
   }

   private void method2765() {
      this.field4889 = this.field4889 % 100 + 1;
   }

   @Override
   public OptionalInt method2766(Class949 var1) {
      if (var1 != null) {
         if (this.openContainer != this.container) {
            this.method2772();
         }

         this.method2765();
         Container var4 = var1.method3627(this.field4889, this.inventory, this);
         if (var4 != null) {
            this.connection.sendPacket(new SOpenWindowPacket(var4.windowId, var4.getType(), var1.getDefaultName2()));
            var4.addListener(this);
            this.openContainer = var4;
            return OptionalInt.of(this.field4889);
         } else {
            if (this.isSpectator()) {
               this.sendStatusMessage(new TranslationTextComponent("container.spectatorCantOpen").mergeStyle(TextFormatting.RED), true);
            }

            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   @Override
   public void method2767(int var1, Class46 var2, int var3, int var4, boolean var5, boolean var6) {
      this.connection.sendPacket(new SMerchantOffersPacket(var1, var2, var3, var4, var5, var6));
   }

   @Override
   public void method2768(AbstractHorseEntity var1, IInventory var2) {
      if (this.openContainer != this.container) {
         this.method2772();
      }

      this.method2765();
      this.connection.sendPacket(new SOpenHorseWindowPacket(this.field4889, var2.getSizeInventory(), var1.getEntityId()));
      this.openContainer = new Class5827(this.field4889, this.inventory, var2, var1);
      this.openContainer.addListener(this);
   }

   @Override
   public void method2769(ItemStack var1, Hand var2) {
      Item var5 = var1.getItem();
      if (var5 == Items.field38048) {
         if (Class3285.method11820(var1, this.getCommandSource(), this)) {
            this.openContainer.detectAndSendChanges();
         }

         this.connection.sendPacket(new SOpenBookWindowPacket(var2));
      }
   }

   @Override
   public void method2770(CommandBlockTileEntity var1) {
      var1.method4019(true);
      this.method2750(var1);
   }

   @Override
   public void sendSlotContents(Container var1, int var2, ItemStack var3) {
      if (!(var1.getSlot(var2) instanceof Class5856)) {
         if (var1 == this.container) {
            CriteriaTriggers.field44469.method15086(this, this.inventory, var3);
         }

         if (!this.field4890) {
            this.connection.sendPacket(new SSetSlotPacket(var1.windowId, var2, var3));
         }
      }
   }

   public void method2771(Container var1) {
      this.sendAllContents(var1, var1.getInventory());
   }

   @Override
   public void sendAllContents(Container var1, NonNullList<ItemStack> var2) {
      this.connection.sendPacket(new SWindowItemsPacket(var1.windowId, var2));
      this.connection.sendPacket(new SSetSlotPacket(-1, -1, this.inventory.getItemStack()));
   }

   @Override
   public void sendWindowProperty(Container var1, int var2, int var3) {
      this.connection.sendPacket(new SWindowPropertyPacket(var1.windowId, var2, var3));
   }

   @Override
   public void method2772() {
      this.connection.sendPacket(new SCloseWindowPacket(this.openContainer.windowId));
      this.method2774();
   }

   public void method2773() {
      if (!this.field4890) {
         this.connection.sendPacket(new SSetSlotPacket(-1, -1, this.inventory.getItemStack()));
      }
   }

   public void method2774() {
      this.openContainer.onContainerClosed(this);
      this.openContainer = this.container;
   }

   public void method2775(float var1, float var2, boolean var3, boolean var4) {
      if (this.isPassenger()) {
         if (var1 >= -1.0F && var1 <= 1.0F) {
            this.moveStrafing = var1;
         }

         if (var2 >= -1.0F && var2 <= 1.0F) {
            this.moveForward = var2;
         }

         this.isJumping = var3;
         this.setSneaking(var4);
      }
   }

   @Override
   public void method2776(Class9007<?> var1, int var2) {
      this.field4860.method28958(this, var1, var2);
      this.method2953().method20978(var1, this.method2956(), var1x -> var1x.method36048(var2));
   }

   @Override
   public void method2777(Class9007<?> var1) {
      this.field4860.method28959(this, var1, 0);
      this.method2953().method20978(var1, this.method2956(), Class9411::method36051);
   }

   @Override
   public int method2778(Collection<IRecipe<?>> var1) {
      return this.field4878.method21376(var1, this);
   }

   @Override
   public void method2779(ResourceLocation[] var1) {
      ArrayList var4 = Lists.newArrayList();

      for (ResourceLocation var8 : var1) {
         this.field4856.method1407().method1035(var8).ifPresent(var4::add);
      }

      this.method2778(var4);
   }

   @Override
   public int method2780(Collection<IRecipe<?>> var1) {
      return this.field4878.method21377(var1, this);
   }

   @Override
   public void method2781(int var1) {
      super.method2781(var1);
      this.field4870 = -1;
   }

   public void method2782() {
      this.field4881 = true;
      this.removePassengers();
      if (this.isSleeping()) {
         this.stopSleepInBed(true, false);
      }
   }

   public boolean method2783() {
      return this.field4881;
   }

   public void method2784() {
      this.field4867 = -1.0E8F;
   }

   @Override
   public void sendStatusMessage(ITextComponent var1, boolean var2) {
      this.connection.sendPacket(new SChatPacket(var1, !var2 ? ChatType.CHAT : ChatType.GAME_INFO, Util.DUMMY_UUID));
   }

   @Override
   public void onItemUseFinish() {
      if (!this.activeItemStack.isEmpty() && this.isHandActive()) {
         this.connection.sendPacket(new SEntityStatusPacket(this, (byte)9));
         super.onItemUseFinish();
      }
   }

   @Override
   public void lookAt(Class2062 var1, Vector3d var2) {
      super.lookAt(var1, var2);
      this.connection.sendPacket(new SPlayerLookPacket(var1, var2.x, var2.y, var2.z));
   }

   public void method2788(Class2062 var1, Entity var2, Class2062 var3) {
      Vector3d var6 = var3.method8711(var2);
      super.lookAt(var1, var6);
      this.connection.sendPacket(new SPlayerLookPacket(var1, var2, var3));
   }

   public void method2789(ServerPlayerEntity var1, boolean var2) {
      if (!var2) {
         if (this.world.getGameRules().getBoolean(GameRules.field24225) || var1.isSpectator()) {
            this.inventory.method4060(var1.inventory);
            this.field4920 = var1.field4920;
            this.field4921 = var1.field4921;
            this.field4922 = var1.field4922;
            this.method2875(var1.method2874());
         }
      } else {
         this.inventory.method4060(var1.inventory);
         this.setHealth(var1.getHealth());
         this.foodStats = var1.foodStats;
         this.field4920 = var1.field4920;
         this.field4921 = var1.field4921;
         this.field4922 = var1.field4922;
         this.method2875(var1.method2874());
         this.field_242271_ac = var1.field_242271_ac;
      }

      this.field4923 = var1.field4923;
      this.field4903 = var1.field4903;
      this.getDataManager().method35446(field4897, var1.getDataManager().<Byte>method35445(field4897));
      this.field4870 = -1;
      this.field4867 = -1.0F;
      this.field4868 = -1;
      this.field4878.method21357(var1.field4878);
      this.field4858.addAll(var1.field4858);
      this.field4877 = var1.field4877;
      this.field4882 = var1.field4882;
      this.method2970(var1.method2969());
      this.method2972(var1.method2971());
   }

   @Override
   public void onNewPotionEffect(EffectInstance var1) {
      super.onNewPotionEffect(var1);
      this.connection.sendPacket(new SPlayEntityEffectPacket(this.getEntityId(), var1));
      if (var1.getPotion() == Effects.LEVITATION) {
         this.field4880 = this.ticksExisted;
         this.field4879 = this.getPositionVec();
      }

      CriteriaTriggers.field44491.method15083(this);
   }

   @Override
   public void onChangedPotionEffect(EffectInstance var1, boolean var2) {
      super.onChangedPotionEffect(var1, var2);
      this.connection.sendPacket(new SPlayEntityEffectPacket(this.getEntityId(), var1));
      CriteriaTriggers.field44491.method15083(this);
   }

   @Override
   public void onFinishedPotionEffect(EffectInstance var1) {
      super.onFinishedPotionEffect(var1);
      this.connection.sendPacket(new SRemoveEntityEffectPacket(this.getEntityId(), var1.getPotion()));
      if (var1.getPotion() == Effects.LEVITATION) {
         this.field4879 = null;
      }

      CriteriaTriggers.field44491.method15083(this);
   }

   @Override
   public void setPositionAndUpdate(double var1, double var3, double var5) {
      this.connection.method15668(var1, var3, var5, this.rotationYaw, this.rotationPitch);
   }

   @Override
   public void moveForced(double var1, double var3, double var5) {
      this.setPositionAndUpdate(var1, var3, var5);
      this.connection.method15656();
   }

   @Override
   public void onCriticalHit(Entity var1) {
      this.getServerWorld().getChunkProvider().sendToAllTracking(this, new SAnimateHandPacket(var1, 4));
   }

   @Override
   public void onEnchantmentCritical(Entity var1) {
      this.getServerWorld().getChunkProvider().sendToAllTracking(this, new SAnimateHandPacket(var1, 5));
   }

   @Override
   public void method2797() {
      if (this.connection != null) {
         this.connection.sendPacket(new SPlayerAbilitiesPacket(this.abilities));
         this.updatePotionMetadata();
      }
   }

   public ServerWorld getServerWorld() {
      return (ServerWorld)this.world;
   }

   @Override
   public void method2799(GameType var1) {
      this.interactionManager.method33861(var1);
      this.connection.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24563, (float)var1.getID()));
      if (var1 != GameType.SPECTATOR) {
         this.method2815(this);
      } else {
         this.method2949();
         this.stopRiding();
      }

      this.method2797();
      this.markPotionsDirty();
   }

   @Override
   public boolean isSpectator() {
      return this.interactionManager.getGameType() == GameType.SPECTATOR;
   }

   @Override
   public boolean isCreative() {
      return this.interactionManager.getGameType() == GameType.CREATIVE;
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
      this.method2802(var1, ChatType.SYSTEM, var2);
   }

   public void method2802(ITextComponent var1, ChatType var2, UUID var3) {
      this.connection
         .method15672(
            new SChatPacket(var1, var2, var3),
            var4 -> {
               if (!var4.isSuccess() && (var2 == ChatType.GAME_INFO || var2 == ChatType.SYSTEM)) {
                  String var8 = var1.getStringTruncated(256);
                  IFormattableTextComponent var9 = new StringTextComponent(var8).mergeStyle(TextFormatting.YELLOW);
                  this.connection
                     .sendPacket(
                        new SChatPacket(
                           new TranslationTextComponent("multiplayer.message_not_delivered", var9).mergeStyle(TextFormatting.RED), ChatType.SYSTEM, var3
                        )
                     );
               }
            }
         );
   }

   public String method2803() {
      String var3 = this.connection.netManager.getRemoteAddress().toString();
      var3 = var3.substring(var3.indexOf("/") + 1);
      return var3.substring(0, var3.indexOf(":"));
   }

   public void method2804(CClientSettingsPacket var1) {
      this.field4872 = var1.getChatVisibility();
      this.field4873 = var1.isColorsEnabled();
      this.getDataManager().method35446(field4897, (byte)var1.getModelPartFlags());
      this.getDataManager().method35446(field4898, (byte)(var1.getMainHand() != HandSide.LEFT ? 1 : 0));
   }

   public ChatVisibility getChatVisibility() {
      return this.field4872;
   }

   public void method2806(String var1, String var2) {
      this.connection.sendPacket(new SSendResourcePackPacket(var1, var2));
   }

   @Override
   public int method2807() {
      return this.field4856.method1418(this.getGameProfile());
   }

   public void markPlayerActive() {
      this.field4874 = Util.milliTime();
   }

   public Class8287 method2809() {
      return this.field4860;
   }

   public Class6942 method2810() {
      return this.field4878;
   }

   public void method2811(Entity var1) {
      if (!(var1 instanceof PlayerEntity)) {
         this.field4858.add(var1.getEntityId());
      } else {
         this.connection.sendPacket(new SDestroyEntitiesPacket(var1.getEntityId()));
      }
   }

   public void method2812(Entity var1) {
      this.field4858.remove(Integer.valueOf(var1.getEntityId()));
   }

   @Override
   public void updatePotionMetadata() {
      if (!this.isSpectator()) {
         super.updatePotionMetadata();
      } else {
         this.resetPotionEffectMetadata();
         this.setInvisible(true);
      }
   }

   public Entity method2814() {
      return (Entity)(this.field4875 != null ? this.field4875 : this);
   }

   public void method2815(Entity var1) {
      Entity var4 = this.method2814();
      this.field4875 = (Entity)(var1 != null ? var1 : this);
      if (var4 != this.field4875) {
         this.connection.sendPacket(new SCameraPacket(this.field4875));
         this.setPositionAndUpdate(this.field4875.getPosX(), this.field4875.getPosY(), this.field4875.getPosZ());
      }
   }

   @Override
   public void decrementTimeUntilPortal() {
      if (!this.field4876) {
         super.decrementTimeUntilPortal();
      }
   }

   @Override
   public void attackTargetEntityWithCurrentItem(Entity targetEntity) {
      if (this.interactionManager.getGameType() != GameType.SPECTATOR) {
         super.attackTargetEntityWithCurrentItem(targetEntity);
      } else {
         this.method2815(targetEntity);
      }
   }

   public long method2818() {
      return this.field4874;
   }

   @Nullable
   public ITextComponent getTabListDisplayName() {
      return null;
   }

   @Override
   public void swingArm(Hand var1) {
      super.swingArm(var1);
      this.resetCooldown();
   }

   public boolean method2821() {
      return this.field4876;
   }

   public void method2822() {
      this.field4876 = false;
   }

   public Class8019 method2823() {
      return this.field4859;
   }

   public void method2824(ServerWorld var1, double var2, double var4, double var6, float var8, float var9) {
      this.method2815(this);
      this.stopRiding();
      if (var1 != this.world) {
         ServerWorld var12 = this.getServerWorld();
         Class6612 var13 = var1.getWorldInfo();
         this.connection
            .sendPacket(
               new SRespawnPacket(
                  var1.getDimensionType(),
                  var1.getDimensionKey(),
                  BiomeManager.getHashedSeed(var1.getSeed()),
                  this.interactionManager.getGameType(),
                  this.interactionManager.method33864(),
                  var1.isDebug(),
                  var1.method6966(),
                  true
               )
            );
         this.connection.sendPacket(new SServerDifficultyPacket(var13.method20047(), var13.method20048()));
         this.field4856.getPlayerList().method19454(this);
         var12.method6934(this);
         this.removed = false;
         this.setLocationAndAngles(var2, var4, var6, var8, var9);
         this.setWorld(var1);
         var1.method6919(this);
         this.method2748(var12);
         this.connection.method15668(var2, var4, var6, var8, var9);
         this.interactionManager.method33871(var1);
         this.field4856.getPlayerList().method19472(this, var1);
         this.field4856.getPlayerList().method19473(this);
      } else {
         this.connection.method15668(var2, var4, var6, var8, var9);
      }
   }

   @Nullable
   public BlockPos method2825() {
      return this.field4885;
   }

   public float method2826() {
      return this.field4887;
   }

   public RegistryKey<World> method2827() {
      return this.field4884;
   }

   public boolean method2828() {
      return this.field4886;
   }

   public void method2829(RegistryKey<World> var1, BlockPos var2, float var3, boolean var4, boolean var5) {
      if (var2 == null) {
         this.field4885 = null;
         this.field4884 = World.OVERWORLD;
         this.field4887 = 0.0F;
         this.field4886 = false;
      } else {
         boolean var8 = var2.equals(this.field4885) && var1.equals(this.field4884);
         if (var5 && !var8) {
            this.sendMessage(new TranslationTextComponent("block.minecraft.set_spawn"), Util.DUMMY_UUID);
         }

         this.field4885 = var2;
         this.field4884 = var1;
         this.field4887 = var3;
         this.field4886 = var4;
      }
   }

   public void method2830(ChunkPos var1, IPacket<?> var2, IPacket<?> var3) {
      this.connection.sendPacket(var3);
      this.connection.sendPacket(var2);
   }

   public void method2831(ChunkPos var1) {
      if (this.isAlive()) {
         this.connection.sendPacket(new SUnloadChunkPacket(var1.x, var1.z));
      }
   }

   public SectionPos method2832() {
      return this.field4883;
   }

   public void method2833(SectionPos var1) {
      this.field4883 = var1;
   }

   @Override
   public void method2834(SoundEvent var1, SoundCategory var2, float var3, float var4) {
      this.connection.sendPacket(new SPlaySoundEffectPacket(var1, var2, this.getPosX(), this.getPosY(), this.getPosZ(), var3, var4));
   }

   @Override
   public IPacket<?> createSpawnPacket() {
      return new SSpawnPlayerPacket(this);
   }

   @Override
   public ItemEntity method2836(ItemStack var1, boolean var2, boolean var3) {
      ItemEntity var6 = super.method2836(var1, var2, var3);
      if (var6 != null) {
         this.world.addEntity(var6);
         ItemStack var7 = var6.method4124();
         if (var3) {
            if (!var7.isEmpty()) {
               this.method2776(Stats.field40101.method172(var7.getItem()), var1.getCount());
            }

            this.method2911(Stats.field40126);
         }

         return var6;
      } else {
         return null;
      }
   }

   @Nullable
   public IChatFilter method2837() {
      return this.field4888;
   }
}
