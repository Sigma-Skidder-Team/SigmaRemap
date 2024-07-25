package remapped;

public class class_5008 extends class_7164<class_8477, class_6521<class_8477>> {
   private static String[] field_25906;
   private final class_1818<class_8477> field_25908 = new class_1818<class_8477>(0.0F);
   private final class_2313<class_8477> field_25907 = new class_2313<class_8477>(0.0F);

   public class_5008(class_6122 var1) {
      super(var1, new class_1818<class_8477>(0.0F), 0.15F);
      this.method_29100(new class_6175(this));
   }

   public class_4639 method_23053(class_8477 var1) {
      return var1.method_39029();
   }

   public void method_23054(class_8477 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      Object var9 = var1.method_39021() != 0 ? this.field_25907 : this.field_25908;
      this.field_32487 = (class_6521<class_8477>)var9;
      float[] var10 = var1.method_39030();
      ((class_9387)var9).method_43404(var10[0], var10[1], var10[2]);
      super.method_32866(var1, var2, var3, var4, var5, var6);
      ((class_9387)var9).method_43404(1.0F, 1.0F, 1.0F);
   }

   public void method_23052(class_8477 var1, class_7966 var2, float var3, float var4, float var5) {
      super.method_29099(var1, var2, var3, var4, var5);
      float var8 = 4.3F * class_9299.method_42818(0.6F * var3);
      var2.method_36060(class_2426.field_12074.method_11074(var8));
      if (!var1.method_37285()) {
         var2.method_36065(0.2F, 0.1F, 0.0);
         var2.method_36060(class_2426.field_12076.method_11074(90.0F));
      }
   }
}
