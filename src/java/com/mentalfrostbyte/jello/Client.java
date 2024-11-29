package com.mentalfrostbyte.jello;

import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import club.minnced.discord.rpc.DiscordRichPresence;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.command.CommandManager;
import com.mentalfrostbyte.jello.event.EventManager;
import com.mentalfrostbyte.jello.event.impl.EventRender2D;
import com.mentalfrostbyte.jello.event.impl.EventWritter;
import com.mentalfrostbyte.jello.event.impl.Render3DEvent;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.ModuleManager;
import com.mentalfrostbyte.jello.music.MusicManager;
import com.mentalfrostbyte.jello.util.tracker.CombatTracker;
import com.mentalfrostbyte.jello.network.NetworkManager;
import com.mentalfrostbyte.jello.notification.NotificationManager;
import com.mentalfrostbyte.jello.sound.SoundManager;
import com.mentalfrostbyte.jello.target.CombatManager;
import com.mentalfrostbyte.jello.target.FriendManager;
import com.mentalfrostbyte.jello.unmapped.*;
import com.mentalfrostbyte.jello.util.FileUtil;
import com.mentalfrostbyte.jello.util.render.blur.BlurEngine;
import com.mentalfrostbyte.jello.util.tracker.PlayerStateTracker;
import com.mentalfrostbyte.jello.util.tracker.SlotChangeTracker;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import de.florianmichael.viamcp.ViaMCP;
import lol.Texture;
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
    public static int currentVersionIndex = 28;

    public static final String VERSION = "5.0.0b15";
    public static final boolean field28963 = false;
    private static final Minecraft mc = Minecraft.getInstance();
    public static String field28960 = "Jello";
    public static String field28962 = "Sigma Production";
    public static List<Texture> textureList = new ArrayList<Texture>();
    public static boolean dontRenderHand = false;
    private static Client instance;
    private File file = new File("sigma5");
    private JSONObject config;
    private boolean field28968 = true;
    private Logger logger;
    private EventManager eventManager;
    private ModuleManager moduleManager;
    private CommandManager commandManager;
    private GuiManager guiManager;
    private FriendManager friendManager;
    private CombatManager combatManager;
    private MusicManager musicManager;
    private PlayerStateTracker playerStateTracker;
    private AccountManager accountManager;
    private BlurEngine field28981;
    private CombatTracker field28982;
    private NetworkManager networkManager;
    private SoundManager soundManager;
    private NotificationManager notificationManager;
    private SlotChangeTracker slotChangeTracker;
    private WaypointsManager waypointsManager;
    private Class8795 field28989;
    private ClientMode clientMode = ClientMode.PREMIUM;
    private DiscordRichPresence discordRichPresence;

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
        Class8379.override();

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
        this.networkManager = new NetworkManager();
        this.networkManager.init();
        this.guiManager = new GuiManager();
        this.friendManager = new FriendManager();
        this.friendManager.init();
        this.combatManager = new CombatManager();
        this.combatManager.init();
        this.playerStateTracker = new PlayerStateTracker();
        this.playerStateTracker.init();
        this.slotChangeTracker = new SlotChangeTracker();
        this.slotChangeTracker.init();
        this.musicManager = new MusicManager();
        this.musicManager.init();
        this.soundManager = new SoundManager();
        this.soundManager.init();
        this.notificationManager = new NotificationManager();
        this.notificationManager.init();
        this.accountManager = new AccountManager();
        this.accountManager.registerEvents();
        this.waypointsManager = new WaypointsManager();
        this.waypointsManager.init();
        this.field28981 = new BlurEngine();
        this.field28981.init();
        this.field28989 = new Class8795();
        this.field28989.init();
        GLFW.glfwSetWindowTitle(mc.mainWindow.getHandle(), "Sigma 5.0");
        long var6 = System.currentTimeMillis();
        this.logger.info("Initialized.");
    }

    public void initRPC() {
        DiscordRPC var3 = DiscordRPC.INSTANCE;
        String var4 = "693493612754763907";
        String var5 = "";
        DiscordEventHandlers var6 = new DiscordEventHandlers();
        var6.ready = var0 -> System.out.println("Ready!");
        var3.Discord_Initialize(var4, var6, true, var5);
        discordRichPresence = new DiscordRichPresence();
        discordRichPresence.startTimestamp = System.currentTimeMillis() / 1000L;
        discordRichPresence.state = "Playing Minecraft";
        discordRichPresence.details = "Jello for Sigma";
        discordRichPresence.largeImageKey = "jello";
        var3.Discord_UpdatePresence(discordRichPresence);
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

            EventWritter var3 = new EventWritter(this.config);
            if (this.eventManager != null) {
                this.eventManager.call(var3);
            }

            FileUtil.save(var3.getFile(), new File(this.file + "/config.json"));
        } catch (IOException var4) {
            this.logger.error("Unable to shutdown correctly. Config may be corrupt?");
            var4.printStackTrace();
        }

        this.logger.info("Done.");
    }

    public void saveClientData() {
        try {
            FileUtil.save(this.config, new File(this.file + "/config.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void endTick() {
        this.guiManager.endTick();
    }

    public void method19926() {
        GL11.glPushMatrix();
        double var3 = mc.mainWindow.getGuiScaleFactor() / (double) ((float) Math.pow(mc.mainWindow.getGuiScaleFactor(), 2.0));
        GL11.glScaled(var3, var3, var3);
        GL11.glScaled(GuiManager.portalScaleFactor, GuiManager.portalScaleFactor, GuiManager.portalScaleFactor);
        GL11.glDisable(2912);
        RenderSystem.disableDepthTest();
        RenderSystem.translatef(0.0F, 0.0F, 1000.0F);
        RenderSystem.alphaFunc(519, 0.0F);
        RenderSystem.enableBlend();
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, DestFactor.field12932, GlStateManager.SourceFactor.ONE, DestFactor.field12936);
        getInstance().getEventManager().call(new EventRender2D());
        RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.enableCull();
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.alphaFunc(518, 0.1F);
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
            GL11.glScaled(GuiManager.portalScaleFactor, GuiManager.portalScaleFactor, 1.0);
            RenderSystem.disableDepthTest();
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0F, 0.0F, 1000.0F);
            this.guiManager.method33464();
            RenderSystem.popMatrix();
            RenderSystem.enableDepthTest();
            RenderSystem.enableAlphaTest();
            GL11.glAlphaFunc(518, 0.1F);
            TextureManager var10000 = mc.getTextureManager();
            mc.getTextureManager();
            var10000.bindTexture(TextureManager.field1094);
        }
    }

    public void hook3DRenderEvent() {
        if (mc != null && mc.world != null && mc.player != null && !dontRenderHand) {
            GL11.glTranslatef(0.0F, 0.0F, 0.0F);
            RenderSystem.disableDepthTest();
            RenderSystem.depthMask(false);
            GL11.glDisable(2896);
            this.eventManager.call(new Render3DEvent());
            RenderSystem.enableDepthTest();
            RenderSystem.depthMask(true);
            mc.getTextureManager().bindTexture(TextureManager.field1094);
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

    public GuiManager getGuiManager() {
        return this.guiManager;
    }

    public PlayerStateTracker getPlayerTracker() {
        return this.playerStateTracker;
    }

    public SlotChangeTracker getSlotChangeTracker() {
        return this.slotChangeTracker;
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

    public DiscordRichPresence getDRPC() {
        return this.discordRichPresence;
    }

    public void setupClient(ClientMode mode) {
        this.clientMode = mode;
        if (mode != ClientMode.CLASSIC) {
            if (mode == ClientMode.JELLO) {
                this.initRPC();
                GLFW.glfwSetWindowTitle(mc.mainWindow.getHandle(), "Jello for Sigma 5.0");
            }
        } else {
            getInstance().getGuiManager().method33452();
            GLFW.glfwSetWindowTitle(mc.mainWindow.getHandle(), "Classic Sigma 5.0");
        }

        if (this.moduleManager == null && RandomModuleThread.field8341 != null) {
            this.moduleManager = new ModuleManager();
            this.moduleManager.register(this.clientMode);
            this.moduleManager.method14659(this.config);
            this.moduleManager.saveCurrentConfigToJSON(this.config);
        }
       // System.gc();
    }
}
