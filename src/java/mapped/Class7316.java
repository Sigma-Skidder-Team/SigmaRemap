package mapped;

public class Class7316 extends PlayerController {
   private static String[] field31370;
   private boolean field31371 = false;
   private BlockPos field31372 = null;
   private Entity field31373 = null;

   public Class7316(Minecraft var1, ClientPlayNetHandler var2) {
      super(var1, var2);
   }

   @Override
   public boolean method23132(BlockPos var1, Direction var2) {
      this.field31371 = true;
      this.field31372 = var1;
      boolean var5 = super.method23132(var1, var2);
      this.field31371 = false;
      return var5;
   }

   @Override
   public boolean method23134(BlockPos var1, Direction var2) {
      this.field31371 = true;
      this.field31372 = var1;
      boolean var5 = super.method23134(var1, var2);
      this.field31371 = false;
      return var5;
   }

   @Override
   public Class2274 method23140(PlayerEntity var1, Class1655 var2, Class79 var3) {
      this.field31371 = true;
      Class2274 var6 = super.method23140(var1, var2, var3);
      this.field31371 = false;
      return var6;
   }

   @Override
   public Class2274 method23139(ClientPlayerEntity var1, Class1656 var2, Class79 var3, Class8711 var4) {
      this.field31371 = true;
      this.field31372 = var4.method31423();
      Class2274 var7 = super.method23139(var1, var2, var3, var4);
      this.field31371 = false;
      return var7;
   }

   @Override
   public Class2274 method23142(PlayerEntity var1, Entity var2, Class79 var3) {
      this.field31373 = var2;
      return super.method23142(var1, var2, var3);
   }

   @Override
   public Class2274 method23143(PlayerEntity var1, Entity var2, Class8709 var3, Class79 var4) {
      this.field31373 = var2;
      return super.method23143(var1, var2, var3, var4);
   }

   public boolean method23162() {
      return this.field31371;
   }

   public BlockPos method23163() {
      return this.field31372;
   }

   public Entity method23164() {
      return this.field31373;
   }
}
