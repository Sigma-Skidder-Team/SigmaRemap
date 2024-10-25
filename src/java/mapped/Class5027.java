package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5027 extends Class5023 {
   private String[] field22995;

   public Class5027() {
      super("3GPP Keywords Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      this.method15384(var1);
      int var4 = var1.readInt();
      this.field22995 = new String[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         int var6 = var1.readInt();
         this.field22995[var5] = var1.method31867(var6);
      }
   }

   public String[] method15397() {
      return this.field22995;
   }
}
