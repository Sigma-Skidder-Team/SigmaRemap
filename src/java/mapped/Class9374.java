package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class Class9374 {
   private static String[] field43506;
   private static final Comparator<Class6485> field43507 = Comparator.<Class6485, Integer>comparing(var0 -> -var0.field28434)
      .thenComparing(var0 -> -var0.field28433)
      .thenComparing(var0 -> var0.field28432.method36195());
   private final int field43508;
   private final Set<Class6485> field43509 = Sets.newHashSetWithExpectedSize(256);
   private final List<Class8565> field43510 = Lists.newArrayListWithCapacity(256);
   private int field43511;
   private int field43512;
   private final int field43513;
   private final int field43514;

   public Class9374(int var1, int var2, int var3) {
      this.field43508 = var3;
      this.field43513 = var1;
      this.field43514 = var2;
   }

   public int method35558() {
      return this.field43511;
   }

   public int method35559() {
      return this.field43512;
   }

   public void method35560(Class9431 var1) {
      Class6485 var4 = new Class6485(var1, this.field43508);
      this.field43509.add(var4);
   }

   public void method35561() {
      List<Class6485> var3 = Lists.newArrayList(this.field43509);
      var3.sort(field43507);

      for (Class6485 var5 : var3) {
         if (!this.method35564(var5)) {
            throw new Class2470(
               var5.field28432,
               var3.stream().<Class9431>map(var0 -> var0.field28432).collect(ImmutableList.toImmutableList()),
               this.field43511,
               this.field43512,
               this.field43513,
               this.field43514
            );
         }
      }

      this.field43511 = MathHelper.method37800(this.field43511);
      this.field43512 = MathHelper.method37800(this.field43512);
   }

   public void method35562(Class7327 var1) {
      for (Class8565 var5 : this.field43510) {
         var5.method30612(var2 -> {
            Class6485 var5x = var2.method30608();
            Class9431 var6 = var5x.field28432;
            var1.method23224(var6, this.field43511, this.field43512, var2.method30609(), var2.method30610());
         });
      }
   }

   private static int method35563(int var0, int var1) {
      return (var0 >> var1) + ((var0 & (1 << var1) - 1) != 0 ? 1 : 0) << var1;
   }

   private boolean method35564(Class6485 var1) {
      for (Class8565 var5 : this.field43510) {
         if (var5.method30611(var1)) {
            return true;
         }
      }

      return this.method35565(var1);
   }

   private boolean method35565(Class6485 var1) {
      int var4 = MathHelper.method37800(this.field43511);
      int var5 = MathHelper.method37800(this.field43512);
      int var6 = MathHelper.method37800(this.field43511 + var1.field28433);
      int var7 = MathHelper.method37800(this.field43512 + var1.field28434);
      boolean var8 = var6 <= this.field43513;
      boolean var9 = var7 <= this.field43514;
      if (!var8 && !var9) {
         return false;
      } else {
         int var10 = Class7317.method23169(this.field43512);
         boolean var11 = var8 && var6 <= 2 * var10;
         if (this.field43511 == 0 && this.field43512 == 0) {
            var11 = true;
         }

         Class8565 var12;
         if (!var11) {
            var12 = new Class8565(0, this.field43512, this.field43511, var1.field28434);
            this.field43512 = this.field43512 + var1.field28434;
         } else {
            if (this.field43512 == 0) {
               this.field43512 = var1.field28434;
            }

            var12 = new Class8565(this.field43511, 0, var1.field28433, this.field43512);
            this.field43511 = this.field43511 + var1.field28433;
         }

         var12.method30611(var1);
         this.field43510.add(var12);
         return true;
      }
   }

   // $VF: synthetic method
   public static int method35571(int var0, int var1) {
      return method35563(var0, var1);
   }
}
