package mapped;

public class Class232<T extends Class880, M extends Class2894<T>> extends Class231<T, M> {
   private static String[] field876;
   private final Class8853 field877;
   private Class887 field878;

   public Class232(Class5712<T, M> var1) {
      super(var1);
      this.field877 = var1.method17897();
   }

   @Override
   public int method835(T var1) {
      return var1.method3076();
   }

   @Override
   public void method836(MatrixStack var1, Class7733 var2, int var3, Entity var4, float var5, float var6, float var7, float var8) {
      float var11 = MathHelper.method37765(var5 * var5 + var7 * var7);
      this.field878 = new Class887(var4.field5024, var4.getPosX(), var4.getPosY(), var4.getPosZ());
      this.field878.field5031 = (float)(Math.atan2((double)var5, (double)var7) * 180.0F / (float)Math.PI);
      this.field878.field5032 = (float)(Math.atan2((double)var6, (double)var11) * 180.0F / (float)Math.PI);
      this.field878.field5033 = this.field878.field5031;
      this.field878.field5034 = this.field878.field5032;
      this.field877.method32219(this.field878, 0.0, 0.0, 0.0, 0.0F, var8, var1, var2, var3);
   }
}
