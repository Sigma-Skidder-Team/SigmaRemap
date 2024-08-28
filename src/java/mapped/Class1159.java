package mapped;

public class Class1159 extends Class1156 {
   private final Minecraft field6310 = Minecraft.getInstance();

   @Override
   public void method5544(Class9332 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      int var13 = var3 + var6 / 2 - 4;
      this.field6310
         .field1294
         .method38805(
            var1,
            Class1279.method6084(),
            (float)(this.field6310.field1355.field4564 / 2 - this.field6310.field1294.method38821(Class1279.method6084()) / 2),
            (float)var13,
            16777215
         );
      String var14;
      switch ((int)(Util.method38487() / 300L % 4L)) {
         case 0:
         default:
            var14 = "O o o";
            break;
         case 1:
         case 3:
            var14 = "o O o";
            break;
         case 2:
            var14 = "o o O";
      }

      this.field6310
         .field1294
         .method38801(
            var1, var14, (float)(this.field6310.field1355.field4564 / 2 - this.field6310.field1294.method38820(var14) / 2), (float)(var13 + 9), 8421504
         );
   }
}
