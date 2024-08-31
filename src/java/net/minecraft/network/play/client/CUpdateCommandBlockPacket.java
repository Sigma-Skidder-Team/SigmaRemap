package net.minecraft.network.play.client;

import mapped.Class2037;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;

public class CUpdateCommandBlockPacket implements Packet<IServerPlayNetHandler> {
   private BlockPos field24738;
   private String field24739;
   private boolean field24740;
   private boolean field24741;
   private boolean field24742;
   private Class2037 field24743;

   public CUpdateCommandBlockPacket() {
   }

   public CUpdateCommandBlockPacket(BlockPos var1, String var2, Class2037 var3, boolean var4, boolean var5, boolean var6) {
      this.field24738 = var1;
      this.field24739 = var2;
      this.field24740 = var4;
      this.field24741 = var5;
      this.field24742 = var6;
      this.field24743 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24738 = var1.readBlockPos();
      this.field24739 = var1.readString(32767);
      this.field24743 = var1.method35712(Class2037.class);
      int i = var1.readByte();
      this.field24740  =  (i & 1) != 0;
      this.field24741  = (i & 2) != 0;
      this.field24742  = (i & 4) != 0;
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeBlockPos(this.field24738);
      var1.writeString(this.field24739);
      var1.method35713(this.field24743);
      byte var4 = 0;
      if (this.field24740) {
         var4 |= 1;
      }

      if (this.field24741) {
         var4 |= 2;
      }

      if (this.field24742) {
         var4 |= 4;
      }

      var1.writeByte(var4);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processUpdateCommandBlock(this);
   }

   public BlockPos method17516() {
      return this.field24738;
   }

   public String method17517() {
      return this.field24739;
   }

   public boolean method17518() {
      return this.field24740;
   }

   public boolean method17519() {
      return this.field24741;
   }

   public boolean method17520() {
      return this.field24742;
   }

   public Class2037 method17521() {
      return this.field24743;
   }
}
