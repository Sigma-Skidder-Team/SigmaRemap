package net.minecraft.network.play.server;

import mapped.ITagCollectionSupplier;
import net.minecraft.network.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;

import java.io.IOException;

public class STagsListPacket implements IPacket<IClientPlayNetHandler> {
   private static String[] field24905;
   private ITagCollectionSupplier field24906;

   public STagsListPacket() {
   }

   public STagsListPacket(ITagCollectionSupplier var1) {
      this.field24906 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24906 = ITagCollectionSupplier.method32663(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      this.field24906.method32662(var1);
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleTags(this);
   }

   public ITagCollectionSupplier method17639() {
      return this.field24906;
   }
}
