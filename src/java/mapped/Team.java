package mapped;

import java.util.Collection;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public abstract class Team {
   public boolean method28592(Team var1) {
      return var1 != null ? this == var1 : false;
   }

   public abstract String method28567();

   public abstract IFormattableTextComponent method28576(ITextComponent var1);

   public abstract boolean method28580();

   public abstract boolean method28578();

   public abstract Class2225 method28582();

   public abstract TextFormatting getColor();

   public abstract Collection<String> method28575();

   public abstract Class2225 method28583();

   public abstract Class2212 method28586();
}
