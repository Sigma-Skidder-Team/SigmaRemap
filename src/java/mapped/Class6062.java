package mapped;

import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

import net.minecraft.nbt.CompoundNBT;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6062<C> {
   private static final Logger field26299 = LogManager.getLogger();
   public static final Class6062<MinecraftServer> field26300 = new Class6062<MinecraftServer>().method18795(new Class6944()).method18795(new Class6946());
   private final Map<ResourceLocation, Class6945<C, ?>> field26301 = Maps.newHashMap();
   private final Map<Class<?>, Class6945<C, ?>> field26302 = Maps.newHashMap();

   public Class6062<C> method18795(Class6945<C, ?> var1) {
      this.field26301.put(var1.method21398(), var1);
      this.field26302.put(var1.method21399(), var1);
      return this;
   }

   private <T extends Class6861<C>> Class6945<C, T> method18796(Class<?> var1) {
      return (Class6945<C, T>)this.field26302.get(var1);
   }

   public <T extends Class6861<C>> CompoundNBT method18797(T var1) {
      Class6945<C, Class6861<C>> var4 = this.method18796(var1.getClass());
      CompoundNBT var5 = new CompoundNBT();
      var4.method21397(var5, var1);
      var5.method109("Type", var4.method21398().toString());
      return var5;
   }

   @Nullable
   public Class6861<C> method18798(CompoundNBT var1) {
      ResourceLocation var4 = ResourceLocation.method8289(var1.method126("Type"));
      Class6945 var5 = this.field26301.get(var4);
      if (var5 == null) {
         field26299.error("Failed to deserialize timer callback: " + var1);
         return null;
      } else {
         try {
            return var5.method21396(var1);
         } catch (Exception var7) {
            field26299.error("Failed to deserialize timer callback: " + var1, var7);
            return null;
         }
      }
   }
}
