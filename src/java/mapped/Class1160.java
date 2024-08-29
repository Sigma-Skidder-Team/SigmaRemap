package mapped;

import net.minecraft.client.gui.AbstractGui;

import java.util.Arrays;
import java.util.List;

public class Class1160 extends Class1155<Class1160> {
   private static String[] field6311;
   private final Class6110 field6312;
   private final List<Class6065> field6313;
   public final Class823 field6314;

   public Class1160(Class823 var1, Class6110 var2) {
      this.field6314 = var1;
      this.field6312 = var2;
      this.field6313 = Arrays.<Class6065>asList(new Class6064(this), new Class6066(this));
   }

   @Override
   public void method5544(MatrixStack var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method5556(var1, this.field6312, var4, var3, var7, var8);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      Class6065.method18805(Class823.method2390(this.field6314), this, this.field6313, var5, var1, var3);
      return true;
   }

   private void method5556(MatrixStack var1, Class6110 var2, int var3, int var4, int var5, int var6) {
      Class823.method2394(this.field6314).method38801(var1, var2.field27371, (float)(var3 + 38), (float)(var4 + 1), 16777215);
      Class823.method2395(this.field6314).method38801(var1, var2.field27372, (float)(var3 + 38), (float)(var4 + 12), 7105644);
      Class823.method2396(this.field6314).method38801(var1, Class9740.method38174(var2.field27374), (float)(var3 + 38), (float)(var4 + 24), 7105644);
      Class6065.method18804(var1, this.field6313, Class823.method2390(this.field6314), var3, var4, var5, var6);
      Class8087.method27973(var2.field27373, () -> {
         RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
         AbstractGui.method5698(var1, var3, var4, 32, 32, 8.0F, 8.0F, 8, 8, 64, 64);
         AbstractGui.method5698(var1, var3, var4, 32, 32, 40.0F, 8.0F, 8, 8, 64, 64);
      });
   }

   // $VF: synthetic method
   public static Class6110 method5558(Class1160 var0) {
      return var0.field6312;
   }
}
