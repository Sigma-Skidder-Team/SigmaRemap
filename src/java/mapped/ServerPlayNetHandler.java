package mapped;

import com.google.common.collect.Lists;
import com.google.common.primitives.Doubles;
import com.google.common.primitives.Floats;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import it.unimi.dsi.fastutil.ints.Int2ShortMap;
import it.unimi.dsi.fastutil.ints.Int2ShortOpenHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import net.minecraft.advancements.Advancement;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ChatVisibility;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.projectile.AbstractArrowEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.play.IServerPlayNetHandler;
import net.minecraft.network.play.client.*;
import net.minecraft.network.play.server.*;
import net.minecraft.tileentity.CommandBlockTileEntity;
import net.minecraft.tileentity.JigsawTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.filter.IChatFilter;
import net.minecraft.world.GameType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ServerPlayNetHandler implements IServerPlayNetHandler {
   private static final Logger LOGGER = LogManager.getLogger();
   public final NetworkManager netManager;
   private final MinecraftServer server;
   public ServerPlayerEntity player;
   private int field23227;
   private long field23228;
   private boolean field23229;
   private long field23230;
   private int chatSpamThresholdCount;
   private int field23232;
   private final Int2ShortMap field23233 = new Int2ShortOpenHashMap();
   private double field23234;
   private double field23235;
   private double field23236;
   private double field23237;
   private double field23238;
   private double field23239;
   private Entity field23240;
   private double field23241;
   private double field23242;
   private double field23243;
   private double field23244;
   private double field23245;
   private double field23246;
   private Vector3d targetPos;
   private int field23248;
   private int field23249;
   private boolean field23250;
   private int field23251;
   private boolean field23252;
   private int field23253;
   private int field23254;
   private int field23255;

   public ServerPlayNetHandler(MinecraftServer var1, NetworkManager var2, ServerPlayerEntity var3) {
      this.server = var1;
      this.netManager = var2;
      var2.setNetHandler(this);
      this.player = var3;
      var3.field4855 = this;
      IChatFilter var6 = var3.method2837();
      if (var6 != null) {
         var6.func_244800_a();
      }
   }

   public void method15655() {
      this.method15656();
      this.player.prevPosX = this.player.getPosX();
      this.player.prevPosY = this.player.getPosY();
      this.player.prevPosZ = this.player.getPosZ();
      this.player.method2735();
      this.player.method3269(this.field23234, this.field23235, this.field23236, this.player.rotationYaw, this.player.rotationPitch);
      this.field23227++;
      this.field23255 = this.field23254;
      if (this.field23250 && !this.player.isSleeping()) {
         if (++this.field23251 > 80) {
            LOGGER.warn("{} was kicked for floating too long!", this.player.getName().getString());
            this.disconnect(new TranslationTextComponent("multiplayer.disconnect.flying"));
            return;
         }
      } else {
         this.field23250 = false;
         this.field23251 = 0;
      }

      this.field23240 = this.player.method3415();
      if (this.field23240 != this.player && this.field23240.method3407() == this.player) {
         this.field23241 = this.field23240.getPosX();
         this.field23242 = this.field23240.getPosY();
         this.field23243 = this.field23240.getPosZ();
         this.field23244 = this.field23240.getPosX();
         this.field23245 = this.field23240.getPosY();
         this.field23246 = this.field23240.getPosZ();
         if (this.field23252 && this.player.method3415().method3407() == this.player) {
            if (++this.field23253 > 80) {
               LOGGER.warn("{} was kicked for floating a vehicle too long!", this.player.getName().getString());
               this.disconnect(new TranslationTextComponent("multiplayer.disconnect.flying"));
               return;
            }
         } else {
            this.field23252 = false;
            this.field23253 = 0;
         }
      } else {
         this.field23240 = null;
         this.field23252 = false;
         this.field23253 = 0;
      }

      this.server.method1420().startSection("keepAlive");
      long var3 = Util.milliTime();
      if (var3 - this.field23228 >= 15000L) {
         if (!this.field23229) {
            this.field23229 = true;
            this.field23228 = var3;
            this.field23230 = var3;
            this.sendPacket(new SKeepAlivePacket(this.field23230));
         } else {
            this.disconnect(new TranslationTextComponent("disconnect.timeout"));
         }
      }

      this.server.method1420().endSection();
      if (this.chatSpamThresholdCount > 0) {
         this.chatSpamThresholdCount--;
      }

      if (this.field23232 > 0) {
         this.field23232--;
      }

      if (this.player.method2818() > 0L
         && this.server.method1382() > 0
         && Util.milliTime() - this.player.method2818() > (long)(this.server.method1382() * 1000 * 60)) {
         this.disconnect(new TranslationTextComponent("multiplayer.disconnect.idling"));
      }
   }

   public void method15656() {
      this.field23234 = this.player.getPosX();
      this.field23235 = this.player.getPosY();
      this.field23236 = this.player.getPosZ();
      this.field23237 = this.player.getPosX();
      this.field23238 = this.player.getPosY();
      this.field23239 = this.player.getPosZ();
   }

   @Override
   public NetworkManager getNetworkManager() {
      return this.netManager;
   }

   private boolean method15657() {
      return this.server.method1421(this.player.getGameProfile());
   }

   public void disconnect(ITextComponent var1) {
      this.netManager.method30694(new SDisconnectPacket(var1), var2 -> this.netManager.method30701(var1));
      this.netManager.method30711();
      this.server.method1635(this.netManager::handleDisconnection);
   }

   private <T> void method15659(T var1, Consumer<T> var2, BiFunction<IChatFilter, T, CompletableFuture<Optional<T>>> var3) {
      MinecraftServer var6 = this.player.getServerWorld().getServer();
      Consumer<T> var7 = var2x -> {
         if (!this.getNetworkManager().isChannelOpen()) {
            LOGGER.debug("Ignoring packet due to disconnection");
         } else {
            var2.accept(var2x);
         }
      };
      IChatFilter var8 = this.player.method2837();
      if (var8 == null) {
         var6.execute(() -> var7.accept(var1));
      } else {
         var3.apply(var8, var1).thenAcceptAsync(var1x -> var1x.ifPresent(var7), var6);
      }
   }

   private void method15660(String var1, Consumer<String> var2) {
      this.method15659(var1, var2, IChatFilter::func_244432_a);
   }

   private void method15661(List<String> var1, Consumer<List<String>> var2) {
      this.method15659(var1, var2, IChatFilter::func_244433_a);
   }

   @Override
   public void processInput(CInputPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.method2775(var1.getStrafeSpeed(), var1.getForwardSpeed(), var1.isJumping(), var1.isSneaking());
   }

   private static boolean method15662(CPlayerPacket var0) {
      return Doubles.isFinite(var0.getX(0.0))
            && Doubles.isFinite(var0.getY(0.0))
            && Doubles.isFinite(var0.getZ(0.0))
            && Floats.isFinite(var0.getPitch(0.0F))
            && Floats.isFinite(var0.getYaw(0.0F))
         ? Math.abs(var0.getX(0.0)) > 3.0E7 || Math.abs(var0.getY(0.0)) > 3.0E7 || Math.abs(var0.getZ(0.0)) > 3.0E7
         : true;
   }

   private static boolean method15663(CMoveVehiclePacket var0) {
      return !Doubles.isFinite(var0.getX())
         || !Doubles.isFinite(var0.getY())
         || !Doubles.isFinite(var0.getZ())
         || !Floats.isFinite(var0.getPitch())
         || !Floats.isFinite(var0.getYaw());
   }

   @Override
   public void processVehicleMove(CMoveVehiclePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (!method15663(var1)) {
         Entity var4 = this.player.method3415();
         if (var4 != this.player && var4.method3407() == this.player && var4 == this.field23240) {
            ServerWorld var5 = this.player.getServerWorld();
            double var6 = var4.getPosX();
            double var8 = var4.getPosY();
            double var10 = var4.getPosZ();
            double var12 = var1.getX();
            double var14 = var1.getY();
            double var16 = var1.getZ();
            float var18 = var1.getYaw();
            float var19 = var1.getPitch();
            double var20 = var12 - this.field23241;
            double var22 = var14 - this.field23242;
            double var24 = var16 - this.field23243;
            double var26 = var4.getMotion().lengthSquared();
            double var28 = var20 * var20 + var22 * var22 + var24 * var24;
            if (var28 - var26 > 100.0 && !this.method15657()) {
               LOGGER.warn(
                  "{} (vehicle of {}) moved too quickly! {},{},{}",
                  var4.getName().getString(),
                  this.player.getName().getString(),
                  var20,
                  var22,
                  var24
               );
               this.netManager.sendPacket(new SMoveVehiclePacket(var4));
               return;
            }

            boolean var30 = var5.hasNoCollisions(var4, var4.getBoundingBox().shrink(0.0625));
            var20 = var12 - this.field23244;
            var22 = var14 - this.field23245 - 1.0E-6;
            var24 = var16 - this.field23246;
            var4.move(MoverType.PLAYER, new Vector3d(var20, var22, var24));
            var20 = var12 - var4.getPosX();
            var22 = var14 - var4.getPosY();
            if (var22 > -0.5 || var22 < 0.5) {
               var22 = 0.0;
            }

            var24 = var16 - var4.getPosZ();
            var28 = var20 * var20 + var22 * var22 + var24 * var24;
            boolean var31 = false;
            if (var28 > 0.0625) {
               var31 = true;
               LOGGER.warn(
                  "{} (vehicle of {}) moved wrongly! {}", var4.getName().getString(), this.player.getName().getString(), Math.sqrt(var28)
               );
            }

            var4.method3269(var12, var14, var16, var18, var19);
            boolean var32 = var5.hasNoCollisions(var4, var4.getBoundingBox().shrink(0.0625));
            if (var30 && (var31 || !var32)) {
               var4.method3269(var6, var8, var10, var18, var19);
               this.netManager.sendPacket(new SMoveVehiclePacket(var4));
               return;
            }

            this.player.getServerWorld().getChunkProvider().method7376(this.player);
            this.player.method2919(this.player.getPosX() - var6, this.player.getPosY() - var8, this.player.getPosZ() - var10);
            this.field23252 = var22 >= -0.03125 && !this.server.method1359() && this.method15664(var4);
            this.field23244 = var4.getPosX();
            this.field23245 = var4.getPosY();
            this.field23246 = var4.getPosZ();
         }
      } else {
         this.disconnect(new TranslationTextComponent("multiplayer.disconnect.invalid_vehicle_movement"));
      }
   }

   private boolean method15664(Entity var1) {
      return var1.world.method7035(var1.getBoundingBox().method19664(0.0625).method19662(0.0, -0.55, 0.0)).allMatch(Class7377::isAir);
   }

   @Override
   public void processConfirmTeleport(CConfirmTeleportPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (var1.getTeleportId() == this.field23248) {
         this.player
            .method3269(
               this.targetPos.x, this.targetPos.y, this.targetPos.z, this.player.rotationYaw, this.player.rotationPitch
            );
         this.field23237 = this.targetPos.x;
         this.field23238 = this.targetPos.y;
         this.field23239 = this.targetPos.z;
         if (this.player.method2821()) {
            this.player.method2822();
         }

         this.targetPos = null;
      }
   }

   @Override
   public void handleRecipeBookUpdate(CMarkRecipeSeenPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.server.method1407().method1035(var1.func_244321_b()).ifPresent(this.player.method2810()::method21365);
   }

   @Override
   public void func_241831_a(CUpdateRecipeBookStatusPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.method2810().method21375(var1.func_244317_b(), var1.func_244318_c(), var1.func_244319_d());
   }

   @Override
   public void handleSeenAdvancements(CSeenAdvancementsPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (var1.getAction() == CSeenAdvancementsPacket.Action.OPENED_TAB) {
         ResourceLocation var4 = var1.getTab();
         Advancement var5 = this.server.method1396().method1065(var4);
         if (var5 != null) {
            this.player.method2823().method27415(var5);
         }
      }
   }

   @Override
   public void processTabComplete(CTabCompletePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      StringReader var4 = new StringReader(var1.getCommand());
      if (var4.canRead() && var4.peek() == '/') {
         var4.skip();
      }

      ParseResults<Class6619> var5 = this.server.getCommandManager().method18842().parse(var4, this.player.getCommandSource());
      this.server
         .getCommandManager()
         .method18842()
         .getCompletionSuggestions(var5)
         .thenAccept(var2 -> this.netManager.sendPacket(new STabCompletePacket(var1.getTransactionId(), var2)));
   }

   @Override
   public void processUpdateCommandBlock(CUpdateCommandBlockPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (!this.server.method1361()) {
         this.player.sendMessage(new TranslationTextComponent("advMode.notEnabled"), Util.DUMMY_UUID);
      } else if (!this.player.canUseCommandBlock()) {
         this.player.sendMessage(new TranslationTextComponent("advMode.notAllowed"), Util.DUMMY_UUID);
      } else {
         CommandBlockLogic var4 = null;
         CommandBlockTileEntity var5 = null;
         BlockPos var6 = var1.getPos();
         TileEntity var7 = this.player.world.getTileEntity(var6);
         if (var7 instanceof CommandBlockTileEntity) {
            var5 = (CommandBlockTileEntity)var7;
            var4 = var5.method4009();
         }

         String var8 = var1.getCommand();
         boolean var9 = var1.shouldTrackOutput();
         if (var4 != null) {
            CommandBlockTileEntity.Mode var10 = var5.method4020();
            Direction var11 = this.player.world.getBlockState(var6).<Direction>method23463(CommandBlockBlock.field18893);
            switch (Class9703.field45356[var1.getMode().ordinal()]) {
               case 1:
                  BlockState var12 = Blocks.field36888.method11579();
                  this.player
                     .world
                     .setBlockState(var6, var12.method23465(CommandBlockBlock.field18893, var11).method23465(CommandBlockBlock.field18894, Boolean.valueOf(var1.isConditional())), 2);
                  break;
               case 2:
                  BlockState var13 = Blocks.field36887.method11579();
                  this.player
                     .world
                     .setBlockState(var6, var13.method23465(CommandBlockBlock.field18893, var11).method23465(CommandBlockBlock.field18894, Boolean.valueOf(var1.isConditional())), 2);
                  break;
               case 3:
               default:
                  BlockState var14 = Blocks.COMMAND_BLOCK.method11579();
                  this.player
                     .world
                     .setBlockState(var6, var14.method23465(CommandBlockBlock.field18893, var11).method23465(CommandBlockBlock.field18894, Boolean.valueOf(var1.isConditional())), 2);
            }

            var7.method3779();
            this.player.world.method6761(var6, var7);
            var4.method3562(var8);
            var4.method3570(var9);
            if (!var9) {
               var4.method3569((ITextComponent)null);
            }

            var5.method4013(var1.isAuto());
            if (var10 != var1.getMode()) {
               var5.method4014();
            }

            var4.method3568();
            if (!Class9001.method33256(var8)) {
               this.player.sendMessage(new TranslationTextComponent("advMode.setCommand.success", var8), Util.DUMMY_UUID);
            }
         }
      }
   }

   @Override
   public void processUpdateCommandMinecart(CUpdateMinecartCommandBlockPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.server.method1361()) {
         if (this.player.canUseCommandBlock()) {
            CommandBlockLogic var4 = var1.method17387(this.player.world);
            if (var4 != null) {
               var4.method3562(var1.method17388());
               var4.method3570(var1.method17389());
               if (!var1.method17389()) {
                  var4.method3569((ITextComponent)null);
               }

               var4.method3568();
               this.player.sendMessage(new TranslationTextComponent("advMode.setCommand.success", var1.method17388()), Util.DUMMY_UUID);
            }
         } else {
            this.player.sendMessage(new TranslationTextComponent("advMode.notAllowed"), Util.DUMMY_UUID);
         }
      } else {
         this.player.sendMessage(new TranslationTextComponent("advMode.notEnabled"), Util.DUMMY_UUID);
      }
   }

   @Override
   public void processPickItem(CPickItemPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.inventory.method4034(var1.method17494());
      this.player
         .field4855
         .sendPacket(new SSetSlotPacket(-2, this.player.inventory.currentItem, this.player.inventory.getStackInSlot(this.player.inventory.currentItem)));
      this.player.field4855.sendPacket(new SSetSlotPacket(-2, var1.method17494(), this.player.inventory.getStackInSlot(var1.method17494())));
      this.player.field4855.sendPacket(new SHeldItemChangePacket(this.player.inventory.currentItem));
   }

   @Override
   public void processRenameItem(CRenameItemPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.field4905 instanceof Class5824) {
         Class5824 var4 = (Class5824)this.player.field4905;
         String var5 = SharedConstants.method34772(var1.method17477());
         if (var5.length() <= 35) {
            var4.method18197(var5);
         }
      }
   }

   @Override
   public void processUpdateBeacon(CUpdateBeaconPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.field4905 instanceof Class5821) {
         ((Class5821)this.player.field4905).method18181(var1.method17599(), var1.method17600());
      }
   }

   @Override
   public void processUpdateStructureBlock(CUpdateStructureBlockPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.canUseCommandBlock()) {
         BlockPos var4 = var1.method17609();
         BlockState var5 = this.player.world.getBlockState(var4);
         TileEntity var6 = this.player.world.getTileEntity(var4);
         if (var6 instanceof Class964) {
            Class964 var7 = (Class964)var6;
            var7.method3951(var1.method17611());
            var7.method3937(var1.method17612());
            var7.method3941(var1.method17613());
            var7.method3943(var1.method17614());
            var7.method3945(var1.method17615());
            var7.method3947(var1.method17616());
            var7.method3949(var1.method17617());
            var7.method3954(var1.method17618());
            var7.method3974(var1.method17619());
            var7.method3976(var1.method17620());
            var7.method3956(var1.method17621());
            var7.method3958(var1.method17622());
            if (!var7.method3936()) {
               this.player.sendStatusMessage(new TranslationTextComponent("structure_block.invalid_structure_name", var1.method17612()), false);
            } else {
               String var8 = var7.method3934();
               if (var1.method17610() != Class1897.field11139) {
                  if (var1.method17610() != Class1897.field11140) {
                     if (var1.method17610() == Class1897.field11141) {
                        if (!var7.method3959()) {
                           this.player.sendStatusMessage(new TranslationTextComponent("structure_block.size_failure"), false);
                        } else {
                           this.player.sendStatusMessage(new TranslationTextComponent("structure_block.size_success", var8), false);
                        }
                     }
                  } else if (var7.method3970()) {
                     if (!var7.method3965(this.player.getServerWorld())) {
                        this.player.sendStatusMessage(new TranslationTextComponent("structure_block.load_prepare", var8), false);
                     } else {
                        this.player.sendStatusMessage(new TranslationTextComponent("structure_block.load_success", var8), false);
                     }
                  } else {
                     this.player.sendStatusMessage(new TranslationTextComponent("structure_block.load_not_found", var8), false);
                  }
               } else if (!var7.method3963()) {
                  this.player.sendStatusMessage(new TranslationTextComponent("structure_block.save_failure", var8), false);
               } else {
                  this.player.sendStatusMessage(new TranslationTextComponent("structure_block.save_success", var8), false);
               }
            }

            var7.markDirty();
            this.player.world.notifyBlockUpdate(var4, var5, var5, 3);
         }
      }
   }

   @Override
   public void func_217262_a(CUpdateJigsawBlockPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.canUseCommandBlock()) {
         BlockPos var4 = var1.func_218789_b();
         BlockState var5 = this.player.world.getBlockState(var4);
         TileEntity var6 = this.player.world.getTileEntity(var4);
         if (var6 instanceof JigsawTileEntity) {
            JigsawTileEntity var7 = (JigsawTileEntity)var6;
            var7.method3983(var1.func_240851_c_());
            var7.method3984(var1.func_240852_d_());
            var7.method3985(var1.func_240853_e_());
            var7.method3986(var1.func_218788_e());
            var7.method3987(var1.func_240854_g_());
            var7.markDirty();
            this.player.world.notifyBlockUpdate(var4, var5, var5, 3);
         }
      }
   }

   @Override
   public void func_230549_a_(CJigsawBlockGeneratePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.canUseCommandBlock()) {
         BlockPos var4 = var1.func_240844_b_();
         TileEntity var5 = this.player.world.getTileEntity(var4);
         if (var5 instanceof JigsawTileEntity) {
            JigsawTileEntity var6 = (JigsawTileEntity)var5;
            var6.method3988(this.player.getServerWorld(), var1.func_240845_c_(), var1.func_240846_d_());
         }
      }
   }

   @Override
   public void processSelectTrade(CSelectTradePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      int var4 = var1.method17420();
      Container var5 = this.player.field4905;
      if (var5 instanceof Class5826) {
         Class5826 var6 = (Class5826)var5;
         var6.method18204(var4);
         var6.method18213(var4);
      }
   }

   @Override
   public void processEditBook(CEditBookPacket var1) {
      ItemStack var4 = var1.getStack();
      if (var4.getItem() == Items.field38047) {
         CompoundNBT var5 = var4.method32142();
         if (Class3291.method11833(var5)) {
            ArrayList var6 = Lists.newArrayList();
            boolean var7 = var1.shouldUpdateAll();
            if (var7) {
               var6.add(var5.getString("title"));
            }

            ListNBT var8 = var5.method131("pages", 8);

            for (int var9 = 0; var9 < var8.size(); var9++) {
               var6.add(var8.method160(var9));
            }

            int var10 = var1.func_244708_d();
            if (PlayerInventory.isHotbar(var10) || var10 == 40) {
               this.method15661(
                  var6, !var7 ? var2 -> this.method15665(var2, var10) : var2 -> this.method15666(var2.get(0), var2.subList(1, var2.size()), var10)
               );
            }
         }
      }
   }

   private void method15665(List<String> var1, int var2) {
      ItemStack var5 = this.player.inventory.getStackInSlot(var2);
      if (var5.getItem() == Items.field38047) {
         ListNBT var6 = new ListNBT();
         var1.stream().<StringNBT>map(StringNBT::valueOf).forEach(var6::add);
         var5.setTagInfo("pages", var6);
      }
   }

   private void method15666(String var1, List<String> var2, int var3) {
      ItemStack var6 = this.player.inventory.getStackInSlot(var3);
      if (var6.getItem() == Items.field38047) {
         ItemStack var7 = new ItemStack(Items.field38048);
         CompoundNBT var8 = var6.method32142();
         if (var8 != null) {
            var7.method32148(var8.method79());
         }

         var7.setTagInfo("author", StringNBT.valueOf(this.player.getName().getString()));
         var7.setTagInfo("title", StringNBT.valueOf(var1));
         ListNBT var9 = new ListNBT();

         for (String var11 : var2) {
            StringTextComponent var12 = new StringTextComponent(var11);
            String var13 = ITextComponent$Serializer.toJson(var12);
            var9.add(StringNBT.valueOf(var13));
         }

         var7.setTagInfo("pages", var9);
         this.player.inventory.setInventorySlotContents(var3, var7);
      }
   }

   @Override
   public void processNBTQueryEntity(CQueryEntityNBTPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.method3424(2)) {
         Entity var4 = this.player.getServerWorld().getEntityByID(var1.method17479());
         if (var4 != null) {
            CompoundNBT var5 = var4.writeWithoutTypeId(new CompoundNBT());
            this.player.field4855.sendPacket(new SQueryNBTResponsePacket(var1.method17478(), var5));
         }
      }
   }

   @Override
   public void processNBTQueryBlockEntity(CQueryTileEntityNBTPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.method3424(2)) {
         TileEntity var4 = this.player.getServerWorld().getTileEntity(var1.getPosition());
         CompoundNBT var5 = var4 == null ? null : var4.write(new CompoundNBT());
         this.player.field4855.sendPacket(new SQueryNBTResponsePacket(var1.getTransactionID(), var5));
      }
   }

   @Override
   public void processPlayer(CPlayerPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (!method15662(var1)) {
         ServerWorld var4 = this.player.getServerWorld();
         if (!this.player.queuedEndExit) {
            if (this.field23227 == 0) {
               this.method15656();
            }

            if (this.targetPos == null) {
               this.field23249 = this.field23227;
               if (!this.player.isPassenger()) {
                  double var5 = this.player.getPosX();
                  double var7 = this.player.getPosY();
                  double var9 = this.player.getPosZ();
                  double var11 = this.player.getPosY();
                  double var13 = var1.getX(this.player.getPosX());
                  double var15 = var1.getY(this.player.getPosY());
                  double var17 = var1.getZ(this.player.getPosZ());
                  float var19 = var1.getYaw(this.player.rotationYaw);
                  float var20 = var1.getPitch(this.player.rotationPitch);
                  double var21 = var13 - this.field23234;
                  double var23 = var15 - this.field23235;
                  double var25 = var17 - this.field23236;
                  double var27 = this.player.getMotion().lengthSquared();
                  double var29 = var21 * var21 + var23 * var23 + var25 * var25;
                  if (!this.player.isSleeping()) {
                     this.field23254++;
                     int var31 = this.field23254 - this.field23255;
                     if (var31 > 5) {
                        LOGGER.debug(
                           "{} is sending move packets too frequently ({} packets since last tick)", this.player.getName().getString(), var31
                        );
                        var31 = 1;
                     }

                     if (!this.player.method2821()
                        && (!this.player.getServerWorld().getGameRules().getBoolean(Class5462.field24240) || !this.player.isElytraFlying())) {
                        float var32 = !this.player.isElytraFlying() ? 100.0F : 300.0F;
                        if (var29 - var27 > (double)(var32 * (float)var31) && !this.method15657()) {
                           LOGGER.warn("{} moved too quickly! {},{},{}", this.player.getName().getString(), var21, var23, var25);
                           this.method15668(
                              this.player.getPosX(),
                              this.player.getPosY(),
                              this.player.getPosZ(),
                              this.player.rotationYaw,
                              this.player.rotationPitch
                           );
                           return;
                        }
                     }

                     AxisAlignedBB var42 = this.player.getBoundingBox();
                     var21 = var13 - this.field23237;
                     var23 = var15 - this.field23238;
                     var25 = var17 - this.field23239;
                     boolean var33 = var23 > 0.0;
                     if (this.player.isOnGround() && !var1.isOnGround() && var33) {
                        this.player.jump();
                     }

                     this.player.move(MoverType.PLAYER, new Vector3d(var21, var23, var25));
                     var21 = var13 - this.player.getPosX();
                     var23 = var15 - this.player.getPosY();
                     if (var23 > -0.5 || var23 < 0.5) {
                        var23 = 0.0;
                     }

                     var25 = var17 - this.player.getPosZ();
                     var29 = var21 * var21 + var23 * var23 + var25 * var25;
                     boolean var34 = false;
                     if (!this.player.method2821()
                        && var29 > 0.0625
                        && !this.player.isSleeping()
                        && !this.player.interactionManager.method33866()
                        && this.player.interactionManager.getGameType() != GameType.SPECTATOR) {
                        var34 = true;
                        LOGGER.warn("{} moved wrongly!", this.player.getName().getString());
                     }

                     this.player.method3269(var13, var15, var17, var19, var20);
                     if (this.player.noClip
                        || this.player.isSleeping()
                        || (!var34 || !var4.hasNoCollisions(this.player, var42)) && !this.method15667(var4, var42)) {
                        this.field23250 = var23 >= -0.03125
                           && this.player.interactionManager.getGameType() != GameType.SPECTATOR
                           && !this.server.method1359()
                           && !this.player.abilities.allowFlying
                           && !this.player.isPotionActive(Effects.LEVITATION)
                           && !this.player.isElytraFlying()
                           && this.method15664(this.player);
                        this.player.getServerWorld().getChunkProvider().method7376(this.player);
                        this.player.method2763(this.player.getPosY() - var11, var1.isOnGround());
                        this.player.setOnGround(var1.isOnGround());
                        if (var33) {
                           this.player.fallDistance = 0.0F;
                        }

                        this.player
                           .method2919(this.player.getPosX() - var5, this.player.getPosY() - var7, this.player.getPosZ() - var9);
                        this.field23237 = this.player.getPosX();
                        this.field23238 = this.player.getPosY();
                        this.field23239 = this.player.getPosZ();
                     } else {
                        this.method15668(var5, var7, var9, var19, var20);
                     }
                  } else if (var29 > 1.0) {
                     this.method15668(
                        this.player.getPosX(),
                        this.player.getPosY(),
                        this.player.getPosZ(),
                        var1.getYaw(this.player.rotationYaw),
                        var1.getPitch(this.player.rotationPitch)
                     );
                  }
               } else {
                  this.player
                     .method3269(
                        this.player.getPosX(),
                        this.player.getPosY(),
                        this.player.getPosZ(),
                        var1.getYaw(this.player.rotationYaw),
                        var1.getPitch(this.player.rotationPitch)
                     );
                  this.player.getServerWorld().getChunkProvider().method7376(this.player);
               }
            } else if (this.field23227 - this.field23249 > 20) {
               this.field23249 = this.field23227;
               this.method15668(
                  this.targetPos.x, this.targetPos.y, this.targetPos.z, this.player.rotationYaw, this.player.rotationPitch
               );
            }
         }
      } else {
         this.disconnect(new TranslationTextComponent("multiplayer.disconnect.invalid_player_movement"));
      }
   }

   private boolean method15667(Class1662 var1, AxisAlignedBB var2) {
      Stream<VoxelShape> var5 = var1.method7047(this.player, this.player.getBoundingBox().shrink(1.0E-5F), var0 -> true);
      VoxelShape var6 = VoxelShapes.create(var2.shrink(1.0E-5F));
      return var5.anyMatch(var1x -> ! VoxelShapes.compare(var1x, var6, IBooleanFunction.AND));
   }

   public void method15668(double var1, double var3, double var5, float var7, float var8) {
      this.method15669(var1, var3, var5, var7, var8, Collections.<Flags>emptySet());
   }

   public void method15669(double var1, double var3, double var5, float var7, float var8, Set<Flags> var9) {
      double var12 = !var9.contains(Flags.field13198) ? 0.0 : this.player.getPosX();
      double var14 = !var9.contains(Flags.field13199) ? 0.0 : this.player.getPosY();
      double var16 = !var9.contains(Flags.field13200) ? 0.0 : this.player.getPosZ();
      float var18 = !var9.contains(Flags.field13201) ? 0.0F : this.player.rotationYaw;
      float var19 = !var9.contains(Flags.field13202) ? 0.0F : this.player.rotationPitch;
      this.targetPos = new Vector3d(var1, var3, var5);
      if (++this.field23248 == Integer.MAX_VALUE) {
         this.field23248 = 0;
      }

      this.field23249 = this.field23227;
      this.player.method3269(var1, var3, var5, var7, var8);
      this.player.field4855.sendPacket(new SPlayerPositionLookPacket(var1 - var12, var3 - var14, var5 - var16, var7 - var18, var8 - var19, var9, this.field23248));
   }

   @Override
   public void processPlayerDigging(CPlayerDiggingPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      BlockPos var4 = var1.getPosition();
      this.player.markPlayerActive();
      CPlayerDiggingPacket.Action var5 = var1.getAction();
      switch (Class9703.field45357[var5.ordinal()]) {
         case 1:
            if (!this.player.isSpectator()) {
               ItemStack var6 = this.player.getHeldItem(Hand.field183);
               this.player.setHeldItem(Hand.field183, this.player.getHeldItem(Hand.MAIN_HAND));
               this.player.setHeldItem(Hand.MAIN_HAND, var6);
               this.player.resetActiveHand();
            }

            return;
         case 2:
            if (!this.player.isSpectator()) {
               this.player.drop(false);
            }

            return;
         case 3:
            if (!this.player.isSpectator()) {
               this.player.drop(true);
            }

            return;
         case 4:
            this.player.stopActiveHand();
            return;
         case 5:
         case 6:
         case 7:
            this.player.interactionManager.method33858(var4, var5, var1.getFacing(), this.server.method1364());
            return;
         default:
            throw new IllegalArgumentException("Invalid player action");
      }
   }

   private static boolean method15670(ServerPlayerEntity var0, ItemStack var1) {
      if (var1.isEmpty()) {
         return false;
      } else {
         Item var4 = var1.getItem();
         return (var4 instanceof Class3292 || var4 instanceof Class3287) && !var0.method2976().method19635(var4);
      }
   }

   @Override
   public void processTryUseItemOnBlock(CPlayerTryUseItemOnBlockPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      ServerWorld var4 = this.player.getServerWorld();
      Hand var5 = var1.getHand();
      ItemStack var6 = this.player.getHeldItem(var5);
      BlockRayTraceResult var7 = var1.func_218794_c();
      BlockPos var8 = var7.getPos();
      Direction var9 = var7.getFace();
      this.player.markPlayerActive();
      if (var8.getY() >= this.server.method1364()) {
         IFormattableTextComponent var10 = new TranslationTextComponent("build.tooHigh", this.server.method1364()).mergeStyle(TextFormatting.RED);
         this.player.field4855.sendPacket(new SChatPacket(var10, ChatType.GAME_INFO, Util.DUMMY_UUID));
      } else if (this.targetPos == null
         && this.player.getDistanceNearest((double)var8.getX() + 0.5, (double)var8.getY() + 0.5, (double)var8.getZ() + 0.5) < 64.0
         && var4.method6785(this.player, var8)) {
         ActionResultType var12 = this.player.interactionManager.method33860(this.player, var4, var6, var5, var7);
         if (var9 == Direction.field673 && !var12.isSuccessOrConsume() && var8.getY() >= this.server.method1364() - 1 && method15670(this.player, var6)) {
            IFormattableTextComponent var11 = new TranslationTextComponent("build.tooHigh", this.server.method1364()).mergeStyle(TextFormatting.RED);
            this.player.field4855.sendPacket(new SChatPacket(var11, ChatType.GAME_INFO, Util.DUMMY_UUID));
         } else if (var12.isSuccess()) {
            this.player.swing(var5, true);
         }
      }

      this.player.field4855.sendPacket(new SChangeBlockPacket(var4, var8));
      this.player.field4855.sendPacket(new SChangeBlockPacket(var4, var8.method8349(var9)));
   }

   @Override
   public void processTryUseItem(CPlayerTryUseItemPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      ServerWorld var4 = this.player.getServerWorld();
      Hand var5 = var1.getHand();
      ItemStack var6 = this.player.getHeldItem(var5);
      this.player.markPlayerActive();
      if (!var6.isEmpty()) {
         ActionResultType var7 = this.player.interactionManager.method33859(this.player, var4, var6, var5);
         if (var7.isSuccess()) {
            this.player.swing(var5, true);
         }
      }
   }

   @Override
   public void handleSpectate(CSpectatePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.isSpectator()) {
         for (ServerWorld var5 : this.server.method1320()) {
            Entity var6 = var1.getEntity(var5);
            if (var6 != null) {
               this.player.method2824(var5, var6.getPosX(), var6.getPosY(), var6.getPosZ(), var6.rotationYaw, var6.rotationPitch);
               return;
            }
         }
      }
   }

   @Override
   public void handleResourcePackStatus(CResourcePackStatusPacket var1) {
   }

   @Override
   public void processSteerBoat(CSteerBoatPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      Entity var4 = this.player.getRidingEntity();
      if (var4 instanceof BoatEntity) {
         ((BoatEntity)var4).method4151(var1.getLeft(), var1.getRight());
      }
   }

   @Override
   public void method15588(ITextComponent var1) {
      LOGGER.info("{} lost connection: {}", this.player.getName().getString(), var1.getString());
      this.server.method1388();
      this.server
         .getPlayerList()
         .method19484(
            new TranslationTextComponent("multiplayer.player.left", this.player.getDisplayName()).mergeStyle(TextFormatting.YELLOW),
            ChatType.SYSTEM,
            Util.DUMMY_UUID
         );
      this.player.method2782();
      this.server.getPlayerList().method19450(this.player);
      IChatFilter var4 = this.player.method2837();
      if (var4 != null) {
         var4.func_244434_b();
      }

      if (this.method15657()) {
         LOGGER.info("Stopping singleplayer server as player logged out");
         this.server.initiateShutdown(false);
      }
   }

   public void sendPacket(Packet<?> var1) {
      this.method15672(var1, (GenericFutureListener<? extends Future<? super Void>>)null);
   }

   public void method15672(Packet<?> var1, GenericFutureListener<? extends Future<? super Void>> var2) {
      if (var1 instanceof SChatPacket) {
         SChatPacket var5 = (SChatPacket)var1;
         ChatVisibility var6 = this.player.getChatVisibility();
         if (var6 == ChatVisibility.HIDDEN && var5.getType() != ChatType.GAME_INFO) {
            return;
         }

         if (var6 == ChatVisibility.SYSTEM && !var5.method17649()) {
            return;
         }
      }

      try {
         this.netManager.method30694(var1, var2);
      } catch (Throwable var8) {
         CrashReport var9 = CrashReport.makeCrashReport(var8, "Sending packet");
         CrashReportCategory var7 = var9.makeCategory("Packet being sent");
         var7.addDetail("Packet class", () -> var1.getClass().getCanonicalName());
         throw new ReportedException(var9);
      }
   }

   @Override
   public void processHeldItemChange(CHeldItemChangePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (var1.getSlotId() >= 0 && var1.getSlotId() < PlayerInventory.method4029()) {
         if (this.player.inventory.currentItem != var1.getSlotId() && this.player.getActiveHand() == Hand.MAIN_HAND) {
            this.player.resetActiveHand();
         }

         this.player.inventory.currentItem = var1.getSlotId();
         this.player.markPlayerActive();
      } else {
         LOGGER.warn("{} tried to set an invalid carried item", this.player.getName().getString());
      }
   }

   @Override
   public void processChatMessage(CChatMessagePacket var1) {
      String var4 = StringUtils.normalizeSpace(var1.getMessage());
      if (!var4.startsWith("/")) {
         this.method15660(var4, this::func_244548_c);
      } else {
         PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
         this.func_244548_c(var4);
      }
   }

   private void func_244548_c(String p_244548_1_) {
      if (this.player.getChatVisibility() != ChatVisibility.HIDDEN) {
         this.player.markPlayerActive();

         for (int i = 0; i < p_244548_1_.length(); i++) {
            if (!SharedConstants.isAllowedCharacter(p_244548_1_.charAt(i))) {
               this.disconnect(new TranslationTextComponent("multiplayer.disconnect.illegal_characters"));
               return;
            }
         }

         if (!p_244548_1_.startsWith("/")) {
            TranslationTextComponent itextcomponent = new TranslationTextComponent("chat.type.text", this.player.getDisplayName(), p_244548_1_);
            this.server.getPlayerList().method19484(itextcomponent, ChatType.CHAT, this.player.getUniqueID());
         } else {
            this.handleSlashCommand(p_244548_1_);
         }

         this.chatSpamThresholdCount += 20;
         if (this.chatSpamThresholdCount > 200 && !this.server.getPlayerList().canSendCommands(this.player.getGameProfile())) {
            this.disconnect(new TranslationTextComponent("disconnect.spam"));
         }
      } else {
         this.sendPacket(new SChatPacket(new TranslationTextComponent("chat.cannotSend").mergeStyle(TextFormatting.RED), ChatType.SYSTEM, Util.DUMMY_UUID));
      }
   }

   private void handleSlashCommand(String command) {
      this.server.getCommandManager().handleCommand(this.player.getCommandSource(), command);
   }

   @Override
   public void handleAnimation(CAnimateHandPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.markPlayerActive();
      this.player.swingArm(var1.getHand());
   }

   @Override
   public void processEntityAction(CEntityActionPacket packetIn) {
      PacketThreadUtil.checkThreadAndEnqueue(packetIn, this, this.player.getServerWorld());
      this.player.markPlayerActive();
      switch (Class9703.field45358[packetIn.getAction().ordinal()]) {
         case 1:
            this.player.setSneaking(true);
            break;
         case 2:
            this.player.setSneaking(false);
            break;
         case 3:
            this.player.setSprinting(true);
            break;
         case 4:
            this.player.setSprinting(false);
            break;
         case 5:
            if (this.player.isSleeping()) {
               this.player.stopSleepInBed(false, true);
               this.targetPos = this.player.getPositionVec();
            }
            break;
         case 6:
            if (this.player.getRidingEntity() instanceof IJumpingMount) {
               IJumpingMount ijumpingmount1 = (IJumpingMount)this.player.getRidingEntity();
               int i = packetIn.getAuxData();
               if (ijumpingmount1.canJump() && i > 0) {
                  ijumpingmount1.handleStartJump(i);
               }
            }
            break;
         case 7:
            if (this.player.getRidingEntity() instanceof IJumpingMount) {
               IJumpingMount var4 = (IJumpingMount)this.player.getRidingEntity();
               var4.handleStopJump();
            }
            break;
         case 8:
            if (this.player.getRidingEntity() instanceof AbstractHorseEntity) {
               ((AbstractHorseEntity)this.player.getRidingEntity()).openGUI(this.player);
            }
            break;
         case 9:
            if (!this.player.tryToStartFallFlying()) {
               this.player.stopFallFlying();
            }
            break;
         default:
            throw new IllegalArgumentException("Invalid client command!");
      }
   }

   @Override
   public void processUseEntity(CUseEntityPacket packetIn) {
      PacketThreadUtil.checkThreadAndEnqueue(packetIn, this, this.player.getServerWorld());
      ServerWorld serverworld = this.player.getServerWorld();
      Entity entity = packetIn.getEntityFromWorld(serverworld);
      this.player.markPlayerActive();
      this.player.setSneaking(packetIn.func_241792_e_());
      if (entity != null) {
         double var6 = 36.0;
         if (this.player.getDistanceSq(entity) < 36.0) {
            Hand hand = packetIn.getHand();
            ItemStack itemstack = hand == null ? ItemStack.EMPTY : this.player.getHeldItem(hand).copy();
            Optional<ActionResultType> optional = Optional.empty();
            if (packetIn.getAction() != CUseEntityPacket.Action.INTERACT) {
               if (packetIn.getAction() != CUseEntityPacket.Action.INTERACT_AT) {
                  if (packetIn.getAction() == CUseEntityPacket.Action.ATTACK) {
                     if (entity instanceof ItemEntity || entity instanceof ExperienceOrbEntity || entity instanceof AbstractArrowEntity || entity == this.player) {
                        this.disconnect(new TranslationTextComponent("multiplayer.disconnect.invalid_entity_attacked"));
                        LOGGER.warn("Player {} tried to attack an invalid entity", this.player.getName().getString());
                        return;
                     }

                     this.player.method2817(entity);
                  }
               } else {
                  optional = Optional.of(entity.applyPlayerInteraction(this.player, packetIn.getHitVec(), hand));
               }
            } else {
               optional = Optional.of(this.player.interactOn(entity, hand));
            }

            if (optional.isPresent() && optional.get().isSuccessOrConsume()) {
               CriteriaTriggers.PLAYER_ENTITY_INTERACTION.test(this.player, itemstack, entity);
               if (optional.get().isSuccess()) {
                  this.player.swing(hand, true);
               }
            }
         }
      }
   }

   @Override
   public void processClientStatus(CClientStatusPacket packetIn) {
      PacketThreadUtil.checkThreadAndEnqueue(packetIn, this, this.player.getServerWorld());
      this.player.markPlayerActive();
      CClientStatusPacketState var4 = packetIn.getStatus();
      switch (Class9703.state[var4.ordinal()]) {
         case 1:
            if (this.player.queuedEndExit) {
               this.player.queuedEndExit = false;
               this.player = this.server.getPlayerList().func_232644_a_(this.player, true);
               CriteriaTriggers.CHANGED_DIMENSION.testForAll(this.player, World.THE_END, World.OVERWORLD);
            } else {
               if (this.player.getHealth() > 0.0F) {
                  return;
               }

               this.player = this.server.getPlayerList().func_232644_a_(this.player, false);
               if (this.server.method1287()) {
                  this.player.method2799(GameType.SPECTATOR);
                  this.player.getServerWorld().getGameRules().<Class7466>method17128(Class5462.field24238).method24175(false, this.server);
               }
            }
            break;
         case 2:
            this.player.method2809().method28970(this.player);
      }
   }

   @Override
   public void processCloseWindow(CCloseWindowPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.method2774();
   }

   @Override
   public void processClickWindow(CClickWindowPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.markPlayerActive();
      if (this.player.field4905.field25471 == var1.getWindowId() && this.player.field4905.getCanCraft(this.player)) {
         if (!this.player.isSpectator()) {
            ItemStack var4 = this.player.field4905.slotClick(var1.getSlotId(), var1.getUsedButton(), var1.getClickType(), this.player);
            if (!ItemStack.method32128(var1.getClickedItem(), var4)) {
               this.field23233.put(this.player.field4905.field25471, var1.getActionNumber());
               this.player.field4855.sendPacket(new SConfirmTransactionPacket(var1.getWindowId(), var1.getActionNumber(), false));
               this.player.field4905.setCanCraft(this.player, false);
               NonNullList var5 = NonNullList.create();

               for (int var6 = 0; var6 < this.player.field4905.field25468.size(); var6++) {
                  ItemStack var7 = this.player.field4905.field25468.get(var6).getStack();
                  var5.add(!var7.isEmpty() ? var7 : ItemStack.EMPTY);
               }

               this.player.method2718(this.player.field4905, var5);
            } else {
               this.player.field4855.sendPacket(new SConfirmTransactionPacket(var1.getWindowId(), var1.getActionNumber(), true));
               this.player.field4890 = true;
               this.player.field4905.detectAndSendChanges();
               this.player.method2773();
               this.player.field4890 = false;
            }
         } else {
            NonNullList var8 = NonNullList.create();

            for (int var9 = 0; var9 < this.player.field4905.field25468.size(); var9++) {
               var8.add(this.player.field4905.field25468.get(var9).getStack());
            }

            this.player.method2718(this.player.field4905, var8);
         }
      }
   }

   @Override
   public void processPlaceRecipe(CPlaceRecipePacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.markPlayerActive();
      if (!this.player.isSpectator()
         && this.player.field4905.field25471 == var1.getWindowId()
         && this.player.field4905.getCanCraft(this.player)
         && this.player.field4905 instanceof Class5828) {
         this.server
            .method1407()
            .method1035(var1.getRecipeId())
            .ifPresent(var2 -> ((Class5828)this.player.field4905).method18219(var1.shouldPlaceAll(), (IRecipe<?>)var2, this.player));
      }
   }

   @Override
   public void processEnchantItem(CEnchantItemPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.markPlayerActive();
      if (this.player.field4905.field25471 == var1.getWindowId() && this.player.field4905.getCanCraft(this.player) && !this.player.isSpectator()
         )
       {
         this.player.field4905.enchantItem(this.player, var1.getButton());
         this.player.field4905.detectAndSendChanges();
      }
   }

   @Override
   public void processCreativeInventoryAction(CCreativeInventoryActionPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.interactionManager.method33866()) {
         boolean var4 = var1.getSlotId() < 0;
         ItemStack var5 = var1.getStack();
         CompoundNBT var6 = var5.method32145("BlockEntityTag");
         if (!var5.isEmpty() && var6 != null && var6.contains("x") && var6.contains("y") && var6.contains("z")) {
            BlockPos var7 = new BlockPos(var6.getInt("x"), var6.getInt("y"), var6.getInt("z"));
            TileEntity var8 = this.player.world.getTileEntity(var7);
            if (var8 != null) {
               CompoundNBT var9 = var8.write(new CompoundNBT());
               var9.method133("x");
               var9.method133("y");
               var9.method133("z");
               var5.setTagInfo("BlockEntityTag", var9);
            }
         }

         boolean var10 = var1.getSlotId() >= 1 && var1.getSlotId() <= 45;
         boolean var11 = var5.isEmpty() || var5.method32117() >= 0 && var5.getCount() <= 64 && !var5.isEmpty();
         if (var10 && var11) {
            if (!var5.isEmpty()) {
               this.player.container.putStackInSlot(var1.getSlotId(), var5);
            } else {
               this.player.container.putStackInSlot(var1.getSlotId(), ItemStack.EMPTY);
            }

            this.player.container.setCanCraft(this.player, true);
            this.player.container.detectAndSendChanges();
         } else if (var4 && var11 && this.field23232 < 200) {
            this.field23232 += 20;
            this.player.method2882(var5, true);
         }
      }
   }

   @Override
   public void processConfirmTransaction(CConfirmTransactionPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      int var4 = this.player.field4905.field25471;
      if (var4 == var1.getWindowId()
         && this.field23233.getOrDefault(var4, (short)(var1.getUid() + 1)) == var1.getUid()
         && !this.player.field4905.getCanCraft(this.player)
         && !this.player.isSpectator()) {
         this.player.field4905.setCanCraft(this.player, true);
      }
   }

   @Override
   public void processUpdateSign(CUpdateSignPacket var1) {
      List var4 = Stream.<String>of(var1.getLines()).<String>map(TextFormatting::getTextWithoutFormattingCodes).collect(Collectors.toList());
      this.method15661(var4, var2 -> this.method15675(var1, var2));
   }

   private void method15675(CUpdateSignPacket var1, List<String> var2) {
      this.player.markPlayerActive();
      ServerWorld var5 = this.player.getServerWorld();
      BlockPos var6 = var1.getPosition();
      if (var5.method7017(var6)) {
         BlockState var7 = var5.getBlockState(var6);
         TileEntity var8 = var5.getTileEntity(var6);
         if (!(var8 instanceof Class954)) {
            return;
         }

         Class954 var9 = (Class954)var8;
         if (!var9.method3838() || var9.method3841() != this.player) {
            LOGGER.warn("Player {} just tried to change non-editable sign", this.player.getName().getString());
            return;
         }

         for (int var10 = 0; var10 < var2.size(); var10++) {
            var9.method3836(var10, new StringTextComponent((String)var2.get(var10)));
         }

         var9.markDirty();
         var5.notifyBlockUpdate(var6, var7, var7, 3);
      }
   }

   @Override
   public void processKeepAlive(CKeepAlivePacket var1) {
      if (this.field23229 && var1.getKey() == this.field23230) {
         int var4 = (int)(Util.milliTime() - this.field23228);
         this.player.ping = (this.player.ping * 3 + var4) / 4;
         this.field23229 = false;
      } else if (!this.method15657()) {
         this.disconnect(new TranslationTextComponent("disconnect.timeout"));
      }
   }

   @Override
   public void processPlayerAbilities(CPlayerAbilitiesPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.abilities.isFlying = var1.isFlying() && this.player.abilities.allowFlying;
   }

   @Override
   public void processClientSettings(CClientSettingsPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      this.player.method2804(var1);
   }

   @Override
   public void processCustomPayload(CCustomPayloadPacket var1) {
   }

   @Override
   public void func_217263_a(CSetDifficultyPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.method3424(2) || this.method15657()) {
         this.server.method1336(var1.func_218773_b(), false);
      }
   }

   @Override
   public void func_217261_a(CLockDifficultyPacket var1) {
      PacketThreadUtil.checkThreadAndEnqueue(var1, this, this.player.getServerWorld());
      if (this.player.method3424(2) || this.method15657()) {
         this.server.method1339(var1.func_218776_b());
      }
   }
}
