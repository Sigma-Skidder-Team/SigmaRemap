package mapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class Class3444 extends Class3209 {
   public final Direction field19256;
   public final boolean field19257;
   public final Class6408 field19258;

   public Class3444(Class7929 var1, Direction var2, Class6408 var3, boolean var4) {
      super(var1);
      this.field19256 = var2;
      this.field19258 = var3;
      this.field19257 = var4;
   }

   @Nullable
   @Override
   public Class7380 method11495(Class5909 var1) {
      Class7380 var4 = var1.method18360().method6738(var1.method18345().method8349(this.field19256));
      return !var4.method23448(this.method12124()) && !var4.method23448(this.method12125())
         ? this.method12122(var1.method18360())
         : this.method12125().method11579();
   }

   public Class7380 method12122(Class1660 var1) {
      return this.method11579();
   }

   @Override
   public boolean method11492(Class7380 var1, Class1662 var2, BlockPos var3) {
      BlockPos var6 = var3.method8349(this.field19256.method536());
      Class7380 var7 = var2.method6738(var6);
      Class3209 var8 = var7.method23383();
      return !this.method12123(var8) ? false : var8 == this.method12124() || var8 == this.method12125() || var7.method23454(var2, var6, this.field19256);
   }

   @Override
   public void method11522(Class7380 var1, Class1657 var2, BlockPos var3, Random var4) {
      if (!var1.method23443(var2, var3)) {
         var2.method7179(var3, true);
      }
   }

   public boolean method12123(Class3209 var1) {
      return true;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field19258;
   }

   public abstract Class3452 method12124();

   public abstract Class3209 method12125();
}
