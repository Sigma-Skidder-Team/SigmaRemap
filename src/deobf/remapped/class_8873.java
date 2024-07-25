package remapped;

import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8873 extends class_7648 {
   private static final Logger field_45360 = LogManager.getLogger();
   private static final Gson field_45358 = new GsonBuilder().create();
   private class_3904 field_45357 = new class_3904();
   private final class_264 field_45359;

   public class_8873(class_264 var1) {
      super(field_45358, "advancements");
      this.field_45359 = var1;
   }

   public void method_40817(Map<Identifier, JsonElement> var1, class_7832 var2, class_3492 var3) {
      HashMap var6 = Maps.newHashMap();
      var1.forEach((var2x, var3x) -> {
         try {
            JsonObject var6x = class_6539.method_29782(var3x, "advancement");
            class_3321 var7x = class_3321.method_15259(var6x, new class_8096(var2x, this.field_45359));
            var6.put(var2x, var7x);
         } catch (JsonParseException | IllegalArgumentException var8) {
            field_45360.error("Parsing error loading custom advancement {}: {}", var2x, var8.getMessage());
         }
      });
      class_3904 var7 = new class_3904();
      var7.method_18079(var6);

      for (class_3139 var9 : var7.method_18077()) {
         if (var9.method_14511() != null) {
            class_6230.method_28467(var9);
         }
      }

      this.field_45357 = var7;
   }

   @Nullable
   public class_3139 method_40818(Identifier var1) {
      return this.field_45357.method_18078(var1);
   }

   public Collection<class_3139> method_40816() {
      return this.field_45357.method_18076();
   }
}
