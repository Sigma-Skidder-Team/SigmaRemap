package mapped;

import java.io.IOException;

public class Class5063 extends Class5056 {
   private int field23076;
   private int field23077;
   private int[] field23078;
   private int[] field23079;
   private int[] field23080;
   private int[] field23081;
   private int[] field23082;
   private int[] field23083;
   private boolean[] field23084;

   public Class5063() {
      super("EAC-3 Specific Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      long var4 = var1.readBits(2);
      this.field23076 = (int)(var4 >> 3 & 8191L);
      this.field23077 = (int)(var4 & 7L);

      for (int var6 = 0; var6 < this.field23077; var6++) {
         var4 = var1.readBits(3);
         this.field23078[var6] = (int)(var4 >> 22 & 3L);
         this.field23079[var6] = (int)(var4 >> 17 & 31L);
         this.field23080[var6] = (int)(var4 >> 12 & 31L);
         this.field23081[var6] = (int)(var4 >> 9 & 7L);
         this.field23084[var6] = (var4 >> 5 & 1L) == 1L;
         this.field23082[var6] = (int)(var4 >> 1 & 15L);
         if (this.field23082[var6] > 0) {
            var4 = var4 << 8 | (long)var1.readInt();
            this.field23083[var6] = (int)(var4 & 511L);
         }
      }
   }

   public int method15486() {
      return this.field23076;
   }

   public int method15487() {
      return this.field23077;
   }

   public int[] method15488() {
      return this.field23078;
   }

   public int[] method15489() {
      return this.field23079;
   }

   public int[] method15490() {
      return this.field23080;
   }

   public int[] method15491() {
      return this.field23081;
   }

   public boolean[] method15492() {
      return this.field23084;
   }

   public int[] method15493() {
      return this.field23082;
   }

   public int[] method15494() {
      return this.field23083;
   }
}
