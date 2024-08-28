package mapped;

import java.io.IOException;

public class Class5611 implements Packet<Class5116> {
   private static String[] field24905;
   private Class8933 field24906;

   public Class5611() {
   }

   public Class5611(Class8933 var1) {
      this.field24906 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24906 = Class8933.method32663(var1);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      this.field24906.method32662(var1);
   }

   public void method17180(Class5116 var1) {
      var1.method15754(this);
   }

   public Class8933 method17639() {
      return this.field24906;
   }
}
