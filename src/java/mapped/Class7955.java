package mapped;

public class Class7955 extends Class7956 {
   private static String[] field34197;
   private final Class1094 field34198;
   private boolean field34199;
   public final Class1094 field34200;

   public Class7955(Class1094 var1, Class1094 var2) {
      super(var2);
      this.field34200 = var1;
      this.field34198 = var2;
   }

   public boolean method27045() {
      return this.field34203;
   }

   public boolean method27046() {
      return this.field34199;
   }

   public void method27047(boolean var1) {
      this.field34199 = var1;
   }

   @Override
   public void method27048() {
      if (this.field34203) {
         this.field34198.method5105();
         this.field34203 = false;
      }
   }
}
