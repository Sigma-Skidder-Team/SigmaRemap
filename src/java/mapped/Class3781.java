package mapped;

import java.util.List;

public class Class3781 extends Class3758 {
   public final Class4750 field19955;
   public final Class4750 field19956;
   public final Class6904 field19957;

   public Class3781(Class6904 var1, Class4750 var2, Class4750 var3) {
      this.field19957 = var1;
      this.field19955 = var2;
      this.field19956 = var3;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22544);
      if (this.field19955 == null) {
         this.map(this.field19956);
      } else {
         this.method12727(this.field19955, this.field19956);
      }

      this.method12733(var2 -> {
         int var5 = var2.method30555(Class4750.field22544, 0);
         List<Class8656> var6 = (List<Class8656>) var2.method30555(field19956, 0);
         this.field19957.method21090(var5, var6, var2.method30580());
      });
   }
}
