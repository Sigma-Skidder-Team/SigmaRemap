package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import net.minecraft.world.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SEntityStatusPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24258;
   private int field24259;
   private byte field24260;

   public SEntityStatusPacket() {
   }

   public SEntityStatusPacket(Entity var1, byte var2) {
      this.field24259 = var1.getEntityId();
      this.field24260 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24259 = var1.readInt();
      this.field24260 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(this.field24259);
      var1.writeByte(this.field24260);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityStatus(this);
   }

   public Entity getEntity(World var1) {
      return var1.getEntityByID(this.field24259);
   }

   public byte getOpCode() {
      return this.field24260;
   }
}
