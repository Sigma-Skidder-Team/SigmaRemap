package remapped;

public class class_4829 implements Runnable {
   public class_4829(class_1144 var1) {
      this.field_24106 = var1;
   }

   @Override
   public void run() {
      if (class_1144.method_5025(this.field_24106) == class_5119.field_26407 || class_1144.method_5025(this.field_24106) == class_5119.field_26412) {
         class_1144.method_5046(this.field_24106, class_5119.field_26408);
         class_1144 var3 = this.field_24106;
         class_5853 var4 = new class_5853(this, var3);
         class_6224[] var5 = new class_6224[1];
         var5[0] = new class_9605(this, var3, var5, var4);
         class_7872 var6 = new class_7872(this, var3, var5);
         if (this.field_24106.field_6503.size() <= 0) {
            if (!class_1144.method_5061(this.field_24106)) {
               var4.run();
            } else {
               var6.run();
            }
         } else {
            this.field_24106.method_19331("drain", new class_4105(this, var6, var4));
         }
      }
   }
}
