package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;

public class class_6463 extends class_6541 {
   public static final Codec<class_6463> field_32943 = class_9512.field_48429.fieldOf("settings").xmap(class_6463::new, class_6463::method_29443).codec();
   private final class_9512 field_32944;

   public class_6463(class_9512 var1) {
      super(new class_2136(var1.method_43896()), new class_2136(var1.method_43893()), var1.method_43898(), 0L);
      this.field_32944 = var1;
   }

   @Override
   public Codec<? extends class_6541> method_29835() {
      return field_32943;
   }

   @Override
   public class_6541 method_29828(long var1) {
      return this;
   }

   public class_9512 method_29443() {
      return this.field_32944;
   }

   @Override
   public void method_29814(class_702 var1, class_5990 var2) {
   }

   @Override
   public int method_29823() {
      class_2522[] var3 = this.field_32944.method_43902();

      for (int var4 = 0; var4 < var3.length; var4++) {
         class_2522 var5 = var3[var4] != null ? var3[var4] : class_4783.field_23184.method_29260();
         if (!class_3801.field_18595.method_17675().test(var5)) {
            return var4 - 1;
         }
      }

      return var3.length;
   }

   @Override
   public void method_29824(class_9379 var1, class_2033 var2, class_5990 var3) {
      class_2522[] var6 = this.field_32944.method_43902();
      class_2921 var7 = new class_2921();
      class_2131 var8 = var3.method_27353(class_3801.field_18591);
      class_2131 var9 = var3.method_27353(class_3801.field_18598);

      for (int var10 = 0; var10 < var6.length; var10++) {
         class_2522 var11 = var6[var10];
         if (var11 != null) {
            for (int var12 = 0; var12 < 16; var12++) {
               for (int var13 = 0; var13 < 16; var13++) {
                  var3.method_27348(var7.method_13362(var12, var10, var13), var11, false);
                  var8.method_9958(var12, var10, var13, var11);
                  var9.method_9958(var12, var10, var13, var11);
               }
            }
         }
      }
   }

   @Override
   public int method_29830(int var1, int var2, class_3801 var3) {
      class_2522[] var6 = this.field_32944.method_43902();

      for (int var7 = var6.length - 1; var7 >= 0; var7--) {
         class_2522 var8 = var6[var7];
         if (var8 != null && var3.method_17675().test(var8)) {
            return var7 + 1;
         }
      }

      return 0;
   }

   @Override
   public class_6163 method_29822(int var1, int var2) {
      return new class_4795(
         Arrays.<class_2522>stream(this.field_32944.method_43902())
            .<class_2522>map(var0 -> (class_2522)(var0 != null ? var0 : class_4783.field_23184.method_29260()))
            .<class_2522>toArray(class_2522[]::new)
      );
   }
}
