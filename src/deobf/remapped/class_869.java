package remapped;

public class class_869 {
   private final BlockPos field_4509;
   private final int field_4508;
   private final int field_4507;

   public class_869(BlockPos var1, int var2, int var3) {
      this.field_4509 = var1;
      this.field_4508 = var2;
      this.field_4507 = var3;
   }

   public static class_869 method_3760(CompoundNBT var0) {
      BlockPos var3 = class_4338.method_20189(var0.getCompound("Pos"));
      int var4 = var0.method_25947("Rotation");
      int var5 = var0.method_25947("EntityId");
      return new class_869(var3, var4, var5);
   }

   public CompoundNBT method_3761() {
      CompoundNBT var3 = new CompoundNBT();
      var3.put("Pos", class_4338.method_20190(this.field_4509));
      var3.putInt("Rotation", this.field_4508);
      var3.putInt("EntityId", this.field_4507);
      return var3;
   }

   public BlockPos method_3765() {
      return this.field_4509;
   }

   public int method_3763() {
      return this.field_4508;
   }

   public int method_3764() {
      return this.field_4507;
   }

   public String method_3759() {
      return method_3762(this.field_4509);
   }

   public static String method_3762(BlockPos var0) {
      return "frame-" + var0.method_12173() + "," + var0.method_12165() + "," + var0.method_12185();
   }
}
