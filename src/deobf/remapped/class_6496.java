package remapped;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Random;

public class class_6496 {
   private final long field_33076 = new Date().getTime();
   private final int field_33079;
   private final byte[] field_33081;
   private final byte[] field_33080;
   private final String field_33078;

   public class_6496(DatagramPacket var1) {
      byte[] var4 = var1.getData();
      this.field_33081 = new byte[4];
      this.field_33081[0] = var4[3];
      this.field_33081[1] = var4[4];
      this.field_33081[2] = var4[5];
      this.field_33081[3] = var4[6];
      this.field_33078 = new String(this.field_33081, StandardCharsets.UTF_8);
      this.field_33079 = new Random().nextInt(16777216);
      this.field_33080 = String.format("\t%s%d\u0000", this.field_33078, this.field_33079).getBytes(StandardCharsets.UTF_8);
   }

   public Boolean method_29622(long var1) {
      return this.field_33076 < var1;
   }

   public int method_29621() {
      return this.field_33079;
   }

   public byte[] method_29618() {
      return this.field_33080;
   }

   public byte[] method_29619() {
      return this.field_33081;
   }
}
