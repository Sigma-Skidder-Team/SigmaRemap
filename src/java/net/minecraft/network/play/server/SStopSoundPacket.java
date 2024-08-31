package net.minecraft.network.play.server;

import mapped.Class2266;
import net.minecraft.network.PacketBuffer;
import mapped.ResourceLocation;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class SStopSoundPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24372;
   private ResourceLocation field24373;
   private Class2266 field24374;

   public SStopSoundPacket() {
   }

   public SStopSoundPacket(ResourceLocation var1, Class2266 var2) {
      this.field24373 = var1;
      this.field24374 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      byte var4 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      if (this.field24374 == null) {
         if (this.field24373 == null) {
            var1.writeByte(0);
         } else {
            var1.writeByte(2);
            var1.method35732(this.field24373);
         }
      } else if (this.field24373 == null) {
         var1.writeByte(1);
         var1.method35713(this.field24374);
      } else {
         var1.writeByte(3);
         var1.method35713(this.field24374);
         var1.method35732(this.field24373);
      }
   }

   @Nullable
   public ResourceLocation method17268() {
      return this.field24373;
   }

   @Nullable
   public Class2266 method17269() {
      return this.field24374;
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleStopSound(this);
   }
}
