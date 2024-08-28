package mapped;

import java.io.IOException;

public class Class5589 implements Packet<Class5116> {
   private static String[] field24796;
   private int field24797;
   private ResourceLocation field24798;

   public Class5589() {
   }

   public Class5589(int var1, Class4843<?> var2) {
      this.field24797 = var1;
      this.field24798 = var2.method14964();
   }

   public ResourceLocation method17563() {
      return this.field24798;
   }

   public int method17564() {
      return this.field24797;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24797 = var1.readByte();
      this.field24798 = var1.method35731();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeByte(this.field24797);
      var1.method35732(this.field24798);
   }

   public void method17180(Class5116 var1) {
      var1.method15767(this);
   }
}
