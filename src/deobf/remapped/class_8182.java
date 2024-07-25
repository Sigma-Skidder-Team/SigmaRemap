package remapped;

public class class_8182 extends class_9873 {
   public class_1549 field_41883;
   public class_1549 field_41882;
   public class_1549 field_41884;
   public class_1549 field_41880;
   public class_1549 field_41881;
   public class_1549 field_41879;

   public class_8182() {
      super(class_3581::method_16747);
      class_3569 var3 = class_3569.field_17468;
      class_4732 var4 = new class_4732(var3);
      this.field_41883 = (class_1549)class_7860.field_40191.method_39231(var4, 3);
      this.field_41882 = (class_1549)class_7860.field_40191.method_39231(var4, 4);
      this.field_41884 = (class_1549)class_7860.field_40191.method_39231(var4, 5);
      this.field_41880 = (class_1549)class_7860.field_40191.method_39231(var4, 6);
      this.field_41881 = (class_1549)class_7860.field_40191.method_39231(var4, 7);
      this.field_41879 = (class_1549)class_7860.field_40191.method_39231(var4, 8);
   }

   public class_2255 method_37500(class_2255 var1) {
      if (class_7860.field_40191.method_39238()) {
         class_7860.field_40191.method_39234(var1, 3, this.field_41883);
         class_7860.field_40191.method_39234(var1, 4, this.field_41882);
         class_7860.field_40191.method_39234(var1, 5, this.field_41884);
         class_7860.field_40191.method_39234(var1, 6, this.field_41880);
         class_7860.field_40191.method_39234(var1, 7, this.field_41881);
         class_7860.field_40191.method_39234(var1, 8, this.field_41879);
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
