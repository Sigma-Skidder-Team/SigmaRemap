package net.minecraft.network.play.client;

import mapped.Class2238;
import mapped.Class7952;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;

import java.io.IOException;

public class CSeenAdvancementsPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24261;
   private Class2238 field24262;
   private ResourceLocation field24263;

   public CSeenAdvancementsPacket() {
   }

   public CSeenAdvancementsPacket(Class2238 var1, ResourceLocation var2) {
      this.field24262 = var1;
      this.field24263 = var2;
   }

   public static CSeenAdvancementsPacket method17182(Class7952 var0) {
      return new CSeenAdvancementsPacket(Class2238.field14644, var0.method27033());
   }

   public static CSeenAdvancementsPacket method17183() {
      return new CSeenAdvancementsPacket(Class2238.field14645, (ResourceLocation)null);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24262 = var1.<Class2238>method35712(Class2238.class);
      if (this.field24262 == Class2238.field14644) {
         this.field24263 = var1.readResourceLocation();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24262);
      if (this.field24262 == Class2238.field14644) {
         var1.writeResourceLocation(this.field24263);
      }
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.handleSeenAdvancements(this);
   }

   public Class2238 method17184() {
      return this.field24262;
   }

   public ResourceLocation method17185() {
      return this.field24263;
   }
}
