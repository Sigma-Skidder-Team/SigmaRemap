package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5011 extends Class4975 {
   private String field22963;

   public Class5011() {
      super("OMA DRM Transaction Tracking Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22963 = var1.readString(16);
   }

   public String method15366() {
      return this.field22963;
   }
}
