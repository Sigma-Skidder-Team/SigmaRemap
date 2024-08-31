package mapped;

import net.minecraft.resources.ResourcePackInfo;

import java.util.List;

public class Class4682 extends Class4680 {
   private static String[] field22257;
   public final Class8719 field22258;

   public Class4682(Class8719 var1, ResourcePackInfo var2) {
      super(var1, var2);
      this.field22258 = var1;
   }

   @Override
   public List<ResourcePackInfo> method14672() {
      return Class8719.method31457(this.field22258);
   }

   @Override
   public List<ResourcePackInfo> method14673() {
      return Class8719.method31456(this.field22258);
   }

   @Override
   public boolean method14674() {
      return true;
   }

   @Override
   public void method14675() {
   }

   @Override
   public void method14676() {
      this.method14684();
   }
}
