package mapped;

import com.google.gson.JsonObject;
import net.minecraft.item.ItemStack;

public class Class4492 extends Class4457 {
   private final Class8634 field21697;
   private final Class9587 field21698;

   public Class4492(Class9587 var1, Class8634 var2, Class9587 var3) {
      super(Class4884.method15092(), var1);
      this.field21697 = var2;
      this.field21698 = var3;
   }

   public static Class4492 method14167(Class9587 var0, Class9735 var1, Class9587 var2) {
      return new Class4492(var0, var1.method38151(), var2);
   }

   public boolean method14168(ServerPlayerEntity var1, ItemStack var2, LootContext var3) {
      return this.field21697.method31016(var2) ? this.field21698.method37227(var3) : false;
   }

   @Override
   public JsonObject method14092(Class8107 var1) {
      JsonObject var4 = super.method14092(var1);
      var4.add("item", this.field21697.method31018());
      var4.add("entity", this.field21698.method37228(var1));
      return var4;
   }
}
