package mapped;

import java.io.File;
import java.io.IOException;
import javax.annotation.Nullable;

public final class Class4866 extends Class4864 {
   private static String[] field22682;
   public final Class7450 field22683;
   public final File field22684;

   public Class4866(Class7450 var1, File var2) {
      this.field22683 = var1;
      this.field22684 = var2;
   }

   @Nullable
   @Override
   public Class7450 method15007() {
      return this.field22683;
   }

   @Override
   public long method15008() {
      return this.field22684.length();
   }

   @Override
   public void method15009(Class1733 var1) throws IOException {
      Class1737 var4 = null;

      try {
         var4 = Class7001.method21703(this.field22684);
         var1.method7563(var4);
      } finally {
         Class9474.method36535(var4);
      }
   }
}
