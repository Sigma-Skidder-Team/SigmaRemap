package mapped;

import java.util.Random;

public abstract class Class3468 extends Block {
   public static final Class6408 field19313 = Block.method11539(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
   public static final Class6408 field19314 = Block.method11539(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
   public static final Class6488 field19315 = new Class6488(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

   public Class3468(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.method12158(var1) <= 0 ? field19314 : field19313;
   }

   public int method12152() {
      return 20;
   }

   @Override
   public boolean method11564() {
      return true;
   }

   @Override
   public Class7380 method11491(Class7380 var1, Direction var2, Class7380 var3, Class1660 var4, BlockPos var5, BlockPos var6) {
      return var2 == Direction.field672 && !var1.method23443(var4, var5)
         ? Blocks.AIR.method11579()
         : super.method11491(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8313();
      return method11547(var2, var6) || method11548(var2, var6, Direction.field673);
   }

   @Override
   public void method11522(Class7380 var1, ServerWorld var2, BlockPos var3, Random var4) {
      int var7 = this.method12158(var1);
      if (var7 > 0) {
         this.method12153(var2, var3, var1, var7);
      }
   }

   @Override
   public void method11523(Class7380 var1, World var2, BlockPos var3, Entity var4) {
      if (!var2.field9020) {
         int var7 = this.method12158(var1);
         if (var7 == 0) {
            this.method12153(var2, var3, var1, var7);
         }
      }
   }

   public void method12153(World var1, BlockPos var2, Class7380 var3, int var4) {
      int var7 = this.method12157(var1, var2);
      boolean var8 = var4 > 0;
      boolean var9 = var7 > 0;
      if (var4 != var7) {
         Class7380 var10 = this.method12159(var3, var7);
         var1.method6725(var2, var10, 2);
         this.method12156(var1, var2);
         var1.method6732(var2, var3, var10);
      }

      if (!var9 && var8) {
         this.method12155(var1, var2);
      } else if (var9 && !var8) {
         this.method12154(var1, var2);
      }

      if (var9) {
         var1.method6860().method20726(new BlockPos(var2), this, this.method12152());
      }
   }

   public abstract void method12154(Class1660 var1, BlockPos var2);

   public abstract void method12155(Class1660 var1, BlockPos var2);

   @Override
   public void method11513(Class7380 var1, World var2, BlockPos var3, Class7380 var4, boolean var5) {
      if (!var5 && !var1.method23448(var4.method23383())) {
         if (this.method12158(var1) > 0) {
            this.method12156(var2, var3);
         }

         super.method11513(var1, var2, var3, var4, var5);
      }
   }

   public void method12156(World var1, BlockPos var2) {
      var1.method6733(var2, this);
      var1.method6733(var2.method8313(), this);
   }

   @Override
   public int method11514(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return this.method12158(var1);
   }

   @Override
   public int method11515(Class7380 var1, Class1665 var2, BlockPos var3, Direction var4) {
      return var4 != Direction.field673 ? 0 : this.method12158(var1);
   }

   @Override
   public boolean method11516(Class7380 var1) {
      return true;
   }

   @Override
   public Class2315 method11689(Class7380 var1) {
      return Class2315.field15863;
   }

   public abstract int method12157(World var1, BlockPos var2);

   public abstract int method12158(Class7380 var1);

   public abstract Class7380 method12159(Class7380 var1, int var2);
}
