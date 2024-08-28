package mapped;

import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;

public class Class4828 implements Class4826 {
   private final Class7608<Class3257> field22600;

   public Class4828(Class7608<Class3257> var1) {
      this.field22600 = var1;
   }

   @Override
   public Collection<Class8848> method14917() {
      ArrayList var3 = Lists.newArrayList();

      for (Class3257 var5 : this.field22600.method24918()) {
         var3.add(new Class8848(var5));
      }

      return var3;
   }

   @Override
   public JsonObject method14918() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("tag", Class9443.method36296().method32658().method27136(this.field22600).toString());
      return var3;
   }
}
