package remapped;

public class class_3841 {
   private static String[] field_18751;
   public BlockPos field_18753;
   public class_2522 field_18752;

   public class_3841(BlockPos var1, class_2522 var2) {
      this.field_18753 = var1;
      this.field_18752 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof class_3841 ? ((class_3841)var1).field_18753.equals(this.field_18753) : false;
   }
}
