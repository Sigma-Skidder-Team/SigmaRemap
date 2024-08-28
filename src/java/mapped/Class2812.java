package mapped;

import com.google.common.collect.ImmutableList;

public class Class2812<T extends Entity> extends Class2803<T> {
   private static String[] field17500;
   private final Class7219 field17501;
   private final Class7219 field17502;
   private final Class7219 field17503;
   private final Class7219 field17504;
   private final Class7219 field17505;
   private final Class7219 field17506;
   private final Class7219 field17507;
   private final Class7219 field17508;
   private final Class7219 field17509;
   private final Class7219 field17510;
   private final Class7219 field17511;
   private final Class7219 field17512;
   private final Class7219 field17513;

   public Class2812() {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var3 = 22;
      this.field17501 = new Class7219(this, 0, 0);
      this.field17501.method22673(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.field17501.method22679(0.0F, 22.0F, 0.0F);
      this.field17502 = new Class7219(this, 24, 0);
      this.field17502.method22673(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.field17502.method22679(-4.0F, 15.0F, -2.0F);
      this.field17503 = new Class7219(this, 24, 3);
      this.field17503.method22673(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F);
      this.field17503.method22679(4.0F, 15.0F, -2.0F);
      this.field17504 = new Class7219(this, 15, 17);
      this.field17504.method22673(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17504.method22679(0.0F, 14.0F, -4.0F);
      this.field17504.field31035 = (float) (Math.PI / 4);
      this.field17505 = new Class7219(this, 14, 16);
      this.field17505.method22673(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F);
      this.field17505.method22679(0.0F, 14.0F, 0.0F);
      this.field17506 = new Class7219(this, 23, 18);
      this.field17506.method22673(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17506.method22679(0.0F, 14.0F, 4.0F);
      this.field17506.field31035 = (float) (-Math.PI / 4);
      this.field17507 = new Class7219(this, 5, 17);
      this.field17507.method22673(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17507.method22679(-4.0F, 22.0F, -4.0F);
      this.field17507.field31036 = (float) (-Math.PI / 4);
      this.field17508 = new Class7219(this, 1, 17);
      this.field17508.method22673(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17508.method22679(4.0F, 22.0F, -4.0F);
      this.field17508.field31036 = (float) (Math.PI / 4);
      this.field17509 = new Class7219(this, 15, 20);
      this.field17509.method22673(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17509.method22679(0.0F, 22.0F, -4.0F);
      this.field17509.field31035 = (float) (-Math.PI / 4);
      this.field17511 = new Class7219(this, 15, 20);
      this.field17511.method22673(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17511.method22679(0.0F, 22.0F, 0.0F);
      this.field17510 = new Class7219(this, 15, 20);
      this.field17510.method22673(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F);
      this.field17510.method22679(0.0F, 22.0F, 4.0F);
      this.field17510.field31035 = (float) (Math.PI / 4);
      this.field17512 = new Class7219(this, 9, 17);
      this.field17512.method22673(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17512.method22679(-4.0F, 22.0F, 4.0F);
      this.field17512.field31036 = (float) (Math.PI / 4);
      this.field17513 = new Class7219(this, 9, 17);
      this.field17513.method22673(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F);
      this.field17513.method22679(4.0F, 22.0F, 4.0F);
      this.field17513.field31036 = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(
         this.field17501,
         this.field17502,
         this.field17503,
         this.field17504,
         this.field17505,
         this.field17506,
         this.field17507,
         this.field17508,
         this.field17509,
         this.field17511,
         this.field17510,
         this.field17512,
         new Class7219[]{this.field17513}
      );
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17502.field31037 = -0.2F + 0.4F * MathHelper.method37763(var4 * 0.2F);
      this.field17503.field31037 = 0.2F - 0.4F * MathHelper.method37763(var4 * 0.2F);
   }
}
