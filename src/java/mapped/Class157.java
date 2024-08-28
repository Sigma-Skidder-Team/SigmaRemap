package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class157 implements ILootCondition {
   private static final Logger field512 = LogManager.getLogger();
   private final ResourceLocation field513;

   public Class157(ResourceLocation var1) {
      this.field513 = var1;
   }

   @Override
   public Class7130 method354() {
      return Class8582.field38609;
   }

   @Override
   public void method367(Class8478 var1) {
      if (!var1.method29960(this.field513)) {
         ILootCondition.super.method367(var1);
         ILootCondition var4 = var1.method29964(this.field513);
         if (var4 != null) {
            var4.method367(var1.method29957(".{" + this.field513 + "}", this.field513));
         } else {
            var1.method29955("Unknown condition table called " + this.field513);
         }
      } else {
         var1.method29955("Condition " + this.field513 + " is recursively called");
      }
   }

   public boolean test(LootContext var1) {
      ILootCondition var4 = var1.method26087(this.field513);
      if (var1.method26084(var4)) {
         boolean var5;
         try {
            var5 = var4.test(var1);
         } finally {
            var1.method26085(var4);
         }

         return var5;
      } else {
         field512.warn("Detected infinite loop in loot tables");
         return false;
      }
   }

   // $VF: synthetic method
   public static ResourceLocation method475(Class157 var0) {
      return var0.field513;
   }
}
