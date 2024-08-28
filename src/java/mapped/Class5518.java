package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public class Class5518 implements Packet<Class5116> {
   private static String[] field24481;
   private int field24482;
   private Class7144 field24483;

   public Class5518() {
   }

   public Class5518(int var1, Class7144 var2) {
      this.field24482 = var1;
      this.field24483 = var2;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24482 = var1.method35714();
      this.field24483 = Class7144.method22287(var1.readUnsignedByte());
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeVarInt(this.field24482);
      var1.writeByte(Class7144.method22288(this.field24483));
   }

   public void method17180(Class5116 var1) {
      var1.method15733(this);
   }

   @Nullable
   public Entity method17349(Class1655 var1) {
      return var1.method6774(this.field24482);
   }

   @Nullable
   public Class7144 method17350() {
      return this.field24483;
   }
}
