package net.minecraft.network.play.client;

import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CJigsawBlockGeneratePacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24268;
   private BlockPos field24269;
   private int field24270;
   private boolean field24271;

   public CJigsawBlockGeneratePacket() {
   }

   public CJigsawBlockGeneratePacket(BlockPos var1, int var2, boolean var3) {
      this.field24269 = var1;
      this.field24270 = var2;
      this.field24271 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24269 = var1.method35707();
      this.field24270 = var1.readVarInt();
      this.field24271 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24269);
      var1.writeVarInt(this.field24270);
      var1.writeBoolean(this.field24271);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_230549_a_(this);
   }

   public BlockPos method17189() {
      return this.field24269;
   }

   public int method17190() {
      return this.field24270;
   }

   public boolean method17191() {
      return this.field24271;
   }
}