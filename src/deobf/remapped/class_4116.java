package remapped;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_4116 extends class_8374<class_2269> {
   private static final Logger field_20059 = LogManager.getLogger();
   private static final ThreadPoolExecutor field_20069 = new ScheduledThreadPoolExecutor(
      5, new ThreadFactoryBuilder().setNameFormat("Server Pinger #%d").setDaemon(true).setUncaughtExceptionHandler(new class_447(field_20059)).build()
   );
   private static final class_4639 field_20064 = new class_4639("textures/misc/unknown_server.png");
   private static final class_4639 field_20058 = new class_4639("textures/gui/server_selection.png");
   private static final ITextComponent field_20056 = new TranslationTextComponent("lanServer.scanning");
   private static final ITextComponent field_20061 = new TranslationTextComponent("multiplayer.status.cannot_resolve").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field_20055 = new TranslationTextComponent("multiplayer.status.cannot_connect").mergeStyle(TextFormatting.DARK_RED);
   private static final ITextComponent field_20063 = new TranslationTextComponent("multiplayer.status.incompatible");
   private static final ITextComponent field_20057 = new TranslationTextComponent("multiplayer.status.no_connection");
   private static final ITextComponent field_20065 = new TranslationTextComponent("multiplayer.status.pinging");
   private final class_4145 field_20060;
   private final List<class_6757> field_20068 = Lists.newArrayList();
   private final class_2269 field_20066 = new class_7668();
   private final List<class_6343> field_20062 = Lists.newArrayList();

   public class_4116(class_4145 var1, class_1893 var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_20060 = var1;
   }

   private void method_19116() {
      this.method_36192();
      this.field_20068.forEach(this::method_36202);
      this.method_36202(this.field_20066);
      this.field_20062.forEach(this::method_36202);
   }

   public void method_19114(class_2269 var1) {
      super.method_36197(var1);
      if (this.method_36226() instanceof class_6757) {
         class_7542.field_38482
            .method_34341(new TranslationTextComponent("narrator.select", class_6757.method_30963((class_6757)this.method_36226()).field_12670).getString());
      }

      this.field_20060.method_19233();
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      class_2269 var6 = this.method_36226();
      return var6 != null && var6.method_26946(var1, var2, var3) || super.method_26946(var1, var2, var3);
   }

   @Override
   public void method_36206(class_792 var1) {
      this.method_36219(var1, var0 -> !(var0 instanceof class_7668));
   }

   public void method_19117(class_3187 var1) {
      this.field_20068.clear();

      for (int var4 = 0; var4 < var1.method_14671(); var4++) {
         this.field_20068.add(new class_6757(this, this.field_20060, var1.method_14673(var4)));
      }

      this.method_19116();
   }

   public void method_19125(List<class_7295> var1) {
      this.field_20062.clear();

      for (class_7295 var5 : var1) {
         this.field_20062.add(new class_6343(this.field_20060, var5));
      }

      this.method_19116();
   }

   @Override
   public int method_36191() {
      return super.method_36191() + 30;
   }

   @Override
   public int method_36195() {
      return super.method_36195() + 85;
   }

   @Override
   public boolean method_36221() {
      return this.field_20060.method_41185() == this;
   }
}
