package net.minecraft.network.play.client;

import mapped.Class1865;
import mapped.IServerPlayNetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CEntityActionPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24772;
   private int field24773;
   private Class1865 field24774;
   private int field24775;

   public CEntityActionPacket() {
   }

   public CEntityActionPacket(Entity var1, Class1865 var2) {
      this(var1, var2, 0);
   }

   public CEntityActionPacket(Entity var1, Class1865 var2, int var3) {
      this.field24773 = var1.method3205();
      this.field24774 = var2;
      this.field24775 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24773 = var1.readVarInt();
      this.field24774 = var1.<Class1865>method35712(Class1865.class);
      this.field24775 = var1.readVarInt();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24773);
      var1.method35713(this.field24774);
      var1.writeVarInt(this.field24775);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.processEntityAction(this);
   }

   public Class1865 getAction() {
      return this.field24774;
   }

   public int getAuxData() {
      return this.field24775;
   }
}
