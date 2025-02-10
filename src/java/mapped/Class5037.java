package mapped;

import java.io.IOException;

public class Class5037 extends FullBox {
   private long field23014;
   private long field23015;
   private long field23016;
   private long field23017;
   private long field23018;

   public Class5037() {
      super("Track Extends Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23014 = var1.readBits(4);
      this.field23015 = var1.readBits(4);
      this.field23016 = var1.readBits(4);
      this.field23017 = var1.readBits(4);
      this.field23018 = var1.readBits(4);
   }

   public long method15416() {
      return this.field23014;
   }

   public long method15417() {
      return this.field23015;
   }

   public long method15418() {
      return this.field23016;
   }

   public long method15419() {
      return this.field23017;
   }

   public int method15420() {
      return (int)(this.field23018 >> 24 & 3L);
   }

   public int method15421() {
      return (int)(this.field23018 >> 22 & 3L);
   }

   public int method15422() {
      return (int)(this.field23018 >> 20 & 3L);
   }

   public int method15423() {
      return (int)(this.field23018 >> 17 & 7L);
   }

   public boolean method15424() {
      return (this.field23018 >> 16 & 1L) == 1L;
   }

   public int method15425() {
      return (int)(this.field23018 & 65535L);
   }
}
