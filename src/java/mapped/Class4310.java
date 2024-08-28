package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.Random;

public class Class4310 extends Class4307 {
   public static long field20965 = 0L;
   private int field20966 = 0;
   private int field20967 = 0;
   private boolean field20968 = true;
   public Class4327 field20969;
   public Class4336 field20970;
   public Class4329 field20971;
   public Animation field20972 = new Animation(200, 200, Direction.BACKWARDS);
   public Animation field20973 = new Animation(200, 200, Direction.BACKWARDS);
   private Animation field20974 = new Animation(325, 325);
   private Animation field20975 = new Animation(800, 800);
   private static Texture field20976;
   public List<Class4306> field20977 = new ArrayList<Class4306>();
   public static String[] field20978 = new String[]{
      "Goodbye.",
      "See you soon.",
      "Bye!",
      "Au revoir",
      "See you!",
      "Ciao!",
      "Adios",
      "Farewell",
      "See you later!",
      "Have a good day!",
      "See you arround.",
      "See you tomorrow!",
      "Goodbye, friend.",
      "Logging out.",
      "Signing off!",
      "Shutting down.",
      "Was good to see you!"
   };
   public static String[] field20979 = new String[]{
      "The two hardest things to say in life are hello for the first time and goodbye for the last.",
      "Don’t cry because it’s over, smile because it happened.",
      "It’s time to say goodbye, but I think goodbyes are sad and I’d much rather say hello. Hello to a new adventure.",
      "We’ll meet again, Don’t know where, don’t know when, But I know we’ll meet again, some sunny day.",
      "This is not a goodbye but a 'see you soon'.",
      "You are my hardest goodbye.",
      "Goodbyes are not forever, are not the end; it simply means I’ll miss you until we meet again.",
      "Good friends never say goodbye. They simply say \"See you soon\".",
      "Every goodbye always makes the next hello closer.",
      "Where's the good in goodbye?",
      "And I'm sorry, so sorry. But, I have to say goodbye."
   };
   public static String field20980;
   public static String field20981;
   public static float field20982;
   public Class4354 field20983;
   public Class4354 field20984;

   public Class4310() {
      super("Main Screen");
      this.method13300(false);
      field20965 = System.nanoTime();
      if (field20976 == null) {
         field20976 = ResourcesDecrypter.createScaledAndProcessedTexture2("com/mentalfrostbyte/gui/resources/" + ResourcesDecrypter.getPanoramaPNG(), 0.075F, 8);
      }

      this.field20974.changeDirection(Direction.BACKWARDS);
      this.field20975.changeDirection(Direction.BACKWARDS);
      int var3 = Minecraft.getInstance().mainWindow.method8043() * Minecraft.getInstance().mainWindow.method8044() / 14000;
      Random var4 = new Random();

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = var4.nextInt(Minecraft.getInstance().mainWindow.method8043());
         int var7 = var4.nextInt(Minecraft.getInstance().mainWindow.method8044());
         int var8 = 7 + var4.nextInt(5);
         int var9 = (1 + var4.nextInt(4)) * (!var4.nextBoolean() ? 1 : -1);
         int var10 = 1 + var4.nextInt(2);
         this.field20977.add(new Class4306(this, Integer.toString(var5), var6, var7, var8, var9, var10));
      }

      this.method13230(this.field20969 = new Class4327(this, "main", 0, 0, this.field20897, this.field20898));
      this.method13230(this.field20970 = new Class4336(this, "changelog", 0, 0, this.field20897, this.field20898));
      this.method13230(this.field20971 = new Class4329(this, "redeem", 0, 0, this.field20897, this.field20898));
      this.field20970.method13296(false);
      this.field20970.method13294(true);
      this.field20971.method13296(false);
      this.field20971.method13294(true);
   }

   public void method13340() {
      this.field20972.changeDirection(Direction.BACKWARDS);
      this.field20970.method13296(false);
      this.field20971.method13296(false);
      this.field20971.method13292(false);
      this.field20971.method13294(true);
   }

   public void method13341() {
      this.field20972.changeDirection(Direction.FORWARDS);
      this.field20973.changeDirection(Direction.FORWARDS);
   }

   public void method13342() {
      this.field20972.changeDirection(Direction.FORWARDS);
      this.field20970.method13296(true);
   }

   public void method13343() {
      this.field20972.changeDirection(Direction.FORWARDS);
      this.field20971.method13296(true);
      this.field20971.method13292(true);
      this.field20971.method13294(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      for (Class4305 var6 : this.field20977) {
         var6.method13028(var1, var2);
      }

      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      float var4 = Class8056.method27664(this.field20972.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field20972.method25319() == Direction.BACKWARDS) {
         var4 = Class8056.method27663(this.field20972.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      float var5 = 0.07F * var4;
      this.field20969.method13279(1.0F - var5, 1.0F - var5);
      this.field20969.method13296(this.field20972.calcPercent() == 0.0F);
      long var6 = System.nanoTime() - field20965;
      field20982 = Math.min(10.0F, Math.max(0.0F, (float)var6 / 1.810361E7F / 2.0F));
      field20965 = System.nanoTime();
      int var8 = -this.method13309();
      float var9 = (float)this.method13310() / (float)this.method13267() * -114.0F;
      if (this.field20968) {
         this.field20966 = (int)var9;
         this.field20967 = var8;
         this.field20968 = false;
      }

      float var10 = var9 - (float)this.field20966;
      float var11 = (float)(var8 - this.field20967);
      if (Minecraft.getInstance().loadingGuiIn != null) {
         if (var9 != (float)this.field20966) {
            this.field20966 = (int)((float)this.field20966 + var10 * field20982);
         }

         if (var8 != this.field20967) {
            this.field20967 = (int)((float)this.field20967 + var11 * field20982);
         }
      } else {
         this.field20974.changeDirection(Direction.FORWARDS);
         this.field20975.changeDirection(Direction.FORWARDS);
         float var12 = 0.5F - (float)this.field20967 / (float) Minecraft.getInstance().mainWindow.method8043() * -1.0F;
         float var13 = 1.0F - this.field20974.calcPercent();
         float var14 = 1.0F - this.field20975.calcPercent();
         float var15 = var14 * var14;
         if (!Client.getInstance().method19930()) {
            var15 = 0.0F;
         }

         float var16 = (float)this.method13267() / 1920.0F;
         int var17 = (int)(600.0F * var16);
         int var18 = (int)(450.0F * var16);
         byte var19 = 0;
         Class3192.method11455(
            (float)this.field20967 - (float)var17 * var12,
            (float)this.field20966,
            (float)(this.method13267() * 2 + var17),
            (float)(this.method13269() + 114),
            ResourcesDecrypter.backgroundPNG
         );
         Class3192.method11455(
            (float)this.field20967 - (float)var18 * var12,
            (float)this.field20966,
            (float)(this.method13267() * 2 + var18),
            (float)(this.method13269() + 114),
            ResourcesDecrypter.middlePNG
         );

         for (Class4305 var21 : this.field20977) {
            GL11.glPushMatrix();
            var21.method13027(var1);
            GL11.glPopMatrix();
         }

         Class3192.method11455(
            (float)this.field20967 - (float)var19 * var12,
            (float)this.field20966,
            (float)(this.method13267() * 2 + var19),
            (float)(this.method13269() + 114),
            ResourcesDecrypter.foregroundPNG
         );
         Texture var26 = ResourcesDecrypter.logoLargePNG;
         int var28 = var26.getImageWidth();
         int var22 = var26.getImageHeight();
         if (GuiManager.field41348 > 1.0F) {
            var26 = ResourcesDecrypter.logoLarge2xPNG;
         }

         Class3192.method11450(
            (float)this.field20967,
            (float)(this.field20966 - 50),
            (float)(this.method13267() * 2),
            (float)(this.method13269() + 200),
            field20976,
            Class5628.method17688(Class1979.field12896.field12910, var4),
            false
         );
         Class3192.method11424(
            0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12891.field12910, var4 * 0.3F)
         );

         for (Class4305 var24 : this.method13241()) {
            if (var24.method13287()) {
               GL11.glPushMatrix();
               if (var24 instanceof Class4336) {
                  if (var4 > 0.0F) {
                     var24.method13027(var1);
                  }
               } else {
                  var24.method13027(var1 * (1.0F - var4));
               }

               GL11.glPopMatrix();
            }
         }

         if (var14 > 0.0F && Client.getInstance().method19930()) {
            Class1272.method6015(var13, 1.0F);
            Client.getInstance().method19931(false);
         }

         field20982 *= 0.7F;
         field20982 = Math.min(field20982, 1.0F);
         if (!this.field20968 && (var14 == 0.0F || this.field20966 != 0 || this.field20967 != 0)) {
            if (var9 != (float)this.field20966) {
               this.field20966 = (int)((float)this.field20966 + var10 * field20982);
            }

            if (var8 != this.field20967) {
               this.field20967 = (int)((float)this.field20967 + var11 * field20982);
            }
         }

         if (this.field20973.method25319() == Direction.FORWARDS) {
            Class3192.method11440(
               ResourceRegistry.JelloMediumFont50,
               (float)(this.field20897 / 2),
               (float)(this.field20898 / 2 - 30),
               field20980,
               Class5628.method17688(Class1979.field12896.field12910, this.field20973.calcPercent()),
               Class2218.field14492,
               Class2218.field14492
            );
            Class3192.method11440(
               ResourceRegistry.JelloLightFont18,
               (float)(this.field20897 / 2),
               (float)(this.field20898 / 2 + 30),
               "\"" + field20981 + "\"",
               Class5628.method17688(Class1979.field12896.field12910, this.field20973.calcPercent() * 0.5F),
               Class2218.field14492,
               Class2218.field14492
            );
         }
      }
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         this.method13340();
      }
   }

   public void method13344() {
      if (this.field20983 == null) {
         this.method13222(() -> {
            List<Class9577> var3 = new ArrayList();
            var3.add(new Class9577(Class2189.field14314, "Agora", 45));
            var3.add(new Class9577(Class2189.field14311, "Agora is not yet available...", 35));
            var3.add(new Class9577(Class2189.field14313, "Ok", 55));
            this.method13233(this.field20983 = new Class4354(this, "music", true, "Dependencies.", var3.toArray(new Class9577[0])));
            this.field20983.method13604(var1 -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method13222(() -> {
                        this.method13236(this.field20983);
                        this.field20983 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field20983.method13603(true);
         });
      }
   }

   public void method13345() {
      if (this.field20984 == null) {
         this.method13222(() -> {
            ArrayList<Class9577> var3 = new ArrayList();
            var3.add(new Class9577(Class2189.field14314, "Logout", 45));
            var3.add(new Class9577(Class2189.field14311, "Are you sure?", 35));
            var3.add(new Class9577(Class2189.field14313, "Yes", 55));
            this.method13233(this.field20984 = new Class4354(this, "music", true, "Dependencies.", var3.toArray(new Class9577[0])));
            this.field20984.method13604(var1 -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method13222(() -> {
                        this.method13236(this.field20984);
                        this.field20984 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field20984.method13603(true);
         });
      }
   }

   static {
      Locale var4 = Locale.getDefault(Category.DISPLAY);
      if (var4 == Locale.FRANCE || var4 == Locale.FRENCH) {
         field20979 = (String[])ArrayUtils.addAll(
            field20979, new String[]{"Mon salut jamais dans la fuite, avant d'm'éteindre, faut m'débrancher", "Prêt à partir pour mon honneur"}
         );
      }

      field20980 = field20978[new Random().nextInt(field20978.length)];
      field20981 = field20979[new Random().nextInt(field20979.length)];
   }
}