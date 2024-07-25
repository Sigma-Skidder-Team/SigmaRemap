package remapped;

public class class_5313 implements Runnable {
   public class_5313(class_8638 var1) {
      this.field_27112 = var1;
   }

   @Override
   public void run() {
      if (!this.field_27112.field_44285.field_35246[0]) {
         if (class_5119.field_26410 != class_1144.method_5025(this.field_27112.field_44285.field_35249)) {
            class_1144.method_5064().fine("changing transport and sending upgrade packet");
            this.field_27112.field_44285.field_35245[0].run();
            class_1144.method_5049(this.field_27112.field_44285.field_35249, this.field_27112.field_44285.field_35244[0]);
            class_8970 var3 = new class_8970("upgrade");
            this.field_27112.field_44285.field_35244[0].method_10541(new class_8970[]{var3});
            this.field_27112.field_44285.field_35249.method_19325("upgrade", new Object[]{this.field_27112.field_44285.field_35244[0]});
            this.field_27112.field_44285.field_35244[0] = null;
            class_1144.method_5020(this.field_27112.field_44285.field_35249, false);
            class_1144.method_5030(this.field_27112.field_44285.field_35249);
         }
      }
   }
}
