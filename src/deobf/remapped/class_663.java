package remapped;

public class class_663 {
   private static String[] field_3675;
   public BlockPos field_3674;
   public float field_3677 = -1.0F;
   public class_617 field_3676 = class_617.field_3517;

   public class_663(BlockPos var1) {
      this.field_3674 = var1;
      this.field_3676 = class_617.method_2882(NoteblockPlayerModule.method_36549().field_9601.method_28262(var1.method_6100()));
   }

   public int method_3033() {
      switch (this.field_3676) {
         case field_3517:
            return 0;
         case field_3508:
            return 1;
         case field_3513:
            return 2;
         case field_3500:
            return 3;
         case field_3511:
            return 4;
         case field_3519:
            return 5;
         case field_3509:
            return 6;
         case field_3501:
            return 7;
         case field_3503:
            return 8;
         case field_3518:
            return 9;
         case field_3502:
            return 10;
         case field_3505:
            return 11;
         case field_3504:
            return 12;
         case field_3516:
            return 13;
         case field_3515:
            return 14;
         case field_3512:
            return 15;
         default:
            return 0;
      }
   }
}
