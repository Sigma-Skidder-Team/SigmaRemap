package mapped;

import java.io.IOException;

public class Class4983 extends Class4975 {
   private Class6443 field22873;
   private Class6443[] field22874;

   public Class4983() {
      super("IPMP Control Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22873 = Class6443.method19559(var1);
      int var4 = var1.method31861();
      this.field22874 = new Class6443[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         this.field22874[var5] = Class6443.method19559(var1);
      }
   }

   public Class6443 method15288() {
      return this.field22873;
   }

   public Class6443[] method15289() {
      return this.field22874;
   }
}
