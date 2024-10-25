package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5054 extends Class5046 {
   private int field23053;
   private int field23054;
   private int field23055;
   private double field23056;

   public Class5054() {
      super("FD Hint Sample Entry");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23053 = (int)var1.readBits(2);
      this.field23054 = (int)var1.readBits(2);
      this.field23055 = (int)var1.readBits(2);
      this.field23056 = var1.method31869(8, 8);
      this.method15441(var1);
   }

   public int method15464() {
      return this.field23055;
   }

   public double method15465() {
      return this.field23056;
   }
}
