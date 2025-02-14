package mapped;

public class Class1795 extends Class1793 {
   private static String[] field9675;
   public final Class1792 field9676;
   private final Class1735 field9677;
   private final String field9678;
   private final String field9679;

   public Class1795(Class1792 var1, String var2, String var3) {
      this.field9676 = var1;
      this.field9678 = var2;
      this.field9679 = var3;
      Class1737 var6 = var1.method7830(1);
      this.field9677 = Class7001.method21696(new Class1741(this, var6, var1));
   }

   @Override
   public Class7450 method7833() {
      return this.field9678 == null ? null : Class7450.method24082(this.field9678);
   }

   @Override
   public long method7834() {
      try {
         return this.field9679 != null ? Long.parseLong(this.field9679) : -1L;
      } catch (NumberFormatException var4) {
         return -1L;
      }
   }

   @Override
   public Class1735 method7836() {
      return this.field9677;
   }
}
