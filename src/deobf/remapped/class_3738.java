package remapped;

public class class_3738 implements Runnable {
   public class_3738(class_1144 var1, class_2291[] var2, class_6224 var3, class_6224 var4, class_6224 var5, class_1144 var6, class_6224 var7, class_6224 var8) {
      this.field_18267 = var1;
      this.field_18270 = var2;
      this.field_18265 = var3;
      this.field_18266 = var4;
      this.field_18264 = var5;
      this.field_18268 = var6;
      this.field_18269 = var7;
      this.field_18271 = var8;
   }

   @Override
   public void run() {
      this.field_18270[0].method_19328("open", this.field_18265);
      this.field_18270[0].method_19328("error", this.field_18266);
      this.field_18270[0].method_19328("close", this.field_18264);
      this.field_18268.method_19328("close", this.field_18269);
      this.field_18268.method_19328("upgrading", this.field_18271);
   }
}
