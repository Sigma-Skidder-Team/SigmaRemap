package mapped;

import java.io.IOException;
import java.io.OutputStream;

import com.mentalfrostbyte.jello.Client;
import org.apache.commons.io.IOUtils;

public class Class6675 implements Logger {
   public OutputStream field29272;

   public Class6675(OutputStream var1) {
      this.field29272 = var1;
   }

   public Class6675() {
   }

   @Override
   public void info(String var1) {
      try {
         IOUtils.write("Jello: INFO - " + var1 + "\n", this.field29272);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method20357(String var1) {
      try {
         IOUtils.write("Jello: WARNING - " + var1 + "\n", this.field29272);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method20358(String var1) {
      try {
         IOUtils.write("Jello: ERROR - " + var1 + "\n", this.field29272);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void method20359(String var1) {
      Client.getInstance();
   }
}
