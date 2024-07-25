package remapped;

public class class_2207 extends class_7164<class_2960, class_6521<class_2960>> {
   private static final Identifier field_10949 = new Identifier("textures/entity/fish/pufferfish.png");
   private int field_10950;
   private final class_6802<class_2960> field_10947 = new class_6802<class_2960>();
   private final class_1652<class_2960> field_10951 = new class_1652<class_2960>();
   private final class_1085<class_2960> field_10948 = new class_1085<class_2960>();

   public class_2207(EntityRenderDispatcher var1) {
      super(var1, new class_1085<class_2960>(), 0.2F);
      this.field_10950 = 3;
   }

   public Identifier method_10211(class_2960 var1) {
      return field_10949;
   }

   public void method_10212(class_2960 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      int var9 = var1.method_13537();
      if (var9 != this.field_10950) {
         if (var9 != 0) {
            if (var9 != 1) {
               this.field_32487 = this.field_10948;
            } else {
               this.field_32487 = this.field_10951;
            }
         } else {
            this.field_32487 = this.field_10947;
         }
      }

      this.field_10950 = var9;
      this.field_36492 = 0.1F + 0.1F * (float)var9;
      super.method_32866(var1, var2, var3, var4, var5, var6);
   }

   public void method_10210(class_2960 var1, class_7966 var2, float var3, float var4, float var5) {
      var2.method_36065(0.0, (double)(MathHelper.cos(var3 * 0.05F) * 0.08F), 0.0);
      super.method_29099(var1, var2, var3, var4, var5);
   }
}
