package mapped;

import java.io.IOException;

public class Class5025 extends Class5023 {
   private int field22987;

   public Class5025() {
      super("3GPP Album Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22987 = this.method15430(var1) <= 0L ? -1 : var1.method31861();
   }

   public int method15389() {
      return this.field22987;
   }
}
