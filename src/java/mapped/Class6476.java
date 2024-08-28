package mapped;

public final class Class6476 implements Class6466<Class7087> {
   private static String[] field28423;

   public void method19646(PacketBuffer var1, Class7087 var2) {
      var1.writeFloat(var2.method22013());
      var1.writeFloat(var2.method22014());
      var1.writeFloat(var2.method22015());
   }

   public Class7087 method19645(PacketBuffer var1) {
      return new Class7087(var1.readFloat(), var1.readFloat(), var1.readFloat());
   }

   public Class7087 method19644(Class7087 var1) {
      return var1;
   }
}
