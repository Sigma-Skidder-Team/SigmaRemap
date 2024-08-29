package mapped;

import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;

public class ClassicDecryption {
   public static final String unused1 = "com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf";
   public static final String unused2 = "com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf";
   public static final String unused3 = "com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Medium.ttf";
   public static Texture singlePlayer;
   public static Texture multiplayer;
   public static Texture options;
   public static Texture language;
   public static Texture accounts;
   public static Texture exit;
   public static Texture mainmenubackground;
   public static Texture big;
   public static Texture agora;
   public static Texture checkbox;
   public static ClientResource regular28;
   public static ClientResource regular25;
   public static ClientResource regular20;
   public static ClientResource regular17;
   public static ClientResource regular15;
   public static ClientResource regular12;
   public static ClientResource bold22;
   public static ClientResource bold18;
   public static ClientResource bold16;
   public static ClientResource bold14;
   public static ClientResource medium17;

   public static void init() {
      singlePlayer = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/singleplayer.png");
      multiplayer = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/multiplayer.png");
      options = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/options.png");
      language = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/language.png");
      accounts = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/accounts.png");
      exit = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/exit.png");
      mainmenubackground = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/mainmenubackground.png");
      big = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/big.png");
      agora = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/agora.png");
      checkbox = ResourcesDecrypter.loadTexture("com/mentalfrostbyte/gui/resources/sigma/uglygui/checkbox.png");
      regular28 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 28.0F);
      regular25 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 25.0F);
      regular20 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 20.0F);
      regular17 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 17.0F);
      regular15 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 15.0F);
      regular12 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Regular.ttf", 0, 12.0F);
      medium17 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Medium.ttf", 0, 17.0F);
      bold22 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 22.0F);
      bold18 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 18.0F);
      bold16 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 16.0F);
      bold14 = ResourceRegistry.getFont("com/mentalfrostbyte/gui/resources/font/SF-UI-Display-Bold.ttf", 0, 14.0F);
   }
}
