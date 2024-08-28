package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.util.ArrayList;
import java.util.List;

public class Class4341 extends Class4339 implements Class4342 {
   public final ModuleCategory field21214;
   private List<Class4240> field21215 = new ArrayList<Class4240>();
   private boolean field21216;
   private boolean field21217;
   private float field21218 = 1.0F;

   public Class4341(Class4305 var1, String var2, int var3, int var4, int var5, int var6, ModuleCategory var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.field21214 = var7;
      this.field21217 = true;
      ((Class4338)var1).field21195 = 1.0F;
      this.field21217 = true;
      this.method13300(false);
      this.method13511();
   }

   public void method13511() {
      int var3 = 0;

      for (Module var5 : Client.getInstance().getModuleManager().method14665(this.field21214)) {
         int var9 = Class5628.method17688(-3487030, 0.0F);
         Class6387 var12 = new Class6387(!var5.method15996() ? 1895167477 : -14047489, !var5.method15996() ? var9 : -14042881)
            .method19410(!var5.method15996() ? Class1979.field12891.field12910 : Class1979.field12896.field12910);
         var12.method19412(Class2218.field14488);
         Class4240 var13;
         this.method13517()
            .method13230(
               var13 = new Class4240(
                  this.method13517(), var5.method15991() + "Button", 0, var3 * 30, this.method13267(), 30, var12, var5.method15991(), ResourceRegistry.field38854
               )
            );
         if (!var5.method15996()) {
            var13.method13034(22);
         } else {
            var13.method13034(30);
         }

         this.field21215.add(var13);
         var13.method13251(
            (var3x, var4) -> {
               Class4240 var7 = (Class4240)var3x;
               if (var4 != 0) {
                  if (var4 == 1) {
                     Class4338 var8 = (Class4338)this.method13258();
                     var8.method13508(var5);
                  }
               } else {
                  var5.method16000();
                  Class6387 var9x = new Class6387(!var5.method15996() ? 1895167477 : -14047489, !var5.method15996() ? var9 : -14042881)
                     .method19410(!var5.method15996() ? Class1979.field12891.field12910 : Class1979.field12896.field12910);
                  if (!var5.method15996()) {
                     var7.method13034(22);
                  } else {
                     var7.method13034(30);
                  }

                  var9x.method19412(Class2218.field14488);
                  var7.method13308(var9x);
               }
            }
         );
         var13.method13261(new Class6666());
         var3++;
      }

      this.method13517().method13246(new Class7262(1));
   }

   private float method13523() {
      return this.field21218 * this.field21218 * (3.0F - 2.0F * this.field21218);
   }

   private float method13524(float var1, float var2, float var3, float var4) {
      var1 /= var4 / 2.0F;
      if (!(var1 < 1.0F)) {
         var1--;
         return -var3 / 2.0F * (var1 * (var1 - 2.0F) - 1.0F) + var2;
      } else {
         return var3 / 2.0F * var1 * var1 + var2;
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      Class4338 var5 = (Class4338)this.field20892;
      Minecraft.getInstance();
      float var6 = (float)(0.07F * (60.0 / (double) Minecraft.method1586()));
      this.field21218 = this.field21218 + (!this.method13525() ? 0.0F : (!this.field21217 ? var6 : -var6));
      this.field21218 = Math.max(0.0F, Math.min(1.0F, this.field21218));
      var5.field21195 = this.method13524(this.field21218, 0.0F, 1.0F, 1.0F);
      if (this.method13525()) {
         this.method13288(true);
         if (!(var5.field21195 <= 0.0F)) {
            if (var5.field21195 >= 1.0F) {
               this.field21216 = false;
               this.field21217 = true;
               this.method13292(true);
               this.method13145(true);
               this.method13296(true);
               var5.field21195 = 1.0F;
            }
         } else {
            this.field21216 = false;
            this.field21217 = false;
            this.method13292(false);
            this.method13145(false);
            this.method13296(false);
            var5.field21195 = 0.0F;
         }
      }
   }

   @Override
   public void method13027(float var1) {
      this.method13225();
      super.method13027(var1 * ((Class4338)this.field20892).field21195);
   }

   @Override
   public boolean method13525() {
      return this.field21216;
   }

   @Override
   public void method13526() {
      this.field21216 = true;
   }

   @Override
   public boolean method13527() {
      return this.field21217;
   }

   @Override
   public void method13528(boolean var1) {
      if (var1 != this.method13527()) {
         this.method13526();
      }
   }

   public int method13529(Module var1) {
      int var4 = 0;

      for (Class4240 var6 : this.field21215) {
         var4++;
         if (var6.method13257().equals(var1.method15991() + "Button")) {
            break;
         }
      }

      return var4 * 30;
   }
}
