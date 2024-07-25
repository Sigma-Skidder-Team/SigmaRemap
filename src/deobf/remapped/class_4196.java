package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_4196 extends class_6414 {
   private static String[] field_20417;
   public static final class_6720 field_20407 = class_6169.field_31563;
   public static final class_6720 field_20411 = class_6169.field_31564;
   public static final class_6720 field_20415 = class_6169.field_31567;
   public static final class_6720 field_20408 = class_6169.field_31569;
   public static final class_6720 field_20409 = class_6169.field_31566;
   public static final Map<Direction, class_6720> field_20410 = class_6169.field_31571
      .entrySet()
      .stream()
      .filter(var0 -> var0.getKey() != Direction.field_802)
      .collect(Util.<Direction, class_6720>toMap());
   private static final class_4190 field_20414 = class_6414.method_29292(0.0, 15.0, 0.0, 16.0, 16.0, 16.0);
   private static final class_4190 field_20406 = class_6414.method_29292(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final class_4190 field_20413 = class_6414.method_29292(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final class_4190 field_20405 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final class_4190 field_20416 = class_6414.method_29292(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private final Map<class_2522, class_4190> field_20412;

   public class_4196(class_3073 var1) {
      super(var1);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_20407, Boolean.valueOf(false))
            .method_10308(field_20411, Boolean.valueOf(false))
            .method_10308(field_20415, Boolean.valueOf(false))
            .method_10308(field_20408, Boolean.valueOf(false))
            .method_10308(field_20409, Boolean.valueOf(false))
      );
      this.field_20412 = ImmutableMap.copyOf(this.field_32751.method_36441().stream().collect(Collectors.toMap(Function.identity(), class_4196::method_19527)));
   }

   private static class_4190 method_19527(class_2522 var0) {
      class_4190 var3 = class_3370.method_15536();
      if (var0.<Boolean>method_10313(field_20407)) {
         var3 = field_20414;
      }

      if (var0.<Boolean>method_10313(field_20411)) {
         var3 = class_3370.method_15530(var3, field_20405);
      }

      if (var0.<Boolean>method_10313(field_20408)) {
         var3 = class_3370.method_15530(var3, field_20416);
      }

      if (var0.<Boolean>method_10313(field_20415)) {
         var3 = class_3370.method_15530(var3, field_20413);
      }

      if (var0.<Boolean>method_10313(field_20409)) {
         var3 = class_3370.method_15530(var3, field_20406);
      }

      return var3;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return this.field_20412.get(var1);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      return this.method_19525(this.method_19522(var1, var2, var3));
   }

   private boolean method_19525(class_2522 var1) {
      return this.method_19519(var1) > 0;
   }

   private int method_19519(class_2522 var1) {
      int var4 = 0;

      for (class_6720 var6 : field_20410.values()) {
         if (var1.<Boolean>method_10313(var6)) {
            var4++;
         }
      }

      return var4;
   }

   private boolean method_19526(class_6163 var1, BlockPos var2, Direction var3) {
      if (var3 == Direction.field_802) {
         return false;
      } else {
         BlockPos var6 = var2.method_6098(var3);
         if (!method_19528(var1, var6, var3)) {
            if (var3.method_1029() == class_9249.field_47216) {
               return false;
            } else {
               class_6720 var7 = field_20410.get(var3);
               class_2522 var8 = var1.method_28262(var2.method_6081());
               return var8.method_8350(this) && var8.<Boolean>method_10313(var7);
            }
         } else {
            return true;
         }
      }
   }

   public static boolean method_19528(class_6163 var0, BlockPos var1, Direction var2) {
      class_2522 var5 = var0.method_28262(var1);
      return class_6414.method_29303(var5.method_8324(var0, var1), var2.method_1046());
   }

   private class_2522 method_19522(class_2522 var1, class_6163 var2, BlockPos var3) {
      BlockPos var6 = var3.method_6081();
      if (var1.<Boolean>method_10313(field_20407)) {
         var1 = var1.method_10308(field_20407, Boolean.valueOf(method_19528(var2, var6, Direction.field_802)));
      }

      class_2522 var7 = null;

      for (Direction var9 : class_9594.field_48893) {
         class_6720 var10 = method_19521(var9);
         if (var1.<Boolean>method_10313(var10)) {
            boolean var11 = this.method_19526(var2, var3, var9);
            if (!var11) {
               if (var7 == null) {
                  var7 = var2.method_28262(var6);
               }

               var11 = var7.method_8350(this) && var7.<Boolean>method_10313(var10);
            }

            var1 = var1.method_10308(var10, Boolean.valueOf(var11));
         }
      }

      return var1;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var2 != Direction.field_802) {
         class_2522 var9 = this.method_19522(var1, var4, var5);
         return this.method_19525(var9) ? var9 : class_4783.field_23184.method_29260();
      } else {
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var2.field_33033.nextInt(4) == 0) {
         Direction var7 = Direction.method_1039(var4);
         BlockPos var8 = var3.method_6081();
         if (var7.method_1029().method_42629() && !var1.<Boolean>method_10313(method_19521(var7))) {
            if (this.method_19523(var2, var3)) {
               BlockPos var19 = var3.method_6098(var7);
               class_2522 var21 = var2.method_28262(var19);
               if (!var21.method_8345()) {
                  if (method_19528(var2, var19, var7)) {
                     var2.method_7513(var3, var1.method_10308(method_19521(var7), Boolean.valueOf(true)), 2);
                  }
               } else {
                  Direction var23 = var7.method_1042();
                  Direction var24 = var7.method_1053();
                  boolean var13 = var1.<Boolean>method_10313(method_19521(var23));
                  boolean var14 = var1.<Boolean>method_10313(method_19521(var24));
                  BlockPos var15 = var19.method_6098(var23);
                  BlockPos var16 = var19.method_6098(var24);
                  if (var13 && method_19528(var2, var15, var23)) {
                     var2.method_7513(var19, this.method_29260().method_10308(method_19521(var23), Boolean.valueOf(true)), 2);
                  } else if (var14 && method_19528(var2, var16, var24)) {
                     var2.method_7513(var19, this.method_29260().method_10308(method_19521(var24), Boolean.valueOf(true)), 2);
                  } else {
                     Direction var17 = var7.method_1046();
                     if (var13 && var2.method_22548(var15) && method_19528(var2, var3.method_6098(var23), var17)) {
                        var2.method_7513(var15, this.method_29260().method_10308(method_19521(var17), Boolean.valueOf(true)), 2);
                     } else if (var14 && var2.method_22548(var16) && method_19528(var2, var3.method_6098(var24), var17)) {
                        var2.method_7513(var16, this.method_29260().method_10308(method_19521(var17), Boolean.valueOf(true)), 2);
                     } else if ((double)var2.field_33033.nextFloat() < 0.05 && method_19528(var2, var19.method_6081(), Direction.field_817)) {
                        var2.method_7513(var19, this.method_29260().method_10308(field_20407, Boolean.valueOf(true)), 2);
                     }
                  }
               }
            }
         } else {
            if (var7 == Direction.field_817 && var3.method_12165() < 255) {
               if (this.method_19526(var2, var3, var7)) {
                  var2.method_7513(var3, var1.method_10308(field_20407, Boolean.valueOf(true)), 2);
                  return;
               }

               if (var2.method_22548(var8)) {
                  if (!this.method_19523(var2, var3)) {
                     return;
                  }

                  class_2522 var18 = var1;

                  for (Direction var22 : class_9594.field_48893) {
                     if (var4.nextBoolean() || !method_19528(var2, var8.method_6098(var22), Direction.field_817)) {
                        var18 = var18.method_10308(method_19521(var22), Boolean.valueOf(false));
                     }
                  }

                  if (this.method_19520(var18)) {
                     var2.method_7513(var8, var18, 2);
                  }

                  return;
               }
            }

            if (var3.method_12165() > 0) {
               BlockPos var9 = var3.method_6100();
               class_2522 var10 = var2.method_28262(var9);
               if (var10.method_8345() || var10.method_8350(this)) {
                  class_2522 var11 = !var10.method_8345() ? var10 : this.method_29260();
                  class_2522 var12 = this.method_19524(var1, var11, var4);
                  if (var11 != var12 && this.method_19520(var12)) {
                     var2.method_7513(var9, var12, 2);
                  }
               }
            }
         }
      }
   }

   private class_2522 method_19524(class_2522 var1, class_2522 var2, Random var3) {
      for (Direction var7 : class_9594.field_48893) {
         if (var3.nextBoolean()) {
            class_6720 var8 = method_19521(var7);
            if (var1.<Boolean>method_10313(var8)) {
               var2 = var2.method_10308(var8, Boolean.valueOf(true));
            }
         }
      }

      return var2;
   }

   private boolean method_19520(class_2522 var1) {
      return var1.<Boolean>method_10313(field_20411)
         || var1.<Boolean>method_10313(field_20415)
         || var1.<Boolean>method_10313(field_20408)
         || var1.<Boolean>method_10313(field_20409);
   }

   private boolean method_19523(class_6163 var1, BlockPos var2) {
      byte var5 = 4;
      Iterable var6 = BlockPos.method_6075(
         var2.getX() - 4, var2.method_12165() - 1, var2.method_12185() - 4, var2.getX() + 4, var2.method_12165() + 1, var2.method_12185() + 4
      );
      int var7 = 5;

      for (BlockPos var9 : var6) {
         if (var1.method_28262(var9).method_8350(this)) {
            if (--var7 <= 0) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   public boolean method_10781(class_2522 var1, class_353 var2) {
      class_2522 var5 = var2.method_21862().method_28262(var2.method_21858());
      return !var5.method_8350(this) ? super.method_10781(var1, var2) : this.method_19519(var5) < field_20410.size();
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_2522 var4 = var1.method_21862().method_28262(var1.method_21858());
      boolean var5 = var4.method_8350(this);
      class_2522 var6 = !var5 ? this.method_29260() : var4;

      for (Direction var10 : var1.method_1786()) {
         if (var10 != Direction.field_802) {
            class_6720 var11 = method_19521(var10);
            boolean var12 = var5 && var4.<Boolean>method_10313(var11);
            if (!var12 && this.method_19526(var1.method_21862(), var1.method_21858(), var10)) {
               return var6.method_10308(var11, Boolean.valueOf(true));
            }
         }
      }

      return !var5 ? null : var6;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_20407, field_20411, field_20415, field_20408, field_20409);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      switch (var2) {
         case field_34338:
            return var1.method_10308(field_20411, var1.<Boolean>method_10313(field_20408))
               .method_10308(field_20415, var1.<Boolean>method_10313(field_20409))
               .method_10308(field_20408, var1.<Boolean>method_10313(field_20411))
               .method_10308(field_20409, var1.<Boolean>method_10313(field_20415));
         case field_34335:
            return var1.method_10308(field_20411, var1.<Boolean>method_10313(field_20415))
               .method_10308(field_20415, var1.<Boolean>method_10313(field_20408))
               .method_10308(field_20408, var1.<Boolean>method_10313(field_20409))
               .method_10308(field_20409, var1.<Boolean>method_10313(field_20411));
         case field_34334:
            return var1.method_10308(field_20411, var1.<Boolean>method_10313(field_20409))
               .method_10308(field_20415, var1.<Boolean>method_10313(field_20411))
               .method_10308(field_20408, var1.<Boolean>method_10313(field_20415))
               .method_10308(field_20409, var1.<Boolean>method_10313(field_20408));
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
            return var1.method_10308(field_20411, var1.<Boolean>method_10313(field_20408)).method_10308(field_20408, var1.<Boolean>method_10313(field_20411));
         case field_46144:
            return var1.method_10308(field_20415, var1.<Boolean>method_10313(field_20409)).method_10308(field_20409, var1.<Boolean>method_10313(field_20415));
         default:
            return super.method_10773(var1, var2);
      }
   }

   public static class_6720 method_19521(Direction var0) {
      return field_20410.get(var0);
   }
}
