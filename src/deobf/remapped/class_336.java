package remapped;

public class class_336 extends class_9873 {
   public class_1549 field_1248;
   public class_1549 field_1246;
   public class_1549 field_1247;

   public class_336() {
      super(class_3581::method_16755);
      class_3569 var3 = class_3569.field_17468;
      class_9429 var4 = new class_9429(var3);
      this.field_1248 = (class_1549)class_7860.field_40222.method_39231(var4, 0);
      this.field_1246 = (class_1549)class_7860.field_40222.method_39231(var4, 1);
      this.field_1247 = (class_1549)class_7860.field_40222.method_39231(var4, 2);
   }

   public class_2255 method_1541(class_2255 var1) {
      if (class_7860.field_40222.method_39238()) {
         class_7860.field_40222.method_39234(var1, 0, this.field_1248);
         class_7860.field_40222.method_39234(var1, 1, this.field_1246);
         class_7860.field_40222.method_39234(var1, 2, this.field_1247);
         return var1;
      } else {
         class_3111.method_14317("Field not found: TileEntityBannerRenderer.modelRenderers");
         return null;
      }
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
