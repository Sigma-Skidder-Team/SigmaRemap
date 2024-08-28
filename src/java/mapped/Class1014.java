package mapped;

public abstract class Class1014 extends Class1013 {
   private int field5671;

   public Class1014(Class8992<? extends Class1014> var1, Class1655 var2) {
      super(var1, var2);
   }

   public boolean method4404(Class878 var1) {
      Class39 var4 = new Class39();
      var4.method109("id", this.method3297());
      this.method3294(var4);
      if (!var1.method2948(var4)) {
         return false;
      } else {
         this.method2904();
         return true;
      }
   }

   @Override
   public void tick() {
      this.field5671++;
      super.tick();
   }

   public boolean method4405() {
      return this.field5671 > 100;
   }
}
