package remapped;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMaps;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import javax.annotation.Nullable;

public abstract class class_3808<M extends class_8666<M>> extends class_4938 {
   public static final class_1201 field_18647 = new class_1201();
   private static final Direction[] field_18640 = Direction.values();
   private final class_2957 field_18642;
   private final class_5002 field_18636;
   public final LongSet field_18644 = new LongOpenHashSet();
   public final LongSet field_18641 = new LongOpenHashSet();
   public final LongSet field_18646 = new LongOpenHashSet();
   public volatile M field_18645;
   public final M field_18648;
   public final LongSet field_18638 = new LongOpenHashSet();
   public final LongSet field_18635 = new LongOpenHashSet();
   public final Long2ObjectMap<class_1201> field_18649 = Long2ObjectMaps.synchronize(new Long2ObjectOpenHashMap());
   private final LongSet field_18637 = new LongOpenHashSet();
   private final LongSet field_18650 = new LongOpenHashSet();
   private final LongSet field_18639 = new LongOpenHashSet();
   public volatile boolean field_18643;

   public class_3808(class_2957 var1, class_5002 var2, M var3) {
      super(3, 16, 256);
      this.field_18642 = var1;
      this.field_18636 = var2;
      this.field_18648 = (M)var3;
      this.field_18645 = (M)var3.method_39727();
      this.field_18645.method_39724();
   }

   public boolean method_17749(long var1) {
      return this.method_17744(var1, true) != null;
   }

   @Nullable
   public class_1201 method_17744(long var1, boolean var3) {
      return this.method_17745(!var3 ? this.field_18645 : this.field_18648, var1);
   }

   @Nullable
   public class_1201 method_17745(M var1, long var2) {
      return var1.method_39730(var2);
   }

   @Nullable
   public class_1201 method_17743(long var1) {
      class_1201 var5 = (class_1201)this.field_18649.get(var1);
      return var5 == null ? this.method_17744(var1, false) : var5;
   }

   public abstract int method_17737(long var1);

   public int method_17733(long var1) {
      long var5 = class_6979.method_31903(var1);
      class_1201 var7 = this.method_17744(var5, true);
      return var7.method_5314(
         class_6979.method_31913(BlockPos.method_6080(var1)),
         class_6979.method_31913(BlockPos.method_6067(var1)),
         class_6979.method_31913(BlockPos.method_6092(var1))
      );
   }

   public void method_17742(long var1, int var3) {
      long var6 = class_6979.method_31903(var1);
      if (this.field_18638.add(var6)) {
         this.field_18648.method_39729(var6);
      }

      class_1201 var8 = this.method_17744(var6, true);
      var8.method_5323(
         class_6979.method_31913(BlockPos.method_6080(var1)),
         class_6979.method_31913(BlockPos.method_6067(var1)),
         class_6979.method_31913(BlockPos.method_6092(var1)),
         var3
      );

      for (int var9 = -1; var9 <= 1; var9++) {
         for (int var10 = -1; var10 <= 1; var10++) {
            for (int var11 = -1; var11 <= 1; var11++) {
               this.field_18635.add(class_6979.method_31903(BlockPos.method_6096(var1, var10, var11, var9)));
            }
         }
      }
   }

   @Override
   public int method_27698(long var1) {
      if (var1 != Long.MAX_VALUE) {
         if (this.field_18644.contains(var1)) {
            return 0;
         } else {
            return !this.field_18639.contains(var1) && this.field_18648.method_39731(var1) ? 1 : 2;
         }
      } else {
         return 2;
      }
   }

   @Override
   public int method_22639(long var1) {
      if (this.field_18641.contains(var1)) {
         return 2;
      } else {
         return !this.field_18644.contains(var1) && !this.field_18646.contains(var1) ? 2 : 0;
      }
   }

   @Override
   public void method_27689(long var1, int var3) {
      int var6 = this.method_27698(var1);
      if (var6 != 0 && var3 == 0) {
         this.field_18644.add(var1);
         this.field_18646.remove(var1);
      }

      if (var6 == 0 && var3 != 0) {
         this.field_18644.remove(var1);
         this.field_18641.remove(var1);
      }

      if (var6 >= 2 && var3 != 2) {
         if (!this.field_18639.contains(var1)) {
            this.field_18648.method_39732(var1, this.method_17736(var1));
            this.field_18638.add(var1);
            this.method_17739(var1);

            for (int var7 = -1; var7 <= 1; var7++) {
               for (int var8 = -1; var8 <= 1; var8++) {
                  for (int var9 = -1; var9 <= 1; var9++) {
                     this.field_18635.add(class_6979.method_31903(BlockPos.method_6096(var1, var8, var9, var7)));
                  }
               }
            }
         } else {
            this.field_18639.remove(var1);
         }
      }

      if (var6 != 2 && var3 >= 2) {
         this.field_18639.add(var1);
      }

      this.field_18643 = !this.field_18639.isEmpty();
   }

   public class_1201 method_17736(long var1) {
      class_1201 var5 = (class_1201)this.field_18649.get(var1);
      return var5 == null ? new class_1201() : var5;
   }

   public void method_17730(class_2309<?, ?> var1, long var2) {
      if (var1.method_27697() >= 8192) {
         int var6 = class_6979.method_31908(class_6979.method_31895(var2));
         int var7 = class_6979.method_31908(class_6979.method_31929(var2));
         int var8 = class_6979.method_31908(class_6979.method_31916(var2));

         for (int var9 = 0; var9 < 16; var9++) {
            for (int var10 = 0; var10 < 16; var10++) {
               for (int var11 = 0; var11 < 16; var11++) {
                  long var12 = BlockPos.method_6107(var6 + var9, var7 + var10, var8 + var11);
                  var1.method_27690(var12);
               }
            }
         }
      } else {
         var1.method_27694(var2x -> class_6979.method_31903(var2x) == var2);
      }
   }

   public boolean method_17740() {
      return this.field_18643;
   }

   public void method_17747(class_2309<M, ?> var1, boolean var2, boolean var3) {
      if (this.method_17740() || !this.field_18649.isEmpty()) {
         LongIterator var6 = this.field_18639.iterator();

         while (var6.hasNext()) {
            long var7 = (Long)var6.next();
            this.method_17730(var1, var7);
            class_1201 var9 = (class_1201)this.field_18649.remove(var7);
            class_1201 var10 = this.field_18648.method_39728(var7);
            if (this.field_18650.contains(class_6979.method_31910(var7))) {
               if (var9 == null) {
                  if (var10 != null) {
                     this.field_18649.put(var7, var10);
                  }
               } else {
                  this.field_18649.put(var7, var9);
               }
            }
         }

         this.field_18648.method_39725();
         var6 = this.field_18639.iterator();

         while (var6.hasNext()) {
            long var19 = (Long)var6.next();
            this.method_17741(var19);
         }

         this.field_18639.clear();
         this.field_18643 = false;
         ObjectIterator var15 = this.field_18649.long2ObjectEntrySet().iterator();

         while (var15.hasNext()) {
            Entry var11 = (Entry)var15.next();
            long var12 = var11.getLongKey();
            if (this.method_17749(var12)) {
               class_1201 var22 = (class_1201)var11.getValue();
               if (this.field_18648.method_39730(var12) != var22) {
                  this.method_17730(var1, var12);
                  this.field_18648.method_39732(var12, var22);
                  this.field_18638.add(var12);
               }
            }
         }

         this.field_18648.method_39725();
         if (var3) {
            var6 = this.field_18637.iterator();

            while (var6.hasNext()) {
               long var21 = (Long)var6.next();
               this.method_17746(var1, var21);
            }
         } else {
            var6 = this.field_18649.keySet().iterator();

            while (var6.hasNext()) {
               long var20 = (Long)var6.next();
               this.method_17746(var1, var20);
            }
         }

         this.field_18637.clear();
         ObjectIterator var18 = this.field_18649.long2ObjectEntrySet().iterator();

         while (var18.hasNext()) {
            Entry var23 = (Entry)var18.next();
            long var24 = var23.getLongKey();
            if (this.method_17749(var24)) {
               var18.remove();
            }
         }
      }
   }

   private void method_17746(class_2309<M, ?> var1, long var2) {
      if (this.method_17749(var2)) {
         int var6 = class_6979.method_31908(class_6979.method_31895(var2));
         int var7 = class_6979.method_31908(class_6979.method_31929(var2));
         int var8 = class_6979.method_31908(class_6979.method_31916(var2));

         for (Direction var12 : field_18640) {
            long var13 = class_6979.method_31928(var2, var12);
            if (!this.field_18649.containsKey(var13) && this.method_17749(var13)) {
               for (int var15 = 0; var15 < 16; var15++) {
                  for (int var16 = 0; var16 < 16; var16++) {
                     long var17;
                     long var19;
                     switch (var12) {
                        case field_802:
                           var17 = BlockPos.method_6107(var6 + var16, var7, var8 + var15);
                           var19 = BlockPos.method_6107(var6 + var16, var7 - 1, var8 + var15);
                           break;
                        case field_817:
                           var17 = BlockPos.method_6107(var6 + var16, var7 + 16 - 1, var8 + var15);
                           var19 = BlockPos.method_6107(var6 + var16, var7 + 16, var8 + var15);
                           break;
                        case field_818:
                           var17 = BlockPos.method_6107(var6 + var15, var7 + var16, var8);
                           var19 = BlockPos.method_6107(var6 + var15, var7 + var16, var8 - 1);
                           break;
                        case field_800:
                           var17 = BlockPos.method_6107(var6 + var15, var7 + var16, var8 + 16 - 1);
                           var19 = BlockPos.method_6107(var6 + var15, var7 + var16, var8 + 16);
                           break;
                        case field_809:
                           var17 = BlockPos.method_6107(var6, var7 + var15, var8 + var16);
                           var19 = BlockPos.method_6107(var6 - 1, var7 + var15, var8 + var16);
                           break;
                        default:
                           var17 = BlockPos.method_6107(var6 + 16 - 1, var7 + var15, var8 + var16);
                           var19 = BlockPos.method_6107(var6 + 16, var7 + var15, var8 + var16);
                     }

                     var1.method_27703(var17, var19, var1.method_27700(var17, var19, var1.method_27698(var17)), false);
                     var1.method_27703(var19, var17, var1.method_27700(var19, var17, var1.method_27698(var19)), false);
                  }
               }
            }
         }
      }
   }

   public void method_17739(long var1) {
   }

   public void method_17741(long var1) {
   }

   public void method_17738(long var1, boolean var3) {
   }

   public void method_17748(long var1, boolean var3) {
      if (!var3) {
         this.field_18650.remove(var1);
      } else {
         this.field_18650.add(var1);
      }
   }

   public void method_17731(long var1, class_1201 var3, boolean var4) {
      if (var3 == null) {
         this.field_18649.remove(var1);
      } else {
         this.field_18649.put(var1, var3);
         if (!var4) {
            this.field_18637.add(var1);
         }
      }
   }

   public void method_17734(long var1, boolean var3) {
      boolean var6 = this.field_18644.contains(var1);
      if (!var6 && !var3) {
         this.field_18646.add(var1);
         this.method_27703(Long.MAX_VALUE, var1, 0, true);
      }

      if (var6 && var3) {
         this.field_18641.add(var1);
         this.method_27703(Long.MAX_VALUE, var1, 2, false);
      }
   }

   public void method_17732() {
      if (this.method_27685()) {
         this.method_27693(Integer.MAX_VALUE);
      }
   }

   public void method_17735() {
      if (!this.field_18638.isEmpty()) {
         class_8666 var3 = this.field_18648.method_39727();
         var3.method_39724();
         this.field_18645 = (M)var3;
         this.field_18638.clear();
      }

      if (!this.field_18635.isEmpty()) {
         LongIterator var6 = this.field_18635.iterator();

         while (var6.hasNext()) {
            long var4 = var6.nextLong();
            this.field_18636.method_23026(this.field_18642, class_6979.method_31920(var4));
         }

         this.field_18635.clear();
      }
   }
}
