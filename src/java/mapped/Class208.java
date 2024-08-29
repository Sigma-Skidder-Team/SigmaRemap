package mapped;

import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.util.math.BlockPos;

import javax.annotation.Nullable;

public abstract class Class208<M extends Class7586<M>> extends Class207 {
   public static final Class6785 field768 = new Class6785();
   private static final Direction[] field769 = Direction.values();
   private final Class1977 field770;
   private final Class1704 field771;
   public final LongSet field772 = new LongOpenHashSet();
   public final LongSet field773 = new LongOpenHashSet();
   public final LongSet field774 = new LongOpenHashSet();
   public volatile M field775;
   public final M field776;
   public final LongSet field777 = new LongOpenHashSet();
   public final LongSet field778 = new LongOpenHashSet();
   public final Long2ObjectMap<Class6785> field779 = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap<>());
   private final LongSet field780 = new LongOpenHashSet();
   private final LongSet field781 = new LongOpenHashSet();
   private final LongSet field782 = new LongOpenHashSet();
   public volatile boolean field783;

   public Class208(Class1977 var1, Class1704 var2, M var3) {
      super(3, 16, 256);
      this.field770 = var1;
      this.field771 = var2;
      this.field776 = (M)var3;
      this.field775 = (M)var3.method24828();
      this.field775.method24835();
   }

   public boolean method698(long var1) {
      return this.method699(var1, true) != null;
   }

   @Nullable
   public Class6785 method699(long var1, boolean var3) {
      return this.method700(!var3 ? this.field775 : this.field776, var1);
   }

   @Nullable
   public Class6785 method700(M var1, long var2) {
      return var1.method24831(var2);
   }

   @Nullable
   public Class6785 method701(long var1) {
      Class6785 var5 = (Class6785)this.field779.get(var1);
      return var5 == null ? this.method699(var1, false) : var5;
   }

   public abstract int method702(long var1);

   public int method703(long var1) {
      long var5 = Class2002.method8419(var1);
      Class6785 var7 = this.method699(var5, true);
      return var7.method20670(
         Class2002.method8397(BlockPos.method8328(var1)), Class2002.method8397(BlockPos.method8329(var1)), Class2002.method8397(BlockPos.method8330(var1))
      );
   }

   public void method704(long var1, int var3) {
      long var6 = Class2002.method8419(var1);
      if (this.field777.add(var6)) {
         this.field776.method24829(var6);
      }

      Class6785 var8 = this.method699(var6, true);
      var8.method20671(
         Class2002.method8397(BlockPos.method8328(var1)),
         Class2002.method8397(BlockPos.method8329(var1)),
         Class2002.method8397(BlockPos.method8330(var1)),
         var3
      );

      for (int var9 = -1; var9 <= 1; var9++) {
         for (int var10 = -1; var10 <= 1; var10++) {
            for (int var11 = -1; var11 <= 1; var11++) {
               this.field778.add(Class2002.method8419(BlockPos.method8327(var1, var10, var11, var9)));
            }
         }
      }
   }

   @Override
   public int method652(long var1) {
      if (var1 != Long.MAX_VALUE) {
         if (this.field772.contains(var1)) {
            return 0;
         } else {
            return !this.field782.contains(var1) && this.field776.method24830(var1) ? 1 : 2;
         }
      } else {
         return 2;
      }
   }

   @Override
   public int method696(long var1) {
      if (this.field773.contains(var1)) {
         return 2;
      } else {
         return !this.field772.contains(var1) && !this.field774.contains(var1) ? 2 : 0;
      }
   }

   @Override
   public void method654(long var1, int var3) {
      int var6 = this.method652(var1);
      if (var6 != 0 && var3 == 0) {
         this.field772.add(var1);
         this.field774.remove(var1);
      }

      if (var6 == 0 && var3 != 0) {
         this.field772.remove(var1);
         this.field773.remove(var1);
      }

      if (var6 >= 2 && var3 != 2) {
         if (!this.field782.contains(var1)) {
            this.field776.setArray(var1, this.method705(var1));
            this.field777.add(var1);
            this.method710(var1);

            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  for (int var9 = -1; var9 <= 1; var9++) {
                     this.field778.add(Class2002.method8419(BlockPos.method8327(var1, var8, var9, var7)));
                  }
               }
            }
         } else {
            this.field782.remove(var1);
         }
      }

      if (var6 != 2 && var3 >= 2) {
         this.field782.add(var1);
      }

      this.field783 = !this.field782.isEmpty();
   }

   public Class6785 method705(long var1) {
      Class6785 var5 = this.field779.get(var1);
      return var5 == null ? new Class6785() : var5;
   }

   public void method706(Class200<?, ?> var1, long var2) {
      if (var1.method677() >= 8192) {
         int var6 = Class2002.method8406(Class2002.method8407(var2));
         int var7 = Class2002.method8406(Class2002.method8408(var2));
         int var8 = Class2002.method8406(Class2002.method8409(var2));

         for (int var9 = 0; var9 < 16; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  long var12 = BlockPos.method8333(var6 + var9, var7 + var10, var8 + var11);
                  var1.method668(var12);
               }
            }
         }
      } else {
         var1.method669(var2x -> Class2002.method8419(var2x) == var2);
      }
   }

   public boolean method707() {
      return this.field783;
   }

   public void method708(Class200<M, ?> var1, boolean var2, boolean var3) {
      if (this.method707() || !this.field779.isEmpty()) {
         LongIterator var6 = this.field782.iterator();

         while (var6.hasNext()) {
            long var7 = (Long)var6.next();
            this.method706(var1, var7);
            Class6785 var9 = (Class6785)this.field779.remove(var7);
            Class6785 var10 = this.field776.method24832(var7);
            if (this.field781.contains(Class2002.method8420(var7))) {
               if (var9 == null) {
                  if (var10 != null) {
                     this.field779.put(var7, var10);
                  }
               } else {
                  this.field779.put(var7, var9);
               }
            }
         }

         this.field776.method24834();
         var6 = this.field782.iterator();

         while (var6.hasNext()) {
            long var19 = (Long)var6.next();
            this.method711(var19);
         }

         this.field782.clear();
         this.field783 = false;

          for (Entry<Class6785> var11 : this.field779.long2ObjectEntrySet()) {
              long var12 = var11.getLongKey();
              if (this.method698(var12)) {
                  Class6785 var22 = var11.getValue();
                  if (this.field776.method24831(var12) != var22) {
                      this.method706(var1, var12);
                      this.field776.setArray(var12, var22);
                      this.field777.add(var12);
                  }
              }
          }

         this.field776.method24834();
         if (var3) {
            var6 = this.field780.iterator();

            while (var6.hasNext()) {
               long var21 = (Long)var6.next();
               this.method709(var1, var21);
            }
         } else {
            var6 = this.field779.keySet().iterator();

            while (var6.hasNext()) {
               long var20 = (Long)var6.next();
               this.method709(var1, var20);
            }
         }

         this.field780.clear();
         ObjectIterator var18 = this.field779.long2ObjectEntrySet().iterator();

         while (var18.hasNext()) {
            Entry var23 = (Entry)var18.next();
            long var24 = var23.getLongKey();
            if (this.method698(var24)) {
               var18.remove();
            }
         }
      }
   }

   private void method709(Class200<M, ?> var1, long var2) {
      if (this.method698(var2)) {
         int var6 = Class2002.method8406(Class2002.method8407(var2));
         int var7 = Class2002.method8406(Class2002.method8408(var2));
         int var8 = Class2002.method8406(Class2002.method8409(var2));

         for (Direction var12 : field769) {
            long var13 = Class2002.method8394(var2, var12);
            if (!this.field779.containsKey(var13) && this.method698(var13)) {
               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     long var17;
                     long var19;
                     switch (Class7449.field32049[var12.ordinal()]) {
                        case 1:
                           var17 = BlockPos.method8333(var6 + var16, var7, var8 + var15);
                           var19 = BlockPos.method8333(var6 + var16, var7 - 1, var8 + var15);
                           break;
                        case 2:
                           var17 = BlockPos.method8333(var6 + var16, var7 + 16 - 1, var8 + var15);
                           var19 = BlockPos.method8333(var6 + var16, var7 + 16, var8 + var15);
                           break;
                        case 3:
                           var17 = BlockPos.method8333(var6 + var15, var7 + var16, var8);
                           var19 = BlockPos.method8333(var6 + var15, var7 + var16, var8 - 1);
                           break;
                        case 4:
                           var17 = BlockPos.method8333(var6 + var15, var7 + var16, var8 + 16 - 1);
                           var19 = BlockPos.method8333(var6 + var15, var7 + var16, var8 + 16);
                           break;
                        case 5:
                           var17 = BlockPos.method8333(var6, var7 + var15, var8 + var16);
                           var19 = BlockPos.method8333(var6 - 1, var7 + var15, var8 + var16);
                           break;
                        default:
                           var17 = BlockPos.method8333(var6 + 16 - 1, var7 + var15, var8 + var16);
                           var19 = BlockPos.method8333(var6 + 16, var7 + var15, var8 + var16);
                     }

                     var1.method672(var17, var19, var1.method655(var17, var19, var1.method652(var17)), false);
                     var1.method672(var19, var17, var1.method655(var19, var17, var1.method652(var19)), false);
                  }
               }
            }
         }
      }
   }

   public void method710(long var1) {
   }

   public void method711(long var1) {
   }

   public void method712(long var1, boolean var3) {
   }

   public void method713(long var1, boolean var3) {
      if (!var3) {
         this.field781.remove(var1);
      } else {
         this.field781.add(var1);
      }
   }

   public void method714(long var1, Class6785 var3, boolean var4) {
      if (var3 == null) {
         this.field779.remove(var1);
      } else {
         this.field779.put(var1, var3);
         if (!var4) {
            this.field780.add(var1);
         }
      }
   }

   public void method715(long var1, boolean var3) {
      boolean var6 = this.field772.contains(var1);
      if (!var6 && !var3) {
         this.field774.add(var1);
         this.method672(Long.MAX_VALUE, var1, 0, true);
      }

      if (var6 && var3) {
         this.field773.add(var1);
         this.method672(Long.MAX_VALUE, var1, 2, false);
      }
   }

   public void method716() {
      if (this.method675()) {
         this.method676(Integer.MAX_VALUE);
      }
   }

   public void method717() {
      if (!this.field777.isEmpty()) {
         Class7586 var3 = this.field776.method24828();
         var3.method24835();
         this.field775 = (M)var3;
         this.field777.clear();
      }

      if (!this.field778.isEmpty()) {
         LongIterator var6 = this.field778.iterator();

         while (var6.hasNext()) {
            long var4 = var6.nextLong();
            this.field771.method7373(this.field770, Class2002.method8393(var4));
         }

         this.field778.clear();
      }
   }
}
