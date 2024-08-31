package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.Packet;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class SUpdateTileEntityPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24901;
   private BlockPos field24902;
   private int field24903;
   private CompoundNBT field24904;

   public SUpdateTileEntityPacket() {
   }

   public SUpdateTileEntityPacket(BlockPos var1, int var2, CompoundNBT var3) {
      this.field24902 = var1;
      this.field24903 = var2;
      this.field24904 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24902 = var1.method35707();
      this.field24903 = var1.readUnsignedByte();
      this.field24904 = var1.method35721();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35708(this.field24902);
      var1.writeByte((byte)this.field24903);
      var1.method35720(this.field24904);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleUpdateTileEntity(this);
   }

   public BlockPos method17636() {
      return this.field24902;
   }

   public int method17637() {
      return this.field24903;
   }

   public CompoundNBT method17638() {
      return this.field24904;
   }
}
