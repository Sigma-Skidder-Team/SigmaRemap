package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3392 extends Block {
   private static String[] field19017;
   private static final Direction[] field19018 = Direction.values();
   public static final Class8551 field19019 = Class8820.field39716;
   public static final Class8551 field19020 = Class8820.field39717;
   public static final Class8551 field19021 = Class8820.field39718;
   public static final Class8551 field19022 = Class8820.field39719;
   public static final Class8551 field19023 = Class8820.field39714;
   public static final Class8551 field19024 = Class8820.field39715;
   public static final Map<Direction, Class8551> field19025 = Util.<Map<Direction, Class8551>>method38508(Maps.newEnumMap(Direction.class), var0 -> {
      var0.put(Direction.NORTH, field19019);
      var0.put(Direction.EAST, field19020);
      var0.put(Direction.SOUTH, field19021);
      var0.put(Direction.WEST, field19022);
      var0.put(Direction.field673, field19023);
      var0.put(Direction.field672, field19024);
   });
   public final Class6408[] field19026;

   public Class3392(float var1, Class7929 var2) {
      super(var2);
      this.field19026 = this.method12001(var1);
   }

   private Class6408[] method12001(float var1) {
      float var4 = 0.5F - var1;
      float var5 = 0.5F + var1;
      Class6408 var6 = Block.method11539(
         (double)(var4 * 16.0F), (double)(var4 * 16.0F), (double)(var4 * 16.0F), (double)(var5 * 16.0F), (double)(var5 * 16.0F), (double)(var5 * 16.0F)
      );
      Class6408[] var7 = new Class6408[field19018.length];

      for (int var8 = 0; var8 < field19018.length; var8++) {
         Direction var9 = field19018[var8];
         var7[var8] = Class8022.method27427(
            0.5 + Math.min((double)(-var1), (double)var9.method539() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var9.method540() * 0.5),
            0.5 + Math.min((double)(-var1), (double)var9.method541() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.method539() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.method540() * 0.5),
            0.5 + Math.max((double)var1, (double)var9.method541() * 0.5)
         );
      }

      Class6408[] var12 = new Class6408[64];

      for (int var13 = 0; var13 < 64; var13++) {
         Class6408 var10 = var6;

         for (int var11 = 0; var11 < field19018.length; var11++) {
            if ((var13 & 1 << var11) != 0) {
               var10 = Class8022.method27431(var10, var7[var11]);
            }
         }

         var12[var13] = var10;
      }

      return var12;
   }

   @Override
   public boolean method11493(Class7380 var1, Class1665 var2, BlockPos var3) {
      return false;
   }

   @Override
   public Class6408 method11483(Class7380 var1, Class1665 var2, BlockPos var3, Class4832 var4) {
      return this.field19026[this.method12002(var1)];
   }

   public int method12002(Class7380 var1) {
      int var4 = 0;

      for (int var5 = 0; var5 < field19018.length; var5++) {
         if (var1.<Boolean>method23463(field19025.get(field19018[var5]))) {
            var4 |= 1 << var5;
         }
      }

      return var4;
   }
}
