package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;

import java.util.ArrayList;
import java.util.List;

public class Class4374 extends Class4247 {
   private static String[] field21371;
   private float field21372 = 1.0F;
   private boolean field21373 = false;
   private final List<Class6649> field21374 = new ArrayList<Class6649>();

   public Class4374(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)this.field20896 + (float)this.field20898 * this.field21372,
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.2F)
      );
      RenderUtil.method11426(
         (float)this.field20895,
         (float)(this.field20896 + this.field20898),
         (float)(this.field20895 + this.field20897),
         (float)this.field20896 + (float)this.field20898 * this.field21372,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.2F)
      );
      super.draw(var1);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      if (!super.method13078(this.field20895, this.field20896, var3)) {
         this.field21373 = true;
         return false;
      } else {
         return true;
      }
   }

   public float method13706(int var1) {
      return (float)(var1 - this.method13272()) / (float)this.field20898;
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field21373) {
         this.method13708(this.method13706(var2));
         this.method13710();
      }
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      super.method13095(var1, var2, var3);
      this.field21373 = false;
   }

   @Override
   public void method13079(float var1) {
      if (this.method13298()) {
         this.method13708(this.method13707() - var1 / 2000.0F);
         this.method13710();
      }

      super.method13079(var1);
   }

   public float method13707() {
      return this.field21372;
   }

   public void method13708(float var1) {
      this.field21372 = Math.min(Math.max(var1, 0.0F), 1.0F);
   }

   public Class4304 method13709(Class6649 var1) {
      this.field21374.add(var1);
      return this;
   }

   public void method13710() {
      for (Class6649 var4 : this.field21374) {
         var4.method20301(this);
      }
   }
}
