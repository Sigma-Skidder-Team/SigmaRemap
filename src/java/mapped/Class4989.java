package mapped;

import java.io.IOException;

public class Class4989 extends Class4975 {
   private long field22897;
   private int field22898;
   private long[] field22899;
   private long[] field22900;
   private long[] field22901;
   private long[] field22902;
   private long[] field22903;

   public Class4989() {
      super("Track Fragment Random Access Box");
   }

   @Override
   public void method15262(Class8827 var1) throws IOException {
      super.method15262(var1);
      this.field22897 = var1.method31863(4);
      long var4 = var1.method31863(4);
      int var6 = (int)(var4 >> 4 & 3L) + 1;
      int var7 = (int)(var4 >> 2 & 3L) + 1;
      int var8 = (int)(var4 & 3L) + 1;
      this.field22898 = (int)var1.method31863(4);
      int var9 = this.field22850 != 1 ? 4 : 8;

      for (int var10 = 0; var10 < this.field22898; var10++) {
         this.field22899[var10] = var1.method31863(var9);
         this.field22900[var10] = var1.method31863(var9);
         this.field22901[var10] = var1.method31863(var6);
         this.field22902[var10] = var1.method31863(var7);
         this.field22903[var10] = var1.method31863(var8);
      }
   }

   public long method15311() {
      return this.field22897;
   }

   public int method15312() {
      return this.field22898;
   }

   public long[] method15313() {
      return this.field22899;
   }

   public long[] method15314() {
      return this.field22900;
   }

   public long[] method15315() {
      return this.field22901;
   }

   public long[] method15316() {
      return this.field22902;
   }

   public long[] method15317() {
      return this.field22903;
   }
}