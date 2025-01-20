package mapped;

import java.io.IOException;
import java.io.OutputStream;

import com.mentalfrostbyte.Client;
import org.apache.commons.io.IOUtils;

public class SingleOutputStreamClientLogger implements Logger {
   public OutputStream stream;

   public SingleOutputStreamClientLogger(OutputStream var1) {
      this.stream = var1;
   }

   public SingleOutputStreamClientLogger() {
   }

   @Override
   public void info(String var1) {
      try {
         IOUtils.write("Jello: INFO - " + var1 + "\n", this.stream);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void warn(String var1) {
      try {
         IOUtils.write("Jello: WARNING - " + var1 + "\n", this.stream);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   @Override
   public void error(String var1) {
      try {
         IOUtils.write("Jello: ERROR - " + var1 + "\n", this.stream);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   /**
    * wtf part 2
    */
   @Override
   public void dummyMethod(String var1) {
      Client.getInstance();
   }
}
