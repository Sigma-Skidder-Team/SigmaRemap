package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5019 extends Class4975 {
   private String field22978;
   private String field22979;

   public Class5019() {
      super("Rating Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      if (this.field23026.method15431() != 1969517665L) {
         this.method15441(var1);
      } else {
         super.method15262(var1);
         long var4 = var1.readBits(4);
         long var6 = var1.readBits(4);
         this.field22978 = Class6170.method19068(var1.readBits(2));
         byte[] var8 = var1.method31868((int)this.method15430(var1), 0);
         this.field22979 = new String(var8, "UTF-8");
      }
   }

   public String method15380() {
      return this.field22978;
   }

   public String method15381() {
      return this.field22979;
   }
}
