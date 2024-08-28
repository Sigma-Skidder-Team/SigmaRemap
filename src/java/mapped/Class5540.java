package mapped;

import java.io.IOException;
import java.security.PublicKey;


public class Class5540 implements Packet<Class5103> {
   private static String[] field24594;
   private String field24595;
   private byte[] field24596;
   private byte[] field24597;

   public Class5540() {
   }

   public Class5540(String var1, byte[] var2, byte[] var3) {
      this.field24595 = var1;
      this.field24596 = var2;
      this.field24597 = var3;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24595 = var1.method35728(20);
      this.field24596 = var1.method35699();
      this.field24597 = var1.method35699();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(this.field24595);
      var1.method35698(this.field24596);
      var1.method35698(this.field24597);
   }

   public void method17180(Class5103 var1) {
      var1.method15584(this);
   }

   public String method17417() {
      return this.field24595;
   }

   public PublicKey method17418() throws Class2464 {
      return Class8961.method32740(this.field24596);
   }

   public byte[] method17419() {
      return this.field24597;
   }
}
