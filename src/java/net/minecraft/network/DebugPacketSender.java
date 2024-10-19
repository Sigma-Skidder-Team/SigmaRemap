package net.minecraft.network;

import io.netty.buffer.Unpooled;
import java.util.Collection;

import mapped.*;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SCustomPayloadPlayPacket;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.raid.Raid;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DebugPacketSender {
   private static String[] field31651;
   private static final Logger field31652 = LogManager.getLogger();

   public static void method23610(ServerWorld var0, BlockPos var1, String var2, int var3, int var4) {
      PacketBuffer var7 = new PacketBuffer(Unpooled.buffer());
      var7.writeBlockPos(var1);
      var7.writeInt(var3);
      var7.writeString(var2);
      var7.writeInt(var4);
      method23625(var0, var7, SCustomPayloadPlayPacket.field24551);
   }

   public static void method23611(ServerWorld var0) {
      PacketBuffer var3 = new PacketBuffer(Unpooled.buffer());
      method23625(var0, var3, SCustomPayloadPlayPacket.field24552);
   }

   public static void method23612(ServerWorld var0, ChunkPos var1) {
   }

   public static void method23613(ServerWorld var0, BlockPos var1) {
      method23616(var0, var1);
   }

   public static void method23614(ServerWorld var0, BlockPos var1) {
      method23616(var0, var1);
   }

   public static void method23615(ServerWorld var0, BlockPos var1) {
      method23616(var0, var1);
   }

   private static void method23616(ServerWorld var0, BlockPos var1) {
   }

   public static void method23617(World var0, MobEntity var1, Class8238 var2, float var3) {
   }

   public static void method23618(World var0, BlockPos var1) {
   }

   public static void sendStructureStart(ISeedReader var0, StructureStart<?> var1) {
   }

   public static void method23620(World var0, MobEntity var1, Class6603 var2) {
      if (!(var0 instanceof ServerWorld)) {
      }
   }

   public static void method23621(ServerWorld var0, Collection<Raid> var1) {
   }

   public static void method23622(LivingEntity var0) {
   }

   public static void method23623(Class1017 var0) {
   }

   public static void method23624(BeehiveTileEntity var0) {
   }

   private static void method23625(ServerWorld var0, PacketBuffer var1, ResourceLocation var2) {
      SCustomPayloadPlayPacket var5 = new SCustomPayloadPlayPacket(var2, var1);

      for (PlayerEntity var7 : var0.method6970().method6870()) {
         ((ServerPlayerEntity)var7).connection.sendPacket(var5);
      }
   }
}
