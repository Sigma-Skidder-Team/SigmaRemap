package mapped;

import java.util.List;

public class Class3781 extends Class3758 {
   public final BruhMotha field19955;
   public final BruhMotha field19956;
   public final BitchNiggerPlane2 field19957;

   public Class3781(BitchNiggerPlane2 var1, BruhMotha var2, BruhMotha var3) {
      this.field19957 = var1;
      this.field19955 = var2;
      this.field19956 = var3;
   }

   @Override
   public void method12725() {
      this.map(BruhMotha.field22544);
      if (this.field19955 == null) {
         this.map(this.field19956);
      } else {
         this.method12727(this.field19955, this.field19956);
      }

      this.method12733(var2 -> {
         int var5 = var2.method30555(BruhMotha.field22544, 0);
         List<Class8656> var6 = (List<Class8656>) var2.method30555(field19956, 0);
         this.field19957.method21090(var5, var6, var2.method30580());
      });
   }
}
