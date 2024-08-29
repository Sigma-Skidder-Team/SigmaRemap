package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5510 implements Packet<Class5116> {
   private static String[] field24456;
   private int field24457;
   private CompoundNBT field24458;

   public Class5510() {
   }

   public Class5510(int var1, CompoundNBT var2) {
      this.field24457 = var1;
      this.field24458 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24457 = var1.method35714();
      this.field24458 = var1.method35721();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24457);
      var1.method35720(this.field24458);
   }

   public void method17180(Class5116 var1) {
      var1.method15773(this);
   }

   public int method17328() {
      return this.field24457;
   }

   @Nullable
   public CompoundNBT method17329() {
      return this.field24458;
   }

   @Override
   public boolean method17181() {
      return true;
   }
}
