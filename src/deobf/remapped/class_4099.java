package remapped;

public class class_4099 {
   public final BlockPos field_19965;
   public final class_2522 field_19967;
   public final CompoundNBT field_19968;

   public class_4099(BlockPos var1, class_2522 var2, CompoundNBT var3) {
      this.field_19965 = var1;
      this.field_19967 = var2;
      this.field_19968 = var3;
   }

   @Override
   public String toString() {
      return String.format("<StructureBlockInfo | %s | %s | %s>", this.field_19965, this.field_19967, this.field_19968);
   }
}
