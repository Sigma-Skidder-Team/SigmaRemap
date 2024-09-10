package net.minecraft.resources.data;

import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import mapped.JSONUtils;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;

public class PackMetadataSectionSerializer implements IMetadataSectionSerializer<PackMetadataSection> {
   public PackMetadataSection deserialize(JsonObject var1) {
      IFormattableTextComponent var4 = ITextComponent$Serializer.func_240641_a_(var1.get("description"));
      if (var4 != null) {
         int var5 = JSONUtils.method32777(var1, "pack_format");
         return new PackMetadataSection(var4, var5);
      } else {
         throw new JsonParseException("Invalid/missing description!");
      }
   }

   @Override
   public String getSectionName() {
      return "pack";
   }
}
