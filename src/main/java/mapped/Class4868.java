package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public final class Class4868 extends Class4864 {
   private static String[] field22688;
   public final Class7450 field22689;
   public final int field22690;
   public final byte[] field22691;
   public final int field22692;

   public Class4868(Class7450 var1, int var2, byte[] var3, int var4) {
      this.field22689 = var1;
      this.field22690 = var2;
      this.field22691 = var3;
      this.field22692 = var4;
   }

   @Nullable
   @Override
   public Class7450 method15007() {
      return this.field22689;
   }

   @Override
   public long method15008() {
      return (long)this.field22690;
   }

   @Override
   public void method15009(Class1733 var1) throws IOException {
      var1.method7562(this.field22691, this.field22692, this.field22690);
   }
}
