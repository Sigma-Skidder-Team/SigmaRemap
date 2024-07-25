package remapped;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.commons.io.IOUtils;

public class class_3114 implements class_2827 {
   public OutputStream field_15493;
   public OutputStream field_15494;
   public OutputStream field_15496;

   public class_3114(OutputStream var1, OutputStream var2, OutputStream var3) {
      this.field_15493 = var1;
      this.field_15494 = var2;
      this.field_15496 = var3;
   }

   public void 埙ꪕ鶲셴ศ(String var1) {
      try {
         IOUtils.write("Jello: INFO - " + var1 + "\n", this.field_15493);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public void ᙽ햖葫㢸唟(String var1) {
      try {
         IOUtils.write("Jello: WARNING - " + var1 + "\n", this.field_15494);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public void 弻셴霥쥅햠(String var1) {
      try {
         IOUtils.write("Jello: ERROR - " + var1 + "\n", this.field_15496);
      } catch (IOException var5) {
         var5.printStackTrace();
      }
   }

   public void 躚뫤댠樽骰(String var1) {
      SigmaMainClass.method_3328();
   }
}
