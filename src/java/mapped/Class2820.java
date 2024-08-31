package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;

public class Class2820 extends Class2803<Class1105> {
   private static String[] field17565;
   private static final float[] field17566 = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
   private static final float[] field17567 = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
   private static final float[] field17568 = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
   private static final float[] field17569 = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
   private static final float[] field17570 = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
   private static final float[] field17571 = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
   private final Class7219 field17572;
   private final Class7219 field17573;
   private final Class7219[] field17574;
   private final Class7219[] field17575;

   public Class2820() {
      this.field17604 = 64;
      this.field17605 = 64;
      this.field17574 = new Class7219[12];
      this.field17572 = new Class7219(this);
      this.field17572.method22671(0, 0).method22673(-6.0F, 10.0F, -8.0F, 12.0F, 12.0F, 16.0F);
      this.field17572.method22671(0, 28).method22673(-8.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F);
      this.field17572.method22671(0, 28).method22674(6.0F, 10.0F, -6.0F, 2.0F, 12.0F, 12.0F, true);
      this.field17572.method22671(16, 40).method22673(-6.0F, 8.0F, -6.0F, 12.0F, 2.0F, 12.0F);
      this.field17572.method22671(16, 40).method22673(-6.0F, 22.0F, -6.0F, 12.0F, 2.0F, 12.0F);

      for (int var3 = 0; var3 < this.field17574.length; var3++) {
         this.field17574[var3] = new Class7219(this, 0, 0);
         this.field17574[var3].method22673(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);
         this.field17572.method22670(this.field17574[var3]);
      }

      this.field17573 = new Class7219(this, 8, 0);
      this.field17573.method22673(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F);
      this.field17572.method22670(this.field17573);
      this.field17575 = new Class7219[3];
      this.field17575[0] = new Class7219(this, 40, 0);
      this.field17575[0].method22673(-2.0F, 14.0F, 7.0F, 4.0F, 4.0F, 8.0F);
      this.field17575[1] = new Class7219(this, 0, 54);
      this.field17575[1].method22673(0.0F, 14.0F, 0.0F, 3.0F, 3.0F, 7.0F);
      this.field17575[2] = new Class7219(this);
      this.field17575[2].method22671(41, 32).method22673(0.0F, 14.0F, 0.0F, 2.0F, 2.0F, 6.0F);
      this.field17575[2].method22671(25, 19).method22673(1.0F, 10.5F, 3.0F, 1.0F, 9.0F, 9.0F);
      this.field17572.method22670(this.field17575[0]);
      this.field17575[0].method22670(this.field17575[1]);
      this.field17575[1].method22670(this.field17575[2]);
      this.method11024(0.0F, 0.0F);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(this.field17572);
   }

   public void method10998(Class1105 var1, float var2, float var3, float var4, float var5, float var6) {
      float var9 = var4 - (float)var1.ticksExisted;
      this.field17572.field31036 = var5 * (float) (Math.PI / 180.0);
      this.field17572.field31035 = var6 * (float) (Math.PI / 180.0);
      float var10 = (1.0F - var1.method5309(var9)) * 0.55F;
      this.method11024(var4, var10);
      this.field17573.field31034 = -8.25F;
      Object var11 = Minecraft.getInstance().getRenderViewEntity();
      if (var1.method5305()) {
         var11 = var1.method5306();
      }

      if (var11 != null) {
         Vector3d var12 = ((Entity)var11).method3286(0.0F);
         Vector3d var13 = var1.method3286(0.0F);
         double var14 = var12.y - var13.y;
         if (!(var14 > 0.0)) {
            this.field17573.field31033 = 1.0F;
         } else {
            this.field17573.field31033 = 0.0F;
         }

         Vector3d var16 = var1.method3281(0.0F);
         var16 = new Vector3d(var16.x, 0.0, var16.z);
         Vector3d var17 = new Vector3d(var13.x - var12.x, 0.0, var13.z - var12.z)
            .method11333()
            .method11351((float) (Math.PI / 2));
         double var18 = var16.method11334(var17);
         this.field17573.field31032 = MathHelper.method37765((float)Math.abs(var18)) * 2.0F * (float)Math.signum(var18);
      }

      this.field17573.field31039 = true;
      float var20 = var1.method5308(var9);
      this.field17575[0].field31036 = MathHelper.sin(var20) * (float) Math.PI * 0.05F;
      this.field17575[1].field31036 = MathHelper.sin(var20) * (float) Math.PI * 0.1F;
      this.field17575[1].field31032 = -1.5F;
      this.field17575[1].field31033 = 0.5F;
      this.field17575[1].field31034 = 14.0F;
      this.field17575[2].field31036 = MathHelper.sin(var20) * (float) Math.PI * 0.15F;
      this.field17575[2].field31032 = 0.5F;
      this.field17575[2].field31033 = 0.5F;
      this.field17575[2].field31034 = 6.0F;
   }

   private void method11024(float var1, float var2) {
      for (int var5 = 0; var5 < 12; var5++) {
         this.field17574[var5].field31035 = (float) Math.PI * field17566[var5];
         this.field17574[var5].field31036 = (float) Math.PI * field17567[var5];
         this.field17574[var5].field31037 = (float) Math.PI * field17568[var5];
         this.field17574[var5].field31032 = field17569[var5] * (1.0F + MathHelper.cos(var1 * 1.5F + (float)var5) * 0.01F - var2);
         this.field17574[var5].field31033 = 16.0F + field17570[var5] * (1.0F + MathHelper.cos(var1 * 1.5F + (float)var5) * 0.01F - var2);
         this.field17574[var5].field31034 = field17571[var5] * (1.0F + MathHelper.cos(var1 * 1.5F + (float)var5) * 0.01F - var2);
      }
   }
}
