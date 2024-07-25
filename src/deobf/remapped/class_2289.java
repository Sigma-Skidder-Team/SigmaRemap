package remapped;

import java.io.IOException;

public class class_2289 implements Packet<class_392> {
   private String field_11427;
   private String field_11425;

   public class_2289() {
   }

   public class_2289(String var1, String var2) {
      this.field_11427 = var1;
      this.field_11425 = var2;
      if (var2.length() > 40) {
         throw new IllegalArgumentException("Hash is too long (max 40, was " + var2.length() + ")");
      }
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_11427 = var1.method_37784(32767);
      this.field_11425 = var1.method_37784(40);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(this.field_11427);
      var1.method_37760(this.field_11425);
   }

   public void method_10538(class_392 var1) {
      var1.method_1944(this);
   }

   public String method_10537() {
      return this.field_11427;
   }

   public String method_10539() {
      return this.field_11425;
   }
}
