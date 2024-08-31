package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.network.Packet;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5529 implements Packet<IServerPlayNetHandler> {
   private static String[] field24528;
   private int field24529;
   private String field24530;
   private boolean field24531;

   public Class5529() {
   }

   public Class5529(int var1, String var2, boolean var3) {
      this.field24529 = var1;
      this.field24530 = var2;
      this.field24531 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24529 = var1.method35714();
      this.field24530 = var1.method35728(32767);
      this.field24531 = var1.readBoolean();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24529);
      var1.method35729(this.field24530);
      var1.writeBoolean(this.field24531);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15642(this);
   }

   @Nullable
   public Class911 method17387(World var1) {
      Entity var4 = var1.method6774(this.field24529);
      return !(var4 instanceof Class918) ? null : ((Class918)var4).method3614();
   }

   public String method17388() {
      return this.field24530;
   }

   public boolean method17389() {
      return this.field24531;
   }
}
