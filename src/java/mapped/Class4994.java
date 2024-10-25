package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class4994 extends Class4975 {
   private int field22913;
   private boolean field22914;
   private boolean field22915;
   private long field22916;
   private long field22917;
   private boolean field22918;
   private boolean field22919;
   private boolean field22920;
   private boolean field22921;
   private long[] field22922;
   private long[] field22923;
   private long[] field22924;
   private long[] field22925;

   public Class4994() {
      super("Track Fragment Run Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field22913 = (int)var1.readBits(4);
      this.field22914 = (this.field22851 & 1) == 1;
      if (this.field22914) {
         this.field22916 = var1.readBits(4);
      }

      this.field22915 = (this.field22851 & 4) == 4;
      if (this.field22915) {
         this.field22917 = var1.readBits(4);
      }

      this.field22918 = (this.field22851 & 256) == 256;
      if (this.field22918) {
         this.field22922 = new long[this.field22913];
      }

      this.field22919 = (this.field22851 & 512) == 512;
      if (this.field22919) {
         this.field22923 = new long[this.field22913];
      }

      this.field22920 = (this.field22851 & 1024) == 1024;
      if (this.field22920) {
         this.field22924 = new long[this.field22913];
      }

      this.field22921 = (this.field22851 & 2048) == 2048;
      if (this.field22921) {
         this.field22925 = new long[this.field22913];
      }

      for (int var4 = 0; var4 < this.field22913 && this.method15430(var1) > 0L; var4++) {
         if (this.field22918) {
            this.field22922[var4] = var1.readBits(4);
         }

         if (this.field22919) {
            this.field22923[var4] = var1.readBits(4);
         }

         if (this.field22920) {
            this.field22924[var4] = var1.readBits(4);
         }

         if (this.field22921) {
            this.field22925[var4] = var1.readBits(4);
         }
      }
   }

   public int method15327() {
      return this.field22913;
   }

   public boolean method15328() {
      return this.field22914;
   }

   public long method15329() {
      return this.field22916;
   }

   public boolean method15330() {
      return this.field22915;
   }

   public long method15331() {
      return this.field22917;
   }

   public boolean method15332() {
      return this.field22918;
   }

   public long[] method15333() {
      return this.field22922;
   }

   public boolean method15334() {
      return this.field22919;
   }

   public long[] method15335() {
      return this.field22923;
   }

   public boolean method15336() {
      return this.field22920;
   }

   public long[] method15337() {
      return this.field22924;
   }

   public boolean method15338() {
      return this.field22921;
   }

   public long[] method15339() {
      return this.field22925;
   }
}
