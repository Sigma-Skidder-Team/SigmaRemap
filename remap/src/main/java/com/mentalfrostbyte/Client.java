// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte;

import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.auth.AgoraManager;
import com.mentalfrostbyte.jello.auth.NetworkManager;
import mapped.*;
import org.lwjgl.opengl.GL11;
import club.minnced.discord.rpc.DiscordRichPresence;
import club.minnced.discord.rpc.DiscordEventHandlers;
import club.minnced.discord.rpc.DiscordRPC;
import org.lwjgl.glfw.GLFW;
import slick2d.Texture;
import totalcross.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class Client {
    public static final String title = "Jello";
    public static final String version = "5.0.0b6";
    public static final String prod = "Sigma Production";
    public static final boolean field40681 = false;
    private static Client instance;
    private static Minecraft mc;
    private final File file;
    private JSONObject config;
    private boolean thing = true;
    private Logger logger;
    private TrustManager trustManager;
    private EventBus eventBus;
    private ModuleManager moduleManager;
    private CommandManager commandManager;
    private ScreenManager screenManager;
    private FriendManager friendManager;
    private BotManager botManager;
    private RotationManager rotationManager;
    private MusicManager musicManager;
    private TickManager tickManager;
    private AltManager altManager;
    private BlurManager blurManager;
    private IRCManager IRCManager;
    private NetworkManager networkManager;
    private AgoraManager agoraManager;
    private AudioManager audioManager;
    private NotificationManager notificationManager;
    private TimeManager timeManager;
    private WaypointManager waypointManager;
    private MovementManager movementManager;
    private ViaManager viaManager;
    private ClientMode clientMode;
    public static ArrayList<Texture> textureList;
    public static boolean renderHand;

    public static Client getInstance() {
        return (Client.instance != null) ? Client.instance : (Client.instance = new Client());
    }

    public static Logger getLogger2() {
        return getInstance().getLogger();
    }

    private Client() {
        this.file = new File("sigma5");
        this.thing = true;
        this.clientMode = ClientMode.INDETERMINATE;
    }

    public void method35175() {
        System.currentTimeMillis();
        AESFixer.enableUnlimitedAESKeyStrength();
        (this.logger = new CustomLogger(System.out, System.out, System.err)).info("Initializing...");
        try {
            if (!this.file.exists()) {
                this.file.mkdirs();
            }
            this.config = ConfigJsonUtil.method35586(new File(this.file + "/config.json"));
        } catch (final IOException ex) {
            ex.printStackTrace();
        }
        this.trustManager = TrustManager.method29718();
        this.eventBus = new EventBus();
        (this.commandManager = new CommandManager()).method32666();
        ClientAssets.decryptTextures();
        (this.networkManager = new NetworkManager()).init();
        (this.agoraManager = new AgoraManager()).connect();
        this.screenManager = new ScreenManager();
        (this.friendManager = new FriendManager()).method29876();
        (this.botManager = new BotManager()).method31750();
        (this.rotationManager = new RotationManager()).method28365();
        (this.tickManager = new TickManager()).method29223();
        (this.timeManager = new TimeManager()).init();
        (this.musicManager = new MusicManager()).method24158();
        (this.audioManager = new AudioManager()).method32831();
        (this.notificationManager = new NotificationManager()).method25783();
        (this.altManager = new AltManager()).method25457();
        (this.waypointManager = new WaypointManager()).method24261();
        (this.blurManager = new BlurManager()).method29895();
        (this.movementManager = new MovementManager()).method26554();
        GLFW.glfwSetWindowTitle(Client.mc.window.getHandle(), "Sigma 5.0");
        System.currentTimeMillis();
        this.logger.info("Initialized.");
    }

    public void initRPC() {
        final DiscordRPC instance = DiscordRPC.INSTANCE;
        final String s = "693493612754763907";
        final String s2 = "";
        final DiscordEventHandlers discordEventHandlers = new DiscordEventHandlers();
        discordEventHandlers.ready = (p0 -> System.out.println("Ready!"));
        instance.Discord_Initialize(s, discordEventHandlers, true, s2);
        final DiscordRichPresence discordRichPresence = new DiscordRichPresence();
        discordRichPresence.startTimestamp = System.currentTimeMillis() / 1000L;
        discordRichPresence.state = "Playing Minecraft";
        discordRichPresence.details = "Jello for Sigma";
        discordRichPresence.largeImageKey = "jello";
        instance.Discord_UpdatePresence(discordRichPresence);
        new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                discordRPC.Discord_RunCallbacks();
                try {
                    Thread.sleep(2000L);
                    if (getInstance().getNetworkManager().isPremium() && (discordRichPresence2.smallImageKey == null || discordRichPresence2.smallImageKey.equals("premium"))) {
                        discordRichPresence2.smallImageKey = "premium";
                        discordRichPresence2.smallImageText = "Premium";
                        discordRPC.Discord_UpdatePresence(discordRichPresence2);
                    }
                } catch (final InterruptedException ex) {
                }
            }
        }, "RPC-Callback-Handler").start();
    }

    public void shutdown() {
        this.logger.info("Shutting down...");
        try {
            if (this.screenManager != null) {
                this.screenManager.method32142(this.config);
            }
            if (this.moduleManager != null) {
                this.moduleManager.saveModProfiles(this.config);
            }
            final EventWriter eventWriter = new EventWriter(this.config);
            if (this.eventBus != null) {
                this.eventBus.post(eventWriter);
            }
            ConfigJsonUtil.saveJSONToFile(eventWriter.method17022(), new File(this.file + "/config.json"));
        } catch (final IOException ex) {
            this.logger.error("Unable to shutdown correctly. Config may be corrupt?");
            ex.printStackTrace();
        }
        this.logger.info("Done.");
    }

    public void method35179() {
        try {
            ConfigJsonUtil.saveJSONToFile(this.config, new File(this.file + "/config.json"));
        } catch (final IOException ex) {
            ex.printStackTrace();
        }
    }

    public void method35180() {
        this.screenManager.method32134();
    }

    public void hookCustom2DRenderEvent() {
        GL11.glPushMatrix();
        final double n = Client.mc.window.getGuiScaleFactor() / (float) Math.pow(Client.mc.window.getGuiScaleFactor(), 2.0);
        GL11.glScaled(n, n, n);
        GL11.glScaled(ScreenManager.guiScale, ScreenManager.guiScale, ScreenManager.guiScale);
        GL11.glDisable(2912);
        RenderSystem.disableDepthTest();
        RenderSystem.translatef(0.0f, 0.0f, 1000.0f);
        RenderSystem.method30000(519, 0.0f);
        RenderSystem.enableBlend();
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.glDisable(2896);
        RenderSystem.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        ClientAssets.gingerbread.bind();
        getInstance().getEventBus().post(new Custom2DRenderEvent());
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.method30028();
        RenderSystem.disableDepthTest();
        RenderSystem.enableBlend();
        RenderSystem.method30000(518, 0.1f);
        GL11.glPopMatrix();
    }

    public void addTexture(final Texture e) {
        Client.textureList.add(e);
    }

    public void hookHUD() {
        if (!Client.textureList.isEmpty()) {
            for (Texture texture : Client.textureList) {
                texture.release();
            }
            Client.textureList.clear();
        }
        if (getInstance().getClientMode() != ClientMode.NOADDONS) {
            final double n = Client.mc.window.getGuiScaleFactor() / (float) Math.pow(Client.mc.window.getGuiScaleFactor(), 2.0);
            GL11.glScaled(n, n, 1.0);
            GL11.glScaled(ScreenManager.guiScale, ScreenManager.guiScale, 1.0);
            RenderSystem.disableDepthTest();
            RenderSystem.pushMatrix();
            RenderSystem.translatef(0.0f, 0.0f, 1000.0f);
            this.screenManager.renderWatermark();
            RenderSystem.popMatrix();
            RenderSystem.enableDepthTest();
            RenderSystem.enableAlphaTest();
            GL11.glAlphaFunc(518, 0.1f);
            Client.mc.method5290().method5849(Class1663.field9428);
        }
    }

    public void hookCustom3DRenderEvent() {
        if (Client.mc != null) {
            if (Client.mc.world != null) {
                if (Client.mc.player != null) {
                    if (!Client.renderHand) {
                        GL11.glTranslatef(0.0f, 0.0f, 0.0f);
                        RenderSystem.disableDepthTest();
                        RenderSystem.method30010(false);
                        GL11.glDisable(2896);
                        this.eventBus.post(new Custom3DRenderEvent());
                        RenderSystem.enableDepthTest();
                        RenderSystem.method30010(true);
                        final Class1663 method5290 = Client.mc.method5290();
                        Client.mc.method5290();
                        method5290.method5849(Class1663.field9428);
                    }
                }
            }
        }
    }

    public Logger getLogger() {
        return this.logger;
    }

    public EventBus getEventBus() {
        return this.eventBus;
    }

    public ModuleManager moduleManager() {
        return this.moduleManager;
    }

    public FriendManager getFriendManager() {
        return this.friendManager;
    }

    public BotManager getBotManager() {
        return this.botManager;
    }

    public RotationManager getRotationManager() {
        return this.rotationManager;
    }

    public ScreenManager getScreenManager() {
        return this.screenManager;
    }

    public TickManager getTickManager() {
        return this.tickManager;
    }

    public TimeManager getTimeManager() {
        return this.timeManager;
    }

    public AudioManager getAudioManager() {
        return this.audioManager;
    }

    public NotificationManager getNotificationManager() {
        return this.notificationManager;
    }

    public AltManager getAltManager() {
        return this.altManager;
    }

    public MusicManager getMusicManager() {
        return this.musicManager;
    }

    public WaypointManager getWaypointManager() {
        return this.waypointManager;
    }

    public NetworkManager getNetworkManager() {
        return this.networkManager;
    }

    public TrustManager getTrustManager() {
        return this.trustManager;
    }

    public AgoraManager getAgoraManager() {
        return this.agoraManager;
    }

    public CommandManager getCommandManager() {
        return this.commandManager;
    }

    public MovementManager getMovementManager() {
        return this.movementManager;
    }

    public JSONObject getConfig() {
        return this.config;
    }

    public void resetConfig() {
        this.config = new JSONObject();
    }

    public File getFile() {
        return this.file;
    }

    public ClientMode getClientMode() {
        return this.clientMode;
    }

    public void setupClient(final ClientMode mode) {
        this.clientMode = mode;
        if (mode != ClientMode.CLASSIC) {
            if (mode == ClientMode.JELLO) {
                this.initRPC();
                GLFW.glfwSetWindowTitle(Client.mc.window.getHandle(), "Classic Sigma 5.0");
            }
        } else {
            ClassicAssets.initClassicAssets();
            getInstance().getScreenManager().putClassicScreens();
            GLFW.glfwSetWindowTitle(Client.mc.window.getHandle(), "Jello for Sigma 5.0");
        }
        if (this.moduleManager == null) {
            if (ModuleSettingInitializr.thread != null) {
                (this.moduleManager = new ModuleManager()).register(this.clientMode);
                this.moduleManager.loadModProfiles(this.config);
            }
        }
        System.gc();
    }

    static {
        Client.mc = Minecraft.getInstance();
        Client.textureList = new ArrayList<>();
        Client.renderHand = false;
    }
}
