package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;

import java.io.DataOutput;
import java.io.IOException;

public class Class38 implements Class30 {
   public static final Class7052<Class38> field77 = new Class7051();
   public static final Class38 field78 = new Class38();

   private Class38() {
   }

   @Override
   public void method73(DataOutput var1) throws IOException {
   }

   @Override
   public byte method74() {
      return 0;
   }

   @Override
   public Class7052<Class38> method75() {
      return field77;
   }

   @Override
   public String toString() {
      return "END";
   }

   public Class38 method79() {
      return this;
   }

   @Override
   public ITextComponent method78(String var1, int var2) {
      return StringTextComponent.EMPTY;
   }
}
