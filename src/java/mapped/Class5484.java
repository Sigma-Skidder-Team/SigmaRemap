package mapped;

import java.io.IOException;

public class Class5484 implements Packet<Class5116> {
   private static String[] field24351;
   private int[] field24352;

   public Class5484() {
   }

   public Class5484(int... var1) {
      this.field24352 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24352 = new int[var1.method35714()];

      for (int var4 = 0; var4 < this.field24352.length; var4++) {
         this.field24352[var4] = var1.method35714();
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24352.length);

      for (int var7 : this.field24352) {
         var1.writeVarInt(var7);
      }
   }

   public void method17180(Class5116 var1) {
      var1.method15732(this);
   }

   public int[] method17251() {
      return this.field24352;
   }
}
