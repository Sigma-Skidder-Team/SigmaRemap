package remapped;

import java.io.IOException;
import java.security.PublicKey;
import net.minecraft.util.CryptException;

public class class_5992 implements Packet<class_8886> {
   private static String[] field_30541;
   private String field_30543;
   private byte[] field_30542;
   private byte[] field_30544;

   public class_5992() {
   }

   public class_5992(String var1, byte[] var2, byte[] var3) {
      this.field_30543 = var1;
      this.field_30542 = var2;
      this.field_30544 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_30543 = var1.method_37784(20);
      this.field_30542 = var1.method_37757();
      this.field_30544 = var1.method_37757();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_30543);
      var1.method_37767(this.field_30542);
      var1.method_37767(this.field_30544);
   }

   public void method_27375(class_8886 var1) {
      var1.method_40903(this);
   }

   public String method_27374() {
      return this.field_30543;
   }

   public PublicKey method_27376() throws CryptException {
      return class_6531.method_29730(this.field_30542);
   }

   public byte[] method_27372() {
      return this.field_30544;
   }
}
