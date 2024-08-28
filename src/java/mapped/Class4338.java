package mapped;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4338 extends Class4304 {
   public final ModuleCategory field21193;
   public Class4341 field21194;
   public float field21195;
   public static final int field21196 = 60;
   public int field21197;
   public int field21198;
   private int field21199;
   private final List<Class9476> field21200 = new ArrayList<Class9476>();

   public Class4338(Class4305 var1, String var2, int var3, int var4, ModuleCategory var5) {
      super(var1, var2, var3, var4, 200, 350, true);
      this.method13268(200);
      this.method13270(350);
      this.field20886 = true;
      this.field21193 = var5;
      this.method13505();
   }

   public void method13504() {
      this.method13222(() -> {
         this.method13236(this.field21194);
         this.method13230(this.field21194 = new Class4341(this, "modListView", 0, 60, this.method13267(), this.method13269() - 60, this.field21193));
      });
   }

   private void method13505() {
      this.method13230(this.field21194 = new Class4341(this, "modListView", 0, 60, this.method13267(), this.method13269() - 60, this.field21193));
      this.field21194.method13261(new Class6666());
      this.field21194.method13261((var0, var1) -> {
         var0.method13266(60);
         var0.method13270(var1.method13269() - 60);
      });
   }

   @Override
   public void method13028(int var1, int var2) {
      if (!(this.field21195 >= 1.0F)) {
         this.method13215(false);
         this.field20909 = false;
      } else {
         this.field21197 = this.method13263();
         this.field21198 = this.method13265();
         this.method13215(true);
      }

      float var5 = 200.0F;
      float var6 = 320.0F;
      float var7 = 0.7F;
      float var8 = 0.1F;
      int var9 = (int)(200.0F + 140.0F * (1.0F - this.field21195));
      int var10 = (int)(320.0F + 320.0F * 0.1F * (1.0F - this.field21195));
      int var11 = this.field21198;
      int var12 = (int)((float)this.field21197 - ((float)var9 - 200.0F) / 2.0F + 0.5F);
      if (this.field21195 < 1.0F) {
         if (var12 < 0) {
            var12 = 0;
         }

         if (var12 + var9 > this.field20892.method13267()) {
            var12 = this.field20892.method13267() - var9;
         }

         if (var11 + var10 > this.field20892.method13269()) {
            var11 = this.field20892.method13269() - var10;
         }
      }

      this.method13268(var9);
      this.method13270(var10);
      this.method13264(var12);
      this.method13266(var11);
      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      super.method13224();
      super.method13225();
      int var4 = (int)(1.0F + 10.0F * (1.0F - this.field21195));
      Class3192.method11463(
         (float)(this.method13263() + (var4 - 1)),
         (float)(this.method13265() + (var4 - 1)),
         (float)(this.method13267() - (var4 - 1) * 2),
         (float)(this.method13269() - (var4 - 1) * 2),
         (float)this.field21199 + (1.0F - this.field21195) * (float)var4,
         var1
      );
      Class3192.method11426(
         (float)this.method13263(),
         (float)this.method13265(),
         (float)(this.method13263() + this.method13267()),
         (float)(this.method13265() + 60),
         Class5628.method17688(Class1979.field12896.field12910, Math.min(1.0F, var1 * 0.9F * this.field21195))
      );
      Class3192.method11424(
         (float)this.method13263(),
         (float)this.method13265() + 60.0F * this.field21195,
         (float)this.method13267(),
         (float)this.method13269() - 60.0F * this.field21195,
         Class5628.method17688(Class1979.field12896.field12910, var1)
      );
      if (!(this.field21195 > 0.8F)) {
         if (this.field21195 < 0.2F) {
            this.field21199 = 30;
         }
      } else {
         this.field21199 = 20;
      }

      String var5 = this.method13506().getName();
      Class3192.method11440(
         ResourceRegistry.JelloLightFont25,
         (float)(this.method13263() + 20),
         (float)(this.method13265() + 30),
         var5,
         Class5628.method17688(Class1979.field12891.field12910, var1 * 0.5F * this.field21195),
         Class2218.field14488,
         Class2218.field14492
      );
      GL11.glPushMatrix();
      super.method13027(var1 * var1);
      GL11.glPopMatrix();
      if (this.field21194.method13513() > 0) {
         Class3192.method11449(
            (float)this.method13263(),
            (float)(this.method13265() + 60),
            (float)this.method13267(),
            18.0F,
            ResourcesDecrypter.shadowBottomPNG,
            Class5628.method17688(Class1979.field12896.field12910, var1 * this.field21195 * 0.5F)
         );
      }
   }

   public ModuleCategory method13506() {
      return this.field21193;
   }

   public final void method13507(Class9476 var1) {
      this.field21200.add(var1);
   }

   public final void method13508(Module var1) {
      for (Class9476 var5 : this.field21200) {
         var5.method36568(var1);
      }
   }
}
