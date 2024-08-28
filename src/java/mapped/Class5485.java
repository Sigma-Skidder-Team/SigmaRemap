package mapped;

import java.io.IOException;
import java.util.List;

public class Class5485 implements Packet<Class5116> {
   private static String[] field24353;
   private int field24354;
   private int[] field24355;

   public Class5485() {
   }

   public Class5485(Entity var1) {
      this.field24354 = var1.method3205();
      List var4 = var1.method3408();
      this.field24355 = new int[var4.size()];

      for (int var5 = 0; var5 < var4.size(); var5++) {
         this.field24355[var5] = ((Entity)var4.get(var5)).method3205();
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24354 = var1.method35714();
      this.field24355 = var1.method35702();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24354);
      var1.method35701(this.field24355);
   }

   public void method17180(Class5116 var1) {
      var1.method15719(this);
   }

   public int[] method17252() {
      return this.field24355;
   }

   public int method17253() {
      return this.field24354;
   }
}
