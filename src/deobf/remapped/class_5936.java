package remapped;

import it.unimi.dsi.fastutil.longs.Long2IntOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Arrays;

public class class_5936 extends class_3808<class_8759> {
   private static String[] field_30279;
   private static final Direction[] field_30280 = new Direction[]{Direction.field_818, Direction.field_800, Direction.field_809, Direction.field_804};
   private final LongSet field_30278 = new LongOpenHashSet();
   private final LongSet field_30275 = new LongOpenHashSet();
   private final LongSet field_30277 = new LongOpenHashSet();
   private final LongSet field_30281 = new LongOpenHashSet();
   private volatile boolean field_30276;

   public class_5936(class_5002 var1) {
      super(class_2957.field_14437, var1, new class_8759(new Long2ObjectOpenHashMap(), new Long2IntOpenHashMap(), Integer.MAX_VALUE));
   }

   @Override
   public int method_17737(long var1) {
      long var5 = class_6979.method_31903(var1);
      int var7 = class_6979.method_31929(var5);
      class_8759 var8 = this.field_18645;
      int var9 = class_8759.method_40206(var8).get(class_6979.method_31910(var5));
      if (var9 != class_8759.method_40203(var8) && var7 < var9) {
         class_1201 var10 = this.method_17745(var8, var5);
         if (var10 == null) {
            for (var1 = BlockPos.method_6087(var1); var10 == null; var10 = this.method_17745(var8, var5)) {
               var5 = class_6979.method_31928(var5, Direction.field_817);
               if (++var7 >= var9) {
                  return 15;
               }

               var1 = BlockPos.method_6096(var1, 0, 16, 0);
            }
         }

         return var10.method_5314(
            class_6979.method_31913(BlockPos.method_6080(var1)),
            class_6979.method_31913(BlockPos.method_6067(var1)),
            class_6979.method_31913(BlockPos.method_6092(var1))
         );
      } else {
         return 15;
      }
   }

   @Override
   public void method_17739(long var1) {
      int var5 = class_6979.method_31929(var1);
      if (class_8759.method_40203(this.field_18648) > var5) {
         class_8759.method_40205(this.field_18648, var5);
         class_8759.method_40206(this.field_18648).defaultReturnValue(class_8759.method_40203(this.field_18648));
      }

      long var6 = class_6979.method_31910(var1);
      int var8 = class_8759.method_40206(this.field_18648).get(var6);
      if (var8 < var5 + 1) {
         class_8759.method_40206(this.field_18648).put(var6, var5 + 1);
         if (this.field_30281.contains(var6)) {
            this.method_27141(var1);
            if (var8 > class_8759.method_40203(this.field_18648)) {
               long var9 = class_6979.method_31926(class_6979.method_31895(var1), var8 - 1, class_6979.method_31916(var1));
               this.method_27143(var9);
            }

            this.method_27139();
         }
      }
   }

   private void method_27143(long var1) {
      this.field_30277.add(var1);
      this.field_30275.remove(var1);
   }

   private void method_27141(long var1) {
      this.field_30275.add(var1);
      this.field_30277.remove(var1);
   }

   private void method_27139() {
      this.field_30276 = !this.field_30275.isEmpty() || !this.field_30277.isEmpty();
   }

   @Override
   public void method_17741(long var1) {
      long var5 = class_6979.method_31910(var1);
      boolean var7 = this.field_30281.contains(var5);
      if (var7) {
         this.method_27143(var1);
      }

      int var8 = class_6979.method_31929(var1);
      if (class_8759.method_40206(this.field_18648).get(var5) == var8 + 1) {
         long var9;
         for (var9 = var1; !this.method_17749(var9) && this.method_27138(var8); var9 = class_6979.method_31928(var9, Direction.field_802)) {
            var8--;
         }

         if (!this.method_17749(var9)) {
            class_8759.method_40206(this.field_18648).remove(var5);
         } else {
            class_8759.method_40206(this.field_18648).put(var5, var8 + 1);
            if (var7) {
               this.method_27141(var9);
            }
         }
      }

      if (var7) {
         this.method_27139();
      }
   }

   @Override
   public void method_17738(long var1, boolean var3) {
      this.method_17732();
      if (var3 && this.field_30281.add(var1)) {
         int var6 = class_8759.method_40206(this.field_18648).get(var1);
         if (var6 != class_8759.method_40203(this.field_18648)) {
            long var7 = class_6979.method_31926(class_6979.method_31895(var1), var6 - 1, class_6979.method_31916(var1));
            this.method_27141(var7);
            this.method_27139();
         }
      } else if (!var3) {
         this.field_30281.remove(var1);
      }
   }

   @Override
   public boolean method_17740() {
      return super.method_17740() || this.field_30276;
   }

   @Override
   public class_1201 method_17736(long var1) {
      class_1201 var5 = (class_1201)this.field_18649.get(var1);
      if (var5 != null) {
         return var5;
      } else {
         long var6 = class_6979.method_31928(var1, Direction.field_817);
         int var8 = class_8759.method_40206(this.field_18648).get(class_6979.method_31910(var1));
         if (var8 != class_8759.method_40203(this.field_18648) && class_6979.method_31929(var6) < var8) {
            class_1201 var9;
            while ((var9 = this.method_17744(var6, true)) == null) {
               var6 = class_6979.method_31928(var6, Direction.field_817);
            }

            return new class_1201(new class_935(var9, 0).method_5317());
         } else {
            return new class_1201();
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_17747(class_2309<class_8759, ?> var1, boolean var2, boolean var3) {
      super.method_17747(var1, var2, var3);
      if (var2) {
         if (!this.field_30275.isEmpty()) {
            LongIterator var6 = this.field_30275.iterator();

            while (var6.hasNext()) {
               long var7 = (Long)var6.next();
               int var9 = this.method_27698(var7);
               if (var9 != 2 && !this.field_30277.contains(var7) && this.field_30278.add(var7)) {
                  if (var9 == 1) {
                     this.method_17730(var1, var7);
                     if (this.field_18638.add(var7)) {
                        this.field_18648.method_39729(var7);
                     }

                     Arrays.fill(this.method_17744(var7, true).method_5317(), (byte)-1);
                     int var34 = class_6979.method_31908(class_6979.method_31895(var7));
                     int var36 = class_6979.method_31908(class_6979.method_31929(var7));
                     int var12 = class_6979.method_31908(class_6979.method_31916(var7));

                     for (Direction var16 : field_30280) {
                        long var17 = class_6979.method_31928(var7, var16);
                        if ((this.field_30277.contains(var17) || !this.field_30278.contains(var17) && !this.field_30275.contains(var17))
                           && this.method_17749(var17)) {
                           for (int var19 = 0; var19 < 16; var19++) {
                              for (int var20 = 0; var20 < 16; var20++) {
                                 long var21;
                                 long var23;
                                 switch (var16) {
                                    case field_818:
                                       var21 = BlockPos.method_6107(var34 + var19, var36 + var20, var12);
                                       var23 = BlockPos.method_6107(var34 + var19, var36 + var20, var12 - 1);
                                       break;
                                    case field_800:
                                       var21 = BlockPos.method_6107(var34 + var19, var36 + var20, var12 + 16 - 1);
                                       var23 = BlockPos.method_6107(var34 + var19, var36 + var20, var12 + 16);
                                       break;
                                    case field_809:
                                       var21 = BlockPos.method_6107(var34, var36 + var19, var12 + var20);
                                       var23 = BlockPos.method_6107(var34 - 1, var36 + var19, var12 + var20);
                                       break;
                                    default:
                                       var21 = BlockPos.method_6107(var34 + 16 - 1, var36 + var19, var12 + var20);
                                       var23 = BlockPos.method_6107(var34 + 16, var36 + var19, var12 + var20);
                                 }

                                 var1.method_27703(var21, var23, var1.method_27700(var21, var23, 0), true);
                              }
                           }
                        }
                     }

                     for (int var37 = 0; var37 < 16; var37++) {
                        for (int var38 = 0; var38 < 16; var38++) {
                           long var25 = BlockPos.method_6107(
                              class_6979.method_31908(class_6979.method_31895(var7)) + var37,
                              class_6979.method_31908(class_6979.method_31929(var7)),
                              class_6979.method_31908(class_6979.method_31916(var7)) + var38
                           );
                           long var39 = BlockPos.method_6107(
                              class_6979.method_31908(class_6979.method_31895(var7)) + var37,
                              class_6979.method_31908(class_6979.method_31929(var7)) - 1,
                              class_6979.method_31908(class_6979.method_31916(var7)) + var38
                           );
                           var1.method_27703(var25, var39, var1.method_27700(var25, var39, 0), true);
                        }
                     }
                  } else {
                     for (int var10 = 0; var10 < 16; var10++) {
                        for (int var11 = 0; var11 < 16; var11++) {
                           long var27 = BlockPos.method_6107(
                              class_6979.method_31908(class_6979.method_31895(var7)) + var10,
                              class_6979.method_31908(class_6979.method_31929(var7)) + 16 - 1,
                              class_6979.method_31908(class_6979.method_31916(var7)) + var11
                           );
                           var1.method_27703(Long.MAX_VALUE, var27, 0, true);
                        }
                     }
                  }
               }
            }
         }

         this.field_30275.clear();
         if (!this.field_30277.isEmpty()) {
            LongIterator var31 = this.field_30277.iterator();

            while (var31.hasNext()) {
               long var32 = (Long)var31.next();
               if (this.field_30278.remove(var32) && this.method_17749(var32)) {
                  for (int var33 = 0; var33 < 16; var33++) {
                     for (int var35 = 0; var35 < 16; var35++) {
                        long var29 = BlockPos.method_6107(
                           class_6979.method_31908(class_6979.method_31895(var32)) + var33,
                           class_6979.method_31908(class_6979.method_31929(var32)) + 16 - 1,
                           class_6979.method_31908(class_6979.method_31916(var32)) + var35
                        );
                        var1.method_27703(Long.MAX_VALUE, var29, 15, false);
                     }
                  }
               }
            }
         }

         this.field_30277.clear();
         this.field_30276 = false;
      }
   }

   public boolean method_27138(int var1) {
      return var1 >= class_8759.method_40203(this.field_18648);
   }

   public boolean method_27142(long var1) {
      int var5 = BlockPos.method_6067(var1);
      if ((var5 & 15) == 15) {
         long var6 = class_6979.method_31903(var1);
         long var8 = class_6979.method_31910(var6);
         if (this.field_30281.contains(var8)) {
            int var10 = class_8759.method_40206(this.field_18648).get(var8);
            return class_6979.method_31908(var10) == var5 + 16;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean method_27137(long var1) {
      long var5 = class_6979.method_31910(var1);
      int var7 = class_8759.method_40206(this.field_18648).get(var5);
      return var7 == class_8759.method_40203(this.field_18648) || class_6979.method_31929(var1) >= var7;
   }

   public boolean method_27140(long var1) {
      long var5 = class_6979.method_31910(var1);
      return this.field_30281.contains(var5);
   }
}
