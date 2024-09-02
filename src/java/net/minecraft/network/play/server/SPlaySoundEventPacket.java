package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class SPlaySoundEventPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24338;
   private int field24339;
   private BlockPos field24340;
   private int field24341;
   private boolean field24342;

   public SPlaySoundEventPacket() {
   }

   public SPlaySoundEventPacket(int var1, BlockPos var2, int var3, boolean var4) {
      this.field24339 = var1;
      this.field24340 = var2.toImmutable();
      this.field24341 = var3;
      this.field24342 = var4;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24339 = var1.readInt();
      this.field24340 = var1.readBlockPos();
      this.field24341 = var1.readInt();
      this.field24342 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(this.field24339);
      var1.writeBlockPos(this.field24340);
      var1.writeInt(this.field24341);
      var1.writeBoolean(this.field24342);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEffect(this);
   }

   public boolean method17242() {
      return this.field24342;
   }

   public int method17243() {
      return this.field24339;
   }

   public int method17244() {
      return this.field24341;
   }

   public BlockPos method17245() {
      return this.field24340;
   }
}
