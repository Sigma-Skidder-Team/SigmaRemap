package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public final class class_9695 {
   private static String[] field_49318;
   public final Gson field_49317 = new GsonBuilder()
      .registerTypeAdapter(class_6751.class, new class_6748())
      .registerTypeAdapter(class_8338.class, new class_8447())
      .registerTypeAdapter(class_9798.class, new class_9241())
      .registerTypeAdapter(class_9846.class, new class_2828(this))
      .registerTypeAdapter(class_8023.class, new class_9389())
      .create();
   private class_8021<class_6414, class_2522> field_49319;

   public class_8021<class_6414, class_2522> method_44801() {
      return this.field_49319;
   }

   public void method_44799(class_8021<class_6414, class_2522> var1) {
      this.field_49319 = var1;
   }
}
