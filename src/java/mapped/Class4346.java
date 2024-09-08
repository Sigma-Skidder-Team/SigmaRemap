package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Class4346 extends Class4339 {
   private List<Class4240> field21233 = new ArrayList<Class4240>();
   private boolean field21234;
   private boolean field21235;
   private float field21236 = 1.0F;
   private int field21237 = 0;
   private int field21238 = 14;
   private static ClientResource field21239 = ResourceRegistry.JelloLightFont18;
   private static int field21240 = 14;
   private boolean field21241 = false;
   private static final String field21242 = "\n";

   public Class4346(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   public void method13571(Class9159 var1) {
      boolean var4 = this.field21241 == var1.field42046 && this.field21237 != 0;
      boolean var5 = this.method13513() + this.method13269() >= this.method13517().method13269() - field21240;
      if (var4) {
         this.field21238 -= 7;
      }

      int var6 = this.method13517().method13269() - this.method13269();
      this.method13517()
         .addToList(
            new Class4289(this.method13517(), "message" + this.field21237, 0, this.field21238, this.method13267(), var1.method34192() + field21240, var1)
         );
      this.field21238 = this.field21238 + var1.method34192();
      this.field21237++;
      this.field21241 = var1.field42046;
      if (var1.field42046 || var5) {
         this.method13572(var6, var1.method34192(), var4);
      }
   }

   public void method13572(int var1, int var2, boolean var3) {
      int var6 = this.method13513();
      int var7 = var1 + var2;
      if (var3) {
         var7 -= 7;
      }

      int var8 = var7 - var6;
      float var9 = 300.0F;
      long var10 = new Date().getTime() + (long)((int)var9);
      int var12 = this.field21237 + 0;
      new Thread(() -> {
         int var9x = var8;
         if (this.field21237 == 1) {
            var9x = var8 + 30;
         }

         while (var10 >= new Date().getTime() && var12 == this.field21237) {
            float var10x = 1.0F - (float)(var10 - new Date().getTime()) / var9;
            var10x = Class9782.method38557((float)Math.sqrt((double)var10x), 0.0F, 1.0F, 1.0F);
            this.method13512((int)((float)var6 + (float)var9x * var10x));
         }
      }).start();
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
   }

   // $VF: synthetic method
   public static ClientResource method13574() {
      return field21239;
   }

   // $VF: synthetic method
   public static int method13575() {
      return field21240;
   }
}
