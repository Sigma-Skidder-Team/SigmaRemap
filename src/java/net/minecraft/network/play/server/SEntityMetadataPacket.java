package net.minecraft.network.play.server;

import mapped.Class9773;
import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.datasync.EntityDataManager;

import java.io.IOException;
import java.util.List;

public class SEntityMetadataPacket implements Packet<IClientPlayNetHandler> {
   private static String[] field24655;
   private int field24656;
   private List<Class9773<?>> field24657;

   public SEntityMetadataPacket() {
   }

   public SEntityMetadataPacket(int var1, EntityDataManager var2, boolean var3) {
      this.field24656 = var1;
      if (!var3) {
         this.field24657 = var2.method35449();
      } else {
         this.field24657 = var2.method35450();
         var2.method35457();
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24656 = var1.method35714();
      this.field24657 = EntityDataManager.method35452(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24656);
      EntityDataManager.method35448(this.field24657, var1);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleEntityMetadata(this);
   }

   public List<Class9773<?>> method17469() {
      return this.field24657;
   }

   public int method17470() {
      return this.field24656;
   }
}
