package mapped;

public class Class8711 extends Class8710 {
   private static String[] field39317;
   private final Direction field39318;
   private final BlockPos field39319;
   private final boolean field39320;
   private final boolean field39321;

   public static Class8711 method31420(Vector3d var0, Direction var1, BlockPos var2) {
      return new Class8711(true, var0, var1, var2, false);
   }

   public Class8711(Vector3d var1, Direction var2, BlockPos var3, boolean var4) {
      this(false, var1, var2, var3, var4);
   }

   private Class8711(boolean var1, Vector3d var2, Direction var3, BlockPos var4, boolean var5) {
      super(var2);
      this.field39320 = var1;
      this.field39318 = var3;
      this.field39319 = var4;
      this.field39321 = var5;
   }

   public Class8711 method31421(Direction var1) {
      return new Class8711(this.field39320, this.field39316, var1, this.field39319, this.field39321);
   }

   public Class8711 method31422(BlockPos var1) {
      return new Class8711(this.field39320, this.field39316, this.field39318, var1, this.field39321);
   }

   public BlockPos method31423() {
      return this.field39319;
   }

   public Direction method31424() {
      return this.field39318;
   }

   @Override
   public Class2100 method31417() {
      return !this.field39320 ? Class2100.field13690 : Class2100.field13689;
   }

   public boolean method31425() {
      return this.field39321;
   }
}
