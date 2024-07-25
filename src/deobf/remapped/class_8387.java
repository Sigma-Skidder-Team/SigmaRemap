package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_8387 extends class_7430 {
   private static final Identifier field_42906 = new Identifier("textures/gui/checkbox.png");
   private boolean field_42907;
   private final boolean field_42905;

   public class_8387(int var1, int var2, int var3, int var4, ITextComponent var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, true);
   }

   public class_8387(int var1, int var2, int var3, int var4, ITextComponent var5, boolean var6, boolean var7) {
      super(var1, var2, var3, var4, var5);
      this.field_42907 = var6;
      this.field_42905 = var7;
   }

   @Override
   public void method_33827() {
      this.field_42907 = !this.field_42907;
   }

   public boolean method_38643() {
      return this.field_42907;
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      var7.method_8577().method_35674(field_42906);
      class_3542.method_16428();
      TextRenderer var8 = var7.textRenderer;
      class_3542.method_16480(1.0F, 1.0F, 1.0F, this.field_36680);
      class_3542.method_16488();
      class_3542.method_16437();
      class_3542.method_16398(class_5033.field_26042, class_8535.field_43697);
      method_9778(var1, this.field_36670, this.field_36674, !this.method_32691() ? 0.0F : 20.0F, !this.field_42907 ? 0.0F : 20.0F, 20, this.field_36681, 64, 64);
      this.method_32706(var1, var7, var2, var3);
      if (this.field_42905) {
         method_9771(
            var1,
            var8,
            this.method_32685(),
            this.field_36670 + 24,
            this.field_36674 + (this.field_36681 - 8) / 2,
            14737632 | class_9299.method_42816(this.field_36680 * 255.0F) << 24
         );
      }
   }
}
