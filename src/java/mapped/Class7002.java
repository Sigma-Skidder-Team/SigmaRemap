package mapped;

import net.minecraft.util.Direction;

public class Class7002 {
   private static String[] field30280;
   public final Class8066 field30281;
   private Direction field30282;
   private int field30283;
   private int field30284;

   private Class7002(WorldRenderer var1, Class8066 var2, Direction var3, int var4) {
      this.field30281 = var2;
      this.field30282 = var3;
      this.field30284 = var4;
   }

   public Class7002(Class8066 var1, Direction var2, int var3) {
      this.field30281 = var1;
      this.field30282 = var2;
      this.field30283 = var3;
   }

   public void method21712(byte var1, Direction var2) {
      this.field30283 = this.field30283 | var1 | 1 << this.field30282.ordinal();
   }

   public boolean method21713(Direction var1) {
      return (this.field30283 & 1 << var1.ordinal()) > 0;
   }

   private void method21714(Direction var1, int var2, int var3) {
      this.field30282 = var1;
      this.field30283 = var2;
      this.field30284 = var3;
   }

   // $VF: synthetic method
   public static void method21715(Class7002 var0, Direction var1, int var2, int var3) {
      var0.method21714(var1, var2, var3);
   }

   // $VF: synthetic method
   public static Direction method21716(Class7002 var0) {
      return var0.field30282;
   }

   // $VF: synthetic method
   public static int method21717(Class7002 var0) {
      return var0.field30283;
   }

   // $VF: synthetic method
   public static int method21718(Class7002 var0) {
      return var0.field30284;
   }
}
