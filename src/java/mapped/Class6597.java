package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.item.Items;

public class Class6597 {
   public static final Class6597 field29027 = new Class6597(
      Class8634.field38839, Class8634.field38839, Class8634.field38839, Class8634.field38839, Class8634.field38839, Class8634.field38839
   );
   public static final Class6597 field29028 = new Class6597(
      Class9735.method38146().method38147(Items.field38092).method38149(Class7699.method25421().method32142()).method38151(),
      Class8634.field38839,
      Class8634.field38839,
      Class8634.field38839,
      Class8634.field38839,
      Class8634.field38839
   );
   private final Class8634 field29029;
   private final Class8634 field29030;
   private final Class8634 field29031;
   private final Class8634 field29032;
   private final Class8634 field29033;
   private final Class8634 field29034;

   public Class6597(Class8634 var1, Class8634 var2, Class8634 var3, Class8634 var4, Class8634 var5, Class8634 var6) {
      this.field29029 = var1;
      this.field29030 = var2;
      this.field29031 = var3;
      this.field29032 = var4;
      this.field29033 = var5;
      this.field29034 = var6;
   }

   public boolean method19997(Entity var1) {
      if (this != field29027) {
         if (var1 instanceof LivingEntity) {
            LivingEntity var4 = (LivingEntity)var1;
            if (this.field29029.method31016(var4.method2943(Class2106.field13736))) {
               if (this.field29030.method31016(var4.method2943(Class2106.field13735))) {
                  if (this.field29031.method31016(var4.method2943(Class2106.field13734))) {
                     if (this.field29032.method31016(var4.method2943(Class2106.field13733))) {
                        return this.field29033.method31016(var4.method2943(Class2106.field13731))
                           ? this.field29034.method31016(var4.method2943(Class2106.field13732))
                           : false;
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static Class6597 method19998(JsonElement var0) {
      if (var0 != null && !var0.isJsonNull()) {
         JsonObject var3 = JSONUtils.method32781(var0, "equipment");
         Class8634 var4 = Class8634.method31017(var3.get("head"));
         Class8634 var5 = Class8634.method31017(var3.get("chest"));
         Class8634 var6 = Class8634.method31017(var3.get("legs"));
         Class8634 var7 = Class8634.method31017(var3.get("feet"));
         Class8634 var8 = Class8634.method31017(var3.get("mainhand"));
         Class8634 var9 = Class8634.method31017(var3.get("offhand"));
         return new Class6597(var4, var5, var6, var7, var8, var9);
      } else {
         return field29027;
      }
   }

   public JsonElement method19999() {
      if (this != field29027) {
         JsonObject var3 = new JsonObject();
         var3.add("head", this.field29029.method31018());
         var3.add("chest", this.field29030.method31018());
         var3.add("legs", this.field29031.method31018());
         var3.add("feet", this.field29032.method31018());
         var3.add("mainhand", this.field29033.method31018());
         var3.add("offhand", this.field29034.method31018());
         return var3;
      } else {
         return JsonNull.INSTANCE;
      }
   }
}
