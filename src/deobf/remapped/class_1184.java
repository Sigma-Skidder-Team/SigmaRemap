package remapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.Style$class_46;

public class class_1184 implements class_6310<class_8171> {
   private static String[] field_6648;
   private static final Gson field_6649 = new GsonBuilder()
      .registerTypeAdapter(class_7543.class, new class_3104())
      .registerTypeAdapter(class_9608.class, new class_4102())
      .registerTypeAdapter(class_5880.class, new class_243())
      .registerTypeHierarchyAdapter(ITextComponent.class, new ITextComponent$class_40())
      .registerTypeHierarchyAdapter(Style.class, new Style$class_46())
      .registerTypeAdapterFactory(new class_9303())
      .create();
   private class_5880 field_6650;

   public class_1184() {
   }

   public class_1184(class_5880 var1) {
      this.field_6650 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_6650 = class_6539.<class_5880>method_29803(field_6649, var1.method_37784(32767), class_5880.class);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37760(field_6649.toJson(this.field_6650));
   }

   public void method_5234(class_8171 var1) {
      var1.method_37472(this);
   }

   public class_5880 method_5233() {
      return this.field_6650;
   }
}
