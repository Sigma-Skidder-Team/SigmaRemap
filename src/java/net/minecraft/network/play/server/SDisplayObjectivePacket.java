package net.minecraft.network.play.server;

import mapped.Class8375;
import mapped.PacketBuffer;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.Packet;

import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;

public class SDisplayObjectivePacket implements Packet<IClientPlayNetHandler> {
   private int field24916;
   private String field24917;

   public SDisplayObjectivePacket() {
   }

   public SDisplayObjectivePacket(int var1, Class8375 var2) {
      this.field24916 = var1;
      if (var2 != null) {
         this.field24917 = var2.method29336();
      } else {
         this.field24917 = "";
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24916 = var1.readByte();
      this.field24917 = var1.method35728(16);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24916);
      var1.method35729(this.field24917);
   }

   public void method17180(IClientPlayNetHandler var1) {
      var1.handleDisplayObjective(this);
   }

   public int method17646() {
      return this.field24916;
   }

   @Nullable
   public String method17647() {
      return !Objects.equals(this.field24917, "") ? this.field24917 : null;
   }
}
