package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class Class9803 {
   private final Predicate<Class9632>[][][] field45823;
   private final int field45824;
   private final int field45825;
   private final int field45826;

   public Class9803(Predicate<Class9632>[][][] var1) {
      this.field45823 = var1;
      this.field45824 = var1.length;
      if (this.field45824 <= 0) {
         this.field45825 = 0;
         this.field45826 = 0;
      } else {
         this.field45825 = var1[0].length;
         if (this.field45825 <= 0) {
            this.field45826 = 0;
         } else {
            this.field45826 = var1[0][0].length;
         }
      }
   }

   public int method38652() {
      return this.field45824;
   }

   public int method38653() {
      return this.field45825;
   }

   public int method38654() {
      return this.field45826;
   }

   @Nullable
   private Class9086 method38655(BlockPos var1, Direction var2, Direction var3, LoadingCache<BlockPos, Class9632> var4) {
      for (int var7 = 0; var7 < this.field45826; var7++) {
         for (int var8 = 0; var8 < this.field45825; var8++) {
            for (int var9 = 0; var9 < this.field45824; var9++) {
               if (!this.field45823[var9][var8][var7].test((Class9632)var4.getUnchecked(method38658(var1, var2, var3, var7, var8, var9)))) {
                  return null;
               }
            }
         }
      }

      return new Class9086(var1, var2, var3, var4, this.field45826, this.field45825, this.field45824);
   }

   @Nullable
   public Class9086 method38656(Class1662 var1, BlockPos var2) {
      LoadingCache var5 = method38657(var1, false);
      int var6 = Math.max(Math.max(this.field45826, this.field45825), this.field45824);

      for (BlockPos var8 : BlockPos.method8359(var2, var2.method8336(var6 - 1, var6 - 1, var6 - 1))) {
         for (Direction var12 : Direction.values()) {
            for (Direction var16 : Direction.values()) {
               if (var16 != var12 && var16 != var12.method536()) {
                  Class9086 var17 = this.method38655(var8, var12, var16, var5);
                  if (var17 != null) {
                     return var17;
                  }
               }
            }
         }
      }

      return null;
   }

   public static LoadingCache<BlockPos, Class9632> method38657(Class1662 var0, boolean var1) {
      return CacheBuilder.newBuilder().build(new Class4564(var0, var1));
   }

   public static BlockPos method38658(BlockPos var0, Direction var1, Direction var2, int var3, int var4, int var5) {
      if (var1 != var2 && var1 != var2.method536()) {
         Class1998 var8 = new Class1998(var1.method539(), var1.method540(), var1.method541());
         Class1998 var9 = new Class1998(var2.method539(), var2.method540(), var2.method541());
         Class1998 var10 = var8.method8315(var9);
         return var0.method8336(
            var9.method8304() * -var4 + var10.method8304() * var3 + var8.method8304() * var5,
            var9.getY() * -var4 + var10.getY() * var3 + var8.getY() * var5,
            var9.method8306() * -var4 + var10.method8306() * var3 + var8.method8306() * var5
         );
      } else {
         throw new IllegalArgumentException("Invalid forwards & up combination");
      }
   }
}