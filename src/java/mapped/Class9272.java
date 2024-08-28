package mapped;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class Class9272 {
   private final ITextComponent field42646;
   private final ITextComponent field42647;
   private final ItemStack field42648;
   private final ResourceLocation field42649;
   private final Class1965 field42650;
   private final boolean field42651;
   private final boolean field42652;
   private final boolean field42653;
   private float field42654;
   private float field42655;

   public Class9272(ItemStack var1, ITextComponent var2, ITextComponent var3, ResourceLocation var4, Class1965 var5, boolean var6, boolean var7, boolean var8) {
      this.field42646 = var2;
      this.field42647 = var3;
      this.field42648 = var1;
      this.field42649 = var4;
      this.field42650 = var5;
      this.field42651 = var6;
      this.field42652 = var7;
      this.field42653 = var8;
   }

   public void method34933(float var1, float var2) {
      this.field42654 = var1;
      this.field42655 = var2;
   }

   public ITextComponent method34934() {
      return this.field42646;
   }

   public ITextComponent method34935() {
      return this.field42647;
   }

   public ItemStack method34936() {
      return this.field42648;
   }

   @Nullable
   public ResourceLocation method34937() {
      return this.field42649;
   }

   public Class1965 method34938() {
      return this.field42650;
   }

   public float method34939() {
      return this.field42654;
   }

   public float method34940() {
      return this.field42655;
   }

   public boolean method34941() {
      return this.field42651;
   }

   public boolean method34942() {
      return this.field42652;
   }

   public boolean method34943() {
      return this.field42653;
   }

   public static Class9272 method34944(JsonObject var0) {
      IFormattableTextComponent var3 = ITextComponent$Serializer.func_240641_a_(var0.get("title"));
      IFormattableTextComponent var4 = ITextComponent$Serializer.func_240641_a_(var0.get("description"));
      if (var3 != null && var4 != null) {
         ItemStack var5 = method34945(Class8963.method32782(var0, "icon"));
         ResourceLocation var6 = !var0.has("background") ? null : new ResourceLocation(Class8963.method32763(var0, "background"));
         Class1965 var7 = !var0.has("frame") ? Class1965.field12814 : Class1965.method8243(Class8963.method32763(var0, "frame"));
         boolean var8 = Class8963.method32769(var0, "show_toast", true);
         boolean var9 = Class8963.method32769(var0, "announce_to_chat", true);
         boolean var10 = Class8963.method32769(var0, "hidden", false);
         return new Class9272(var5, var3, var4, var6, var7, var8, var9, var10);
      } else {
         throw new JsonSyntaxException("Both title and description must be set");
      }
   }

   private static ItemStack method34945(JsonObject var0) {
      if (!var0.has("item")) {
         throw new JsonSyntaxException("Unsupported icon type, currently only items are supported (add 'item' key)");
      } else {
         Class3257 var3 = Class8963.method32766(var0, "item");
         if (var0.has("data")) {
            throw new JsonParseException("Disallowed data tag found");
         } else {
            ItemStack var4 = new ItemStack(var3);
            if (var0.has("nbt")) {
               try {
                  Class39 var5 = Class7671.method25188(Class8963.method32762(var0.get("nbt"), "nbt"));
                  var4.method32148(var5);
               } catch (CommandSyntaxException var6) {
                  throw new JsonSyntaxException("Invalid nbt tag: " + var6.getMessage());
               }
            }

            return var4;
         }
      }
   }

   public void method34946(PacketBuffer var1) {
      var1.method35711(this.field42646);
      var1.method35711(this.field42647);
      var1.method35724(this.field42648);
      var1.method35713(this.field42650);
      int var4 = 0;
      if (this.field42649 != null) {
         var4 |= 1;
      }

      if (this.field42651) {
         var4 |= 2;
      }

      if (this.field42653) {
         var4 |= 4;
      }

      var1.writeInt(var4);
      if (this.field42649 != null) {
         var1.method35732(this.field42649);
      }

      var1.writeFloat(this.field42654);
      var1.writeFloat(this.field42655);
   }

   public static Class9272 method34947(PacketBuffer var0) {
      ITextComponent var3 = var0.method35710();
      ITextComponent var4 = var0.method35710();
      ItemStack var5 = var0.method35726();
      Class1965 var6 = var0.<Class1965>method35712(Class1965.class);
      int var7 = var0.readInt();
      Object var8 = null;
      boolean var9 = false;
      boolean var10 = false;
      Class9272 var11 = new Class9272(var5, var3, var4, (ResourceLocation)var8, var6, var9, false, var10);
      var11.method34933(var0.readFloat(), var0.readFloat());
      return var11;
   }

   public JsonElement method34948() {
      JsonObject var3 = new JsonObject();
      var3.add("icon", this.method34949());
      var3.add("title", ITextComponent$Serializer.toJsonTree(this.field42646));
      var3.add("description", ITextComponent$Serializer.toJsonTree(this.field42647));
      var3.addProperty("frame", this.field42650.method8241());
      var3.addProperty("show_toast", this.field42651);
      var3.addProperty("announce_to_chat", this.field42652);
      var3.addProperty("hidden", this.field42653);
      if (this.field42649 != null) {
         var3.addProperty("background", this.field42649.toString());
      }

      return var3;
   }

   private JsonObject method34949() {
      JsonObject var3 = new JsonObject();
      var3.addProperty("item", Class2348.field16075.method9181(this.field42648.method32107()).toString());
      if (this.field42648.method32141()) {
         var3.addProperty("nbt", this.field42648.method32142().toString());
      }

      return var3;
   }
}
