package mapped;

import java.net.DatagramPacket;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Random;

public class Class8951 {
   private final long field40460 = new Date().getTime();
   private final int field40461;
   private final byte[] field40462;
   private final byte[] field40463;
   private final String field40464;

   public Class8951(DatagramPacket var1) {
      byte[] var4 = var1.getData();
      this.field40462 = new byte[4];
      this.field40462[0] = var4[3];
      this.field40462[1] = var4[4];
      this.field40462[2] = var4[5];
      this.field40462[3] = var4[6];
      this.field40464 = new String(this.field40462, StandardCharsets.UTF_8);
      this.field40461 = new Random().nextInt(16777216);
      this.field40463 = String.format("\t%s%d\u0000", this.field40464, this.field40461).getBytes(StandardCharsets.UTF_8);
   }

   public Boolean method32699(long var1) {
      return this.field40460 < var1;
   }

   public int method32700() {
      return this.field40461;
   }

   public byte[] method32701() {
      return this.field40463;
   }

   public byte[] method32702() {
      return this.field40462;
   }
}
