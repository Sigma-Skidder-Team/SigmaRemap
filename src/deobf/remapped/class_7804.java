package remapped;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

public class class_7804 extends class_4314 {
   private static String[] field_39513;
   public static final class_6162 field_39514 = class_1166.field_16180;
   public static final class_7360<class_989> field_39512 = class_1166.field_6616;

   public class_7804(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_39514, Direction.field_818).method_10308(field_39512, class_989.field_5039));
   }

   @Nullable
   @Override
   public class_3757 method_3281(class_6163 var1) {
      return null;
   }

   public static class_3757 method_35382(class_2522 var0, Direction var1, boolean var2, boolean var3) {
      return new class_3420(var0, var1, var2, var3);
   }

   @Override
   public void method_10761(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      if (!var1.method_8350(var4.method_8360())) {
         class_3757 var8 = var2.method_28260(var3);
         if (var8 instanceof class_3420) {
            ((class_3420)var8).method_15795();
         }
      }
   }

   @Override
   public void method_29290(class_9379 var1, BlockPos var2, class_2522 var3) {
      BlockPos var6 = var2.method_6098(var3.<Direction>method_10313(field_39514).method_1046());
      class_2522 var7 = var1.method_28262(var6);
      if (var7.method_8360() instanceof class_1990 && var7.<Boolean>method_10313(class_1990.field_10077)) {
         var1.method_7508(var6, false);
      }
   }

   @Override
   public class_6910 method_10777(class_2522 var1, World var2, BlockPos var3, class_704 var4, Hand var5, class_9529 var6) {
      if (!var2.field_33055 && var2.method_28260(var3) == null) {
         var2.method_7508(var3, false);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35521;
      }
   }

   @Override
   public List<ItemStack> method_10796(class_2522 var1, class_8480 var2) {
      class_3420 var5 = this.method_35383(var2.method_39060(), new BlockPos(var2.<class_1343>method_39062(class_8712.field_44671)));
      return var5 != null ? var5.method_15792().method_8333(var2) : Collections.<ItemStack>emptyList();
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return class_3370.method_15536();
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      class_3420 var7 = this.method_35383(var2, var3);
      return var7 == null ? class_3370.method_15536() : var7.method_15801(var2, var3);
   }

   @Nullable
   private class_3420 method_35383(class_6163 var1, BlockPos var2) {
      class_3757 var5 = var1.method_28260(var2);
      return !(var5 instanceof class_3420) ? null : (class_3420)var5;
   }

   @Override
   public ItemStack method_29276(class_6163 var1, BlockPos var2, class_2522 var3) {
      return ItemStack.EMPTY;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_39514, var2.method_30489(var1.<Direction>method_10313(field_39514)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_39514)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_39514, field_39512);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
