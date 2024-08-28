package mapped;

import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.Class8794;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class4296 extends Class4278 {
   private static String[] field20812;
   private Account field20813 = null;
   private List<Class4348> field20814 = new ArrayList<Class4348>();
   private float field20815 = 0.0F;

   public Class4296(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   public void method13178(Account var1) {
      this.field20813 = var1;

      for (Class4348 var5 : this.field20814) {
         this.method13234(var5);
      }

      if (var1 != null) {
         List<Class8794> var11 = new ArrayList();

         for (Class8794 var6 : var1.method34215()) {
            var11.add(var6);
         }

         Collections.reverse(var11);
         int var13 = 0;
         int var14 = 90;
         int var7 = 14;

         for (Class8794 var9 : var11) {
            if (var9.method31736() != null && var9.method31736().method25580() != null) {
               Class4348 var10 = new Class4348(
                  this, ((Class8794)var11.get(var13)).method31734(), 40, 100 + var13 * (var14 + var7), this.field20897 - 90, var14, var9
               );
               this.method13230(var10);
               this.field20814.add(var10);
               var13++;
            }
         }

         this.method13270(var13 * (var14 + var7) + 116);
      }
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      this.field20815 = (float)((double)this.field20815 + (this.method13287() ? 0.33 : -0.33));
      this.field20815 = Math.min(1.0F, Math.max(0.0F, this.field20815));
      if (this.field20813 == null) {
         int var4 = this.field20897 - 30;
         int var5 = this.field20895 + 5;
         Class3192.method11455(
            (float)var5,
            (float)((Minecraft.getInstance().field1283.method8044() - var4 * 342 / 460) / 2 - 60),
            (float)var4,
            (float)(var4 * 342 / 460),
            ResourcesDecrypter.imgPNG
         );
      }

      if (this.field20813 != null) {
         int var6 = Class5628.method17688(Class1979.field12891.field12910, 0.2F);
         int var7 = Class5628.method17688(Class1979.field12891.field12910, 0.7F);
         Class3192.method11439(
            ResourceRegistry.field38860,
            (float)(this.field20895 + (this.field20897 - ResourceRegistry.field38860.method23942(this.field20813.method34217())) / 2),
            (float)this.field20896,
            this.field20813.method34217(),
            var7
         );
         super.method13027(var1);
      }
   }
}
