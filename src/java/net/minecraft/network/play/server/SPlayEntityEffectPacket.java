package net.minecraft.network.play.server;

import mapped.Class2023;
import mapped.Effect;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;

public class SPlayEntityEffectPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24583;
   private int field24584;
   private byte field24585;
   private byte field24586;
   private int field24587;
   private byte field24588;

   public SPlayEntityEffectPacket() {
   }

   public SPlayEntityEffectPacket(int var1, Class2023 var2) {
      this.field24584 = var1;
      this.field24585 = (byte)(Effect.method22288(var2.method8627()) & 0xFF);
      this.field24586 = (byte)(var2.method8629() & 0xFF);
      if (var2.method8628() <= 32767) {
         this.field24587 = var2.method8628();
      } else {
         this.field24587 = 32767;
      }

      this.field24588 = 0;
      if (var2.method8630()) {
         this.field24588 = (byte)(this.field24588 | 1);
      }

      if (var2.method8631()) {
         this.field24588 = (byte)(this.field24588 | 2);
      }

      if (var2.method8632()) {
         this.field24588 = (byte)(this.field24588 | 4);
      }
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24584 = var1.readVarInt();
      this.field24585 = var1.readByte();
      this.field24586 = var1.readByte();
      this.field24587 = var1.readVarInt();
      this.field24588 = var1.readByte();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24584);
      var1.writeByte(this.field24585);
      var1.writeByte(this.field24586);
      var1.writeVarInt(this.field24587);
      var1.writeByte(this.field24588);
   }

   public boolean method17406() {
      return this.field24587 == 32767;
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleEntityEffect(this);
   }

   public int method17407() {
      return this.field24584;
   }

   public byte method17408() {
      return this.field24585;
   }

   public byte method17409() {
      return this.field24586;
   }

   public int method17410() {
      return this.field24587;
   }

   public boolean method17411() {
      return (this.field24588 & 2) == 2;
   }

   public boolean method17412() {
      return (this.field24588 & 1) == 1;
   }

   public boolean method17413() {
      return (this.field24588 & 4) == 4;
   }
}
