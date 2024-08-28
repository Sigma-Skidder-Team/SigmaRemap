package mapped;

import java.io.IOException;

public class Class5052 extends Class5050 {
   private String field23044;

   public Class5052() {
      super("Text Metadata Sample Entry");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field23044 = var1.method31866((int)this.method15430(var1), "UTF-8");
   }

   public String method15456() {
      return this.field23044;
   }
}
