package remapped;

public class class_7872 implements Runnable {
   public class_7872(class_4829 var1, class_1144 var2, class_6224[] var3) {
      this.field_40304 = var1;
      this.field_40301 = var2;
      this.field_40302 = var3;
   }

   @Override
   public void run() {
      this.field_40301.method_19331("upgrade", this.field_40302[0]);
      this.field_40301.method_19331("upgradeError", this.field_40302[0]);
   }
}
