package mapped;

import com.google.gson.JsonObject;
import net.minecraft.util.ResourceLocation;

public class Class4476 extends Class4457 {
   private final Class9587 field21666;
   private final Class9539 field21667;

   public Class4476(ResourceLocation var1, Class9587 var2, Class9587 var3, Class9539 var4) {
      super(var1, var2);
      this.field21666 = var3;
      this.field21667 = var4;
   }

   public static Class4476 method14134(Class7552 var0) {
      return new Class4476(Class4905.method15160(CriteriaTriggers.field44466), Class9587.field44822, Class9587.method37226(var0.method24717()), Class9539.field44409);
   }

   public static Class4476 method14135() {
      return new Class4476(Class4905.method15160(CriteriaTriggers.field44466), Class9587.field44822, Class9587.field44822, Class9539.field44409);
   }

   public static Class4476 method14136(Class7552 var0, Class9714 var1) {
      return new Class4476(Class4905.method15160(CriteriaTriggers.field44466), Class9587.field44822, Class9587.method37226(var0.method24717()), var1.method38060());
   }

   public static Class4476 method14137() {
      return new Class4476(Class4905.method15160(CriteriaTriggers.field44467), Class9587.field44822, Class9587.field44822, Class9539.field44409);
   }

   public boolean method14138(ServerPlayerEntity var1, LootContext var2, Class8654 var3) {
      return this.field21667.method36911(var1, var3) ? this.field21666.method37227(var2) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("entity", this.field21666.method37228(var1));
      var4.add("killing_blow", this.field21667.method36915());
      return var4;
   }
}
