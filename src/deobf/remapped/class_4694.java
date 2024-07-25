package remapped;

public class class_4694 {
   public static final class_4694 field_22844 = new class_6260(0L);
   private final long field_22841;
   private long field_22842;

   public class_4694(long var1) {
      this.field_22841 = var1;
   }

   public void method_21668(long var1) {
      this.field_22842 += var1 / 8L;
      if (this.field_22842 > this.field_22841) {
         throw new RuntimeException(
            "Tried to read NBT tag that was too big; tried to allocate: " + this.field_22842 + "bytes where max allowed: " + this.field_22841
         );
      }
   }
}
