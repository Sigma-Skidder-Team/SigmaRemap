package remapped;

public enum class_483 {
   field_3000(0, 0, 28, 32, 8),
   field_3004(84, 0, 28, 32, 8),
   field_3001(0, 64, 32, 28, 5),
   field_2998(96, 64, 32, 28, 5);

   private final int field_3006;
   private final int field_2997;
   private final int field_3003;
   private final int field_3007;
   private final int field_3005;

   private class_483(int var3, int var4, int var5, int var6, int var7) {
      this.field_3006 = var3;
      this.field_2997 = var4;
      this.field_3003 = var5;
      this.field_3007 = var6;
      this.field_3005 = var7;
   }

   public int method_2290() {
      return this.field_3005;
   }

   public void method_2286(class_7966 var1, AbstractGui var2, int var3, int var4, boolean var5, int var6) {
      int var9 = this.field_3006;
      if (var6 > 0) {
         var9 += this.field_3003;
      }

      if (var6 == this.field_3005 - 1) {
         var9 += this.field_3003;
      }

      int var10 = !var5 ? this.field_2997 : this.field_2997 + this.field_3007;
      var2.method_9781(var1, var3 + this.method_2285(var6), var4 + this.method_2289(var6), var9, var10, this.field_3003, this.field_3007);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void method_2287(int var1, int var2, int var3, ItemRenderer var4, ItemStack var5) {
      int var8 = var1 + this.method_2285(var3);
      int var9 = var2 + this.method_2289(var3);
      switch (this) {
         case field_3000:
            var8 += 6;
            var9 += 9;
            break;
         case field_3004:
            var8 += 6;
            var9 += 6;
            break;
         case field_3001:
            var8 += 10;
            var9 += 5;
            break;
         case field_2998:
            var8 += 6;
            var9 += 5;
      }

      var4.method_40284(var5, var8, var9);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int method_2285(int var1) {
      switch (this) {
         case field_3000:
            return (this.field_3003 + 4) * var1;
         case field_3004:
            return (this.field_3003 + 4) * var1;
         case field_3001:
            return -this.field_3003 + 4;
         case field_2998:
            return 248;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public int method_2289(int var1) {
      switch (this) {
         case field_3000:
            return -this.field_3007 + 4;
         case field_3004:
            return 136;
         case field_3001:
            return this.field_3007 * var1;
         case field_2998:
            return this.field_3007 * var1;
         default:
            throw new UnsupportedOperationException("Don't know what this tab type is!" + this);
      }
   }

   public boolean method_2284(int var1, int var2, int var3, double var4, double var6) {
      int var10 = var1 + this.method_2285(var3);
      int var11 = var2 + this.method_2289(var3);
      return var4 > (double)var10 && var4 < (double)(var10 + this.field_3003) && var6 > (double)var11 && var6 < (double)(var11 + this.field_3007);
   }
}
