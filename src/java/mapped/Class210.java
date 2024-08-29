package mapped;

import it.unimi.dsi.fastutil.longs.*;

import java.util.Arrays;

public class Class210 extends Class208<Class7587> {
   private static final Direction[] field786 = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
   private final LongSet field787 = new LongOpenHashSet();
   private final LongSet field788 = new LongOpenHashSet();
   private final LongSet field789 = new LongOpenHashSet();
   private final LongSet field790 = new LongOpenHashSet();
   private volatile boolean field791;

   public Class210(Class1704 var1) {
      super(Class1977.field12881, var1, new Class7587(new Long2ObjectOpenHashMap<>(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   public int method702(long var1) {
      long var5 = Class2002.method8419(var1);
      int var7 = Class2002.method8408(var5);
      Class7587 var8 = this.field775;
      int var9 = Class7587.method24836(var8).get(Class2002.method8420(var5));
      if (var9 != Class7587.method24837(var8) && var7 < var9) {
         Class6785 var10 = this.method700(var8, var5);
         if (var10 == null) {
            for (var1 = BlockPos.method8334(var1); var10 == null; var10 = this.method700(var8, var5)) {
               var5 = Class2002.method8394(var5, Direction.field673);
               if (++var7 >= var9) {
                  return 15;
               }

               var1 = BlockPos.method8327(var1, 0, 16, 0);
            }
         }

         return var10.method20670(
            Class2002.method8397(BlockPos.method8328(var1)),
            Class2002.method8397(BlockPos.method8329(var1)),
            Class2002.method8397(BlockPos.method8330(var1))
         );
      } else {
         return 15;
      }
   }

   @Override
   public void method710(long var1) {
      int var5 = Class2002.method8408(var1);
      if (Class7587.method24837(this.field776) > var5) {
         Class7587.method24838(this.field776, var5);
         Class7587.method24836(this.field776).defaultReturnValue(Class7587.method24837(this.field776));
      }

      long var6 = Class2002.method8420(var1);
      int var8 = Class7587.method24836(this.field776).get(var6);
      if (var8 < var5 + 1) {
         Class7587.method24836(this.field776).put(var6, var5 + 1);
         if (this.field790.contains(var6)) {
            this.method720(var1);
            if (var8 > Class7587.method24837(this.field776)) {
               long var9 = Class2002.method8424(Class2002.method8407(var1), var8 - 1, Class2002.method8409(var1));
               this.method719(var9);
            }

            this.method721();
         }
      }
   }

   private void method719(long var1) {
      this.field789.add(var1);
      this.field788.remove(var1);
   }

   private void method720(long var1) {
      this.field788.add(var1);
      this.field789.remove(var1);
   }

   private void method721() {
      this.field791 = !this.field788.isEmpty() || !this.field789.isEmpty();
   }

   @Override
   public void method711(long var1) {
      long var5 = Class2002.method8420(var1);
      boolean var7 = this.field790.contains(var5);
      if (var7) {
         this.method719(var1);
      }

      int var8 = Class2002.method8408(var1);
      if (Class7587.method24836(this.field776).get(var5) == var8 + 1) {
         long var9;
         for (var9 = var1; !this.method698(var9) && this.method722(var8); var9 = Class2002.method8394(var9, Direction.DOWN)) {
            var8--;
         }

         if (!this.method698(var9)) {
            Class7587.method24836(this.field776).remove(var5);
         } else {
            Class7587.method24836(this.field776).put(var5, var8 + 1);
            if (var7) {
               this.method720(var9);
            }
         }
      }

      if (var7) {
         this.method721();
      }
   }

   @Override
   public void method712(long var1, boolean var3) {
      this.method716();
      if (var3 && this.field790.add(var1)) {
         int var6 = Class7587.method24836(this.field776).get(var1);
         if (var6 != Class7587.method24837(this.field776)) {
            long var7 = Class2002.method8424(Class2002.method8407(var1), var6 - 1, Class2002.method8409(var1));
            this.method720(var7);
            this.method721();
         }
      } else if (!var3) {
         this.field790.remove(var1);
      }
   }

   @Override
   public boolean method707() {
      return super.method707() || this.field791;
   }

   @Override
   public Class6785 method705(long var1) {
      Class6785 var5 = (Class6785)this.field779.get(var1);
      if (var5 != null) {
         return var5;
      } else {
         long var6 = Class2002.method8394(var1, Direction.field673);
         int var8 = Class7587.method24836(this.field776).get(Class2002.method8420(var1));
         if (var8 != Class7587.method24837(this.field776) && Class2002.method8408(var6) < var8) {
            Class6785 var9;
            while ((var9 = this.method699(var6, true)) == null) {
               var6 = Class2002.method8394(var6, Direction.field673);
            }

            return new Class6785(new Class6784(var9, 0).method20669());
         } else {
            return new Class6785();
         }
      }
   }

   @Override
   public void method708(Class200<Class7587, ?> var1, boolean var2, boolean var3) {
      super.method708(var1, var2, var3);
      if (var2) {
         if (!this.field788.isEmpty()) {

             for (long var7 : this.field788) {
                 int var9 = this.method652(var7);
                 if (var9 != 2 && !this.field789.contains(var7) && this.field787.add(var7)) {
                     if (var9 == 1) {
                         this.method706(var1, var7);
                         if (this.field777.add(var7)) {
                             this.field776.method24829(var7);
                         }

                         Arrays.fill(this.method699(var7, true).method20669(), (byte) -1);
                         int var34 = Class2002.method8406(Class2002.method8407(var7));
                         int var36 = Class2002.method8406(Class2002.method8408(var7));
                         int var12 = Class2002.method8406(Class2002.method8409(var7));

                         for (Direction var16 : field786) {
                             long var17 = Class2002.method8394(var7, var16);
                             if ((this.field789.contains(var17) || !this.field787.contains(var17) && !this.field788.contains(var17)) && this.method698(var17)) {
                                 for (int var19 = 0; var19 < 16; var19++) {
                                     for (int var20 = 0; var20 < 16; var20++) {
                                         long var21;
                                         long var23;
                                         switch (Class8636.field38874[var16.ordinal()]) {
                                             case 1:
                                                 var21 = BlockPos.method8333(var34 + var19, var36 + var20, var12);
                                                 var23 = BlockPos.method8333(var34 + var19, var36 + var20, var12 - 1);
                                                 break;
                                             case 2:
                                                 var21 = BlockPos.method8333(var34 + var19, var36 + var20, var12 + 16 - 1);
                                                 var23 = BlockPos.method8333(var34 + var19, var36 + var20, var12 + 16);
                                                 break;
                                             case 3:
                                                 var21 = BlockPos.method8333(var34, var36 + var19, var12 + var20);
                                                 var23 = BlockPos.method8333(var34 - 1, var36 + var19, var12 + var20);
                                                 break;
                                             default:
                                                 var21 = BlockPos.method8333(var34 + 16 - 1, var36 + var19, var12 + var20);
                                                 var23 = BlockPos.method8333(var34 + 16, var36 + var19, var12 + var20);
                                         }

                                         var1.method672(var21, var23, var1.method655(var21, var23, 0), true);
                                     }
                                 }
                             }
                         }

                         for (int var37 = 0; var37 < 16; var37++) {
                             for (int var38 = 0; var38 < 16; var38++) {
                                 long var25 = BlockPos.method8333(
                                         Class2002.method8406(Class2002.method8407(var7)) + var37,
                                         Class2002.method8406(Class2002.method8408(var7)),
                                         Class2002.method8406(Class2002.method8409(var7)) + var38
                                 );
                                 long var39 = BlockPos.method8333(
                                         Class2002.method8406(Class2002.method8407(var7)) + var37,
                                         Class2002.method8406(Class2002.method8408(var7)) - 1,
                                         Class2002.method8406(Class2002.method8409(var7)) + var38
                                 );
                                 var1.method672(var25, var39, var1.method655(var25, var39, 0), true);
                             }
                         }
                     } else {
                         for (int var10 = 0; var10 < 16; var10++) {
                             for (int var11 = 0; var11 < 16; var11++) {
                                 long var27 = BlockPos.method8333(
                                         Class2002.method8406(Class2002.method8407(var7)) + var10,
                                         Class2002.method8406(Class2002.method8408(var7)) + 16 - 1,
                                         Class2002.method8406(Class2002.method8409(var7)) + var11
                                 );
                                 var1.method672(Long.MAX_VALUE, var27, 0, true);
                             }
                         }
                     }
                 }
             }
         }

         this.field788.clear();
         if (!this.field789.isEmpty()) {

             for (long var32 : this.field789) {
                 if (this.field787.remove(var32) && this.method698(var32)) {
                     for (int var33 = 0; var33 < 16; var33++) {
                         for (int var35 = 0; var35 < 16; var35++) {
                             long var29 = BlockPos.method8333(
                                     Class2002.method8406(Class2002.method8407(var32)) + var33,
                                     Class2002.method8406(Class2002.method8408(var32)) + 16 - 1,
                                     Class2002.method8406(Class2002.method8409(var32)) + var35
                             );
                             var1.method672(Long.MAX_VALUE, var29, 15, false);
                         }
                     }
                 }
             }
         }

         this.field789.clear();
         this.field791 = false;
      }
   }

   public boolean method722(int var1) {
      return var1 >= Class7587.method24837(this.field776);
   }

   public boolean method723(long var1) {
      int var5 = BlockPos.method8329(var1);
      if ((var5 & 15) == 15) {
         long var6 = Class2002.method8419(var1);
         long var8 = Class2002.method8420(var6);
         if (this.field790.contains(var8)) {
            int var10 = Class7587.method24836(this.field776).get(var8);
            return Class2002.method8406(var10) == var5 + 16;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method724(long var1) {
      long var5 = Class2002.method8420(var1);
      int var7 = Class7587.method24836(this.field776).get(var5);
      return var7 == Class7587.method24837(this.field776) || Class2002.method8408(var1) >= var7;
   }

   public boolean method725(long var1) {
      long var5 = Class2002.method8420(var1);
      return this.field790.contains(var5);
   }
}
