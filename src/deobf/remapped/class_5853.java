package remapped;

public class class_5853 implements Runnable {
   public class_5853(class_4829 var1, class_1144 var2) {
      this.field_29748 = var1;
      this.field_29747 = var2;
   }

   @Override
   public void run() {
      class_1144.method_5051(this.field_29747, "forced close");
      class_1144.method_5064().fine("socket closing - telling transport to close");
      this.field_29747.field_6492.method_10547();
   }
}
