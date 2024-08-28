package mapped;

import java.io.IOException;

public class Class5528 implements Packet<Class5116> {
   private String field24526;
   private String field24527;

   public Class5528() {
   }

   public Class5528(String var1, String var2) {
      this.field24526 = var1;
      this.field24527 = var2;
      if (var2.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + var2.length() + ")");
      }
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24526 = var1.method35728(32767);
      this.field24527 = var1.method35728(40);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24526);
      var1.method35729(this.field24527);
   }

   public void method17180(Class5116 var1) {
      var1.method15761(this);
   }

   public String method17385() {
      return this.field24526;
   }

   public String method17386() {
      return this.field24527;
   }
}
