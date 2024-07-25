package remapped;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import net.minecraft.util.CryptException;

public class class_2717 implements Packet<class_7515> {
   private static String[] field_13284;
   private byte[] field_13282 = new byte[0];
   private byte[] field_13283 = new byte[0];

   public class_2717() {
   }

   public class_2717(SecretKey var1, PublicKey var2, byte[] var3) throws CryptException {
      this.field_13282 = class_6531.method_29726(var2, var1.getEncoded());
      this.field_13283 = class_6531.method_29726(var2, var3);
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_13282 = var1.method_37757();
      this.field_13283 = var1.method_37757();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37767(this.field_13282);
      var1.method_37767(this.field_13283);
   }

   public void method_12239(class_7515 var1) {
      var1.method_34256(this);
   }

   public SecretKey method_12237(PrivateKey var1) throws CryptException {
      return class_6531.method_29734(var1, this.field_13282);
   }

   public byte[] method_12238(PrivateKey var1) throws CryptException {
      return class_6531.method_29733(var1, this.field_13283);
   }
}
