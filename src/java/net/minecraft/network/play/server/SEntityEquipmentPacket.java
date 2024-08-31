package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import mapped.Class2106;
import mapped.ItemStack;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.List;

public class SEntityEquipmentPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24793;
   private int field24794;
   private final List<Pair<Class2106, ItemStack>> field24795;

   public SEntityEquipmentPacket() {
      this.field24795 = Lists.newArrayList();
   }

   public SEntityEquipmentPacket(int var1, List<Pair<Class2106, ItemStack>> var2) {
      this.field24794 = var1;
      this.field24795 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24794 = var1.readVarInt();
      Class2106[] var4 = Class2106.values();
      byte var5 = var1.readByte();
      Class2106 var6 = var4[var5 & 127];
      ItemStack var7 = var1.method35726();
      this.field24795.add(Pair.of(var6, var7));
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24794);
      int var4 = this.field24795.size();

      for (int var5 = 0; var5 < var4; var5++) {
         Pair var6 = this.field24795.get(var5);
         Class2106 var7 = (Class2106)var6.getFirst();
         boolean var8 = var5 != var4 - 1;
         int var9 = var7.ordinal();
         var1.writeByte(!var8 ? var9 : var9 | -128);
         var1.method35724((ItemStack)var6.getSecond());
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityEquipment(this);
   }

   public int method17561() {
      return this.field24794;
   }

   public List<Pair<Class2106, ItemStack>> method17562() {
      return this.field24795;
   }
}
