package mapped;

import com.google.common.base.Preconditions;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ViaVerList {
   private static final Int2ObjectMap<ViaVerList> versionMap = new Int2ObjectOpenHashMap();
   public static final List<ViaVerList> versionList = new ArrayList<ViaVerList>();
   public static final ViaVerList _1_8_x = register(47, "1.8.x");
   public static final ViaVerList _1_9 = register(107, "1.9");
   public static final ViaVerList _1_9_1 = register(108, "1.9.1");
   public static final ViaVerList _1_9_2 = register(109, "1.9.2");
   public static final ViaVerList _1_9_3_or_4 = register(110, "1.9.3/4", new VersionRange("1.9", 3, 4));
   public static final ViaVerList _1_10_X = register(210, "1.10.x");
   public static final ViaVerList _1_11 = register(315, "1.11");
   public static final ViaVerList _1_11_1_or_2 = register(316, "1.11.1/2", new VersionRange("1.11", 1, 2));
   public static final ViaVerList _1_12 = register(335, "1.12");
   public static final ViaVerList _1_12_1 = register(338, "1.12.1");
   public static final ViaVerList _1_12_2 = register(340, "1.12.2");
   public static final ViaVerList _1_13 = register(393, "1.13");
   public static final ViaVerList _1_13_1 = register(401, "1.13.1");
   public static final ViaVerList _1_13_2 = register(404, "1.13.2");
   public static final ViaVerList _1_14 = register(477, "1.14");
   public static final ViaVerList _1_14_1 = register(480, "1.14.1");
   public static final ViaVerList _1_14_2 = register(485, "1.14.2");
   public static final ViaVerList _1_14_3 = register(490, "1.14.3");
   public static final ViaVerList _1_14_4 = register(498, "1.14.4");
   public static final ViaVerList _1_15 = register(573, "1.15");
   public static final ViaVerList _1_15_1 = register(575, "1.15.1");
   public static final ViaVerList _1_15_2 = register(578, "1.15.2");
   public static final ViaVerList _1_16 = register(735, "1.16");
   public static final ViaVerList _1_16_1 = register(736, "1.16.1");
   public static final ViaVerList _1_16_2 = register(751, "1.16.2");
   public static final ViaVerList _1_16_3 = register(753, "1.16.3");
   public static final ViaVerList _1_16_4 = register(754, "1.16.4");
   private final int versionNumber;
   private final int alternateVersionNumber;
   private final String versionName;
   private final boolean isWildcard;
   private final Set<String> supportedVersions;

   public static ViaVerList register(int version, String name) {
      return register(version, -1, name);
   }

   public static ViaVerList register(int version, int alternateVersion, String name) {
      return populate(version, alternateVersion, name, null);
   }

   public static ViaVerList register(int version, String name, VersionRange range) {
      return populate(version, -1, name, range);
   }

   public static ViaVerList populate(int version, int alternateVersion, String name, VersionRange range) {
      ViaVerList versionEntry = new ViaVerList(version, alternateVersion, name, range);
      versionList.add(versionEntry);
      versionMap.put(versionEntry.getVersionNumber(), versionEntry);
      if (versionEntry.hasAlternateVersion()) {
         versionMap.put(versionEntry.getAlternateVersionNumber(), versionEntry);
      }

      return versionEntry;
   }

   public static boolean containsVersion(int version) {
      return versionMap.containsKey(version);
   }

   @NotNull
   public static ViaVerList getVersionByNumber(int version) {
      ViaVerList foundVersion = versionMap.get(version);
      return foundVersion == null ? new ViaVerList(version, "Unknown (" + version + ")") : foundVersion;
   }

   public static int getVersionIndex(ViaVerList version) {
      return versionList.indexOf(version);
   }

   public static List<ViaVerList> getUnmodifiableVersionList() {
      return Collections.unmodifiableList(new ArrayList<>(versionMap.values()));
   }

   @Nullable
   public static ViaVerList getVersionByName(String name) {
      for (ViaVerList versionEntry : versionMap.values()) {
         String versionName = versionEntry.getVersionName();
         if (versionName.equals(name)) {
            return versionEntry;
         }

         if (!versionEntry.isWildcardVersion()) {
            if (versionEntry.isVersionRange() && versionEntry.getSupportedVersions().contains(name)) {
               return versionEntry;
            }
         } else {
            String baseVersion = versionName.substring(0, versionName.length() - 2);
            if (baseVersion.equals(name) || name.startsWith(versionName.substring(0, versionName.length() - 1))) {
               return versionEntry;
            }
         }
      }
      return null;
   }

   public ViaVerList(int version, String name) {
      this(version, -1, name, null);
   }

   public ViaVerList(int version, int alternateVersion, String name, VersionRange range) {
      this.versionNumber = version;
      this.alternateVersionNumber = alternateVersion;
      this.versionName = name;
      this.isWildcard = name.endsWith(".x");

      Preconditions.checkArgument(!this.isWildcard || range == null, "A version cannot be a wildcard and a range at the same time!");

      if (range == null) {
         this.supportedVersions = Collections.singleton(name);
      } else {
         this.supportedVersions = new HashSet<>();
         for (int i = range.getMinVersion(); i <= range.getMaxVersion(); i++) {
            if (i == 0) {
               this.supportedVersions.add(range.getBaseVersion());
            }
            this.supportedVersions.add(range.getBaseVersion() + "." + i);
         }
      }
   }

   public int getAlternateVersionNumber() {
      return this.alternateVersionNumber != -1 ? 1073741824 | this.alternateVersionNumber : this.versionNumber;
   }

   public int getCombinedVersionNumber() {
      return this.alternateVersionNumber != -1 ? 1073741824 | this.alternateVersionNumber : this.versionNumber;
   }

   public boolean isVersionRange() {
      return this.supportedVersions.size() != 1;
   }

   public Set<String> getSupportedVersions() {
      return Collections.unmodifiableSet(this.supportedVersions);
   }

   public boolean isWildcardVersion() {
      return this.isWildcard;
   }

   public String getVersionName() {
      return this.versionName;
   }

   public boolean hasAlternateVersion() {
      return this.alternateVersionNumber != -1;
   }

   public int getVersionNumber() {
      return this.versionNumber;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null || getClass() != obj.getClass()) return false;
      ViaVerList that = (ViaVerList) obj;
      return versionNumber == that.versionNumber;
   }

   @Override
   public int hashCode() {
      return this.versionNumber;
   }

   @Override
   public String toString() {
      return String.format("%s(%d)", this.versionName, this.versionNumber);
   }
}
