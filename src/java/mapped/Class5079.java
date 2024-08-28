package mapped;

import java.io.IOException;

public class Class5079 extends Class4975 {
   private String field23130;
   private byte[] field23131;

   public Class5079() {
      super("ID3 Tag Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field23130 = Class6170.method19068(var1.method31863(2));
      this.field23131 = new byte[(int)this.method15430(var1)];
      var1.method31864(this.field23131);
   }

   public byte[] method15528() {
      return this.field23131;
   }

   public String method15529() {
      return this.field23130;
   }
}
