package mapped;

import net.minecraft.resources.ResourcePackInfo;

import java.util.List;

public class Class4679 extends Class4680 {
   private static String[] field22253;
   public final Class8719 field22254;

   public Class4679(Class8719 var1, ResourcePackInfo var2) {
      super(var1, var2);
      this.field22254 = var1;
   }

   @Override
   public List<ResourcePackInfo> method14672() {
      return Class8719.method31456(this.field22254);
   }

   @Override
   public List<ResourcePackInfo> method14673() {
      return Class8719.method31457(this.field22254);
   }

   @Override
   public boolean method14674() {
      return false;
   }

   @Override
   public void method14675() {
      this.method14684();
   }

   @Override
   public void method14676() {
   }
}
