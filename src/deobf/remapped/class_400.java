package remapped;

import java.io.IOException;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class class_400 extends class_6926 {
   private static final String[] field_1671 = new String[]{"yyyy", "yyyy-MM", "yyyy-MM-dd"};
   private class_8215 field_1669;
   private byte[] field_1670;

   public class_400() {
      super("iTunes Metadata Box");
   }

   @Override
   public void method_18109(class_6041 var1) throws IOException {
      super.method_18109(var1);
      this.field_1669 = class_8215.method_37618(this.field_35591);
      var1.method_27527(4L);
      this.field_1670 = new byte[(int)this.method_18113(var1)];
      var1.method_27525(this.field_1670);
   }

   public class_8215 method_2002() {
      return this.field_1669;
   }

   public byte[] method_1997() {
      return Arrays.copyOf(this.field_1670, this.field_1670.length);
   }

   public String method_1996() {
      return new String(this.field_1670, 0, this.field_1670.length, Charset.forName("UTF-8"));
   }

   public long method_2000() {
      long var3 = 0L;

      for (int var5 = 0; var5 < this.field_1670.length; var5++) {
         var3 <<= 8;
         var3 |= (long)(this.field_1670[var5] & 255);
      }

      return var3;
   }

   public int method_1999() {
      return (int)this.method_2000();
   }

   public boolean method_1998() {
      return this.method_2000() != 0L;
   }

   public Date method_2001() {
      int var3 = (int)Math.floor((double)(this.field_1670.length / 3)) - 1;
      Date var4;
      if (var3 >= 0 && var3 < field_1671.length) {
         SimpleDateFormat var5 = new SimpleDateFormat(field_1671[var3]);
         var4 = var5.parse(new String(this.field_1670), new ParsePosition(0));
      } else {
         var4 = null;
      }

      return var4;
   }
}
