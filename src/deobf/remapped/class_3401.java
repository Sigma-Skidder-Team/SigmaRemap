package remapped;

public class class_3401 extends class_7114 {
   private static String[] field_16746;
   private final class_531 field_16749;
   private boolean field_16748;

   public class_3401(class_5603 var1, class_531 var2, int var3, int var4) {
      super(var3, var4, 25, 25, class_531.method_2582(var2));
      this.field_16747 = var1;
      this.field_16749 = var2;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      this.method_15715(var1, var7.getTextureManager());
      class_531.method_2587(this.field_16749, this.field_16747.field_945, this.field_36670 + 5, this.field_36674 + 5);
      if (this.field_16748) {
         this.method_15714(var1, var7.getTextureManager());
      }
   }

   @Override
   public boolean method_32703() {
      return super.method_32703() || this.field_16748;
   }

   public void method_15712(boolean var1) {
      this.field_16748 = var1;
      this.method_32700();
   }

   private void method_15715(class_7966 var1, TextureManager var2) {
      var2.bindTexture(class_5603.method_25422());
      var1.method_36063();
      var1.method_36065((double)this.field_36670, (double)this.field_36674, 0.0);
      method_9778(var1, 0, 0, 0.0F, 75.0F, 25, 25, 128, 128);
      var1.method_36064();
   }

   private void method_15714(class_7966 var1, TextureManager var2) {
      var2.bindTexture(class_5603.method_25422());
      var1.method_36063();
      var1.method_36065((double)this.field_36670, (double)this.field_36674, 0.0);
      method_9778(var1, 0, 0, 25.0F, 75.0F, 25, 25, 128, 128);
      var1.method_36064();
   }
}
