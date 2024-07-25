package remapped;

import java.util.Objects;
import java.util.Spliterators.AbstractSpliterator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class class_4491 extends AbstractSpliterator<class_4190> {
   private static String[] field_21960;
   private final Entity field_21953;
   private final Box field_21958;
   private final class_214 field_21955;
   private final class_6281 field_21959;
   private final class_2921 field_21957;
   private final class_4190 field_21954;
   private final class_1449 field_21952;
   private boolean field_21951;
   private final BiPredicate<class_2522, BlockPos> field_21956;

   public class_4491(class_1449 var1, Entity var2, Box var3) {
      this(var1, var2, var3, (var0, var1x) -> true);
   }

   public class_4491(class_1449 var1, Entity var2, Box var3, BiPredicate<class_2522, BlockPos> var4) {
      super(Long.MAX_VALUE, 1280);
      this.field_21955 = var2 != null ? class_214.method_926(var2) : class_214.method_928();
      this.field_21957 = new class_2921();
      this.field_21954 = class_3370.method_15523(var3);
      this.field_21952 = var1;
      this.field_21951 = var2 != null;
      this.field_21953 = var2;
      this.field_21958 = var3;
      this.field_21956 = var4;
      int var7 = MathHelper.floor(var3.field_19941 - 1.0E-7) - 1;
      int var8 = MathHelper.floor(var3.field_19940 + 1.0E-7) + 1;
      int var9 = MathHelper.floor(var3.field_19937 - 1.0E-7) - 1;
      int var10 = MathHelper.floor(var3.field_19939 + 1.0E-7) + 1;
      int var11 = MathHelper.floor(var3.field_19938 - 1.0E-7) - 1;
      int var12 = MathHelper.floor(var3.field_19942 + 1.0E-7) + 1;
      this.field_21959 = new class_6281(var7, var9, var11, var8, var10, var12);
   }

   @Override
   public boolean tryAdvance(Consumer<? super class_4190> var1) {
      return this.field_21951 && this.method_20872(var1) || this.method_20867(var1);
   }

   public boolean method_20867(Consumer<? super class_4190> var1) {
      while (this.field_21959.method_28626()) {
         int var4 = this.field_21959.method_28624();
         int var5 = this.field_21959.method_28628();
         int var6 = this.field_21959.method_28623();
         int var7 = this.field_21959.method_28625();
         if (var7 != 3) {
            class_6163 var8 = this.method_20873(var4, var6);
            if (var8 != null) {
               this.field_21957.method_13362(var4, var5, var6);
               class_2522 var9 = var8.method_28262(this.field_21957);
               if (this.field_21956.test(var9, this.field_21957)
                  && (var7 != 1 || var9.method_8357())
                  && (var7 != 2 || var9.method_8350(class_4783.field_23833))) {
                  class_4190 var10 = var9.method_8325(this.field_21952, this.field_21957, this.field_21955);
                  if (this.field_21953 instanceof PlayerEntity) {
                     class_5243 var11 = new class_5243(this.field_21957, var10);
                     SigmaMainClass.getInstance().getEventManager().call(var11);
                     var10 = var11.method_23988();
                     if (var11.method_29716()) {
                        return false;
                     }
                  }

                  if (var10 != class_3370.method_15524()) {
                     class_4190 var12 = var10.method_19496((double)var4, (double)var5, (double)var6);
                     if (class_3370.method_15537(var12, this.field_21954, class_8529.field_43655)) {
                        var1.accept(var12);
                        return true;
                     }
                  } else if (this.field_21958
                     .method_18907((double)var4, (double)var5, (double)var6, (double)var4 + 1.0, (double)var5 + 1.0, (double)var6 + 1.0)) {
                     var1.accept(var10.method_19496((double)var4, (double)var5, (double)var6));
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private class_6163 method_20873(int var1, int var2) {
      int var5 = var1 >> 4;
      int var6 = var2 >> 4;
      return this.field_21952.method_6675(var5, var6);
   }

   public boolean method_20872(Consumer<? super class_4190> var1) {
      Objects.<Entity>requireNonNull(this.field_21953);
      this.field_21951 = false;
      class_2098 var4 = this.field_21952.method_6673();
      Box var5 = this.field_21953.getBoundingBox();
      if (!method_20868(var4, var5)) {
         class_4190 var6 = var4.method_9820();
         if (!method_20871(var6, var5) && method_20870(var6, var5)) {
            var1.accept(var6);
            return true;
         }
      }

      return false;
   }

   private static boolean method_20870(class_4190 var0, Box var1) {
      return class_3370.method_15537(var0, class_3370.method_15523(var1.grow(1.0E-7)), class_8529.field_43655);
   }

   private static boolean method_20871(class_4190 var0, Box var1) {
      return class_3370.method_15537(var0, class_3370.method_15523(var1.method_18924(1.0E-7)), class_8529.field_43655);
   }

   public static boolean method_20868(class_2098 var0, Box var1) {
      double var4 = (double) MathHelper.floor(var0.method_9821());
      double var6 = (double) MathHelper.floor(var0.method_9825());
      double var8 = (double) MathHelper.ceil(var0.method_9828());
      double var10 = (double) MathHelper.ceil(var0.method_9816());
      return var1.field_19941 > var4
         && var1.field_19941 < var8
         && var1.field_19938 > var6
         && var1.field_19938 < var10
         && var1.field_19940 > var4
         && var1.field_19940 < var8
         && var1.field_19942 > var6
         && var1.field_19942 < var10;
   }
}
