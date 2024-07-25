package remapped;

import com.mojang.serialization.Codec;

public class class_3089 extends class_5390<class_7805> {
   private static String[] field_15310;
   private final int field_15312;
   private final boolean field_15311;
   private final boolean field_15309;

   public class_3089(Codec<class_7805> var1, int var2, boolean var3, boolean var4) {
      super(var1);
      this.field_15312 = var2;
      this.field_15311 = var3;
      this.field_15309 = var4;
   }

   @Override
   public class_1329<class_7805> method_24558() {
      return (var1, var2, var3, var4, var5, var6) -> new class_3596(this, var2, var3, var4, var5, var6);
   }
}
