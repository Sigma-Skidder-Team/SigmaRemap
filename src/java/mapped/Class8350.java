package mapped;

public final class Class8350 {
   public static final Class2003 field35880 = Class2003.method8433(":");
   public static final Class2003 field35881 = Class2003.method8433(":status");
   public static final Class2003 field35882 = Class2003.method8433(":method");
   public static final Class2003 field35883 = Class2003.method8433(":path");
   public static final Class2003 field35884 = Class2003.method8433(":scheme");
   public static final Class2003 field35885 = Class2003.method8433(":authority");
   public final Class2003 field35886;
   public final Class2003 field35887;
   public final int field35888;

   public Class8350(String var1, String var2) {
      this(Class2003.method8433(var1), Class2003.method8433(var2));
   }

   public Class8350(Class2003 var1, String var2) {
      this(var1, Class2003.method8433(var2));
   }

   public Class8350(Class2003 var1, Class2003 var2) {
      this.field35886 = var1;
      this.field35887 = var2;
      this.field35888 = 32 + var1.method8458() + var2.method8458();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class8350)) {
         return false;
      } else {
         Class8350 var4 = (Class8350)var1;
         return this.field35886.equals(var4.field35886) && this.field35887.equals(var4.field35887);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field35886.hashCode();
      return 31 * var3 + this.field35887.hashCode();
   }

   @Override
   public String toString() {
      return Class9474.method36559("%s: %s", this.field35886.method8435(), this.field35887.method8435());
   }
}
