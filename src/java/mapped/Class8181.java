package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4398;

import java.util.Objects;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class Class8181 extends AbstractSpliterator<Class6408> {
   private static String[] field35185;
   private final Entity field35186;
   private final Class6488 field35187;
   private final Class4832 field35188;
   private final Class8893 field35189;
   private final Mutable field35190;
   private final Class6408 field35191;
   private final Class1668 field35192;
   private boolean field35193;
   private final BiPredicate<Class7380, BlockPos> field35194;

   public Class8181(Class1668 var1, Entity var2, Class6488 var3) {
      this(var1, var2, var3, (var0, var1x) -> true);
   }

   public Class8181(Class1668 var1, Entity var2, Class6488 var3, BiPredicate<Class7380, BlockPos> var4) {
      super(Long.MAX_VALUE, 1280);
      this.field35188 = var2 != null ? Class4832.method14948(var2) : Class4832.method14947();
      this.field35190 = new Mutable();
      this.field35191 = Class8022.method27428(var3);
      this.field35192 = var1;
      this.field35193 = var2 != null;
      this.field35186 = var2;
      this.field35187 = var3;
      this.field35194 = var4;
      int var7 = Class9679.method37769(var3.field28449 - 1.0E-7) - 1;
      int var8 = Class9679.method37769(var3.field28452 + 1.0E-7) + 1;
      int var9 = Class9679.method37769(var3.field28450 - 1.0E-7) - 1;
      int var10 = Class9679.method37769(var3.field28453 + 1.0E-7) + 1;
      int var11 = Class9679.method37769(var3.field28451 - 1.0E-7) - 1;
      int var12 = Class9679.method37769(var3.field28454 + 1.0E-7) + 1;
      this.field35189 = new Class8893(var7, var9, var11, var8, var10, var12);
   }

   @Override
   public boolean tryAdvance(Consumer<? super Class6408> var1) {
      return this.field35193 && this.method28475(var1) || this.method28473(var1);
   }

   public boolean method28473(Consumer<? super Class6408> var1) {
      while (this.field35189.method32365()) {
         int var4 = this.field35189.method32366();
         int var5 = this.field35189.method32367();
         int var6 = this.field35189.method32368();
         int var7 = this.field35189.method32369();
         if (var7 != 3) {
            Class1665 var8 = this.method28474(var4, var6);
            if (var8 != null) {
               this.field35190.method8372(var4, var5, var6);
               Class7380 var9 = var8.method6738(this.field35190);
               if (this.field35194.test(var9, this.field35190) && (var7 != 1 || var9.method23390()) && (var7 != 2 || var9.method23448(Blocks.field36505))) {
                  Class6408 var10 = var9.method23415(this.field35192, this.field35190, this.field35188);
                  if (this.field35186 instanceof PlayerEntity) {
                     Class4398 var11 = new Class4398(this.field35190, var10);
                     Client.getInstance().getEventManager().call(var11);
                     var10 = var11.method13903();
                     if (var11.isCancelled()) {
                        return false;
                     }
                  }

                  if (var10 != Class8022.method27426()) {
                     Class6408 var12 = var10.method19517((double)var4, (double)var5, (double)var6);
                     if (Class8022.method27435(var12, this.field35191, Class9477.field44045)) {
                        var1.accept(var12);
                        return true;
                     }
                  } else if (this.field35187.method19671((double)var4, (double)var5, (double)var6, (double)var4 + 1.0, (double)var5 + 1.0, (double)var6 + 1.0)) {
                     var1.accept(var10.method19517((double)var4, (double)var5, (double)var6));
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private Class1665 method28474(int var1, int var2) {
      int var5 = var1 >> 4;
      int var6 = var2 >> 4;
      return this.field35192.method6769(var5, var6);
   }

   public boolean method28475(Consumer<? super Class6408> var1) {
      Objects.<Entity>requireNonNull(this.field35186);
      this.field35193 = false;
      Class7522 var4 = this.field35192.method6810();
      Class6488 var5 = this.field35186.method3389();
      if (!method28478(var4, var5)) {
         Class6408 var6 = var4.method24527();
         if (!method28477(var6, var5) && method28476(var6, var5)) {
            var1.accept(var6);
            return true;
         }
      }

      return false;
   }

   private static boolean method28476(Class6408 var0, Class6488 var1) {
      return Class8022.method27435(var0, Class8022.method27428(var1.method19664(1.0E-7)), Class9477.field44045);
   }

   private static boolean method28477(Class6408 var0, Class6488 var1) {
      return Class8022.method27435(var0, Class8022.method27428(var1.method19679(1.0E-7)), Class9477.field44045);
   }

   public static boolean method28478(Class7522 var0, Class6488 var1) {
      double var4 = (double)Class9679.method37769(var0.method24530());
      double var6 = (double)Class9679.method37769(var0.method24531());
      double var8 = (double)Class9679.method37774(var0.method24532());
      double var10 = (double)Class9679.method37774(var0.method24533());
      return var1.field28449 > var4
         && var1.field28449 < var8
         && var1.field28451 > var6
         && var1.field28451 < var10
         && var1.field28452 > var4
         && var1.field28452 < var8
         && var1.field28454 > var6
         && var1.field28454 < var10;
   }
}
