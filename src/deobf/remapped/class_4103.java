package remapped;

import java.util.ArrayList;
import java.util.List;

public class class_4103 extends class_1859 {
   private List<class_6220> field_19973 = new ArrayList<class_6220>();
   public int field_19975;

   public class_4103(class_7038 var1, String var2, int var3, int var4) {
      super(var1, var2, var3, var4, 1060, 357, false);

      for (class_5818 var10 : class_5818.values()) {
         class_5610 var11;
         this.method_32148(
            var11 = new class_5610(
               this,
               "KEY_" + var10.field_29469 + this.method_32134().size(),
               var10.method_26332(),
               var10.method_26333(),
               var10.method_26334(),
               var10.method_26331(),
               var10.field_29488,
               var10.field_29469
            )
         );
         var11.method_32100((var2x, var3x) -> {
            this.field_19975 = var11.field_28477;
            this.method_8235();
         });
      }

      this.method_32105(false);
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (var3 <= 1) {
         return super.method_29508(var1, var2, var3);
      } else {
         this.field_19975 = var3;
         this.method_8235();
         return false;
      }
   }

   @Override
   public void method_29509(int var1) {
      for (class_5818 var7 : class_5818.values()) {
         if (var7.field_29469 == var1) {
            super.method_29509(var1);
            return;
         }
      }

      this.field_19975 = var1;
      this.method_8235();
      super.method_29509(var1);
   }

   public void method_18946() {
      for (class_7038 var4 : this.method_32134()) {
         if (var4 instanceof class_5610) {
            class_5610 var5 = (class_5610)var4;
            var5.method_25466();
         }
      }
   }

   public int[] method_18947(int var1) {
      for (class_5818 var7 : class_5818.values()) {
         if (var7.field_29469 == var1) {
            return new int[]{var7.method_26332() + var7.method_26334() / 2, var7.method_26333() + var7.method_26331()};
         }
      }

      return new int[]{this.method_32109() / 2, 20};
   }

   @Override
   public void method_32145(int var1, int var2) {
      super.method_32145(var1, var2);
   }

   @Override
   public void method_32178(float var1) {
      byte var4 = 20;
      byte var5 = 14;
      int var6 = this.field_36270 - var4;
      int var7 = this.field_36261 - var4;
      int var8 = this.field_36278 + var4 * 2;
      int var9 = this.field_36257 + 5 + var4 * 2;
      class_73.method_128((float)(var6 + var5 / 2), (float)(var7 + var5 / 2), (float)(var8 - var5), (float)(var9 - var5), 20.0F, var1 * 0.5F);
      class_73.method_139((float)var6, (float)var7, (float)var8, (float)var9, 14.0F, class_1255.field_6918.field_6917);
      super.method_32178(var1);
   }
}
