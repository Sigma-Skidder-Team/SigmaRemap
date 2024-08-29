package mapped;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Set;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;

public class Class8218 extends Team {
   private final Class6886 field35295;
   private final String field35296;
   private final Set<String> field35297 = Sets.newHashSet();
   private ITextComponent field35298;
   private ITextComponent field35299 = StringTextComponent.EMPTY;
   private ITextComponent field35300 = StringTextComponent.EMPTY;
   private boolean field35301 = true;
   private boolean field35302 = true;
   private Class2225 field35303 = Class2225.field14554;
   private Class2225 field35304 = Class2225.field14554;
   private TextFormatting field35305 = TextFormatting.RESET;
   private Class2212 field35306 = Class2212.field14462;
   private final Style field35307;

   public Class8218(Class6886 var1, String var2) {
      this.field35295 = var1;
      this.field35296 = var2;
      this.field35298 = new StringTextComponent(var2);
      this.field35307 = Style.EMPTY.setInsertion(var2).setHoverEvent(new HoverEvent(HoverEvent$Action.SHOW_TEXT, new StringTextComponent(var2)));
   }

   @Override
   public String method28567() {
      return this.field35296;
   }

   public ITextComponent method28568() {
      return this.field35298;
   }

   public IFormattableTextComponent method28569() {
      IFormattableTextComponent var3 = TextComponentUtils.wrapWithSquareBrackets(this.field35298.deepCopy().mergeStyle(this.field35307));
      TextFormatting var4 = this.getColor();
      if (var4 != TextFormatting.RESET) {
         var3.mergeStyle(var4);
      }

      return var3;
   }

   public void method28570(ITextComponent var1) {
      if (var1 != null) {
         this.field35298 = var1;
         this.field35295.method21006(this);
      } else {
         throw new IllegalArgumentException("Name cannot be null");
      }
   }

   public void method28571(ITextComponent var1) {
      this.field35299 = var1 != null ? var1 : StringTextComponent.EMPTY;
      this.field35295.method21006(this);
   }

   public ITextComponent method28572() {
      return this.field35299;
   }

   public void method28573(ITextComponent var1) {
      this.field35300 = var1 != null ? var1 : StringTextComponent.EMPTY;
      this.field35295.method21006(this);
   }

   public ITextComponent method28574() {
      return this.field35300;
   }

   @Override
   public Collection<String> method28575() {
      return this.field35297;
   }

   @Override
   public IFormattableTextComponent method28576(ITextComponent var1) {
      IFormattableTextComponent var4 = new StringTextComponent("").append(this.field35299).append(var1).append(this.field35300);
      TextFormatting var5 = this.getColor();
      if (var5 != TextFormatting.RESET) {
         var4.mergeStyle(var5);
      }

      return var4;
   }

   public static IFormattableTextComponent method28577(Team var0, ITextComponent var1) {
      return var0 != null ? var0.method28576(var1) : var1.deepCopy();
   }

   @Override
   public boolean method28578() {
      return this.field35301;
   }

   public void method28579(boolean var1) {
      this.field35301 = var1;
      this.field35295.method21006(this);
   }

   @Override
   public boolean method28580() {
      return this.field35302;
   }

   public void method28581(boolean var1) {
      this.field35302 = var1;
      this.field35295.method21006(this);
   }

   @Override
   public Class2225 method28582() {
      return this.field35303;
   }

   @Override
   public Class2225 method28583() {
      return this.field35304;
   }

   public void method28584(Class2225 var1) {
      this.field35303 = var1;
      this.field35295.method21006(this);
   }

   public void method28585(Class2225 var1) {
      this.field35304 = var1;
      this.field35295.method21006(this);
   }

   @Override
   public Class2212 method28586() {
      return this.field35306;
   }

   public void method28587(Class2212 var1) {
      this.field35306 = var1;
      this.field35295.method21006(this);
   }

   public int method28588() {
      byte var3 = 0;
      if (this.method28578()) {
         var3 |= 1;
      }

      if (this.method28580()) {
         var3 |= 2;
      }

      return var3;
   }

   public void method28589(int var1) {
      int var2 = 2146857813;
      Class8218 var10000 = this;

      do {
         if ((var2 & 262144) != 0) {
            var10000.method28579(false);
            var10000 = this;
         }
      } while ((var2 & 262144) == 0);

      var10000.method28581(false);
   }

   public void method28590(TextFormatting var1) {
      this.field35305 = var1;
      this.field35295.method21006(this);
   }

   @Override
   public TextFormatting getColor() {
      return this.field35305;
   }
}
