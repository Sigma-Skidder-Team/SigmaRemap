package mapped;

import com.google.common.hash.Hashing;

public class Class6668 {
   private static String[] field29238;
   private final Class1683 field29239;
   private final long field29240;
   private final Class1960 field29241;

   public Class6668(Class1683 var1, long var2, Class1960 var4) {
      this.field29239 = var1;
      this.field29240 = var2;
      this.field29241 = var4;
   }

   public static long method20321(long var0) {
      return Hashing.sha256().hashLong(var0).asLong();
   }

   public Class6668 method20322(Class1685 var1) {
      return new Class6668(var1, this.field29240, this.field29241);
   }

   public Biome method20323(BlockPos var1) {
      return this.field29241.method8225(this.field29240, var1.method8304(), var1.getY(), var1.method8306(), this.field29239);
   }

   public Biome method20324(double var1, double var3, double var5) {
      int var9 = MathHelper.method37769(var1) >> 2;
      int var10 = MathHelper.method37769(var3) >> 2;
      int var11 = MathHelper.method37769(var5) >> 2;
      return this.method20326(var9, var10, var11);
   }

   public Biome method20325(BlockPos var1) {
      int var4 = var1.method8304() >> 2;
      int var5 = var1.getY() >> 2;
      int var6 = var1.method8306() >> 2;
      return this.method20326(var4, var5, var6);
   }

   public Biome method20326(int var1, int var2, int var3) {
      return this.field29239.method7005(var1, var2, var3);
   }
}
