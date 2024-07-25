package remapped;

public class class_112 extends class_5932 {
   public class_112(int var1, int var2, int var3) {
      super(var1, var2, var3, 22, 20, "");
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      if (this.field_36677) {
         super.method_6767(var1, var2, var3, var4);
         Identifier var7 = new Identifier("optifine/textures/icons.png");
         Config.method_14266().bindTexture(var7);
         GlStateManager.method_8789(1.0F, 1.0F, 1.0F, 1.0F);
         this.method_9781(var1, this.field_36670 + 3, this.field_36674 + 2, 0, 0, 16, 16);
      }
   }
}
