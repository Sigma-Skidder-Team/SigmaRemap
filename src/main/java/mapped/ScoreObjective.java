package mapped;

import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.HoverEvent;

public class ScoreObjective {
   private static String[] field35938;
   private final Scoreboard field35939;
   private final String field35940;
   private final Class9008 field35941;
   private ITextComponent field35942;
   private ITextComponent field35943;
   private Class2316 field35944;

   public ScoreObjective(Scoreboard var1, String var2, Class9008 var3, ITextComponent var4, Class2316 var5) {
      this.field35939 = var1;
      this.field35940 = var2;
      this.field35941 = var3;
      this.field35942 = var4;
      this.field35943 = this.method29339();
      this.field35944 = var5;
   }

   public Scoreboard method29335() {
      return this.field35939;
   }

   public String method29336() {
      return this.field35940;
   }

   public Class9008 getCriteria() {
      return this.field35941;
   }

   public ITextComponent method29338() {
      return this.field35942;
   }

   private ITextComponent method29339() {
      return TextComponentUtils.wrapWithSquareBrackets(
         this.field35942
            .deepCopy()
            .modifyStyle(var1 -> var1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new StringTextComponent(this.field35940))))
      );
   }

   public ITextComponent method29340() {
      return this.field35943;
   }

   public void method29341(ITextComponent var1) {
      this.field35942 = var1;
      this.field35943 = this.method29339();
      this.field35939.method21000(this);
   }

   public Class2316 method29342() {
      return this.field35944;
   }

   public void method29343(Class2316 var1) {
      this.field35944 = var1;
      this.field35939.method21000(this);
   }
}
