package mapped;

import java.util.ArrayList;
import java.util.List;

public enum Class2309 {
   field15814(Class8514.field37796, 0.0F, 3.0F, 0.0F),
   field15815(Class8514.field37888, 0.0F, 1.875F, 0.0F),
   field15816(Class8514.field37966, 0.0F, 1.875F, 0.0F),
   field15817(Class8514.field37904, 0.0F, 1.875F, 0.0F),
   field15818(Class8514.field38115, 0.0F, 0.5F, 0.0F),
   field15819(Class8514.field38045, 0.0F, 0.6F, 0.0F),
   field15820(Class8514.field38144, 0.0F, 2.5F, 0.0F);

   private Class3257 field15821;
   private float field15822;
   private float field15823;
   private float field15824;
   public double field15825;
   public double field15826;
   public double field15827;
   public float field15828;
   public float field15829;
   public float field15830;
   public Class8710 field15831;
   public Entity field15832;
   private static final Class2309[] field15833 = new Class2309[]{field15814, field15815, field15816, field15817, field15818, field15819, field15820};

   private Class2309(Class3257 var3, float var4, float var5, float var6) {
      this.field15821 = var3;
      this.field15822 = var4;
      this.field15823 = var5;
      this.field15824 = var6;
   }

   public float method9081() {
      if (!this.field15821.equals(Class8514.field37796)) {
         return this.field15823;
      } else {
         return !(this.field15823 * Class3263.method11777(Class5280.method16524().player.method3159()) > 0.0F)
            ? Class3263.method11777(20)
            : Class3263.method11777(Class5280.method16525().player.method3159());
      }
   }

   public float method9082() {
      return this.field15822;
   }

   public float method9083() {
      return this.field15824;
   }

   public Class3257 method9084() {
      return this.field15821;
   }

   public static Class2309 method9085(Class3257 var0) {
      for (Class2309 var6 : values()) {
         if (var6.method9084().equals(var0)) {
            return var6;
         }
      }

      return null;
   }

   public List<Class9110> method9086() {
      ArrayList var3 = new ArrayList();
      float var4 = (float)Math.toRadians((double)Class5280.method16526().player.field5031);
      float var5 = (float)Math.toRadians((double)Class5280.method16527().player.field5032);
      double var6 = Class5280.method16528().player.field5048
         + (Class5280.method16529().player.getPosX() - Class5280.method16530().player.field5048)
            * (double)Class5280.method16531().timer.renderPartialTicks;
      double var8 = Class5280.method16532().player.field5049
         + (Class5280.method16533().player.getPosY() - Class5280.method16534().player.field5049)
            * (double)Class5280.method16535().timer.renderPartialTicks;
      double var10 = Class5280.method16536().player.field5050
         + (Class5280.method16537().player.getPosZ() - Class5280.method16538().player.field5050)
            * (double)Class5280.method16539().timer.renderPartialTicks;
      this.field15825 = var6;
      this.field15826 = var8 + (double)Class5280.method16540().player.method3393() - 0.1F;
      this.field15827 = var10;
      float var12 = Math.min(20.0F, (float)(72000 - Class5280.method16541().player.method3159()) + Class5280.method16542().method1562()) / 20.0F;
      this.field15828 = -MathHelper.method37763(var4) * MathHelper.method37764(var5) * this.field15823 * var12;
      this.field15829 = -MathHelper.method37763(var5) * this.field15823 * var12;
      this.field15830 = MathHelper.method37764(var4) * MathHelper.method37764(var5) * this.field15823 * var12;
      this.field15831 = null;
      this.field15832 = null;
      var3.add(new Class9110(this.field15825, this.field15826, this.field15827));

      while (this.field15831 == null && this.field15832 == null && this.field15826 > 0.0) {
         Vector3d var13 = new Vector3d(this.field15825, this.field15826, this.field15827);
         Vector3d var14 = new Vector3d(
            this.field15825 + (double)this.field15828, this.field15826 + (double)this.field15829, this.field15827 + (double)this.field15830
         );
         float var15 = (float)(!(this.field15821 instanceof Class3263) ? 0.25 : 0.3);
         Class6488 var16 = new Class6488(
            this.field15825 - (double)var15,
            this.field15826 - (double)var15,
            this.field15827 - (double)var15,
            this.field15825 + (double)var15,
            this.field15826 + (double)var15,
            this.field15827 + (double)var15
         );
         List<Entity> var17 = Class5280.method16544()
            .world
            .method6770(
               Class5280.method16543().player,
               var16.method19667((double)this.field15828, (double)this.field15829, (double)this.field15830).method19663(1.0, 1.0, 1.0),
               Class8088.field34763.and(new Class167(this, var15, var13, var14))
            );
         if (var17.size() > 0) {
            for (Entity var22 : var17) {
               this.field15832 = var22;
            }
            break;
         }

         Class8711 var18 = Class5280.method16546()
            .world
            .method7036(new Class6809(var13, var14, Class2271.field14774, Class1985.field12962, Class5280.method16545().player));
         if (var18 != null && var18.method31417() != Class2100.field13689) {
            this.field15831 = var18;
            this.field15825 = this.field15831.method31419().field18048;
            this.field15826 = this.field15831.method31419().field18049;
            this.field15827 = this.field15831.method31419().field18050;
            var3.add(new Class9110(this.field15825, this.field15826, this.field15827));
            break;
         }

         float var19 = 0.99F;
         float var20 = 0.05F;
         this.field15825 = this.field15825 + (double)this.field15828;
         this.field15826 = this.field15826 + (double)this.field15829;
         this.field15827 = this.field15827 + (double)this.field15830;
         var3.add(new Class9110(this.field15825, this.field15826, this.field15827));
         this.field15828 *= var19;
         this.field15829 *= var19;
         this.field15830 *= var19;
         this.field15829 -= var20;
      }

      return var3;
   }
}
