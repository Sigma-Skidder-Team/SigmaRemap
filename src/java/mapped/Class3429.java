package mapped;

public abstract class Class3429 extends Block {
   public static final Class6408 field19187 = Block.method11539(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   public static final Class6408 field19188 = Block.method11539(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   private final boolean field19189;

   public static boolean method12086(Class1655 var0, BlockPos var1) {
      return method12087(var0.method6738(var1));
   }

   public static boolean method12087(Class7380 var0) {
      return var0.method23446(Class7645.field32766) && var0.method23383() instanceof Class3429;
   }

   public Class3429(boolean var1, Class7929 var2) {
      super(var2);
      this.field19189 = var1;
   }

   public boolean method12088() {
      return this.field19189;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Class96 var7 = !var1.method23448(this) ? null : var1.<Class96>method23463(this.method12093());
      return var7 != null && var7.method275() ? field19188 : field19187;
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      return method11547(var2, var3.method8313());
   }

   @Override
   public void method11589(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var4.method23448(var1.method23383())) {
         this.method12089(var1, var2, var3, var5);
      }
   }

   public Class7380 method12089(Class7380 var1, Class1655 var2, BlockPos var3, boolean var4) {
      var1 = this.method12092(var2, var3, var1, true);
      if (this.field19189) {
         var1.method23423(var2, var3, this, var3, var4);
      }

      return var1;
   }

   @Override
   public void method11506(Class7380 var1, Class1655 var2, BlockPos var3, Block var4, BlockPos var5, boolean var6) {
      if (!var2.field9020 && var2.method6738(var3).method23448(this)) {
         Class96 var9 = var1.<Class96>method23463(this.method12093());
         if (!method12090(var3, var2, var9)) {
            this.method12091(var1, var2, var3, var4);
         } else {
            method11554(var1, var2, var3);
            var2.method6728(var3, var6);
         }
      }
   }

   private static boolean method12090(BlockPos var0, Class1655 var1, Class96 var2) {
      if (!method11547(var1, var0.method8313())) {
         return true;
      } else {
         switch (Class4683.field22260[var2.ordinal()]) {
            case 1:
               return !method11547(var1, var0.method8347());
            case 2:
               return !method11547(var1, var0.method8345());
            case 3:
               return !method11547(var1, var0.method8341());
            case 4:
               return !method11547(var1, var0.method8343());
            default:
               return false;
         }
      }
   }

   public void method12091(Class7380 var1, Class1655 var2, BlockPos var3, Block var4) {
   }

   public Class7380 method12092(Class1655 var1, BlockPos var2, Class7380 var3, boolean var4) {
      if (!var1.field9020) {
         Class96 var7 = var3.<Class96>method23463(this.method12093());
         return new Class9435(var1, var2, var3).method36244(var1.method6780(var2), var4, var7).method36245();
      } else {
         return var3;
      }
   }

   @Override
   public Class2315 method11689(Class7380 var1) {
      return Class2315.field15862;
   }

   @Override
   public void method11513(Class7380 var1, Class1655 var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var5) {
         super.method11513(var1, var2, var3, var4, var5);
         if (var1.<Class96>method23463(this.method12093()).method275()) {
            var2.method6733(var3.method8311(), this);
         }

         if (this.field19189) {
            var2.method6733(var3, this);
            var2.method6733(var3.method8313(), this);
         }
      }
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = super.method11579();
      Direction var5 = var1.method18350();
      boolean var6 = var5 == Direction.EAST || var5 == Direction.WEST;
      return var4.method23465(this.method12093(), !var6 ? Class96.field247 : Class96.field248);
   }

   public abstract Class8550<Class96> method12093();
}
