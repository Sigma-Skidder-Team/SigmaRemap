package remapped;

import java.util.Random;
import java.util.stream.IntStream;

public class class_3049 extends class_6414 implements class_2593 {
   private static String[] field_14949;
   public static final class_6162 field_14946 = class_380.field_1543;
   public static final class_7360<class_5122> field_14955 = class_6023.field_30709;
   public static final class_7360<class_476> field_14957 = class_6023.field_30756;
   public static final class_6720 field_14961 = class_6023.field_30719;
   public static final class_4190 field_14959 = class_6344.field_32394;
   public static final class_4190 field_14952 = class_6344.field_32396;
   public static final class_4190 field_14951 = class_6414.method_29292(0.0, 0.0, 0.0, 8.0, 8.0, 8.0);
   public static final class_4190 field_14943 = class_6414.method_29292(0.0, 0.0, 8.0, 8.0, 8.0, 16.0);
   public static final class_4190 field_14948 = class_6414.method_29292(0.0, 8.0, 0.0, 8.0, 16.0, 8.0);
   public static final class_4190 field_14960 = class_6414.method_29292(0.0, 8.0, 8.0, 8.0, 16.0, 16.0);
   public static final class_4190 field_14944 = class_6414.method_29292(8.0, 0.0, 0.0, 16.0, 8.0, 8.0);
   public static final class_4190 field_14958 = class_6414.method_29292(8.0, 0.0, 8.0, 16.0, 8.0, 16.0);
   public static final class_4190 field_14954 = class_6414.method_29292(8.0, 8.0, 0.0, 16.0, 16.0, 8.0);
   public static final class_4190 field_14956 = class_6414.method_29292(8.0, 8.0, 8.0, 16.0, 16.0, 16.0);
   public static final class_4190[] field_14945 = method_13930(field_14959, field_14951, field_14944, field_14943, field_14958);
   public static final class_4190[] field_14950 = method_13930(field_14952, field_14948, field_14954, field_14960, field_14956);
   private static final int[] field_14962 = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
   private final class_6414 field_14947;
   private final class_2522 field_14953;

   private static class_4190[] method_13930(class_4190 var0, class_4190 var1, class_4190 var2, class_4190 var3, class_4190 var4) {
      return IntStream.range(0, 16).<class_4190>mapToObj(var5 -> method_13928(var5, var0, var1, var2, var3, var4)).<class_4190>toArray(class_4190[]::new);
   }

   // $VF: Irreducible bytecode was duplicated to produce valid code
   private static class_4190 method_13928(int var0, class_4190 var1, class_4190 var2, class_4190 var3, class_4190 var4, class_4190 var5) {
      int var6 = -1615302540;

      label28:
      while (true) {
         label25: {
            if ((var6 & 1073741824) == 0) {
               if ((var6 & 1) == 0) {
               }
            } else if ((var6 & 262144) == 0) {
               break label25;
            }

            do {
               if ((var6 & 8192) != 0 && (var6 & 2097152) == 0) {
                  continue label28;
               }
            } while ((var6 & 262144) != 0);
         }

         if ((var6 & 268435456) != 0) {
            return var1;
         }
      }
   }

   public class_3049(class_2522 var1, class_3073 var2) {
      super(var2);
      this.method_29284(
         this.field_32751
            .method_36446()
            .method_10308(field_14946, Direction.field_818)
            .method_10308(field_14955, class_5122.field_26439)
            .method_10308(field_14957, class_476.field_2961)
            .method_10308(field_14961, Boolean.valueOf(false))
      );
      this.field_14947 = var1.method_8360();
      this.field_14953 = var1;
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return (var1.method_10313(field_14955) != class_5122.field_26440 ? field_14950 : field_14945)[field_14962[this.method_13932(var1)]];
   }

   private int method_13932(class_2522 var1) {
      return var1.<class_476>method_10313(field_14957).ordinal() * 4 + var1.<Direction>method_10313(field_14946).method_1031();
   }

   @Override
   public void method_29280(class_2522 var1, World var2, BlockPos var3, Random var4) {
      this.field_14947.method_29280(var1, var2, var3, var4);
   }

   @Override
   public void method_10791(class_2522 var1, World var2, BlockPos var3, class_704 var4) {
      this.field_14953.method_8307(var2, var3, var4);
   }

   @Override
   public void method_29290(class_9379 var1, BlockPos var2, class_2522 var3) {
      this.field_14947.method_29290(var1, var2, var3);
   }

   @Override
   public float method_29264() {
      return this.field_14947.method_29264();
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var1.method_8360())) {
         this.field_14953.method_8343(var2, var3, class_4783.field_23184, var3, false);
         this.field_14947.method_10760(this.field_14953, var2, var3, var4, false);
      }
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         this.field_14953.method_8301(var2, var3, var4, var5);
      }
   }

   @Override
   public void method_29286(World var1, BlockPos var2, Entity var3) {
      this.field_14947.method_29286(var1, var2, var3);
   }

   @Override
   public boolean method_29300(class_2522 var1) {
      return this.field_14947.method_29300(var1);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      this.field_14947.method_10783(var1, var2, var3, var4);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      this.field_14947.method_10797(var1, var2, var3, var4);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      return this.field_14953.method_8322(var2, var4, var5, var6);
   }

   @Override
   public void method_29279(World var1, BlockPos var2, class_2730 var3) {
      this.field_14947.method_29279(var1, var2, var3);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      Direction var4 = var1.method_21857();
      BlockPos var5 = var1.method_21858();
      class_4774 var6 = var1.method_21862().method_28258(var5);
      class_2522 var7 = this.method_29260()
         .method_10308(field_14946, var1.method_21863())
         .method_10308(
            field_14955,
            var4 != Direction.field_802 && (var4 == Direction.field_817 || !(var1.method_21865().field_7333 - (double)var5.method_12165() > 0.5))
               ? class_5122.field_26439
               : class_5122.field_26440
         )
         .method_10308(field_14961, Boolean.valueOf(var6.method_22005() == class_8532.field_43674));
      return var7.method_10308(field_14957, method_13931(var7, var1.method_21862(), var5));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method_10313(field_14961)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return !var2.method_1029().method_42629()
         ? super.method_10763(var1, var2, var3, var4, var5, var6)
         : var1.method_10308(field_14957, method_13931(var1, var4, var5));
   }

   public static class_476 method_13931(class_2522 var0, class_6163 var1, BlockPos var2) {
      Direction var5 = var0.<Direction>method_10313(field_14946);
      class_2522 var6 = var1.method_28262(var2.method_6098(var5));
      if (method_13929(var6) && var0.<class_5122>method_10313(field_14955) == var6.<class_5122>method_10313(field_14955)) {
         Direction var7 = var6.<Direction>method_10313(field_14946);
         if (var7.method_1029() != var0.<Direction>method_10313(field_14946).method_1029() && method_13927(var0, var1, var2, var7.method_1046())) {
            if (var7 != var5.method_1053()) {
               return class_476.field_2960;
            }

            return class_476.field_2964;
         }
      }

      class_2522 var9 = var1.method_28262(var2.method_6098(var5.method_1046()));
      if (method_13929(var9) && var0.<class_5122>method_10313(field_14955) == var9.<class_5122>method_10313(field_14955)) {
         Direction var8 = var9.<Direction>method_10313(field_14946);
         if (var8.method_1029() != var0.<Direction>method_10313(field_14946).method_1029() && method_13927(var0, var1, var2, var8)) {
            if (var8 != var5.method_1053()) {
               return class_476.field_2963;
            }

            return class_476.field_2962;
         }
      }

      return class_476.field_2961;
   }

   private static boolean method_13927(class_2522 var0, class_6163 var1, BlockPos var2, Direction var3) {
      class_2522 var6 = var1.method_28262(var2.method_6098(var3));
      return !method_13929(var6)
         || var6.<Direction>method_10313(field_14946) != var0.<Direction>method_10313(field_14946)
         || var6.<class_5122>method_10313(field_14955) != var0.<class_5122>method_10313(field_14955);
   }

   public static boolean method_13929(class_2522 var0) {
      return var0.method_8360() instanceof class_3049;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_14946, var2.method_30489(var1.<Direction>method_10313(field_14946)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      Direction var5 = var1.<Direction>method_10313(field_14946);
      class_476 var6 = var1.<class_476>method_10313(field_14957);
      switch (var2) {
         case field_46148:
            if (var5.method_1029() == class_9249.field_47219) {
               switch (var6) {
                  case field_2962:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2963);
                  case field_2963:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2962);
                  case field_2964:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2960);
                  case field_2960:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2964);
                  default:
                     return var1.method_8318(class_6631.field_34338);
               }
            }
            break;
         case field_46144:
            if (var5.method_1029() == class_9249.field_47215) {
               switch (var6) {
                  case field_2962:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2962);
                  case field_2963:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2963);
                  case field_2964:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2960);
                  case field_2960:
                     return var1.method_8318(class_6631.field_34338).method_10308(field_14957, class_476.field_2964);
                  case field_2961:
                     return var1.method_8318(class_6631.field_34338);
               }
            }
      }

      return super.method_10773(var1, var2);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_14946, field_14955, field_14957, field_14961);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_14961) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
