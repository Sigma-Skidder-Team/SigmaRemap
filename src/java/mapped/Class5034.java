package mapped;

import java.io.IOException;

public class Class5034 extends Class4975 {
   private long[] field23003;
   private long[][] field23004;
   private int[][] field23005;
   private boolean[][] field23006;

   public Class5034() {
      super("Sub Sample Information Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      int var4 = this.field22850 != 1 ? 2 : 4;
      int var5 = (int)var1.method31863(4);
      this.field23003 = new long[var5];
      this.field23004 = new long[var5][];
      this.field23005 = new int[var5][];
      this.field23006 = new boolean[var5][];

      for (int var6 = 0; var6 < var5; var6++) {
         this.field23003[var6] = var1.method31863(4);
         int var7 = (int)var1.method31863(2);
         this.field23004[var6] = new long[var7];
         this.field23005[var6] = new int[var7];
         this.field23006[var6] = new boolean[var7];

         for (int var8 = 0; var8 < var7; var8++) {
            this.field23004[var6][var8] = var1.method31863(var4);
            this.field23005[var6][var8] = var1.method31861();
            this.field23006[var6][var8] = (var1.method31861() & 1) == 1;
            var1.method31870(4L);
         }
      }
   }

   public long[] method15405() {
      return this.field23003;
   }

   public long[][] method15406() {
      return this.field23004;
   }

   public int[][] method15407() {
      return this.field23005;
   }

   public boolean[][] method15408() {
      return this.field23006;
   }
}
