package mapped;

import java.io.IOException;

public class Class1741 extends Class1740 {
   private static String[] field9445;
   public final Class1792 field9446;
   public final Class1795 field9447;

   public Class1741(Class1795 var1, Class1737 var2, Class1792 var3) {
      super(var2);
      this.field9447 = var1;
      this.field9446 = var3;
   }

   @Override
   public void close() throws IOException {
      this.field9446.close();
      super.close();
   }
}
