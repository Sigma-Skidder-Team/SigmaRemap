package net.minecraft.entity.ai.attributes;

import com.google.common.collect.Maps;
import net.minecraft.util.registry.Registry;

import java.util.Map;

public class MutableAttribute {
   private final Map<Attribute, ModifiableAttributeInstance> field30365 = Maps.newHashMap();
   private boolean field30366;

   private ModifiableAttributeInstance method21847(Attribute var1) {
      ModifiableAttributeInstance var4 = new ModifiableAttributeInstance(var1, var2 -> {
         if (this.field30366) {
            throw new UnsupportedOperationException("Tried to change value for default attribute instance: " + Registry.ATTRIBUTE.getKey(var1));
         }
      });
      this.field30365.put(var1, var4);
      return var4;
   }

   public MutableAttribute createMutableAttribute(Attribute var1) {
      this.method21847(var1);
      return this;
   }

   public MutableAttribute method21849(Attribute var1, double var2) {
      ModifiableAttributeInstance var6 = this.method21847(var1);
      var6.method38661(var2);
      return this;
   }

   public AttributeModifierMap method21850() {
      this.field30366 = true;
      return new AttributeModifierMap(this.field30365);
   }
}
