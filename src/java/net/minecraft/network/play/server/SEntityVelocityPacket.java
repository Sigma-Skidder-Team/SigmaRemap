package net.minecraft.network.play.server;

import mapped.MathHelper;
import net.minecraft.network.PacketBuffer;
import mapped.Vector3d;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SEntityVelocityPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24799;
   public int field24800;
   public int field24801;
   public int field24802;
   public int field24803;

   public SEntityVelocityPacket() {
   }

   public SEntityVelocityPacket(Entity var1) {
      this(var1.method3205(), var1.method3433());
   }

   public SEntityVelocityPacket(int var1, Vector3d var2) {
      this.field24800 = var1;
      double var5 = 3.9;
      double var7 = MathHelper.method37778(var2.x, -3.9, 3.9);
      double var9 = MathHelper.method37778(var2.y, -3.9, 3.9);
      double var11 = MathHelper.method37778(var2.z, -3.9, 3.9);
      this.field24801 = (int)(var7 * 8000.0);
      this.field24802 = (int)(var9 * 8000.0);
      this.field24803 = (int)(var11 * 8000.0);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24800 = var1.readVarInt();
      this.field24801 = var1.readShort();
      this.field24802 = var1.readShort();
      this.field24803 = var1.readShort();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24800);
      var1.writeShort(this.field24801);
      var1.writeShort(this.field24802);
      var1.writeShort(this.field24803);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityVelocity(this);
   }

   public int method17565() {
      return this.field24800;
   }

   public int method17566() {
      return this.field24801;
   }

   public int method17567() {
      return this.field24802;
   }

   public int method17568() {
      return this.field24803;
   }
}
