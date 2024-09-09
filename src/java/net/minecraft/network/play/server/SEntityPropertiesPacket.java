package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public class SEntityPropertiesPacket implements Packet<IClientPlayNetHandler> {
   private int field24646;
   private final List<Class7919> field24647 = Lists.newArrayList();

   public SEntityPropertiesPacket() {
   }

   public SEntityPropertiesPacket(int var1, Collection<ModifiableAttributeInstance> var2) {
      this.field24646 = var1;

      for (ModifiableAttributeInstance var6 : var2) {
         this.field24647.add(new Class7919(var6.method38659(), var6.method38660(), var6.method38663()));
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24646 = var1.readVarInt();
      int var4 = var1.readInt();

      for (int var5 = 0; var5 < var4; var5++) {
         ResourceLocation var6 = var1.readResourceLocation();
         Attribute var7 = Registry.field16087.method9184(var6);
         double var8 = var1.readDouble();
         ArrayList var10 = Lists.newArrayList();
         int var11 = var1.readVarInt();

         for (int var12 = 0; var12 < var11; var12++) {
            UUID var13 = var1.readUniqueId();
            var10.add(new AttributeModifier(var13, "Unknown synced attribute modifier", var1.readDouble(), AttributeModifierOperation.method8686(var1.readByte())));
         }

         this.field24647.add(new Class7919(var7, var8, var10));
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24646);
      var1.writeInt(this.field24647.size());

      for (Class7919 var5 : this.field24647) {
         var1.writeResourceLocation(Registry.field16087.getKey(var5.method26560()));
         var1.writeDouble(var5.method26561());
         var1.writeVarInt(var5.method26562().size());

         for (AttributeModifier var7 : var5.method26562()) {
            var1.writeUniqueId(var7.method37930());
            var1.writeDouble(var7.method37933());
            var1.writeByte(var7.method37932().method8685());
         }
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityProperties(this);
   }

   public int method17463() {
      return this.field24646;
   }

   public List<Class7919> method17464() {
      return this.field24647;
   }
}
