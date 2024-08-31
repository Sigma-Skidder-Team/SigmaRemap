package mapped;

import net.minecraft.network.PacketBuffer;

public class Class7175 extends Class7176 {
   private static String[] field30843;
   private float field30844 = Float.MAX_VALUE;
   private Class7176 field30845;
   private boolean field30846;

   public Class7175(Class7176 var1) {
      super(var1.field30847, var1.field30848, var1.field30849);
   }

   public Class7175(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public void method22521(float var1, Class7176 var2) {
      if (var1 < this.field30844) {
         this.field30844 = var1;
         this.field30845 = var2;
      }
   }

   public Class7176 method22522() {
      return this.field30845;
   }

   public void method22523() {
      this.field30846 = true;
   }

   public static Class7175 method22524(PacketBuffer var0) {
      Class7175 var3 = new Class7175(var0.readInt(), var0.readInt(), var0.readInt());
      var3.field30857 = var0.readFloat();
      var3.field30858 = var0.readFloat();
      var3.field30856 = var0.readBoolean();
      var3.field30859 = Class2163.values()[var0.readInt()];
      var3.field30854 = var0.readFloat();
      return var3;
   }
}
