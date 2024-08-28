package mapped;

import com.google.common.collect.Lists;
import com.google.gson.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Class2574 implements JsonDeserializer<Class7498> {
   private static String[] field16795;
   private final Class9786 field16796;

   public Class2574(Class9786 var1) {
      this.field16796 = var1;
   }

   public Class7498 deserialize(JsonElement var1, Type var2, JsonDeserializationContext var3) throws JsonParseException {
      return new Class7498(this.field16796.method38572(), this.method10771(var3, var1.getAsJsonArray()));
   }

   private List<Class9350> method10771(JsonDeserializationContext var1, JsonArray var2) {
      ArrayList var5 = Lists.newArrayList();

      for (JsonElement var7 : var2) {
         var5.add(var1.deserialize(var7, Class9350.class));
      }

      return var5;
   }
}
