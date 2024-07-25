package remapped;

public class class_7231 extends class_9873 {
   public class_1549 field_37109;
   public class_1549 field_37107;
   public class_1549 field_37108;

   public class_7231() {
      super(RenderLayer::method_16747);
      class_3569 var3 = class_3569.field_17468;
      class_4732 var4 = new class_4732(var3);
      this.field_37109 = (class_1549)class_7860.field_40191.method_39231(var4, 0);
      this.field_37107 = (class_1549)class_7860.field_40191.method_39231(var4, 1);
      this.field_37108 = (class_1549)class_7860.field_40191.method_39231(var4, 2);
   }

   public class_2255 method_33095(class_2255 var1) {
      if (class_7860.field_40191.method_39238()) {
         class_7860.field_40191.method_39234(var1, 0, this.field_37109);
         class_7860.field_40191.method_39234(var1, 1, this.field_37107);
         class_7860.field_40191.method_39234(var1, 2, this.field_37108);
         return var1;
      } else {
         class_3111.method_14317("Field not found: TileEntityChestRenderer.modelRenderers");
         return null;
      }
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
