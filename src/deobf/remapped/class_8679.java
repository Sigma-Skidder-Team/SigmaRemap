package remapped;

import java.util.Random;

public class class_8679 extends Random {
   private static String[] field_44547;
   private int field_44546;

   public class_8679() {
   }

   public class_8679(long var1) {
      super(var1);
   }

   public void method_39868(int var1) {
      for (int var4 = 0; var4 < var1; var4++) {
         this.next(1);
      }
   }

   @Override
   public int next(int var1) {
      this.field_44546++;
      return super.next(var1);
   }

   public long method_39864(int var1, int var2) {
      long var5 = (long)var1 * 341873128712L + (long)var2 * 132897987541L;
      this.setSeed(var5);
      return var5;
   }

   public long method_39867(long var1, int var3, int var4) {
      this.setSeed(var1);
      long var7 = this.nextLong() | 1L;
      long var9 = this.nextLong() | 1L;
      long var11 = (long)var3 * var7 + (long)var4 * var9 ^ var1;
      this.setSeed(var11);
      return var11;
   }

   public long method_39866(long var1, int var3, int var4) {
      long var7 = var1 + (long)var3 + (long)(10000 * var4);
      this.setSeed(var7);
      return var7;
   }

   public long method_39861(long var1, int var3, int var4) {
      this.setSeed(var1);
      long var7 = this.nextLong();
      long var9 = this.nextLong();
      long var11 = (long)var3 * var7 ^ (long)var4 * var9 ^ var1;
      this.setSeed(var11);
      return var11;
   }

   public long method_39865(long var1, int var3, int var4, int var5) {
      long var8 = (long)var3 * 341873128712L + (long)var4 * 132897987541L + var1 + (long)var5;
      this.setSeed(var8);
      return var8;
   }

   public static Random method_39862(int var0, int var1, long var2, long var4) {
      return new Random(var2 + (long)(var0 * var0 * 4987142) + (long)(var0 * 5947611) + (long)(var1 * var1) * 4392871L + (long)(var1 * 389711) ^ var4);
   }
}
