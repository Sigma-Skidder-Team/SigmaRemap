package mapped;

import java.util.Arrays;

public class Class2818<T extends Entity> extends Class2803<T> {
   private static String[] field17554;
   private final Class7219[] field17555 = new Class7219[6];

   public Class2818() {
      this.field17555[0] = new Class7219(this, 0, 10);
      this.field17555[1] = new Class7219(this, 0, 0);
      this.field17555[2] = new Class7219(this, 0, 0);
      this.field17555[3] = new Class7219(this, 0, 0);
      this.field17555[4] = new Class7219(this, 0, 0);
      this.field17555[5] = new Class7219(this, 44, 10);
      byte var3 = 20;
      byte var4 = 8;
      byte var5 = 16;
      byte var6 = 4;
      this.field17555[0].method22675(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F);
      this.field17555[0].method22679(0.0F, 4.0F, 0.0F);
      this.field17555[5].method22675(-9.0F, -7.0F, -1.0F, 18.0F, 14.0F, 1.0F, 0.0F);
      this.field17555[5].method22679(0.0F, 4.0F, 0.0F);
      this.field17555[1].method22675(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[1].method22679(-9.0F, 4.0F, 0.0F);
      this.field17555[2].method22675(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[2].method22679(9.0F, 4.0F, 0.0F);
      this.field17555[3].method22675(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[3].method22679(0.0F, 4.0F, -7.0F);
      this.field17555[4].method22675(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.field17555[4].method22679(0.0F, 4.0F, 7.0F);
      this.field17555[0].field31035 = (float) (Math.PI / 2);
      this.field17555[1].field31036 = (float) (Math.PI * 3.0 / 2.0);
      this.field17555[2].field31036 = (float) (Math.PI / 2);
      this.field17555[3].field31036 = (float) Math.PI;
      this.field17555[5].field31035 = (float) (-Math.PI / 2);
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17555[5].field31033 = 4.0F - var4;
   }

   @Override
   public Iterable<Class7219> method11015() {
      return Arrays.<Class7219>asList(this.field17555);
   }
}
