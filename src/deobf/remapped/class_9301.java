package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class class_9301 extends class_6414 {
   private static String[] field_47506;
   public static final class_7360<class_4379> field_47510 = class_6023.field_30741;
   public static final class_7360<class_4379> field_47517 = class_6023.field_30713;
   public static final class_7360<class_4379> field_47507 = class_6023.field_30695;
   public static final class_7360<class_4379> field_47519 = class_6023.field_30720;
   public static final class_7044 field_47514 = class_6023.field_30758;
   public static final Map<Direction, class_7360<class_4379>> field_47516 = Maps.newEnumMap(
      ImmutableMap.of(Direction.field_818, field_47510, Direction.field_804, field_47517, Direction.field_800, field_47507, Direction.field_809, field_47519)
   );
   private static final class_4190 field_47515 = class_6414.method_29292(3.0, 0.0, 3.0, 13.0, 1.0, 13.0);
   private static final Map<Direction, class_4190> field_47513 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.field_818,
         class_6414.method_29292(3.0, 0.0, 0.0, 13.0, 1.0, 13.0),
         Direction.field_800,
         class_6414.method_29292(3.0, 0.0, 3.0, 13.0, 1.0, 16.0),
         Direction.field_804,
         class_6414.method_29292(3.0, 0.0, 3.0, 16.0, 1.0, 13.0),
         Direction.field_809,
         class_6414.method_29292(0.0, 0.0, 3.0, 13.0, 1.0, 13.0)
      )
   );
   private static final Map<Direction, class_4190> field_47509 = Maps.newEnumMap(
      ImmutableMap.of(
         Direction.field_818,
         class_3370.method_15530(field_47513.get(Direction.field_818), class_6414.method_29292(3.0, 0.0, 0.0, 13.0, 16.0, 1.0)),
         Direction.field_800,
         class_3370.method_15530(field_47513.get(Direction.field_800), class_6414.method_29292(3.0, 0.0, 15.0, 13.0, 16.0, 16.0)),
         Direction.field_804,
         class_3370.method_15530(field_47513.get(Direction.field_804), class_6414.method_29292(15.0, 0.0, 3.0, 16.0, 16.0, 13.0)),
         Direction.field_809,
         class_3370.method_15530(field_47513.get(Direction.field_809), class_6414.method_29292(0.0, 0.0, 3.0, 1.0, 16.0, 13.0))
      )
   );
   private final Map<class_2522, class_4190> field_47518 = Maps.newHashMap();
   private static final class_2426[] field_47511 = new class_2426[16];
   private final class_2522 field_47508;
   private boolean field_47512 = true;

   public class_9301(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_47510, class_4379.field_21485)
            .method_10308(field_47517, class_4379.field_21485)
            .method_10308(field_47507, class_4379.field_21485)
            .method_10308(field_47519, class_4379.field_21485)
            .method_10308(field_47514, Integer.valueOf(0))
      );
      this.field_47508 = this.method_29260()
         .method_10308(field_47510, class_4379.field_21487)
         .method_10308(field_47517, class_4379.field_21487)
         .method_10308(field_47507, class_4379.field_21487)
         .method_10308(field_47519, class_4379.field_21487);
      UnmodifiableIterator var4 = this.method_29306().method_36441().iterator();

      while (var4.hasNext()) {
         class_2522 var5 = (class_2522)var4.next();
         if (var5.<Integer>method_10313(field_47514) == 0) {
            this.field_47518.put(var5, this.method_42948(var5));
         }
      }
   }

   private class_4190 method_42948(class_2522 var1) {
      class_4190 var4 = field_47515;

      for (Direction var6 : class_9594.field_48893) {
         class_4379 var7 = var1.<class_4379>method_10313(field_47516.get(var6));
         if (var7 != class_4379.field_21487) {
            if (var7 == class_4379.field_21482) {
               var4 = class_3370.method_15530(var4, field_47509.get(var6));
            }
         } else {
            var4 = class_3370.method_15530(var4, field_47513.get(var6));
         }
      }

      return var4;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return this.field_47518.get(var1.method_10308(field_47514, Integer.valueOf(0)));
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_42945(var1.method_21862(), this.field_47508, var1.method_21858());
   }

   private class_2522 method_42945(class_6163 var1, class_2522 var2, BlockPos var3) {
      boolean var6 = method_42941(var2);
      var2 = this.method_42931(var1, this.method_29260().method_10308(field_47514, var2.<Integer>method_10313(field_47514)), var3);
      if (var6 && method_42941(var2)) {
         return var2;
      } else {
         boolean var7 = var2.<class_4379>method_10313(field_47510).method_20395();
         boolean var8 = var2.<class_4379>method_10313(field_47507).method_20395();
         boolean var9 = var2.<class_4379>method_10313(field_47517).method_20395();
         boolean var10 = var2.<class_4379>method_10313(field_47519).method_20395();
         boolean var11 = !var7 && !var8;
         boolean var12 = !var9 && !var10;
         if (!var10 && var11) {
            var2 = var2.method_10308(field_47519, class_4379.field_21487);
         }

         if (!var9 && var11) {
            var2 = var2.method_10308(field_47517, class_4379.field_21487);
         }

         if (!var7 && var12) {
            var2 = var2.method_10308(field_47510, class_4379.field_21487);
         }

         if (!var8 && var12) {
            var2 = var2.method_10308(field_47507, class_4379.field_21487);
         }

         return var2;
      }
   }

   private class_2522 method_42931(class_6163 var1, class_2522 var2, BlockPos var3) {
      boolean var6 = !var1.method_28262(var3.method_6081()).method_8356(var1, var3);

      for (Direction var8 : class_9594.field_48893) {
         if (!var2.<class_4379>method_10313(field_47516.get(var8)).method_20395()) {
            class_4379 var9 = this.method_42933(var1, var3, var8, var6);
            var2 = var2.method_10308(field_47516.get(var8), var9);
         }
      }

      return var2;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.field_802) {
         if (var2 == Direction.field_817) {
            return this.method_42945(var4, var1, var5);
         } else {
            class_4379 var9 = this.method_42937(var4, var5, var2);
            return var9.method_20395() == var1.<class_4379>method_10313(field_47516.get(var2)).method_20395() && !method_42938(var1)
               ? var1.method_10308(field_47516.get(var2), var9)
               : this.method_42945(
                  var4, this.field_47508.method_10308(field_47514, var1.<Integer>method_10313(field_47514)).method_10308(field_47516.get(var2), var9), var5
               );
         }
      } else {
         return var1;
      }
   }

   private static boolean method_42938(class_2522 var0) {
      return var0.<class_4379>method_10313(field_47510).method_20395()
         && var0.<class_4379>method_10313(field_47507).method_20395()
         && var0.<class_4379>method_10313(field_47517).method_20395()
         && var0.<class_4379>method_10313(field_47519).method_20395();
   }

   private static boolean method_42941(class_2522 var0) {
      return !var0.<class_4379>method_10313(field_47510).method_20395()
         && !var0.<class_4379>method_10313(field_47507).method_20395()
         && !var0.<class_4379>method_10313(field_47517).method_20395()
         && !var0.<class_4379>method_10313(field_47519).method_20395();
   }

   @Override
   public void method_10804(class_2522 var1, class_9379 var2, BlockPos var3, int var4, int var5) {
      class_2921 var8 = new class_2921();

      for (Direction var10 : class_9594.field_48893) {
         class_4379 var11 = var1.<class_4379>method_10313(field_47516.get(var10));
         if (var11 != class_4379.field_21485 && !var2.method_28262(var8.method_13371(var3, var10)).method_8350(this)) {
            var8.method_13368(Direction.field_802);
            class_2522 var12 = var2.method_28262(var8);
            if (!var12.method_8350(class_4783.field_23367)) {
               BlockPos var13 = var8.method_6098(var10.method_1046());
               class_2522 var14 = var12.method_8359(var10.method_1046(), var2.method_28262(var13), var2, var8, var13);
               method_29291(var12, var14, var2, var8, var4, var5);
            }

            var8.method_13371(var3, var10).method_13368(Direction.field_817);
            class_2522 var16 = var2.method_28262(var8);
            if (!var16.method_8350(class_4783.field_23367)) {
               BlockPos var17 = var8.method_6098(var10.method_1046());
               class_2522 var15 = var16.method_8359(var10.method_1046(), var2.method_28262(var17), var2, var8, var17);
               method_29291(var16, var15, var2, var8, var4, var5);
            }
         }
      }
   }

   private class_4379 method_42937(class_6163 var1, BlockPos var2, Direction var3) {
      return this.method_42933(var1, var2, var3, !var1.method_28262(var2.method_6081()).method_8356(var1, var2));
   }

   private class_4379 method_42933(class_6163 var1, BlockPos var2, Direction var3, boolean var4) {
      BlockPos var7 = var2.method_6098(var3);
      class_2522 var8 = var1.method_28262(var7);
      if (var4) {
         boolean var9 = this.method_42947(var1, var7, var8);
         if (var9 && method_42935(var1.method_28262(var7.method_6081()))) {
            if (!var8.method_8308(var1, var7, var3.method_1046())) {
               return class_4379.field_21487;
            }

            return class_4379.field_21482;
         }
      }

      return !method_42936(var8, var3) && (var8.method_8356(var1, var7) || !method_42935(var1.method_28262(var7.method_6100())))
         ? class_4379.field_21485
         : class_4379.field_21487;
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      BlockPos var6 = var3.method_6100();
      class_2522 var7 = var2.method_28262(var6);
      return this.method_42947(var2, var6, var7);
   }

   private boolean method_42947(class_6163 var1, BlockPos var2, class_2522 var3) {
      return var3.method_8308(var1, var2, Direction.field_817) || var3.method_8350(class_4783.field_23698);
   }

   private void method_42944(World var1, BlockPos var2, class_2522 var3) {
      int var6 = this.method_42943(var1, var2);
      if (var3.<Integer>method_10313(field_47514) != var6) {
         if (var1.method_28262(var2) == var3) {
            var1.method_7513(var2, var3.method_10308(field_47514, Integer.valueOf(var6)), 2);
         }

         HashSet var7 = Sets.newHashSet();
         var7.add(var2);

         for (Direction var11 : Direction.values()) {
            var7.add(var2.method_6098(var11));
         }

         for (BlockPos var13 : var7) {
            var1.method_29563(var13, this);
         }
      }
   }

   private int method_42943(World var1, BlockPos var2) {
      this.field_47512 = false;
      int var5 = var1.method_29565(var2);
      this.field_47512 = true;
      int var6 = 0;
      if (var5 < 15) {
         for (Direction var8 : class_9594.field_48893) {
            BlockPos var9 = var2.method_6098(var8);
            class_2522 var10 = var1.method_28262(var9);
            var6 = Math.max(var6, this.method_42939(var10));
            BlockPos var11 = var2.method_6081();
            if (var10.method_8356(var1, var9) && !var1.method_28262(var11).method_8356(var1, var11)) {
               var6 = Math.max(var6, this.method_42939(var1.method_28262(var9.method_6081())));
            } else if (!var10.method_8356(var1, var9)) {
               var6 = Math.max(var6, this.method_42939(var1.method_28262(var9.method_6100())));
            }
         }
      }

      return Math.max(var5, var6 - 1);
   }

   private int method_42939(class_2522 var1) {
      return !var1.method_8350(this) ? 0 : var1.<Integer>method_10313(field_47514);
   }

   private void method_42934(World var1, BlockPos var2) {
      if (var1.method_28262(var2).method_8350(this)) {
         var1.method_29563(var2, this);

         for (Direction var8 : Direction.values()) {
            var1.method_29563(var2.method_6098(var8), this);
         }
      }
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var4.method_8350(var1.method_8360()) && !var2.field_33055) {
         this.method_42944(var2, var3, var1);

         for (Direction var9 : class_9594.field_48896) {
            var2.method_29563(var3.method_6098(var9), this);
         }

         this.method_42932(var2, var3);
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var5 && !var1.method_8350(var4.method_8360())) {
         super.method_10761(var1, var2, var3, var4, var5);
         if (!var2.field_33055) {
            for (Direction var11 : Direction.values()) {
               var2.method_29563(var3.method_6098(var11), this);
            }

            this.method_42944(var2, var3, var1);
            this.method_42932(var2, var3);
         }
      }
   }

   private void method_42932(World var1, BlockPos var2) {
      for (Direction var6 : class_9594.field_48893) {
         this.method_42934(var1, var2.method_6098(var6));
      }

      for (Direction var9 : class_9594.field_48893) {
         BlockPos var7 = var2.method_6098(var9);
         if (!var1.method_28262(var7).method_8356(var1, var7)) {
            this.method_42934(var1, var7.method_6100());
         } else {
            this.method_42934(var1, var7.method_6081());
         }
      }
   }

   @Override
   public void method_10801(class_2522 var1, World var2, BlockPos var3, class_6414 var4, BlockPos var5, boolean var6) {
      if (!var2.field_33055) {
         if (!var1.method_8309(var2, var3)) {
            method_29294(var1, var2, var3);
            var2.method_7508(var3, false);
         } else {
            this.method_42944(var2, var3, var1);
         }
      }
   }

   @Override
   public int method_10778(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      return this.field_47512 ? var1.method_8327(var2, var3, var4) : 0;
   }

   @Override
   public int method_10766(class_2522 var1, class_6163 var2, BlockPos var3, Direction var4) {
      if (this.field_47512 && var4 != Direction.field_802) {
         int var7 = var1.<Integer>method_10313(field_47514);
         if (var7 == 0) {
            return 0;
         } else {
            return var4 != Direction.field_817
                  && !this.method_42945(var2, var1, var3).<class_4379>method_10313(field_47516.get(var4.method_1046())).method_20395()
               ? 0
               : var7;
         }
      } else {
         return 0;
      }
   }

   public static boolean method_42935(class_2522 var0) {
      return method_42936(var0, (Direction)null);
   }

   public static boolean method_42936(class_2522 var0, Direction var1) {
      if (var0.method_8350(class_4783.field_23349)) {
         return true;
      } else if (!var0.method_8350(class_4783.field_23350)) {
         return var0.method_8350(class_4783.field_23367) ? var1 == var0.<Direction>method_10313(class_7068.field_16180) : var0.method_8355() && var1 != null;
      } else {
         Direction var4 = var0.<Direction>method_10313(class_6218.field_1543);
         return var4 == var1 || var4.method_1046() == var1;
      }
   }

   @Override
   public boolean method_10771(class_2522 var1) {
      return this.field_47512;
   }

   public static int method_42946(int var0) {
      class_2426 var3 = field_47511[var0];
      return class_9299.method_42796(var3.method_11057(), var3.method_11061(), var3.method_11055());
   }

   private void method_42940(World var1, Random var2, BlockPos var3, class_2426 var4, Direction var5, Direction var6, float var7, float var8) {
      float var11 = var8 - var7;
      if (!(var2.nextFloat() >= 0.2F * var11)) {
         float var12 = 0.4375F;
         float var13 = var7 + var11 * var2.nextFloat();
         double var14 = 0.5 + (double)(0.4375F * (float)var5.method_1041()) + (double)(var13 * (float)var6.method_1041());
         double var16 = 0.5 + (double)(0.4375F * (float)var5.method_1054()) + (double)(var13 * (float)var6.method_1054());
         double var18 = 0.5 + (double)(0.4375F * (float)var5.method_1034()) + (double)(var13 * (float)var6.method_1034());
         var1.method_43361(
            new class_5727(var4.method_11057(), var4.method_11061(), var4.method_11055(), 1.0F),
            (double)var3.method_12173() + var14,
            (double)var3.method_12165() + var16,
            (double)var3.method_12185() + var18,
            0.0,
            0.0,
            0.0
         );
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      int var7 = var1.<Integer>method_10313(field_47514);
      if (var7 != 0) {
         for (Direction var9 : class_9594.field_48893) {
            class_4379 var10 = var1.<class_4379>method_10313(field_47516.get(var9));
            switch (var10) {
               case field_21482:
                  this.method_42940(var2, var4, var3, field_47511[var7], var9, Direction.field_817, -0.5F, 0.5F);
               case field_21487:
                  this.method_42940(var2, var4, var3, field_47511[var7], Direction.field_802, var9, 0.0F, 0.5F);
                  break;
               case field_21485:
               default:
                  this.method_42940(var2, var4, var3, field_47511[var7], Direction.field_802, var9, 0.0F, 0.3F);
            }
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            return var1.method_10308(field_47510, var1.<class_4379>method_10313(field_47507))
               .method_10308(field_47517, var1.<class_4379>method_10313(field_47519))
               .method_10308(field_47507, var1.<class_4379>method_10313(field_47510))
               .method_10308(field_47519, var1.<class_4379>method_10313(field_47517));
         case field_34335:
            return var1.method_10308(field_47510, var1.<class_4379>method_10313(field_47517))
               .method_10308(field_47517, var1.<class_4379>method_10313(field_47507))
               .method_10308(field_47507, var1.<class_4379>method_10313(field_47519))
               .method_10308(field_47519, var1.<class_4379>method_10313(field_47510));
         case field_34334:
            return var1.method_10308(field_47510, var1.<class_4379>method_10313(field_47519))
               .method_10308(field_47517, var1.<class_4379>method_10313(field_47510))
               .method_10308(field_47507, var1.<class_4379>method_10313(field_47517))
               .method_10308(field_47519, var1.<class_4379>method_10313(field_47507));
         default:
            return var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      switch (var2) {
         case field_46148:
            return var1.method_10308(field_47510, var1.<class_4379>method_10313(field_47507))
               .method_10308(field_47507, var1.<class_4379>method_10313(field_47510));
         case field_46144:
            return var1.method_10308(field_47517, var1.<class_4379>method_10313(field_47519))
               .method_10308(field_47519, var1.<class_4379>method_10313(field_47517));
         default:
            return super.method_10773(var1, var2);
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_47510, field_47517, field_47507, field_47519, field_47514);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      if (!var4.playerAbilities.allowEdit) {
         return class_6910.field_35521;
      } else {
         if (method_42938(var1) || method_42941(var1)) {
            class_2522 var9 = !method_42938(var1) ? this.field_47508 : this.method_29260();
            var9 = var9.method_10308(field_47514, var1.<Integer>method_10313(field_47514));
            var9 = this.method_42945(var2, var9, var3);
            if (var9 != var1) {
               var2.method_7513(var3, var9, 3);
               this.method_42942(var2, var3, var1, var9);
               return class_6910.field_35520;
            }
         }

         return class_6910.field_35521;
      }
   }

   private void method_42942(World var1, BlockPos var2, class_2522 var3, class_2522 var4) {
      for (Direction var8 : class_9594.field_48893) {
         BlockPos var9 = var2.method_6098(var8);
         if (var3.<class_4379>method_10313(field_47516.get(var8)).method_20395() != var4.<class_4379>method_10313(field_47516.get(var8)).method_20395()
            && var1.method_28262(var9).method_8356(var1, var9)) {
            var1.method_29526(var9, var4.method_8360(), var8.method_1046());
         }
      }
   }

   static {
      for (int var2 = 0; var2 <= 15; var2++) {
         float var3 = (float)var2 / 15.0F;
         float var4 = var3 * 0.6F + (!(var3 > 0.0F) ? 0.3F : 0.4F);
         float var5 = class_9299.method_42828(var3 * var3 * 0.7F - 0.5F, 0.0F, 1.0F);
         float var6 = class_9299.method_42828(var3 * var3 * 0.6F - 0.7F, 0.0F, 1.0F);
         field_47511[var2] = new class_2426(var4, var5, var6);
      }
   }
}
