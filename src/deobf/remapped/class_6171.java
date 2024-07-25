package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import javax.annotation.Nullable;

public class class_6171 extends class_2103 {
   public static final Codec<class_6171> field_31577 = Codec.FLOAT.fieldOf("mossiness").xmap(class_6171::new, var0 -> var0.field_31576).codec();
   private final float field_31576;

   public class_6171(float var1) {
      this.field_31576 = var1;
   }

   @Nullable
   @Override
   public class_4099 method_9859(class_4924 var1, BlockPos var2, BlockPos var3, class_4099 var4, class_4099 var5, class_8478 var6) {
      Random var9 = var6.method_39052(var5.field_19965);
      class_2522 var10 = var5.field_19967;
      BlockPos var11 = var5.field_19965;
      class_2522 var12 = null;
      if (var10.method_8350(class_4783.field_23355) || var10.method_8350(class_4783.field_23644) || var10.method_8350(class_4783.field_23543)) {
         var12 = this.method_28290(var9);
      } else if (!var10.method_8349(class_2351.field_11797)) {
         if (!var10.method_8349(class_2351.field_11790)) {
            if (!var10.method_8349(class_2351.field_11759)) {
               if (var10.method_8350(class_4783.field_23881)) {
                  var12 = this.method_28288(var9);
               }
            } else {
               var12 = this.method_28285(var9);
            }
         } else {
            var12 = this.method_28287(var9);
         }
      } else {
         var12 = this.method_28286(var9, var5.field_19967);
      }

      return var12 == null ? var5 : new class_4099(var11, var12, var5.field_19968);
   }

   @Nullable
   private class_2522 method_28290(Random var1) {
      if (!(var1.nextFloat() >= 0.5F)) {
         class_2522[] var4 = new class_2522[]{class_4783.field_23262.method_29260(), method_28291(var1, class_4783.field_23712)};
         class_2522[] var5 = new class_2522[]{class_4783.field_23657.method_29260(), method_28291(var1, class_4783.field_23276)};
         return this.method_28289(var1, var4, var5);
      } else {
         return null;
      }
   }

   @Nullable
   private class_2522 method_28286(Random var1, class_2522 var2) {
      Direction var5 = var2.<Direction>method_10313(class_3049.field_14946);
      class_5122 var6 = var2.<class_5122>method_10313(class_3049.field_14955);
      if (!(var1.nextFloat() >= 0.5F)) {
         class_2522[] var7 = new class_2522[]{class_4783.field_23326.method_29260(), class_4783.field_23449.method_29260()};
         class_2522[] var8 = new class_2522[]{
            class_4783.field_23276.method_29260().method_10308(class_3049.field_14946, var5).method_10308(class_3049.field_14955, var6),
            class_4783.field_23869.method_29260()
         };
         return this.method_28289(var1, var7, var8);
      } else {
         return null;
      }
   }

   @Nullable
   private class_2522 method_28287(Random var1) {
      return !(var1.nextFloat() < this.field_31576) ? null : class_4783.field_23869.method_29260();
   }

   @Nullable
   private class_2522 method_28285(Random var1) {
      return !(var1.nextFloat() < this.field_31576) ? null : class_4783.field_23561.method_29260();
   }

   @Nullable
   private class_2522 method_28288(Random var1) {
      return !(var1.nextFloat() < 0.15F) ? null : class_4783.field_23222.method_29260();
   }

   private static class_2522 method_28291(Random var0, class_6414 var1) {
      return var1.method_29260()
         .method_10308(class_3049.field_14946, class_9594.field_48893.method_44313(var0))
         .method_10308(class_3049.field_14955, class_5122.values()[var0.nextInt(class_5122.values().length)]);
   }

   private class_2522 method_28289(Random var1, class_2522[] var2, class_2522[] var3) {
      return !(var1.nextFloat() < this.field_31576) ? method_28292(var1, var2) : method_28292(var1, var3);
   }

   private static class_2522 method_28292(Random var0, class_2522[] var1) {
      return var1[var0.nextInt(var1.length)];
   }

   @Override
   public class_2111<?> method_9858() {
      return class_2111.field_10588;
   }
}
