package remapped;

import net.minecraft.util.text.ITextComponent;

public class class_2141 extends class_2208<class_1465> implements class_4378<class_1465> {
   private static final Identifier field_10729 = new Identifier("textures/gui/container/generic_54.png");
   private final int field_10727;

   public class_2141(class_1465 var1, class_7051 var2, ITextComponent var3) {
      super(var1, var2, var3);
      this.field_951 = false;
      short var6 = 222;
      byte var7 = 114;
      this.field_10727 = var1.method_6777();
      this.field_10973 = 114 + this.field_10727 * 18;
      this.field_10958 = this.field_10973 - 94;
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_10729);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10727 * 18 + 17);
      this.method_9781(var1, var7, var8 + this.field_10727 * 18 + 17, 0, 126, this.field_10981, 96);
   }
}
