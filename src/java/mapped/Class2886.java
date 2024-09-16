package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.Arrays;

public class Class2886<T extends Entity> extends Class2803<T> {
   private static String[] field17883;
   private final Class7219[] field17884;
   private final Class7219 field17885 = new Class7219(this, 0, 0);
   private final ImmutableList<Class7219> field17886;

   public Class2886() {
      this.field17885.method22673(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field17884 = new Class7219[12];

      for (int var3 = 0; var3 < this.field17884.length; var3++) {
         this.field17884[var3] = new Class7219(this, 0, 16);
         this.field17884[var3].method22673(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);
      }

      Builder var4 = ImmutableList.builder();
      var4.add(this.field17885);
      var4.addAll(Arrays.<Class7219>asList(this.field17884));
      this.field17886 = var4.build();
   }

   @Override
   public Iterable<Class7219> method11015() {
      return this.field17886;
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 * (float) Math.PI * -0.1F;

      for (int var10 = 0; var10 < 4; var10++) {
         this.field17884[var10].field31033 = -2.0F + MathHelper.cos(((float)(var10 * 2) + var4) * 0.25F);
         this.field17884[var10].field31032 = MathHelper.cos(var9) * 9.0F;
         this.field17884[var10].field31034 = MathHelper.sin(var9) * 9.0F;
         var9++;
      }

      var9 = (float) (Math.PI / 4) + var4 * (float) Math.PI * 0.03F;

      for (int var13 = 4; var13 < 8; var13++) {
         this.field17884[var13].field31033 = 2.0F + MathHelper.cos(((float)(var13 * 2) + var4) * 0.25F);
         this.field17884[var13].field31032 = MathHelper.cos(var9) * 7.0F;
         this.field17884[var13].field31034 = MathHelper.sin(var9) * 7.0F;
         var9++;
      }

      var9 = 0.47123894F + var4 * (float) Math.PI * -0.05F;

      for (int var14 = 8; var14 < 12; var14++) {
         this.field17884[var14].field31033 = 11.0F + MathHelper.cos(((float)var14 * 1.5F + var4) * 0.5F);
         this.field17884[var14].field31032 = MathHelper.cos(var9) * 5.0F;
         this.field17884[var14].field31034 = MathHelper.sin(var9) * 5.0F;
         var9++;
      }

      this.field17885.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17885.field31035 = var6 * (float) (Math.PI / 180.0);
   }
}
