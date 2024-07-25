package remapped;

public class class_4401 extends class_2208<class_7741> {
   private static final Identifier field_21541 = new Identifier("textures/gui/container/horse.png");
   private final class_4109 field_21543;
   private float field_21539;
   private float field_21542;

   public class_4401(class_7741 var1, class_7051 var2, class_4109 var3) {
      super(var1, var2, var3.method_19839());
      this.field_21543 = var3;
      this.field_951 = false;
   }

   @Override
   public void method_10223(class_7966 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(field_21541);
      int var7 = (this.field_941 - this.field_10981) / 2;
      int var8 = (this.field_940 - this.field_10973) / 2;
      this.method_9781(var1, var7, var8, 0, 0, this.field_10981, this.field_10973);
      if (this.field_21543 instanceof class_5521) {
         class_5521 var9 = (class_5521)this.field_21543;
         if (var9.method_25017()) {
            this.method_9781(var1, var7 + 79, var8 + 17, 0, this.field_10973, var9.method_25019() * 18, 54);
         }
      }

      if (this.field_21543.method_43356()) {
         this.method_9781(var1, var7 + 7, var8 + 35 - 18, 18, this.field_10973 + 54, 18, 18);
      }

      if (this.field_21543.method_19052()) {
         if (!(this.field_21543 instanceof class_9310)) {
            this.method_9781(var1, var7 + 7, var8 + 35, 0, this.field_10973 + 54, 18, 18);
         } else {
            this.method_9781(var1, var7 + 7, var8 + 35, 36, this.field_10973 + 54, 18, 18);
         }
      }

      class_3431.method_15860(var7 + 51, var8 + 60, 17, (float)(var7 + 51) - this.field_21539, (float)(var8 + 75 - 50) - this.field_21542, this.field_21543);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.field_21539 = (float)var2;
      this.field_21542 = (float)var3;
      super.method_6767(var1, var2, var3, var4);
      this.method_10214(var1, var2, var3);
   }
}
