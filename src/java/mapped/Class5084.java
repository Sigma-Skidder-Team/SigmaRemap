package mapped;

import java.io.IOException;

public class Class5084 extends Class4975 {
   private int field23142;

   public Class5084() {
      super("3GPP Recording Year Box");
   }

   @Override
   public void method15262(DataStreamReader var1) throws IOException {
      super.method15262(var1);
      this.field23142 = (int)var1.readBits(2);
   }

   public int method15540() {
      return this.field23142;
   }
}
