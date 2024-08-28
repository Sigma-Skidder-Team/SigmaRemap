package mapped;

import java.io.IOException;

public class Class5574 implements Packet<Class5116> {
   private static String[] field24721;
   private Class3257 field24722;
   private int field24723;

   public Class5574() {
   }

   public Class5574(Class3257 var1, int var2) {
      this.field24722 = var1;
      this.field24723 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24722 = Class3257.method11702(var1.method35714());
      this.field24723 = var1.method35714();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(Class3257.method11701(this.field24722));
      var1.writeVarInt(this.field24723);
   }

   public void method17180(Class5116 var1) {
      var1.method15763(this);
   }

   public Class3257 method17506() {
      return this.field24722;
   }

   public int method17507() {
      return this.field24723;
   }
}
