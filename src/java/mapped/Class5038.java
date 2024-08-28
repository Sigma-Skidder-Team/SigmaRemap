package mapped;

import java.io.IOException;

public class Class5038 extends Class4975 {
   private byte[] field23019;

   public Class5038() {
      super("OMA Content Object Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.method31863(4);
      this.field23019 = new byte[var4];
      var1.method31864(this.field23019);
   }

   public byte[] method15426() {
      return this.field23019;
   }
}
