package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.serialization.Dynamic;
import io.netty.buffer.Unpooled;
import java.io.File;
import java.net.SocketAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.server.*;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class6395 {
   public static final File field27984 = new File("banned-players.json");
   public static final File field27985 = new File("banned-ips.json");
   public static final File field27986 = new File("ops.json");
   public static final File field27987 = new File("whitelist.json");
   private static final Logger field27988 = LogManager.getLogger();
   private static final SimpleDateFormat field27989 = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer field27990;
   private final List<ServerPlayerEntity> field27991 = Lists.newArrayList();
   private final Map<UUID, ServerPlayerEntity> field27992 = Maps.newHashMap();
   private final Class4528 field27993 = new Class4528(field27984);
   private final Class4532 field27994 = new Class4532(field27985);
   private final Class4530 field27995 = new Class4530(field27986);
   private final Class4531 field27996 = new Class4531(field27987);
   private final Map<UUID, Class8287> field27997 = Maps.newHashMap();
   private final Map<UUID, Class8019> field27998 = Maps.newHashMap();
   private final Class8716 field27999;
   private boolean field28000;
   private final DynamicRegistriesImpl field28001;
   public final int field28002;
   private int field28003;
   private GameType field28004;
   private boolean field28005;
   private int field28006;

   public Class6395(MinecraftServer var1, DynamicRegistriesImpl var2, Class8716 var3, int var4) {
      this.field27990 = var1;
      this.field28001 = var2;
      this.field28002 = var4;
      this.field27999 = var3;
   }

   public void method19445(NetworkManager var1, ServerPlayerEntity var2) {
      GameProfile var5 = var2.getGameProfile();
      PlayerProfileCache var6 = this.field27990.method1386();
      GameProfile var7 = var6.method31793(var5.getId());
      String var8 = var7 != null ? var7.getName() : var5.getName();
      var6.method31790(var5);
      CompoundNBT var9 = this.method19448(var2);
      RegistryKey var10 = var9 == null
         ? World.OVERWORLD
         : DimensionType.decodeWorldKey(new Dynamic(NBTDynamicOps.INSTANCE, var9.method116("Dimension"))).resultOrPartial(field27988::error).orElse(World.OVERWORLD);
      ServerWorld var11 = this.field27990.method1318(var10);
      ServerWorld var12;
      if (var11 != null) {
         var12 = var11;
      } else {
         field27988.warn("Unknown respawn dimension {}, defaulting to overworld", var10);
         var12 = this.field27990.method1317();
      }

      var2.method3268(var12);
      var2.interactionManager.method33871((ServerWorld)var2.world);
      String var13 = "local";
      if (var1.method30700() != null) {
         var13 = var1.method30700().toString();
      }

      field27988.info(
         "{}[{}] logged in with entity id {} at ({}, {}, {})",
         var2.getName().getString(),
         var13,
         var2.getEntityId(),
         var2.getPosX(),
         var2.getPosY(),
         var2.getPosZ()
      );
      Class6612 var14 = var12.getWorldInfo();
      this.method19481(var2, (ServerPlayerEntity)null, var12);
      ServerPlayNetHandler var15 = new ServerPlayNetHandler(this.field27990, var1, var2);
      Class5462 var16 = var12.getGameRules();
      boolean var17 = var16.getBoolean(Class5462.field24248);
      boolean var18 = var16.getBoolean(Class5462.field24237);
      var15.sendPacket(
         new SJoinGamePacket(
            var2.getEntityId(),
            var2.interactionManager.getGameType(),
            var2.interactionManager.method33864(),
            BiomeManager.method20321(var12.method6967()),
            var14.isHardcore(),
            this.field27990.method1319(),
            this.field28001,
            var12.method6812(),
            var12.getDimensionKey(),
            this.method19475(),
            this.field28003,
            var18,
            !var17,
            var12.isDebug(),
            var12.method6966()
         )
      );
      var15.sendPacket(new SCustomPayloadPlayPacket(SCustomPayloadPlayPacket.field24537, new PacketBuffer(Unpooled.buffer()).writeString(this.method19444().method1325())));
      var15.sendPacket(new SServerDifficultyPacket(var14.method20047(), var14.method20048()));
      var15.sendPacket(new SPlayerAbilitiesPacket(var2.abilities));
      var15.sendPacket(new SHeldItemChangePacket(var2.inventory.currentItem));
      var15.sendPacket(new SUpdateRecipesPacket(this.field27990.method1407().method1036()));
      var15.sendPacket(new STagsListPacket(this.field27990.method1408()));
      this.method19454(var2);
      var2.method2809().method28969();
      var2.method2810().method21382(var2);
      this.method19446(var12.method6805(), var2);
      this.field27990.method1388();
      TranslationTextComponent var19;
      if (!var2.getGameProfile().getName().equalsIgnoreCase(var8)) {
         var19 = new TranslationTextComponent("multiplayer.player.joined.renamed", var2.getDisplayName(), var8);
      } else {
         var19 = new TranslationTextComponent("multiplayer.player.joined", var2.getDisplayName());
      }

      this.method19484(var19.mergeStyle(TextFormatting.YELLOW), ChatType.SYSTEM, Util.DUMMY_UUID);
      var15.method15668(var2.getPosX(), var2.getPosY(), var2.getPosZ(), var2.rotationYaw, var2.rotationPitch);
      this.field27991.add(var2);
      this.field27992.put(var2.getUniqueID(), var2);
      this.method19456(new SPlayerListItemPacket(SPlayerListItemPacket.Action.ADD_PLAYER, var2));

      for (int var20 = 0; var20 < this.field27991.size(); var20++) {
         var2.field4855.sendPacket(new SPlayerListItemPacket(SPlayerListItemPacket.Action.ADD_PLAYER, this.field27991.get(var20)));
      }

      var12.method6921(var2);
      this.field27990.method1414().method29607(var2);
      this.method19472(var2, var12);
      if (!this.field27990.method1344().isEmpty()) {
         var2.method2806(this.field27990.method1344(), this.field27990.method1345());
      }

      for (EffectInstance var21 : var2.getActivePotionEffects()) {
         var15.sendPacket(new SPlayEntityEffectPacket(var2.getEntityId(), var21));
      }

      if (var9 != null && var9.contains("RootVehicle", 10)) {
         CompoundNBT var26 = var9.getCompound("RootVehicle");
         Entity var27 = EntityType.method33223(var26.getCompound("Entity"), var12, var1x -> var12.method6917(var1x) ? var1x : null);
         if (var27 != null) {
            UUID var22;
            if (!var26.method106("Attach")) {
               var22 = null;
            } else {
               var22 = var26.method105("Attach");
            }

            if (!var27.getUniqueID().equals(var22)) {
               for (Entity var24 : var27.method3411()) {
                  if (var24.getUniqueID().equals(var22)) {
                     var2.startRiding(var24, true);
                     break;
                  }
               }
            } else {
               var2.startRiding(var27, true);
            }

            if (!var2.isPassenger()) {
               field27988.warn("Couldn't reattach entity to player");
               var12.method6932(var27);

               for (Entity var29 : var27.method3411()) {
                  var12.method6932(var29);
               }
            }
         }
      }

      var2.method2729();
   }

   public void method19446(Class6887 var1, ServerPlayerEntity var2) {
      HashSet var5 = Sets.newHashSet();

      for (ScorePlayerTeam var7 : var1.method20997()) {
         var2.field4855.sendPacket(new STeamsPacket(var7, 0));
      }

      for (int var10 = 0; var10 < 19; var10++) {
         Class8375 var11 = var1.method20989(var10);
         if (var11 != null && !var5.contains(var11)) {
            for (Packet var9 : var1.method21023(var11)) {
               var2.field4855.sendPacket(var9);
            }

            var5.add(var11);
         }
      }
   }

   public void method19447(ServerWorld var1) {
      var1.getWorldBorder().method24543(new Class7046(this));
   }

   @Nullable
   public CompoundNBT method19448(ServerPlayerEntity var1) {
      CompoundNBT var4 = this.field27990.method1436().method20083();
      CompoundNBT var5;
      if (var1.getName().getString().equals(this.field27990.method1332()) && var4 != null) {
         var5 = var4;
         var1.read(var4);
         field27988.debug("loading single player");
      } else {
         var5 = this.field27999.method31442(var1);
      }

      return var5;
   }

   public void method19449(ServerPlayerEntity var1) {
      this.field27999.method31441(var1);
      Class8287 var4 = this.field27997.get(var1.getUniqueID());
      if (var4 != null) {
         var4.method28962();
      }

      Class8019 var5 = this.field27998.get(var1.getUniqueID());
      if (var5 != null) {
         var5.method27409();
      }
   }

   public void method19450(ServerPlayerEntity var1) {
      ServerWorld var4 = var1.getServerWorld();
      var1.method2911(Stats.field40105);
      this.method19449(var1);
      if (var1.isPassenger()) {
         Entity var5 = var1.method3415();
         if (var5.method3413()) {
            field27988.debug("Removing player mount");
            var1.stopRiding();
            var4.method6932(var5);
            var5.removed = true;

            for (Entity var7 : var5.method3411()) {
               var4.method6932(var7);
               var7.removed = true;
            }

            var4.getChunk(var1.chunkCoordX, var1.chunkCoordZ).method7137();
         }
      }

      var1.detach();
      var4.method6934(var1);
      var1.method2823().method27403();
      this.field27991.remove(var1);
      this.field27990.method1414().method29608(var1);
      UUID var8 = var1.getUniqueID();
      ServerPlayerEntity var9 = this.field27992.get(var8);
      if (var9 == var1) {
         this.field27992.remove(var8);
         this.field27997.remove(var8);
         this.field27998.remove(var8);
      }

      this.method19456(new SPlayerListItemPacket(SPlayerListItemPacket.Action.REMOVE_PLAYER, var1));
   }

   @Nullable
   public ITextComponent method19451(SocketAddress var1, GameProfile var2) {
      if (this.field27993.method14431(var2)) {
         Class6786 var7 = this.field27993.method14437(var2);
         TranslationTextComponent var8 = new TranslationTextComponent("multiplayer.disconnect.banned.reason", var7.method20683());
         if (var7.method20682() != null) {
            var8.append(new TranslationTextComponent("multiplayer.disconnect.banned.expiration", field27989.format(var7.method20682())));
         }

         return var8;
      } else if (this.method19441(var2)) {
         if (this.field27994.method14449(var1)) {
            Class6788 var5 = this.field27994.method14451(var1);
            TranslationTextComponent var6 = new TranslationTextComponent("multiplayer.disconnect.banned_ip.reason", var5.method20683());
            if (var5.method20682() != null) {
               var6.append(new TranslationTextComponent("multiplayer.disconnect.banned_ip.expiration", field27989.format(var5.method20682())));
            }

            return var6;
         } else {
            return this.field27991.size() >= this.field28002 && !this.method19443(var2)
               ? new TranslationTextComponent("multiplayer.disconnect.server_full")
               : null;
         }
      } else {
         return new TranslationTextComponent("multiplayer.disconnect.not_whitelisted");
      }
   }

   public ServerPlayerEntity method19452(GameProfile var1) {
      UUID var4 = PlayerEntity.method2960(var1);
      List<ServerPlayerEntity> var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < this.field27991.size(); var6++) {
         ServerPlayerEntity var7 = this.field27991.get(var6);
         if (var7.getUniqueID().equals(var4)) {
            var5.add(var7);
         }
      }

      ServerPlayerEntity var9 = this.field27992.get(var1.getId());
      if (var9 != null && !var5.contains(var9)) {
         var5.add(var9);
      }

      for (ServerPlayerEntity var8 : var5) {
         var8.field4855.disconnect(new TranslationTextComponent("multiplayer.disconnect.duplicate_login"));
      }

      ServerWorld var11 = this.field27990.method1317();
      Object var12;
      if (!this.field27990.method1342()) {
         var12 = new Class9081(var11);
      } else {
         var12 = new Class9080(var11);
      }

      return new ServerPlayerEntity(this.field27990, var11, var1, (Class9081)var12);
   }

   public ServerPlayerEntity func_232644_a_(ServerPlayerEntity var1, boolean var2) {
      this.field27991.remove(var1);
      var1.getServerWorld().method6934(var1);
      BlockPos var5 = var1.method2825();
      float var6 = var1.method2826();
      boolean var7 = var1.method2828();
      ServerWorld var8 = this.field27990.method1318(var1.method2827());
      Optional var9;
      if (var8 != null && var5 != null) {
         var9 = PlayerEntity.method2908(var8, var5, var6, var7, var2);
      } else {
         var9 = Optional.empty();
      }

      ServerWorld var10 = var8 != null && var9.isPresent() ? var8 : this.field27990.method1317();
      Object var11;
      if (!this.field27990.method1342()) {
         var11 = new Class9081(var10);
      } else {
         var11 = new Class9080(var10);
      }

      ServerPlayerEntity var12 = new ServerPlayerEntity(this.field27990, var10, var1.getGameProfile(), (Class9081)var11);
      var12.field4855 = var1.field4855;
      var12.method2789(var1, var2);
      var12.setEntityId(var1.getEntityId());
      var12.method2968(var1.getPrimaryHand());

      for (String var14 : var1.getTags()) {
         var12.addTag(var14);
      }

      this.method19481(var12, var1, var10);
      boolean var19 = false;
      if (!var9.isPresent()) {
         if (var5 != null) {
            var12.field4855.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24560, 0.0F));
         }
      } else {
         BlockState var20 = var10.getBlockState(var5);
         boolean var15 = var20.isIn(Blocks.field37124);
         Vector3d var16 = (Vector3d)var9.get();
         float var18;
         if (!var20.method23446(BlockTags.field32770) && !var15) {
            var18 = var6;
         } else {
            Vector3d var17 = Vector3d.method11330(var5).method11336(var16).method11333();
            var18 = (float) MathHelper.wrapDegrees(MathHelper.method37814(var17.z, var17.x) * 180.0F / (float)Math.PI - 90.0);
         }

         var12.setLocationAndAngles(var16.x, var16.y, var16.z, var18, 0.0F);
         var12.method2829(var10.getDimensionKey(), var5, var6, var7, false);
         var19 = !var2 && var15;
      }

      while (!var10.hasNoCollisions(var12) && var12.getPosY() < 256.0) {
         var12.setPosition(var12.getPosX(), var12.getPosY() + 1.0, var12.getPosZ());
      }

      Class6612 var21 = var12.world.getWorldInfo();
      var12.field4855
         .sendPacket(
            new SRespawnPacket(
               var12.world.method6812(),
               var12.world.getDimensionKey(),
               BiomeManager.method20321(var12.getServerWorld().method6967()),
               var12.interactionManager.getGameType(),
               var12.interactionManager.method33864(),
               var12.getServerWorld().isDebug(),
               var12.getServerWorld().method6966(),
               var2
            )
         );
      var12.field4855.method15668(var12.getPosX(), var12.getPosY(), var12.getPosZ(), var12.rotationYaw, var12.rotationPitch);
      var12.field4855.sendPacket(new SWorldSpawnChangedPacket(var10.method6947(), var10.method6948()));
      var12.field4855.sendPacket(new SServerDifficultyPacket(var21.method20047(), var21.method20048()));
      var12.field4855.sendPacket(new SSetExperiencePacket(var12.field4922, var12.field4921, var12.field4920));
      this.method19472(var12, var10);
      this.method19454(var12);
      var10.method6922(var12);
      this.field27991.add(var12);
      this.field27992.put(var12.getUniqueID(), var12);
      var12.method2729();
      var12.setHealth(var12.getHealth());
      if (var19) {
         var12.field4855
            .sendPacket(
               new SPlaySoundEffectPacket(
                  SoundEvents.field27014, Class2266.field14732, (double)var5.getX(), (double)var5.getY(), (double)var5.getZ(), 1.0F, 1.0F
               )
            );
      }

      return var12;
   }

   public void method19454(ServerPlayerEntity var1) {
      GameProfile var4 = var1.getGameProfile();
      int var5 = this.field27990.method1418(var4);
      this.method19463(var1, var5);
   }

   public void method19455() {
      if (++this.field28006 > 600) {
         this.method19456(new SPlayerListItemPacket(SPlayerListItemPacket.Action.UPDATE_LATENCY, this.field27991));
         this.field28006 = 0;
      }
   }

   public void method19456(Packet<?> var1) {
      for (int var4 = 0; var4 < this.field27991.size(); var4++) {
         this.field27991.get(var4).field4855.sendPacket(var1);
      }
   }

   public void method19457(Packet<?> var1, RegistryKey<World> var2) {
      for (int var5 = 0; var5 < this.field27991.size(); var5++) {
         ServerPlayerEntity var6 = this.field27991.get(var5);
         if (var6.world.getDimensionKey() == var2) {
            var6.field4855.sendPacket(var1);
         }
      }
   }

   public void method19458(PlayerEntity var1, ITextComponent var2) {
      Team var5 = var1.getTeam();
      if (var5 != null) {
         for (String var7 : var5.method28575()) {
            ServerPlayerEntity var8 = this.method19465(var7);
            if (var8 != null && var8 != var1) {
               var8.sendMessage(var2, var1.getUniqueID());
            }
         }
      }
   }

   public void method19459(PlayerEntity var1, ITextComponent var2) {
      Team var5 = var1.getTeam();
      if (var5 != null) {
         for (int var6 = 0; var6 < this.field27991.size(); var6++) {
            ServerPlayerEntity var7 = this.field27991.get(var6);
            if (var7.getTeam() != var5) {
               var7.sendMessage(var2, var1.getUniqueID());
            }
         }
      } else {
         this.method19484(var2, ChatType.SYSTEM, var1.getUniqueID());
      }
   }

   public String[] method19460() {
      String[] var3 = new String[this.field27991.size()];

      for (int var4 = 0; var4 < this.field27991.size(); var4++) {
         var3[var4] = this.field27991.get(var4).getGameProfile().getName();
      }

      return var3;
   }

   public Class4528 method19461() {
      return this.field27993;
   }

   public Class4532 method19462() {
      return this.field27994;
   }

   public void method19430(GameProfile var1) {
      this.field27995.method14436(new Class6790(var1, this.field27990.method1288(), this.field27995.method14447(var1)));
      ServerPlayerEntity var4 = this.method19489(var1.getId());
      if (var4 != null) {
         this.method19454(var4);
      }
   }

   public void method19431(GameProfile var1) {
      this.field27995.method14438(var1);
      ServerPlayerEntity var4 = this.method19489(var1.getId());
      if (var4 != null) {
         this.method19454(var4);
      }
   }

   private void method19463(ServerPlayerEntity var1, int var2) {
      if (var1.field4855 != null) {
         byte var5;
         if (var2 > 0) {
            if (var2 < 4) {
               var5 = (byte)(24 + var2);
            } else {
               var5 = 28;
            }
         } else {
            var5 = 24;
         }

         var1.field4855.sendPacket(new SEntityStatusPacket(var1, var5));
      }

      this.field27990.getCommandManager().method18837(var1);
   }

   public boolean method19441(GameProfile var1) {
      return !this.field28000 || this.field27995.method14441(var1) || this.field27996.method14441(var1);
   }

   public boolean canSendCommands(GameProfile var1) {
      return this.field27995.method14441(var1) || this.field27990.method1421(var1) && this.field27990.method1436().method20072() || this.field28005;
   }

   @Nullable
   public ServerPlayerEntity method19465(String var1) {
      for (ServerPlayerEntity var5 : this.field27991) {
         if (var5.getGameProfile().getName().equalsIgnoreCase(var1)) {
            return var5;
         }
      }

      return null;
   }

   public void method19466(PlayerEntity var1, double var2, double var4, double var6, double var8, RegistryKey<World> var10, Packet<?> var11) {
      for (int var14 = 0; var14 < this.field27991.size(); var14++) {
         ServerPlayerEntity var15 = this.field27991.get(var14);
         if (var15 != var1 && var15.world.getDimensionKey() == var10) {
            double var16 = var2 - var15.getPosX();
            double var18 = var4 - var15.getPosY();
            double var20 = var6 - var15.getPosZ();
            if (var16 * var16 + var18 * var18 + var20 * var20 < var8 * var8) {
               var15.field4855.sendPacket(var11);
            }
         }
      }
   }

   public void saveAllPlayerData() {
      for (int var3 = 0; var3 < this.field27991.size(); var3++) {
         this.method19449(this.field27991.get(var3));
      }
   }

   public Class4531 method19468() {
      return this.field27996;
   }

   public String[] method19469() {
      return this.field27996.method14432();
   }

   public Class4530 method19470() {
      return this.field27995;
   }

   public String[] method19471() {
      return this.field27995.method14432();
   }

   public void method19432() {
   }

   public void method19472(ServerPlayerEntity var1, ServerWorld var2) {
      WorldBorder var5 = this.field27990.method1317().getWorldBorder();
      var1.field4855.sendPacket(new SWorldBorderPacket(var5, Class1864.field10036));
      var1.field4855.sendPacket(new SUpdateTimePacket(var2.getGameTime(), var2.method6784(), var2.getGameRules().getBoolean(Class5462.field24232)));
      var1.field4855.sendPacket(new SWorldSpawnChangedPacket(var2.method6947(), var2.method6948()));
      if (var2.method6795()) {
         var1.field4855.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24561, 0.0F));
         var1.field4855.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24567, var2.method6792(1.0F)));
         var1.field4855.sendPacket(new SChangeGameStatePacket(SChangeGameStatePacket.field24568, var2.method6790(1.0F)));
      }
   }

   public void method19473(ServerPlayerEntity var1) {
      var1.method2771(var1.container);
      var1.method2784();
      var1.field4855.sendPacket(new SHeldItemChangePacket(var1.inventory.currentItem));
   }

   public int method19474() {
      return this.field27991.size();
   }

   public int method19475() {
      return this.field28002;
   }

   public boolean method19476() {
      return this.field28000;
   }

   public void method19429(boolean var1) {
      this.field28000 = var1;
   }

   public List<ServerPlayerEntity> method19477(String var1) {
      ArrayList var4 = Lists.newArrayList();

      for (ServerPlayerEntity var6 : this.field27991) {
         if (var6.method2803().equals(var1)) {
            var4.add(var6);
         }
      }

      return var4;
   }

   public int method19478() {
      return this.field28003;
   }

   public MinecraftServer method19444() {
      return this.field27990;
   }

   public CompoundNBT method19479() {
      return null;
   }

   public void method19480(GameType var1) {
      this.field28004 = var1;
   }

   private void method19481(ServerPlayerEntity var1, ServerPlayerEntity var2, ServerWorld var3) {
      if (var2 == null) {
         if (this.field28004 != null) {
            var1.interactionManager.method33862(this.field28004, GameType.field11101);
         }
      } else {
         var1.interactionManager.method33862(var2.interactionManager.getGameType(), var2.interactionManager.method33864());
      }

      var1.interactionManager.method33867(var3.getServer().method1436().method20067());
   }

   public void method19482(boolean var1) {
      this.field28005 = var1;
   }

   public void method19483() {
      for (int var3 = 0; var3 < this.field27991.size(); var3++) {
         this.field27991.get(var3).field4855.disconnect(new TranslationTextComponent("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void method19484(ITextComponent var1, ChatType var2, UUID var3) {
      this.field27990.sendMessage(var1, var3);
      this.method19456(new SChatPacket(var1, var2, var3));
   }

   public Class8287 method19485(PlayerEntity var1) {
      UUID var4 = var1.getUniqueID();
      Class8287 var5 = var4 != null ? this.field27997.get(var4) : null;
      if (var5 == null) {
         File var6 = this.field27990.method1433(FolderName.field23347).toFile();
         File var7 = new File(var6, var4 + ".json");
         if (!var7.exists()) {
            File var8 = new File(var6, var1.getName().getString() + ".json");
            if (var8.exists() && var8.isFile()) {
               var8.renameTo(var7);
            }
         }

         var5 = new Class8287(this.field27990, var7);
         this.field27997.put(var4, var5);
      }

      return var5;
   }

   public Class8019 method19486(ServerPlayerEntity var1) {
      UUID var4 = var1.getUniqueID();
      Class8019 var5 = this.field27998.get(var4);
      if (var5 == null) {
         File var6 = this.field27990.method1433(FolderName.field23346).toFile();
         File var7 = new File(var6, var4 + ".json");
         var5 = new Class8019(this.field27990.getDataFixer(), this, this.field27990.method1396(), var7, var1);
         this.field27998.put(var4, var5);
      }

      var5.method27402(var1);
      return var5;
   }

   public void method19487(int var1) {
      this.field28003 = var1;
      this.method19456(new SUpdateViewDistancePacket(var1));

      for (ServerWorld var5 : this.field27990.method1320()) {
         if (var5 != null) {
            var5.getChunkProvider().method7381(var1);
         }
      }
   }

   public List<ServerPlayerEntity> method19488() {
      return this.field27991;
   }

   @Nullable
   public ServerPlayerEntity method19489(UUID var1) {
      return this.field27992.get(var1);
   }

   public boolean method19443(GameProfile var1) {
      return false;
   }

   public void reloadResources() {
      for (Class8019 var4 : this.field27998.values()) {
         var4.method27404(this.field27990.method1396());
      }

      this.method19456(new STagsListPacket(this.field27990.method1408()));
      SUpdateRecipesPacket var6 = new SUpdateRecipesPacket(this.field27990.method1407().method1036());

      for (ServerPlayerEntity var5 : this.field27991) {
         var5.field4855.sendPacket(var6);
         var5.method2810().method21382(var5);
      }
   }

   public boolean method19491() {
      return this.field28005;
   }
}
