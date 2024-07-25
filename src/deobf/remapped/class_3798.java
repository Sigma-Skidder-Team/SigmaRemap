package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanMap;
import it.unimi.dsi.fastutil.shorts.Short2BooleanOpenHashMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectMap;
import it.unimi.dsi.fastutil.shorts.Short2ObjectOpenHashMap;
import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

public abstract class class_3798 extends class_2340 {
   public static final class_6720 field_18532 = class_6023.field_30693;
   public static final class_7044 field_18533 = class_6023.field_30694;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<class_5071>> field_18534 = ThreadLocal.<Object2ByteLinkedOpenHashMap<class_5071>>withInitial(
      () -> {
         class_6874 var2 = new class_6874(200);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );
   private final Map<class_4774, class_4190> field_18531 = Maps.newIdentityHashMap();

   @Override
   public void method_10728(class_2203<class_2340, class_4774> var1) {
      var1.method_10162(field_18532);
   }

   @Override
   public class_1343 method_10725(class_6163 var1, BlockPos var2, class_4774 var3) {
      double var6 = 0.0;
      double var8 = 0.0;
      class_2921 var10 = new class_2921();

      for (Direction var12 : class_9594.field_48893) {
         var10.method_13371(var2, var12);
         class_4774 var13 = var1.method_28258(var10);
         if (this.method_17668(var13)) {
            float var14 = var13.method_21998();
            float var15 = 0.0F;
            if (var14 != 0.0F) {
               if (var14 > 0.0F) {
                  var15 = var3.method_21998() - var14;
               }
            } else if (!var1.method_28262(var10).method_8362().method_24502()) {
               BlockPos var16 = var10.method_6100();
               class_4774 var17 = var1.method_28258(var16);
               if (this.method_17668(var17)) {
                  var14 = var17.method_21998();
                  if (var14 > 0.0F) {
                     var15 = var3.method_21998() - (var14 - 0.8888889F);
                  }
               }
            }

            if (var15 != 0.0F) {
               var6 += (double)((float)var12.method_1041() * var15);
               var8 += (double)((float)var12.method_1034() * var15);
            }
         }
      }

      class_1343 var18 = new class_1343(var6, 0.0, var8);
      if (var3.<Boolean>method_10313(field_18532)) {
         for (Direction var20 : class_9594.field_48893) {
            var10.method_13371(var2, var20);
            if (this.method_17666(var1, var10, var20) || this.method_17666(var1, var10.method_6081(), var20)) {
               var18 = var18.method_6213().method_6214(0.0, -6.0, 0.0);
               break;
            }
         }
      }

      return var18.method_6213();
   }

   private boolean method_17668(class_4774 var1) {
      return var1.method_22001() || var1.method_22005().method_10723(this);
   }

   public boolean method_17666(class_6163 var1, BlockPos var2, Direction var3) {
      class_2522 var6 = var1.method_28262(var2);
      class_4774 var7 = var1.method_28258(var2);
      if (!var7.method_22005().method_10723(this)) {
         if (var3 != Direction.field_817) {
            return var6.method_8362() != class_5371.field_27392 ? var6.method_8308(var1, var2, var3) : false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public void method_17662(class_9379 var1, BlockPos var2, class_4774 var3) {
      if (!var3.method_22001()) {
         class_2522 var6 = var1.method_28262(var2);
         BlockPos var7 = var2.method_6100();
         class_2522 var8 = var1.method_28262(var7);
         class_4774 var9 = this.method_17651(var1, var7, var8);
         if (!this.method_17642(var1, var2, var6, Direction.field_802, var7, var8, var1.method_28258(var7), var9.method_22005())) {
            if (var3.method_21993() || !this.method_17665(var1, var9.method_22005(), var2, var6, var7, var8)) {
               this.method_17655(var1, var2, var3, var6);
            }
         } else {
            this.method_17658(var1, var7, var8, Direction.field_802, var9);
            if (this.method_17667(var1, var2) >= 3) {
               this.method_17655(var1, var2, var3, var6);
            }
         }
      }
   }

   private void method_17655(class_9379 var1, BlockPos var2, class_4774 var3, class_2522 var4) {
      int var7 = var3.method_21996() - this.method_17653(var1);
      if (var3.<Boolean>method_10313(field_18532)) {
         var7 = 7;
      }

      if (var7 > 0) {
         Map var8 = this.method_17648(var1, var2, var4);

         for (Entry var10 : var8.entrySet()) {
            Direction var11 = (Direction)var10.getKey();
            class_4774 var12 = (class_4774)var10.getValue();
            BlockPos var13 = var2.method_6098(var11);
            class_2522 var14 = var1.method_28262(var13);
            if (this.method_17642(var1, var2, var4, var11, var13, var14, var1.method_28258(var13), var12.method_22005())) {
               this.method_17658(var1, var13, var14, var11, var12);
            }
         }
      }
   }

   public class_4774 method_17651(class_4924 var1, BlockPos var2, class_2522 var3) {
      int var6 = 0;
      int var7 = 0;

      for (Direction var9 : class_9594.field_48893) {
         BlockPos var10 = var2.method_6098(var9);
         class_2522 var11 = var1.method_28262(var10);
         class_4774 var12 = var11.method_8364();
         if (var12.method_22005().method_10723(this) && this.method_17656(var9, var1, var2, var3, var10, var11)) {
            if (var12.method_21993()) {
               var7++;
            }

            var6 = Math.max(var6, var12.method_21996());
         }
      }

      if (this.method_17647() && var7 >= 2) {
         class_2522 var13 = var1.method_28262(var2.method_6100());
         class_4774 var15 = var13.method_8364();
         if (var13.method_8362().method_24499() || this.method_17660(var15)) {
            return this.method_17649(false);
         }
      }

      BlockPos var14 = var2.method_6081();
      class_2522 var16 = var1.method_28262(var14);
      class_4774 var17 = var16.method_8364();
      if (!var17.method_22001() && var17.method_22005().method_10723(this) && this.method_17656(Direction.field_817, var1, var2, var3, var14, var16)) {
         return this.method_17659(8, true);
      } else {
         int var18 = var6 - this.method_17653(var1);
         return var18 > 0 ? this.method_17659(var18, false) : class_8532.field_43673.method_10710();
      }
   }

   private boolean method_17656(Direction var1, class_6163 var2, BlockPos var3, class_2522 var4, BlockPos var5, class_2522 var6) {
      Object2ByteLinkedOpenHashMap var9;
      if (!var4.method_8360().method_29281() && !var6.method_8360().method_29281()) {
         var9 = field_18534.get();
      } else {
         var9 = null;
      }

      class_5071 var10;
      if (var9 == null) {
         var10 = null;
      } else {
         var10 = new class_5071(var4, var6, var1);
         byte var11 = var9.getAndMoveToFirst(var10);
         if (var11 != 127) {
            return var11 != 0;
         }
      }

      class_4190 var14 = var4.method_8324(var2, var3);
      class_4190 var12 = var6.method_8324(var2, var5);
      boolean var13 = !class_3370.method_15525(var14, var12, var1);
      if (var9 != null) {
         if (var9.size() == 200) {
            var9.removeLastByte();
         }

         var9.putAndMoveToFirst(var10, (byte)(!var13 ? 0 : 1));
      }

      return var13;
   }

   public abstract class_2340 method_17661();

   public class_4774 method_17659(int var1, boolean var2) {
      return this.method_17661().method_10710().method_10308(field_18533, Integer.valueOf(var1)).method_10308(field_18532, Boolean.valueOf(var2));
   }

   public abstract class_2340 method_17657();

   public class_4774 method_17649(boolean var1) {
      return this.method_17657().method_10710().method_10308(field_18532, Boolean.valueOf(var1));
   }

   public abstract boolean method_17647();

   public void method_17658(class_9379 var1, BlockPos var2, class_2522 var3, Direction var4, class_4774 var5) {
      if (!(var3.method_8360() instanceof class_4582)) {
         if (!var3.method_8345()) {
            this.method_17664(var1, var2, var3);
         }

         var1.method_7513(var2, var5.method_22006(), 3);
      } else {
         ((class_4582)var3.method_8360()).method_21237(var1, var2, var3, var5);
      }
   }

   public abstract void method_17664(class_9379 var1, BlockPos var2, class_2522 var3);

   private static short method_17650(BlockPos var0, BlockPos var1) {
      int var4 = var1.method_12173() - var0.method_12173();
      int var5 = var1.method_12185() - var0.method_12185();
      return (short)((var4 + 128 & 0xFF) << 8 | var5 + 128 & 0xFF);
   }

   public int method_17643(
      class_4924 var1,
      BlockPos var2,
      int var3,
      Direction var4,
      class_2522 var5,
      BlockPos var6,
      Short2ObjectMap<Pair<class_2522, class_4774>> var7,
      Short2BooleanMap var8
   ) {
      int var11 = 1000;

      for (Direction var13 : class_9594.field_48893) {
         if (var13 != var4) {
            BlockPos var14 = var2.method_6098(var13);
            short var15 = method_17650(var6, var14);
            Pair var16 = (Pair)var7.computeIfAbsent(var15, var2x -> {
               class_2522 var5x = var1.method_28262(var14);
               return Pair.of(var5x, var5x.method_8364());
            });
            class_2522 var17 = (class_2522)var16.getFirst();
            class_4774 var18 = (class_4774)var16.getSecond();
            if (this.method_17663(var1, this.method_17661(), var2, var5, var13, var14, var17, var18)) {
               boolean var19 = var8.computeIfAbsent(var15, var4x -> {
                  BlockPos var7x = var14.method_6100();
                  class_2522 var8x = var1.method_28262(var7x);
                  return this.method_17665(var1, this.method_17661(), var14, var17, var7x, var8x);
               });
               if (var19) {
                  return var3;
               }

               if (var3 < this.method_17654(var1)) {
                  int var20 = this.method_17643(var1, var14, var3 + 1, var13.method_1046(), var17, var6, var7, var8);
                  if (var20 < var11) {
                     var11 = var20;
                  }
               }
            }
         }
      }

      return var11;
   }

   private boolean method_17665(class_6163 var1, class_2340 var2, BlockPos var3, class_2522 var4, BlockPos var5, class_2522 var6) {
      if (this.method_17656(Direction.field_802, var1, var3, var4, var5, var6)) {
         return !var6.method_8364().method_22005().method_10723(this) ? this.method_17652(var1, var5, var6, var2) : true;
      } else {
         return false;
      }
   }

   private boolean method_17663(
           class_6163 var1, class_2340 var2, BlockPos var3, class_2522 var4, Direction var5, BlockPos var6, class_2522 var7, class_4774 var8
   ) {
      return !this.method_17660(var8) && this.method_17656(var5, var1, var3, var4, var6, var7) && this.method_17652(var1, var6, var7, var2);
   }

   private boolean method_17660(class_4774 var1) {
      return var1.method_22005().method_10723(this) && var1.method_21993();
   }

   public abstract int method_17654(class_4924 var1);

   private int method_17667(class_4924 var1, BlockPos var2) {
      int var5 = 0;

      for (Direction var7 : class_9594.field_48893) {
         BlockPos var8 = var2.method_6098(var7);
         class_4774 var9 = var1.method_28258(var8);
         if (this.method_17660(var9)) {
            var5++;
         }
      }

      return var5;
   }

   public Map<Direction, class_4774> method_17648(class_4924 var1, BlockPos var2, class_2522 var3) {
      int var6 = 1000;
      EnumMap var7 = Maps.newEnumMap(Direction.class);
      Short2ObjectOpenHashMap var8 = new Short2ObjectOpenHashMap();
      Short2BooleanOpenHashMap var9 = new Short2BooleanOpenHashMap();

      for (Direction var11 : class_9594.field_48893) {
         BlockPos var12 = var2.method_6098(var11);
         short var13 = method_17650(var2, var12);
         Pair var14 = (Pair)var8.computeIfAbsent(var13, var2x -> {
            class_2522 var5 = var1.method_28262(var12);
            return Pair.of(var5, var5.method_8364());
         });
         class_2522 var15 = (class_2522)var14.getFirst();
         class_4774 var16 = (class_4774)var14.getSecond();
         class_4774 var17 = this.method_17651(var1, var12, var15);
         if (this.method_17663(var1, var17.method_22005(), var2, var3, var11, var12, var15, var16)) {
            BlockPos var18 = var12.method_6100();
            boolean var19 = var9.computeIfAbsent(var13, var5 -> {
               class_2522 var8x = var1.method_28262(var18);
               return this.method_17665(var1, this.method_17661(), var12, var15, var18, var8x);
            });
            int var20;
            if (!var19) {
               var20 = this.method_17643(var1, var12, 1, var11.method_1046(), var15, var2, var8, var9);
            } else {
               var20 = 0;
            }

            if (var20 < var6) {
               var7.clear();
            }

            if (var20 <= var6) {
               var7.put(var11, var17);
               var6 = var20;
            }
         }
      }

      return var7;
   }

   private boolean method_17652(class_6163 var1, BlockPos var2, class_2522 var3, class_2340 var4) {
      class_6414 var7 = var3.method_8360();
      if (!(var7 instanceof class_4582)) {
         if (!(var7 instanceof class_4115)
            && !var7.method_29299(class_2351.field_11732)
            && var7 != class_4783.field_23748
            && var7 != class_4783.field_23337
            && var7 != class_4783.field_23269) {
            class_5371 var8 = var3.method_8362();
            return var8 != class_5371.field_27430 && var8 != class_5371.field_27390 && var8 != class_5371.field_27426 && var8 != class_5371.field_27410
               ? !var8.method_24502()
               : false;
         } else {
            return false;
         }
      } else {
         return ((class_4582)var7).method_21238(var1, var2, var3, var4);
      }
   }

   public boolean method_17642(
           class_6163 var1, BlockPos var2, class_2522 var3, Direction var4, BlockPos var5, class_2522 var6, class_4774 var7, class_2340 var8
   ) {
      return var7.method_22009(var1, var5, var8, var4) && this.method_17656(var4, var1, var2, var3, var5, var6) && this.method_17652(var1, var5, var6, var8);
   }

   public abstract int method_17653(class_4924 var1);

   public int method_17645(World var1, BlockPos var2, class_4774 var3, class_4774 var4) {
      return this.method_10711(var1);
   }

   @Override
   public void method_10718(World var1, BlockPos var2, class_4774 var3) {
      if (!var3.method_21993()) {
         class_4774 var6 = this.method_17651(var1, var2, var1.method_28262(var2));
         int var7 = this.method_17645(var1, var2, var3, var6);
         if (!var6.method_22001()) {
            if (!var6.equals(var3)) {
               var3 = var6;
               class_2522 var8 = var6.method_22006();
               var1.method_7513(var2, var8, 2);
               var1.method_43362().method_14011(var2, var6.method_22005(), var7);
               var1.method_29563(var2, var8.method_8360());
            }
         } else {
            var3 = var6;
            var1.method_7513(var2, class_4783.field_23184.method_29260(), 3);
         }
      }

      this.method_17662(var1, var2, var3);
   }

   public static int method_17644(class_4774 var0) {
      return !var0.method_21993() ? 8 - Math.min(var0.method_21996(), 8) + (!var0.<Boolean>method_10313(field_18532) ? 0 : 8) : 0;
   }

   private static boolean method_17646(class_4774 var0, class_6163 var1, BlockPos var2) {
      return var0.method_22005().method_10723(var1.method_28258(var2.method_6081()).method_22005());
   }

   @Override
   public float method_10707(class_4774 var1, class_6163 var2, BlockPos var3) {
      return !method_17646(var1, var2, var3) ? var1.method_21998() : 1.0F;
   }

   @Override
   public float method_10713(class_4774 var1) {
      return (float)var1.method_21996() / 9.0F;
   }

   @Override
   public class_4190 method_10712(class_4774 var1, class_6163 var2, BlockPos var3) {
      return var1.method_21996() == 9 && method_17646(var1, var2, var3)
         ? class_3370.method_15524()
         : this.field_18531.computeIfAbsent(var1, var2x -> class_3370.method_15522(0.0, 0.0, 0.0, 1.0, (double)var2x.method_22008(var2, var3), 1.0));
   }
}
