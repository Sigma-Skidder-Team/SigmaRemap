package com.mentalfrostbyte.jello.module.impl.misc;

import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.ModeSetting;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Jargon extends Module {
    public Jargon() {
        super(ModuleCategory.MISC, "Jargon", "Sends a randomly constructed message in chat");
        this.registerSetting(new ModeSetting("Jargon", "A test type button", 0, "Excuse", "Technical", "Audio"));
    }

    public static String getRandomElement(String[] array) {
        Random random = new Random();
        int index = random.nextInt(array.length);
        return array[index];
    }

    @Override
    public void onEnable() {
        String message = "Error";
        String jargonMode = this.getStringSettingValueByName("Jargon");

        switch (jargonMode) {
            case "Excuse":
                message = generateExcuse();
                break;
            case "Technical":
                message = generateTechnical();
                break;
            case "Audio":
                message = generateAudio();
                break;
        }

        mc.player.method5389(message);
        this.setState(false);
    }

    public String generateTechnical() {
        String[] templates = new String[]{
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

        String[] nouns = new String[]{
                "TCP", "HTTP", "SDD", "RAM", "GB", "CSS", "SSL", "AGP",
                "SQL", "FTP", "PCI", "AI", "ADP", "RSS", "XML", "EXE",
                "COM", "HDD", "THX", "SMTP", "SMS", "USB", "PNG", "PHP",
                "UDP", "TPS", "RX", "ASCII", "CD-ROM", "CGI", "CPU",
                "DDR", "DHCP", "BIOS", "IDE", "IP", "MAC", "MP3", "AAC",
                "PPPoE", "SSD", "SDRAM", "VGA", "XHTML", "Y2K", "GUI", "VPN"
        };

        String[] adjectives = new String[]{
                "auxiliary", "primary", "back-end", "digital", "open-source",
                "virtual", "cross-platform", "redundant", "online", "haptic",
                "multi-byte", "bluetooth", "wireless", "1080p", "neural",
                "optical", "solid state", "mobile", "unicode", "backup",
                "high speed", "56k", "analog", "fiber optic", "central",
                "visual", "ethernet"
        };

        String[] technicalTerms = new String[]{
                "driver", "protocol", "bandwidth", "panel", "microchip",
                "program", "port", "card", "array", "interface",
                "system", "sensor", "firewall", "hard drive", "pixel",
                "alarm", "feed", "monitor", "application", "transmitter",
                "bus", "circuit", "capacitor", "matrix", "address",
                "form factor", "array", "mainframe", "processor",
                "antenna", "transistor", "virus", "malware", "spyware",
                "network", "internet", "proxy", "buffer"
        };

        String[] actions = new String[]{
                "back up", "bypass", "hack", "override", "compress",
                "copy", "navigate", "index", "connect", "generate",
                "quantify", "calculate", "synthesize", "input",
                "transmit", "program", "reboot", "parse", "shut down",
                "inject", "transcode", "encode", "attach", "disconnect",
                "network", "hijack", "reverse engineer", "hash"
        };

        String[] gerunds = new String[]{
                "backing up", "bypassing", "hacking", "overriding",
                "compressing", "copying", "navigating", "indexing",
                "connecting", "generating", "quantifying", "calculating",
                "synthesizing", "inputting", "transmitting", "programming",
                "rebooting", "parsing", "shutting down", "injecting",
                "transcoding", "encoding", "attaching", "disconnecting",
                "networking", "spoofing", "cracking", "reverse engineering",
                "hijacking"
        };

        return generateMessage(templates, nouns, adjectives, technicalTerms, actions, gerunds);
    }

    public String generateExcuse() {
        String[] templates = new String[]{
                "I don't hack it's {2} my {0} {0} {0} {1}",
                "I don't hack it's {2} my {0} {1} {3}"
        };

        String[] errorMessages = new String[]{
                "invalid supported rates 99", "fast termomixer",
                "ultradurable z345 turbo 12", "hardware accelerated EQ",
                "speedball AQ345 generator", "XCD k45 electric turbo",
                "RF hypersonic", "giant Q23", "giant racing Z9", "swift",
                "double turbocharged", "supersonic SL234", "turbospeed 930",
                "turbo highspeed GL4", "GL3 grfx turbo", "E24 focus sloter",
                "super overclocked", "overpowered", "983k", "99 full comfort",
                "GTX 1080 adv", "full RAZOR", "hot DPI 2000", "90GB fusion",
                "feedback 3D", "MX freeze", "v1999 golden", "giant RATIO",
                "legendary", "awesome", "brilliant", "advanced AI"
        };

        String[] objects = new String[]{
                "gaming carpet", "studio", "windows 95 os", "HDMI cable",
                "potassium", "SSD", "PCI", "PCI express", "overclock",
                "super pc", "jitter clicker mouse", "mouse", "keyboard",
                "gaming chair", "screen", "display", "16.9 ratio display",
                "touchpad", "spacebar", "webcam", "desk", "headphones",
                "earbuds", "speakers", "power adapter", "processor",
                "graphics card", "DVD drive", "fans", "usb port",
                "thunderbolt port", "virtual reality headset", "google glass",
                "backlight", "computer", "laptop", "sd card slot",
                "escape key", "function keys"
        };

        String[] modifiers = new String[]{"maybe", "just", "for sure", "simply", "possibly", "without any doubts"};

        String[] possessions = new String[]{"pro", "replica", "I made", "I bought {4}", "I found {4}"};

        String[] locations = new String[]{
                "on ebay", "on amazon", "on craigslist", "on the internet",
                "online", "on the TOR network", "in a garage", "on the deep web",
                "near the grocery shop"
        };

        return generateMessage(templates, errorMessages, objects, modifiers, possessions, locations);
    }

    public String generateAudio() {
        String[] templates = new String[]{
                "That {2} is just a poor man's {0} {2}. To really understand {4}, you need to {3} with only {1} {2}s to work with.",
                "You can get a way with {4} the {1} {2}, but then you run the risk of the {2} getting into your {0} {2}.",
                "See, the {2} is actually {0} {2}. You won't {4} it at {1} {2}, it's not really a thing.",
                "You know how {4} the {1} {2} can be? Just because you can {3} it doesn't mean you should.",
                "You can {3} the {1} {2} without worrying about the {2}, but only if you {4}.",
                "If you {4} the {2}, it could help {3} the {1} {2} in ways you've never thought of.",
                "Trust me, this {0} {2} will totally {3} your {1} {2}, it worked for me.",
                "I would {3} the {1} {2} because it could lead to the {2} being compromised."
        };

        String[] nouns = new String[]{
                "tone", "rhythm", "spectrum", "waveform", "frequency", "reverb",
                "filter", "modulation", "equalization", "sample", "synth", "echo",
                "delay", "loop", "clip", "track", "output", "input"
        };

        String[] adjectives = new String[]{
                "stereo", "mono", "ambient", "dynamic", "high-fidelity", "raw",
                "compressed", "digital", "analog", "panning", "filtered", "resonant"
        };

        String[] objects = new String[]{
                "headphones", "speakers", "mixer", "interface", "program",
                "DAW", "plugin", "track", "sample", "recording"
        };

        String[] actions = new String[]{
                "compress", "normalize", "pan", "loop", "record", "play",
                "fade", "modulate", "filter", "equalize"
        };

        String[] gerunds = new String[]{
                "compressing", "normalizing", "panning", "looping", "recording",
                "playing", "fading", "modulating", "filtering", "equalizing"
        };

        return generateMessage(templates, nouns, adjectives, objects, actions, gerunds);
    }

    private String generateMessage(String[] templates, String[]... wordArrays) {
        String template = getRandomElement(templates);
        for (int i = 0; i < wordArrays.length; i++) {
            String randomWord = getRandomElement(wordArrays[i]);
            template = StringUtils.replace(template, "{" + i + "}", randomWord);
        }
        return template;
    }
}
