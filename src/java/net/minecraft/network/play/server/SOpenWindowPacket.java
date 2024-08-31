package net.minecraft.network.play.server;

import java.io.IOException;
import javax.annotation.Nullable;

import mapped.Class8298;
import net.minecraft.network.PacketBuffer;
import mapped.Registry;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.util.text.ITextComponent;

public class SOpenWindowPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24401;
   private int field24402;
   private int field24403;
   private ITextComponent field24404;

   public SOpenWindowPacket() {
   }

   public SOpenWindowPacket(int var1, Class8298<?> var2, ITextComponent var3) {
      this.field24402 = var1;
      this.field24403 = Registry.field16084.method9171(var2);
      this.field24404 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24402 = var1.method35714();
      this.field24403 = var1.method35714();
      this.field24404 = var1.method35710();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24402);
      var1.writeVarInt(this.field24403);
      var1.method35711(this.field24404);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleOpenWindowPacket(this);
   }

   public int method17284() {
      return this.field24402;
   }

   @Nullable
   public Class8298<?> method17285() {
      return Registry.field16084.method9172(this.field24403);
   }

   public ITextComponent method17286() {
      return this.field24404;
   }
}
