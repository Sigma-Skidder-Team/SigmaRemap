package mapped;

public class Class5457 extends Class5455<Class4712> {
   private static String[] field24216;

   public Class5457(Structure<Class4712> var1, int var2, int var3, Class9764 var4, int var5, long var6) {
      super(var1, var2, var3, var4, var5, var6);
   }

   public void method17109(DynamicRegistries var1, ChunkGenerator var2, Class8761 var3, int var4, int var5, Biome var6, Class4712 var7) {
      Class7481 var10 = new Class7481(var4, var5);
      int var11 = var10.method24356() + this.field24201.nextInt(16);
      int var12 = var10.method24357() + this.field24201.nextInt(16);
      int var13 = var2.method17807();
      int var14 = var13 + this.field24201.nextInt(var2.method17806() - 2 - var13);
      Class1665 var15 = var2.method17798(var11, var12);

      for (Mutable var16 = new Mutable(var11, var14, var12); var14 > var13; var14--) {
         BlockState var17 = var15.getBlockState(var16);
         var16.method8379(Direction.DOWN);
         BlockState var18 = var15.getBlockState(var16);
         if (var17.isAir() && (var18.method23448(Blocks.SOUL_SAND) || var18.method23454(var15, var16, Direction.field673))) {
            break;
         }
      }

      if (var14 > var13) {
         Class8983.method33186(var3, this.field24196, this.field24201, new BlockPos(var11, var14, var12));
         this.method17113();
      }
   }
}
