package mapped;

public class Class1559 extends Class1555 {
   private static String[] field8444;
   public final int field8445;
   public final Class2077 field8446;
   public final FramedConnection field8447;

   public Class1559(FramedConnection var1, String var2, Object[] var3, int var4, Class2077 var5) {
      super(var2, var3);
      this.field8447 = var1;
      this.field8445 = var4;
      this.field8446 = var5;
   }

   @Override
   public void method6472() {
      this.field8447.field9564.method31860(this.field8445, this.field8446);
      synchronized (this.field8447) {
         this.field8447.field9575.remove(this.field8445);
      }
   }
}
