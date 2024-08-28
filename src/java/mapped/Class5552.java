package mapped;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.Style$Serializer;

public class Class5552 implements Packet<Class5112> {
   private static String[] field24652;
   private static final Gson field24653 = new GsonBuilder()
      .registerTypeAdapter(Class9226.class, new Class2559())
      .registerTypeAdapter(Class9762.class, new Class2556())
      .registerTypeAdapter(Class8783.class, new Class2565())
      .registerTypeHierarchyAdapter(ITextComponent.class, new ITextComponent$Serializer())
      .registerTypeHierarchyAdapter(Style.class, new Style$Serializer())
      .registerTypeAdapterFactory(new Class9681())
      .create();
   private Class8783 field24654;

   public Class5552() {
   }

   public Class5552(Class8783 var1) {
      this.field24654 = var1;
   }

   @Override
   public void method17175(PacketBuffer var1) throws IOException {
      this.field24654 = JSONUtils.<Class8783>method32797(field24653, var1.method35728(32767), Class8783.class);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35729(field24653.toJson(this.field24654));
   }

   public void method17180(Class5112 var1) {
      var1.method15688(this);
   }

   public Class8783 method17468() {
      return this.field24654;
   }
}
