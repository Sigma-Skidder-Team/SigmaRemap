package mapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Class71 extends Class61 {
   private String field153;

   public Class71(String var1) {
      this(var1, "");
   }

   public Class71(String var1, String var2) {
      super(var1);
      this.field153 = var2;
   }

   public String method205() {
      return this.field153;
   }

   public void method231(String var1) {
      this.field153 = var1;
   }

   @Override
   public void method203(DataInput var1) throws IOException {
      this.field153 = var1.readUTF();
   }

   @Override
   public void method204(DataOutput var1) throws IOException {
      var1.writeUTF(this.field153);
   }

   public Class71 clone() {
      return new Class71(this.method206(), this.method205());
   }
}
