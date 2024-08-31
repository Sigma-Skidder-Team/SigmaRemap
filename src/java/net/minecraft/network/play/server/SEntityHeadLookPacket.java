package net.minecraft.network.play.server;

import mapped.PacketBuffer;
import mapped.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SEntityHeadLookPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24476;
   private int field24477;
   private byte field24478;

   public SEntityHeadLookPacket() {
   }

   public SEntityHeadLookPacket(Entity var1, byte var2) {
      this.field24477 = var1.method3205();
      this.field24478 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24477 = var1.method35714();
      this.field24478 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24477);
      var1.writeByte(this.field24478);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleEntityHeadLook(this);
   }

   public Entity method17346(World var1) {
      return var1.method6774(this.field24477);
   }

   public byte method17347() {
      return this.field24478;
   }
}
