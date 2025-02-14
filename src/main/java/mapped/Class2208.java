package mapped;

import net.minecraft.util.Util;
import net.minecraft.util.Direction;

public enum Class2208 {
   field14432(
      new Direction[]{Direction.WEST, Direction.EAST, Direction.NORTH, Direction.SOUTH},
      0.5F,
      true,
      new Class81[]{
         Class81.field201, Class81.field194, Class81.field201, Class81.field200, Class81.field195, Class81.field200, Class81.field195, Class81.field194
      },
      new Class81[]{
         Class81.field201, Class81.field193, Class81.field201, Class81.field199, Class81.field195, Class81.field199, Class81.field195, Class81.field193
      },
      new Class81[]{
         Class81.field202, Class81.field193, Class81.field202, Class81.field199, Class81.field196, Class81.field199, Class81.field196, Class81.field193
      },
      new Class81[]{
         Class81.field202, Class81.field194, Class81.field202, Class81.field200, Class81.field196, Class81.field200, Class81.field196, Class81.field194
      }
   ),
   field14433(
      new Direction[]{Direction.EAST, Direction.WEST, Direction.NORTH, Direction.SOUTH},
      1.0F,
      true,
      new Class81[]{
         Class81.field196, Class81.field194, Class81.field196, Class81.field200, Class81.field202, Class81.field200, Class81.field202, Class81.field194
      },
      new Class81[]{
         Class81.field196, Class81.field193, Class81.field196, Class81.field199, Class81.field202, Class81.field199, Class81.field202, Class81.field193
      },
      new Class81[]{
         Class81.field195, Class81.field193, Class81.field195, Class81.field199, Class81.field201, Class81.field199, Class81.field201, Class81.field193
      },
      new Class81[]{
         Class81.field195, Class81.field194, Class81.field195, Class81.field200, Class81.field201, Class81.field200, Class81.field201, Class81.field194
      }
   ),
   field14434(
      new Direction[]{Direction.UP, Direction.DOWN, Direction.EAST, Direction.WEST},
      0.8F,
      true,
      new Class81[]{
         Class81.field192, Class81.field201, Class81.field192, Class81.field195, Class81.field198, Class81.field195, Class81.field198, Class81.field201
      },
      new Class81[]{
         Class81.field192, Class81.field202, Class81.field192, Class81.field196, Class81.field198, Class81.field196, Class81.field198, Class81.field202
      },
      new Class81[]{
         Class81.field191, Class81.field202, Class81.field191, Class81.field196, Class81.field197, Class81.field196, Class81.field197, Class81.field202
      },
      new Class81[]{
         Class81.field191, Class81.field201, Class81.field191, Class81.field195, Class81.field197, Class81.field195, Class81.field197, Class81.field201
      }
   ),
   field14435(
      new Direction[]{Direction.WEST, Direction.EAST, Direction.DOWN, Direction.UP},
      0.8F,
      true,
      new Class81[]{
         Class81.field192, Class81.field201, Class81.field198, Class81.field201, Class81.field198, Class81.field195, Class81.field192, Class81.field195
      },
      new Class81[]{
         Class81.field191, Class81.field201, Class81.field197, Class81.field201, Class81.field197, Class81.field195, Class81.field191, Class81.field195
      },
      new Class81[]{
         Class81.field191, Class81.field202, Class81.field197, Class81.field202, Class81.field197, Class81.field196, Class81.field191, Class81.field196
      },
      new Class81[]{
         Class81.field192, Class81.field202, Class81.field198, Class81.field202, Class81.field198, Class81.field196, Class81.field192, Class81.field196
      }
   ),
   field14436(
      new Direction[]{Direction.UP, Direction.DOWN, Direction.NORTH, Direction.SOUTH},
      0.6F,
      true,
      new Class81[]{
         Class81.field192, Class81.field194, Class81.field192, Class81.field200, Class81.field198, Class81.field200, Class81.field198, Class81.field194
      },
      new Class81[]{
         Class81.field192, Class81.field193, Class81.field192, Class81.field199, Class81.field198, Class81.field199, Class81.field198, Class81.field193
      },
      new Class81[]{
         Class81.field191, Class81.field193, Class81.field191, Class81.field199, Class81.field197, Class81.field199, Class81.field197, Class81.field193
      },
      new Class81[]{
         Class81.field191, Class81.field194, Class81.field191, Class81.field200, Class81.field197, Class81.field200, Class81.field197, Class81.field194
      }
   ),
   field14437(
      new Direction[]{Direction.DOWN, Direction.UP, Direction.NORTH, Direction.SOUTH},
      0.6F,
      true,
      new Class81[]{
         Class81.field197, Class81.field194, Class81.field197, Class81.field200, Class81.field191, Class81.field200, Class81.field191, Class81.field194
      },
      new Class81[]{
         Class81.field197, Class81.field193, Class81.field197, Class81.field199, Class81.field191, Class81.field199, Class81.field191, Class81.field193
      },
      new Class81[]{
         Class81.field198, Class81.field193, Class81.field198, Class81.field199, Class81.field192, Class81.field199, Class81.field192, Class81.field193
      },
      new Class81[]{
         Class81.field198, Class81.field194, Class81.field198, Class81.field200, Class81.field192, Class81.field200, Class81.field192, Class81.field194
      }
   );

   private final Direction[] field14438;
   private final boolean field14439;
   private final Class81[] field14440;
   private final Class81[] field14441;
   private final Class81[] field14442;
   private final Class81[] field14443;
   private static final Class2208[] field14444 = Util.<Class2208[]>make(new Class2208[6], var0 -> {
      var0[Direction.DOWN.getIndex()] = field14432;
      var0[Direction.UP.getIndex()] = field14433;
      var0[Direction.NORTH.getIndex()] = field14434;
      var0[Direction.SOUTH.getIndex()] = field14435;
      var0[Direction.WEST.getIndex()] = field14436;
      var0[Direction.EAST.getIndex()] = field14437;
   });
   private static final Class2208[] field14445 = new Class2208[]{field14432, field14433, field14434, field14435, field14436, field14437};

   private Class2208(Direction[] var3, float var4, boolean var5, Class81[] var6, Class81[] var7, Class81[] var8, Class81[] var9) {
      this.field14438 = var3;
      this.field14439 = var5;
      this.field14440 = var6;
      this.field14441 = var7;
      this.field14442 = var8;
      this.field14443 = var9;
   }

   public static Class2208 method8926(Direction var0) {
      return field14444[var0.getIndex()];
   }

   // $VF: synthetic method
   public static Direction[] method8928(Class2208 var0) {
      return var0.field14438;
   }

   // $VF: synthetic method
   public static boolean method8929(Class2208 var0) {
      return var0.field14439;
   }

   // $VF: synthetic method
   public static Class81[] method8930(Class2208 var0) {
      return var0.field14440;
   }

   // $VF: synthetic method
   public static Class81[] method8931(Class2208 var0) {
      return var0.field14441;
   }

   // $VF: synthetic method
   public static Class81[] method8932(Class2208 var0) {
      return var0.field14442;
   }

   // $VF: synthetic method
   public static Class81[] method8933(Class2208 var0) {
      return var0.field14443;
   }
}
