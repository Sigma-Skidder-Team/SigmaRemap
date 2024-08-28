package mapped;

import com.google.common.collect.ImmutableList;

public class Class2877<T extends Entity> extends Class2803<T> {
   private static String[] field17833;
   private final Class7219 field17834;
   private final Class7219 field17835;
   private final Class7219 field17836;
   private final Class7219 field17837;
   private final Class7219 field17838;
   private final Class7219 field17839;
   private final Class7219 field17840;
   private final Class7219 field17841;
   private final Class7219 field17842;
   private final Class7219 field17843;
   private final Class7219 field17844;

   public Class2877() {
      this.field17604 = 32;
      this.field17605 = 32;
      byte var3 = 22;
      this.field17834 = new Class7219(this, 12, 22);
      this.field17834.method22673(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F);
      this.field17834.method22679(0.0F, 22.0F, 0.0F);
      this.field17835 = new Class7219(this, 24, 0);
      this.field17835.method22673(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17835.method22679(-2.5F, 17.0F, -1.5F);
      this.field17836 = new Class7219(this, 24, 3);
      this.field17836.method22673(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.field17836.method22679(2.5F, 17.0F, -1.5F);
      this.field17837 = new Class7219(this, 15, 16);
      this.field17837.method22673(-2.5F, -1.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.field17837.method22679(0.0F, 17.0F, -2.5F);
      this.field17837.field31035 = (float) (Math.PI / 4);
      this.field17838 = new Class7219(this, 10, 16);
      this.field17838.method22673(-2.5F, -1.0F, -1.0F, 5.0F, 1.0F, 1.0F);
      this.field17838.method22679(0.0F, 17.0F, 2.5F);
      this.field17838.field31035 = (float) (-Math.PI / 4);
      this.field17839 = new Class7219(this, 8, 16);
      this.field17839.method22673(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17839.method22679(-2.5F, 22.0F, -2.5F);
      this.field17839.field31036 = (float) (-Math.PI / 4);
      this.field17840 = new Class7219(this, 8, 16);
      this.field17840.method22673(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17840.method22679(-2.5F, 22.0F, 2.5F);
      this.field17840.field31036 = (float) (Math.PI / 4);
      this.field17841 = new Class7219(this, 4, 16);
      this.field17841.method22673(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17841.method22679(2.5F, 22.0F, 2.5F);
      this.field17841.field31036 = (float) (-Math.PI / 4);
      this.field17842 = new Class7219(this, 0, 16);
      this.field17842.method22673(0.0F, -5.0F, 0.0F, 1.0F, 5.0F, 1.0F);
      this.field17842.method22679(2.5F, 22.0F, -2.5F);
      this.field17842.field31036 = (float) (Math.PI / 4);
      this.field17843 = new Class7219(this, 8, 22);
      this.field17843.method22673(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      this.field17843.method22679(0.5F, 22.0F, 2.5F);
      this.field17843.field31035 = (float) (Math.PI / 4);
      this.field17844 = new Class7219(this, 17, 21);
      this.field17844.method22673(-2.5F, 0.0F, 0.0F, 5.0F, 1.0F, 1.0F);
      this.field17844.method22679(0.0F, 22.0F, -2.5F);
      this.field17844.field31035 = (float) (-Math.PI / 4);
   }

   @Override
   public Iterable<Class7219> method11015() {
      return ImmutableList.of(
         this.field17834,
         this.field17835,
         this.field17836,
         this.field17837,
         this.field17838,
         this.field17839,
         this.field17840,
         this.field17841,
         this.field17842,
         this.field17843,
         this.field17844
      );
   }

   @Override
   public void method10998(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.field17835.field31037 = -0.2F + 0.4F * Class9679.method37763(var4 * 0.2F);
      this.field17836.field31037 = 0.2F - 0.4F * Class9679.method37763(var4 * 0.2F);
   }
}
