package net.minecraft.network.play.server;

import net.minecraft.network.PacketBuffer;
import mapped.World;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SCameraPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24673;
   public int field24674;

   public SCameraPacket() {
   }

   public SCameraPacket(Entity var1) {
      this.field24674 = var1.method3205();
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24674 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24674);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleCamera(this);
   }

   @Nullable
   public Entity method17480(World var1) {
      return var1.getEntityByID(this.field24674);
   }
}
