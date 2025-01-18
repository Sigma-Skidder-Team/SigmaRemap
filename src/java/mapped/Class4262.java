package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.unmapped.ResourceList;

public class Class4262 extends Class4261 {
   private static String[] field20674;
   private boolean field20675;
   private boolean field20676;

   public Class4262(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false, new Class7312(ResourceList.checkbox, 20, 40, 18, Class2188.field14309, 200, 1));
      this.method13088();
   }

   private void method13088() {
      this.method13086().method23120(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void onClick3(int mouseX, int mouseY, int mouseButton) {
      this.method13086().method23104();
      this.method13093(this.method13086().method23105());
   }

   public boolean method13090() {
      return this.field20675;
   }

   public void method13091(boolean var1) {
      this.field20675 = var1;
   }

   public boolean method13092() {
      return this.field20676;
   }

   public void method13093(boolean var1) {
      this.method13094(var1, true);
   }

   public void method13094(boolean var1, boolean var2) {
      if (var1 != this.method13092()) {
         if (var1 && !this.method13086().method23105() || !var1 && this.method13086().method23105()) {
            this.method13086().method23104();
         }

         this.field20676 = var1;
         if (var2) {
            this.method13037();
         }
      }
   }
}
