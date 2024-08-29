package com.mentalfrostbyte.jello;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.command.CommandManager;
import com.mentalfrostbyte.jello.event.EventManager;
import com.mentalfrostbyte.jello.event.impl.Class4413;
import com.mentalfrostbyte.jello.event.impl.Class4419;
import com.mentalfrostbyte.jello.event.impl.Class4420;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.ModuleManager;
import com.mentalfrostbyte.jello.music.MusicManager;
import com.mentalfrostbyte.jello.unmapped.Class8402;
import com.mentalfrostbyte.jello.network.NetworkManager;
import com.mentalfrostbyte.jello.network.WebsocketManager;
import com.mentalfrostbyte.jello.notification.NotificationManager;
import com.mentalfrostbyte.jello.sound.SoundManager;
import com.mentalfrostbyte.jello.target.CombatManager;
import com.mentalfrostbyte.jello.target.FriendManager;
import com.mentalfrostbyte.jello.unmapped.*;
import com.mentalfrostbyte.jello.util.FileUtil;
import com.mentalfrostbyte.jello.viaversion.ViaVersionLoader;
import mapped.*;
import net.minecraft.client.Minecraft;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class Client {
    public static final String VERSION = "5.0.0b15";
    public static final boolean field28963 = false;
    private static final Minecraft mc = Minecraft.getInstance();
    public static String field28960 = "Jello";
    public static String field28962 = "Sigma Production";
    public static List<Texture> textureList = new ArrayList<Texture>();
    public static boolean field28993 = false;
    private static Client instance;
    private final File file = new File("sigma5");
    private JSONObject config;
    private boolean field28968 = true;
    private Logger logger;
    private EventManager eventManager;
    private ModuleManager moduleManager;
    private CommandManager commandManager;
    private GuiManager guiManager;
    private FriendManager friendManager;
    private CombatManager combatManager;
    private ViaVersionLoader viaversionLoader;
    private MusicManager musicManager;
    private Class8696 field28979;
    private AccountManager accountManager;
    private Class8480 field28981;
    private Class8402 field28982;
    private NetworkManager networkManager;
    private WebsocketManager websocketManager;
    private SoundManager soundManager;
    private NotificationManager notificationManager;
    private Class8996 field28987;
    private WaypointsManager waypointsManager;
    private Class8795 field28989;
    private Class8005 field28990;
    private ClientMode clientMode = ClientMode.PREMIUM;

    private Client() {
    }

    public static Client getInstance() {
        return instance != null ? instance : (instance = new Client());
    }

    public static Logger getClientLogger() { // Why is this even a seperate method lmao
        return getInstance().getLogger();
    }

    public void start() {
        long var3 = System.currentTimeMillis();
        Class8379.method29373();

        this.logger = new ClientLogger(System.out, System.out, System.err);
        this.logger.info("Initializing...");

        try {
            if (!this.file.exists()) {
                this.file.mkdirs();
            }

            this.config = FileUtil.readFile(new File(this.file + "/config.json"));
        } catch (IOException var8) {
            var8.printStackTrace();
        }

        this.eventManager = new EventManager();
        this.commandManager = new CommandManager();
        this.commandManager.init();
        ResourcesDecrypter.decrypt();
        this.networkManager = new NetworkManager();
        this.networkManager.init();
        this.websocketManager = new WebsocketManager();
        this.websocketManager.method20281();
        this.guiManager = new GuiManager();
        this.friendManager = new FriendManager();
        this.friendManager.method26995();
        this.combatManager = new CombatManager();
        this.combatManager.method29345();
        this.viaversionLoader = new ViaVersionLoader();
     //   this.field28977.method23341();
        this.field28979 = new Class8696();
        this.field28979.method31323();
        this.field28987 = new Class8996();
        this.field28987.method33236();
        this.musicManager = new MusicManager();
        this.musicManager.method24293();
        this.soundManager = new SoundManager();
        this.soundManager.init();
        this.notificationManager = new NotificationManager();
        this.notificationManager.method31999();
        this.accountManager = new AccountManager();
        this.accountManager.registerEvents();
        this.waypointsManager = new WaypointsManager();
        this.waypointsManager.method29988();
        this.field28981 = new Class8480();
        this.field28981.method29970();
        this.field28989 = new Class8795();
        this.field28989.method31737();
        GLFW.glfwSetWindowTitle(mc.mainWindow.getHandle(), "Sigma 5.0");
        long var6 = System.currentTimeMillis();
        this.method19922();
        this.logger.info("Initialized.");
    }

    public void method19921() {
        DiscordRPC var3 = DiscordRPC.INSTANCE;
        String var4 = "693493612754763907";
        String var5 = "";
        DiscordEventHandlers var6 = new DiscordEventHandlers();
        var6.ready = var0 -> System.out.println("Ready!");
        var3.Discord_Initialize(var4, var6, true, var5);
        DiscordRichPresence var7 = new DiscordRichPresence();
        var7.startTimestamp = System.currentTimeMillis() / 1000L;
        var7.state = "Playing Minecraft";
        var7.details = "Jello for Sigma";
        var7.largeImageKey = "jello";

        var3.Discord_UpdatePresence(var7);
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                var3.Discord_RunCallbacks();

                try {
                    Thread.sleep(2000L);
                    var7.smallImageKey = "premium";
                    var7.smallImageText = "Premium";
                    var3.Discord_UpdatePresence(var7);
                } catch (InterruptedException ignored) {
                }
            }
        }, "RPC-Callback-Handler").start();
    }

    public void method19922() {
    }

    public void shutdown() {
        this.logger.info("Shutting down...");

        try {
            if (this.guiManager != null) {
                this.guiManager.method33468(this.config);
            }

            if (this.moduleManager != null) {
                this.moduleManager.method14660(this.config);
            }

            Class4419 var3 = new Class4419(this.config);
            if (this.eventManager != null) {
                this.eventManager.call(var3);
            }

            FileUtil.save(var3.method13968(), new File(this.file + "/config.json"));
        } catch (IOException var4) {
            this.logger.error("Unable to shutdown correctly. Config may be corrupt?");
            var4.printStackTrace();
        }

        this.logger.info("Done.");
    }

    public void method19924() {
        try {
            FileUtil.save(this.config, new File(this.file + "/config.json"));
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    public void endTick() {
        this.guiManager.method33460();
    }

    public void method19926() {
        GL11.glPushMatrix();
        double var3 = mc.mainWindow.getGuiScaleFactor() / (double) ((float) Math.pow(mc.mainWindow.getGuiScaleFactor(), 2.0));
        GL11.glScaled(var3, var3, var3);
        GL11.glScaled(GuiManager.field41348, GuiManager.field41348, GuiManager.field41348);
        GL11.glDisable(2912);
        RenderSystem.disableDepthTest();
        RenderSystem.translatef(0.0F, 0.0F, 1000.0F);
        RenderSystem.method27819(519, 0.0F);
        RenderSystem.enableBlend();
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        RenderSystem.method27836(Class2339.field15997, Class1981.field12932, Class2339.field15990, Class1981.field12936);
        ResourcesDecrypter.gingerbreadIconPNG.bind();
        getInstance().getEventManager().call(new Class4413());
        RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.enableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.method27819(518, 0.1F);
        GL11.glPopMatrix();
    }

    public void method19927(Texture var1) {
        textureList.add(var1);
    }

    public void method19928() {
        if (!textureList.isEmpty()) {
            try {
                for (Texture var4 : textureList) {
                    var4.release();
                }

                textureList.clear();
            } catch (ConcurrentModificationException var7) {
            }
        }

        if (getInstance().getClientMode() != ClientMode.NOADDONS) {
            double var5 = mc.mainWindow.getGuiScaleFactor() / (double) ((float) Math.pow(mc.mainWindow.getGuiScaleFactor(), 2.0));
            GL11.glScaled(var5, var5, 1.0);
            GL11.glScaled(GuiManager.field41348, GuiManager.field41348, 1.0);
            RenderSystem.disableDepthTest();
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0F, 0.0F, 1000.0F);
            this.guiManager.method33464();
            RenderSystem.popMatrix();
            RenderSystem.enableDepthTest();
            RenderSystem.disableAlphaTest();
            GL11.glAlphaFunc(518, 0.1F);
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    public void method19929() {
        if (mc != null && mc.world != null && mc.player != null && !field28993) {
            GL11.glTranslatef(0.0F, 0.0F, 0.0F);
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            GL11.glDisable(2896);
            this.eventManager.call(new Class4420());
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    public boolean method19930() {
        return this.field28968;
    }

    public void method19931(boolean var1) {
        this.field28968 = var1;
    }

    public Logger getLogger() {
        return this.logger;
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }

    public ModuleManager getModuleManager() {
        return this.moduleManager;
    }

    public FriendManager getFriendManager() {
        return this.friendManager;
    }

    public CombatManager getCombatManager() {
        return this.combatManager;
    }

    public ViaVersionLoader method19937() {
        return this.viaversionLoader;
    }

    public GuiManager getGuiManager() {
        return this.guiManager;
    }

    public Class8696 method19939() {
        return this.field28979;
    }

    public Class8996 method19940() {
        return this.field28987;
    }

    public SoundManager getSoundManager() {
        return this.soundManager;
    }

    public NotificationManager getNotificationManager() {
        return this.notificationManager;
    }

    public AccountManager getAccountManager() {
        return this.accountManager;
    }

    public MusicManager getMusicManager() {
        return this.musicManager;
    }

    public WaypointsManager getWaypointsManager() {
        return this.waypointsManager;
    }

    public NetworkManager getNetworkManager() {
        return this.networkManager;
    }

    public WebsocketManager getWebsocketManager() {
        return this.websocketManager;
    }

    public CommandManager getCommandManager() {
        return this.commandManager;
    }

    public Class8795 method19950() {
        return this.field28989;
    }

    public JSONObject getConfig() {
        return this.config;
    }

    public File getFile() {
        return this.file;
    }

    public ClientMode getClientMode() {
        return this.clientMode;
    }

    public void setupClient(ClientMode mode) {
        this.clientMode = mode;
        if (mode != ClientMode.CLASSIC) {
            if (mode == ClientMode.JELLO) {
                this.method19921();
                GLFW.glfwSetWindowTitle(mc.mainWindow.getHandle(), "Jello for Sigma 5.0");
            }
        } else {
            ClassicDecryption.init();
            getInstance().getGuiManager().method33452();
            GLFW.glfwSetWindowTitle(mc.mainWindow.getHandle(), "Classic Sigma 5.0");
        }

        if (this.moduleManager == null && Class1537.field8341 != null) {
            this.moduleManager = new ModuleManager();
            this.moduleManager.register(this.clientMode);
            this.moduleManager.method14659(this.config);
            this.moduleManager.method14658();
        }

       // System.gc();
    }
}
