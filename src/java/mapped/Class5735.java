package mapped;

public class Class5735<T extends Entity & Class889> extends Class5715<T> {
   private static String[] field25149;
   private final Class216 field25150;
   private final float field25151;
   private final boolean field25152;

   public Class5735(Class8853 var1, Class216 var2, float var3, boolean var4) {
      super(var1);
      this.field25150 = var2;
      this.field25151 = var3;
      this.field25152 = var4;
   }

   public Class5735(Class8853 var1, Class216 var2) {
      this(var1, var2, 1.0F, false);
   }

   @Override
   public int method17858(T var1, BlockPos var2) {
      return !this.field25152 ? super.method17858((T)var1, var2) : 15;
   }

   @Override
   public void method17853(T var1, float var2, float var3, MatrixStack var4, Class7733 var5, int var6) {
      if (var1.field5055 >= 2 || !(this.field25097.field40017.method37509().getDistanceSq(var1) < 12.25)) {
         var4.method35294();
         var4.method35292(this.field25151, this.field25151, this.field25151);
         var4.method35293(this.field25097.method32230());
         var4.method35293(Class7680.field32900.method25286(180.0F));
         this.field25150.method789(((Class889)var1).method3509(), Class2327.field15931, var6, Class213.field798, var4, var5);
         var4.method35295();
         super.method17853((T)var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public ResourceLocation method17843(Entity var1) {
      return Class289.field1102;
   }
}