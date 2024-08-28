package mapped;

import java.io.IOException;

public class Class5009 extends Class4975 {
   private boolean field22959;
   private int field22960;
   private int field22961;

   public Class5009() {
      super("OMA DRM Access Unit Format Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22959 = (var1.method31861() >> 7 & 1) == 1;
      this.field22960 = var1.method31861();
      this.field22961 = var1.method31861();
   }

   public boolean method15362() {
      return this.field22959;
   }

   public int method15363() {
      return this.field22960;
   }

   public int method15364() {
      return this.field22961;
   }
}
