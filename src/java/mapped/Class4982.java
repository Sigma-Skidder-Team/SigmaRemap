package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Class4982 extends Class4975 {
   private static final String[] field22870 = new String[]{"yyyy", "yyyy-MM", "yyyy-MM-dd"};
   private Class2086 field22871;
   private byte[] field22872;

   public Class4982() {
      super("iTunes Metadata Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22871 = Class2086.method8742(this.field22851);
      var1.skipBytes(4L);
      this.field22872 = new byte[(int)this.method15430(var1)];
      var1.readBytes(this.field22872);
   }

   public Class2086 method15281() {
      return this.field22871;
   }

   public byte[] method15282() {
      return Arrays.copyOf(this.field22872, this.field22872.length);
   }

   public String method15283() {
      return new String(this.field22872, 0, this.field22872.length, Charset.forName("UTF-8"));
   }

   public long method15284() {
      long var3 = 0L;

      for (int var5 = 0; var5 < this.field22872.length; var5++) {
         var3 <<= 8;
         var3 |= (long)(this.field22872[var5] & 255);
      }

      return var3;
   }

   public int method15285() {
      return (int)this.method15284();
   }

   public boolean method15286() {
      return this.method15284() != 0L;
   }

   public Date method15287() {
      int var3 = (int)Math.floor((double)(this.field22872.length / 3)) - 1;
      Date var4;
      if (var3 >= 0 && var3 < field22870.length) {
         SimpleDateFormat var5 = new SimpleDateFormat(field22870[var3]);
         var4 = var5.parse(new String(this.field22872), new ParsePosition(0));
      } else {
         var4 = null;
      }

      return var4;
   }
}
