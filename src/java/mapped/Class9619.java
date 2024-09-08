package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Class9619 {
   private static Map[] field44959 = null;
   private static Map[] field44960 = null;
   private static Map[][] field44961 = (Map[][])null;
   private static Class7104[][] field44962 = (Class7104[][])null;
   private static Class7104[][] field44963 = (Class7104[][])null;
   private static boolean field44964 = false;
   public static final int field44965 = -1;
   public static final int field44966 = 0;
   public static final int field44967 = 1;
   public static final int field44968 = 2;
   public static final int field44969 = 3;
   public static final int field44970 = 4;
   public static final int field44971 = 5;
   private static final int field44972 = 0;
   private static final int field44973 = 1;
   private static final int field44974 = 2;
   public static final BlockState field44975 = Blocks.AIR.method11579();
   private static TextureAtlasSprite field44976 = null;
   public static ResourceLocation field44977 = Class8684.field39209;
   private static final Class2227[] field44978 = new Class2227[]{Class2227.field14571, Class2227.field14572, Class2227.field14569, Class2227.field14570};
   private static final Class2227[] field44979 = new Class2227[]{Class2227.field14571, Class2227.field14572, Class2227.field14570, Class2227.field14569};
   private static final Class2227[] field44980 = new Class2227[]{Class2227.field14572, Class2227.field14571, Class2227.field14567, Class2227.field14568};
   private static final Class2227[] field44981 = new Class2227[]{Class2227.field14571, Class2227.field14572, Class2227.field14567, Class2227.field14568};
   private static final Class2227[] field44982 = new Class2227[]{Class2227.field14569, Class2227.field14570, Class2227.field14567, Class2227.field14568};
   private static final Class2227[] field44983 = new Class2227[]{Class2227.field14570, Class2227.field14569, Class2227.field14567, Class2227.field14568};
   private static final Class2227[] field44984 = new Class2227[]{Class2227.field14574, Class2227.field14573, Class2227.field14576, Class2227.field14575};
   private static final Class2227[] field44985 = new Class2227[]{Class2227.field14576, Class2227.field14575, Class2227.field14574, Class2227.field14573};
   private static final Class2227[] field44986 = new Class2227[]{Class2227.field14581, Class2227.field14582, Class2227.field14583, Class2227.field14584};
   private static final Class2227[] field44987 = new Class2227[]{Class2227.field14582, Class2227.field14581, Class2227.field14584, Class2227.field14583};
   private static final Class2227[] field44988 = new Class2227[]{Class2227.field14578, Class2227.field14577, Class2227.field14580, Class2227.field14579};
   private static final Class2227[] field44989 = new Class2227[]{Class2227.field14577, Class2227.field14578, Class2227.field14579, Class2227.field14580};
   public static final TextureAtlasSprite field44990 = new TextureAtlasSprite(new ResourceLocation("default"));
   private static final Random field44991 = new Random(0L);

   public static Class8557[] method37442(Class1663 var0, BlockState var1, BlockPos var2, Class8557 var3, Class8391 var4) {
      TextureAtlasSprite var5 = var3.method30516();
      if (var5 == null) {
         return var4.method29429(var3);
      } else if (method37443(var0, var1, var2, var3, var4)) {
         var3 = method37445(field44976, var3);
         return var4.method29429(var3);
      } else {
         Direction var6 = var3.method30514();
         return method37449(var0, var1, var2, var6, var3, var4);
      }
   }

   private static boolean method37443(IBlockReader var0, BlockState var1, BlockPos var2, Class8557 var3, Class8391 var4) {
      Block var5 = var1.getBlock();
      if (var5 instanceof Class3237) {
         Direction var6 = var3.method30514();
         if (var6 != Direction.field673 && var6 != Direction.DOWN) {
            return false;
         }

         if (!var3.method30529()) {
            return false;
         }

         BlockPos var7 = var2.method8349(var3.method30514());
         BlockState var8 = var0.getBlockState(var7);
         if (var8.getBlock() != var5) {
            return false;
         }

         Block var9 = var8.getBlock();
         if (var5 instanceof Class3236 && var9 instanceof Class3236) {
            Class112 var10 = ((Class3236)var5).method11637();
            Class112 var11 = ((Class3236)var9).method11637();
            if (var10 != var11) {
               return false;
            }
         }

         double var14 = (double)var3.method30526();
         if (var14 < 0.4) {
            if (var8.<Boolean>method23463(Class3238.field18683)) {
               return true;
            }
         } else if (var14 > 0.6) {
            if (var8.<Boolean>method23463(Class3238.field18681)) {
               return true;
            }
         } else {
            double var12 = var3.method30528();
            if (var12 < 0.4) {
               if (var8.<Boolean>method23463(Class3238.field18680)) {
                  return true;
               }
            } else {
               if (!(var12 > 0.6)) {
                  return true;
               }

               if (var8.<Boolean>method23463(Class3238.field18682)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static Class8557[] method37444(TextureAtlasSprite var0, Class8557 var1, Class8391 var2) {
      if (var0 == null) {
         return null;
      } else if (var0 == field44990) {
         return var2.method29429(var1);
      } else {
         Class8557 var3 = method37445(var0, var1);
         return var2.method29429(var3);
      }
   }

   private static synchronized Class8557 method37445(TextureAtlasSprite var0, Class8557 var1) {
      if (field44959 == null) {
         return var1;
      } else {
         int var2 = var0.method7475();
         if (var2 >= 0 && var2 < field44959.length) {
            Map var3 = field44959[var2];
            if (var3 == null) {
               var3 = new IdentityHashMap(1);
               field44959[var2] = (Map)var3;
            }

            Class8557 var4 = (Class8557)var3.get(var1);
            if (var4 == null) {
               var4 = method37447(var1, var0);
               var3.put(var1, var4);
            }

            return var4;
         } else {
            return var1;
         }
      }
   }

   private static synchronized Class8557 method37446(TextureAtlasSprite var0, Class8557 var1, int var2) {
      if (field44960 == null) {
         return null;
      } else if (var0 == null) {
         return null;
      } else {
         int var3 = var0.method7475();
         if (var3 >= 0 && var3 < field44960.length) {
            Map var4 = field44960[var3];
            if (var4 == null) {
               var4 = new EnumMap(Direction.class);
               field44960[var3] = (Map)var4;
            }

            Direction var5 = var1.method30514();
            Class8557 var6 = (Class8557)var4.get(var5);
            if (var6 == null) {
               var6 = Class7832.method26233(var5, var0, var2);
               var4.put(var5, var6);
            }

            return var6;
         } else {
            return null;
         }
      }
   }

   private static Class8557 method37447(Class8557 var0, TextureAtlasSprite var1) {
      int[] var2 = (int[])var0.method30511().clone();
      TextureAtlasSprite var3 = var0.method30516();

      for (int var4 = 0; var4 < 4; var4++) {
         method37448(var2, var4, var3, var1);
      }

      return new Class8557(var2, var0.method30513(), var0.method30514(), var1, var0.method30515());
   }

   private static void method37448(int[] var0, int var1, TextureAtlasSprite var2, TextureAtlasSprite var3) {
      int var4 = var0.length / 4;
      int var5 = var4 * var1;
      float var6 = Float.intBitsToFloat(var0[var5 + 4]);
      float var7 = Float.intBitsToFloat(var0[var5 + 4 + 1]);
      double var8 = var2.method7482(var6);
      double var10 = var2.method7483(var7);
      var0[var5 + 4] = Float.floatToRawIntBits(var3.method7461(var8));
      var0[var5 + 4 + 1] = Float.floatToRawIntBits(var3.method7464(var10));
   }

   private static Class8557[] method37449(Class1663 var0, BlockState var1, BlockPos var2, Direction var3, Class8557 var4, Class8391 var5) {
      Class8557[] var6 = method37450(var0, var1, var2, var3, var4, true, 0, var5);
      if (!field44964) {
         return var6;
      } else if (var6.length == 1 && var6[0] == var4) {
         return var6;
      } else {
         List var7 = var5.method29433(var6);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            Class8557 var9 = (Class8557)var7.get(var8);
            Class8557 var10 = var9;

            for (int var11 = 0; var11 < 3; var11++) {
               Class8557[] var12 = method37450(var0, var1, var2, var3, var10, false, var11 + 1, var5);
               if (var12.length != 1 || var12[0] == var10) {
                  break;
               }

               var10 = var12[0];
            }

            var7.set(var8, var10);
         }

         for (int var13 = 0; var13 < var6.length; var13++) {
            var6[var13] = (Class8557)var7.get(var13);
         }

         return var6;
      }
   }

   public static Class8557[] method37450(Class1663 var0, BlockState var1, BlockPos var2, Direction var3, Class8557 var4, boolean var5, int var6, Class8391 var7) {
      Block var8 = var1.getBlock();
      TextureAtlasSprite var9 = var4.method30516();
      if (field44963 != null) {
         int var10 = var9.method7475();
         if (var10 >= 0 && var10 < field44963.length) {
            Class7104[] var11 = field44963[var10];
            if (var11 != null) {
               int var12 = method37451(var3);

               for (int var13 = 0; var13 < var11.length; var13++) {
                  Class7104 var14 = var11[var13];
                  if (var14 != null && var14.method22127(var1.method23490())) {
                     Class8557[] var15 = method37453(var14, var0, var1, var2, var12, var4, var6, var7);
                     if (var15 != null) {
                        return var15;
                     }
                  }
               }
            }
         }
      }

      if (field44962 != null && var5) {
         int var16 = var7.method29412();
         if (var16 >= 0 && var16 < field44962.length) {
            Class7104[] var17 = field44962[var16];
            if (var17 != null) {
               int var18 = method37451(var3);

               for (int var19 = 0; var19 < var17.length; var19++) {
                  Class7104 var20 = var17[var19];
                  if (var20 != null && var20.method22129(var9)) {
                     Class8557[] var21 = method37453(var20, var0, var1, var2, var18, var4, var6, var7);
                     if (var21 != null) {
                        return var21;
                     }
                  }
               }
            }
         }
      }

      return var7.method29429(var4);
   }

   public static int method37451(Direction var0) {
      if (var0 == null) {
         return -1;
      } else {
         switch (Class9621.field44997[var0.ordinal()]) {
            case 1:
               return 0;
            case 2:
               return 1;
            case 3:
               return 5;
            case 4:
               return 4;
            case 5:
               return 2;
            case 6:
               return 3;
            default:
               return -1;
         }
      }
   }

   private static Direction method37452(int var0) {
      switch (var0) {
         case 0:
            return Direction.DOWN;
         case 1:
            return Direction.field673;
         case 2:
            return Direction.NORTH;
         case 3:
            return Direction.SOUTH;
         case 4:
            return Direction.WEST;
         case 5:
            return Direction.EAST;
         default:
            return Direction.field673;
      }
   }

   private static Class8557[] method37453(Class7104 var0, Class1663 var1, BlockState var2, BlockPos var3, int var4, Class8557 var5, int var6, Class8391 var7) {
      int var8 = 0;
      int var9 = var2.method23491();
      Block var10 = var2.getBlock();
      if (var10 instanceof Class3386) {
         var8 = method37455(var2);
      }

      if (!var0.method22128(var2.method23490(), var9)) {
         return null;
      } else {
         if (var4 >= 0 && var0.field30557 != 63) {
            int var11 = var4;
            if (var8 != 0) {
               var11 = method37454(var4, var8);
            }

            if ((1 << var11 & var0.field30557) == 0) {
               return null;
            }
         }

         int var13 = var3.getY();
         if (var0.field30559 != null && !var0.field30559.method36838(var13)) {
            return null;
         } else {
            if (var0.field30558 != null) {
               Biome var12 = Class8708.method31415(var1, var3);
               if (!var0.method22130(var12)) {
                  return null;
               }
            }

            if (var0.field30569 != null) {
               String var14 = Class7599.method24888(var1, var3);
               if (!var0.field30569.method23084(var14)) {
                  return null;
               }
            }

            TextureAtlasSprite var15 = var5.method30516();
            switch (var0.field30554) {
               case 1:
                  return method37444(method37459(var0, var1, var2, var3, var8, var4, var15, var9, var7), var5, var7);
               case 2:
                  return method37444(method37477(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 3:
                  return method37444(method37481(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 4:
                  return method37444(method37456(var0, var1, var2, var3, var4), var5, var7);
               case 5:
                  return method37444(method37458(var0, var3, var4), var5, var7);
               case 6:
                  return method37444(method37478(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 7:
                  return method37444(method37457(var0), var5, var7);
               case 8:
                  return method37444(method37479(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 9:
                  return method37444(method37480(var0, var1, var2, var3, var8, var4, var15, var9), var5, var7);
               case 10:
                  if (var6 == 0) {
                     return method37460(var0, var1, var2, var3, var8, var4, var5, var9, var7);
                  }
               default:
                  return null;
               case 11:
                  return method37461(var0, var1, var2, var3, var8, var4, var5, var9, var7);
               case 12:
                  return method37462(var0, var5, var7);
               case 13:
                  return method37463(var0, var1, var2, var3, var4, var5, var7);
               case 14:
                  return method37464(var0, var3, var4, var5, var7);
               case 15:
                  return method37465(var0, var1, var2, var3, var8, var4, var5, var9, var7);
            }
         }
      }
   }

   private static int method37454(int var0, int var1) {
      switch (var1) {
         case 0:
            return var0;
         case 1:
            switch (var0) {
               case 0:
                  return 2;
               case 1:
                  return 3;
               case 2:
                  return 1;
               case 3:
                  return 0;
               default:
                  return var0;
            }
         case 2:
            switch (var0) {
               case 0:
                  return 4;
               case 1:
                  return 5;
               case 2:
               case 3:
               default:
                  return var0;
               case 4:
                  return 1;
               case 5:
                  return 0;
            }
         default:
            return var0;
      }
   }

   private static int method37455(BlockState var0) {
      Class113 var1 = var0.<Class113>method23463(Class3386.field18994);
      switch (Class9621.field44998[var1.ordinal()]) {
         case 1:
            return 2;
         case 2:
            return 1;
         default:
            return 0;
      }
   }

   private static TextureAtlasSprite method37456(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4) {
      if (var0.field30573.length == 1) {
         return var0.field30573[0];
      } else {
         int var5 = var4 / var0.field30567 * var0.field30567;
         if (var0.field30568) {
            BlockPos var6 = var3.down();

            for (BlockState var7 = var1.getBlockState(var6); var7.getBlock() == var2.getBlock(); var7 = var1.getBlockState(var6)) {
               var3 = var6;
               var6 = var6.down();
               if (var6.getY() < 0) {
                  break;
               }
            }
         }

         int var11 = Class7944.method26934(var3, var5) & 2147483647;

         for (int var12 = 0; var12 < var0.field30566; var12++) {
            var11 = Class7944.method26933(var11);
         }

         int var13 = 0;
         if (var0.field30565 == null) {
            var13 = var11 % var0.field30573.length;
         } else {
            int var8 = var11 % var0.field30571;
            int[] var9 = var0.field30570;

            for (int var10 = 0; var10 < var9.length; var10++) {
               if (var8 < var9[var10]) {
                  var13 = var10;
                  break;
               }
            }
         }

         return var0.field30573[var13];
      }
   }

   private static TextureAtlasSprite method37457(Class7104 var0) {
      return var0.field30573[0];
   }

   private static TextureAtlasSprite method37458(Class7104 var0, BlockPos var1, int var2) {
      if (var0.field30573.length == 1) {
         return var0.field30573[0];
      } else {
         int var3 = var1.getX();
         int var4 = var1.getY();
         int var5 = var1.getZ();
         int var6 = 0;
         int var7 = 0;
         switch (var2) {
            case 0:
               var6 = var3;
               var7 = -var5 - 1;
               break;
            case 1:
               var6 = var3;
               var7 = var5;
               break;
            case 2:
               var6 = -var3 - 1;
               var7 = -var4;
               break;
            case 3:
               var6 = var3;
               var7 = -var4;
               break;
            case 4:
               var6 = var5;
               var7 = -var4;
               break;
            case 5:
               var6 = -var5 - 1;
               var7 = -var4;
         }

         var6 %= var0.field30563;
         var7 %= var0.field30564;
         if (var6 < 0) {
            var6 += var0.field30563;
         }

         if (var7 < 0) {
            var7 += var0.field30564;
         }

         int var8 = var7 * var0.field30563 + var6;
         return var0.field30573[var8];
      }
   }

   private static TextureAtlasSprite method37459(
           Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7, Class8391 var8
   ) {
      int var9 = method37469(var0, var1, var2, var3, var4, var5, var6, var7, var8);
      return var0.field30573[var9];
   }

   private static synchronized Class8557[] method37460(
           Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, Class8557 var6, int var7, Class8391 var8
   ) {
      TextureAtlasSprite var9 = var6.method30516();
      int var10 = method37469(var0, var1, var2, var3, var4, var5, var9, var7, var8);
      return Class8503.method30093(var10, var0, var5, var6, var8);
   }

   private static Class8557[] method37461(
           Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, Class8557 var6, int var7, Class8391 var8
   ) {
      if (!var6.method30530()) {
         return null;
      } else {
         TextureAtlasSprite var9 = var6.method30516();
         Class2227[] var10 = method37466(var5, var4);
         boolean[] var11 = var8.method29422();

         for (int var12 = 0; var12 < 4; var12++) {
            var11[var12] = method37471(var0, var1, var2, var10[var12].method8965(var3), var5, var9, var7);
         }

         Class9585 var21 = var8.method29436(var0.field30579);

         Object var13;
         try {
            if (!var11[0] || !var11[1] || !var11[2] || !var11[3]) {
               if (var11[0] && var11[1] && var11[2]) {
                  var21.method37212(method37446(var0.field30573[5], var6, var0.field30577), var0.field30578);
                  return null;
               }

               if (var11[0] && var11[2] && var11[3]) {
                  var21.method37212(method37446(var0.field30573[6], var6, var0.field30577), var0.field30578);
                  return null;
               }

               if (var11[1] && var11[2] && var11[3]) {
                  var21.method37212(method37446(var0.field30573[12], var6, var0.field30577), var0.field30578);
                  return null;
               }

               if (var11[0] && var11[1] && var11[3]) {
                  var21.method37212(method37446(var0.field30573[13], var6, var0.field30577), var0.field30578);
                  return null;
               }

               Class2227[] var14 = method37467(var5, var4);
               boolean[] var15 = var8.method29423();

               for (int var16 = 0; var16 < 4; var16++) {
                  var15[var16] = method37471(var0, var1, var2, var14[var16].method8965(var3), var5, var9, var7);
               }

               if (var11[1] && var11[2]) {
                  var21.method37212(method37446(var0.field30573[3], var6, var0.field30577), var0.field30578);
                  if (var15[3]) {
                     var21.method37212(method37446(var0.field30573[16], var6, var0.field30577), var0.field30578);
                  }

                  return null;
               }

               if (var11[0] && var11[2]) {
                  var21.method37212(method37446(var0.field30573[4], var6, var0.field30577), var0.field30578);
                  if (var15[2]) {
                     var21.method37212(method37446(var0.field30573[14], var6, var0.field30577), var0.field30578);
                  }

                  return null;
               }

               if (var11[1] && var11[3]) {
                  var21.method37212(method37446(var0.field30573[10], var6, var0.field30577), var0.field30578);
                  if (var15[1]) {
                     var21.method37212(method37446(var0.field30573[2], var6, var0.field30577), var0.field30578);
                  }

                  return null;
               }

               if (var11[0] && var11[3]) {
                  var21.method37212(method37446(var0.field30573[11], var6, var0.field30577), var0.field30578);
                  if (var15[0]) {
                     var21.method37212(method37446(var0.field30573[0], var6, var0.field30577), var0.field30578);
                  }

                  return null;
               }

               boolean[] var26 = var8.method29424();

               for (int var17 = 0; var17 < 4; var17++) {
                  var26[var17] = method37473(var0, var1, var2, var10[var17].method8965(var3), var5, var9, var7);
               }

               if (var11[0]) {
                  var21.method37212(method37446(var0.field30573[9], var6, var0.field30577), var0.field30578);
               }

               if (var11[1]) {
                  var21.method37212(method37446(var0.field30573[7], var6, var0.field30577), var0.field30578);
               }

               if (var11[2]) {
                  var21.method37212(method37446(var0.field30573[1], var6, var0.field30577), var0.field30578);
               }

               if (var11[3]) {
                  var21.method37212(method37446(var0.field30573[15], var6, var0.field30577), var0.field30578);
               }

               if (var15[0] && (var26[1] || var26[2]) && !var11[1] && !var11[2]) {
                  var21.method37212(method37446(var0.field30573[0], var6, var0.field30577), var0.field30578);
               }

               if (var15[1] && (var26[0] || var26[2]) && !var11[0] && !var11[2]) {
                  var21.method37212(method37446(var0.field30573[2], var6, var0.field30577), var0.field30578);
               }

               if (var15[2] && (var26[1] || var26[3]) && !var11[1] && !var11[3]) {
                  var21.method37212(method37446(var0.field30573[14], var6, var0.field30577), var0.field30578);
               }

               if (var15[3] && (var26[0] || var26[3]) && !var11[0] && !var11[3]) {
                  var21.method37212(method37446(var0.field30573[16], var6, var0.field30577), var0.field30578);
               }

               return null;
            }

            var21.method37212(method37446(var0.field30573[8], var6, var0.field30577), var0.field30578);
            var13 = null;
         } finally {
            if (var21.method37213() > 0) {
               var8.method29438(true);
            }
         }

         return (Class8557[])var13;
      }
   }

   private static Class8557[] method37462(Class7104 var0, Class8557 var1, Class8391 var2) {
      if (!var1.method30530()) {
         return null;
      } else {
         Class9585 var3 = var2.method29436(var0.field30579);

         Object var4;
         try {
            TextureAtlasSprite var5 = method37457(var0);
            if (var5 != null) {
               var3.method37212(method37446(var5, var1, var0.field30577), var0.field30578);
            }

            var4 = null;
         } finally {
            if (var3.method37213() > 0) {
               var2.method29438(true);
            }
         }

         return (Class8557[])var4;
      }
   }

   private static Class8557[] method37463(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, Class8557 var5, Class8391 var6) {
      if (!var5.method30530()) {
         return null;
      } else {
         Class9585 var7 = var6.method29436(var0.field30579);

         Object var8;
         try {
            TextureAtlasSprite var9 = method37456(var0, var1, var2, var3, var4);
            if (var9 != null) {
               var7.method37212(method37446(var9, var5, var0.field30577), var0.field30578);
            }

            var8 = null;
         } finally {
            if (var7.method37213() > 0) {
               var6.method29438(true);
            }
         }

         return (Class8557[])var8;
      }
   }

   private static Class8557[] method37464(Class7104 var0, BlockPos var1, int var2, Class8557 var3, Class8391 var4) {
      if (!var3.method30530()) {
         return null;
      } else {
         Class9585 var5 = var4.method29436(var0.field30579);

         Object var6;
         try {
            TextureAtlasSprite var7 = method37458(var0, var1, var2);
            if (var7 != null) {
               var5.method37212(method37446(var7, var3, var0.field30577), var0.field30578);
            }

            var6 = null;
         } finally {
            if (var5.method37213() > 0) {
               var4.method29438(true);
            }
         }

         return (Class8557[])var6;
      }
   }

   private static Class8557[] method37465(
           Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, Class8557 var6, int var7, Class8391 var8
   ) {
      if (!var6.method30530()) {
         return null;
      } else {
         Class9585 var9 = var8.method29436(var0.field30579);

         Object var10;
         try {
            TextureAtlasSprite var11 = method37459(var0, var1, var2, var3, var4, var5, var6.method30516(), var7, var8);
            if (var11 != null) {
               var9.method37212(method37446(var11, var6, var0.field30577), var0.field30578);
            }

            var10 = null;
         } finally {
            if (var9.method37213() > 0) {
               var8.method29438(true);
            }
         }

         return (Class8557[])var10;
      }
   }

   private static Class2227[] method37466(int var0, int var1) {
      switch (var0) {
         case 0:
            return field44978;
         case 1:
            return field44979;
         case 2:
            return field44980;
         case 3:
            return field44981;
         case 4:
            return field44982;
         case 5:
            return field44983;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   private static Class2227[] method37467(int var0, int var1) {
      switch (var0) {
         case 0:
            return field44984;
         case 1:
            return field44985;
         case 2:
            return field44986;
         case 3:
            return field44987;
         case 4:
            return field44988;
         case 5:
            return field44989;
         default:
            throw new IllegalArgumentException("Unknown side: " + var0);
      }
   }

   public static Map[][] method37468() {
      return field44961;
   }

   private static int method37469(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7, Class8391 var8) {
      boolean[] var9 = var8.method29422();
      switch (var5) {
         case 0:
            var9[0] = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
            var9[1] = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
            var9[2] = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
            var9[3] = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            if (var0.field30561) {
               BlockPos var16 = var3.down();
               var9[0] = var9[0] && !method37474(var0, var1, var2, var16.west(), var5, var6, var7);
               var9[1] = var9[1] && !method37474(var0, var1, var2, var16.east(), var5, var6, var7);
               var9[2] = var9[2] && !method37474(var0, var1, var2, var16.north(), var5, var6, var7);
               var9[3] = var9[3] && !method37474(var0, var1, var2, var16.south(), var5, var6, var7);
            }
            break;
         case 1:
            var9[0] = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
            var9[1] = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
            var9[2] = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            var9[3] = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
            if (var0.field30561) {
               BlockPos var15 = var3.up();
               var9[0] = var9[0] && !method37474(var0, var1, var2, var15.west(), var5, var6, var7);
               var9[1] = var9[1] && !method37474(var0, var1, var2, var15.east(), var5, var6, var7);
               var9[2] = var9[2] && !method37474(var0, var1, var2, var15.south(), var5, var6, var7);
               var9[3] = var9[3] && !method37474(var0, var1, var2, var15.north(), var5, var6, var7);
            }
            break;
         case 2:
            var9[0] = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
            var9[1] = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
            var9[2] = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
            var9[3] = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            if (var0.field30561) {
               BlockPos var14 = var3.north();
               var9[0] = var9[0] && !method37474(var0, var1, var2, var14.east(), var5, var6, var7);
               var9[1] = var9[1] && !method37474(var0, var1, var2, var14.west(), var5, var6, var7);
               var9[2] = var9[2] && !method37474(var0, var1, var2, var14.down(), var5, var6, var7);
               var9[3] = var9[3] && !method37474(var0, var1, var2, var14.up(), var5, var6, var7);
            }
            break;
         case 3:
            var9[0] = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
            var9[1] = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
            var9[2] = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
            var9[3] = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            if (var0.field30561) {
               BlockPos var13 = var3.south();
               var9[0] = var9[0] && !method37474(var0, var1, var2, var13.west(), var5, var6, var7);
               var9[1] = var9[1] && !method37474(var0, var1, var2, var13.east(), var5, var6, var7);
               var9[2] = var9[2] && !method37474(var0, var1, var2, var13.down(), var5, var6, var7);
               var9[3] = var9[3] && !method37474(var0, var1, var2, var13.up(), var5, var6, var7);
            }
            break;
         case 4:
            var9[0] = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
            var9[1] = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            var9[2] = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
            var9[3] = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            if (var0.field30561) {
               BlockPos var12 = var3.west();
               var9[0] = var9[0] && !method37474(var0, var1, var2, var12.north(), var5, var6, var7);
               var9[1] = var9[1] && !method37474(var0, var1, var2, var12.south(), var5, var6, var7);
               var9[2] = var9[2] && !method37474(var0, var1, var2, var12.down(), var5, var6, var7);
               var9[3] = var9[3] && !method37474(var0, var1, var2, var12.up(), var5, var6, var7);
            }
            break;
         case 5:
            var9[0] = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            var9[1] = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
            var9[2] = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
            var9[3] = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            if (var0.field30561) {
               BlockPos var10 = var3.east();
               var9[0] = var9[0] && !method37474(var0, var1, var2, var10.south(), var5, var6, var7);
               var9[1] = var9[1] && !method37474(var0, var1, var2, var10.north(), var5, var6, var7);
               var9[2] = var9[2] && !method37474(var0, var1, var2, var10.down(), var5, var6, var7);
               var9[3] = var9[3] && !method37474(var0, var1, var2, var10.up(), var5, var6, var7);
            }
      }

      byte var17 = 0;
      if (var9[0] & !var9[1] & !var9[2] & !var9[3]) {
         var17 = 3;
      } else if (!var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var17 = 1;
      } else if (!var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var17 = 12;
      } else if (!var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var17 = 36;
      } else if (var9[0] & var9[1] & !var9[2] & !var9[3]) {
         var17 = 2;
      } else if (!var9[0] & !var9[1] & var9[2] & var9[3]) {
         var17 = 24;
      } else if (var9[0] & !var9[1] & var9[2] & !var9[3]) {
         var17 = 15;
      } else if (var9[0] & !var9[1] & !var9[2] & var9[3]) {
         var17 = 39;
      } else if (!var9[0] & var9[1] & var9[2] & !var9[3]) {
         var17 = 13;
      } else if (!var9[0] & var9[1] & !var9[2] & var9[3]) {
         var17 = 37;
      } else if (!var9[0] & var9[1] & var9[2] & var9[3]) {
         var17 = 25;
      } else if (var9[0] & !var9[1] & var9[2] & var9[3]) {
         var17 = 27;
      } else if (var9[0] & var9[1] & !var9[2] & var9[3]) {
         var17 = 38;
      } else if (var9[0] & var9[1] & var9[2] & !var9[3]) {
         var17 = 14;
      } else if (var9[0] & var9[1] & var9[2] & var9[3]) {
         var17 = 26;
      }

      if (var17 == 0) {
         return var17;
      } else if (!Class7944.method26918()) {
         return var17;
      } else {
         switch (var5) {
            case 0:
               var9[0] = !method37474(var0, var1, var2, var3.east().north(), var5, var6, var7);
               var9[1] = !method37474(var0, var1, var2, var3.west().north(), var5, var6, var7);
               var9[2] = !method37474(var0, var1, var2, var3.east().south(), var5, var6, var7);
               var9[3] = !method37474(var0, var1, var2, var3.west().south(), var5, var6, var7);
               if (var0.field30561) {
                  BlockPos var22 = var3.down();
                  var9[0] = var9[0] || method37474(var0, var1, var2, var22.east().north(), var5, var6, var7);
                  var9[1] = var9[1] || method37474(var0, var1, var2, var22.west().north(), var5, var6, var7);
                  var9[2] = var9[2] || method37474(var0, var1, var2, var22.east().south(), var5, var6, var7);
                  var9[3] = var9[3] || method37474(var0, var1, var2, var22.west().south(), var5, var6, var7);
               }
               break;
            case 1:
               var9[0] = !method37474(var0, var1, var2, var3.east().south(), var5, var6, var7);
               var9[1] = !method37474(var0, var1, var2, var3.west().south(), var5, var6, var7);
               var9[2] = !method37474(var0, var1, var2, var3.east().north(), var5, var6, var7);
               var9[3] = !method37474(var0, var1, var2, var3.west().north(), var5, var6, var7);
               if (var0.field30561) {
                  BlockPos var21 = var3.up();
                  var9[0] = var9[0] || method37474(var0, var1, var2, var21.east().south(), var5, var6, var7);
                  var9[1] = var9[1] || method37474(var0, var1, var2, var21.west().south(), var5, var6, var7);
                  var9[2] = var9[2] || method37474(var0, var1, var2, var21.east().north(), var5, var6, var7);
                  var9[3] = var9[3] || method37474(var0, var1, var2, var21.west().north(), var5, var6, var7);
               }
               break;
            case 2:
               var9[0] = !method37474(var0, var1, var2, var3.west().down(), var5, var6, var7);
               var9[1] = !method37474(var0, var1, var2, var3.east().down(), var5, var6, var7);
               var9[2] = !method37474(var0, var1, var2, var3.west().up(), var5, var6, var7);
               var9[3] = !method37474(var0, var1, var2, var3.east().up(), var5, var6, var7);
               if (var0.field30561) {
                  BlockPos var20 = var3.north();
                  var9[0] = var9[0] || method37474(var0, var1, var2, var20.west().down(), var5, var6, var7);
                  var9[1] = var9[1] || method37474(var0, var1, var2, var20.east().down(), var5, var6, var7);
                  var9[2] = var9[2] || method37474(var0, var1, var2, var20.west().up(), var5, var6, var7);
                  var9[3] = var9[3] || method37474(var0, var1, var2, var20.east().up(), var5, var6, var7);
               }
               break;
            case 3:
               var9[0] = !method37474(var0, var1, var2, var3.east().down(), var5, var6, var7);
               var9[1] = !method37474(var0, var1, var2, var3.west().down(), var5, var6, var7);
               var9[2] = !method37474(var0, var1, var2, var3.east().up(), var5, var6, var7);
               var9[3] = !method37474(var0, var1, var2, var3.west().up(), var5, var6, var7);
               if (var0.field30561) {
                  BlockPos var19 = var3.south();
                  var9[0] = var9[0] || method37474(var0, var1, var2, var19.east().down(), var5, var6, var7);
                  var9[1] = var9[1] || method37474(var0, var1, var2, var19.west().down(), var5, var6, var7);
                  var9[2] = var9[2] || method37474(var0, var1, var2, var19.east().up(), var5, var6, var7);
                  var9[3] = var9[3] || method37474(var0, var1, var2, var19.west().up(), var5, var6, var7);
               }
               break;
            case 4:
               var9[0] = !method37474(var0, var1, var2, var3.down().south(), var5, var6, var7);
               var9[1] = !method37474(var0, var1, var2, var3.down().north(), var5, var6, var7);
               var9[2] = !method37474(var0, var1, var2, var3.up().south(), var5, var6, var7);
               var9[3] = !method37474(var0, var1, var2, var3.up().north(), var5, var6, var7);
               if (var0.field30561) {
                  BlockPos var18 = var3.west();
                  var9[0] = var9[0] || method37474(var0, var1, var2, var18.down().south(), var5, var6, var7);
                  var9[1] = var9[1] || method37474(var0, var1, var2, var18.down().north(), var5, var6, var7);
                  var9[2] = var9[2] || method37474(var0, var1, var2, var18.up().south(), var5, var6, var7);
                  var9[3] = var9[3] || method37474(var0, var1, var2, var18.up().north(), var5, var6, var7);
               }
               break;
            case 5:
               var9[0] = !method37474(var0, var1, var2, var3.down().north(), var5, var6, var7);
               var9[1] = !method37474(var0, var1, var2, var3.down().south(), var5, var6, var7);
               var9[2] = !method37474(var0, var1, var2, var3.up().north(), var5, var6, var7);
               var9[3] = !method37474(var0, var1, var2, var3.up().south(), var5, var6, var7);
               if (var0.field30561) {
                  BlockPos var11 = var3.east();
                  var9[0] = var9[0] || method37474(var0, var1, var2, var11.down().north(), var5, var6, var7);
                  var9[1] = var9[1] || method37474(var0, var1, var2, var11.down().south(), var5, var6, var7);
                  var9[2] = var9[2] || method37474(var0, var1, var2, var11.up().north(), var5, var6, var7);
                  var9[3] = var9[3] || method37474(var0, var1, var2, var11.up().south(), var5, var6, var7);
               }
         }

         if (var17 == 13 && var9[0]) {
            var17 = 4;
         } else if (var17 == 15 && var9[1]) {
            var17 = 5;
         } else if (var17 == 37 && var9[2]) {
            var17 = 16;
         } else if (var17 == 39 && var9[3]) {
            var17 = 17;
         } else if (var17 == 14 && var9[0] && var9[1]) {
            var17 = 7;
         } else if (var17 == 25 && var9[0] && var9[2]) {
            var17 = 6;
         } else if (var17 == 27 && var9[3] && var9[1]) {
            var17 = 19;
         } else if (var17 == 38 && var9[3] && var9[2]) {
            var17 = 18;
         } else if (var17 == 14 && !var9[0] && var9[1]) {
            var17 = 31;
         } else if (var17 == 25 && var9[0] && !var9[2]) {
            var17 = 30;
         } else if (var17 == 27 && !var9[3] && var9[1]) {
            var17 = 41;
         } else if (var17 == 38 && var9[3] && !var9[2]) {
            var17 = 40;
         } else if (var17 == 14 && var9[0] && !var9[1]) {
            var17 = 29;
         } else if (var17 == 25 && !var9[0] && var9[2]) {
            var17 = 28;
         } else if (var17 == 27 && var9[3] && !var9[1]) {
            var17 = 43;
         } else if (var17 == 38 && !var9[3] && var9[2]) {
            var17 = 42;
         } else if (var17 == 26 && var9[0] && var9[1] && var9[2] && var9[3]) {
            var17 = 46;
         } else if (var17 == 26 && !var9[0] && var9[1] && var9[2] && var9[3]) {
            var17 = 9;
         } else if (var17 == 26 && var9[0] && !var9[1] && var9[2] && var9[3]) {
            var17 = 21;
         } else if (var17 == 26 && var9[0] && var9[1] && !var9[2] && var9[3]) {
            var17 = 8;
         } else if (var17 == 26 && var9[0] && var9[1] && var9[2] && !var9[3]) {
            var17 = 20;
         } else if (var17 == 26 && var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var17 = 11;
         } else if (var17 == 26 && !var9[0] && !var9[1] && var9[2] && var9[3]) {
            var17 = 22;
         } else if (var17 == 26 && !var9[0] && var9[1] && !var9[2] && var9[3]) {
            var17 = 23;
         } else if (var17 == 26 && var9[0] && !var9[1] && var9[2] && !var9[3]) {
            var17 = 10;
         } else if (var17 == 26 && var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var17 = 34;
         } else if (var17 == 26 && !var9[0] && var9[1] && var9[2] && !var9[3]) {
            var17 = 35;
         } else if (var17 == 26 && var9[0] && !var9[1] && !var9[2] && !var9[3]) {
            var17 = 32;
         } else if (var17 == 26 && !var9[0] && var9[1] && !var9[2] && !var9[3]) {
            var17 = 33;
         } else if (var17 == 26 && !var9[0] && !var9[1] && var9[2] && !var9[3]) {
            var17 = 44;
         } else if (var17 == 26 && !var9[0] && !var9[1] && !var9[2] && var9[3]) {
            var17 = 45;
         }

         return var17;
      }
   }

   private static void method37470(int var0, int var1, boolean[] var2) {
      boolean var3 = var2[var0];
      var2[var0] = var2[var1];
      var2[var1] = var3;
   }

   private static boolean method37471(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, TextureAtlasSprite var5, int var6) {
      BlockState var7 = var1.getBlockState(var3);
      if (!method37472(var7, var1, var3)) {
         return false;
      } else if (var0.field30574 != null && !Class7542.method24658(var7.method23490(), var7.method23491(), var0.field30574)) {
         return false;
      } else {
         if (var0.field30576 != null) {
            TextureAtlasSprite var8 = method37476(var1, var2, var3, var7, var4);
            if (!Class7944.method26945(var8, var0.field30576)) {
               return false;
            }
         }

         BlockPos var10 = var3.method8349(method37452(var4));
         BlockState var9 = var1.getBlockState(var10);
         if (var9.method23409(var1, var10)) {
            return false;
         } else {
            return var4 == 1 && var9.getBlock() == Blocks.SNOW ? false : !method37475(var0, var1, var2, var3, var7, var4, var5, var6);
         }
      }
   }

   private static boolean method37472(BlockState var0, IBlockReader var1, BlockPos var2) {
      if (Class9716.method38071(var0, var1, var2)) {
         return true;
      } else {
         Block var3 = var0.getBlock();
         return var3 instanceof Class3233 ? true : var3 instanceof Class3234;
      }
   }

   private static boolean method37473(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, TextureAtlasSprite var5, int var6) {
      BlockState var7 = var1.getBlockState(var3);
      if (var7 == field44975) {
         return false;
      } else if (var0.field30551 != null && !var0.method22128(var7.method23490(), var7.method23491())) {
         return false;
      } else {
         if (var0.field30572 != null) {
            TextureAtlasSprite var8 = method37476(var1, var2, var3, var7, var4);
            if (var8 != var5) {
               return false;
            }
         }

         BlockPos var10 = var3.method8349(method37452(var4));
         BlockState var9 = var1.getBlockState(var10);
         return var9.method23409(var1, var10) ? false : var4 != 1 || var9.getBlock() != Blocks.SNOW;
      }
   }

   private static boolean method37474(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, TextureAtlasSprite var5, int var6) {
      BlockState var7 = var1.getBlockState(var3);
      return method37475(var0, var1, var2, var3, var7, var4, var5, var6);
   }

   private static boolean method37475(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, BlockState var4, int var5, TextureAtlasSprite var6, int var7) {
      if (var2 == var4) {
         return true;
      } else if (var0.field30556 == 2) {
         if (var4 == null) {
            return false;
         } else if (var4 == field44975) {
            return false;
         } else {
            TextureAtlasSprite var10 = method37476(var1, var2, var3, var4, var5);
            return var10 == var6;
         }
      } else if (var0.field30556 == 3) {
         if (var4 == null) {
            return false;
         } else {
            return var4 == field44975 ? false : var4.method23384() == var2.method23384();
         }
      } else if (var0.field30556 == 1) {
         Block var8 = var2.getBlock();
         Block var9 = var4.getBlock();
         return var9 == var8;
      } else {
         return false;
      }
   }

   private static TextureAtlasSprite method37476(IBlockReader var0, BlockState var1, BlockPos var2, BlockState var3, int var4) {
      IBakedModel var5 = Minecraft.getInstance().getBlockRendererDispatcher().getBlockModelShapes().method38153(var3);
      if (var5 == null) {
         return null;
      } else {
         Direction var6 = method37452(var4);
         List var7 = var5.method22619(var3, var6, field44991);
         if (var7 == null) {
            return null;
         } else {
            if (Class7944.method26876()) {
               var7 = Class9422.method36148(var0, var3, var2, var6, var7);
            }

            if (var7.size() > 0) {
               Class8557 var11 = (Class8557)var7.get(0);
               return var11.method30516();
            } else {
               List var8 = var5.method22619(var3, (Direction)null, field44991);
               if (var8 == null) {
                  return null;
               } else {
                  for (int var9 = 0; var9 < var8.size(); var9++) {
                     Class8557 var10 = (Class8557)var8.get(var9);
                     if (var10.method30514() == var6) {
                        return var10.method30516();
                     }
                  }

                  return null;
               }
            }
         }
      }
   }

   private static TextureAtlasSprite method37477(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7) {
      boolean var8;
      boolean var9;
      var8 = false;
      var9 = false;
      label46:
      switch (var4) {
         case 0:
            switch (var5) {
               case 0:
                  var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
               default:
                  break label46;
            }
         case 1:
            switch (var5) {
               case 0:
                  var8 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  break label46;
               case 1:
                  var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  break label46;
               case 2:
                  var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  break label46;
               case 3:
                  var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
                  break label46;
               case 4:
                  var8 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
                  break label46;
               case 5:
                  var8 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
               default:
                  break label46;
            }
         case 2:
            switch (var5) {
               case 0:
                  var8 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
                  break;
               case 1:
                  var8 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
                  break;
               case 2:
                  var8 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
                  break;
               case 3:
                  var8 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
                  break;
               case 4:
                  var8 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
                  break;
               case 5:
                  var8 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
                  var9 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            }
      }

      byte var10 = 3;
      if (var8) {
         if (var9) {
            var10 = 1;
         } else {
            var10 = 2;
         }
      } else if (var9) {
         var10 = 0;
      } else {
         var10 = 3;
      }

      return var0.field30573[var10];
   }

   private static TextureAtlasSprite method37478(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7) {
      boolean var8 = false;
      boolean var9 = false;
      switch (var4) {
         case 0:
            if (var5 == 1) {
               var8 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
            } else if (var5 == 0) {
               var8 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            } else {
               var8 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            }
            break;
         case 1:
            if (var5 == 3) {
               var8 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            } else if (var5 == 2) {
               var8 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
            } else {
               var8 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.north(), var5, var6, var7);
            }
            break;
         case 2:
            if (var5 == 5) {
               var8 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
            } else if (var5 == 4) {
               var8 = method37474(var0, var1, var2, var3.down(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            } else {
               var8 = method37474(var0, var1, var2, var3.west(), var5, var6, var7);
               var9 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
            }
      }

      byte var10 = 3;
      if (var8) {
         if (var9) {
            var10 = 1;
         } else {
            var10 = 2;
         }
      } else if (var9) {
         var10 = 0;
      } else {
         var10 = 3;
      }

      return var0.field30573[var10];
   }

   private static TextureAtlasSprite method37479(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7) {
      TextureAtlasSprite[] var8 = var0.field30573;
      TextureAtlasSprite var9 = method37477(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         TextureAtlasSprite var10 = method37478(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }

   private static TextureAtlasSprite method37480(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7) {
      TextureAtlasSprite[] var8 = var0.field30573;
      TextureAtlasSprite var9 = method37478(var0, var1, var2, var3, var4, var5, var6, var7);
      if (var9 != null && var9 != var6 && var9 != var8[3]) {
         return var9;
      } else {
         TextureAtlasSprite var10 = method37477(var0, var1, var2, var3, var4, var5, var6, var7);
         if (var10 == var8[0]) {
            return var8[4];
         } else if (var10 == var8[1]) {
            return var8[5];
         } else {
            return var10 == var8[2] ? var8[6] : var10;
         }
      }
   }

   private static TextureAtlasSprite method37481(Class7104 var0, IBlockReader var1, BlockState var2, BlockPos var3, int var4, int var5, TextureAtlasSprite var6, int var7) {
      boolean var8 = false;
      switch (var4) {
         case 0:
            if (var5 == 1 || var5 == 0) {
               return null;
            }

            var8 = method37474(var0, var1, var2, var3.up(), var5, var6, var7);
            break;
         case 1:
            if (var5 == 3 || var5 == 2) {
               return null;
            }

            var8 = method37474(var0, var1, var2, var3.south(), var5, var6, var7);
            break;
         case 2:
            if (var5 == 5 || var5 == 4) {
               return null;
            }

            var8 = method37474(var0, var1, var2, var3.east(), var5, var6, var7);
      }

      return var8 ? var0.field30573[0] : null;
   }

   public static void method37482(AtlasTexture var0) {
      field44962 = (Class7104[][])null;
      field44963 = (Class7104[][])null;
      field44959 = null;
      field44961 = (Map[][])null;
      if (Class7944.method26915()) {
         IResourcePack[] var1 = Class7944.method26869();

         for (int var2 = var1.length - 1; var2 >= 0; var2--) {
            IResourcePack var3 = var1[var2];
            method37483(var0, var3);
         }

         method37483(var0, Class7944.method26871());
         field44976 = var0.method1119(field44977);
         field44959 = new Map[var0.method1109() + 1];
         field44960 = new Map[var0.method1109() + 1];
         field44961 = new Map[var0.method1109() + 1][];
         if (field44962.length <= 0) {
            field44962 = (Class7104[][])null;
         }

         if (field44963.length <= 0) {
            field44963 = (Class7104[][])null;
         }
      }
   }

   public static void method37483(AtlasTexture var0, IResourcePack var1) {
      String[] var2 = Class9772.method38438(var1, "optifine/ctm/", ".properties", method37493());
      Arrays.sort(var2);
      List var3 = method37487(field44963);
      List var4 = method37487(field44962);

      for (int var5 = 0; var5 < var2.length; var5++) {
         String var6 = var2[var5];
         Class7944.method26810("ConnectedTextures: " + var6);

         try {
            ResourceLocation var7 = new ResourceLocation(var6);
            InputStream var8 = var1.getResourceStream(ResourcePackType.CLIENT_RESOURCES, var7);
            if (var8 == null) {
               Class7944.method26811("ConnectedTextures file not found: " + var6);
            } else {
               Class20 var9 = new Class20();
               var9.load(var8);
               var8.close();
               Class7104 var10 = new Class7104(var9, var6);
               if (var10.method22101(var6)) {
                  var10.method22122(var0);
                  method37490(var10, var3);
                  method37491(var10, var4);
               }
            }
         } catch (FileNotFoundException var11) {
            Class7944.method26811("ConnectedTextures file not found: " + var6);
         } catch (Exception var12) {
            var12.printStackTrace();
         }
      }

      field44962 = method37489(var4);
      field44963 = method37489(var3);
      field44964 = method37488();
      Class7944.method26810("Multipass connected textures: " + field44964);
   }

   public static void method37484(AtlasTexture var0) {
      method37486(field44962, var0);
      method37486(field44963, var0);
      field44976 = method37485(var0, field44977);
   }

   private static TextureAtlasSprite method37485(AtlasTexture var0, ResourceLocation var1) {
      TextureAtlasSprite var2 = var0.getSprite(var1);
      if (var2 == null || var2 instanceof Class1714) {
         Class7944.method26811("Missing CTM sprite: " + var1);
      }

      return var2;
   }

   private static void method37486(Class7104[][] var0, AtlasTexture var1) {
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            Class7104[] var3 = var0[var2];
            if (var3 != null) {
               for (int var4 = 0; var4 < var3.length; var4++) {
                  Class7104 var5 = var3[var4];
                  if (var5 != null) {
                     var5.method22123(var1);
                  }
               }
            }
         }
      }
   }

   private static List<Class7104> method37487(Class7104[][] var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null) {
         for (int var2 = 0; var2 < var0.length; var2++) {
            Class7104[] var3 = var0[var2];
            ArrayList<Class7104> var4 = null;
            if (var3 != null) {
               var4 = new ArrayList<Class7104>(Arrays.asList(var3));
            }

            var1.add(var4);
         }
      }

      return var1;
   }

   private static boolean method37488() {
      ArrayList<Class7104> var0 = new ArrayList();

      for (int var1 = 0; var1 < field44963.length; var1++) {
         Class7104[] var2 = field44963[var1];
         if (var2 != null) {
            var0.addAll(Arrays.asList(var2));
         }
      }

      for (int var6 = 0; var6 < field44962.length; var6++) {
         Class7104[] var8 = field44962[var6];
         if (var8 != null) {
            var0.addAll(Arrays.asList(var8));
         }
      }

      Class7104[] var7 = var0.toArray(new Class7104[var0.size()]);
      HashSet var9 = new HashSet();
      HashSet var3 = new HashSet();

      for (int var4 = 0; var4 < var7.length; var4++) {
         Class7104 var5 = var7[var4];
         if (var5.field30572 != null) {
            var9.addAll(Arrays.asList(var5.field30572));
         }

         if (var5.field30573 != null) {
            var3.addAll(Arrays.asList(var5.field30573));
         }
      }

      var9.retainAll(var3);
      return !var9.isEmpty();
   }

   private static Class7104[][] method37489(List var0) {
      Class7104[][] var1 = new Class7104[var0.size()][];

      for (int var2 = 0; var2 < var0.size(); var2++) {
         List<Class7104> var3 = (List)var0.get(var2);
         if (var3 != null) {
            Class7104[] var4 = var3.toArray(new Class7104[var3.size()]);
            var1[var2] = var4;
         }
      }

      return var1;
   }

   private static void method37490(Class7104 var0, List var1) {
      if (var0.field30572 != null) {
         for (int var2 = 0; var2 < var0.field30572.length; var2++) {
            TextureAtlasSprite var3 = var0.field30572[var2];
            if (!(var3 instanceof TextureAtlasSprite)) {
               Class7944.method26811("TextureAtlasSprite is not TextureAtlasSprite: " + var3 + ", name: " + var3.method7465());
            } else {
               int var4 = var3.method7475();
               if (var4 < 0) {
                  Class7944.method26811("Invalid tile ID: " + var4 + ", icon: " + var3.method7465());
               } else {
                  method37492(var0, var1, var4);
               }
            }
         }
      }
   }

   private static void method37491(Class7104 var0, List var1) {
      if (var0.field30551 != null) {
         for (int var2 = 0; var2 < var0.field30551.length; var2++) {
            int var3 = var0.field30551[var2].method38103();
            if (var3 < 0) {
               Class7944.method26811("Invalid block ID: " + var3);
            } else {
               method37492(var0, var1, var3);
            }
         }
      }
   }

   private static void method37492(Class7104 var0, List var1, int var2) {
      while (var2 >= var1.size()) {
         var1.add(null);
      }

      List<Class7104> var3 = (List)var1.get(var2);
      if (var3 == null) {
         var3 = new ArrayList();
         var1.set(var2, var3);
      }

      var3.add(var0);
   }

   private static String[] method37493() {
      ArrayList<String> var0 = new ArrayList();
      method37494(var0, "textures/block/glass.png", "20_glass/glass.properties");
      method37494(var0, "textures/block/glass.png", "20_glass/glass_pane.properties");
      method37494(var0, "textures/block/bookshelf.png", "30_bookshelf/bookshelf.properties");
      method37494(var0, "textures/block/sandstone.png", "40_sandstone/sandstone.properties");
      method37494(var0, "textures/block/red_sandstone.png", "41_red_sandstone/red_sandstone.properties");
      String[] var1 = new String[]{
         "white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "light_gray", "cyan", "purple", "blue", "brown", "green", "red", "black"
      };

      for (int var2 = 0; var2 < var1.length; var2++) {
         String var3 = var1[var2];
         String var4 = Class9402.method35758("" + var2, 2, '0');
         method37494(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_" + var3 + ".properties");
         method37494(var0, "textures/block/" + var3 + "_stained_glass.png", var4 + "_glass_" + var3 + "/glass_pane_" + var3 + ".properties");
      }

      return var0.toArray(new String[var0.size()]);
   }

   private static void method37494(List var0, String var1, String var2) {
      String var3 = "optifine/ctm/default/";
      ResourceLocation var4 = new ResourceLocation(var1);
      IResourcePack var5 = Class7944.method26873(var4);
      if (var5 != null) {
         if (var5.method1228().equals("Programmer Art")) {
            String var6 = var3 + "programmer_art/";
            var0.add(var6 + var2);
         } else if (var5 == Class7944.method26871()) {
            var0.add(var3 + var2);
         }
      }
   }
}
