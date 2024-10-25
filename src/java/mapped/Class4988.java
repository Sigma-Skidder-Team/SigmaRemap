package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class4988 extends Class4975 {
   public static final long field22893 = 1769239918L;
   private long field22894;
   private long field22895;
   private String field22896;

   public Class4988() {
      super("Scheme Type Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22894 = var1.readBits(4);
      this.field22895 = var1.readBits(4);
      this.field22896 = (this.field22851 & 1) != 1 ? null : var1.method31866((int)this.method15430(var1), "UTF-8");
   }

   public long method15308() {
      return this.field22894;
   }

   public long method15309() {
      return this.field22895;
   }

   public String method15310() {
      return this.field22896;
   }
}
