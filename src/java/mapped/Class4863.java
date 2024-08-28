package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public final class Class4863 extends Class4864 {
   private static String[] field22666;
   public final Class7450 field22667;
   public final Class2003 field22668;

   public Class4863(Class7450 var1, Class2003 var2) {
      this.field22667 = var1;
      this.field22668 = var2;
   }

   @Nullable
   @Override
   public Class7450 method15007() {
      return this.field22667;
   }

   @Override
   public long method15008() throws IOException {
      return (long)this.field22668.method8458();
   }

   @Override
   public void method15009(Class1733 var1) throws IOException {
      var1.method7560(this.field22668);
   }
}
