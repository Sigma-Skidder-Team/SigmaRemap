package remapped;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

public class class_870 implements class_2827 {
   public OutputStream field_4512;

   public class_870(OutputStream var1) {
      this.field_4512 = var1;
   }

   public class_870() {
   }

   public void 埙ꪕ鶲셴ศ(String var1) {
      try {
         IOUtils.write("Jello: INFO - " + var1 + "\n", this.field_4512);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public void ᙽ햖葫㢸唟(String var1) {
      try {
         IOUtils.write("Jello: WARNING - " + var1 + "\n", this.field_4512);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public void 弻셴霥쥅햠(String var1) {
      try {
         IOUtils.write("Jello: ERROR - " + var1 + "\n", this.field_4512);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public void 躚뫤댠樽骰(String var1) {
      SigmaMainClass.method_3328();
   }
}
