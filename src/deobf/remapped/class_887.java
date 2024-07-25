package remapped;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class class_887 extends class_5287 {
   private String field_4562;

   public class_887(String var1) {
      this(var1, "");
   }

   public class_887(String var1, String var2) {
      super(var1);
      this.field_4562 = var2;
   }

   public String method_3809() {
      return this.field_4562;
   }

   public void method_3808(String var1) {
      this.field_4562 = var1;
   }

   @Override
   public void method_24130(DataInput var1) throws IOException {
      this.field_4562 = var1.readUTF();
   }

   @Override
   public void method_24127(DataOutput var1) throws IOException {
      var1.writeUTF(this.field_4562);
   }

   public class_887 clone() {
      return new class_887(this.method_24126(), this.method_3809());
   }
}
