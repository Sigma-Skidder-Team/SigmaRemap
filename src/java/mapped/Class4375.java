package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Class4375 extends Class4247 {
   private List<Class4240> field21375 = new ArrayList<Class4240>();
   private final int field21376;
   private final Animation field21377;
   private boolean field21378 = false;
   private final List<Class6601> field21379 = new ArrayList<Class6601>();
   private final List<Class9342> field21380 = new ArrayList<Class9342>();

   public Class4375(Class4305 var1, String var2, int var3, int var4, int var5, String var6) {
      super(var1, var2, var3 - 125, var4, 250, 330, Class6387.field27961, var6, false);
      if (this.field20896 + this.field20898 <= Minecraft.getInstance().field1283.method8044()) {
         this.field20896 += 10;
      } else {
         this.field20896 -= 400;
         this.field21378 = true;
      }

      this.field21376 = var5;
      this.field21377 = new Animation(250, 0);
      this.method13292(true);
      this.method13300(false);
      this.method13712();
      Class4274 var9;
      this.method13230(
         var9 = new Class4274(
            this,
            "addButton",
            this.field20897 - 70,
            this.field20898 - 70,
            ResourceRegistry.field38855.method23942("Add"),
            70,
            Class6387.field27961,
            "Add",
            ResourceRegistry.field38855
         )
      );
      var9.method13251((var1x, var2x) -> this.method13714());
   }

   public void method13711() {
      this.method13716();
   }

   public void method13712() {
      int var3 = 1;
      ArrayList var4 = new ArrayList();

      for (Class4305 var6 : this.method13241()) {
         if (var6.method13269() != 0) {
            var4.add(var6.method13257());
         }
      }

      this.method13242();
      this.method13145(true);
      this.method13238();

      for (Class6984 var10 : Class4309.method13328()) {
         int var7 = var10.method21599();
         if (var7 == this.field21376) {
            Class4253 var8;
            this.method13230(var8 = new Class4253(this, var10.method21596(), 0, 20 + 55 * var3, this.field20897, 55, var10, var3++));
            var8.method13036(var2 -> {
               var10.method21598(0);
               this.method13037();
            });
            if (var4.size() > 0 && !var4.contains(var10.method21596())) {
               var8.method13056();
            }
         }
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      Map<Integer, Class4253> var5 = new HashMap();

      for (Class4305 var7 : this.method13241()) {
         if (var7 instanceof Class4253) {
             var5.put(((Class4253) var7).field20626, (Class4253) var7);
         }
      }

      int var9 = 75;

      for (Entry<Integer, Class4253> var11 : var5.entrySet()) {
         var11.getValue().method13266(var9);
         var9 += var11.getValue().method13269();
      }

      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      var1 = this.field21377.calcPercent();
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      this.method13284((int)((float)this.field20897 * 0.2F * (1.0F - var4)) * (!this.field21378 ? 1 : -1));
      super.method13224();
      byte var5 = 10;
      int var6 = Class5628.method17688(-723724, Class9782.method38557(var1, 0.0F, 1.0F, 1.0F));
      Class3192.method11463(
         (float)(this.field20895 + var5 / 2),
         (float)(this.field20896 + var5 / 2),
         (float)(this.field20897 - var5),
         (float)(this.field20898 - var5),
         35.0F,
         var1
      );
      Class3192.method11426(
         (float)(this.field20895 + var5 / 2),
         (float)(this.field20896 + var5 / 2),
         (float)(this.field20895 - var5 / 2 + this.field20897),
         (float)(this.field20896 - var5 / 2 + this.field20898),
         Class5628.method17688(Class1979.field12891.field12910, var1 * 0.25F)
      );
      Class3192.method11475((float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, (float)var5, var6);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field20895, (float)this.field20896, 0.0F);
      GL11.glRotatef(!this.field21378 ? -90.0F : 90.0F, 0.0F, 0.0F, 1.0F);
      GL11.glTranslatef((float)(-this.field20895), (float)(-this.field20896), 0.0F);
      Class3192.method11449(
         (float)(this.field20895 + (!this.field21378 ? 0 : this.field20898)),
         (float)this.field20896 + (float)((this.field20897 - 47) / 2) * (!this.field21378 ? 1.0F : -1.5F),
         18.0F,
         47.0F,
         ResourcesDecrypter.selectPNG,
         var6
      );
      GL11.glPopMatrix();
      Class3192.method11439(
         ResourceRegistry.field38855,
         (float)(this.field20895 + 25),
         (float)(this.field20896 + 20),
         this.field20912 + " Key",
         Class5628.method17688(Class1979.field12891.field12910, 0.8F * var1)
      );
      Class3192.method11426(
         (float)(this.field20895 + 25),
         (float)(this.field20896 + 68),
         (float)(this.field20895 + this.field20897 - 25),
         (float)(this.field20896 + 69),
         Class5628.method17688(Class1979.field12891.field12910, 0.05F * var1)
      );
      super.method13027(var1);
   }

   public final void method13713(Class6601 var1) {
      this.field21379.add(var1);
   }

   public final void method13714() {
      for (Class6601 var4 : this.field21379) {
         var4.method20001(this);
      }
   }

   public final void method13715(Class9342 var1) {
      this.field21380.add(var1);
   }

   public final void method13716() {
      for (Class9342 var4 : this.field21380) {
         var4.method35349(this);
      }
   }
}
