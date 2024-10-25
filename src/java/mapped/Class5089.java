package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5089 extends Class4975 {
   private boolean field23162;
   private boolean field23163;
   private boolean field23164;
   private long field23165;
   private long field23166;
   private long field23167;
   private int field23168;
   private int field23169;
   private int field23170;
   private double field23171;
   private double field23172;
   private double field23173;
   private double[] field23174 = new double[9];

   public Class5089() {
      super("Track Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23162 = (this.field22851 & 1) == 1;
      this.field23163 = (this.field22851 & 2) == 2;
      this.field23164 = (this.field22851 & 4) == 4;
      int var4 = this.field22850 != 1 ? 4 : 8;
      this.field23165 = var1.readBits(var4);
      this.field23166 = var1.readBits(var4);
      this.field23168 = (int)var1.readBits(4);
      var1.skipBytes(4L);
      this.field23167 = Class6170.method19069(var1.readBits(var4));
      var1.skipBytes(8L);
      this.field23169 = (int)var1.readBits(2);
      this.field23170 = (int)var1.readBits(2);
      this.field23171 = var1.method31869(8, 8);
      var1.skipBytes(2L);

      for (int var5 = 0; var5 < 9; var5++) {
         if (var5 >= 6) {
            this.field23174[var5] = var1.method31869(2, 30);
         } else {
            this.field23174[var5] = var1.method31869(16, 16);
         }
      }

      this.field23172 = var1.method31869(16, 16);
      this.field23173 = var1.method31869(16, 16);
   }

   public boolean method15560() {
      return this.field23162;
   }

   public boolean method15561() {
      return this.field23163;
   }

   public boolean method15562() {
      return this.field23164;
   }

   public long method15563() {
      return this.field23165;
   }

   public long method15564() {
      return this.field23166;
   }

   public int method15565() {
      return this.field23168;
   }

   public long method15566() {
      return this.field23167;
   }

   public int method15567() {
      return this.field23169;
   }

   public int method15568() {
      return this.field23170;
   }

   public double getVolume() {
      return this.field23171;
   }

   public double method15570() {
      return this.field23172;
   }

   public double method15571() {
      return this.field23173;
   }

   public double[] method15572() {
      return this.field23174;
   }
}
