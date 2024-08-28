package mapped;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;

public class Class9046 {
   private Screen field41420;
   private Class7547 field41421;
   private int field41422 = 0;
   private int field41423 = 0;
   private long field41424 = 0L;

   public Class9046(Screen var1, Class7547 var2) {
      this.field41420 = var1;
      this.field41421 = var2;
   }

   public void method33640(MatrixStack var1, int var2, int var3, List<Class1197> var4) {
      if (Math.abs(var2 - this.field41422) <= 5 && Math.abs(var3 - this.field41423) <= 5) {
         short var7 = 700;
         if (System.currentTimeMillis() >= this.field41424 + (long)var7) {
            Class1197 var8 = Class838.method2566(var2, var3, var4);
            if (var8 != null) {
               Rectangle var9 = this.field41421.method24668(this.field41420, var2, var3);
               String[] var10 = this.field41421.method24669(var8, var9.width);
               if (var10 != null) {
                  if (var10.length > 8) {
                     var10 = Arrays.<String>copyOf(var10, 8);
                     var10[var10.length - 1] = var10[var10.length - 1] + " ...";
                  }

                  if (this.field41421.method24670()) {
                     int var11 = -528449408;
                     this.method33641(var1, var9.x, var9.y, var9.x + var9.width, var9.y + var9.height, var11);
                  }

                  Class1193.method5686(var1, var9.x, var9.y, var9.x + var9.width, var9.y + var9.height, -536870912);

                  for (int var15 = 0; var15 < var10.length; var15++) {
                     String var12 = var10[var15];
                     int var13 = 14540253;
                     if (var12.endsWith("!")) {
                        var13 = 16719904;
                     }

                     Class9834 var14 = Minecraft.getInstance().field1294;
                     var14.method38799(var1, var12, (float)(var9.x + 5), (float)(var9.y + 5 + var15 * 11), var13);
                  }
               }
            }
         }
      } else {
         this.field41422 = var2;
         this.field41423 = var3;
         this.field41424 = System.currentTimeMillis();
      }
   }

   private void method33641(MatrixStack var1, int var2, int var3, int var4, int var5, int var6) {
      Class1193.method5686(var1, var2, var3 - 1, var4, var3, var6);
      Class1193.method5686(var1, var2, var5, var4, var5 + 1, var6);
      Class1193.method5686(var1, var2 - 1, var3, var2, var5, var6);
      Class1193.method5686(var1, var4, var3, var4 + 1, var5, var6);
   }
}
