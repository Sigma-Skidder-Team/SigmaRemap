package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;

public class Class3218 extends Class3213 {
   public static final Class8553 field18627 = Class3198.field18484;
   private static final Class6408 field18628 = Class3209.method11539(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final Class6408 field18629 = Class3209.method11539(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final Class6408 field18630 = Class3209.method11539(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final Class6408 field18631 = Class3209.method11539(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final Class6408 field18632 = Class3209.method11539(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final Class6408 field18633 = Class3209.method11539(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final Class6408 field18634 = Class3209.method11539(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final Class6408 field18635 = Class8022.method27432(field18628, field18629, field18630, field18631);
   private static final Class6408 field18636 = Class8022.method27432(field18628, field18632, field18633, field18634);
   private static final ITextComponent field18637 = new TranslationTextComponent("container.repair");

   public Class3218(Class7929 var1) {
      super(var1);
      this.method11578(this.field18612.method35393().method23465(field18627, Direction.NORTH));
   }

   @Override
   public Class7380 method11495(Class5909 var1) {
      return this.method11579().method23465(field18627, var1.method18350().method537());
   }

   @Override
   public Class2274 method11505(Class7380 var1, Class1655 var2, BlockPos var3, PlayerEntity var4, Class79 var5, Class8711 var6) {
      if (!var2.field9020) {
         var4.method2766(var1.method23445(var2, var3));
         var4.method2911(Class8876.field40175);
         return Class2274.field14819;
      } else {
         return Class2274.field14818;
      }
   }

   @Nullable
   @Override
   public Class949 method11528(Class7380 var1, Class1655 var2, BlockPos var3) {
      return new Class953((var2x, var3x, var4) -> new Class5824(var2x, var3x, Class8786.method31714(var2, var3)), field18637);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      Direction var7 = var1.<Direction>method23463(field18627);
      return var7.method544() != Class113.field413 ? field18636 : field18635;
   }

   @Override
   public void method11596(Class907 var1) {
      var1.method3555(true);
   }

   @Override
   public void method11599(Class1655 var1, BlockPos var2, Class7380 var3, Class7380 var4, Class907 var5) {
      if (!var5.method3245()) {
         var1.method6999(1031, var2, 0);
      }
   }

   @Override
   public void method11600(Class1655 var1, BlockPos var2, Class907 var3) {
      if (!var3.method3245()) {
         var1.method6999(1029, var2, 0);
      }
   }

   @Nullable
   public static Class7380 method11607(Class7380 var0) {
      if (!var0.method23448(Class8487.field36713)) {
         return !var0.method23448(Class8487.field36714)
            ? null
            : Class8487.field36715.method11579().method23465(field18627, var0.<Direction>method23463(field18627));
      } else {
         return Class8487.field36714.method11579().method23465(field18627, var0.<Direction>method23463(field18627));
      }
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      return var1.method23465(field18627, var2.method252(var1.<Direction>method23463(field18627)));
   }

   @Override
   public void method11489(Class7558<Class3209, Class7380> var1) {
      var1.method24737(field18627);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   @Override
   public int method11601(Class7380 var1, Class1665 var2, BlockPos var3) {
      return var1.method23394(var2, var3).field31006;
   }
}
