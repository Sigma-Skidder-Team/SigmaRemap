package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.annotation.Nullable;

public class Class9467 {
   private static String[] field43993;
   private final Random field43994;
   private final Class8390 field43995;
   private final Class8390 field43996;
   private final Class8390[] field43997;
   private final int field43998;
   private final int field43999;

   public Class9467(Random var1) {
      this.field43994 = var1;
      byte var4 = 11;
      this.field43998 = 7;
      this.field43999 = 4;
      this.field43995 = new Class8390(11, 11, 5);
      this.field43995.method29405(this.field43998, this.field43999, this.field43998 + 1, this.field43999 + 1, 3);
      this.field43995.method29405(this.field43998 - 1, this.field43999, this.field43998 - 1, this.field43999 + 1, 2);
      this.field43995.method29405(this.field43998 + 2, this.field43999 - 2, this.field43998 + 3, this.field43999 + 3, 5);
      this.field43995.method29405(this.field43998 + 1, this.field43999 - 2, this.field43998 + 1, this.field43999 - 1, 1);
      this.field43995.method29405(this.field43998 + 1, this.field43999 + 2, this.field43998 + 1, this.field43999 + 3, 1);
      this.field43995.method29404(this.field43998 - 1, this.field43999 - 1, 1);
      this.field43995.method29404(this.field43998 - 1, this.field43999 + 2, 1);
      this.field43995.method29405(0, 0, 11, 1, 5);
      this.field43995.method29405(0, 9, 11, 11, 5);
      this.method36501(this.field43995, this.field43998, this.field43999 - 2, Direction.WEST, 6);
      this.method36501(this.field43995, this.field43998, this.field43999 + 3, Direction.WEST, 6);
      this.method36501(this.field43995, this.field43998 - 2, this.field43999 - 1, Direction.WEST, 3);
      this.method36501(this.field43995, this.field43998 - 2, this.field43999 + 2, Direction.WEST, 3);

      while (this.method36502(this.field43995)) {
      }

      this.field43997 = new Class8390[3];
      this.field43997[0] = new Class8390(11, 11, 5);
      this.field43997[1] = new Class8390(11, 11, 5);
      this.field43997[2] = new Class8390(11, 11, 5);
      this.method36504(this.field43995, this.field43997[0]);
      this.method36504(this.field43995, this.field43997[1]);
      this.field43997[0].method29405(this.field43998 + 1, this.field43999, this.field43998 + 1, this.field43999 + 1, 8388608);
      this.field43997[1].method29405(this.field43998 + 1, this.field43999, this.field43998 + 1, this.field43999 + 1, 8388608);
      this.field43996 = new Class8390(Class8390.method29409(this.field43995), Class8390.method29410(this.field43995), 5);
      this.method36503();
      this.method36504(this.field43996, this.field43997[2]);
   }

   public static boolean method36498(Class8390 var0, int var1, int var2) {
      int var5 = var0.method29406(var1, var2);
      return var5 == 1 || var5 == 2 || var5 == 3 || var5 == 4;
   }

   public boolean method36499(Class8390 var1, int var2, int var3, int var4, int var5) {
      return (this.field43997[var4].method29406(var2, var3) & 65535) == var5;
   }

   @Nullable
   public Direction method36500(Class8390 var1, int var2, int var3, int var4, int var5) {
      for (Direction var9 : Class76.field161) {
         if (this.method36499(var1, var2 + var9.method539(), var3 + var9.method541(), var4, var5)) {
            return var9;
         }
      }

      return null;
   }

   private void method36501(Class8390 var1, int var2, int var3, Direction var4, int var5) {
      if (var5 > 0) {
         var1.method29404(var2, var3, 1);
         var1.method29407(var2 + var4.method539(), var3 + var4.method541(), 0, 1);

         for (int var8 = 0; var8 < 8; var8++) {
            Direction var9 = Direction.method547(this.field43994.nextInt(4));
            if (var9 != var4.method536() && (var9 != Direction.EAST || !this.field43994.nextBoolean())) {
               int var10 = var2 + var4.method539();
               int var11 = var3 + var4.method541();
               if (var1.method29406(var10 + var9.method539(), var11 + var9.method541()) == 0
                  && var1.method29406(var10 + var9.method539() * 2, var11 + var9.method541() * 2) == 0) {
                  this.method36501(var1, var2 + var4.method539() + var9.method539(), var3 + var4.method541() + var9.method541(), var9, var5 - 1);
                  break;
               }
            }
         }

         Direction var12 = var4.method537();
         Direction var13 = var4.method538();
         var1.method29407(var2 + var12.method539(), var3 + var12.method541(), 0, 2);
         var1.method29407(var2 + var13.method539(), var3 + var13.method541(), 0, 2);
         var1.method29407(var2 + var4.method539() + var12.method539(), var3 + var4.method541() + var12.method541(), 0, 2);
         var1.method29407(var2 + var4.method539() + var13.method539(), var3 + var4.method541() + var13.method541(), 0, 2);
         var1.method29407(var2 + var4.method539() * 2, var3 + var4.method541() * 2, 0, 2);
         var1.method29407(var2 + var12.method539() * 2, var3 + var12.method541() * 2, 0, 2);
         var1.method29407(var2 + var13.method539() * 2, var3 + var13.method541() * 2, 0, 2);
      }
   }

   private boolean method36502(Class8390 var1) {
      boolean var4 = false;

      for (int var5 = 0; var5 < Class8390.method29410(var1); var5++) {
         for (int var6 = 0; var6 < Class8390.method29409(var1); var6++) {
            if (var1.method29406(var6, var5) == 0) {
               int var7 = 0;
               var7 += !method36498(var1, var6 + 1, var5) ? 0 : 1;
               var7 += !method36498(var1, var6 - 1, var5) ? 0 : 1;
               var7 += !method36498(var1, var6, var5 + 1) ? 0 : 1;
               var7 += !method36498(var1, var6, var5 - 1) ? 0 : 1;
               if (var7 < 3) {
                  if (var7 == 2) {
                     int var8 = 0;
                     var8 += !method36498(var1, var6 + 1, var5 + 1) ? 0 : 1;
                     var8 += !method36498(var1, var6 - 1, var5 + 1) ? 0 : 1;
                     var8 += !method36498(var1, var6 + 1, var5 - 1) ? 0 : 1;
                     var8 += !method36498(var1, var6 - 1, var5 - 1) ? 0 : 1;
                     if (var8 <= 1) {
                        var1.method29404(var6, var5, 2);
                        var4 = true;
                     }
                  }
               } else {
                  var1.method29404(var6, var5, 2);
                  var4 = true;
               }
            }
         }
      }

      return var4;
   }

   // $VF: Could not properly define all variable types!
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method36503() {
      ArrayList var3 = Lists.newArrayList();
      Class8390 var4 = this.field43997[1];

      for (int var5 = 0; var5 < Class8390.method29410(this.field43996); var5++) {
         for (int var6 = 0; var6 < Class8390.method29409(this.field43996); var6++) {
            int var7 = var4.method29406(var6, var5);
            int l = var7 & 983040;
            if (l == 131072 && (var7 & 2097152) == 2097152) {
               var3.add(new Class6793<>(var6, var5));
            }
         }
      }

      if (!var3.isEmpty()) {
         Class6793 var13 = (Class6793)var3.get(this.field43994.nextInt(var3.size()));
         int var14 = var4.method29406((Integer)var13.method20692(), (Integer)var13.method20693());
         var4.method29404((Integer)var13.method20692(), (Integer)var13.method20693(), var14 | 4194304);
         Direction var15 = this.method36500(this.field43995, (Integer)var13.method20692(), (Integer)var13.method20693(), 1, var14 & 65535);
         int var16 = (Integer)var13.method20692() + var15.method539();
         int var9 = (Integer)var13.method20693() + var15.method541();

         for (int var10 = 0; var10 < Class8390.method29410(this.field43996); var10++) {
            for (int var11 = 0; var11 < Class8390.method29409(this.field43996); var11++) {
               if (method36498(this.field43995, var11, var10)) {
                  if (var11 == (Integer)var13.method20692() && var10 == (Integer)var13.method20693()) {
                     this.field43996.method29404(var11, var10, 3);
                  } else if (var11 == var16 && var10 == var9) {
                     this.field43996.method29404(var11, var10, 3);
                     this.field43997[2].method29404(var11, var10, 8388608);
                  }
               } else {
                  this.field43996.method29404(var11, var10, 5);
               }
            }
         }

         ArrayList var17 = Lists.newArrayList();

         for (Direction var12 : Class76.field161) {
            if (this.field43996.method29406(var16 + var12.method539(), var9 + var12.method541()) == 0) {
               var17.add(var12);
            }
         }

         if (!var17.isEmpty()) {
            Direction var19 = (Direction)var17.get(this.field43994.nextInt(var17.size()));
            this.method36501(this.field43996, var16 + var19.method539(), var9 + var19.method541(), var19, 4);

            while (this.method36502(this.field43996)) {
            }
         } else {
            this.field43996.method29405(0, 0, Class8390.method29409(this.field43996), Class8390.method29410(this.field43996), 5);
            var4.method29404((Integer)var13.method20692(), (Integer)var13.method20693(), var14);
         }
      } else {
         this.field43996.method29405(0, 0, Class8390.method29409(this.field43996), Class8390.method29410(this.field43996), 5);
      }
   }

   private void method36504(Class8390 var1, Class8390 var2) {
      List<Class6793> var5 = Lists.newArrayList();

      for (int var6 = 0; var6 < Class8390.method29410(var1); var6++) {
         for (int var7 = 0; var7 < Class8390.method29409(var1); var7++) {
            if (var1.method29406(var7, var6) == 2) {
               var5.add(new Class6793<Integer, Integer>(var7, var6));
            }
         }
      }

      Collections.shuffle(var5, this.field43994);
      int var21 = 10;

      for (Class6793 var8 : var5) {
         int var9 = (Integer)var8.method20692();
         int var10 = (Integer)var8.method20693();
         if (var2.method29406(var9, var10) == 0) {
            int var11 = var9;
            int var12 = var9;
            int var13 = var10;
            int var14 = var10;
            int var15 = 65536;
            if (var2.method29406(var9 + 1, var10) == 0
               && var2.method29406(var9, var10 + 1) == 0
               && var2.method29406(var9 + 1, var10 + 1) == 0
               && var1.method29406(var9 + 1, var10) == 2
               && var1.method29406(var9, var10 + 1) == 2
               && var1.method29406(var9 + 1, var10 + 1) == 2) {
               var12 = var9 + 1;
               var14 = var10 + 1;
               var15 = 262144;
            } else if (var2.method29406(var9 - 1, var10) == 0
               && var2.method29406(var9, var10 + 1) == 0
               && var2.method29406(var9 - 1, var10 + 1) == 0
               && var1.method29406(var9 - 1, var10) == 2
               && var1.method29406(var9, var10 + 1) == 2
               && var1.method29406(var9 - 1, var10 + 1) == 2) {
               var11 = var9 - 1;
               var14 = var10 + 1;
               var15 = 262144;
            } else if (var2.method29406(var9 - 1, var10) == 0
               && var2.method29406(var9, var10 - 1) == 0
               && var2.method29406(var9 - 1, var10 - 1) == 0
               && var1.method29406(var9 - 1, var10) == 2
               && var1.method29406(var9, var10 - 1) == 2
               && var1.method29406(var9 - 1, var10 - 1) == 2) {
               var11 = var9 - 1;
               var13 = var10 - 1;
               var15 = 262144;
            } else if (var2.method29406(var9 + 1, var10) == 0 && var1.method29406(var9 + 1, var10) == 2) {
               var12 = var9 + 1;
               var15 = 131072;
            } else if (var2.method29406(var9, var10 + 1) == 0 && var1.method29406(var9, var10 + 1) == 2) {
               var14 = var10 + 1;
               var15 = 131072;
            } else if (var2.method29406(var9 - 1, var10) == 0 && var1.method29406(var9 - 1, var10) == 2) {
               var11 = var9 - 1;
               var15 = 131072;
            } else if (var2.method29406(var9, var10 - 1) == 0 && var1.method29406(var9, var10 - 1) == 2) {
               var13 = var10 - 1;
               var15 = 131072;
            }

            int var16 = !this.field43994.nextBoolean() ? var12 : var11;
            int var17 = !this.field43994.nextBoolean() ? var14 : var13;
            int var18 = 2097152;
            if (!var1.method29408(var16, var17, 1)) {
               var16 = var16 != var11 ? var11 : var12;
               var17 = var17 != var13 ? var13 : var14;
               if (!var1.method29408(var16, var17, 1)) {
                  var17 = var17 != var13 ? var13 : var14;
                  if (!var1.method29408(var16, var17, 1)) {
                     var16 = var16 != var11 ? var11 : var12;
                     var17 = var17 != var13 ? var13 : var14;
                     if (!var1.method29408(var16, var17, 1)) {
                        var18 = 0;
                        var16 = var11;
                        var17 = var13;
                     }
                  }
               }
            }

            for (int var19 = var13; var19 <= var14; var19++) {
               for (int var20 = var11; var20 <= var12; var20++) {
                  if (var20 == var16 && var19 == var17) {
                     var2.method29404(var20, var19, 1048576 | var18 | var15 | var21);
                  } else {
                     var2.method29404(var20, var19, var15 | var21);
                  }
               }
            }

            var21++;
         }
      }
   }

   // $VF: synthetic method
   public static Class8390 method36505(Class9467 var0) {
      return var0.field43995;
   }

   // $VF: synthetic method
   public static Class8390 method36506(Class9467 var0) {
      return var0.field43996;
   }

   // $VF: synthetic method
   public static int method36507(Class9467 var0) {
      return var0.field43998;
   }

   // $VF: synthetic method
   public static int method36508(Class9467 var0) {
      return var0.field43999;
   }

   // $VF: synthetic method
   public static Class8390[] method36509(Class9467 var0) {
      return var0.field43997;
   }
}
