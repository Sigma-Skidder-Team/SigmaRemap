package mapped;

public final class ViaVersion5 {
   private static String[] field45785;
   private Class8006<?> field45786;
   private Class6749 field45787;
   private Class7778 field45788;
   private Class9213 field45789;

   public ViaVersion5 method38598(Class8006<?> var1) {
      this.field45786 = var1;
      return this;
   }

   public ViaVersion5 method38599(Class6749 var1) {
      this.field45787 = var1;
      return this;
   }

   public ViaVersion5 method38600(Class9213 var1) {
      this.field45789 = var1;
      return this;
   }

   public ViaVersion5 method38601(Class7778 var1) {
      this.field45788 = var1;
      return this;
   }

   public ViaVersion1 method38602() {
      return new ViaVersion1(this.field45786, this.field45787, this.field45788, this.field45789);
   }
}
