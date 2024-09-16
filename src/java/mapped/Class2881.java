package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;

public class Class2881<T extends WitherEntity> extends Class2803<T> {
   private static String[] field17862;
   private final Class7219[] field17863;
   private final Class7219[] field17864;
   private final ImmutableList<Class7219> field17865;

   public Class2881(float var1) {
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17863 = new Class7219[3];
      this.field17863[0] = new Class7219(this, 0, 16);
      this.field17863[0].method22675(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, var1);
      this.field17863[1] = new Class7219(this).method22684(this.field17604, this.field17605);
      this.field17863[1].method22679(-2.0F, 6.9F, -0.5F);
      this.field17863[1].method22671(0, 22).method22675(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, var1);
      this.field17863[1].method22671(24, 22).method22675(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.field17863[1].method22671(24, 22).method22675(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.field17863[1].method22671(24, 22).method22675(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, var1);
      this.field17863[2] = new Class7219(this, 12, 22);
      this.field17863[2].method22675(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, var1);
      this.field17864 = new Class7219[3];
      this.field17864[0] = new Class7219(this, 0, 0);
      this.field17864[0].method22675(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.field17864[1] = new Class7219(this, 32, 0);
      this.field17864[1].method22675(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.field17864[1].field31032 = -8.0F;
      this.field17864[1].field31033 = 4.0F;
      this.field17864[2] = new Class7219(this, 32, 0);
      this.field17864[2].method22675(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, var1);
      this.field17864[2].field31032 = 10.0F;
      this.field17864[2].field31033 = 4.0F;
      Builder var4 = ImmutableList.builder();
      var4.addAll(Arrays.<Class7219>asList(this.field17864));
      var4.addAll(Arrays.<Class7219>asList(this.field17863));
      this.field17865 = var4.build();
   }

   public ImmutableList<Class7219> method11015() {
      return this.field17865;
   }

   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = MathHelper.cos(var4 * 0.1F);
      this.field17863[1].field31035 = (0.065F + 0.05F * var9) * (float) Math.PI;
      this.field17863[2]
         .method22679(
            -2.0F, 6.9F + MathHelper.cos(this.field17863[1].field31035) * 10.0F, -0.5F + MathHelper.sin(this.field17863[1].field31035) * 10.0F
         );
      this.field17863[2].field31035 = (0.265F + 0.1F * var9) * (float) Math.PI;
      this.field17864[0].field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17864[0].field31035 = var6 * (float) (Math.PI / 180.0);
   }

   public void method10997(T var1, float var2, float var3, float var4) {
      for (int var7 = 1; var7 < 3; var7++) {
         this.field17864[var7].field31036 = (var1.method5010(var7 - 1) - var1.renderYawOffset) * (float) (Math.PI / 180.0);
         this.field17864[var7].field31035 = var1.method5011(var7 - 1) * (float) (Math.PI / 180.0);
      }
   }
}
