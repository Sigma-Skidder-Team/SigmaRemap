package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class MovieHeaderBox extends Class4975 {
   private long field23122;
   private long field23123;
   private long field23124;
   private long field23125;
   private double field23126;
   private double field23127;
   private double[] field23128 = new double[9];
   private long field23129;

   public MovieHeaderBox() {
      super("Movie Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = this.field22850 != 1 ? 4 : 8;
      this.field23122 = var1.readBits(var4);
      this.field23123 = var1.readBits(var4);
      this.field23124 = var1.readBits(4);
      this.field23125 = Class6170.method19069(var1.readBits(var4));
      this.field23126 = var1.method31869(16, 16);
      this.field23127 = var1.method31869(8, 8);
      var1.skipBytes(10L);

      for (int var5 = 0; var5 < 9; var5++) {
         if (var5 >= 6) {
            this.field23128[var5] = var1.method31869(2, 30);
         } else {
            this.field23128[var5] = var1.method31869(16, 16);
         }
      }

      var1.skipBytes(24L);
      this.field23129 = var1.readBits(4);
   }

   public long method15520() {
      return this.field23122;
   }

   public long method15521() {
      return this.field23123;
   }

   public long method15522() {
      return this.field23124;
   }

   public long method15523() {
      return this.field23125;
   }

   public double method15524() {
      return this.field23126;
   }

   public double method15525() {
      return this.field23127;
   }

   public double[] method15526() {
      return this.field23128;
   }

   public long method15527() {
      return this.field23129;
   }
}
