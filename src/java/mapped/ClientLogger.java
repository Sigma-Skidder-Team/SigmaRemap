package mapped;

import java.io.IOException;
import java.io.OutputStream;

import com.mentalfrostbyte.jello.Client;
import org.apache.commons.io.IOUtils;

public class ClientLogger implements Logger {
   public OutputStream field29273;
   public OutputStream field29274;
   public OutputStream field29275;

   public ClientLogger(OutputStream var1, OutputStream var2, OutputStream var3) {
      this.field29273 = var1;
      this.field29274 = var2;
      this.field29275 = var3;
   }

   @Override
   public void info(String var1) {
      try {
         IOUtils.write("Jello: INFO - " + var1 + "\n", this.field29273);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method20357(String var1) {
      try {
         IOUtils.write("Jello: WARNING - " + var1 + "\n", this.field29274);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method20358(String var1) {
      try {
         IOUtils.write("Jello: ERROR - " + var1 + "\n", this.field29275);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method20359(String var1) {
      Client.getInstance();
   }
}
