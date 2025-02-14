package mapped;

public final class Class4926 {
   public final long field22833;
   public final Class1734 field22834 = new Class1734();
   public boolean field22835;
   public boolean field22836;
   private final Sink field22837 = new Class1724(this);
   private final Class1737 field22838 = new Class1753(this);

   public Class4926(long var1) {
      if (var1 >= 1L) {
         this.field22833 = var1;
      } else {
         throw new IllegalArgumentException("maxBufferSize < 1: " + var1);
      }
   }

   public Class1737 method15240() {
      return this.field22838;
   }

   public Sink method15241() {
      return this.field22837;
   }
}
