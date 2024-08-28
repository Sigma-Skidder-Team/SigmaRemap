package mapped;

public class Class8999 {
   private static String[] field41153;
   private final Class7864 field41154;
   private final float field41155;
   private final int field41156;

   public Class8999(BlockPos var1, float var2, int var3) {
      this(new Class7863(var1), var2, var3);
   }

   public Class8999(Vector3d var1, float var2, int var3) {
      this(new Class7863(new BlockPos(var1)), var2, var3);
   }

   public Class8999(Class7864 var1, float var2, int var3) {
      this.field41154 = var1;
      this.field41155 = var2;
      this.field41156 = var3;
   }

   public Class7864 method33251() {
      return this.field41154;
   }

   public float method33252() {
      return this.field41155;
   }

   public int method33253() {
      return this.field41156;
   }
}
