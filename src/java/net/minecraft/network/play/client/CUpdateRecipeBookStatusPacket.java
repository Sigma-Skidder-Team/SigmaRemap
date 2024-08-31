package net.minecraft.network.play.client;

import mapped.Class1939;
import mapped.IServerPlayNetHandler;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class CUpdateRecipeBookStatusPacket implements Packet<IServerPlayNetHandler> {
   private static String[] field24717;
   private Class1939 field24718;
   private boolean field24719;
   private boolean field24720;

   public CUpdateRecipeBookStatusPacket() {
   }

   public CUpdateRecipeBookStatusPacket(Class1939 var1, boolean var2, boolean var3) {
      this.field24718 = var1;
      this.field24719 = var2;
      this.field24720 = var3;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24718 = var1.<Class1939>method35712(Class1939.class);
      this.field24719 = var1.readBoolean();
      this.field24720 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24718);
      var1.writeBoolean(this.field24719);
      var1.writeBoolean(this.field24720);
   }

   public void processPacket(IServerPlayNetHandler var1) {
      var1.func_241831_a(this);
   }

   public Class1939 method17503() {
      return this.field24718;
   }

   public boolean method17504() {
      return this.field24719;
   }

   public boolean method17505() {
      return this.field24720;
   }
}
