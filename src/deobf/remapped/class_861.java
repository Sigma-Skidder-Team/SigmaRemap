package remapped;

import java.util.Random;

public class class_861 extends class_8131 {
   private final class_4639 field_4464;
   private final class_6631 field_4465;

   public class_861(class_5799 var1, class_4639 var2, class_1331 var3, class_6631 var4, int var5) {
      super(class_2746.field_13438, 0);
      this.field_4464 = var2;
      class_1331 var8 = (class_1331)class_71.method_77().get(var2);
      this.field_41648 = var3.method_6104(var8.method_12173(), var8.method_12165() - var5, var8.method_12185());
      this.field_4465 = var4;
      this.method_3732(var1);
   }

   public class_861(class_5799 var1, class_5734 var2) {
      super(class_2746.field_13438, var2);
      this.field_4464 = new class_4639(var2.method_25965("Template"));
      this.field_4465 = class_6631.valueOf(var2.method_25965("Rot"));
      this.method_3732(var1);
   }

   private void method_3732(class_5799 var1) {
      class_6561 var4 = var1.method_26279(this.field_4464);
      class_8478 var5 = new class_8478()
         .method_39053(this.field_4465)
         .method_39055(class_9022.field_46145)
         .method_39037((class_1331)class_71.method_76().get(this.field_4464))
         .method_39048(class_2010.field_10194);
      this.method_36998(var4, this.field_41648, var5);
   }

   @Override
   public void method_32517(class_5734 var1) {
      super.method_32517(var1);
      var1.method_25941("Template", this.field_4464.toString());
      var1.method_25941("Rot", this.field_4465.name());
   }

   @Override
   public void method_36999(String var1, class_1331 var2, class_1556 var3, Random var4, class_9616 var5) {
      if ("chest".equals(var1)) {
         var3.method_7513(var2, class_4783.field_23184.method_29260(), 3);
         class_3757 var8 = var3.method_28260(var2.method_6100());
         if (var8 instanceof class_7099) {
            ((class_7099)var8).method_10816(class_5931.field_30147, var4.nextLong());
         }
      }
   }

   @Override
   public boolean method_32501(class_700 var1, class_2033 var2, class_6541 var3, Random var4, class_9616 var5, class_2034 var6, class_1331 var7) {
      class_8478 var10 = new class_8478()
         .method_39053(this.field_4465)
         .method_39055(class_9022.field_46145)
         .method_39037((class_1331)class_71.method_76().get(this.field_4464))
         .method_39048(class_2010.field_10194);
      class_1331 var11 = (class_1331)class_71.method_77().get(this.field_4464);
      class_1331 var12 = this.field_41648.method_6105(class_6561.method_29968(var10, new class_1331(3 - var11.method_12173(), 0, 0 - var11.method_12185())));
      int var13 = var1.method_22562(class_3801.field_18598, var12.method_12173(), var12.method_12185());
      class_1331 var14 = this.field_41648;
      this.field_41648 = this.field_41648.method_6104(0, var13 - 90 - 1, 0);
      boolean var15 = super.method_32501(var1, var2, var3, var4, var5, var6, var7);
      if (this.field_4464.equals(class_71.method_79())) {
         class_1331 var16 = this.field_41648.method_6105(class_6561.method_29968(var10, new class_1331(3, 0, 5)));
         class_2522 var17 = var1.method_28262(var16.method_6100());
         if (!var17.method_8345() && !var17.method_8350(class_4783.field_23748)) {
            var1.method_7513(var16, class_4783.field_23813.method_29260(), 3);
         }
      }

      this.field_41648 = var14;
      return var15;
   }
}
