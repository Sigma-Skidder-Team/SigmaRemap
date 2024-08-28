package mapped;

public class Class980 extends Class927 {
   private Class943 field5457;

   public Class980() {
      super(27);
   }

   public void method4064(Class943 var1) {
      this.field5457 = var1;
   }

   @Override
   public void method3682(Class41 var1) {
      for (int var4 = 0; var4 < this.method3629(); var4++) {
         this.method3621(var4, Class8848.field39973);
      }

      for (int var7 = 0; var7 < var1.size(); var7++) {
         Class39 var5 = var1.method153(var7);
         int var6 = var5.method120("Slot") & 255;
         if (var6 >= 0 && var6 < this.method3629()) {
            this.method3621(var6, Class8848.method32104(var5));
         }
      }
   }

   @Override
   public Class41 method3683() {
      Class41 var3 = new Class41();

      for (int var4 = 0; var4 < this.method3629(); var4++) {
         Class8848 var5 = this.method3618(var4);
         if (!var5.method32105()) {
            Class39 var6 = new Class39();
            var6.method100("Slot", (byte)var4);
            var5.method32112(var6);
            var3.add(var6);
         }
      }

      return var3;
   }

   @Override
   public boolean method3623(PlayerEntity var1) {
      return this.field5457 != null && !this.field5457.method3768(var1) ? false : super.method3623(var1);
   }

   @Override
   public void method3631(PlayerEntity var1) {
      if (this.field5457 != null) {
         this.field5457.method3766();
      }

      super.method3631(var1);
   }

   @Override
   public void method3632(PlayerEntity var1) {
      if (this.field5457 != null) {
         this.field5457.method3767();
      }

      super.method3632(var1);
      this.field5457 = null;
   }
}
