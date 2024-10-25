package mapped;

import net.sourceforge.jaad.mp4.MP4InputStream;

import java.io.IOException;

public class Class5088 extends Class4975 {
   private long field23150;
   private boolean field23151;
   private boolean field23152;
   private boolean field23153;
   private boolean field23154;
   private boolean field23155;
   private boolean field23156;
   private long field23157;
   private long field23158;
   private long field23159;
   private long field23160;
   private long field23161;

   public Class5088() {
      super("Track Fragment Header Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      this.field23150 = var1.readBits(4);
      this.field23151 = (this.field22851 & 1) == 1;
      this.field23157 = !this.field23151 ? 0L : var1.readBits(8);
      this.field23152 = (this.field22851 & 2) == 2;
      this.field23158 = !this.field23152 ? 0L : var1.readBits(4);
      this.field23153 = (this.field22851 & 8) == 8;
      this.field23159 = !this.field23153 ? 0L : var1.readBits(4);
      this.field23154 = (this.field22851 & 16) == 16;
      this.field23160 = !this.field23154 ? 0L : var1.readBits(4);
      this.field23155 = (this.field22851 & 32) == 32;
      this.field23161 = !this.field23155 ? 0L : var1.readBits(4);
      this.field23156 = (this.field22851 & 65536) == 65536;
   }

   public long method15548() {
      return this.field23150;
   }

   public boolean method15549() {
      return this.field23151;
   }

   public long method15550() {
      return this.field23157;
   }

   public boolean method15551() {
      return this.field23152;
   }

   public long method15552() {
      return this.field23158;
   }

   public boolean method15553() {
      return this.field23153;
   }

   public long method15554() {
      return this.field23159;
   }

   public boolean method15555() {
      return this.field23154;
   }

   public long method15556() {
      return this.field23160;
   }

   public boolean method15557() {
      return this.field23155;
   }

   public long method15558() {
      return this.field23161;
   }

   public boolean method15559() {
      return this.field23156;
   }
}
