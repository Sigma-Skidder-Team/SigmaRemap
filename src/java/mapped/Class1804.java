package mapped;

import java.io.IOException;

public class Class1804 extends Class1803 {
   private static String[] field9716;
   public final Class5751 field9717;
   public final Class7263 field9718;

   public Class1804(Class7263 var1, boolean var2, Class1735 var3, Class1733 var4, Class5751 var5) {
      super(var2, var3, var4);
      this.field9718 = var1;
      this.field9717 = var5;
   }

   @Override
   public void close() throws IOException {
      this.field9717.method17929(true, this.field9717.method17930());
   }
}
