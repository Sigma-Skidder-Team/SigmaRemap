package remapped;

public enum class_6849 {
   field_35314(0.0F, 1.0F, KeyStrokesModule.method_34848().field_9577.field_45504),
   field_35316(2.0F, 1.0F, KeyStrokesModule.method_34860().field_9577.field_45411),
   field_35324(1.0F, 0.0F, KeyStrokesModule.method_34852().field_9577.field_45416),
   field_35321(1.0F, 1.0F, KeyStrokesModule.method_34851().field_9577.field_45434),
   field_35323(0.0F, 2.0F, 74, KeyStrokesModule.method_34854().field_9577.field_45530),
   field_35322(1.02F, 2.0F, 73, KeyStrokesModule.method_34859().field_9577.field_45559);

   public float field_35317;
   public float field_35327;
   public int field_35320 = 48;
   public int field_35326 = 48;
   public int field_35318 = 3;
   public class_5916 field_35319;

   private class_6849(float var3, float var4, class_5916 var5) {
      this.field_35317 = var3;
      this.field_35327 = var4;
      this.field_35319 = var5;
   }

   private class_6849(float var3, float var4, int var5, class_5916 var6) {
      this.field_35317 = var3;
      this.field_35327 = var4;
      this.field_35319 = var6;
      this.field_35320 = var5;
   }

   public class_7737 method_31422() {
      return new class_7737(
         this, (int)(this.field_35317 * (float)(this.field_35320 + this.field_35318)), (int)(this.field_35327 * (float)(this.field_35326 + this.field_35318))
      );
   }

   public class_7737 method_31423() {
      return new class_7737(this, this.field_35320, this.field_35326);
   }

   public class_5916 method_31425() {
      if (this != field_35314) {
         if (this != field_35316) {
            if (this != field_35324) {
               if (this != field_35321) {
                  if (this != field_35323) {
                     return this != field_35322 ? null : KeyStrokesModule.method_34857().field_9577.field_45559;
                  } else {
                     return KeyStrokesModule.method_34849().field_9577.field_45530;
                  }
               } else {
                  return KeyStrokesModule.method_34858().field_9577.field_45434;
               }
            } else {
               return KeyStrokesModule.method_34863().field_9577.field_45416;
            }
         } else {
            return KeyStrokesModule.method_34856().field_9577.field_45411;
         }
      } else {
         return KeyStrokesModule.method_34862().field_9577.field_45504;
      }
   }
}
