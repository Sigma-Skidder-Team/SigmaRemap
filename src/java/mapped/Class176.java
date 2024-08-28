package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import net.minecraft.util.text.TranslationTextComponent;

import java.util.function.Predicate;

public class Class176 implements Predicate<Class8848> {
   private static final Dynamic2CommandExceptionType field562 = new Dynamic2CommandExceptionType(
      (var0, var1) -> new TranslationTextComponent("arguments.item.overstacked", var0, var1)
   );
   private final Class3257 field563;
   private final Class39 field564;

   public Class176(Class3257 var1, Class39 var2) {
      this.field563 = var1;
      this.field564 = var2;
   }

   public Class3257 method502() {
      return this.field563;
   }

   public boolean test(Class8848 var1) {
      return var1.method32107() == this.field563 && Class8354.method29280(this.field564, var1.method32142(), true);
   }

   public Class8848 method503(int var1, boolean var2) throws CommandSyntaxException {
      Class8848 var5 = new Class8848(this.field563, var1);
      if (this.field564 != null) {
         var5.method32148(this.field564);
      }

      if (var2 && var1 > var5.method32113()) {
         throw field562.create(Class2348.field16075.method9181(this.field563), var5.method32113());
      } else {
         return var5;
      }
   }

   public String method504() {
      StringBuilder var3 = new StringBuilder(Class2348.field16075.method9171(this.field563));
      if (this.field564 != null) {
         var3.append(this.field564);
      }

      return var3.toString();
   }
}
