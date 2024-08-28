package mapped;

public class Class8465 {
   public static final Class8465 field36284 = new Class8466(0L);
   private final long field36285;
   private long field36286;

   public Class8465(long var1) {
      this.field36285 = var1;
   }

   public void method29769(long var1) {
      this.field36286 += var1 / 8L;
      if (this.field36286 > this.field36285) {
         throw new RuntimeException(
            "Tried to read NBT tag that was too big; tried to allocate: " + this.field36286 + "bytes where max allowed: " + this.field36285
         );
      }
   }
}
