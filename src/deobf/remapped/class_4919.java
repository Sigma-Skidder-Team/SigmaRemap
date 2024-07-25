package remapped;

public class class_4919 extends class_8715 {
   private static String[] field_25459;
   private final class_2522 field_25458;
   private class_1331 field_25456;
   private final float field_25460;
   private final float field_25457;

   public class_4919(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, class_2522 var14) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_25458 = var14;
      this.method_40055(MinecraftClient.getInstance().method_8505().method_3716().method_43938(var14));
      this.field_49477 = 1.0F;
      this.field_49485 = 0.6F;
      this.field_49468 = 0.6F;
      this.field_49487 = 0.6F;
      this.field_10503 /= 2.0F;
      this.field_25460 = this.field_49466.nextFloat() * 3.0F;
      this.field_25457 = this.field_49466.nextFloat() * 3.0F;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36845;
   }

   public class_4919 method_22530(class_1331 var1) {
      this.field_25456 = var1;
      if (!this.field_25458.method_8350(class_4783.field_23259)) {
         this.method_22528(var1);
         return this;
      } else {
         return this;
      }
   }

   public class_4919 method_22529() {
      this.field_25456 = new class_1331(this.field_49462, this.field_49473, this.field_49465);
      if (!this.field_25458.method_8350(class_4783.field_23259)) {
         this.method_22528(this.field_25456);
         return this;
      } else {
         return this;
      }
   }

   public void method_22528(class_1331 var1) {
      int var4 = MinecraftClient.getInstance().method_8569().method_20749(this.field_25458, this.field_49469, var1, 0);
      this.field_49485 *= (float)(var4 >> 16 & 0xFF) / 255.0F;
      this.field_49468 *= (float)(var4 >> 8 & 0xFF) / 255.0F;
      this.field_49487 *= (float)(var4 & 0xFF) / 255.0F;
   }

   @Override
   public float method_9765() {
      return this.field_44681.method_23602((double)((this.field_25460 + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public float method_9767() {
      return this.field_44681.method_23602((double)(this.field_25460 / 4.0F * 16.0F));
   }

   @Override
   public float method_9768() {
      return this.field_44681.method_23639((double)(this.field_25457 / 4.0F * 16.0F));
   }

   @Override
   public float method_9769() {
      return this.field_44681.method_23639((double)((this.field_25457 + 1.0F) / 4.0F * 16.0F));
   }

   @Override
   public int method_44952(float var1) {
      int var4 = super.method_44952(var1);
      int var5 = 0;
      if (this.field_49469.method_22559(this.field_25456)) {
         var5 = WorldRenderer.method_20002(this.field_49469, this.field_25456);
      }

      return var4 != 0 ? var4 : var5;
   }
}
