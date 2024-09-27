package mapped;

import com.google.common.collect.Lists;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.gen.feature.template.TemplateManager;

import java.util.List;
import java.util.Random;

public class Class4175 extends Class4174 {
   private static String[] field20436;
   public Class7258 field20437;
   public List<Class7258> field20438;
   public List<Class7258> field20439;
   public final List<Class4178> field20440 = Lists.newArrayList();

   public Class4175(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      this.field20438 = Lists.newArrayList();

      for (Class7258 var9 : Class7247.method22749()) {
         var9.field31143 = 0;
         this.field20438.add(var9);
      }

      this.field20439 = Lists.newArrayList();

      for (Class7258 var13 : Class7247.method22750()) {
         var13.field31143 = 0;
         this.field20439.add(var13);
      }
   }

   public Class4175(TemplateManager var1, CompoundNBT var2) {
      super(Class7792.field33443, var2);
   }
}
