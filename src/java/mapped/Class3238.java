package mapped;

import com.google.common.collect.UnmodifiableIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

import java.util.Map;

public class Class3238 extends Block implements Class3207 {
   private static String[] field18679;
   public static final Class8551 field18680 = Class3392.field19019;
   public static final Class8551 field18681 = Class3392.field19020;
   public static final Class8551 field18682 = Class3392.field19021;
   public static final Class8551 field18683 = Class3392.field19022;
   public static final Class8551 field18684 = Class8820.field39710;
   public static final Map<Direction, Class8551> field18685 = Class3392.field19025
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey().method544().method324())
      .collect(Util.<Direction, Class8551>method38484());
   public final Class6408[] field18686;
   public final Class6408[] field18687;
   private final Object2IntMap<Class7380> field18688 = new Object2IntOpenHashMap();

   public Class3238(float var1, float var2, float var3, float var4, float var5, Class7929 var6) {
      super(var6);
      this.field18686 = this.method11639(var1, var2, var5, 0.0F, var5);
      this.field18687 = this.method11639(var1, var2, var3, 0.0F, var4);
      UnmodifiableIterator var9 = this.field18612.method35392().iterator();

      while (var9.hasNext()) {
         Class7380 var10 = (Class7380)var9.next();
         this.method11641(var10);
      }
   }

   public Class6408[] method11639(float var1, float var2, float var3, float var4, float var5) {
      float var8 = 8.0F - var1;
      float var9 = 8.0F + var1;
      float var10 = 8.0F - var2;
      float var11 = 8.0F + var2;
      Class6408 var12 = Block.method11539((double)var8, 0.0, (double)var8, (double)var9, (double)var3, (double)var9);
      Class6408 var13 = Block.method11539((double)var10, (double)var4, 0.0, (double)var11, (double)var5, (double)var11);
      Class6408 var14 = Block.method11539((double)var10, (double)var4, (double)var10, (double)var11, (double)var5, 16.0);
      Class6408 var15 = Block.method11539(0.0, (double)var4, (double)var10, (double)var11, (double)var5, (double)var11);
      Class6408 var16 = Block.method11539((double)var10, (double)var4, (double)var10, 16.0, (double)var5, (double)var11);
      Class6408 var17 = Class8022.method27431(var13, var16);
      Class6408 var18 = Class8022.method27431(var14, var15);
      Class6408[] var19 = new Class6408[]{
         Class8022.method27425(),
         var14,
         var15,
         var18,
         var13,
         Class8022.method27431(var14, var13),
         Class8022.method27431(var15, var13),
         Class8022.method27431(var18, var13),
         var16,
         Class8022.method27431(var14, var16),
         Class8022.method27431(var15, var16),
         Class8022.method27431(var18, var16),
         var17,
         Class8022.method27431(var14, var17),
         Class8022.method27431(var15, var17),
         Class8022.method27431(var18, var17)
      };

      for (int var20 = 0; var20 < 16; var20++) {
         var19[var20] = Class8022.method27431(var12, var19[var20]);
      }

      return var19;
   }

   @Override
   public boolean method11493(Class7380 var1, Class1665 var2, BlockPos var3) {
      return !var1.<Boolean>method23463(field18684);
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field18687[this.method11641(var1)];
   }

   @Override
   public Class6408 method11502(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field18686[this.method11641(var1)];
   }

   private static int method11640(Direction var0) {
      return 1 << var0.method534();
   }

   public int method11641(Class7380 var1) {
      return this.field18688.computeIntIfAbsent(var1, var0 -> {
         int var3 = 0;
         if (var0.<Boolean>method23463(field18680)) {
            var3 |= method11640(Direction.NORTH);
         }

         if (var0.<Boolean>method23463(field18681)) {
            var3 |= method11640(Direction.EAST);
         }

         if (var0.<Boolean>method23463(field18682)) {
            var3 |= method11640(Direction.SOUTH);
         }

         if (var0.<Boolean>method23463(field18683)) {
            var3 |= method11640(Direction.WEST);
         }

         return var3;
      });
   }

   @Override
   public Class7379 method11498(Class7380 var1) {
      return !var1.<Boolean>method23463(field18684) ? super.method11498(var1) : Class9479.field44066.method25078(false);
   }

   @Override
   public boolean method11494(Class7380 var1, Class1665 var2, BlockPos var3, Class1947 var4) {
      return false;
   }

   @Override
   public Class7380 method11500(Class7380 var1, Class80 var2) {
      switch (Class8947.field40455[var2.ordinal()]) {
         case 1:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18682))
               .method23465(field18681, var1.<Boolean>method23463(field18683))
               .method23465(field18682, var1.<Boolean>method23463(field18680))
               .method23465(field18683, var1.<Boolean>method23463(field18681));
         case 2:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18681))
               .method23465(field18681, var1.<Boolean>method23463(field18682))
               .method23465(field18682, var1.<Boolean>method23463(field18683))
               .method23465(field18683, var1.<Boolean>method23463(field18680));
         case 3:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18683))
               .method23465(field18681, var1.<Boolean>method23463(field18680))
               .method23465(field18682, var1.<Boolean>method23463(field18681))
               .method23465(field18683, var1.<Boolean>method23463(field18682));
         default:
            return var1;
      }
   }

   @Override
   public Class7380 method11501(Class7380 var1, Class2089 var2) {
      switch (Class8947.field40456[var2.ordinal()]) {
         case 1:
            return var1.method23465(field18680, var1.<Boolean>method23463(field18682)).method23465(field18682, var1.<Boolean>method23463(field18680));
         case 2:
            return var1.method23465(field18681, var1.<Boolean>method23463(field18683)).method23465(field18683, var1.<Boolean>method23463(field18681));
         default:
            return super.method11501(var1, var2);
      }
   }
}
