package remapped;

public abstract class class_8715 extends class_2088 {
   public class_5155 field_44681;

   public class_8715(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6);
   }

   public class_8715(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
   }

   public void method_40055(class_5155 var1) {
      this.field_44681 = var1;
   }

   @Override
   public float method_9765() {
      return this.field_44681.method_23630();
   }

   @Override
   public float method_9767() {
      return this.field_44681.method_23619();
   }

   @Override
   public float method_9768() {
      return this.field_44681.method_23642();
   }

   @Override
   public float method_9769() {
      return this.field_44681.method_23640();
   }

   public void method_40053(class_6571 var1) {
      this.method_40055(var1.method_30023(this.field_49466));
   }

   public void method_40054(class_6571 var1) {
      this.method_40055(var1.method_30022(this.field_49475, this.field_49476));
   }
}
