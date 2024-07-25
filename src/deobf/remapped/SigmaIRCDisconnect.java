package remapped;

public class SigmaIRCDisconnect implements class_6224 {
   public SigmaIRCDisconnect(SigmaIRC var1) {
      this.field_1231 = var1;
   }

   @Override
   public void method_28452(Object... var1) {
      System.out.println("disconnect");
      SigmaMainClass.getInstance().method_3335().method_27841(new class_8235("Jello connect", "Connexion Failed. Try relogging.", class_2209.field_11030));
   }
}
