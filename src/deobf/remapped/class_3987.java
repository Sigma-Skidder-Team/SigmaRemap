package remapped;

public class class_3987 extends class_9873 {
   public class_1549 field_19385;
   public class_1549 field_19383;
   public class_1549 field_19384;

   public class_3987() {
      super(RenderLayer::method_16755);
      class_8205 var3 = new class_8205(MinecraftClient.getInstance().method_8587());
      this.field_19385 = (class_1549)class_7860.field_40062.method_39231(var3, 0);
      this.field_19383 = (class_1549)class_7860.field_40062.method_39231(var3, 1);
      this.field_19384 = (class_1549)class_7860.field_40062.method_39231(var3, 2);
   }

   public class_8205 method_18384(class_8205 var1) {
      if (class_7860.field_40062.method_39238()) {
         class_7860.field_40062.method_39234(var1, 0, this.field_19385);
         class_7860.field_40062.method_39234(var1, 1, this.field_19383);
         class_7860.field_40062.method_39234(var1, 2, this.field_19384);
         return var1;
      } else {
         Config.method_14317("Field not found: RenderEnderCrystal.modelEnderCrystal");
         return null;
      }
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
   }
}
