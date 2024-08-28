package mapped;

public class Class5909 extends Class5911 {
   private static String[] field25716;
   public BlockPos field25717;
   public boolean field25718 = true;

   public Class5909(PlayerEntity var1, Hand var2, ItemStack var3, Class8711 var4) {
      this(var1.field5024, var1, var2, var3, var4);
   }

   public Class5909(Class5911 var1) {
      this(var1.method18360(), var1.method18358(), var1.method18359(), var1.method18357(), var1.method18353());
   }

   public Class5909(Class1655 var1, PlayerEntity var2, Hand var3, ItemStack var4, Class8711 var5) {
      super(var1, var2, var3, var4, var5);
      this.field25717 = var5.method31423().method8349(var5.method31424());
      this.field25718 = var1.method6738(var5.method31423()).method23441(this);
   }

   public static Class5909 method18344(Class5909 var0, BlockPos var1, Direction var2) {
      return new Class5909(
         var0.method18360(),
         var0.method18358(),
         var0.method18359(),
         var0.method18357(),
         new Class8711(
            new Vector3d(
               (double)var1.method8304() + 0.5 + (double)var2.method539() * 0.5,
               (double)var1.getY() + 0.5 + (double)var2.method540() * 0.5,
               (double)var1.method8306() + 0.5 + (double)var2.method541() * 0.5
            ),
            var2,
            var1,
            false
         )
      );
   }

   @Override
   public BlockPos method18345() {
      return !this.field25718 ? this.field25717 : super.method18345();
   }

   public boolean method18346() {
      return this.field25718 || this.method18360().method6738(this.method18345()).method23441(this);
   }

   public boolean method18347() {
      return this.field25718;
   }

   public Direction method18348() {
      return Direction.method529(this.method18358())[0];
   }

   public Direction[] method18349() {
      Direction[] var3 = Direction.method529(this.method18358());
      if (this.field25718) {
         return var3;
      } else {
         Direction var4 = this.method18354();
         int var5 = 0;

         while (var5 < var3.length && var3[var5] != var4.method536()) {
            var5++;
         }

         if (var5 > 0) {
            System.arraycopy(var3, 0, var3, 1, var5);
            var3[0] = var4.method536();
         }

         return var3;
      }
   }
}
