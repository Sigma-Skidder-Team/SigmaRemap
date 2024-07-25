package remapped;

public class class_9104 extends class_9733 {
   private static String[] field_46617;
   private final class_9873 field_46616 = new class_2574();
   private final class_3581 field_46618 = class_3581.method_16705(class_643.field_3601);

   private class_9104(class_174 var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
      this.field_49477 = 0.0F;
      this.field_49476 = 30;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36844;
   }

   @Override
   public void method_44951(class_7907 var1, class_9071 var2, float var3) {
      float var6 = ((float)this.field_49475 + var3) / (float)this.field_49476;
      float var7 = 0.05F + 0.5F * class_9299.method_42818(var6 * (float) Math.PI);
      class_7966 var8 = new class_7966();
      var8.method_36060(var2.method_41644());
      var8.method_36060(class_2426.field_12080.method_11074(150.0F * var6 - 60.0F));
      var8.method_36062(-1.0F, -1.0F, 1.0F);
      var8.method_36065(0.0, -1.101F, 1.5);
      class_3758 var9 = MinecraftClient.method_8510().method_8589().method_13796();
      class_7907 var10 = var9.method_11645(this.field_46618);
      this.field_46616.method_45499(var8, var10, 15728880, class_5367.field_27381, 1.0F, 1.0F, 1.0F, var7);
      var9.method_17415();
   }
}
