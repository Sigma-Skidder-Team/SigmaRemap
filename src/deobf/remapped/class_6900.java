package remapped;

public class class_6900 extends class_9873 {
   public class_1549 field_35475;
   public class_1549 field_35476;
   public class_1549[] field_35474 = new class_1549[4];

   public class_6900() {
      super(RenderLayer::method_16755);
      class_3569 var3 = class_3569.field_17468;
      class_1365 var4 = new class_1365(var3);
      this.field_35475 = (class_1549)class_7860.field_40198.method_7980(var4);
      this.field_35476 = (class_1549)class_7860.field_39898.method_7980(var4);
      this.field_35474 = (class_1549[])class_7860.field_39986.method_7980(var4);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }

   public class_2255 method_31597(class_2255 var1) {
      if (class_7860.field_40198.method_7978()) {
         if (class_7860.field_39898.method_7978()) {
            if (class_7860.field_39986.method_7978()) {
               class_7860.method_35561(var1, class_7860.field_40198, this.field_35475);
               class_7860.method_35561(var1, class_7860.field_39898, this.field_35476);
               class_7860.method_35561(var1, class_7860.field_39986, this.field_35474);
               return var1;
            } else {
               class_3111.method_14317("Field not found: TileEntityBedRenderer.legModels");
               return null;
            }
         } else {
            class_3111.method_14317("Field not found: TileEntityBedRenderer.footModel");
            return null;
         }
      } else {
         class_3111.method_14317("Field not found: TileEntityBedRenderer.head");
         return null;
      }
   }
}
