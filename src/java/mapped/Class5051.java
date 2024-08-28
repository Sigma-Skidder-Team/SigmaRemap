package mapped;

import java.io.IOException;

public class Class5051 extends Class5050 {
   private String field23042;
   private String field23043;

   public Class5051() {
      super("XML Metadata Sample Entry");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field23042 = var1.method31866((int)this.method15430(var1), "UTF-8");
      this.field23043 = var1.method31866((int)this.method15430(var1), "UTF-8");
   }

   public String method15454() {
      return this.field23042;
   }

   public String method15455() {
      return this.field23043;
   }
}
