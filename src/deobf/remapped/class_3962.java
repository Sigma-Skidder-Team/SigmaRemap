package remapped;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class_3962 extends class_5920<class_5834> {
   private static String[] field_19193;
   private final float field_19191;
   private final int field_19189;
   private final int field_19190;
   private Optional<BlockPos> field_19192 = Optional.<BlockPos>empty();

   public class_3962(int var1, float var2, int var3) {
      super(
         ImmutableMap.of(
            class_6044.field_30889, class_561.field_3318, class_6044.field_30854, class_561.field_3319, class_6044.field_30899, class_561.field_3319
         )
      );
      this.field_19189 = var1;
      this.field_19191 = var2;
      this.field_19190 = var3;
   }

   @Override
   public boolean method_27088(class_6331 var1, class_5834 var2) {
      Optional var5 = var1.method_28969()
         .method_6876(var0 -> var0 == class_236.field_778, var0 -> true, var2.method_37075(), this.field_19190 + 1, class_8122.field_41615);
      if (var5.isPresent() && ((BlockPos)var5.get()).method_12170(var2.method_37245(), (double)this.field_19190)) {
         this.field_19192 = var5;
      } else {
         this.field_19192 = Optional.<BlockPos>empty();
      }

      return true;
   }

   @Override
   public void method_27080(class_6331 var1, class_5834 var2, long var3) {
      class_1150 var7 = var2.method_26525();
      Optional var8 = this.field_19192;
      if (!var8.isPresent()) {
         var8 = var1.method_28969()
            .method_6881(var0 -> var0 == class_236.field_778, var0 -> true, class_8122.field_41615, var2.method_37075(), this.field_19189, var2.method_26594());
         if (!var8.isPresent()) {
            Optional var9 = var7.<class_8150>method_5138(class_6044.field_30854);
            if (var9.isPresent()) {
               var8 = Optional.<BlockPos>of(((class_8150)var9.get()).method_37409());
            }
         }
      }

      if (var8.isPresent()) {
         var7.method_5127(class_6044.field_30888);
         var7.method_5127(class_6044.field_30874);
         var7.method_5127(class_6044.field_30892);
         var7.method_5127(class_6044.field_30861);
         var7.method_5105(class_6044.field_30899, class_8150.method_37410(var1.method_29545(), (BlockPos)var8.get()));
         if (!((BlockPos)var8.get()).method_12170(var2.method_37245(), (double)this.field_19190)) {
            var7.method_5105(class_6044.field_30889, new class_6651((BlockPos)var8.get(), this.field_19191, this.field_19190));
         }
      }
   }
}
