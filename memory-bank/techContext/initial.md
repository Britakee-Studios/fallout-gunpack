# Technical Context - Technologies & Setup

## Technology Stack

### Core Technologies
- **Minecraft:** 1.21.1
- **Mod Loader:** NeoForge (latest for 1.21.1)
- **Build System:** Gradle
- **Dependency:** TaCZ (Timeless and Classics Zero) 1.1.6+

### Asset Formats
- **Models:** JSON (geo models), GLTF (animations)
- **Textures:** PNG
- **Sounds:** OGG Vorbis
- **Data:** JSON (all configuration, recipes, stats)
- **Scripts:** Lua (optional, used by DZJ08)

## Development Setup

### Build Commands

#### Building the Mod
**Working Command (PowerShell):**
```powershell
cd c:\Users\Chris\Documents\GitHub\fallout-gunpack; ./gradlew build
```

**Important Notes:**
- PowerShell does NOT support `&&` as a command separator
- Use semicolon `;` instead to chain commands
- The build output will be in `build/libs/`
- Output JAR format: `tacz_fallout-{version}.jar`

**Alternative (if in project directory already):**
```powershell
./gradlew build
```

**Build Output Location:**
```
build/libs/tacz_fallout-0.1.0.jar
```

#### Other Useful Gradle Commands
```powershell
./gradlew clean          # Clean build artifacts
./gradlew build --info   # Build with detailed output
./gradlew tasks          # List all available tasks
```

### Project Structure
```
fallout-gunpack/
├── build/                    # Gradle build output
├── gradle/                   # Gradle wrapper
├── src/main/
│   ├── java/                 # Java code (minimal for TaCZ addons)
│   │   └── me/xjqsh/Fallout.java
│   └── resources/            # All mod resources
│       ├── assets/           # Client resources
│       ├── data/             # Server/logic resources
│       ├── gunpack.meta.json
│       ├── logo.png
│       ├── pack.mcmeta
│       └── META-INF/
│           └── neoforge.mods.toml
├── build.gradle              # Build configuration
├── gradle.properties         # Gradle settings
├── settings.gradle           # Gradle project settings
├── LICENSE.md
└── README.md
```

### Build Configuration
- **Namespace:** `tacz_fallout`
- **Mod ID:** Defined in `neoforge.mods.toml`
- **Java Version:** As required by NeoForge for MC 1.21.1
- **Packaging:** Standard JAR output to `build/libs/`

## Technical Constraints

### TaCZ Integration Requirements
1. **Namespace Consistency:** All resources must use `tacz_fallout` namespace
2. **File Structure:** Must follow TaCZ's expected directory layout
3. **Index System:** All items must be registered via index files
4. **Display System:** Must provide display files with proper references
5. **Recipe Type:** Must use `tacz:gun_smith_table_crafting` for recipes

### Minecraft/NeoForge Constraints
- **Resource Pack Structure:** Must follow vanilla resource pack layout
- **Data Pack Structure:** Must follow vanilla data pack layout
- **Item Tags:** Uses common convention tags (c:) for cross-mod compatibility
- **Sound Events:** Registered through TaCZ's sound system

## Dependencies

### Required Runtime
- **Minecraft:** 1.21.1 (exact version)
- **NeoForge:** Latest stable for 1.21.1
- **TaCZ:** Version 1.1.6 or higher

### Development Dependencies
- **Gradle:** Included via wrapper
- **Java Development Kit:** Version matching NeoForge requirements

## File Conventions

### JSON Formatting
- **Indentation:** 2 spaces (consistent throughout project)
- **Comments:** Only in data files (not in index/display files per JSON spec)
- **Encoding:** UTF-8

### Naming Conventions
- **Files:** snake_case (e.g., `10mm_pistol.json`)
- **IDs:** namespace:path format (e.g., `tacz_fallout:10mm_pistol`)
- **Language Keys:** dotted notation (e.g., `fallout.gun.10mm_pistol.name`)

### Asset Naming
- **Textures:** Match model/item name (e.g., `10mm_pistol.png`)
- **Sounds:** Descriptive with action (e.g., `10mm_pistol_fire.ogg`)
- **Models:** Suffix with `_geo` for geometry (e.g., `10mm_pistol_geo.json`)
- **Animations:** Match weapon name (e.g., `10mm_pistol.gltf`)

## Common Tags Used
All recipes use NeoForge common convention tags for cross-mod compatibility:
- `c:ingots/iron` - Iron ingots
- `c:ingots/netherite` - Netherite ingots
- `c:nuggets/iron` - Iron nuggets
- `c:gems/diamond` - Diamonds
- `c:dusts/redstone` - Redstone dust
- `c:dusts/glowstone` - Glowstone dust
- `c:glass_blocks` - Glass blocks
- `c:slimeballs` - Slimeballs
- `c:leathers` - Leather items
- `c:gunpowder` - Gunpowder
- `minecraft:logs` - Any log type
