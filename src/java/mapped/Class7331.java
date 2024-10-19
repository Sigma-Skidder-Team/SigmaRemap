package mapped;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.command.CommandSource;
import net.minecraft.command.arguments.ILocationArgument;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.util.math.vector.Vector3d;

public class Class7331 implements ILocationArgument {
   private static String[] field31415;
   private final Class8796 field31416;
   private final Class8796 field31417;
   private final Class8796 field31418;

   public Class7331(Class8796 var1, Class8796 var2, Class8796 var3) {
      this.field31416 = var1;
      this.field31417 = var2;
      this.field31418 = var3;
   }

   @Override
   public Vector3d getPosition(CommandSource source) {
      Vector3d var4 = source.method20171();
      return new Vector3d(
         this.field31416.method31754(var4.x), this.field31417.method31754(var4.y), this.field31418.method31754(var4.z)
      );
   }

   @Override
   public Vector2f getRotation(CommandSource source) {
      Vector2f var4 = source.method20176();
      return new Vector2f((float)this.field31416.method31754((double)var4.x), (float)this.field31417.method31754((double)var4.y));
   }

   @Override
   public boolean isXRelative() {
      return this.field31416.method31758();
   }

   @Override
   public boolean isYRelative() {
      return this.field31417.method31758();
   }

   @Override
   public boolean isZRelative() {
      return this.field31418.method31758();
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 instanceof Class7331) {
            Class7331 var4 = (Class7331)var1;
            if (this.field31416.equals(var4.field31416)) {
               return this.field31417.equals(var4.field31417) ? this.field31418.equals(var4.field31418) : false;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public static Class7331 method23236(StringReader var0) throws CommandSyntaxException {
      int var3 = var0.getCursor();
      Class8796 var4 = Class8796.method31756(var0);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Class8796 var5 = Class8796.method31756(var0);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Class8796 var6 = Class8796.method31756(var0);
            return new Class7331(var4, var5, var6);
         } else {
            var0.setCursor(var3);
            throw Class6851.field29766.createWithContext(var0);
         }
      } else {
         var0.setCursor(var3);
         throw Class6851.field29766.createWithContext(var0);
      }
   }

   public static Class7331 method23237(StringReader var0, boolean var1) throws CommandSyntaxException {
      int var4 = var0.getCursor();
      Class8796 var5 = Class8796.method31755(var0, var1);
      if (var0.canRead() && var0.peek() == ' ') {
         var0.skip();
         Class8796 var6 = Class8796.method31755(var0, false);
         if (var0.canRead() && var0.peek() == ' ') {
            var0.skip();
            Class8796 var7 = Class8796.method31755(var0, var1);
            return new Class7331(var5, var6, var7);
         } else {
            var0.setCursor(var4);
            throw Class6851.field29766.createWithContext(var0);
         }
      } else {
         var0.setCursor(var4);
         throw Class6851.field29766.createWithContext(var0);
      }
   }

   public static Class7331 method23238() {
      return new Class7331(new Class8796(true, 0.0), new Class8796(true, 0.0), new Class8796(true, 0.0));
   }

   @Override
   public int hashCode() {
      int var3 = this.field31416.hashCode();
      var3 = 31 * var3 + this.field31417.hashCode();
      return 31 * var3 + this.field31418.hashCode();
   }
}
