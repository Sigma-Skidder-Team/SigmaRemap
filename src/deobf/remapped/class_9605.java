package remapped;

public class class_9605 implements class_6224 {
   public class_9605(class_4829 var1, class_1144 var2, class_6224[] var3, Runnable var4) {
      this.field_48950 = var1;
      this.field_48948 = var2;
      this.field_48951 = var3;
      this.field_48949 = var4;
   }

   @Override
   public void method_28452(Object... var1) {
      this.field_48948.method_19328("upgrade", this.field_48951[0]);
      this.field_48948.method_19328("upgradeError", this.field_48951[0]);
      this.field_48949.run();
   }
}
