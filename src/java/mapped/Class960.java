package mapped;

import javax.annotation.Nullable;

public class Class960 extends Class944 implements Class935 {
   private final Class7574 field5390 = new Class7573(this);

   public Class960() {
      super(Class4387.field21429);
   }

   @Override
   public void method3645(Class7380 var1, Class39 var2) {
      super.method3645(var1, var2);
      this.field5390.method24794(var2);
   }

   @Override
   public Class39 method3646(Class39 var1) {
      super.method3646(var1);
      this.field5390.method24795(var1);
      return var1;
   }

   @Override
   public void method3647() {
      this.field5390.method24792();
   }

   @Nullable
   @Override
   public Class5610 method3776() {
      return new Class5610(this.field5325, 1, this.method3777());
   }

   @Override
   public Class39 method3777() {
      Class39 var3 = this.method3646(new Class39());
      var3.method133("SpawnPotentials");
      return var3;
   }

   @Override
   public boolean method3751(int var1, int var2) {
      return !this.field5390.method24797(var1) ? super.method3751(var1, var2) : true;
   }

   @Override
   public boolean method3783() {
      return true;
   }

   public Class7574 method3911() {
      return this.field5390;
   }
}
