package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;

public class Class4282 extends Class4281 {
   private static String[] field20759;

   public Class4282(Class4305 var1, String var2, int var3, int var4, int var5, int var6, Class6387 var7, String var8, String var9, ClientResource var10) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
      this.method13308(new Class6387(var7).method19410(Class1979.field12896.field12910));
      this.method13156(false);
   }

   @Override
   public void method13027(float var1) {
      this.method13306(ResourceRegistry.field38868);
      Class3192.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         Class1979.field12891.field12910
      );
      Class3192.method11429(
         (float)(this.field20895 - 2),
         (float)this.field20896,
         (float)(this.field20895 + this.field20897 + 2),
         (float)(this.field20896 + this.field20898),
         2,
         Class5628.method17690(Class1979.field12896.field12910, Class1979.field12891.field12910, 625.0F)
      );
      super.method13027(var1);
   }
}
