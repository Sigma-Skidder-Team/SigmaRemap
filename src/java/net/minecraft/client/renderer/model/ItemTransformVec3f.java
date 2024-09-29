package net.minecraft.client.renderer.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import mapped.Vector3f;
import net.minecraft.util.math.vector.Quaternion;

public class ItemTransformVec3f {
   public static final ItemTransformVec3f DEFAULT = new ItemTransformVec3f(new Vector3f(), new Vector3f(), new Vector3f(1.0F, 1.0F, 1.0F));
   public final Vector3f field29589;
   public final Vector3f field29590;
   public final Vector3f field29591;

   public ItemTransformVec3f(Vector3f var1, Vector3f var2, Vector3f var3) {
      this.field29589 = var1.method25287();
      this.field29590 = var2.method25287();
      this.field29591 = var3.method25287();
   }

   public void method20691(boolean var1, MatrixStack var2) {
      if (this != DEFAULT) {
         float var5 = this.field29589.method25269();
         float var6 = this.field29589.method25270();
         float var7 = this.field29589.method25271();
         if (var1) {
            var6 = -var6;
            var7 = -var7;
         }

         int var8 = !var1 ? 1 : -1;
         var2.translate((double)((float)var8 * this.field29590.method25269()), (double)this.field29590.method25270(), (double)this.field29590.method25271());
         var2.rotate(new Quaternion(var5, var6, var7, true));
         var2.method35292(this.field29591.method25269(), this.field29591.method25270(), this.field29591.method25271());
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (this.getClass() != var1.getClass()) {
            return false;
         } else {
            ItemTransformVec3f var4 = (ItemTransformVec3f)var1;
            return this.field29589.equals(var4.field29589) && this.field29591.equals(var4.field29591) && this.field29590.equals(var4.field29590);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field29589.hashCode();
      var3 = 31 * var3 + this.field29590.hashCode();
      return 31 * var3 + this.field29591.hashCode();
   }
}
