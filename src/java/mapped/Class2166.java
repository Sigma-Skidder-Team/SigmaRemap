package mapped;

public enum Class2166 {
   field14220(0, 0, 28, 32, 8),
   field14221(84, 0, 28, 32, 8),
   field14222(0, 64, 32, 28, 5),
   field14223(96, 64, 32, 28, 5);

   private final int field14224;
   private final int field14225;
   private final int field14226;
   private final int field14227;
   private final int field14228;
   private static final Class2166[] field14229 = new Class2166[]{field14220, field14221, field14222, field14223};

   private Class2166(int var3, int var4, int var5, int var6, int var7) {
      this.field14224 = var3;
      this.field14225 = var4;
      this.field14226 = var5;
      this.field14227 = var6;
      this.field14228 = var7;
   }

   public int method8885() {
      return this.field14228;
   }

   public void method8886(Class9332 var1, Class1193 var2, int var3, int var4, boolean var5, int var6) {
      int var9 = this.field14224;
      if (var6 > 0) {
         var9 += this.field14226;
      }

      if (var6 == this.field14228 - 1) {
         var9 += this.field14226;
      }

      int var10 = !var5 ? this.field14225 : this.field14225 + this.field14227;
      var2.method5696(var1, var3 + this.method8888(var6), var4 + this.method8889(var6), var9, var10, this.field14226, this.field14227);
   }

   public void method8887(int var1, int var2, int var3, Class216 var4, ItemStack var5) {
      int var8 = var1 + this.method8888(var3);
      int var9 = var2 + this.method8889(var3);
      switch (Class8863.field40052[this.ordinal()]) {
         case 1:
            var8 += 6;
            var9 += 9;
            break;
         case 2:
            var8 += 6;
            var9 += 6;
            break;
         case 3:
            var8 += 10;
            var9 += 5;
            break;
         case 4:
            var8 += 6;
            var9 += 5;
      }

      var4.method794(var5, var8, var9);
   }

   public int method8888(int var1) {
      switch (Class8863.field40052[this.ordinal()]) {
         case 1:
            return (this.field14226 + 4) * var1;
         case 2:
            return (this.field14226 + 4) * var1;
         case 3:
            return -this.field14226 + 4;
         case 4:
            return 248;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public int method8889(int var1) {
      switch (Class8863.field40052[this.ordinal()]) {
         case 1:
            return -this.field14227 + 4;
         case 2:
            return 136;
         case 3:
            return this.field14227 * var1;
         case 4:
            return this.field14227 * var1;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public boolean method8890(int var1, int var2, int var3, double var4, double var6) {
      int var10 = var1 + this.method8888(var3);
      int var11 = var2 + this.method8889(var3);
      return var4 > (double)var10 && var4 < (double)(var10 + this.field14226) && var6 > (double)var11 && var6 < (double)(var11 + this.field14227);
   }
}
