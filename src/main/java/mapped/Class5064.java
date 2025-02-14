package mapped;

import java.io.IOException;

public class Class5064 extends Class5056 {
   private int field23085;
   private int field23086;
   private int field23087;
   private int field23088;
   private int field23089;
   private boolean field23090;

   public Class5064() {
      super("AC-3 Specific Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      long var4 = var1.readBits(3);
      this.field23085 = (int)(var4 >> 22 & 3L);
      this.field23086 = (int)(var4 >> 17 & 31L);
      this.field23087 = (int)(var4 >> 14 & 7L);
      this.field23088 = (int)(var4 >> 11 & 7L);
      this.field23090 = (var4 >> 10 & 1L) == 1L;
      this.field23089 = (int)(var4 >> 5 & 31L);
   }

   public int method15495() {
      return this.field23085;
   }

   public int method15496() {
      return this.field23086;
   }

   public int method15497() {
      return this.field23087;
   }

   public int method15498() {
      return this.field23088;
   }

   public boolean method15499() {
      return this.field23090;
   }

   public int method15500() {
      return this.field23089;
   }
}
