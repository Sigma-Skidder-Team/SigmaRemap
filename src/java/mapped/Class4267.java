package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4267 extends Class4247 {
   public Class4346 field20689;

   public Class4267(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.method13230(this.field20689 = new Class4346(this, "messages", 0, 114, var5, var6 - 114));
   }

   public void method13100(String var1) {
      this.field20689.method13571(new Class9159(var1, true));
   }

   public void method13101(String var1) {
      this.field20689.method13571(new Class9159(var1, false));
   }

   @Override
   public void method13027(float var1) {
      super.method13224();
      super.method13225();
      byte var4 = 23;
      super.method13027(var1);
   }
}
