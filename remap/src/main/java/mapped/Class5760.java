// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.LinkedHashSet;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.util.Collection;
import com.google.common.collect.ImmutableSet;

import java.io.PrintWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.io.BufferedReader;
import com.google.common.io.Files;
import com.google.common.base.Charsets;
import org.apache.commons.lang3.ArrayUtils;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import java.io.File;
import java.util.Map;
import java.util.Set;
import java.util.List;
import com.google.common.base.Splitter;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import org.apache.logging.log4j.Logger;

public class Class5760
{
    private static final Logger field23377;
    private static final Gson field23378;
    private static final Type field23379;
    private static final Splitter field23380;
    public double field23381;
    public int field23382;
    public int field23383;
    public Class2202 field23384;
    public boolean field23385;
    public Class2007 field23386;
    public List<String> field23387;
    public List<String> field23388;
    public Class2047 field23389;
    public double field23390;
    public double field23391;
    public String field23392;
    public boolean field23393;
    public boolean field23394;
    public boolean field23395;
    private final Set<Class189> field23396;
    public Class2226 field23397;
    public int field23398;
    public int field23399;
    public boolean field23400;
    public double field23401;
    public double field23402;
    public double field23403;
    public double field23404;
    public int field23405;
    private final Map<Class286, Float> field23406;
    public boolean field23407;
    public Class323 field23408;
    public Class2012 field23409;
    public int field23410;
    public double field23411;
    public boolean field23412;
    public int field23413;
    public boolean field23414;
    public boolean field23415;
    public boolean field23416;
    public boolean field23417;
    public boolean field23418;
    public boolean field23419;
    public boolean field23420;
    public boolean field23421;
    public boolean field23422;
    public boolean field23423;
    public boolean field23424;
    public boolean field23425;
    public boolean field23426;
    public boolean field23427;
    public boolean field23428;
    public boolean field23429;
    public boolean field23430;
    public boolean field23431;
    public boolean field23432;
    public boolean field23433;
    public boolean field23434;
    public final Class350 field23435;
    public final Class350 field23436;
    public final Class350 field23437;
    public final Class350 field23438;
    public final Class350 field23439;
    public final Class350 field23440;
    public final Class350 field23441;
    public final Class350 field23442;
    public final Class350 field23443;
    public final Class350 field23444;
    public final Class350 field23445;
    public final Class350 field23446;
    public final Class350 field23447;
    public final Class350 field23448;
    public final Class350 field23449;
    public final Class350 field23450;
    public final Class350 field23451;
    public final Class350 field23452;
    public final Class350 field23453;
    public final Class350 field23454;
    public final Class350 field23455;
    public final Class350 field23456;
    public final Class350[] field23457;
    public final Class350 field23458;
    public final Class350 field23459;
    public Class350[] field23460;
    public Class869 field23461;
    private final File field23462;
    public Class2113 field23463;
    public boolean field23464;
    public int field23465;
    public boolean field23466;
    public boolean field23467;
    public boolean field23468;
    public String field23469;
    public boolean field23470;
    public double field23471;
    public double field23472;
    public int field23473;
    public Class2159 field23474;
    public Class2051 field23475;
    public String field23476;
    public int field23477;
    public float field23478;
    public int field23479;
    public boolean field23480;
    public boolean field23481;
    public boolean field23482;
    public boolean field23483;
    public boolean field23484;
    public boolean field23485;
    public double field23486;
    public int field23487;
    public int field23488;
    public int field23489;
    public double field23490;
    public int field23491;
    public int field23492;
    public int field23493;
    public int field23494;
    public int field23495;
    public boolean field23496;
    public boolean field23497;
    public boolean field23498;
    public boolean field23499;
    public boolean field23500;
    public boolean field23501;
    public boolean field23502;
    public int field23503;
    public int field23504;
    public boolean field23505;
    public int field23506;
    public boolean field23507;
    public boolean field23508;
    public boolean field23509;
    public boolean field23510;
    public boolean field23511;
    public boolean field23512;
    public boolean field23513;
    public int field23514;
    public boolean field23515;
    public boolean field23516;
    public boolean field23517;
    public boolean field23518;
    public boolean field23519;
    public int field23520;
    public boolean field23521;
    public boolean field23522;
    public int field23523;
    public boolean field23524;
    public boolean field23525;
    public boolean field23526;
    public int field23527;
    public int field23528;
    public boolean field23529;
    public int field23530;
    public int field23531;
    public boolean field23532;
    public boolean field23533;
    public boolean field23534;
    public boolean field23535;
    public boolean field23536;
    public boolean field23537;
    public boolean field23538;
    public boolean field23539;
    public boolean field23540;
    public boolean field23541;
    public boolean field23542;
    public boolean field23543;
    public boolean field23544;
    public boolean field23545;
    public boolean field23546;
    public boolean field23547;
    public boolean field23548;
    public static final int field23549 = 0;
    public static final int field23550 = 1;
    public static final int field23551 = 2;
    public static final int field23552 = 3;
    public static final int field23553 = 4;
    public static final int field23554 = 5;
    public static final int field23555 = 0;
    public static final int field23556 = 1;
    public static final int field23557 = 2;
    public static final String field23558 = "Default";
    public static final double field23559 = 4.0571431;
    private static final int[] field23560;
    private static final int[] field23561;
    private static final String[] field23562;
    public Class350 field23563;
    private File field23564;
    
    public Class5760(final Class869 field23461, final File file) {
        this.field23381 = 0.5;
        this.field23382 = -1;
        this.field23383 = 120;
        this.field23384 = Class2202.field13407;
        this.field23385 = true;
        this.field23386 = Class2007.field11400;
        this.field23387 = Lists.newArrayList();
        this.field23388 = Lists.newArrayList();
        this.field23389 = Class2047.field11661;
        this.field23390 = 1.0;
        this.field23391 = 0.5;
        this.field23395 = true;
        this.field23396 = Sets.newHashSet((Object[])Class189.values());
        this.field23397 = Class2226.field13698;
        this.field23400 = true;
        this.field23401 = 1.0;
        this.field23402 = 1.0;
        this.field23403 = 0.44366195797920227;
        this.field23404 = 1.0;
        this.field23405 = 4;
        this.field23406 = Maps.newEnumMap((Class)Class286.class);
        this.field23407 = true;
        this.field23408 = Class323.field1926;
        this.field23409 = Class2012.field11439;
        this.field23410 = 2;
        this.field23411 = 1.0;
        this.field23412 = true;
        this.field23413 = 1;
        this.field23414 = true;
        this.field23415 = true;
        this.field23416 = true;
        this.field23417 = true;
        this.field23418 = true;
        this.field23419 = true;
        this.field23420 = true;
        this.field23424 = true;
        this.field23426 = true;
        this.field23428 = true;
        this.field23431 = true;
        this.field23435 = new Class350("key.forward", 87, "key.categories.movement");
        this.field23436 = new Class350("key.left", 65, "key.categories.movement");
        this.field23437 = new Class350("key.back", 83, "key.categories.movement");
        this.field23438 = new Class350("key.right", 68, "key.categories.movement");
        this.field23439 = new Class350("key.jump", 32, "key.categories.movement");
        this.field23440 = new Class351("key.sneak", 340, "key.categories.movement", () -> this.field23432);
        this.field23441 = new Class351("key.sprint", 341, "key.categories.movement", () -> this.field23433);
        this.field23442 = new Class350("key.inventory", 69, "key.categories.inventory");
        this.field23443 = new Class350("key.swapHands", 70, "key.categories.inventory");
        this.field23444 = new Class350("key.drop", 81, "key.categories.inventory");
        this.field23445 = new Class350("key.use", Class2136.field12469, 1, "key.categories.gameplay");
        this.field23446 = new Class350("key.attack", Class2136.field12469, 0, "key.categories.gameplay");
        this.field23447 = new Class350("key.pickItem", Class2136.field12469, 2, "key.categories.gameplay");
        this.field23448 = new Class350("key.chat", 84, "key.categories.multiplayer");
        this.field23449 = new Class350("key.playerlist", 258, "key.categories.multiplayer");
        this.field23450 = new Class350("key.command", 47, "key.categories.multiplayer");
        this.field23451 = new Class350("key.screenshot", 291, "key.categories.misc");
        this.field23452 = new Class350("key.togglePerspective", 294, "key.categories.misc");
        this.field23453 = new Class350("key.smoothCamera", Class8341.field34248.method26047(), "key.categories.misc");
        this.field23454 = new Class350("key.fullscreen", 300, "key.categories.misc");
        this.field23455 = new Class350("key.spectatorOutlines", Class8341.field34248.method26047(), "key.categories.misc");
        this.field23456 = new Class350("key.advancements", 76, "key.categories.misc");
        this.field23457 = new Class350[] { new Class350("key.hotbar.1", 49, "key.categories.inventory"), new Class350("key.hotbar.2", 50, "key.categories.inventory"), new Class350("key.hotbar.3", 51, "key.categories.inventory"), new Class350("key.hotbar.4", 52, "key.categories.inventory"), new Class350("key.hotbar.5", 53, "key.categories.inventory"), new Class350("key.hotbar.6", 54, "key.categories.inventory"), new Class350("key.hotbar.7", 55, "key.categories.inventory"), new Class350("key.hotbar.8", 56, "key.categories.inventory"), new Class350("key.hotbar.9", 57, "key.categories.inventory") };
        this.field23458 = new Class350("key.saveToolbarActivator", 67, "key.categories.creative");
        this.field23459 = new Class350("key.loadToolbarActivator", 88, "key.categories.creative");
        this.field23460 = (Class350[])ArrayUtils.addAll((Object[])new Class350[] { this.field23446, this.field23445, this.field23435, this.field23436, this.field23437, this.field23438, this.field23439, this.field23440, this.field23441, this.field23444, this.field23442, this.field23448, this.field23449, this.field23447, this.field23450, this.field23451, this.field23452, this.field23453, this.field23454, this.field23455, this.field23443, this.field23458, this.field23459, this.field23456 }, (Object[])this.field23457);
        this.field23463 = Class2113.field12292;
        this.field23469 = "";
        this.field23471 = 70.0;
        this.field23474 = Class2159.field12819;
        this.field23475 = Class2051.field11699;
        this.field23476 = "en_us";
        this.field23477 = 1;
        this.field23478 = 0.8f;
        this.field23479 = 0;
        this.field23480 = false;
        this.field23481 = false;
        this.field23482 = Config.method28971();
        this.field23483 = Config.method28971();
        this.field23484 = false;
        this.field23485 = false;
        this.field23486 = 1.0;
        this.field23487 = 0;
        this.field23488 = 1;
        this.field23489 = 0;
        this.field23490 = 0.0;
        this.field23491 = 0;
        this.field23492 = 0;
        this.field23493 = 0;
        this.field23494 = 3;
        this.field23495 = 4000;
        this.field23496 = false;
        this.field23497 = false;
        this.field23498 = false;
        this.field23499 = true;
        this.field23500 = true;
        this.field23501 = true;
        this.field23502 = true;
        this.field23503 = 0;
        this.field23504 = 1;
        this.field23505 = false;
        this.field23506 = 0;
        this.field23507 = false;
        this.field23508 = true;
        this.field23509 = true;
        this.field23510 = true;
        this.field23511 = true;
        this.field23512 = true;
        this.field23513 = true;
        this.field23514 = 2;
        this.field23515 = true;
        this.field23516 = false;
        this.field23517 = true;
        this.field23518 = false;
        this.field23519 = false;
        this.field23520 = 0;
        this.field23521 = true;
        this.field23522 = true;
        this.field23523 = 3;
        this.field23524 = true;
        this.field23525 = true;
        this.field23526 = true;
        this.field23527 = 1;
        this.field23528 = 0;
        this.field23529 = true;
        this.field23530 = 0;
        this.field23531 = 0;
        this.field23532 = true;
        this.field23533 = true;
        this.field23534 = true;
        this.field23535 = true;
        this.field23536 = true;
        this.field23537 = true;
        this.field23538 = true;
        this.field23539 = true;
        this.field23540 = true;
        this.field23541 = true;
        this.field23542 = true;
        this.field23543 = true;
        this.field23544 = true;
        this.field23545 = true;
        this.field23546 = true;
        this.field23547 = true;
        this.field23548 = true;
        this.method17145();
        this.field23461 = field23461;
        this.field23462 = new File(file, "options.txt");
        if (field23461.method5297() && Runtime.getRuntime().maxMemory() >= 1000000000L) {
            Class6469.field25717.method19474(32.0f);
            final long n = 1000000L;
            if (Runtime.getRuntime().maxMemory() >= 1500L * n) {
                Class6469.field25717.method19474(48.0f);
            }
            if (Runtime.getRuntime().maxMemory() >= 2500L * n) {
                Class6469.field25717.method19474(64.0f);
            }
        }
        else {
            Class6469.field25717.method19474(16.0f);
        }
        this.field23382 = (field23461.method5297() ? 12 : 8);
        this.field23564 = new File(file, "optionsof.txt");
        this.field23383 = (int)Class6469.field25712.method19473();
        this.field23563 = new Class350("of.key.zoom", 67, "key.categories.misc");
        Class9079.method32717(this.field23460 = (Class350[])ArrayUtils.add((Object[])this.field23460, (Object)this.field23563), new Class350[] { this.field23563 });
        this.field23382 = 8;
        this.method17118();
        Config.method28816(this);
    }
    
    public float method17114(final float n) {
        return this.field23428 ? n : ((float)this.field23391);
    }
    
    public int method17115(final float n) {
        return (int)(this.method17114(n) * 255.0f) << 24 & 0xFF000000;
    }
    
    public int method17116(final int n) {
        return this.field23428 ? n : ((int)(this.field23391 * 255.0) << 24 & 0xFF000000);
    }
    
    public void method17117(final Class350 class350, final Class7985 class351) {
        class350.method1062(class351);
        this.method17121();
    }
    
    public void method17118() {
        try {
            if (!this.field23462.exists()) {
                return;
            }
            this.field23406.clear();
            final Class51 class51 = new Class51();
            try (final BufferedReader reader = Files.newReader(this.field23462, Charsets.UTF_8)) {
                reader.lines().forEach(s2 -> {
                    try {
                        Class5760.field23380.split((CharSequence)s2).iterator();
                        final Iterator iterator2;
                        class55.method306(iterator2.next(), iterator2.next());
                    }
                    catch (final Exception ex3) {
                        Class5760.field23377.warn("Skipping bad option: {}", (Object)s2);
                    }
                    return;
                });
            }
            final Class51 method17119 = this.method17119(class51);
            for (final String s : method17119.method293()) {
                final String method17120 = method17119.method323(s);
                try {
                    if ("autoJump".equals(s)) {
                        Class6469.field25730.method19358(this, method17120);
                    }
                    if ("autoSuggestions".equals(s)) {
                        Class6469.field25731.method19358(this, method17120);
                    }
                    if ("chatColors".equals(s)) {
                        Class6469.field25732.method19358(this, method17120);
                    }
                    if ("chatLinks".equals(s)) {
                        Class6469.field25733.method19358(this, method17120);
                    }
                    if ("chatLinksPrompt".equals(s)) {
                        Class6469.field25734.method19358(this, method17120);
                    }
                    if ("enableVsync".equals(s)) {
                        Class6469.field25736.method19358(this, method17120);
                        if (this.field23419) {
                            this.field23383 = (int)Class6469.field25712.method19473();
                        }
                        this.method17138();
                    }
                    if ("entityShadows".equals(s)) {
                        Class6469.field25737.method19358(this, method17120);
                    }
                    if ("forceUnicodeFont".equals(s)) {
                        Class6469.field25738.method19358(this, method17120);
                    }
                    if ("discrete_mouse_scroll".equals(s)) {
                        Class6469.field25735.method19358(this, method17120);
                    }
                    if ("invertYMouse".equals(s)) {
                        Class6469.field25739.method19358(this, method17120);
                    }
                    if ("realmsNotifications".equals(s)) {
                        Class6469.field25740.method19358(this, method17120);
                    }
                    if ("reducedDebugInfo".equals(s)) {
                        Class6469.field25741.method19358(this, method17120);
                    }
                    if ("showSubtitles".equals(s)) {
                        Class6469.field25742.method19358(this, method17120);
                    }
                    if ("snooperEnabled".equals(s)) {
                        Class6469.field25743.method19358(this, method17120);
                    }
                    if ("touchscreen".equals(s)) {
                        Class6469.field25746.method19358(this, method17120);
                    }
                    if ("fullscreen".equals(s)) {
                        Class6469.field25747.method19358(this, method17120);
                    }
                    if ("bobView".equals(s)) {
                        Class6469.field25748.method19358(this, method17120);
                    }
                    if ("toggleCrouch".equals(s)) {
                        this.field23432 = "true".equals(method17120);
                    }
                    if ("toggleSprint".equals(s)) {
                        this.field23433 = "true".equals(method17120);
                    }
                    if ("mouseSensitivity".equals(s)) {
                        this.field23381 = method17120(method17120);
                    }
                    if ("fov".equals(s)) {
                        this.field23471 = method17120(method17120) * 40.0f + 70.0f;
                    }
                    if ("gamma".equals(s)) {
                        this.field23472 = method17120(method17120);
                    }
                    if ("renderDistance".equals(s)) {
                        this.field23382 = Integer.parseInt(method17120);
                    }
                    if ("guiScale".equals(s)) {
                        this.field23473 = Integer.parseInt(method17120);
                    }
                    if ("particles".equals(s)) {
                        this.field23474 = Class2159.method8327(Integer.parseInt(method17120));
                    }
                    if ("maxFps".equals(s)) {
                        this.field23383 = Integer.parseInt(method17120);
                        if (this.field23419) {
                            this.field23383 = (int)Class6469.field25712.method19473();
                        }
                        if (this.field23383 <= 0) {
                            this.field23383 = (int)Class6469.field25712.method19473();
                        }
                        if (this.field23461.method5332() != null) {
                            this.field23461.method5332().method7678(this.field23383);
                        }
                    }
                    if ("difficulty".equals(s)) {
                        this.field23463 = Class2113.method8237(Integer.parseInt(method17120));
                    }
                    if ("fancyGraphics".equals(s)) {
                        this.field23385 = "true".equals(method17120);
                        this.method17136();
                    }
                    if ("tutorialStep".equals(s)) {
                        this.field23409 = Class2012.method8054(method17120);
                    }
                    if ("ao".equals(s)) {
                        if ("true".equals(method17120)) {
                            this.field23386 = Class2007.field11400;
                        }
                        else if ("false".equals(method17120)) {
                            this.field23386 = Class2007.field11398;
                        }
                        else {
                            this.field23386 = Class2007.method8041(Integer.parseInt(method17120));
                        }
                    }
                    if ("renderClouds".equals(s)) {
                        if ("true".equals(method17120)) {
                            this.field23384 = Class2202.field13407;
                        }
                        else if ("false".equals(method17120)) {
                            this.field23384 = Class2202.field13405;
                        }
                        else if ("fast".equals(method17120)) {
                            this.field23384 = Class2202.field13406;
                        }
                    }
                    if ("attackIndicator".equals(s)) {
                        this.field23408 = Class323.method996(Integer.parseInt(method17120));
                    }
                    if ("resourcePacks".equals(s)) {
                        this.field23387 = (List<String>)Class9583.method35927(Class5760.field23378, method17120, Class5760.field23379);
                        if (this.field23387 == null) {
                            this.field23387 = Lists.newArrayList();
                        }
                    }
                    if ("incompatibleResourcePacks".equals(s)) {
                        this.field23388 = (List<String>)Class9583.method35927(Class5760.field23378, method17120, Class5760.field23379);
                        if (this.field23388 == null) {
                            this.field23388 = Lists.newArrayList();
                        }
                    }
                    if ("lastServer".equals(s)) {
                        this.field23469 = method17120;
                    }
                    if ("lang".equals(s)) {
                        this.field23476 = method17120;
                    }
                    if ("chatVisibility".equals(s)) {
                        this.field23389 = Class2047.method8134(Integer.parseInt(method17120));
                    }
                    if ("chatOpacity".equals(s)) {
                        this.field23390 = method17120(method17120);
                    }
                    if ("textBackgroundOpacity".equals(s)) {
                        this.field23391 = method17120(method17120);
                    }
                    if ("backgroundForChatOnly".equals(s)) {
                        this.field23428 = "true".equals(method17120);
                    }
                    if ("fullscreenResolution".equals(s)) {
                        this.field23392 = method17120;
                    }
                    if ("hideServerAddress".equals(s)) {
                        this.field23393 = "true".equals(method17120);
                    }
                    if ("advancedItemTooltips".equals(s)) {
                        this.field23394 = "true".equals(method17120);
                    }
                    if ("pauseOnLostFocus".equals(s)) {
                        this.field23395 = "true".equals(method17120);
                    }
                    if ("overrideHeight".equals(s)) {
                        this.field23399 = Integer.parseInt(method17120);
                    }
                    if ("overrideWidth".equals(s)) {
                        this.field23398 = Integer.parseInt(method17120);
                    }
                    if ("heldItemTooltips".equals(s)) {
                        this.field23400 = "true".equals(method17120);
                    }
                    if ("chatHeightFocused".equals(s)) {
                        this.field23404 = method17120(method17120);
                    }
                    if ("chatHeightUnfocused".equals(s)) {
                        this.field23403 = method17120(method17120);
                    }
                    if ("chatScale".equals(s)) {
                        this.field23401 = method17120(method17120);
                    }
                    if ("chatWidth".equals(s)) {
                        this.field23402 = method17120(method17120);
                    }
                    if ("mipmapLevels".equals(s)) {
                        this.field23405 = Integer.parseInt(method17120);
                    }
                    if ("useNativeTransport".equals(s)) {
                        this.field23407 = "true".equals(method17120);
                    }
                    if ("mainHand".equals(s)) {
                        this.field23397 = ("left".equals(method17120) ? Class2226.field13697 : Class2226.field13698);
                    }
                    if ("narrator".equals(s)) {
                        this.field23475 = Class2051.method8139(Integer.parseInt(method17120));
                    }
                    if ("biomeBlendRadius".equals(s)) {
                        this.field23410 = Integer.parseInt(method17120);
                    }
                    if ("mouseWheelSensitivity".equals(s)) {
                        this.field23411 = method17120(method17120);
                    }
                    if ("rawMouseInput".equals(s)) {
                        this.field23412 = "true".equals(method17120);
                    }
                    if ("glDebugVerbosity".equals(s)) {
                        this.field23413 = Integer.parseInt(method17120);
                    }
                    if ("skipMultiplayerWarning".equals(s)) {
                        this.field23434 = "true".equals(method17120);
                    }
                    for (final Class350 class52 : this.field23460) {
                        if (s.equals("key_" + class52.method1060())) {
                            if (Class9570.field41374.method22605()) {
                                if (method17120.indexOf(58) != -1) {
                                    final String[] split = method17120.split(":");
                                    Class9570.method35826(class52, Class9570.field41346, Class9570.method35818(Class9570.field41374, split[1]), Class8341.method27797(split[0]));
                                }
                                else {
                                    Class9570.method35826(class52, Class9570.field41346, Class9570.method35827(Class9570.field41375), Class8341.method27797(method17120));
                                }
                            }
                            else {
                                class52.method1062(Class8341.method27797(method17120));
                            }
                        }
                    }
                    for (final Class286 class53 : Class286.values()) {
                        if (s.equals("soundCategory_" + class53.method935())) {
                            this.field23406.put(class53, method17120(method17120));
                        }
                    }
                    for (final Class189 class54 : Class189.values()) {
                        if (s.equals("modelPart_" + class54.method829())) {
                            this.method17126(class54, "true".equals(method17120));
                        }
                    }
                }
                catch (final Exception ex) {
                    Class5760.field23377.warn("Skipping bad option: {}:{}", (Object)s, (Object)method17120);
                    ex.printStackTrace();
                }
            }
            Class350.method1055();
        }
        catch (final Exception ex2) {
            Class5760.field23377.error("Failed to load options", (Throwable)ex2);
        }
        this.method17134();
    }
    
    private Class51 method17119(final Class51 class51) {
        int int1 = 0;
        try {
            int1 = Integer.parseInt(class51.method323("version"));
        }
        catch (final RuntimeException ex) {}
        return Class9346.method34651(this.field23461.method5313(), Class1959.field10679, class51, int1);
    }
    
    private static float method17120(final String s) {
        if ("true".equals(s)) {
            return 1.0f;
        }
        return "false".equals(s) ? 0.0f : Float.parseFloat(s);
    }
    
    public void method17121() {
        if (Class9570.field41187.method22605()) {
            if (Class9570.method35812(Class9570.field41187, new Object[0])) {
                return;
            }
        }
        try (final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.field23462), StandardCharsets.UTF_8))) {
            printWriter.println("version:" + Class9528.method35579().getWorldVersion());
            printWriter.println("autoJump:" + Class6469.field25730.method19361(this));
            printWriter.println("autoSuggestions:" + Class6469.field25731.method19361(this));
            printWriter.println("chatColors:" + Class6469.field25732.method19361(this));
            printWriter.println("chatLinks:" + Class6469.field25733.method19361(this));
            printWriter.println("chatLinksPrompt:" + Class6469.field25734.method19361(this));
            printWriter.println("enableVsync:" + Class6469.field25736.method19361(this));
            printWriter.println("entityShadows:" + Class6469.field25737.method19361(this));
            printWriter.println("forceUnicodeFont:" + Class6469.field25738.method19361(this));
            printWriter.println("discrete_mouse_scroll:" + Class6469.field25735.method19361(this));
            printWriter.println("invertYMouse:" + Class6469.field25739.method19361(this));
            printWriter.println("realmsNotifications:" + Class6469.field25740.method19361(this));
            printWriter.println("reducedDebugInfo:" + Class6469.field25741.method19361(this));
            printWriter.println("snooperEnabled:" + Class6469.field25743.method19361(this));
            printWriter.println("showSubtitles:" + Class6469.field25742.method19361(this));
            printWriter.println("touchscreen:" + Class6469.field25746.method19361(this));
            printWriter.println("fullscreen:" + Class6469.field25747.method19361(this));
            printWriter.println("bobView:" + Class6469.field25748.method19361(this));
            printWriter.println("toggleCrouch:" + this.field23432);
            printWriter.println("toggleSprint:" + this.field23433);
            printWriter.println("mouseSensitivity:" + this.field23381);
            printWriter.println("fov:" + (this.field23471 - 70.0) / 40.0);
            printWriter.println("gamma:" + this.field23472);
            printWriter.println("renderDistance:" + this.field23382);
            printWriter.println("guiScale:" + this.field23473);
            printWriter.println("particles:" + this.field23474.method8326());
            printWriter.println("maxFps:" + this.field23383);
            printWriter.println("difficulty:" + this.field23463.method8235());
            printWriter.println("fancyGraphics:" + this.field23385);
            printWriter.println("ao:" + this.field23386.method8039());
            printWriter.println("biomeBlendRadius:" + this.field23410);
            switch (Class8555.field35933[this.field23384.ordinal()]) {
                case 1: {
                    printWriter.println("renderClouds:true");
                    break;
                }
                case 2: {
                    printWriter.println("renderClouds:fast");
                    break;
                }
                case 3: {
                    printWriter.println("renderClouds:false");
                    break;
                }
            }
            printWriter.println("resourcePacks:" + Class5760.field23378.toJson((Object)this.field23387));
            printWriter.println("incompatibleResourcePacks:" + Class5760.field23378.toJson((Object)this.field23388));
            printWriter.println("lastServer:" + this.field23469);
            printWriter.println("lang:" + this.field23476);
            printWriter.println("chatVisibility:" + this.field23389.method8132());
            printWriter.println("chatOpacity:" + this.field23390);
            printWriter.println("textBackgroundOpacity:" + this.field23391);
            printWriter.println("backgroundForChatOnly:" + this.field23428);
            if (this.field23461.method5332().method7681().isPresent()) {
                printWriter.println("fullscreenResolution:" + this.field23461.method5332().method7681().get().method29726());
            }
            printWriter.println("hideServerAddress:" + this.field23393);
            printWriter.println("advancedItemTooltips:" + this.field23394);
            printWriter.println("pauseOnLostFocus:" + this.field23395);
            printWriter.println("overrideWidth:" + this.field23398);
            printWriter.println("overrideHeight:" + this.field23399);
            printWriter.println("heldItemTooltips:" + this.field23400);
            printWriter.println("chatHeightFocused:" + this.field23404);
            printWriter.println("chatHeightUnfocused:" + this.field23403);
            printWriter.println("chatScale:" + this.field23401);
            printWriter.println("chatWidth:" + (float)this.field23402);
            printWriter.println("mipmapLevels:" + this.field23405);
            printWriter.println("useNativeTransport:" + this.field23407);
            printWriter.println("mainHand:" + ((this.field23397 == Class2226.field13697) ? "left" : "right"));
            printWriter.println("attackIndicator:" + this.field23408.method994());
            printWriter.println("narrator:" + this.field23475.method8137());
            printWriter.println("tutorialStep:" + this.field23409.method8053());
            printWriter.println("mouseWheelSensitivity:" + this.field23411);
            printWriter.println("rawMouseInput:" + Class6469.field25716.method19361(this));
            printWriter.println("glDebugVerbosity:" + this.field23413);
            printWriter.println("skipMultiplayerWarning:" + this.field23434);
            for (final Class350 class350 : this.field23460) {
                if (Class9570.field41347.method22605()) {
                    final String string = "key_" + class350.method1060() + ":" + class350.method1070();
                    final Object method35826 = Class9570.method35826(class350, Class9570.field41347, new Object[0]);
                    printWriter.println((method35826 != Class9570.method35827(Class9570.field41375)) ? (string + ":" + method35826) : string);
                }
                else {
                    printWriter.println("key_" + class350.method1060() + ":" + class350.method1070());
                }
            }
            for (final Class286 class351 : Class286.values()) {
                printWriter.println("soundCategory_" + class351.method935() + ":" + this.method17122(class351));
            }
            for (final Class189 class352 : Class189.values()) {
                printWriter.println("modelPart_" + class352.method829() + ":" + this.field23396.contains(class352));
            }
        }
        catch (final Exception ex) {
            Class5760.field23377.error("Failed to save options", (Throwable)ex);
        }
        this.method17135();
        this.method17124();
    }
    
    public float method17122(final Class286 class286) {
        return this.field23406.containsKey(class286) ? this.field23406.get(class286) : 1.0f;
    }
    
    public void method17123(final Class286 class286, final float f) {
        this.field23406.put(class286, f);
        this.field23461.method5299().method6430(class286, f);
    }
    
    public void method17124() {
        if (this.field23461.field4684 != null) {
            int n = 0;
            final Iterator<Class189> iterator = this.field23396.iterator();
            while (iterator.hasNext()) {
                n |= iterator.next().method828();
            }
            this.field23461.field4684.field4069.method17292(new Class4386(this.field23476, this.field23382, this.field23389, this.field23416, n, this.field23397));
        }
    }
    
    public Set<Class189> method17125() {
        return (Set<Class189>)ImmutableSet.copyOf((Collection)this.field23396);
    }
    
    public void method17126(final Class189 class189, final boolean b) {
        if (b) {
            this.field23396.add(class189);
        }
        else {
            this.field23396.remove(class189);
        }
        this.method17124();
    }
    
    public void method17127(final Class189 class189) {
        if (this.method17125().contains(class189)) {
            this.field23396.remove(class189);
        }
        else {
            this.field23396.add(class189);
        }
        this.method17124();
    }
    
    public Class2202 method17128() {
        return (this.field23382 >= 4) ? this.field23384 : Class2202.field13405;
    }
    
    public boolean method17129() {
        return this.field23407;
    }
    
    public void method17130(final Class6469 class6469, final double n) {
        if (class6469 == Class6469.field25755) {
            this.field23490 = n;
        }
        if (class6469 == Class6469.field25762) {
            this.field23486 = n;
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25798) {
            final int n2 = (int)n;
            if (n2 > 0 && Config.method28955()) {
                Config.method28996(Class4647.method13876("of.message.aa.shaders1"), Class4647.method13876("of.message.aa.shaders2"));
                return;
            }
            final int[] array = { 0, 2, 4, 6, 8, 12, 16 };
            this.field23487 = 0;
            for (int i = 0; i < array.length; ++i) {
                if (n2 >= array[i]) {
                    this.field23487 = array[i];
                }
            }
            this.field23487 = Config.method28865(this.field23487, 0, 16);
        }
        if (class6469 == Class6469.field25799) {
            final int n3 = (int)n;
            if (n3 > 1 && Config.method28955()) {
                Config.method28996(Class4647.method13876("of.message.af.shaders1"), Class4647.method13876("of.message.af.shaders2"));
                return;
            }
            this.field23488 = 1;
            while (this.field23488 * 2 <= n3) {
                this.field23488 *= 2;
            }
            this.field23488 = Config.method28865(this.field23488, 1, 16);
            this.field23461.method5278();
        }
        if (class6469 == Class6469.field25752) {
            this.field23479 = Config.method28865((int)n, 0, 3);
            this.method17139();
        }
    }
    
    public double method17131(final Class6469 class6469) {
        if (class6469 == Class6469.field25755) {
            return this.field23490;
        }
        if (class6469 == Class6469.field25762) {
            return this.field23486;
        }
        if (class6469 == Class6469.field25798) {
            return this.field23487;
        }
        if (class6469 == Class6469.field25799) {
            return this.field23488;
        }
        if (class6469 == Class6469.field25752) {
            return this.field23479;
        }
        if (class6469 == Class6469.field25712) {
            return (this.field23383 == Class6469.field25712.method19473() && this.field23419) ? 0.0 : this.field23383;
        }
        return 3.4028234663852886E38;
    }
    
    public void method17132(final Class6469 class6469, final int n) {
        if (class6469 == Class6469.field25750) {
            switch (this.field23477) {
                case 1: {
                    this.field23477 = 2;
                    if (!Config.method28822()) {
                        this.field23477 = 3;
                        break;
                    }
                    break;
                }
                case 2: {
                    this.field23477 = 3;
                    break;
                }
                case 3: {
                    this.field23477 = 1;
                    break;
                }
                default: {
                    this.field23477 = 1;
                    break;
                }
            }
        }
        if (class6469 == Class6469.field25751) {
            this.field23478 += 0.2f;
            if (this.field23478 > 0.81f) {
                this.field23478 = 0.2f;
            }
        }
        if (class6469 == Class6469.field25753) {
            this.field23481 = !this.field23481;
        }
        if (class6469 == Class6469.field25779) {
            this.field23482 = !this.field23482;
            Config.method28832();
        }
        if (class6469 == Class6469.field25754) {
            ++this.field23489;
            if (this.field23489 > 3) {
                this.field23489 = 0;
            }
            this.method17136();
        }
        if (class6469 == Class6469.field25756) {
            this.field23491 = method17141(this.field23491, Class5760.field23560);
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25804) {
            ++this.field23493;
            if (this.field23493 > 2) {
                this.field23493 = 0;
            }
        }
        if (class6469 == Class6469.field25757) {
            ++this.field23492;
            if (this.field23492 > 3) {
                this.field23492 = 0;
            }
        }
        if (class6469 == Class6469.field25758) {
            ++this.field23530;
            if (this.field23530 == 1) {
                ++this.field23530;
            }
            if (this.field23530 > 2) {
                this.field23530 = 0;
            }
        }
        if (class6469 == Class6469.field25759) {
            ++this.field23531;
            if (this.field23531 == 1) {
                ++this.field23531;
            }
            if (this.field23531 > 2) {
                this.field23531 = 0;
            }
        }
        if (class6469 == Class6469.field25760) {
            this.field23532 = !this.field23532;
        }
        if (class6469 == Class6469.field25761) {
            this.field23533 = !this.field23533;
        }
        if (class6469 == Class6469.field25767) {
            this.field23534 = !this.field23534;
        }
        if (class6469 == Class6469.field25768) {
            this.field23535 = !this.field23535;
        }
        if (class6469 == Class6469.field25769) {
            this.field23536 = !this.field23536;
        }
        if (class6469 == Class6469.field25770) {
            this.field23537 = !this.field23537;
        }
        if (class6469 == Class6469.field25780) {
            this.field23538 = !this.field23538;
        }
        if (class6469 == Class6469.field25781) {
            this.field23539 = !this.field23539;
        }
        if (class6469 == Class6469.field25783) {
            this.field23541 = !this.field23541;
        }
        if (class6469 == Class6469.field25784) {
            this.field23542 = !this.field23542;
        }
        if (class6469 == Class6469.field25785) {
            this.field23543 = !this.field23543;
        }
        if (class6469 == Class6469.field25787) {
            this.field23544 = !this.field23544;
        }
        if (class6469 == Class6469.field25789) {
            this.field23545 = !this.field23545;
        }
        if (class6469 == Class6469.field25800) {
            this.field23546 = !this.field23546;
        }
        if (class6469 == Class6469.field25782) {
            this.field23540 = !this.field23540;
        }
        if (class6469 == Class6469.field25763) {
            this.field23496 = !this.field23496;
        }
        if (class6469 == Class6469.field25764) {
            this.field23498 = !this.field23498;
        }
        if (class6469 == Class6469.field25765) {
            final int n2 = 900;
            this.field23495 = Math.max(this.field23495 / n2 * n2, n2);
            this.field23495 *= 2;
            if (this.field23495 > 32 * n2) {
                this.field23495 = n2;
            }
        }
        if (class6469 == Class6469.field25766) {
            ++this.field23494;
            if (this.field23494 > 3) {
                this.field23494 = 1;
            }
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25796) {
            ++this.field23514;
            if (this.field23514 > 3) {
                this.field23514 = 1;
            }
            if (this.field23514 == 2) {
                this.field23461.field4636.method5701();
            }
            else {
                this.field23461.method5278();
            }
        }
        if (class6469 == Class6469.field25771) {
            this.field23499 = !this.field23499;
        }
        if (class6469 == Class6469.field25772) {
            this.field23500 = !this.field23500;
        }
        if (class6469 == Class6469.field25773) {
            this.field23501 = !this.field23501;
        }
        if (class6469 == Class6469.field25774) {
            this.field23502 = !this.field23502;
        }
        if (class6469 == Class6469.field25775) {
            ++this.field23503;
            if (this.field23503 > 2) {
                this.field23503 = 0;
            }
        }
        if (class6469 == Class6469.field25776) {
            ++this.field23504;
            if (this.field23504 > 5) {
                this.field23504 = 1;
            }
        }
        if (class6469 == Class6469.field25777) {
            this.field23505 = !this.field23505;
        }
        if (class6469 == Class6469.field25778) {
            ++this.field23506;
            if (this.field23506 > 2) {
                this.field23506 = 0;
            }
        }
        if (class6469 == Class6469.field25786) {
            this.field23497 = !this.field23497;
        }
        if (class6469 == Class6469.field25788) {
            this.field23507 = !this.field23507;
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25790) {
            this.field23508 = !this.field23508;
            Class8763.method30335();
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25791) {
            this.field23509 = !this.field23509;
            Class9066.method32654();
        }
        if (class6469 == Class6469.field25793) {
            this.field23510 = !this.field23510;
            Class9265.method34180();
        }
        if (class6469 == Class6469.field25794) {
            this.field23511 = !this.field23511;
            Class8763.method30319();
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25797) {
            this.field23515 = !this.field23515;
            this.field23461.method5278();
        }
        if (class6469 == Class6469.field25806) {
            this.field23512 = !this.field23512;
            Class9132.method33153();
        }
        if (class6469 == Class6469.field25795) {
            this.field23513 = !this.field23513;
        }
        if (class6469 == Class6469.field25801) {
            this.field23516 = !this.field23516;
            Class7657.method24258();
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25802) {
            this.field23517 = !this.field23517;
            this.field23461.method5278();
        }
        if (class6469 == Class6469.field25807) {
            this.field23518 = !this.field23518;
            MathHelper.field41105 = this.field23518;
        }
        if (class6469 == Class6469.field25808) {
            if (!this.field23519 && Config.method28955()) {
                Config.method28996(Class4647.method13876("of.message.fr.shaders1"), Class4647.method13876("of.message.fr.shaders2"));
                return;
            }
            this.field23519 = !this.field23519;
            if (this.field23519) {
                this.field23461.field4644.method5800();
            }
            this.field23461.method5248();
        }
        if (class6469 == Class6469.field25809) {
            if (this.field23520 == 0) {
                this.field23520 = 1;
            }
            else if (this.field23520 == 1) {
                this.field23520 = 2;
            }
            else if (this.field23520 == 2) {
                this.field23520 = 0;
            }
            else {
                this.field23520 = 0;
            }
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25805) {
            this.field23483 = !this.field23483;
        }
        if (class6469 == Class6469.field25817) {
            this.field23484 = !this.field23484;
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25819) {
            this.field23485 = !this.field23485;
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25810) {
            this.field23521 = !this.field23521;
        }
        if (class6469 == Class6469.field25812) {
            this.field23522 = !this.field23522;
            this.field23461.field4636.method5701();
        }
        if (class6469 == Class6469.field25811) {
            this.field23523 = method17141(this.field23523, Class5760.field23561);
            Class8850.method30996(this.field23461.field4636);
        }
        if (class6469 == Class6469.field25815) {
            ++this.field23527;
            if (this.field23527 > 4) {
                this.field23527 = 1;
            }
        }
        if (class6469 == Class6469.field25813) {
            this.field23524 = !this.field23524;
            this.field23461.method5278();
        }
        if (class6469 == Class6469.field25816) {
            this.field23525 = !this.field23525;
            Class7890.method25545();
        }
        if (class6469 == Class6469.field25818) {
            this.field23526 = !this.field23526;
        }
        if (class6469 == Class6469.field25803) {
            this.field23400 = !this.field23400;
        }
        if (class6469 == Class6469.field25814) {
            this.field23394 = !this.field23394;
        }
        if (class6469 == Class6469.field25820) {
            if (this.field23528 == 0) {
                this.field23528 = 5;
            }
            else if (this.field23528 == 5) {
                this.field23528 = 3;
            }
            else {
                this.field23528 = 0;
            }
        }
        if (class6469 == Class6469.field25821) {
            this.field23529 = !this.field23529;
        }
        if (class6469 == Class6469.field25822) {
            this.field23547 = !this.field23547;
            this.field23461.field4636.method5701();
        }
    }
    
    public String method17133(final Class6469 class6469) {
        String str = Class8822.method30773(class6469.method19366(), new Object[0]) + ": ";
        if (str == null) {
            str = class6469.method19366();
        }
        if (class6469 == Class6469.field25717) {
            final int i = (int)Class6469.field25717.method19476(this);
            String str2 = Class8822.method30773("of.options.renderDistance.tiny", new Object[0]);
            int n = 2;
            if (i >= 4) {
                str2 = Class8822.method30773("of.options.renderDistance.short", new Object[0]);
                n = 4;
            }
            if (i >= 8) {
                str2 = Class8822.method30773("of.options.renderDistance.normal", new Object[0]);
                n = 8;
            }
            if (i >= 16) {
                str2 = Class8822.method30773("of.options.renderDistance.far", new Object[0]);
                n = 16;
            }
            if (i >= 32) {
                str2 = Class4647.method13876("of.options.renderDistance.extreme");
                n = 32;
            }
            if (i >= 48) {
                str2 = Class4647.method13876("of.options.renderDistance.insane");
                n = 48;
            }
            if (i >= 64) {
                str2 = Class4647.method13876("of.options.renderDistance.ludicrous");
                n = 64;
            }
            final int n2 = this.field23382 - n;
            String string = str2;
            if (n2 > 0) {
                string = str2 + "+";
            }
            return str + i + " " + string + "";
        }
        if (class6469 == Class6469.field25750) {
            switch (this.field23477) {
                case 1: {
                    return str + Class4647.method13880();
                }
                case 2: {
                    return str + Class4647.method13881();
                }
                case 3: {
                    return str + Class4647.method13879();
                }
                default: {
                    return str + Class4647.method13879();
                }
            }
        }
        else {
            if (class6469 == Class6469.field25751) {
                return str + this.field23478;
            }
            if (class6469 == Class6469.field25752) {
                switch (this.field23479) {
                    case 0: {
                        return str + Class4647.method13876("of.options.mipmap.nearest");
                    }
                    case 1: {
                        return str + Class4647.method13876("of.options.mipmap.linear");
                    }
                    case 2: {
                        return str + Class4647.method13876("of.options.mipmap.bilinear");
                    }
                    case 3: {
                        return str + Class4647.method13876("of.options.mipmap.trilinear");
                    }
                    default: {
                        return str + "of.options.mipmap.nearest";
                    }
                }
            }
            else {
                if (class6469 == Class6469.field25753) {
                    return this.field23481 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                }
                if (class6469 == Class6469.field25779) {
                    return this.field23482 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                }
                if (class6469 == Class6469.field25754) {
                    switch (this.field23489) {
                        case 1: {
                            return str + Class4647.method13880();
                        }
                        case 2: {
                            return str + Class4647.method13881();
                        }
                        case 3: {
                            return str + Class4647.method13879();
                        }
                        default: {
                            return str + Class4647.method13882();
                        }
                    }
                }
                else if (class6469 == Class6469.field25756) {
                    switch (this.field23491) {
                        case 1: {
                            return str + Class4647.method13880();
                        }
                        case 2: {
                            return str + Class4647.method13881();
                        }
                        default: {
                            return str + Class4647.method13882();
                        }
                        case 4: {
                            return str + Class4647.method13876("of.general.smart");
                        }
                    }
                }
                else if (class6469 == Class6469.field25804) {
                    switch (this.field23493) {
                        case 1: {
                            return str + Class4647.method13880();
                        }
                        case 2: {
                            return str + Class4647.method13881();
                        }
                        default: {
                            return str + Class4647.method13882();
                        }
                    }
                }
                else if (class6469 == Class6469.field25757) {
                    switch (this.field23492) {
                        case 1: {
                            return str + Class4647.method13880();
                        }
                        case 2: {
                            return str + Class4647.method13881();
                        }
                        case 3: {
                            return str + Class4647.method13879();
                        }
                        default: {
                            return str + Class4647.method13882();
                        }
                    }
                }
                else if (class6469 == Class6469.field25758) {
                    switch (this.field23530) {
                        case 1: {
                            return str + Class4647.method13876("of.options.animation.dynamic");
                        }
                        case 2: {
                            return str + Class4647.method13879();
                        }
                        default: {
                            return str + Class4647.method13878();
                        }
                    }
                }
                else if (class6469 == Class6469.field25759) {
                    switch (this.field23531) {
                        case 1: {
                            return str + Class4647.method13876("of.options.animation.dynamic");
                        }
                        case 2: {
                            return str + Class4647.method13879();
                        }
                        default: {
                            return str + Class4647.method13878();
                        }
                    }
                }
                else {
                    if (class6469 == Class6469.field25760) {
                        return this.field23532 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25761) {
                        return this.field23533 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25767) {
                        return this.field23534 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25768) {
                        return this.field23535 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25769) {
                        return this.field23536 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25770) {
                        return this.field23537 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25780) {
                        return this.field23538 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25781) {
                        return this.field23539 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25783) {
                        return this.field23541 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25784) {
                        return this.field23542 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25785) {
                        return this.field23543 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25787) {
                        return this.field23544 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25789) {
                        return this.field23545 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25800) {
                        return this.field23546 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25782) {
                        return this.field23540 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25763) {
                        return this.field23496 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25764) {
                        return this.field23498 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                    }
                    if (class6469 == Class6469.field25765) {
                        final int n3 = 900;
                        if (this.field23495 <= n3) {
                            return str + Class4647.method13876("of.options.save.45s");
                        }
                        if (this.field23495 <= 2 * n3) {
                            return str + Class4647.method13876("of.options.save.90s");
                        }
                        if (this.field23495 <= 4 * n3) {
                            return str + Class4647.method13876("of.options.save.3min");
                        }
                        if (this.field23495 <= 8 * n3) {
                            return str + Class4647.method13876("of.options.save.6min");
                        }
                        return (this.field23495 <= 16 * n3) ? (str + Class4647.method13876("of.options.save.12min")) : (str + Class4647.method13876("of.options.save.24min"));
                    }
                    else if (class6469 == Class6469.field25766) {
                        switch (this.field23494) {
                            case 1: {
                                return str + Class4647.method13880();
                            }
                            case 2: {
                                return str + Class4647.method13881();
                            }
                            default: {
                                return str + Class4647.method13879();
                            }
                        }
                    }
                    else if (class6469 == Class6469.field25796) {
                        switch (this.field23514) {
                            case 1: {
                                return str + Class4647.method13880();
                            }
                            case 2: {
                                return str + Class4647.method13881();
                            }
                            default: {
                                return str + Class4647.method13879();
                            }
                        }
                    }
                    else {
                        if (class6469 == Class6469.field25771) {
                            return this.field23499 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                        }
                        if (class6469 == Class6469.field25772) {
                            return this.field23500 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                        }
                        if (class6469 == Class6469.field25773) {
                            return this.field23501 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                        }
                        if (class6469 == Class6469.field25774) {
                            return this.field23502 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                        }
                        if (class6469 == Class6469.field25775) {
                            switch (this.field23503) {
                                case 1: {
                                    return str + Class4647.method13880();
                                }
                                case 2: {
                                    return str + Class4647.method13881();
                                }
                                default: {
                                    return str + Class4647.method13882();
                                }
                            }
                        }
                        else {
                            if (class6469 == Class6469.field25776) {
                                return str + this.field23504;
                            }
                            if (class6469 == Class6469.field25777) {
                                return this.field23505 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                            }
                            if (class6469 == Class6469.field25778) {
                                if (this.field23506 == 1) {
                                    return str + Class4647.method13876("of.options.time.dayOnly");
                                }
                                return (this.field23506 == 2) ? (str + Class4647.method13876("of.options.time.nightOnly")) : (str + Class4647.method13882());
                            }
                            else {
                                if (class6469 == Class6469.field25798) {
                                    String string2 = "";
                                    if (this.field23487 != Config.method28925()) {
                                        string2 = " (" + Class4647.method13876("of.general.restart") + ")";
                                    }
                                    return (this.field23487 == 0) ? (str + Class4647.method13879() + string2) : (str + this.field23487 + string2);
                                }
                                if (class6469 == Class6469.field25799) {
                                    return (this.field23488 == 1) ? (str + Class4647.method13879()) : (str + this.field23488);
                                }
                                if (class6469 == Class6469.field25786) {
                                    return this.field23497 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25788) {
                                    return this.field23507 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25790) {
                                    return this.field23508 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25791) {
                                    return this.field23509 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25793) {
                                    return this.field23510 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25794) {
                                    return this.field23511 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25806) {
                                    return this.field23512 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25795) {
                                    return this.field23513 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25797) {
                                    return this.field23515 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25801) {
                                    return this.field23516 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25802) {
                                    return this.field23517 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25807) {
                                    return this.field23518 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25808) {
                                    return this.field23519 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                }
                                if (class6469 == Class6469.field25809) {
                                    if (this.field23520 == 1) {
                                        return str + Class4647.method13880();
                                    }
                                    return (this.field23520 == 2) ? (str + Class4647.method13881()) : (str + Class4647.method13882());
                                }
                                else {
                                    if (class6469 == Class6469.field25805) {
                                        return this.field23483 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25817) {
                                        return this.field23484 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25819) {
                                        return this.field23485 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25810) {
                                        return this.field23521 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25812) {
                                        return this.field23522 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25811) {
                                        return str + method17144(Class5760.field23562, method17143(this.field23523, Class5760.field23561));
                                    }
                                    if (class6469 == Class6469.field25815) {
                                        return (this.field23527 <= 1) ? (str + Class4647.method13882()) : (str + this.field23527 + "x");
                                    }
                                    if (class6469 == Class6469.field25813) {
                                        return this.field23524 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25816) {
                                        return this.field23525 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25818) {
                                        return this.field23526 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25803) {
                                        return this.field23400 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25814) {
                                        return this.field23394 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                    }
                                    if (class6469 == Class6469.field25712) {
                                        final double method19476 = Class6469.field25712.method19476(this);
                                        if (method19476 == 0.0) {
                                            return str + Class4647.method13876("of.options.framerateLimit.vsync");
                                        }
                                        return (method19476 == Class6469.field25712.method19473()) ? (str + Class8822.method30773("options.framerateLimit.max", new Object[0])) : (str + (int)method19476 + " fps");
                                    }
                                    else if (class6469 == Class6469.field25820) {
                                        if (this.field23528 == 3) {
                                            return str + Class4647.method13879();
                                        }
                                        return (this.field23528 == 5) ? (str + Class4647.method13876("of.general.compact")) : (str + Class4647.method13882());
                                    }
                                    else {
                                        if (class6469 == Class6469.field25821) {
                                            return this.field23529 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                        }
                                        if (class6469 == Class6469.field25822) {
                                            return this.field23547 ? (str + Class4647.method13878()) : (str + Class4647.method13879());
                                        }
                                        if (class6469 instanceof Class6470) {
                                            final double method19477 = ((Class6470)class6469).method19476(this);
                                            return (method19477 == 0.0) ? (str + Class8822.method30773("options.off", new Object[0])) : (str + (int)(method19477 * 100.0) + "%");
                                        }
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void method17134() {
        try {
            File file = this.field23564;
            if (!file.exists()) {
                file = this.field23462;
            }
            if (!file.exists()) {
                return;
            }
            final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                try {
                    final String[] split = line.split(":");
                    if (split[0].equals("ofRenderDistanceChunks") && split.length >= 2) {
                        this.field23382 = Integer.valueOf(split[1]);
                        this.field23382 = Config.method28865(this.field23382, 2, 1024);
                    }
                    if (split[0].equals("ofFogType") && split.length >= 2) {
                        this.field23477 = Integer.valueOf(split[1]);
                        this.field23477 = Config.method28865(this.field23477, 1, 3);
                    }
                    if (split[0].equals("ofFogStart") && split.length >= 2) {
                        this.field23478 = Float.valueOf(split[1]);
                        if (this.field23478 < 0.2f) {
                            this.field23478 = 0.2f;
                        }
                        if (this.field23478 > 0.81f) {
                            this.field23478 = 0.8f;
                        }
                    }
                    if (split[0].equals("ofMipmapType") && split.length >= 2) {
                        this.field23479 = Integer.valueOf(split[1]);
                        this.field23479 = Config.method28865(this.field23479, 0, 3);
                    }
                    if (split[0].equals("ofOcclusionFancy") && split.length >= 2) {
                        this.field23480 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmoothFps") && split.length >= 2) {
                        this.field23481 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmoothWorld") && split.length >= 2) {
                        this.field23482 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAoLevel") && split.length >= 2) {
                        this.field23486 = Float.valueOf(split[1]);
                        this.field23486 = Config.method28867(this.field23486, 0.0, 1.0);
                    }
                    if (split[0].equals("ofClouds") && split.length >= 2) {
                        this.field23489 = Integer.valueOf(split[1]);
                        this.field23489 = Config.method28865(this.field23489, 0, 3);
                        this.method17136();
                    }
                    if (split[0].equals("ofCloudsHeight") && split.length >= 2) {
                        this.field23490 = Float.valueOf(split[1]);
                        this.field23490 = Config.method28867(this.field23490, 0.0, 1.0);
                    }
                    if (split[0].equals("ofTrees") && split.length >= 2) {
                        this.field23491 = Integer.valueOf(split[1]);
                        this.field23491 = method17142(this.field23491, Class5760.field23560);
                    }
                    if (split[0].equals("ofDroppedItems") && split.length >= 2) {
                        this.field23493 = Integer.valueOf(split[1]);
                        this.field23493 = Config.method28865(this.field23493, 0, 2);
                    }
                    if (split[0].equals("ofRain") && split.length >= 2) {
                        this.field23492 = Integer.valueOf(split[1]);
                        this.field23492 = Config.method28865(this.field23492, 0, 3);
                    }
                    if (split[0].equals("ofAnimatedWater") && split.length >= 2) {
                        this.field23530 = Integer.valueOf(split[1]);
                        this.field23530 = Config.method28865(this.field23530, 0, 2);
                    }
                    if (split[0].equals("ofAnimatedLava") && split.length >= 2) {
                        this.field23531 = Integer.valueOf(split[1]);
                        this.field23531 = Config.method28865(this.field23531, 0, 2);
                    }
                    if (split[0].equals("ofAnimatedFire") && split.length >= 2) {
                        this.field23532 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedPortal") && split.length >= 2) {
                        this.field23533 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedRedstone") && split.length >= 2) {
                        this.field23534 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedExplosion") && split.length >= 2) {
                        this.field23535 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedFlame") && split.length >= 2) {
                        this.field23536 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedSmoke") && split.length >= 2) {
                        this.field23537 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofVoidParticles") && split.length >= 2) {
                        this.field23538 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofWaterParticles") && split.length >= 2) {
                        this.field23539 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofPortalParticles") && split.length >= 2) {
                        this.field23541 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofPotionParticles") && split.length >= 2) {
                        this.field23542 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofFireworkParticles") && split.length >= 2) {
                        this.field23543 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofDrippingWaterLava") && split.length >= 2) {
                        this.field23544 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedTerrain") && split.length >= 2) {
                        this.field23545 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAnimatedTextures") && split.length >= 2) {
                        this.field23546 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofRainSplash") && split.length >= 2) {
                        this.field23540 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofLagometer") && split.length >= 2) {
                        this.field23496 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofShowFps") && split.length >= 2) {
                        this.field23498 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAutoSaveTicks") && split.length >= 2) {
                        this.field23495 = Integer.valueOf(split[1]);
                        this.field23495 = Config.method28865(this.field23495, 40, 40000);
                    }
                    if (split[0].equals("ofBetterGrass") && split.length >= 2) {
                        this.field23494 = Integer.valueOf(split[1]);
                        this.field23494 = Config.method28865(this.field23494, 1, 3);
                    }
                    if (split[0].equals("ofConnectedTextures") && split.length >= 2) {
                        this.field23514 = Integer.valueOf(split[1]);
                        this.field23514 = Config.method28865(this.field23514, 1, 3);
                    }
                    if (split[0].equals("ofWeather") && split.length >= 2) {
                        this.field23499 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSky") && split.length >= 2) {
                        this.field23500 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofStars") && split.length >= 2) {
                        this.field23501 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSunMoon") && split.length >= 2) {
                        this.field23502 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofVignette") && split.length >= 2) {
                        this.field23503 = Integer.valueOf(split[1]);
                        this.field23503 = Config.method28865(this.field23503, 0, 2);
                    }
                    if (split[0].equals("ofChunkUpdates") && split.length >= 2) {
                        this.field23504 = Integer.valueOf(split[1]);
                        this.field23504 = Config.method28865(this.field23504, 1, 5);
                    }
                    if (split[0].equals("ofChunkUpdatesDynamic") && split.length >= 2) {
                        this.field23505 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofTime") && split.length >= 2) {
                        this.field23506 = Integer.valueOf(split[1]);
                        this.field23506 = Config.method28865(this.field23506, 0, 2);
                    }
                    if (split[0].equals("ofAaLevel") && split.length >= 2) {
                        this.field23487 = Integer.valueOf(split[1]);
                        this.field23487 = Config.method28865(this.field23487, 0, 16);
                    }
                    if (split[0].equals("ofAfLevel") && split.length >= 2) {
                        this.field23488 = Integer.valueOf(split[1]);
                        this.field23488 = Config.method28865(this.field23488, 1, 16);
                    }
                    if (split[0].equals("ofProfiler") && split.length >= 2) {
                        this.field23497 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofBetterSnow") && split.length >= 2) {
                        this.field23507 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSwampColors") && split.length >= 2) {
                        this.field23508 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofRandomEntities") && split.length >= 2) {
                        this.field23509 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomFonts") && split.length >= 2) {
                        this.field23510 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomColors") && split.length >= 2) {
                        this.field23511 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomItems") && split.length >= 2) {
                        this.field23515 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomSky") && split.length >= 2) {
                        this.field23512 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofShowCapes") && split.length >= 2) {
                        this.field23513 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofNaturalTextures") && split.length >= 2) {
                        this.field23516 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofEmissiveTextures") && split.length >= 2) {
                        this.field23517 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofLazyChunkLoading") && split.length >= 2) {
                        this.field23483 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofRenderRegions") && split.length >= 2) {
                        this.field23484 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofSmartAnimations") && split.length >= 2) {
                        this.field23485 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofDynamicFov") && split.length >= 2) {
                        this.field23521 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofAlternateBlocks") && split.length >= 2) {
                        this.field23522 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofDynamicLights") && split.length >= 2) {
                        this.field23523 = Integer.valueOf(split[1]);
                        this.field23523 = method17142(this.field23523, Class5760.field23561);
                    }
                    if (split[0].equals("ofScreenshotSize") && split.length >= 2) {
                        this.field23527 = Integer.valueOf(split[1]);
                        this.field23527 = Config.method28865(this.field23527, 1, 4);
                    }
                    if (split[0].equals("ofCustomEntityModels") && split.length >= 2) {
                        this.field23524 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofCustomGuis") && split.length >= 2) {
                        this.field23525 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofShowGlErrors") && split.length >= 2) {
                        this.field23526 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofFastMath") && split.length >= 2) {
                        this.field23518 = Boolean.valueOf(split[1]);
                        MathHelper.field41105 = this.field23518;
                    }
                    if (split[0].equals("ofFastRender") && split.length >= 2) {
                        this.field23519 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofTranslucentBlocks") && split.length >= 2) {
                        this.field23520 = Integer.valueOf(split[1]);
                        this.field23520 = Config.method28865(this.field23520, 0, 2);
                    }
                    if (split[0].equals("ofChatBackground") && split.length >= 2) {
                        this.field23528 = Integer.valueOf(split[1]);
                    }
                    if (split[0].equals("ofChatShadow") && split.length >= 2) {
                        this.field23529 = Boolean.valueOf(split[1]);
                    }
                    if (split[0].equals("ofUseVbo") && split.length >= 2) {
                        this.field23547 = Boolean.valueOf(split[1]);
                    }
                    if (!split[0].equals("key_" + this.field23563.method1060())) {
                        continue;
                    }
                    this.field23563.method1062(Class8341.method27797(split[1]));
                }
                catch (final Exception ex) {
                    Config.method28847("Skipping bad option: " + line);
                    ex.printStackTrace();
                }
            }
            Class9079.method32717(this.field23460, new Class350[] { this.field23563 });
            Class350.method1055();
            bufferedReader.close();
        }
        catch (final Exception ex2) {
            Config.warn("Failed to load options");
            ex2.printStackTrace();
        }
    }
    
    public void method17135() {
        try {
            final PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.field23564), StandardCharsets.UTF_8));
            printWriter.println("ofFogType:" + this.field23477);
            printWriter.println("ofFogStart:" + this.field23478);
            printWriter.println("ofMipmapType:" + this.field23479);
            printWriter.println("ofOcclusionFancy:" + this.field23480);
            printWriter.println("ofSmoothFps:" + this.field23481);
            printWriter.println("ofSmoothWorld:" + this.field23482);
            printWriter.println("ofAoLevel:" + this.field23486);
            printWriter.println("ofClouds:" + this.field23489);
            printWriter.println("ofCloudsHeight:" + this.field23490);
            printWriter.println("ofTrees:" + this.field23491);
            printWriter.println("ofDroppedItems:" + this.field23493);
            printWriter.println("ofRain:" + this.field23492);
            printWriter.println("ofAnimatedWater:" + this.field23530);
            printWriter.println("ofAnimatedLava:" + this.field23531);
            printWriter.println("ofAnimatedFire:" + this.field23532);
            printWriter.println("ofAnimatedPortal:" + this.field23533);
            printWriter.println("ofAnimatedRedstone:" + this.field23534);
            printWriter.println("ofAnimatedExplosion:" + this.field23535);
            printWriter.println("ofAnimatedFlame:" + this.field23536);
            printWriter.println("ofAnimatedSmoke:" + this.field23537);
            printWriter.println("ofVoidParticles:" + this.field23538);
            printWriter.println("ofWaterParticles:" + this.field23539);
            printWriter.println("ofPortalParticles:" + this.field23541);
            printWriter.println("ofPotionParticles:" + this.field23542);
            printWriter.println("ofFireworkParticles:" + this.field23543);
            printWriter.println("ofDrippingWaterLava:" + this.field23544);
            printWriter.println("ofAnimatedTerrain:" + this.field23545);
            printWriter.println("ofAnimatedTextures:" + this.field23546);
            printWriter.println("ofRainSplash:" + this.field23540);
            printWriter.println("ofLagometer:" + this.field23496);
            printWriter.println("ofShowFps:" + this.field23498);
            printWriter.println("ofAutoSaveTicks:" + this.field23495);
            printWriter.println("ofBetterGrass:" + this.field23494);
            printWriter.println("ofConnectedTextures:" + this.field23514);
            printWriter.println("ofWeather:" + this.field23499);
            printWriter.println("ofSky:" + this.field23500);
            printWriter.println("ofStars:" + this.field23501);
            printWriter.println("ofSunMoon:" + this.field23502);
            printWriter.println("ofVignette:" + this.field23503);
            printWriter.println("ofChunkUpdates:" + this.field23504);
            printWriter.println("ofChunkUpdatesDynamic:" + this.field23505);
            printWriter.println("ofTime:" + this.field23506);
            printWriter.println("ofAaLevel:" + this.field23487);
            printWriter.println("ofAfLevel:" + this.field23488);
            printWriter.println("ofProfiler:" + this.field23497);
            printWriter.println("ofBetterSnow:" + this.field23507);
            printWriter.println("ofSwampColors:" + this.field23508);
            printWriter.println("ofRandomEntities:" + this.field23509);
            printWriter.println("ofCustomFonts:" + this.field23510);
            printWriter.println("ofCustomColors:" + this.field23511);
            printWriter.println("ofCustomItems:" + this.field23515);
            printWriter.println("ofCustomSky:" + this.field23512);
            printWriter.println("ofShowCapes:" + this.field23513);
            printWriter.println("ofNaturalTextures:" + this.field23516);
            printWriter.println("ofEmissiveTextures:" + this.field23517);
            printWriter.println("ofLazyChunkLoading:" + this.field23483);
            printWriter.println("ofRenderRegions:" + this.field23484);
            printWriter.println("ofSmartAnimations:" + this.field23485);
            printWriter.println("ofDynamicFov:" + this.field23521);
            printWriter.println("ofAlternateBlocks:" + this.field23522);
            printWriter.println("ofDynamicLights:" + this.field23523);
            printWriter.println("ofScreenshotSize:" + this.field23527);
            printWriter.println("ofCustomEntityModels:" + this.field23524);
            printWriter.println("ofCustomGuis:" + this.field23525);
            printWriter.println("ofShowGlErrors:" + this.field23526);
            printWriter.println("ofFastMath:" + this.field23518);
            printWriter.println("ofFastRender:" + this.field23519);
            printWriter.println("ofTranslucentBlocks:" + this.field23520);
            printWriter.println("ofChatBackground:" + this.field23528);
            printWriter.println("ofChatShadow:" + this.field23529);
            printWriter.println("ofUseVbo:" + this.field23547);
            printWriter.println("key_" + this.field23563.method1060() + ":" + this.field23563.method1070());
            printWriter.close();
        }
        catch (final Exception ex) {
            Config.warn("Failed to save options");
            ex.printStackTrace();
        }
    }
    
    public void method17136() {
        switch (this.field23489) {
            case 1: {
                this.field23384 = Class2202.field13406;
                break;
            }
            case 2: {
                this.field23384 = Class2202.field13407;
                break;
            }
            case 3: {
                this.field23384 = Class2202.field13405;
                break;
            }
            default: {
                if (this.field23385) {
                    this.field23384 = Class2202.field13407;
                    break;
                }
                this.field23384 = Class2202.field13406;
                break;
            }
        }
    }
    
    public void method17137() {
        this.field23382 = 8;
        this.field23431 = true;
        this.field23383 = (int)Class6469.field25712.method19473();
        this.field23419 = false;
        this.method17138();
        this.field23405 = 4;
        this.field23385 = true;
        this.field23386 = Class2007.field11400;
        this.field23384 = Class2202.field13407;
        this.field23471 = 70.0;
        this.field23472 = 0.0;
        this.field23473 = 0;
        this.field23474 = Class2159.field12819;
        this.field23400 = true;
        this.field23547 = true;
        this.field23421 = false;
        this.field23477 = 1;
        this.field23478 = 0.8f;
        this.field23479 = 0;
        this.field23480 = false;
        this.field23485 = false;
        this.field23481 = false;
        Config.method28970();
        this.field23482 = Config.method28971();
        this.field23483 = false;
        this.field23484 = false;
        this.field23518 = false;
        this.field23519 = false;
        this.field23520 = 0;
        this.field23521 = true;
        this.field23522 = true;
        this.field23523 = 3;
        this.field23527 = 1;
        this.field23524 = true;
        this.field23525 = true;
        this.field23526 = true;
        this.field23528 = 0;
        this.field23529 = true;
        this.field23486 = 1.0;
        this.field23487 = 0;
        this.field23488 = 1;
        this.field23489 = 0;
        this.field23490 = 0.0;
        this.field23491 = 0;
        this.field23492 = 0;
        this.field23494 = 3;
        this.field23495 = 4000;
        this.field23496 = false;
        this.field23498 = false;
        this.field23497 = false;
        this.field23499 = true;
        this.field23500 = true;
        this.field23501 = true;
        this.field23502 = true;
        this.field23503 = 0;
        this.field23504 = 1;
        this.field23505 = false;
        this.field23506 = 0;
        this.field23507 = false;
        this.field23508 = true;
        this.field23509 = true;
        this.field23410 = 2;
        this.field23510 = true;
        this.field23511 = true;
        this.field23515 = true;
        this.field23512 = true;
        this.field23513 = true;
        this.field23514 = 2;
        this.field23516 = false;
        this.field23517 = true;
        this.field23530 = 0;
        this.field23531 = 0;
        this.field23532 = true;
        this.field23533 = true;
        this.field23534 = true;
        this.field23535 = true;
        this.field23536 = true;
        this.field23537 = true;
        this.field23538 = true;
        this.field23539 = true;
        this.field23540 = true;
        this.field23541 = true;
        this.field23542 = true;
        this.field23543 = true;
        this.field23544 = true;
        this.field23545 = true;
        this.field23546 = true;
        Class9216.method33707("OFF");
        Class9216.field39317 = 0;
        Class9216.method33788();
        Class9216.method33705();
        this.field23461.method5278();
        this.method17121();
    }
    
    public void method17138() {
        if (this.field23461.method5332() != null) {
            this.field23461.method5332().method7672(this.field23419);
        }
    }
    
    public void method17139() {
        this.field23461.method5337(this.field23405);
        this.field23461.method5278();
    }
    
    public void method17140(final boolean field23546) {
        final int n = field23546 ? 0 : 2;
        this.field23530 = n;
        this.field23531 = n;
        this.field23532 = field23546;
        this.field23533 = field23546;
        this.field23534 = field23546;
        this.field23535 = field23546;
        this.field23536 = field23546;
        this.field23537 = field23546;
        this.field23538 = field23546;
        this.field23539 = field23546;
        this.field23540 = field23546;
        this.field23541 = field23546;
        this.field23542 = field23546;
        this.field23543 = field23546;
        this.field23474 = (field23546 ? Class2159.field12819 : Class2159.field12821);
        this.field23544 = field23546;
        this.field23545 = field23546;
        this.field23546 = field23546;
    }
    
    private static int method17141(final int n, final int[] array) {
        int method17143 = method17143(n, array);
        if (method17143 < 0) {
            return array[0];
        }
        if (++method17143 >= array.length) {
            method17143 = 0;
        }
        return array[method17143];
    }
    
    private static int method17142(final int n, final int[] array) {
        return (method17143(n, array) < 0) ? array[0] : n;
    }
    
    private static int method17143(final int n, final int[] array) {
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    private static String method17144(final String[] array, int n) {
        if (n < 0 || n >= array.length) {
            n = 0;
        }
        return Class8822.method30773(array[n], new Object[0]);
    }
    
    private void method17145() {
        if (Class9570.field41372.method22634() && Class9570.field41345.method22605()) {
            final Object method35827 = Class9570.method35827(Class9570.field41372);
            Class9570.method35826(this.field23435, Class9570.field41345, method35827);
            Class9570.method35826(this.field23436, Class9570.field41345, method35827);
            Class9570.method35826(this.field23437, Class9570.field41345, method35827);
            Class9570.method35826(this.field23438, Class9570.field41345, method35827);
            Class9570.method35826(this.field23439, Class9570.field41345, method35827);
            Class9570.method35826(this.field23440, Class9570.field41345, method35827);
            Class9570.method35826(this.field23441, Class9570.field41345, method35827);
            Class9570.method35826(this.field23446, Class9570.field41345, method35827);
            Class9570.method35826(this.field23448, Class9570.field41345, method35827);
            Class9570.method35826(this.field23449, Class9570.field41345, method35827);
            Class9570.method35826(this.field23450, Class9570.field41345, method35827);
            Class9570.method35826(this.field23452, Class9570.field41345, method35827);
            Class9570.method35826(this.field23453, Class9570.field41345, method35827);
            Class9570.method35826(this.field23443, Class9570.field41345, method35827);
        }
    }
    
    public void method17146(final Class1920<Class1922> class1920) {
        class1920.method7606();
        final LinkedHashSet linkedHashSet = Sets.newLinkedHashSet();
        final Iterator<String> iterator = this.field23387.iterator();
        while (iterator.hasNext()) {
            final String str = iterator.next();
            Class1922 class1921 = class1920.method7612(str);
            if (class1921 == null && !str.startsWith("file/")) {
                class1921 = class1920.method7612("file/" + str);
            }
            if (class1921 == null) {
                Class5760.field23377.warn("Removed resource pack {} from options because it doesn't seem to exist anymore", (Object)str);
                iterator.remove();
            }
            else if (!class1921.method7619().method8043() && !this.field23388.contains(str)) {
                Class5760.field23377.warn("Removed resource pack {} from options because it is no longer compatible", (Object)str);
                iterator.remove();
            }
            else if (class1921.method7619().method8043() && this.field23388.contains(str)) {
                Class5760.field23377.info("Removed resource pack {} from incompatibility list because it's now compatible", (Object)str);
                this.field23388.remove(str);
            }
            else {
                linkedHashSet.add(class1921);
            }
        }
        class1920.method7608(linkedHashSet);
    }
    
    static {
        field23377 = LogManager.getLogger();
        field23378 = new Gson();
        field23379 = new Class8361();
        field23380 = Splitter.on(':').limit(2);
        field23560 = new int[] { 0, 1, 4, 2 };
        field23561 = new int[] { 3, 1, 2 };
        field23562 = new String[] { Class5760.\u4407\u74eb\uc854\u772f\u6c62\u309d[218], "options.graphics.fast", "options.graphics.fancy" };
    }
}
