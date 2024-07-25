package remapped;

import com.mojang.datafixers.Products.P2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.Random;
import java.util.Set;

public abstract class class_2062 {
   public static final Codec<class_2062> field_10418 = class_8669.field_44394.dispatch(class_2062::method_9633, class_389::method_1885);
   public final class_3461 field_10420;
   public final class_3461 field_10419;

   public static <P extends class_2062> P2<Mu<P>, class_3461, class_3461> method_9635(Instance<P> var0) {
      return var0.group(
         class_3461.method_15933(0, 8, 8).fieldOf("radius").forGetter(var0x -> var0x.field_10420),
         class_3461.method_15933(0, 8, 8).fieldOf("offset").forGetter(var0x -> var0x.field_10419)
      );
   }

   public class_2062(class_3461 var1, class_3461 var2) {
      this.field_10420 = var1;
      this.field_10419 = var2;
   }

   public abstract class_389<?> method_9633();

   public void method_9629(class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, class_9616 var9) {
      this.method_9627(var1, var2, var3, var4, var5, var6, var7, var8, this.method_9631(var2), var9);
   }

   public abstract void method_9627(
           class_6755 var1, Random var2, class_1297 var3, int var4, class_8070 var5, int var6, int var7, Set<BlockPos> var8, int var9, class_9616 var10
   );

   public abstract int method_9628(Random var1, int var2, class_1297 var3);

   public int method_9632(Random var1, int var2) {
      return this.field_10420.method_15936(var1);
   }

   private int method_9631(Random var1) {
      return this.field_10419.method_15936(var1);
   }

   public abstract boolean method_9634(Random var1, int var2, int var3, int var4, int var5, boolean var6);

   public boolean method_9626(Random var1, int var2, int var3, int var4, int var5, boolean var6) {
      int var9;
      int var10;
      if (!var6) {
         var9 = Math.abs(var2);
         var10 = Math.abs(var4);
      } else {
         var9 = Math.min(Math.abs(var2), Math.abs(var2 - 1));
         var10 = Math.min(Math.abs(var4), Math.abs(var4 - 1));
      }

      return this.method_9634(var1, var9, var3, var10, var5, var6);
   }

   public void method_9625(
           class_6755 var1, Random var2, class_1297 var3, BlockPos var4, int var5, Set<BlockPos> var6, int var7, boolean var8, class_9616 var9
   ) {
      int var12 = !var8 ? 0 : 1;
      class_2921 var13 = new class_2921();

      for (int var14 = -var5; var14 <= var5 + var12; var14++) {
         for (int var15 = -var5; var15 <= var5 + var12; var15++) {
            if (!this.method_9626(var2, var14, var7, var15, var5, var8)) {
               var13.method_13360(var4, var14, var7, var15);
               if (class_8739.method_40126(var1, var13)) {
                  var1.method_7513(var13, var3.field_7151.method_35002(var2, var13), 19);
                  var9.method_44392(new class_9616(var13, var13));
                  var6.add(var13.method_6072());
               }
            }
         }
      }
   }
}
