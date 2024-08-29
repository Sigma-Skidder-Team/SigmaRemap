package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class Class2883 extends Class2803<BoatEntity> {
   private static String[] field17870;
   private final Class7219[] field17871 = new Class7219[2];
   private final Class7219 field17872;
   private final ImmutableList<Class7219> field17873;

   public Class2883() {
      Class7219[] var3 = new Class7219[]{
         new Class7219(this, 0, 0).method22684(128, 64),
         new Class7219(this, 0, 19).method22684(128, 64),
         new Class7219(this, 0, 27).method22684(128, 64),
         new Class7219(this, 0, 35).method22684(128, 64),
         new Class7219(this, 0, 43).method22684(128, 64)
      };
      byte var4 = 32;
      byte var5 = 6;
      byte var6 = 20;
      byte var7 = 4;
      byte var8 = 28;
      var3[0].method22675(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      var3[0].method22679(0.0F, 3.0F, 1.0F);
      var3[1].method22675(-13.0F, -7.0F, -1.0F, 18.0F, 6.0F, 2.0F, 0.0F);
      var3[1].method22679(-15.0F, 4.0F, 4.0F);
      var3[2].method22675(-8.0F, -7.0F, -1.0F, 16.0F, 6.0F, 2.0F, 0.0F);
      var3[2].method22679(15.0F, 4.0F, 0.0F);
      var3[3].method22675(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var3[3].method22679(0.0F, 4.0F, -9.0F);
      var3[4].method22675(-14.0F, -7.0F, -1.0F, 28.0F, 6.0F, 2.0F, 0.0F);
      var3[4].method22679(0.0F, 4.0F, 9.0F);
      var3[0].field31035 = (float) (Math.PI / 2);
      var3[1].field31036 = (float) (Math.PI * 3.0 / 2.0);
      var3[2].field31036 = (float) (Math.PI / 2);
      var3[3].field31036 = (float) Math.PI;
      this.field17871[0] = this.method11200(true);
      this.field17871[0].method22679(3.0F, -5.0F, 9.0F);
      this.field17871[1] = this.method11200(false);
      this.field17871[1].method22679(3.0F, -5.0F, -9.0F);
      this.field17871[1].field31036 = (float) Math.PI;
      this.field17871[0].field31037 = (float) (Math.PI / 16);
      this.field17871[1].field31037 = (float) (Math.PI / 16);
      this.field17872 = new Class7219(this, 0, 0).method22684(128, 64);
      this.field17872.method22675(-14.0F, -9.0F, -3.0F, 28.0F, 16.0F, 3.0F, 0.0F);
      this.field17872.method22679(0.0F, -3.0F, 1.0F);
      this.field17872.field31035 = (float) (Math.PI / 2);
      Builder var9 = ImmutableList.builder();
      var9.addAll(Arrays.<Class7219>asList(var3));
      var9.addAll(Arrays.<Class7219>asList(this.field17871));
      this.field17873 = var9.build();
   }

   public void method10998(BoatEntity var1, float var2, float var3, float var4, float var5, float var6) {
      this.method11201(var1, 0, var2);
      this.method11201(var1, 1, var2);
   }

   public ImmutableList<Class7219> method11015() {
      return this.field17873;
   }

   public Class7219 method11199() {
      return this.field17872;
   }

   public Class7219 method11200(boolean var1) {
      Class7219 var4 = new Class7219(this, 62, !var1 ? 20 : 0).method22684(128, 64);
      byte var5 = 20;
      byte var6 = 7;
      byte var7 = 6;
      float var8 = -5.0F;
      var4.method22673(-1.0F, 0.0F, -5.0F, 2.0F, 2.0F, 18.0F);
      var4.method22673(!var1 ? 0.001F : -1.001F, -3.0F, 8.0F, 1.0F, 6.0F, 7.0F);
      return var4;
   }

   public void method11201(BoatEntity var1, int var2, float var3) {
      float var6 = var1.method4152(var2, var3);
      Class7219 var7 = this.field17871[var2];
      var7.field31035 = (float) MathHelper.method37779((float) (-Math.PI / 3), (float) (-Math.PI / 12), (double)((MathHelper.sin(-var6) + 1.0F) / 2.0F));
      var7.field31036 = (float) MathHelper.method37779(
         (float) (-Math.PI / 4), (float) (Math.PI / 4), (double)((MathHelper.sin(-var6 + 1.0F) + 1.0F) / 2.0F)
      );
      if (var2 == 1) {
         var7.field31036 = (float) Math.PI - var7.field31036;
      }
   }
}
