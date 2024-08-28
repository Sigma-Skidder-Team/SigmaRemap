package mapped;

public final class Class1796 extends Class1793 {
   private final Class9371 field9680;
   private final Class1735 field9681;

   public Class1796(Class9371 var1, Class1735 var2) {
      this.field9680 = var1;
      this.field9681 = var2;
   }

   @Override
   public Class7450 method7833() {
      String var3 = this.field9680.method35544("Content-Type");
      return var3 == null ? null : Class7450.method24082(var3);
   }

   @Override
   public long method7834() {
      return Class8394.method29442(this.field9680);
   }

   @Override
   public Class1735 method7836() {
      return this.field9681;
   }
}
