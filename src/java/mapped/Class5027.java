package mapped;

import java.io.IOException;

public class Class5027 extends Class5023 {
   private String[] field22995;

   public Class5027() {
      super("3GPP Keywords Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      this.method15384(var1);
      int var4 = var1.method31861();
      this.field22995 = new String[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1.method31861();
         this.field22995[var5] = var1.method31867(var6);
      }
   }

   public String[] method15397() {
      return this.field22995;
   }
}
