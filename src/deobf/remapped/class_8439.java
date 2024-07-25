package remapped;

public class class_8439 extends class_8859 {
   private static String[] field_43175;
   private final GameOptions field_43174;

   public class_8439(GameOptions var1) {
      this.field_43174 = var1;
   }

   @Override
   public void method_40743(boolean var1) {
      this.field_45288 = this.field_43174.field_45416.method_27060();
      this.field_45290 = this.field_43174.field_45434.method_27060();
      this.field_45283 = this.field_43174.field_45504.method_27060();
      this.field_45286 = this.field_43174.field_45411.method_27060();
      this.field_45287 = this.field_45288 != this.field_45290 ? (!this.field_45288 ? -1.0F : 1.0F) : 0.0F;
      this.field_45282 = this.field_45283 != this.field_45286 ? (!this.field_45283 ? -1.0F : 1.0F) : 0.0F;
      this.field_45284 = this.field_43174.field_45450.method_27060();
      this.field_45289 = this.field_43174.field_45560.method_27060();
      if (var1) {
         this.field_45282 = (float)((double)this.field_45282 * 0.3);
         this.field_45287 = (float)((double)this.field_45287 * 0.3);
      }
   }
}
