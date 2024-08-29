package mapped;

import com.google.common.collect.Lists;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;
import java.util.List;

public class Class2954 {
   private final List<Class1199> field18031 = Lists.newArrayListWithCapacity(20);
   private Class1199 field18032;
   private final Class1263 field18033 = new Class1263();
   private Minecraft field18034;
   private final List<Class1259> field18035 = Lists.newArrayList();
   private List<RecipeList> field18036;
   private Class1249 field18037;
   private Class1249 field18038;
   private int field18039;
   private int field18040;
   private Class6941 field18041;
   private Class4843<?> field18042;
   private RecipeList field18043;

   public Class2954() {
      for (int var3 = 0; var3 < 20; var3++) {
         this.field18031.add(new Class1199());
      }
   }

   public void method11306(Minecraft var1, int var2, int var3) {
      this.field18034 = var1;
      this.field18041 = var1.player.method5397();

      for (int var6 = 0; var6 < this.field18031.size(); var6++) {
         this.field18031.get(var6).method5754(var2 + 11 + 25 * (var6 % 5), var3 + 31 + 25 * (var6 / 5));
      }

      this.field18037 = new Class1249(var2 + 93, var3 + 137, 12, 17, false);
      this.field18037.method5821(1, 208, 13, 18, Class1254.field6630);
      this.field18038 = new Class1249(var2 + 38, var3 + 137, 12, 17, true);
      this.field18038.method5821(1, 208, 13, 18, Class1254.field6630);
   }

   public void method11307(Class1254 var1) {
      this.field18035.remove(var1);
      this.field18035.add(var1);
   }

   public void method11308(List<RecipeList> var1, boolean var2) {
      this.field18036 = var1;
      this.field18039 = (int)Math.ceil((double)var1.size() / 20.0);
      if (this.field18039 <= this.field18040 || var2) {
         this.field18040 = 0;
      }

      this.method11309();
   }

   private void method11309() {
      int var3 = 20 * this.field18040;

      for (int var4 = 0; var4 < this.field18031.size(); var4++) {
         Class1199 var5 = this.field18031.get(var4);
         if (var3 + var4 >= this.field18036.size()) {
            var5.field6483 = false;
         } else {
            RecipeList var6 = this.field18036.get(var3 + var4);
            var5.method5752(var6, this);
            var5.field6483 = true;
         }
      }

      this.method11310();
   }

   private void method11310() {
      this.field18037.field6483 = this.field18039 > 1 && this.field18040 < this.field18039 - 1;
      this.field18038.field6483 = this.field18039 > 1 && this.field18040 > 0;
   }

   public void method11311(MatrixStack var1, int var2, int var3, int var4, int var5, float var6) {
      if (this.field18039 > 1) {
         String var9 = this.field18040 + 1 + "/" + this.field18039;
         int var10 = this.field18034.fontRenderer.getStringWidth(var9);
         this.field18034.fontRenderer.method38801(var1, var9, (float)(var2 - var10 / 2 + 73), (float)(var3 + 141), -1);
      }

      this.field18032 = null;

      for (Class1199 var12 : this.field18031) {
         var12.method1923(var1, var4, var5, var6);
         if (var12.field6483 && var12.method5737()) {
            this.field18032 = var12;
         }
      }

      this.field18038.method1923(var1, var4, var5, var6);
      this.field18037.method1923(var1, var4, var5, var6);
      this.field18033.method1923(var1, var4, var5, var6);
   }

   public void method11312(MatrixStack var1, int var2, int var3) {
      if (this.field18034.currentScreen != null && this.field18032 != null && !this.field18033.method5906()) {
         this.field18034.currentScreen.method2460(var1, this.field18032.method5758(this.field18034.currentScreen), var2, var3);
      }
   }

   @Nullable
   public Class4843<?> method11313() {
      return this.field18042;
   }

   @Nullable
   public RecipeList method11314() {
      return this.field18043;
   }

   public void method11315() {
      this.field18033.method5905(false);
   }

   public boolean method11316(double var1, double var3, int var5, int var6, int var7, int var8, int var9) {
      this.field18042 = null;
      this.field18043 = null;
      if (this.field18033.method5906()) {
         if (!this.field18033.method1958(var1, var3, var5)) {
            this.field18033.method5905(false);
         } else {
            this.field18042 = this.field18033.method5903();
            this.field18043 = this.field18033.method5902();
         }

         return true;
      } else if (this.field18037.method1958(var1, var3, var5)) {
         this.field18040++;
         this.method11309();
         return true;
      } else if (this.field18038.method1958(var1, var3, var5)) {
         this.field18040--;
         this.method11309();
         return true;
      } else {
         for (Class1199 var13 : this.field18031) {
            if (var13.method1958(var1, var3, var5)) {
               if (var5 != 0) {
                  if (var5 == 1 && !this.field18033.method5906() && !var13.method5756()) {
                     this.field18033
                        .method5901(
                           this.field18034,
                           var13.method5753(),
                           var13.field6477,
                           var13.field6478,
                           var6 + var8 / 2,
                           var7 + 13 + var9 / 2,
                           (float)var13.method5740()
                        );
                  }
               } else {
                  this.field18042 = var13.method5757();
                  this.field18043 = var13.method5753();
               }

               return true;
            }
         }

         return false;
      }
   }

   public void method11317(List<Class4843<?>> var1) {
      for (Class1259 var5 : this.field18035) {
         var5.method5857(var1);
      }
   }

   public Minecraft method11318() {
      return this.field18034;
   }

   public Class6941 method11319() {
      return this.field18041;
   }
}
