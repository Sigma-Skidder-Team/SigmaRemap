package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.settings.impl.ModeSetting;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Jargon extends Module {
    public Jargon() {
        super(ModuleCategory.MISC, "Jargon", "Sends a randomly contructed message in chat");
        this.registerSetting(new ModeSetting("Jargon", "A test type button", 0, "Excuse", "Techincal", "Audio"));
    }

    public static String method16132(String[] var0) {
        Random var3 = new Random();
        int var4 = var3.nextInt(var0.length);
        return var0[var4];
    }

    @Override
    public void onEnable() {
        String var3 = "Error";
        if (!this.getStringSettingValueByName("Jargon").equals("Excuse")) {
            if (!this.getStringSettingValueByName("Jargon").equals("Techincal")) {
                if (this.getStringSettingValueByName("Jargon").equals("Audio")) {
                    var3 = this.method16130();
                }
            } else {
                var3 = this.method16128();
            }
        } else {
            var3 = this.method16129();
        }

        mc.player.method5389(var3);
        this.setState(false);
    }

    public String method16128() {
        String[] var3 = new String[]{
                "Do we {3} the {2} to {3} the {0} {2} with the {1} {2}?",
                "If we {3} the {2}, we can get to the {0} {2} through the {1} {0} {2}",
                "We need to {3} the {1} {0} {2}",
                "Try to {3} the {0} {2}, maybe it will {3} the {1} {2}",
                "You can't {3} the {2} without {4} the {1} {0} {2}",
                "Use the {1} {0} {2}, then you can {3} the {1} {2}",
                "The {0} {2} is down, {3} the {1} {2} so we can {3} the {0} {2}",
                "{4} the {2} won't do anything, we need to {3} the {1} {0} {2}",
                "I'll {3} the {1} {0} {2}, that should {3} the {0} {2}",
                "My {0} {2} is down, our only choice is to {3} and {3} the {1} {2}",
                "They're inside the {2}, use the {1} {0} {2} to {3} their {2}",
                "Send the {1} {2} into the {2}, it will {3} the {2} by {4} its {0} {2}"
        };
        String[] var4 = new String[]{
                "TCP",
                "HTTP",
                "SDD",
                "RAM",
                "GB",
                "CSS",
                "SSL",
                "AGP",
                "SQL",
                "FTP",
                "PCI",
                "AI",
                "ADP",
                "RSS",
                "XML",
                "EXE",
                "COM",
                "HDD",
                "THX",
                "SMTP",
                "SMS",
                "USB",
                "PNG",
                "PHP",
                "UDP",
                "TPS",
                "RX",
                "ASCII",
                "CD-ROM",
                "CGI",
                "CPU",
                "DDR",
                "DHCP",
                "BIOS",
                "IDE",
                "IP",
                "MAC",
                "MP3",
                "AAC",
                "PPPoE",
                "SSD",
                "SDRAM",
                "VGA",
                "XHTML",
                "Y2K",
                "GUI",
                "VPN"
        };
        String[] var5 = new String[]{
                "auxiliary",
                "primary",
                "back-end",
                "digital",
                "open-source",
                "virtual",
                "cross-platform",
                "redundant",
                "online",
                "haptic",
                "multi-byte",
                "bluetooth",
                "wireless",
                "1080p",
                "neural",
                "optical",
                "solid state",
                "mobile",
                "unicode",
                "backup",
                "high speed",
                "56k",
                "analog",
                "fiber optic",
                "central",
                "visual",
                "ethernet"
        };
        String[] var6 = new String[]{
                "driver",
                "protocol",
                "bandwidth",
                "panel",
                "microchip",
                "program",
                "port",
                "card",
                "array",
                "interface",
                "system",
                "sensor",
                "firewall",
                "hard drive",
                "pixel",
                "alarm",
                "feed",
                "monitor",
                "application",
                "transmitter",
                "bus",
                "circuit",
                "capacitor",
                "matrix",
                "address",
                "form factor",
                "array",
                "mainframe",
                "processor",
                "antenna",
                "transistor",
                "virus",
                "malware",
                "spyware",
                "network",
                "internet",
                "proxy",
                "buffer"
        };
        String[] var7 = new String[]{
                "back up",
                "bypass",
                "hack",
                "override",
                "compress",
                "copy",
                "navigate",
                "index",
                "connect",
                "generate",
                "quantify",
                "calculate",
                "synthesize",
                "input",
                "transmit",
                "program",
                "reboot",
                "parse",
                "shut down",
                "inject",
                "transcode",
                "encode",
                "attach",
                "disconnect",
                "network",
                "hijack",
                "reverse engineer",
                "hash"
        };
        String[] var8 = new String[]{
                "backing up",
                "bypassing",
                "hacking",
                "overriding",
                "compressing",
                "copying",
                "navigating",
                "indexing",
                "connecting",
                "generating",
                "quantifying",
                "calculating",
                "synthesizing",
                "inputting",
                "transmitting",
                "programming",
                "rebooting",
                "parsing",
                "shutting down",
                "injecting",
                "transcoding",
                "encoding",
                "attaching",
                "disconnecting",
                "networking",
                "spoofing",
                "cracking",
                "reverse engineering",
                "hijacking"
        };
        return this.method16131(var3, var4, var5, var6, var7, var8);
    }

    public String method16129() {
        String[] var3 = new String[]{"I don't hack it's {2} my {0} {0} {0} {1}", "I don't hack it's {2} my {0} {1} {3}"};
        String[] var4 = new String[]{
                "invalid supported rates 99",
                "fast termomixer",
                "ultradurable z345 turbo 12",
                "hardware accelarated EQ",
                "speedball AQ345 generator",
                "XCD k45 electric turbo",
                "RF hypersonic",
                "giant Q23",
                "giant racing Z9",
                "swift",
                "double turbocharged",
                "supersonic SL234",
                "turbospeed 930",
                "turbo highspeed GL4",
                "GL3 grfx turbo",
                "E24 focus sloter",
                "super overclocked",
                "overpowered",
                "983k",
                "99 full confort",
                "GTX 1080 adv",
                "full RAZOR",
                "hot DPI 2000",
                "90GB fusion",
                "feedback 3D",
                "MX freeze",
                "v1999 golden",
                "giant RATIO",
                "legendary",
                "awesome",
                "briliant",
                "advanced AI"
        };
        String[] var5 = new String[]{
                "gaming carpet",
                "studio",
                "windows 95 os",
                "HDMI cable",
                "potassium",
                "SSD",
                "PCI",
                "PCI express",
                "overclock",
                "super pc",
                "jitter clicker mouse",
                "mouse",
                "keyboard",
                "gaming chair",
                "screen",
                "display",
                "16.9 ratio display",
                "touchpad",
                "spacebar",
                "webcam",
                "desk",
                "headphones",
                "earbuds",
                "speakers",
                "power adapter",
                "processor",
                "graphics card",
                "DVD drive",
                "fans",
                "usb port",
                "thunderbold port",
                "virtual reality headset",
                "google glass",
                "backlight",
                "computer",
                "laptop",
                "sd card slot",
                "escape key",
                "function keys"
        };
        String[] var6 = new String[]{"maybe", "just", "for sure", "simply", "possibly", "without any doubts"};
        String[] var7 = new String[]{"pro", "replica", "i made", "i bought {4}", "i found {4}"};
        String[] var8 = new String[]{
                "on ebay", "on amazon", "on craiglist", "on the internet", "online", "on the TOR network", "in a garage", "on the deepweb", "near the grocery shop"
        };
        return this.method16131(var3, var4, var5, var6, var7, var8);
    }

    public String method16130() {
        String[] var3 = new String[]{
                "That {2} is just a poor man's {0} {2}. To really understand {4}, you need to {3} with only {1} {2}s to work with.",
                "You can get a way with {4} the {1} {2}, but then you run the risk of the {2} getting into your {0} {2}.",
                "See, the {2} is causing {1} {2} in the {0} {2}. That's why it's best to {3} using a {0} {2}.",
                "The problem is this {2} has its own {1} {0} {2}. If you had just gone with the {1} {2}, it would have been easier to {3}.",
                "This {2} has its own {1} {0} {2}, the {1} {2} sounds amazing.",
                "If you {3} the {0} {2}, it's easier to {3} the {0} {2}.",
                "Some people only hear the {1} {2}, but I'm picking up the {0} {1} {2} as well.",
                "They say {1} {0} is the next big thing, but I'm sticking with my {0} {1} {2}.",
                "Ever since {4} the {2} on my {2}, I can totally {3} more {1} {2}s in my {2}.",
                "You should try using the {1} {0} {2}, it will {3} your {1} {2} like you wouldn't believe.",
                "I like to {3} my {1} {1} {2} through my {0} {2}, it's easier to {3} that way.",
                "I've never liked their {1} {2}s, my {1} {0} {2} can {3} so much better.",
                "{4} your {1} {2} will really bring out the {1} {1} {2} when you {3} the {2}.",
                "If you want to {3}, try using the {0} {1} {2}, it's my little trick.",
                "{4} has never been the same since I lost my {1} {1} {2}, now I have to use my {2} for {4}."
        };
        String[] var4 = new String[]{
                "THX",
                "FLAC",
                "MP3",
                "AAC",
                "48K",
                "WAV",
                "DSP",
                "DAW",
                "AIFF",
                "CPS",
                "AGC",
                "VST",
                "SPDIF",
                "M4A",
                "AC97",
                "ASIO",
                "AV",
                "HDA",
                "DAI",
                "APAC",
                "THD",
                "VAIO",
                "WMA",
                "ACPA",
                "AWAC",
                "VST3",
                "CD-ROM",
                "CD-DA",
                "AC-3",
                "RMS",
                "CBR",
                "FOH"
        };
        String[] var5 = new String[]{
                "harmonic",
                "digital",
                "analog",
                "transient",
                "low-pass",
                "high-pass",
                "automated",
                "virtual",
                "stereo",
                "mono",
                "surround",
                "multi-track",
                "dynamic",
                "multi-band",
                "Baxandall",
                "resonant",
                "vintage",
                "peak",
                "aliased",
                "auxiliary",
                "balanced",
                "cardioid",
                "condenser",
                "graphic",
                "master",
                "unbalanced",
                "ambient",
                "phantom"
        };
        String[] var6 = new String[]{
                "gain",
                "threshold",
                "plugin",
                "waveform",
                "frequency",
                "amplifier",
                "filter",
                "soundboard",
                "mixer",
                "signal",
                "exciter",
                "distortion",
                "bitrate",
                "limiter",
                "driver",
                "channel",
                "ratio",
                "sidechain",
                "latency",
                "fader",
                "feedback",
                "delay",
                "converter",
                "processor",
                "ground loop",
                "impedance",
                "headroom",
                "preamp",
                "noise floor",
                "reverb",
                "sample",
                "tone",
                "transducer"
        };
        String[] var7 = new String[]{
                "boost",
                "dither",
                "clip",
                "mix",
                "adjust",
                "cut",
                "broadcast",
                "encode",
                "compress",
                "mix down",
                "mute",
                "amplify",
                "phase-shift",
                "autotune",
                "attenuate",
                "EQ",
                "level",
                "normalize",
                "quantize",
                "shelve",
                "sweep",
                "cross-fade",
                "dial in"
        };
        String[] var8 = new String[]{
                "boosting",
                "dithering",
                "clipping",
                "mixing",
                "broadcasting",
                "encoding",
                "compressing",
                "mixing down",
                "muting",
                "amplifying",
                "phase-shifting",
                "autotuning",
                "attenuating",
                "EQing",
                "leveling",
                "normalizing",
                "quantizing",
                "shelving",
                "sweeping",
                "cross-fading",
                "dialing in"
        };
        return this.method16131(var3, var4, var5, var6, var7, var8);
    }

    public String method16131(String[] var1, String[] var2, String[] var3, String[] var4, String[] var5, String[] var6) {
        String var9 = method16132(var1);

        while (var9.contains("{")) {
            var9 = StringUtils.replaceOnce(var9, "{0}", method16132(var2));
            var9 = StringUtils.replaceOnce(var9, "{1}", method16132(var3));
            var9 = StringUtils.replaceOnce(var9, "{2}", method16132(var4));
            var9 = StringUtils.replaceOnce(var9, "{3}", method16132(var5));
            var9 = StringUtils.replaceOnce(var9, "{4}", method16132(var6));
        }

        return var9.substring(0, 1).toUpperCase() + var9.substring(1);
    }
}
