package mapped;

import org.apache.commons.lang3.mutable.MutableInt;

import javax.annotation.Nullable;
import java.util.Arrays;

public abstract class Class200<M extends Class7586<M>, S extends Class208<M>> extends Class202 implements Class198 {
   private static final Direction[] field745 = Direction.values();
   public final Class1704 field746;
   public final Class1977 field747;
   public final S field748;
   private boolean field749;
   public final Mutable field750 = new Mutable();
   private final long[] field751 = new long[2];
   private final Class1665[] field752 = new Class1665[2];

   public Class200(Class1704 var1, Class1977 var2, S var3) {
      super(16, 256, 8192);
      this.field746 = var1;
      this.field747 = var2;
      this.field748 = (S)var3;
      this.method646();
   }

   @Override
   public void method644(long var1) {
      this.field748.method716();
      if (this.field748.method698(Class2002.method8419(var1))) {
         super.method644(var1);
      }
   }

   @Nullable
   private Class1665 method645(int var1, int var2) {
      long var5 = Class7481.method24353(var1, var2);

      for (int var7 = 0; var7 < 2; var7++) {
         if (var5 == this.field751[var7]) {
            return this.field752[var7];
         }
      }

      Class1665 var9 = this.field746.method7344(var1, var2);

      for (int var8 = 1; var8 > 0; var8--) {
         this.field751[var8] = this.field751[var8 - 1];
         this.field752[var8] = this.field752[var8 - 1];
      }

      this.field751[0] = var5;
      this.field752[0] = var9;
      return var9;
   }

   private void method646() {
      Arrays.fill(this.field751, Class7481.field32173);
      Arrays.fill(this.field752, null);
   }

   public Class7380 method647(long var1, MutableInt var3) {
      if (var1 != Long.MAX_VALUE) {
         int var6 = Class2002.method8396(BlockPos.method8328(var1));
         int var7 = Class2002.method8396(BlockPos.method8330(var1));
         Class1665 var8 = this.method645(var6, var7);
         if (var8 == null) {
            if (var3 != null) {
               var3.setValue(16);
            }

            return Blocks.BEDROCK.method11579();
         } else {
            this.field750.method8375(var1);
            Class7380 var9 = var8.method6738(this.field750);
            boolean var10 = var9.method23410() && var9.method23391();
            if (var3 != null) {
               var3.setValue(var9.method23387(this.field746.method7386(), this.field750));
            }

            return !var10 ? Blocks.AIR.method11579() : var9;
         }
      } else {
         if (var3 != null) {
            var3.setValue(0);
         }

         return Blocks.AIR.method11579();
      }
   }

   public Class6408 method648(Class7380 var1, long var2, Direction var4) {
      return !var1.method23410() ? Class8022.method27425() : var1.method23388(this.field746.method7386(), this.field750.method8375(var2), var4);
   }

   public static int method649(Class1665 var0, Class7380 var1, BlockPos var2, Class7380 var3, BlockPos var4, Direction var5, int var6) {
      boolean var9 = var1.method23410() && var1.method23391();
      boolean var10 = var3.method23410() && var3.method23391();
      if (!var9 && !var10) {
         return var6;
      } else {
         Class6408 var11 = !var9 ? Class8022.method27425() : var1.method23389(var0, var2);
         Class6408 var12 = !var10 ? Class8022.method27425() : var3.method23389(var0, var4);
         return !Class8022.method27443(var11, var12, var5) ? var6 : 16;
      }
   }

   @Override
   public boolean method650(long var1) {
      return var1 == Long.MAX_VALUE;
   }

   @Override
   public int method651(long var1, long var3, int var5) {
      return 0;
   }

   @Override
   public int method652(long var1) {
      return var1 != Long.MAX_VALUE ? 15 - this.field748.method703(var1) : 0;
   }

   public int method653(Class6785 var1, long var2) {
      return 15
         - var1.method20670(
            Class2002.method8397(BlockPos.method8328(var2)),
            Class2002.method8397(BlockPos.method8329(var2)),
            Class2002.method8397(BlockPos.method8330(var2))
         );
   }

   @Override
   public void method654(long var1, int var3) {
      this.field748.method704(var1, Math.min(15, 15 - var3));
   }

   @Override
   public int method655(long var1, long var3, int var5) {
      return 0;
   }

   public boolean method656() {
      return this.method675() || this.field748.method675() || this.field748.method707();
   }

   public int method657(int var1, boolean var2, boolean var3) {
      if (!this.field749) {
         if (this.field748.method675()) {
            var1 = this.field748.method676(var1);
            if (var1 == 0) {
               return var1;
            }
         }

         this.field748.method708(this, var2, var3);
      }

      this.field749 = true;
      if (this.method675()) {
         var1 = this.method676(var1);
         this.method646();
         if (var1 == 0) {
            return var1;
         }
      }

      this.field749 = false;
      this.field748.method717();
      return var1;
   }

   public void method658(long var1, Class6785 var3, boolean var4) {
      this.field748.method714(var1, var3, var4);
   }

   @Nullable
   @Override
   public Class6785 method642(Class2002 var1) {
      return this.field748.method701(var1.method8425());
   }

   @Override
   public int method643(BlockPos var1) {
      return this.field748.method702(var1.method8332());
   }

   public String method659(long var1) {
      return "" + this.field748.method652(var1);
   }

   public void method660(BlockPos var1) {
      long var4 = var1.method8332();
      this.method644(var4);

      for (Direction var9 : field745) {
         this.method644(BlockPos.method8314(var4, var9));
      }
   }

   public void method661(BlockPos var1, int var2) {
   }

   @Override
   public void method604(Class2002 var1, boolean var2) {
      this.field748.method715(var1.method8425(), var2);
   }

   public void method662(Class7481 var1, boolean var2) {
      long var5 = Class2002.method8420(Class2002.method8424(var1.field32174, 0, var1.field32175));
      this.field748.method712(var5, var2);
   }

   public void method663(Class7481 var1, boolean var2) {
      long var5 = Class2002.method8420(Class2002.method8424(var1.field32174, 0, var1.field32175));
      this.field748.method713(var5, var2);
   }
}
