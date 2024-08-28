package mapped;

import java.io.IOException;

public class Class1743 extends Class1740 {
   private static String[] field9450;
   public final Class7931 field9451;

   public Class1743(Class7931 var1, Class1737 var2) {
      super(var2);
      this.field9451 = var1;
   }

   @Override
   public void close() throws IOException {
      this.field9451.field34001.method17929(false, this.field9451);
      super.close();
   }
}
