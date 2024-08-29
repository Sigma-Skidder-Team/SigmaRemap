package mapped;

public class Class992 extends AbstractMinecartEntity {
   private static String[] field5478;
   private final Class7574 field5479 = new Class7575(this);

   public Class992(EntityType<? extends Class992> var1, World var2) {
      super(var1, var2);
   }

   public Class992(World var1, double var2, double var4, double var6) {
      super(EntityType.field41055, var1, var2, var4, var6);
   }

   @Override
   public MinecartType getMinecartType() {
      return MinecartType.field14291;
   }

   @Override
   public BlockState method3604() {
      return Blocks.field36532.method11579();
   }

   @Override
   public void method2723(CompoundNBT var1) {
      super.method2723(var1);
      this.field5479.method24794(var1);
   }

   @Override
   public void method2724(CompoundNBT var1) {
      super.method2724(var1);
      this.field5479.method24795(var1);
   }

   @Override
   public void method2866(byte var1) {
      this.field5479.method24797(var1);
   }

   @Override
   public void tick() {
      super.tick();
      this.field5479.method24792();
   }

   @Override
   public boolean method3404() {
      return true;
   }
}
